package t40;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f497001a;

    /* renamed from: b, reason: collision with root package name */
    public final int f497002b;

    public a(java.lang.String str, int i17) {
        this.f497001a = str;
        this.f497002b = i17;
    }

    /* renamed from: equals */
    public boolean m165854xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t40.a)) {
            return false;
        }
        t40.a aVar = (t40.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f497001a, aVar.f497001a) && this.f497002b == aVar.f497002b;
    }

    /* renamed from: hashCode */
    public int m165855x8cdac1b() {
        java.lang.String str = this.f497001a;
        return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f497002b);
    }

    /* renamed from: toString */
    public java.lang.String m165856x9616526c() {
        return "AuthIconParams(authInfoIconUrl=" + this.f497001a + ", authIconType=" + this.f497002b + ')';
    }
}
