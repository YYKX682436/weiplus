package hr3;

/* loaded from: classes11.dex */
public class sg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 f365516e;

    public sg(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9, java.lang.String str) {
        this.f365516e = activityC16871x34c232c9;
        this.f365515d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        final com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activity = this.f365516e;
        gr3.k.f356422a.c("view_clk", activity.f235356p, Bi.n(activity.f235359q, true), "RelationAddRequestSend");
        android.app.ProgressDialog progressDialog = activity.f235355o;
        if (progressDialog != null && progressDialog.isShowing()) {
            yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean[] zArr = activity.B1;
        boolean z17 = zArr[0];
        java.lang.String str = this.f365515d;
        fo3.s sVar = fo3.s.INSTANCE;
        if (z17) {
            zArr[0] = false;
        } else {
            sVar.qb("ce_ver_usr", "<VerifyUsr>", str);
            sVar.H2("ce_ver_usr", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
            sVar.Qa("ce_ver_usr");
        }
        sVar.c2(str, 3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "mCommitBtn onClick() called needVerify:%s userName:%s", java.lang.Boolean.valueOf(activity.f235364v), activity.f235359q);
        if (((j93.n) activity.m80391xac8f1cfd(j93.n.class)).R6()) {
            ((j93.n) activity.m80391xac8f1cfd(j93.n.class)).T6();
        }
        if (activity.f235364v) {
            ((hr3.gg) activity.m80391xac8f1cfd(hr3.gg.class)).O6(activity.c7(), new yz5.a() { // from class: hr3.hg$$b
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.O1;
                    final com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.this;
                    ((hr3.pf) activityC16871x34c232c9.m80391xac8f1cfd(hr3.pf.class)).Q6(new yz5.l() { // from class: hr3.hg$$c
                        @Override // yz5.l
                        /* renamed from: invoke */
                        public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                            java.lang.String str2;
                            java.lang.String str3;
                            java.lang.String str4;
                            r45.dz3 dz3Var = (r45.dz3) obj;
                            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.O1;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c92 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.this;
                            activityC16871x34c232c92.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "invoke() commitVerify called with: imgInfoList = [" + dz3Var + "]");
                            java.util.LinkedList linkedList = new java.util.LinkedList();
                            linkedList.add(activityC16871x34c232c92.f235359q);
                            java.util.LinkedList linkedList2 = new java.util.LinkedList();
                            linkedList2.add(java.lang.Integer.valueOf(activityC16871x34c232c92.f235363u));
                            java.lang.String d76 = activityC16871x34c232c92.d7();
                            java.util.HashMap hashMap = new java.util.HashMap();
                            int O6 = ((bs3.m) pf5.z.f435481a.a(activityC16871x34c232c92).a(bs3.m.class)).O6();
                            activityC16871x34c232c92.E1 = O6;
                            hashMap.put(activityC16871x34c232c92.f235359q, java.lang.Integer.valueOf(O6));
                            str2 = "";
                            if (activityC16871x34c232c92.G) {
                                l41.f0 f0Var = new l41.f0(activityC16871x34c232c92.f235359q, d76, activityC16871x34c232c92.getIntent().getStringExtra("AntispamTicket"), O6);
                                activityC16871x34c232c92.f235371y1 = activityC16871x34c232c92.getIntent().getLongExtra("k_add_friend_verify_record_client_msg_id", 0L);
                                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(activityC16871x34c232c92.f235359q, true);
                                if (n17 == null || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(activityC16871x34c232c92.f235359q)) {
                                    str3 = "";
                                    str4 = str3;
                                } else {
                                    java.lang.String str5 = n17.J1;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    str4 = n17.Q0();
                                    if (str4 == null) {
                                        str4 = "";
                                    }
                                    java.lang.String G0 = n17.G0();
                                    str3 = G0 != null ? G0 : "";
                                    str2 = str5;
                                }
                                f0Var.H(activityC16871x34c232c92.f235371y1, str2, str4, str3);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "SayHiWithSnsPermissionUI sendOpenIMVerifyRequest clientMsgId=%d openImCustomInfo=%s openImAppId=%s descWordingId=%s", java.lang.Long.valueOf(activityC16871x34c232c92.f235371y1), str2, str4, str3);
                                c01.d9.e().g(f0Var);
                                activityC16871x34c232c92.f235355o = db5.e1.Q(activityC16871x34c232c92.mo55332x76847179(), activityC16871x34c232c92.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16871x34c232c92.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iin), true, true, new hr3.yg(activityC16871x34c232c92, f0Var));
                                return null;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "addTextOptionMenu:send addcontact.");
                            java.lang.String stringExtra = activityC16871x34c232c92.getIntent().getStringExtra("source_from_user_name");
                            java.lang.String stringExtra2 = activityC16871x34c232c92.getIntent().getStringExtra("source_from_nick_name");
                            r35.a aVar = new r35.a(activityC16871x34c232c92, null);
                            aVar.H = activityC16871x34c232c92.H ? "" : d76;
                            aVar.f450552t = stringExtra;
                            aVar.f450553u = stringExtra2;
                            aVar.I = hashMap;
                            java.util.List b76 = activityC16871x34c232c92.b7(activityC16871x34c232c92.L);
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(b76)) {
                                ((java.util.LinkedList) aVar.f450538J).add(b76);
                            }
                            aVar.f450551s = activityC16871x34c232c92.f235356p;
                            aVar.M = java.lang.System.currentTimeMillis();
                            aVar.f450540e = new hr3.dh(activityC16871x34c232c92, d76, stringExtra, stringExtra2, hashMap, linkedList2, dz3Var, linkedList);
                            aVar.f450555w = false;
                            aVar.E = dz3Var;
                            aVar.G = new hr3.eh(activityC16871x34c232c92);
                            gm0.j1.i();
                            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(activityC16871x34c232c92.f235359q, true);
                            boolean r27 = n18.r2();
                            activityC16871x34c232c92.f235368x1 = r27;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "isContactBeforeSendVerify:%s", java.lang.Boolean.valueOf(r27));
                            aVar.k(activityC16871x34c232c92, n18, activityC16871x34c232c92.f235359q, linkedList2);
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518212e, vg3.b.f518178e, vg3.c.f518187f, 0, new java.util.ArrayList(java.util.Collections.singletonList(activityC16871x34c232c92.f235359q))));
                            activityC16871x34c232c92.Z6();
                            activityC16871x34c232c92.f235355o = db5.e1.Q(activityC16871x34c232c92.mo55332x76847179(), activityC16871x34c232c92.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16871x34c232c92.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iin), true, true, new hr3.ig(activityC16871x34c232c92, aVar));
                            return null;
                        }
                    });
                    return null;
                }
            });
        } else if (activity.f235366x) {
            final java.lang.String stringExtra = activity.getIntent().getStringExtra("Verify_ticket");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            final int O6 = ((bs3.m) pf5.z.f435481a.a(activity).a(bs3.m.class)).O6();
            activity.E1 = O6;
            if (activity.G) {
                l41.h0 h0Var = new l41.h0(activity.f235359q, stringExtra, O6);
                c01.d9.e().g(h0Var);
                activity.f235355o = db5.e1.Q(activity.mo55332x76847179(), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572493bd4), true, true, new hr3.tg(this, h0Var));
            } else {
                ((hr3.gg) activity.m80391xac8f1cfd(hr3.gg.class)).O6(activity.c7(), new yz5.a() { // from class: hr3.sg$$a
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        java.lang.String str2 = stringExtra;
                        int i17 = O6;
                        hr3.sg sgVar = hr3.sg.this;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activity2 = sgVar.f365516e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3 m3Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3(3, activity2.f235359q, str2, activity2.f235363u, activity2.f235356p, i17, activity2.L, ((hr3.ld) pf5.z.f435481a.a(activity2).a(hr3.ld.class)).R6());
                        c01.d9.e().g(m3Var);
                        activity2.f235355o = db5.e1.Q(activity2.mo55332x76847179(), activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572493bd4), true, true, new hr3.ug(sgVar, m3Var));
                        return null;
                    }
                });
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518213f, vg3.b.f518178e, vg3.c.f518186e, 0, new java.util.ArrayList(java.util.Collections.singletonList(activity.f235359q))));
        }
        long longExtra = activity.getIntent().getLongExtra("key_msg_id", 0L);
        if (jh3.n.f(longExtra)) {
            jh3.n.i(longExtra, 4);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
