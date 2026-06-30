package n06;

/* loaded from: classes15.dex */
public final class o extends l06.o {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f415530h = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(n06.o.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f415531f;

    /* renamed from: g, reason: collision with root package name */
    public final e26.x f415532g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e26.c0 storageManager, n06.j kind) {
        super(storageManager);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        this.f415532g = ((e26.u) storageManager).b(new n06.m(this, storageManager));
        int ordinal = kind.ordinal();
        if (ordinal == 1) {
            d(false);
        } else {
            if (ordinal != 2) {
                return;
            }
            d(true);
        }
    }

    public final n06.b0 M() {
        return (n06.b0) e26.b0.a(this.f415532g, this, f415530h[0]);
    }

    @Override // l06.o
    public q06.b e() {
        return M();
    }

    @Override // l06.o
    public java.lang.Iterable m() {
        java.lang.Iterable m17 = super.m();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m17, "getClassDescriptorFactories(...)");
        e26.c0 c0Var = this.f396425d;
        if (c0Var == null) {
            l06.o.a(6);
            throw null;
        }
        r06.x0 l17 = l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "getBuiltInsModule(...)");
        return kz5.n0.s0(m17, new n06.i(c0Var, l17, null, 4, null));
    }

    @Override // l06.o
    public q06.f q() {
        return M();
    }
}
