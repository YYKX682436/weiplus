package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes5.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f174118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1 f174119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f174120f;

    public e1(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1 p1Var, java.lang.String str2) {
        this.f174118d = str;
        this.f174119e = p1Var;
        this.f174120f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            java.lang.String str = this.f174118d;
            switch (str.hashCode()) {
                case -1371794205:
                    if (str.equals("roamLiteStartRestore")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174119e.f174206d, "roamLiteStartRestore notify from pc");
                        long optLong = new org.json.JSONObject(this.f174120f).optLong("packageId", -1L);
                        if (!this.f174119e.Ui()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1.wi(this.f174119e, optLong, false);
                            return;
                        }
                        java.util.Map l17 = kz5.c1.l(new jz5.l("packageId", java.lang.Long.valueOf(optLong)));
                        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1 p1Var = this.f174119e;
                        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                        p1Var.aj(context, l17, mv.b0.f413013h);
                        return;
                    }
                    return;
                case -1337781043:
                    if (str.equals("roamLiteStartBackup")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174119e.f174206d, "roamLiteStartBackup notify from pc");
                        long optLong2 = new org.json.JSONObject(this.f174120f).optLong("packageId", -1L);
                        if (!this.f174119e.Ui()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1.wi(this.f174119e, optLong2, true);
                            return;
                        }
                        java.util.Map l18 = kz5.c1.l(new jz5.l("packageId", java.lang.Long.valueOf(optLong2)), new jz5.l("start", 1));
                        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1 p1Var2 = this.f174119e;
                        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                        p1Var2.aj(context2, l18, mv.b0.f413012g);
                        return;
                    }
                    return;
                case -1010292387:
                    if (str.equals("roamLiteNewPackage")) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(this.f174120f);
                        java.lang.String optString = jSONObject.optString("deviceId");
                        java.lang.String optString2 = jSONObject.optString("deviceName");
                        int optInt = jSONObject.optInt("deviceType", po1.g.f438842g.h());
                        java.lang.String optString3 = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "");
                        if (this.f174119e.Ui()) {
                            java.util.Map l19 = kz5.c1.l(new jz5.l("deviceName", optString2), new jz5.l("deviceType", java.lang.Integer.valueOf(optInt)), new jz5.l("deviceId", optString), new jz5.l(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, optString3));
                            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1 p1Var3 = this.f174119e;
                            android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                            p1Var3.aj(context3, l19, mv.b0.f413011f);
                            return;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.d1 d1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.d1(this.f174119e, optString3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                        if (!(optString.length() == 0)) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                            if (!(optString2.length() == 0)) {
                                po1.g a17 = po1.g.f438839d.a(optInt);
                                if (a17 == po1.g.f438844i) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f174119e.f174206d, "Unsupported deviceType=" + optInt);
                                    d1Var.mo152xb9724478();
                                    return;
                                }
                                android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12849xeea2846d.class);
                                intent.addFlags(268435456);
                                java.lang.String jSONObject2 = new org.json.JSONObject().put("deviceId", optString).put("deviceType", a17.h()).put("deviceNickname", optString2).put("deviceRemark", "").put("devicePath", "").put("deviceUUID", "").put("uriPath", "").toString();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                                intent.putExtra("deviceInfo", jSONObject2);
                                intent.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, optString3);
                                android.content.Context context4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                arrayList.add(intent);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(context4, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/RoamBackupFeatureService$handleStatusNotify$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                context4.startActivity((android.content.Intent) arrayList.get(0));
                                yj0.a.f(context4, "com/tencent/mm/plugin/backup/roambackup/RoamBackupFeatureService$handleStatusNotify$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                return;
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f174119e.f174206d, "Fail to get device info from args=" + this.f174120f);
                        d1Var.mo152xb9724478();
                        return;
                    }
                    return;
                case 641948856:
                    if (str.equals("PCNetworkResult") && this.f174119e.Ui()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174119e.f174206d, "receive PCNetworkResult: " + this.f174120f);
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject(this.f174120f);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1 p1Var4 = this.f174119e;
                        java.lang.String optString4 = jSONObject3.optString("wifiName");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString4, "optString(...)");
                        p1Var4.f174211i = optString4;
                        return;
                    }
                    return;
                case 1274520009:
                    if (str.equals("autoBindResult") && this.f174119e.Ui()) {
                        org.json.JSONObject jSONObject4 = new org.json.JSONObject(this.f174120f);
                        jz5.l lVar = (jz5.l) this.f174119e.f174207e.remove(jSONObject4.optString("bindId", ""));
                        if (lVar != null) {
                            nf.e.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.z0(lVar, jSONObject4));
                            return;
                        }
                        return;
                    }
                    return;
                case 2029468804:
                    if (str.equals("roamLiteStopAllBackupRestore")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174119e.f174206d, "roamLiteStopAllBackupRestore notify from pc");
                        if (this.f174119e.Ui()) {
                            ((ku5.t0) ku5.t0.f394148d).B(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.b1.f174108d);
                            return;
                        }
                        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12849xeea2846d.f174229s;
                        java.lang.ref.WeakReference weakReference2 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12849xeea2846d.f174229s;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12849xeea2846d activityC12849xeea2846d = weakReference2 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12849xeea2846d) weakReference2.get() : null;
                        if (activityC12849xeea2846d != null) {
                            activityC12849xeea2846d.finish();
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        int b17 = qo1.j1.f447056a.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.c1(arrayList2));
                        java.util.Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            ((qo1.f0) it.next()).mo160578x360802();
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174119e.f174206d, "[handleStatusNotify] enterRunningCount=" + b17);
                        if (b17 == 0) {
                            java.lang.ref.WeakReference weakReference3 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12851x5f788c81.f174245o;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12851x5f788c81 activityC12851x5f788c81 = weakReference3 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12851x5f788c81) weakReference3.get() : null;
                            if (activityC12851x5f788c81 != null) {
                                activityC12851x5f788c81.finish();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f174119e.f174206d, e17, "Fail to parse JsonObj from args=" + this.f174120f + '.', new java.lang.Object[0]);
        }
    }
}
