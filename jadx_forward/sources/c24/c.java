package c24;

/* loaded from: classes.dex */
public final class c extends xm3.a implements c24.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f119603d;

    /* renamed from: e, reason: collision with root package name */
    public final wd0.x1 f119604e;

    /* renamed from: f, reason: collision with root package name */
    public final c24.d f119605f;

    public c(int i17, wd0.x1 settingResult, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(settingResult, "settingResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f119603d = i17;
        this.f119604e = settingResult;
        this.f119605f = new c24.d(activity, settingResult);
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        c24.c other = (c24.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(v(), other.v());
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        c24.c other = (c24.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f119603d, other.f119603d);
    }

    @Override // c24.a
    public a24.i j() {
        return this.f119605f;
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        wd0.x1 x1Var = this.f119604e;
        sb6.append(x1Var.f526314d);
        sb6.append('_');
        sb6.append(x1Var.f526316f.name());
        return sb6.toString();
    }
}
