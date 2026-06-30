package sv4;

/* loaded from: classes12.dex */
public final class c extends jv4.e {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f494926g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f494927h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(su4.p0 config, java.lang.ref.WeakReference delegate) {
        super(config);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f494926g = delegate;
        this.f494927h = jz5.h.b(new sv4.b(this));
    }

    @Override // jv4.e
    public jv4.h a() {
        return (sv4.i) ((jz5.n) this.f494927h).mo141623x754a37bb();
    }

    @Override // jv4.e
    public void d() {
        sv4.i iVar = (sv4.i) ((jz5.n) this.f494927h).mo141623x754a37bb();
        sv4.d dVar = (sv4.d) this.f494926g.get();
        iVar.f494934b = dVar != null ? ((qv4.r0) dVar).h() : null;
        jv4.i iVar2 = iVar.f494935c;
        if (iVar2 != null) {
            ((jv4.p) iVar2).y(false);
        }
    }
}
