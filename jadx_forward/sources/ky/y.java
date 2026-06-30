package ky;

/* loaded from: classes14.dex */
public final class y extends ky.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f394979a;

    /* renamed from: b, reason: collision with root package name */
    public final float f394980b;

    public y(float f17, float f18) {
        super(null);
        this.f394979a = f17;
        this.f394980b = f18;
    }

    /* renamed from: equals */
    public boolean m144588xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky.y)) {
            return false;
        }
        ky.y yVar = (ky.y) obj;
        return java.lang.Float.compare(this.f394979a, yVar.f394979a) == 0 && java.lang.Float.compare(this.f394980b, yVar.f394980b) == 0;
    }

    /* renamed from: hashCode */
    public int m144589x8cdac1b() {
        return (java.lang.Float.hashCode(this.f394979a) * 31) + java.lang.Float.hashCode(this.f394980b);
    }

    /* renamed from: toString */
    public java.lang.String m144590x9616526c() {
        return "Dragging(offsetX=" + this.f394979a + ", offsetY=" + this.f394980b + ')';
    }
}
