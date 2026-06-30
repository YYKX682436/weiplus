package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class r1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f f261017d;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f activityC19081x5e445f1f) {
        this.f261017d = activityC19081x5e445f1f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyCodeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f activityC19081x5e445f1f = this.f261017d;
        if (activityC19081x5e445f1f.f260807n == null) {
            activityC19081x5e445f1f.f260807n = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a2(activityC19081x5e445f1f, 60000L, 1000L);
        }
        activityC19081x5e445f1f.f260809p = true;
        activityC19081x5e445f1f.f260802f.setEnabled(false);
        activityC19081x5e445f1f.f260807n.start();
        np5.g m83106x57340563 = activityC19081x5e445f1f.m83106x57340563();
        if (m83106x57340563 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.u) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.u uVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.u) m83106x57340563;
            java.lang.String m83183xfb85ada3 = activityC19081x5e445f1f.f260800d.m83183xfb85ada3();
            java.lang.String str = activityC19081x5e445f1f.f260808o;
            uVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "do resend verify code");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "do send sms: %s", m83183xfb85ada3);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar = uVar.f261032d;
            java.lang.String string = aVar.f295334c.getString("realname_verify_process_req_key", "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f260855l)) {
                string = aVar.f260855l;
            }
            new ys4.b(m83183xfb85ada3, str, uVar.f261031c, string).l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.t(uVar));
            int i17 = uVar.f261031c;
            if (i17 == 0) {
                uVar.f261031c = i17 + 1;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WcPayRealNameVerifyCodeUI", "wrong controller");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyCodeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
