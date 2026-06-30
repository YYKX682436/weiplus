package m0;

/* loaded from: classes14.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final float f404008a;

    /* renamed from: b, reason: collision with root package name */
    public final float f404009b;

    /* renamed from: c, reason: collision with root package name */
    public final float f404010c;

    /* renamed from: d, reason: collision with root package name */
    public final float f404011d;

    public j(float f17, float f18, float f19, float f27) {
        this.f404008a = f17;
        this.f404009b = f18;
        this.f404010c = f19;
        this.f404011d = f27;
    }

    /* renamed from: equals */
    public boolean m146559xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0.j)) {
            return false;
        }
        m0.j jVar = (m0.j) obj;
        if (!(this.f404008a == jVar.f404008a)) {
            return false;
        }
        if (!(this.f404009b == jVar.f404009b)) {
            return false;
        }
        if (this.f404010c == jVar.f404010c) {
            return (this.f404011d > jVar.f404011d ? 1 : (this.f404011d == jVar.f404011d ? 0 : -1)) == 0;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m146560x8cdac1b() {
        return (((((java.lang.Float.hashCode(this.f404008a) * 31) + java.lang.Float.hashCode(this.f404009b)) * 31) + java.lang.Float.hashCode(this.f404010c)) * 31) + java.lang.Float.hashCode(this.f404011d);
    }

    /* renamed from: toString */
    public java.lang.String m146561x9616526c() {
        return "RippleAlpha(draggedAlpha=" + this.f404008a + ", focusedAlpha=" + this.f404009b + ", hoveredAlpha=" + this.f404010c + ", pressedAlpha=" + this.f404011d + ')';
    }
}
