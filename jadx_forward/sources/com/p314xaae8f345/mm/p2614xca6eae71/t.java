package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteBuffer f274904a;

    /* renamed from: b, reason: collision with root package name */
    public final int f274905b;

    /* renamed from: c, reason: collision with root package name */
    public final int f274906c;

    public t(java.nio.ByteBuffer buffer, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        this.f274904a = buffer;
        this.f274905b = i17;
        this.f274906c = i18;
    }

    /* renamed from: equals */
    public boolean m77871xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p2614xca6eae71.t)) {
            return false;
        }
        com.p314xaae8f345.mm.p2614xca6eae71.t tVar = (com.p314xaae8f345.mm.p2614xca6eae71.t) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f274904a, tVar.f274904a) && this.f274905b == tVar.f274905b && this.f274906c == tVar.f274906c;
    }

    /* renamed from: hashCode */
    public int m77872x8cdac1b() {
        return (((this.f274904a.hashCode() * 31) + java.lang.Integer.hashCode(this.f274905b)) * 31) + java.lang.Integer.hashCode(this.f274906c);
    }

    /* renamed from: toString */
    public java.lang.String m77873x9616526c() {
        return "ImageBuffer(buffer=" + this.f274904a + ", width=" + this.f274905b + ", height=" + this.f274906c + ')';
    }
}
