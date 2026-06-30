package mg3;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final float f407776a;

    /* renamed from: b, reason: collision with root package name */
    public final float f407777b;

    /* renamed from: c, reason: collision with root package name */
    public final float f407778c;

    /* renamed from: d, reason: collision with root package name */
    public final float f407779d;

    public l(float f17, float f18, float f19, float f27, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        f17 = (i17 & 1) != 0 ? 1.0f : f17;
        f18 = (i17 & 2) != 0 ? 1.0f : f18;
        f19 = (i17 & 4) != 0 ? 5.0f : f19;
        f27 = (i17 & 8) != 0 ? 2.0f : f27;
        this.f407776a = f17;
        this.f407777b = f18;
        this.f407778c = f19;
        this.f407779d = f27;
    }

    /* renamed from: equals */
    public boolean m147279xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg3.l)) {
            return false;
        }
        mg3.l lVar = (mg3.l) obj;
        return java.lang.Float.compare(this.f407776a, lVar.f407776a) == 0 && java.lang.Float.compare(this.f407777b, lVar.f407777b) == 0 && java.lang.Float.compare(this.f407778c, lVar.f407778c) == 0 && java.lang.Float.compare(this.f407779d, lVar.f407779d) == 0;
    }

    /* renamed from: hashCode */
    public int m147280x8cdac1b() {
        return (((((java.lang.Float.hashCode(this.f407776a) * 31) + java.lang.Float.hashCode(this.f407777b)) * 31) + java.lang.Float.hashCode(this.f407778c)) * 31) + java.lang.Float.hashCode(this.f407779d);
    }

    /* renamed from: toString */
    public java.lang.String m147281x9616526c() {
        return "PreviewScaleConfig(extraScaleFactor=" + this.f407776a + ", minScaleRate=" + this.f407777b + ", maxScaleRate=" + this.f407778c + ", doubleTapScaleRate=" + this.f407779d + ')';
    }
}
