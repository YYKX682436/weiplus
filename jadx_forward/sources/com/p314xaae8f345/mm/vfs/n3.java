package com.p314xaae8f345.mm.vfs;

/* loaded from: classes10.dex */
public final class n3 extends com.p314xaae8f345.mm.vfs.u {

    /* renamed from: b, reason: collision with root package name */
    public final long f294614b;

    /* renamed from: c, reason: collision with root package name */
    public final long f294615c;

    /* renamed from: d, reason: collision with root package name */
    public final long f294616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(long j17, long j18, long j19) {
        super(3);
        com.p314xaae8f345.mm.vfs.v vVar = com.p314xaae8f345.mm.vfs.v.f294745e;
        this.f294614b = j17;
        this.f294615c = j18;
        this.f294616d = j19;
    }

    @Override // com.p314xaae8f345.mm.vfs.u
    public java.util.Map b(java.lang.String name, java.lang.String dir) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dir, "dir");
        return kz5.c1.k(new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, name), new jz5.l(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26638x12179c17.f55899xc6c33770, dir), new jz5.l("target", java.lang.String.valueOf(this.f294614b)), new jz5.l("threshold", java.lang.String.valueOf(this.f294615c)), new jz5.l("expire", java.lang.String.valueOf(this.f294616d)));
    }

    /* renamed from: equals */
    public boolean m82436xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.vfs.n3)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.n3 n3Var = (com.p314xaae8f345.mm.vfs.n3) obj;
        return this.f294614b == n3Var.f294614b && this.f294615c == n3Var.f294615c && this.f294616d == n3Var.f294616d;
    }

    /* renamed from: hashCode */
    public int m82437x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f294614b) * 31) + java.lang.Long.hashCode(this.f294615c)) * 31) + java.lang.Long.hashCode(this.f294616d);
    }

    /* renamed from: toString */
    public java.lang.String m82438x9616526c() {
        return "Lru(targetSize=" + this.f294614b + ", threshold=" + this.f294615c + ", expireTime=" + this.f294616d + ')';
    }
}
