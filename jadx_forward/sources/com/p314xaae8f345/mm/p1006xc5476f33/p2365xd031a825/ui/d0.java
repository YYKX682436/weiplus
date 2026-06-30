package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class d0 implements com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.rl6 f261762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.yt5 f261763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x f261764c;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x xVar, r45.rl6 rl6Var, r45.yt5 yt5Var) {
        this.f261764c = xVar;
        this.f261762a = rl6Var;
        this.f261763b = yt5Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r0
    public boolean a(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        r45.rl6 rl6Var = this.f261762a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "text(%s) click!", ((r45.hl6) rl6Var.f466520d.get(0)).f457806f);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_tiny_app_scene", 1000);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27779, 1, ((r45.hl6) rl6Var.f466520d.get(0)).f457806f, 0, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.c(this.f261764c.f262309d, this.f261763b, bundle);
        return true;
    }
}
