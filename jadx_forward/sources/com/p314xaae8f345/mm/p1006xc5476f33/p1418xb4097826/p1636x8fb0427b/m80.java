package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class m80 {

    /* renamed from: a, reason: collision with root package name */
    public final e42.b0 f208710a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f208711b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f208712c;

    public m80(e42.b0 xLabKey, java.lang.Object data, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xLabKey, "xLabKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f208710a = xLabKey;
        this.f208711b = data;
        this.f208712c = z17;
    }

    /* renamed from: equals */
    public boolean m60103xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.m80)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.m80 m80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.m80) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f208710a, m80Var.f208710a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f208711b, m80Var.f208711b) && this.f208712c == m80Var.f208712c;
    }

    /* renamed from: hashCode */
    public int m60104x8cdac1b() {
        return (((this.f208710a.hashCode() * 31) + this.f208711b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f208712c);
    }

    /* renamed from: toString */
    public java.lang.String m60105x9616526c() {
        return "XLabData(xLabKey=" + this.f208710a + ", data=" + this.f208711b + ", isReadWithHit=" + this.f208712c + ')';
    }
}
