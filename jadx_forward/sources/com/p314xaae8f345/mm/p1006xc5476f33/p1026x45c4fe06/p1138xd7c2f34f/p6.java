package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class p6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811 f166425a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.s6 f166426b;

    public p6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811 pkgInfo, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.s6 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f166425a = pkgInfo;
        this.f166426b = source;
    }

    /* renamed from: equals */
    public boolean m51777xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p6)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p6 p6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p6) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166425a, p6Var.f166425a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166426b, p6Var.f166426b);
    }

    /* renamed from: hashCode */
    public int m51778x8cdac1b() {
        return (this.f166425a.hashCode() * 31) + this.f166426b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m51779x9616526c() {
        return "Response(pkgInfo=" + this.f166425a + ", source=" + this.f166426b + ')';
    }
}
