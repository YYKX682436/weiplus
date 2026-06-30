package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes8.dex */
public class c0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19046x61d110b1 f260513d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19046x61d110b1 activityC19046x61d110b1) {
        super(false);
        this.f260513d = activityC19046x61d110b1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19046x61d110b1.f260397f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19046x61d110b1 activityC19046x61d110b1 = this.f260513d;
        if (activityC19046x61d110b1.m83108x2b5a5a39() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.d(15774, java.lang.Integer.valueOf(activityC19046x61d110b1.m83108x2b5a5a39().f295334c.getInt("key_forgot_scene", 1)), 2);
            g0Var.mo68477x336bdfd8(917L, 33L, 1L, false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdSelectUI", "gotToFaceCheck");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5925x646e9c76 c5925x646e9c76 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5925x646e9c76();
        am.jr jrVar = c5925x646e9c76.f136227g;
        jrVar.f88609j = activityC19046x61d110b1;
        jrVar.f88600a = activityC19046x61d110b1.m83105x7498fe14().getInt("key_face_action_scene");
        jrVar.f88601b = activityC19046x61d110b1.m83105x7498fe14().getString("key_face_action_package");
        jrVar.f88602c = activityC19046x61d110b1.m83105x7498fe14().getString("key_face_action_package_sign");
        jrVar.f88603d = activityC19046x61d110b1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575066km5);
        jrVar.f88607h = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d;
        c5925x646e9c76.e();
    }
}
