package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class g5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f188357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188358e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f188359f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.iu0 f188360g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var, java.lang.String str, long j17, r45.iu0 iu0Var) {
        super(0);
        this.f188357d = a7Var;
        this.f188358e = str;
        this.f188359f = j17;
        this.f188360g = iu0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.wy0 wy0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q2(this.f188358e, this.f188359f, (r45.wy0) this.f188360g.m75936x14adae67(1));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f188357d;
        a7Var.f187759w = q2Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh title wording: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q2 q2Var2 = a7Var.f187759w;
        sb6.append((q2Var2 == null || (wy0Var = q2Var2.f190326c) == null) ? null : wy0Var.m75945x2fec8307(0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DrawerPresenter", sb6.toString());
        a7Var.x0();
        return jz5.f0.f384359a;
    }
}
