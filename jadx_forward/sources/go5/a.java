package go5;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f355647a;

    /* renamed from: b, reason: collision with root package name */
    public final int f355648b;

    public a(int i17, int i18, int i19) {
        this.f355647a = i17;
        this.f355648b = i19;
    }

    /* renamed from: equals */
    public boolean m131942xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go5.a)) {
            return false;
        }
        go5.a aVar = (go5.a) obj;
        return this.f355647a == aVar.f355647a && this.f355648b == aVar.f355648b;
    }

    /* renamed from: hashCode */
    public int m131943x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f355647a) * 31) + java.lang.Integer.hashCode(0)) * 31) + java.lang.Integer.hashCode(this.f355648b);
    }

    /* renamed from: toString */
    public java.lang.String m131944x9616526c() {
        return "AudioPlayReport(errorCode=" + this.f355647a + ", sourceMode=0, frameCount=" + this.f355648b + ')';
    }
}
