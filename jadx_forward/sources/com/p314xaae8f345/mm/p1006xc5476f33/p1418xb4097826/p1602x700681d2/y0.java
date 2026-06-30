package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 f204026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f204027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f204028f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 s1Var, java.lang.Long l17, yz5.l lVar) {
        super(0);
        this.f204026d = s1Var;
        this.f204027e = l17;
        this.f204028f = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 s1Var = this.f204026d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var = s1Var.f203958e;
        if (l0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallBack");
            throw null;
        }
        l0Var.z();
        s1Var.n(this.f204027e, this.f204028f);
        return jz5.f0.f384359a;
    }
}
