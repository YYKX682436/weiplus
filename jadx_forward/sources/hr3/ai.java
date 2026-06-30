package hr3;

/* loaded from: classes11.dex */
public class ai implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a f364940e;

    public ai(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a, java.lang.String str) {
        this.f364940e = activityC16872x6384268a;
        this.f364939d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        final com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a = this.f364940e;
        gr3.k.f356422a.c("view_clk", activityC16872x6384268a.f235392u, Bi.n(activityC16872x6384268a.f235393v, true), "RelationAddRequestSend");
        android.app.ProgressDialog progressDialog = activityC16872x6384268a.f235391t;
        if (progressDialog != null && progressDialog.isShowing()) {
            yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean[] zArr = activityC16872x6384268a.G1;
        int i17 = 0;
        boolean z17 = zArr[0];
        java.lang.String str = this.f364939d;
        fo3.s sVar = fo3.s.INSTANCE;
        if (z17) {
            zArr[0] = false;
        } else {
            sVar.qb("ce_ver_usr", "<VerifyUsr>", str);
            sVar.H2("ce_ver_usr", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
            sVar.Qa("ce_ver_usr");
        }
        if (!activityC16872x6384268a.g7() && !activityC16872x6384268a.f7() && activityC16872x6384268a.G) {
            android.widget.TextView textView = (android.widget.TextView) activityC16872x6384268a.findViewById(com.p314xaae8f345.mm.R.id.nxx);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hmw);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) activityC16872x6384268a.findViewById(com.p314xaae8f345.mm.R.id.nxw);
            int color = activityC16872x6384268a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5);
            int color2 = activityC16872x6384268a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(viewGroup, "translationX", 0.0f, -20.0f, 0.0f, 20.0f, 0.0f);
            ofFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            if (activityC16872x6384268a.K1 == 0) {
                android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(color), java.lang.Integer.valueOf(color2));
                ofObject.addUpdateListener(new hr3.rh(activityC16872x6384268a, textView));
                ofObject.addListener(new hr3.sh(activityC16872x6384268a, null));
                animatorSet.play(ofObject).with(ofFloat);
            } else {
                textView.setTextColor(color2);
                animatorSet.play(ofFloat);
            }
            animatorSet.setDuration(300);
            animatorSet.start();
            com.p314xaae8f345.mm.ui.jk.a();
            activityC16872x6384268a.K1++;
            yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        sVar.c2(str, 3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "mCommitBtn onClick() called needVerify:%s userName:%s", java.lang.Boolean.valueOf(activityC16872x6384268a.A), activityC16872x6384268a.f235393v);
        if (((j93.n) activityC16872x6384268a.m80391xac8f1cfd(j93.n.class)).R6()) {
            ((j93.n) activityC16872x6384268a.m80391xac8f1cfd(j93.n.class)).T6();
        }
        if (activityC16872x6384268a.A) {
            ((hr3.gg) activityC16872x6384268a.m80391xac8f1cfd(hr3.gg.class)).O6(activityC16872x6384268a.a7(), new yz5.a() { // from class: hr3.hh$$b
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.R1;
                    final com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a2 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.this;
                    ((hr3.pf) activityC16872x6384268a2.m80391xac8f1cfd(hr3.pf.class)).Q6(new yz5.l() { // from class: hr3.hh$$c
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // yz5.l
                        /* renamed from: invoke */
                        public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                            int i19;
                            java.lang.String str2;
                            java.lang.String str3;
                            java.lang.String str4;
                            r45.dz3 dz3Var = (r45.dz3) obj;
                            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.R1;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a3 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.this;
                            activityC16872x6384268a3.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "invoke() commitVerify called with: imgInfoList = [" + dz3Var + "]");
                            java.util.LinkedList linkedList = new java.util.LinkedList();
                            linkedList.add(activityC16872x6384268a3.f235393v);
                            java.util.LinkedList linkedList2 = new java.util.LinkedList();
                            linkedList2.add(java.lang.Integer.valueOf(activityC16872x6384268a3.f235401z));
                            java.lang.String b76 = activityC16872x6384268a3.b7();
                            java.util.HashMap hashMap = new java.util.HashMap();
                            if (activityC16872x6384268a3.g7()) {
                                i19 = 0;
                            } else {
                                boolean z18 = activityC16872x6384268a3.f235384o.f292896x;
                                i19 = z18;
                                if (activityC16872x6384268a3.f235385p.f292896x) {
                                    i19 = (z18 ? 1 : 0) | 2;
                                }
                            }
                            int i28 = i19;
                            if (activityC16872x6384268a3.g7()) {
                                i28 = (i19 == true ? 1 : 0) | 8;
                            }
                            activityC16872x6384268a3.J1 = i28;
                            hashMap.put(activityC16872x6384268a3.f235393v, java.lang.Integer.valueOf(i28));
                            str2 = "";
                            if (activityC16872x6384268a3.K) {
                                l41.f0 f0Var = new l41.f0(activityC16872x6384268a3.f235393v, b76, activityC16872x6384268a3.getIntent().getStringExtra("AntispamTicket"), i28);
                                long longExtra = activityC16872x6384268a3.getIntent().getLongExtra("k_add_friend_verify_record_client_msg_id", 0L);
                                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(activityC16872x6384268a3.f235393v, true);
                                if (n17 == null || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(activityC16872x6384268a3.f235393v)) {
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
                                f0Var.H(longExtra, str2, str4, str3);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "SayHiWithSnsPermissionUI3 sendOpenIMVerifyRequest clientMsgId=%d openImCustomInfo=%s openImAppId=%s descWordingId=%s", java.lang.Long.valueOf(longExtra), str2, str4, str3);
                                c01.d9.e().g(f0Var);
                                activityC16872x6384268a3.f235391t = db5.e1.Q(activityC16872x6384268a3.mo55332x76847179(), activityC16872x6384268a3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16872x6384268a3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iin), true, true, new hr3.fi(activityC16872x6384268a3, f0Var));
                                return null;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "addTextOptionMenu:send addcontact.");
                            java.lang.String stringExtra = activityC16872x6384268a3.getIntent().getStringExtra("source_from_user_name");
                            java.lang.String stringExtra2 = activityC16872x6384268a3.getIntent().getStringExtra("source_from_nick_name");
                            r35.a aVar = new r35.a(activityC16872x6384268a3, null);
                            aVar.H = activityC16872x6384268a3.V ? "" : b76;
                            aVar.f450552t = stringExtra;
                            aVar.f450553u = stringExtra2;
                            aVar.I = hashMap;
                            aVar.f450551s = activityC16872x6384268a3.f235392u;
                            aVar.M = java.lang.System.currentTimeMillis();
                            aVar.f450540e = new hr3.ki(activityC16872x6384268a3, b76, stringExtra, stringExtra2, hashMap, linkedList2, dz3Var, linkedList);
                            aVar.f450555w = false;
                            aVar.E = dz3Var;
                            aVar.G = new hr3.ih(activityC16872x6384268a3);
                            gm0.j1.i();
                            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(activityC16872x6384268a3.f235393v, true);
                            boolean r27 = n18.r2();
                            activityC16872x6384268a3.D1 = r27;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "isContactBeforeSendVerify:%s", java.lang.Boolean.valueOf(r27));
                            aVar.k(activityC16872x6384268a3, n18, activityC16872x6384268a3.f235393v, linkedList2);
                            activityC16872x6384268a3.Y6();
                            activityC16872x6384268a3.f235391t = db5.e1.Q(activityC16872x6384268a3.mo55332x76847179(), activityC16872x6384268a3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16872x6384268a3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iin), true, true, new hr3.jh(activityC16872x6384268a3, aVar));
                            return null;
                        }
                    });
                    return null;
                }
            });
        } else if (activityC16872x6384268a.C) {
            final java.lang.String stringExtra = activityC16872x6384268a.getIntent().getStringExtra("Verify_ticket");
            if (!activityC16872x6384268a.g7()) {
                boolean z18 = activityC16872x6384268a.f235384o.f292896x;
                i17 = z18;
                if (activityC16872x6384268a.f235385p.f292896x) {
                    i17 = (z18 ? 1 : 0) | 2;
                }
            }
            final int i18 = i17;
            if (activityC16872x6384268a.g7()) {
                i18 = (i17 == true ? 1 : 0) | 8;
            }
            activityC16872x6384268a.J1 = i18;
            if (activityC16872x6384268a.K) {
                l41.h0 h0Var = new l41.h0(activityC16872x6384268a.f235393v, stringExtra, i18);
                c01.d9.e().g(h0Var);
                activityC16872x6384268a.f235391t = db5.e1.Q(activityC16872x6384268a.mo55332x76847179(), activityC16872x6384268a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16872x6384268a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572493bd4), true, true, new hr3.bi(this, h0Var));
            } else {
                ((hr3.gg) activityC16872x6384268a.m80391xac8f1cfd(hr3.gg.class)).O6(activityC16872x6384268a.a7(), new yz5.a() { // from class: hr3.ai$$a
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        java.lang.String str2 = stringExtra;
                        int i19 = i18;
                        hr3.ai aiVar = hr3.ai.this;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activity = aiVar.f364940e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3 m3Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3(3, activity.f235393v, str2, activity.f235401z, activity.f235392u, i19, activity.N, ((hr3.ld) pf5.z.f435481a.a(activity).a(hr3.ld.class)).R6());
                        c01.d9.e().g(m3Var);
                        activity.f235391t = db5.e1.Q(activity.mo55332x76847179(), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572493bd4), true, true, new hr3.ci(aiVar, m3Var));
                        return null;
                    }
                });
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
