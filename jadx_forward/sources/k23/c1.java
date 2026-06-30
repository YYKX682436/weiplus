package k23;

/* loaded from: classes12.dex */
public final class c1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final k23.b3 f385071d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f385072e;

    /* renamed from: f, reason: collision with root package name */
    public final k23.t2 f385073f;

    /* renamed from: g, reason: collision with root package name */
    public k23.v0 f385074g;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f385070i = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(k23.c1.class, "isEnable", "isEnable()Z", 0))};

    /* renamed from: h, reason: collision with root package name */
    public static final k23.x0 f385069h = new k23.x0(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f385071d = new k23.b3();
        this.f385072e = jz5.h.b(new k23.z0(this));
        this.f385073f = new k23.t2(new k23.y0(this));
    }

    public static final void T6(k23.c1 c1Var, java.lang.String str, boolean z17) {
        c1Var.getClass();
        vu4.a aVar = z17 ? vu4.a.F : vu4.a.f521779p;
        z50.d dVar = z50.e.f551696a;
        vu4.b bVar = vu4.b.C;
        android.app.Activity context = c1Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        dVar.b(aVar, bVar, ((z13.f) a17).a7(), str);
        if (z17) {
            k23.v0 v0Var = c1Var.f385074g;
            if (v0Var != null) {
                v0Var.w(10, "", str);
                return;
            }
            return;
        }
        k23.v0 v0Var2 = c1Var.f385074g;
        if (v0Var2 != null) {
            v0Var2.w(9, "", str);
        }
    }

    public final boolean U6() {
        f06.v property = f385070i[0];
        k23.t2 t2Var = this.f385073f;
        t2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        java.lang.Object obj = t2Var.f385230b.get();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return ((java.lang.Boolean) ((jz5.g) obj).mo141623x754a37bb()).booleanValue();
    }

    public final boolean V6() {
        return U6() && ((java.lang.Boolean) ((jz5.n) this.f385071d.f385062b).mo141623x754a37bb()).booleanValue();
    }

    public final boolean W6() {
        return ((java.lang.Boolean) ((jz5.n) this.f385072e).mo141623x754a37bb()).booleanValue();
    }
}
