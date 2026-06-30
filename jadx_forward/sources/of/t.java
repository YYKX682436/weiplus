package of;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f426391a;

    /* renamed from: b, reason: collision with root package name */
    public final long f426392b;

    /* renamed from: c, reason: collision with root package name */
    public final long f426393c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f426394d;

    public t(java.lang.String name, long j17, long j18, java.lang.String permission) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        this.f426391a = name;
        this.f426392b = j17;
        this.f426393c = j18;
        this.f426394d = permission;
    }

    /* renamed from: toString */
    public java.lang.String m151183x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f426391a);
        sb6.append(":[0x");
        r26.a.a(16);
        java.lang.String l17 = java.lang.Long.toString(this.f426392b, 16);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "toString(...)");
        sb6.append(l17);
        sb6.append(", 0x");
        r26.a.a(16);
        java.lang.String l18 = java.lang.Long.toString(this.f426393c, 16);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l18, "toString(...)");
        sb6.append(l18);
        sb6.append("), ");
        sb6.append(this.f426394d);
        return sb6.toString();
    }
}
