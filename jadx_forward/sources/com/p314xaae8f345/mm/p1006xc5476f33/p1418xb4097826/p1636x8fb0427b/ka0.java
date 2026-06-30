package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes2.dex */
public final class ka0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.la0 f208594d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.la0 la0Var) {
        super(0);
        this.f208594d = la0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderMixLocalItem_");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.la0 la0Var = this.f208594d;
        sb6.append(la0Var.f208657a.m75939xb282bd08(0));
        sb6.append('_');
        java.lang.String m75945x2fec8307 = la0Var.f208657a.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        sb6.append(m75945x2fec8307);
        return java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(sb6.toString()).hashCode());
    }
}
