package com.p314xaae8f345.mm.vfs;

/* loaded from: classes10.dex */
public final class m1 extends com.p314xaae8f345.mm.vfs.u {

    /* renamed from: b, reason: collision with root package name */
    public final long f294603b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(long j17) {
        super(2);
        com.p314xaae8f345.mm.vfs.v vVar = com.p314xaae8f345.mm.vfs.v.f294745e;
        this.f294603b = j17;
    }

    @Override // com.p314xaae8f345.mm.vfs.u
    public java.util.Map b(java.lang.String name, java.lang.String dir) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dir, "dir");
        return kz5.c1.k(new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, name), new jz5.l(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26638x12179c17.f55899xc6c33770, dir), new jz5.l("expire", java.lang.String.valueOf(this.f294603b)));
    }

    /* renamed from: equals */
    public boolean m82429xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.vfs.m1) && this.f294603b == ((com.p314xaae8f345.mm.vfs.m1) obj).f294603b;
    }

    /* renamed from: hashCode */
    public int m82430x8cdac1b() {
        return java.lang.Long.hashCode(this.f294603b);
    }

    /* renamed from: toString */
    public java.lang.String m82431x9616526c() {
        return "Expire(expireTime=" + this.f294603b + ')';
    }
}
