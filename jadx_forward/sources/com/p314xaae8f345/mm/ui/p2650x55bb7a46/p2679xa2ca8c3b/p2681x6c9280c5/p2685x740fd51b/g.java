package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f286318a;

    /* renamed from: b, reason: collision with root package name */
    public final int f286319b;

    /* renamed from: c, reason: collision with root package name */
    public float f286320c;

    public g(int i17, int i18, float f17) {
        this.f286318a = i17;
        this.f286319b = i18;
        this.f286320c = f17;
    }

    /* renamed from: equals */
    public boolean m80320xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.g)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.g gVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.g) obj;
        return this.f286318a == gVar.f286318a && this.f286319b == gVar.f286319b && java.lang.Float.compare(this.f286320c, gVar.f286320c) == 0;
    }

    /* renamed from: hashCode */
    public int m80321x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f286318a) * 31) + java.lang.Integer.hashCode(this.f286319b)) * 31) + java.lang.Float.hashCode(this.f286320c);
    }

    /* renamed from: toString */
    public java.lang.String m80322x9616526c() {
        return "EdgeState(index=" + this.f286318a + ", direction=" + this.f286319b + ", progress=" + this.f286320c + ')';
    }
}
