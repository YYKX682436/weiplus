package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f286323a;

    /* renamed from: b, reason: collision with root package name */
    public final float f286324b;

    /* renamed from: c, reason: collision with root package name */
    public final float f286325c;

    /* renamed from: d, reason: collision with root package name */
    public final float f286326d;

    /* renamed from: e, reason: collision with root package name */
    public final float f286327e;

    /* renamed from: f, reason: collision with root package name */
    public final float f286328f;

    /* renamed from: g, reason: collision with root package name */
    public final float f286329g;

    /* renamed from: h, reason: collision with root package name */
    public final float f286330h;

    public h(float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38) {
        this.f286323a = f17;
        this.f286324b = f18;
        this.f286325c = f19;
        this.f286326d = f27;
        this.f286327e = f28;
        this.f286328f = f29;
        this.f286329g = f37;
        this.f286330h = f38;
    }

    public static com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.h a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.h hVar, float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, int i17, java.lang.Object obj) {
        float f39 = (i17 & 1) != 0 ? hVar.f286323a : f17;
        float f47 = (i17 & 2) != 0 ? hVar.f286324b : f18;
        float f48 = (i17 & 4) != 0 ? hVar.f286325c : f19;
        float f49 = (i17 & 8) != 0 ? hVar.f286326d : f27;
        float f57 = (i17 & 16) != 0 ? hVar.f286327e : f28;
        float f58 = (i17 & 32) != 0 ? hVar.f286328f : f29;
        float f59 = (i17 & 64) != 0 ? hVar.f286329g : f37;
        float f66 = (i17 & 128) != 0 ? hVar.f286330h : f38;
        hVar.getClass();
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.h(f39, f47, f48, f49, f57, f58, f59, f66);
    }

    /* renamed from: equals */
    public boolean m80326xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.h)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.h hVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.h) obj;
        return java.lang.Float.compare(this.f286323a, hVar.f286323a) == 0 && java.lang.Float.compare(this.f286324b, hVar.f286324b) == 0 && java.lang.Float.compare(this.f286325c, hVar.f286325c) == 0 && java.lang.Float.compare(this.f286326d, hVar.f286326d) == 0 && java.lang.Float.compare(this.f286327e, hVar.f286327e) == 0 && java.lang.Float.compare(this.f286328f, hVar.f286328f) == 0 && java.lang.Float.compare(this.f286329g, hVar.f286329g) == 0 && java.lang.Float.compare(this.f286330h, hVar.f286330h) == 0;
    }

    /* renamed from: hashCode */
    public int m80327x8cdac1b() {
        return (((((((((((((java.lang.Float.hashCode(this.f286323a) * 31) + java.lang.Float.hashCode(this.f286324b)) * 31) + java.lang.Float.hashCode(this.f286325c)) * 31) + java.lang.Float.hashCode(this.f286326d)) * 31) + java.lang.Float.hashCode(this.f286327e)) * 31) + java.lang.Float.hashCode(this.f286328f)) * 31) + java.lang.Float.hashCode(this.f286329g)) * 31) + java.lang.Float.hashCode(this.f286330h);
    }

    /* renamed from: toString */
    public java.lang.String m80328x9616526c() {
        return "ItemParams(alpha = " + this.f286323a + ", scale = " + this.f286324b + ", rotation = " + this.f286325c + ", rotationY = " + this.f286326d + ", translationX = " + this.f286327e + ", translationY = " + this.f286328f + ", translationZ = " + this.f286329g + ", maskAlpha = " + this.f286330h + ')';
    }
}
