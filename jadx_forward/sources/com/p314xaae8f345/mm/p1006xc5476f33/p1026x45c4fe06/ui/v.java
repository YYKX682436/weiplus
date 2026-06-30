package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes9.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f171794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 f171795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.uf7 f171796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 f171797g;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 activityC12636x4eed9257, java.util.List list, com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 c11162xe78737a3, r45.uf7 uf7Var) {
        this.f171797g = activityC12636x4eed9257;
        this.f171794d = list;
        this.f171795e = c11162xe78737a3;
        this.f171796f = uf7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String[] strArr;
        java.lang.String[] strArr2;
        java.lang.String[] strArr3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.Z;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 activityC12636x4eed9257 = this.f171797g;
        activityC12636x4eed9257.getClass();
        java.util.List list = this.f171794d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthorizeUI", "updatePreferencesInternal, authItems size = %d", java.lang.Integer.valueOf(list.size()));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 c11162xe78737a3 = this.f171795e;
        if (c11162xe78737a3 != null && c11162xe78737a3.f153367d) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(activityC12636x4eed9257);
            c21560x1fce98fb.f279318v = false;
            c21560x1fce98fb.C("preference_key_subscribe_msg");
            c21560x1fce98fb.L(activityC12636x4eed9257.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a57));
            c21560x1fce98fb.H(c11162xe78737a3.f153368e ? "" : activityC12636x4eed9257.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a58));
            linkedHashMap.put(c21560x1fce98fb.f279313q, c21560x1fce98fb);
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.vb vbVar = (r45.vb) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthorizeUI", "updatePreferencesInternal, find scope:%s, state:%d", vbVar.f469591d, java.lang.Integer.valueOf(vbVar.f469593f));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vbVar.f469591d) && vbVar.f469591d.equalsIgnoreCase("scope.userLocationBackground")) {
                activityC12636x4eed9257.f170847t = vbVar;
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vbVar.f469591d) && vbVar.f469591d.equalsIgnoreCase("scope.userLocation")) {
                activityC12636x4eed9257.f170846s = vbVar;
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb2 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(activityC12636x4eed9257);
                activityC12636x4eed9257.f170842o = c21560x1fce98fb2;
                c21560x1fce98fb2.f279318v = false;
                c21560x1fce98fb2.C(vbVar.f469591d);
                activityC12636x4eed9257.f170842o.H(vbVar.f469595h);
                activityC12636x4eed9257.f170842o.L(vbVar.f469592e);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb3 = activityC12636x4eed9257.f170842o;
                linkedHashMap.put(c21560x1fce98fb3.f279313q, c21560x1fce98fb3);
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vbVar.f469591d) && vbVar.f469591d.equalsIgnoreCase("scope.userFuzzyLocation")) {
                activityC12636x4eed9257.f170848u = vbVar;
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb4 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(activityC12636x4eed9257);
                activityC12636x4eed9257.f170843p = c21560x1fce98fb4;
                c21560x1fce98fb4.f279318v = false;
                c21560x1fce98fb4.C(vbVar.f469591d);
                activityC12636x4eed9257.f170843p.H(vbVar.f469595h);
                activityC12636x4eed9257.f170843p.L(vbVar.f469592e);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb5 = activityC12636x4eed9257.f170843p;
                linkedHashMap.put(c21560x1fce98fb5.f279313q, c21560x1fce98fb5);
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vbVar.f469591d) && vbVar.f469591d.equalsIgnoreCase("scope.bluetoothBackground")) {
                activityC12636x4eed9257.I = vbVar;
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vbVar.f469591d) && vbVar.f469591d.equalsIgnoreCase("scope.bluetooth")) {
                activityC12636x4eed9257.H = vbVar;
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb6 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(activityC12636x4eed9257);
                activityC12636x4eed9257.G = c21560x1fce98fb6;
                c21560x1fce98fb6.f279318v = false;
                c21560x1fce98fb6.C(vbVar.f469591d);
                activityC12636x4eed9257.G.H(vbVar.f469595h);
                activityC12636x4eed9257.G.L(vbVar.f469592e);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb7 = activityC12636x4eed9257.G;
                linkedHashMap.put(c21560x1fce98fb7.f279313q, c21560x1fce98fb7);
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vbVar.f469591d) && vbVar.f469591d.equalsIgnoreCase("scope.userInfo")) {
                if (activityC12636x4eed9257.f170844q == null) {
                    activityC12636x4eed9257.f170844q = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54(activityC12636x4eed9257);
                }
                if (vbVar.f469594g == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthorizeUI", "scope userinfo's UserAvatarInfo is null, can not be add into Preference");
                } else {
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = activityC12636x4eed9257.f170844q;
                    c21549x15041e54.f279318v = false;
                    activityC12636x4eed9257.r7(c21549x15041e54, vbVar);
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e542 = activityC12636x4eed9257.f170844q;
                    linkedHashMap.put(c21549x15041e542.f279313q, c21549x15041e542);
                }
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vbVar.f469591d) && vbVar.f469591d.equalsIgnoreCase("scope.userProfileChange")) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e543 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54(activityC12636x4eed9257);
                activityC12636x4eed9257.f170845r = c21549x15041e543;
                if (vbVar.f469594g == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthorizeUI", "scope userinfo's UserAvatarInfo is null, can not be add into Preference");
                } else {
                    c21549x15041e543.f279318v = false;
                    activityC12636x4eed9257.s7(c21549x15041e543, vbVar);
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e544 = activityC12636x4eed9257.f170845r;
                    linkedHashMap.put(c21549x15041e544.f279313q, c21549x15041e544);
                }
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vbVar.f469591d) && vbVar.f469591d.equalsIgnoreCase("scope.devicePanel")) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21570x31028a50 c21570x31028a50 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21570x31028a50(activityC12636x4eed9257);
                c21570x31028a50.f279318v = false;
                c21570x31028a50.C(vbVar.f469591d);
                c21570x31028a50.L(vbVar.f469592e);
                c21570x31028a50.H(vbVar.f469595h);
                c21570x31028a50.M = vbVar.f469593f == 1 ? activityC12636x4eed9257.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571591jq) : activityC12636x4eed9257.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571585jk);
                linkedHashMap.put(c21570x31028a50.f279313q, c21570x31028a50);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vbVar.f469591d) || !vbVar.f469591d.equalsIgnoreCase("scope.EmployeeRelation")) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe(activityC12636x4eed9257);
                c21541x1c1b08fe.f279318v = false;
                c21541x1c1b08fe.C(vbVar.f469591d);
                c21541x1c1b08fe.L(vbVar.f469592e);
                c21541x1c1b08fe.H(vbVar.f469595h);
                c21541x1c1b08fe.L = vbVar.f469593f == 1;
                linkedHashMap.put(c21541x1c1b08fe.f279313q, c21541x1c1b08fe);
            } else {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb8 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(activityC12636x4eed9257);
                c21560x1fce98fb8.f279318v = false;
                c21560x1fce98fb8.C("preference_key_employee_relation_info");
                c21560x1fce98fb8.L(vbVar.f469592e);
                c21560x1fce98fb8.H(vbVar.f469597m);
                linkedHashMap.put(c21560x1fce98fb8.f279313q, c21560x1fce98fb8);
            }
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb9 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(activityC12636x4eed9257);
        c21560x1fce98fb9.f279318v = false;
        c21560x1fce98fb9.C("preference_key_voip_device_list");
        c21560x1fce98fb9.L(activityC12636x4eed9257.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a5k));
        linkedHashMap.put(c21560x1fce98fb9.f279313q, c21560x1fce98fb9);
        if (activityC12636x4eed9257.n7()) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe(activityC12636x4eed9257);
            c21541x1c1b08fe2.f279318v = false;
            c21541x1c1b08fe2.C("preference_key_notify_msg");
            c21541x1c1b08fe2.L = activityC12636x4eed9257.T;
            c21541x1c1b08fe2.L(activityC12636x4eed9257.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572185a35));
            linkedHashMap.put(c21541x1c1b08fe2.f279313q, c21541x1c1b08fe2);
        }
        if (ck1.n0.f123887a.e(this.f171796f)) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb10 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(activityC12636x4eed9257);
            c21560x1fce98fb10.f279318v = false;
            c21560x1fce98fb10.C("preference_key_user_info");
            c21560x1fce98fb10.L(activityC12636x4eed9257.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a09));
            linkedHashMap.put(c21560x1fce98fb10.f279313q, c21560x1fce98fb10);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb11 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(activityC12636x4eed9257);
        c21560x1fce98fb11.f279318v = false;
        c21560x1fce98fb11.C("preference_key_privacy_use_record");
        c21560x1fce98fb11.L(activityC12636x4eed9257.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4_));
        linkedHashMap.put(c21560x1fce98fb11.f279313q, c21560x1fce98fb11);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.Iterator it6 = linkedHashMap.values().iterator();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb12 = null;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb13 = null;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb14 = null;
        while (true) {
            boolean hasNext = it6.hasNext();
            strArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.f170832p0;
            strArr2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.Z;
            if (!hasNext) {
                break;
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb15 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) it6.next();
            if (java.util.Arrays.asList(strArr).contains(c21560x1fce98fb15.f279313q)) {
                hashMap2.put(c21560x1fce98fb15.f279313q, c21560x1fce98fb15);
            } else if (java.util.Arrays.asList(strArr2).contains(c21560x1fce98fb15.f279313q)) {
                hashMap.put(c21560x1fce98fb15.f279313q, c21560x1fce98fb15);
            } else if ("scope.devicePanel".equals(c21560x1fce98fb15.f279313q)) {
                c21560x1fce98fb12 = c21560x1fce98fb15;
            } else if ("preference_key_user_info".equals(c21560x1fce98fb15.f279313q)) {
                c21560x1fce98fb13 = c21560x1fce98fb15;
            } else if ("preference_key_privacy_use_record".equals(c21560x1fce98fb15.f279313q)) {
                c21560x1fce98fb14 = c21560x1fce98fb15;
            } else {
                linkedHashMap2.put(c21560x1fce98fb15.f279313q, c21560x1fce98fb15);
            }
        }
        for (int i17 = 0; i17 < 7; i17++) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb16 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) hashMap.get(strArr2[i17]);
            if (c21560x1fce98fb16 != null) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC12636x4eed9257.f170841n).d(c21560x1fce98fb16, -1);
            }
        }
        java.util.Iterator it7 = linkedHashMap2.values().iterator();
        while (it7.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC12636x4eed9257.f170841n).d((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) it7.next(), -1);
        }
        if (hashMap2.size() > 0) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC12636x4eed9257.f170841n).d(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21567x4b9b05ea(activityC12636x4eed9257.mo55332x76847179(), null), -1);
        }
        for (int i18 = 0; i18 < 2; i18++) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb17 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) hashMap2.get(strArr[i18]);
            if (c21560x1fce98fb17 != null) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC12636x4eed9257.f170841n).d(c21560x1fce98fb17, -1);
            }
        }
        if (c21560x1fce98fb12 != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC12636x4eed9257.f170841n).d(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21567x4b9b05ea(activityC12636x4eed9257.mo55332x76847179(), null), -1);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC12636x4eed9257.f170841n).d(c21560x1fce98fb12, -1);
        }
        if (c21560x1fce98fb13 != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC12636x4eed9257.f170841n).d(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21567x4b9b05ea(activityC12636x4eed9257.mo55332x76847179(), null), -1);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC12636x4eed9257.f170841n).d(c21560x1fce98fb13, -1);
        }
        if (c21560x1fce98fb14 != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC12636x4eed9257.f170841n).d(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21567x4b9b05ea(activityC12636x4eed9257.mo55332x76847179(), null), -1);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC12636x4eed9257.f170841n).d(c21560x1fce98fb14, -1);
        }
        activityC12636x4eed9257.q7();
        activityC12636x4eed9257.o7();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb18 = activityC12636x4eed9257.f170843p;
        if (c21560x1fce98fb18 != null) {
            if (activityC12636x4eed9257.f170848u.f469593f != 1) {
                c21560x1fce98fb18.G(com.p314xaae8f345.mm.R.C30867xcad56011.f571595ju);
            } else {
                c21560x1fce98fb18.G(com.p314xaae8f345.mm.R.C30867xcad56011.f571594jt);
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC12636x4eed9257.f170841n).notifyDataSetChanged();
        if (activityC12636x4eed9257.W.isEmpty() && activityC12636x4eed9257.X.isEmpty()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC12636x4eed9257.f170841n).m("preference_key_voip_device_list", true);
        }
    }
}
