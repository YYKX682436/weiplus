package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes11.dex */
public class x0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f236269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 f236270b;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar) {
        this.f236270b = e0Var;
        this.f236269a = rVar;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "username:%s mRoomId:%s succ:%s", str, this.f236270b.f234965s, java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
            java.lang.String f27 = n17.f2();
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var = this.f236270b;
            e0Var.r(this.f236269a, e0Var.f234953d, e0Var.f234972z, f27, n17, e0Var.f234964r);
        }
    }
}
