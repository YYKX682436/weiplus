package jf5;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f380966a;

    /* renamed from: b, reason: collision with root package name */
    public final float f380967b;

    /* renamed from: c, reason: collision with root package name */
    public final float f380968c;

    public a(float f17, float f18, float f19, float f27) {
        this.f380966a = f17;
        this.f380967b = f18;
        this.f380968c = f19;
    }

    /* renamed from: equals */
    public boolean m140841xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf5.a)) {
            return false;
        }
        jf5.a aVar = (jf5.a) obj;
        return java.lang.Float.compare(this.f380966a, aVar.f380966a) == 0 && java.lang.Float.compare(this.f380967b, aVar.f380967b) == 0 && java.lang.Float.compare(this.f380968c, aVar.f380968c) == 0 && java.lang.Float.compare(1.6f, 1.6f) == 0;
    }

    /* renamed from: hashCode */
    public int m140842x8cdac1b() {
        return (((((java.lang.Float.hashCode(this.f380966a) * 31) + java.lang.Float.hashCode(this.f380967b)) * 31) + java.lang.Float.hashCode(this.f380968c)) * 31) + java.lang.Float.hashCode(1.6f);
    }

    /* renamed from: toString */
    public java.lang.String m140843x9616526c() {
        return "AutoScrollConfig(edgeSizePx=" + this.f380966a + ", minStepPx=" + this.f380967b + ", maxStepPx=" + this.f380968c + ", rampExponent=1.6)";
    }
}
