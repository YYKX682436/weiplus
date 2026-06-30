package rv4;

/* loaded from: classes12.dex */
public final class x implements nv4.g {

    /* renamed from: a, reason: collision with root package name */
    public final rv4.w f482093a;

    /* renamed from: b, reason: collision with root package name */
    public final rv4.y f482094b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f482095c;

    public x(rv4.w session, rv4.y delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f482093a = session;
        this.f482094b = delegate;
    }

    public void a() {
        rv4.w wVar = this.f482093a;
        nv4.k kVar = wVar.f413208b;
        java.lang.String str = wVar.f413207a;
        ov4.f fVar = ov4.f.f430764f;
        ov4.g[] gVarArr = ov4.g.f430768d;
        kVar.c(new ov4.e(str, null, "", 0, 3, fVar, 0L, "1001", "", "", 0, null, 0, 7242, null));
    }

    @Override // nv4.g
    public java.lang.String v() {
        return "[setting-button]-" + this.f482095c;
    }

    @Override // nv4.g
    public void w() {
        rv4.w wVar = this.f482093a;
        nv4.k kVar = wVar.f413208b;
        java.lang.String str = wVar.f413207a;
        ov4.f fVar = ov4.f.f430763e;
        ov4.g[] gVarArr = ov4.g.f430768d;
        kVar.d("setting-btn", new ov4.e(str, null, "", 0, 3, fVar, 0L, "1001", "", "", 0, null, 0, 7242, null));
    }
}
