package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class g80 {

    /* renamed from: a, reason: collision with root package name */
    public final int f208348a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f208349b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f208350c;

    public g80(int i17, java.lang.String exptKey, java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exptKey, "exptKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f208348a = i17;
        this.f208349b = exptKey;
        this.f208350c = data;
    }

    /* renamed from: equals */
    public boolean m59774xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.g80)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.g80 g80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.g80) obj;
        return this.f208348a == g80Var.f208348a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f208349b, g80Var.f208349b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f208350c, g80Var.f208350c);
    }

    /* renamed from: hashCode */
    public int m59775x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f208348a) * 31) + this.f208349b.hashCode()) * 31) + this.f208350c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m59776x9616526c() {
        return "FinderInitExptBuff(cmdId=" + this.f208348a + ", exptKey=" + this.f208349b + ", data=" + this.f208350c + ')';
    }
}
