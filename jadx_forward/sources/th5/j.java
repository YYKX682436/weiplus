package th5;

/* loaded from: classes12.dex */
public final class j implements mf3.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mf3.k f500921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mf3.k f500922b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ th5.q f500923c;

    public j(mf3.k kVar, th5.q qVar) {
        this.f500922b = kVar;
        this.f500923c = qVar;
        this.f500921a = kVar;
    }

    @Override // mf3.k
    public gg3.c a() {
        return this.f500921a.a();
    }

    @Override // mf3.k
    public eg3.i c() {
        return this.f500921a.c();
    }

    @Override // mf3.k
    public sf3.g e() {
        return this.f500921a.e();
    }

    @Override // mf3.k
    public void f(mf3.w level) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level, "level");
        this.f500921a.f(level);
    }

    @Override // mf3.k
    public java.lang.String g() {
        java.lang.String b17;
        th5.q qVar = this.f500923c;
        return (qVar == null || (b17 = qVar.b()) == null) ? this.f500922b.g() : b17;
    }

    @Override // mf3.k
    /* renamed from: getId */
    public java.lang.String mo2110x5db1b11() {
        return this.f500921a.mo2110x5db1b11();
    }

    @Override // mf3.k
    /* renamed from: getLevel */
    public mf3.w mo147256x74bf41ce() {
        return this.f500921a.mo147256x74bf41ce();
    }

    @Override // mf3.k
    /* renamed from: getType */
    public mf3.u mo2109xfb85f7b0() {
        return mf3.u.f407656e;
    }
}
