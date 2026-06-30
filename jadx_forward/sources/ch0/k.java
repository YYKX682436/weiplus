package ch0;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f122764a;

    /* renamed from: b, reason: collision with root package name */
    public final int f122765b;

    /* renamed from: c, reason: collision with root package name */
    public final tg0.c1 f122766c;

    public k(int i17, int i18, tg0.c1 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        this.f122764a = i17;
        this.f122765b = i18;
        this.f122766c = result;
    }

    /* renamed from: equals */
    public boolean m14827xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch0.k)) {
            return false;
        }
        ch0.k kVar = (ch0.k) obj;
        return this.f122764a == kVar.f122764a && this.f122765b == kVar.f122765b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f122766c, kVar.f122766c);
    }

    /* renamed from: hashCode */
    public int m14828x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f122764a) * 31) + java.lang.Integer.hashCode(this.f122765b)) * 31) + this.f122766c.m166440x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m14829x9616526c() {
        return "FlutterParams(id=" + this.f122764a + ", mode=" + this.f122765b + ", result=" + this.f122766c + ')';
    }
}
