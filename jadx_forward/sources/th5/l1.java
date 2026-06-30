package th5;

/* loaded from: classes12.dex */
public final class l1 implements mf3.k {

    /* renamed from: a, reason: collision with root package name */
    public final th5.q f500939a;

    public l1(th5.q live) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(live, "live");
        this.f500939a = live;
    }

    @Override // mf3.k
    public gg3.c a() {
        return this.f500939a.a();
    }

    @Override // mf3.k
    public eg3.i c() {
        this.f500939a.getClass();
        return null;
    }

    @Override // mf3.k
    public sf3.g e() {
        return this.f500939a.e();
    }

    @Override // mf3.k
    public void f(mf3.w level) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level, "level");
        th5.q qVar = this.f500939a;
        qVar.getClass();
        qVar.f500983h = level;
    }

    @Override // mf3.k
    public java.lang.String g() {
        th5.q qVar = this.f500939a;
        java.lang.String str = qVar.f500987l;
        return str.length() == 0 ? qVar.f500986k : str;
    }

    @Override // mf3.k
    /* renamed from: getId */
    public java.lang.String mo2110x5db1b11() {
        return this.f500939a.mo2110x5db1b11();
    }

    @Override // mf3.k
    /* renamed from: getLevel */
    public mf3.w mo147256x74bf41ce() {
        return this.f500939a.f500983h;
    }

    @Override // mf3.k
    /* renamed from: getType */
    public mf3.u mo2109xfb85f7b0() {
        return mf3.u.f407657f;
    }
}
