package oi2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f427143a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f427144b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f427145c;

    /* renamed from: d, reason: collision with root package name */
    public final int f427146d;

    public a(int i17, java.lang.String content, boolean z17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f427143a = i17;
        this.f427144b = content;
        this.f427145c = z17;
        this.f427146d = i18;
    }

    /* renamed from: equals */
    public boolean m151434xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi2.a)) {
            return false;
        }
        oi2.a aVar = (oi2.a) obj;
        return this.f427143a == aVar.f427143a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427144b, aVar.f427144b) && this.f427145c == aVar.f427145c && this.f427146d == aVar.f427146d;
    }

    /* renamed from: hashCode */
    public int m151435x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f427143a) * 31) + this.f427144b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f427145c)) * 31) + java.lang.Integer.hashCode(this.f427146d);
    }

    /* renamed from: toString */
    public java.lang.String m151436x9616526c() {
        return "PayMicDataModel(requestType=" + this.f427143a + ", content=" + this.f427144b + ", isAnonymous=" + this.f427145c + ", wecoinCount=" + this.f427146d + ')';
    }
}
