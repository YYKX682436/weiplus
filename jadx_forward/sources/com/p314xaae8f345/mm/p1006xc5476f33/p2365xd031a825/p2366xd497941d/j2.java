package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 f260932d;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 activityC19082x760c9ba5) {
        this.f260932d = activityC19082x760c9ba5;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 activityC19082x760c9ba5 = this.f260932d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5.U6(activityC19082x760c9ba5);
        activityC19082x760c9ba5.mo48632xd46dd964();
        activityC19082x760c9ba5.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealnameVerifyIdInputUI", "click next btn：do verify real name");
        java.lang.String string = activityC19082x760c9ba5.m83105x7498fe14().getString("key_realname_sessionid");
        java.lang.String str = activityC19082x760c9ba5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j1n).equals(activityC19082x760c9ba5.A.f260993e.mo3195x754a37bb()) ? "1" : "2";
        boolean isShown = activityC19082x760c9ba5.f260819m.isShown();
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28002xcd8b6923 c28002xcd8b6923 = activityC19082x760c9ba5.T;
        activityC19082x760c9ba5.m83099x5406100e(new ys4.g((java.lang.String) activityC19082x760c9ba5.A.f260992d.mo3195x754a37bb(), (java.lang.String) activityC19082x760c9ba5.A.f260995g.mo3195x754a37bb(), activityC19082x760c9ba5.U, ((r45.mj5) activityC19082x760c9ba5.A.f260994f.mo3195x754a37bb()).f462116d.f458399d, (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c) activityC19082x760c9ba5.A.f261002q.mo3195x754a37bb(), (java.lang.String) activityC19082x760c9ba5.A.f260997i.mo3195x754a37bb(), (java.lang.String) activityC19082x760c9ba5.A.f260998m.mo3195x754a37bb(), (java.lang.String) activityC19082x760c9ba5.A.f260999n.mo3195x754a37bb(), isShown ? c28002xcd8b6923.mo121431xea62cd8a(java.lang.String.format("%04d%02d%02d", java.lang.Integer.valueOf(activityC19082x760c9ba5.L), java.lang.Integer.valueOf(activityC19082x760c9ba5.M), java.lang.Integer.valueOf(activityC19082x760c9ba5.N)), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.B()) : "", ((java.lang.Integer) activityC19082x760c9ba5.A.f261006u.mo3195x754a37bb()).intValue(), activityC19082x760c9ba5.f260822p.isShown() ? c28002xcd8b6923.mo121431xea62cd8a(java.lang.String.format("%04d%02d%02d", java.lang.Integer.valueOf(activityC19082x760c9ba5.P), java.lang.Integer.valueOf(activityC19082x760c9ba5.Q), java.lang.Integer.valueOf(activityC19082x760c9ba5.R)), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.B()) : "", (java.lang.String) activityC19082x760c9ba5.A.f261008w.mo3195x754a37bb(), string, (java.lang.String) activityC19082x760c9ba5.A.f261004s.mo3195x754a37bb(), (java.lang.String) activityC19082x760c9ba5.A.f261001p.mo3195x754a37bb(), str, activityC19082x760c9ba5.m83105x7498fe14().getBoolean("key_marketing_switch_closed", false), (java.lang.String) activityC19082x760c9ba5.A.f261005t.mo3195x754a37bb(), activityC19082x760c9ba5.V, activityC19082x760c9ba5.f260818i.isShown() ? c28002xcd8b6923.mo121431xea62cd8a(java.lang.String.format("%04d%02d%02d", java.lang.Integer.valueOf(activityC19082x760c9ba5.I), java.lang.Integer.valueOf(activityC19082x760c9ba5.f260812J), java.lang.Integer.valueOf(activityC19082x760c9ba5.K)), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.B()) : ""), true);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
