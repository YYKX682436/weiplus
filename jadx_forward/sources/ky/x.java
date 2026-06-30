package ky;

/* loaded from: classes14.dex */
public final class x extends ky.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f394977a;

    /* renamed from: b, reason: collision with root package name */
    public final float f394978b;

    public x(float f17, float f18) {
        super(null);
        this.f394977a = f17;
        this.f394978b = f18;
    }

    /* renamed from: equals */
    public boolean m144585xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky.x)) {
            return false;
        }
        ky.x xVar = (ky.x) obj;
        return java.lang.Float.compare(this.f394977a, xVar.f394977a) == 0 && java.lang.Float.compare(this.f394978b, xVar.f394978b) == 0;
    }

    /* renamed from: hashCode */
    public int m144586x8cdac1b() {
        return (java.lang.Float.hashCode(this.f394977a) * 31) + java.lang.Float.hashCode(this.f394978b);
    }

    /* renamed from: toString */
    public java.lang.String m144587x9616526c() {
        return "DragCancel(offsetX=" + this.f394977a + ", offsetY=" + this.f394978b + ')';
    }
}
