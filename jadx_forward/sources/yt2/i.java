package yt2;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final float f546840a;

    /* renamed from: b, reason: collision with root package name */
    public final float f546841b;

    /* renamed from: c, reason: collision with root package name */
    public final float f546842c;

    public i(float f17, float f18, float f19) {
        this.f546840a = f17;
        this.f546841b = f18;
        this.f546842c = f19;
    }

    /* renamed from: equals */
    public boolean m177618xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt2.i)) {
            return false;
        }
        yt2.i iVar = (yt2.i) obj;
        return java.lang.Float.compare(this.f546840a, iVar.f546840a) == 0 && java.lang.Float.compare(this.f546841b, iVar.f546841b) == 0 && java.lang.Float.compare(this.f546842c, iVar.f546842c) == 0;
    }

    /* renamed from: hashCode */
    public int m177619x8cdac1b() {
        return (((java.lang.Float.hashCode(this.f546840a) * 31) + java.lang.Float.hashCode(this.f546841b)) * 31) + java.lang.Float.hashCode(this.f546842c);
    }

    /* renamed from: toString */
    public java.lang.String m177620x9616526c() {
        return "ExitTarget(leftX=" + this.f546840a + ", centerY=" + this.f546841b + ", height=" + this.f546842c + ')';
    }
}
