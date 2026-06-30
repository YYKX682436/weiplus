package z51;

/* loaded from: classes10.dex */
public final class w extends z51.x {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a f551761f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f551762g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f551763h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f551764i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f551765j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f551766k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y51.a pcContext) {
        super(pcContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pcContext, "pcContext");
        this.f551763h = "";
        this.f551765j = true;
    }

    @Override // z51.x
    public java.lang.String c() {
        return "MicroMsg.LivePhotoThumbViewPc";
    }

    @Override // z51.x
    public void d(a61.a config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        super.d(config);
        java.lang.String str = config.f83251b.f83252a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getThumbPath(...)");
        this.f551763h = str;
        a61.d dVar = config.f83250a;
        this.f551764i = dVar.f83260d;
        f("needLongPressToPlay >> " + this.f551764i);
        this.f551765j = dVar.f83264h;
        if (this.f551763h.length() == 0) {
            throw new java.lang.IllegalArgumentException("thumb path is Empty");
        }
    }

    @Override // z51.x
    public void j() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f551762g;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        super.j();
    }
}
