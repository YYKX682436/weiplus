package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes8.dex */
public class p1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19080x8d358955 f260990d;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19080x8d358955 activityC19080x8d358955) {
        this.f260990d = activityC19080x8d358955;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyBindcardEntranceUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19080x8d358955 activityC19080x8d358955 = this.f260990d;
        boolean z17 = activityC19080x8d358955.m83105x7498fe14().getBoolean("realname_verify_process_need_face", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealnameVerifyBindcardEntranceUI", "need face : %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19080x8d358955.f260794h;
            activityC19080x8d358955.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealnameVerifyBindcardEntranceUI", "gotToFaceCheck");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5925x646e9c76 c5925x646e9c76 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5925x646e9c76();
            am.jr jrVar = c5925x646e9c76.f136227g;
            jrVar.f88609j = activityC19080x8d358955;
            jrVar.f88600a = (int) activityC19080x8d358955.m83105x7498fe14().getLong("realname_verify_process_face_scene");
            jrVar.f88601b = activityC19080x8d358955.m83105x7498fe14().getString("realname_verify_process_face_package");
            jrVar.f88602c = activityC19080x8d358955.m83105x7498fe14().getString("realname_verify_process_face_package_sign");
            jrVar.f88607h = 1;
            c5925x646e9c76.e();
        } else {
            activityC19080x8d358955.m83105x7498fe14().putBoolean("realname_verify_process_do_bind", false);
            com.p314xaae8f345.mm.p2802xd031a825.a.d(activityC19080x8d358955.mo55332x76847179(), activityC19080x8d358955.m83105x7498fe14());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyBindcardEntranceUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
