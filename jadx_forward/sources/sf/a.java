package sf;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f488466a;

    /* renamed from: b, reason: collision with root package name */
    public final int f488467b;

    public a(int i17, int i18) {
        this.f488466a = i17;
        this.f488467b = i18;
    }

    /* renamed from: equals */
    public boolean m164363xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf.a)) {
            return false;
        }
        sf.a aVar = (sf.a) obj;
        return this.f488466a == aVar.f488466a && this.f488467b == aVar.f488467b;
    }

    /* renamed from: hashCode */
    public int m164364x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f488466a) * 31) + java.lang.Integer.hashCode(this.f488467b);
    }

    /* renamed from: toString */
    public java.lang.String m164365x9616526c() {
        return "KeyboardDisplayAction(keyboardType=" + this.f488466a + ", viewId=" + this.f488467b + ')';
    }
}
