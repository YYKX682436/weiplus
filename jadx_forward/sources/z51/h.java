package z51;

/* loaded from: classes10.dex */
public final class h extends z51.x {

    /* renamed from: f, reason: collision with root package name */
    public boolean f551720f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f551721g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(y51.a pcContext) {
        super(pcContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pcContext, "pcContext");
        this.f551720f = true;
        this.f551721g = "";
    }

    @Override // z51.x
    public java.lang.String c() {
        return "MicroMsg.LivePhotoPlayErrorViewPc";
    }

    @Override // z51.x
    public void d(a61.a config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        super.d(config);
        a61.d dVar = config.f83250a;
        this.f551720f = dVar.f83261e;
        java.lang.String str = dVar.f83262f;
        if (str.length() == 0) {
            str = i65.a.r(b(), com.p314xaae8f345.mm.R.C30867xcad56011.o7l);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
        }
        this.f551721g = str;
    }
}
