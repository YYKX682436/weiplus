package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class d1 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.e1 f260890a;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.e1 e1Var) {
        this.f260890a = e1Var;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.e1 e1Var = this.f260890a;
        if (i17 == 0) {
            intent.putExtra("rawUrl", e1Var.f260901d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575014ke2, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()));
        } else if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19077xceb7df6f viewOnClickListenerC19077xceb7df6f = e1Var.f260901d;
            if (viewOnClickListenerC19077xceb7df6f.f260770o != null) {
                intent.putExtra("rawUrl", viewOnClickListenerC19077xceb7df6f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575013ke1, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), e1Var.f260901d.f260770o.f261192s));
            }
        }
        intent.putExtra("showShare", false);
        intent.putExtra("allow_mix_content_mode", false);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(e1Var.f260901d.mo55332x76847179(), intent);
    }
}
