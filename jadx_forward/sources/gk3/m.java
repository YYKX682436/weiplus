package gk3;

/* loaded from: classes8.dex */
public final class m extends ek3.a {

    /* renamed from: a, reason: collision with root package name */
    public ak3.c f354058a;

    /* renamed from: b, reason: collision with root package name */
    public jk3.e f354059b;

    /* renamed from: c, reason: collision with root package name */
    public ek3.d f354060c;

    /* renamed from: d, reason: collision with root package name */
    public ek3.e f354061d;

    /* renamed from: e, reason: collision with root package name */
    public kk3.d f354062e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f354063f;

    /* renamed from: g, reason: collision with root package name */
    public long f354064g = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f354065h = true;

    @Override // ek3.a
    public void a(int i17) {
        b(i17, true);
    }

    public final void b(int i17, boolean z17) {
        if (c().c()) {
            if (((ak3.i) c()) instanceof rh1.e) {
                c().f(null);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new gk3.g(this, i17, z17));
        } else {
            kk3.d dVar = this.f354062e;
            if (dVar == null || dVar == null) {
                return;
            }
            dVar.e(i17);
        }
    }

    public final ak3.c c() {
        ak3.c cVar = this.f354058a;
        if (cVar != null) {
            return cVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pageAdapter");
        throw null;
    }

    public void d(ak3.c pageAdapter, jk3.e multiTaskHelper, kk3.d dVar) {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageAdapter, "pageAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskHelper, "multiTaskHelper");
        this.f354058a = pageAdapter;
        this.f354059b = multiTaskHelper;
        this.f354062e = dVar;
        c().h(new gk3.l(this, multiTaskHelper));
        android.view.animation.Interpolator loadInterpolator = android.view.animation.AnimationUtils.loadInterpolator(c().mo2157x19263085(), com.p314xaae8f345.mm.R.C30854x2dc211.f559355cg);
        android.view.ViewGroup a17 = c().a();
        if (a17 != null) {
            gk3.f fVar = new gk3.f(this);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(loadInterpolator);
            android.content.Context context = a17.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            this.f354060c = new ek3.d(context, a17, fVar, loadInterpolator, null);
        }
        ek3.d dVar2 = this.f354060c;
        if (dVar2 != null) {
            dVar2.f335134p = 1;
        }
        android.app.Activity mo2157x19263085 = c().mo2157x19263085();
        float g17 = (mo2157x19263085 == null || (resources = mo2157x19263085.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? i65.a.g(c().mo2157x19263085()) : displayMetrics.density;
        float f17 = 100 * g17;
        float f18 = 300 * g17;
        ek3.d dVar3 = this.f354060c;
        if (dVar3 != null) {
            dVar3.f335132n = f17;
        }
        if (dVar3 == null) {
            return;
        }
        dVar3.f335131m = f18;
    }

    public final void e() {
        ek3.e eVar = this.f354061d;
        if (eVar != null) {
            eVar.setTranslationX(0.0f);
        }
        ek3.e eVar2 = this.f354061d;
        if (eVar2 != null) {
            eVar2.setTranslationY(0.0f);
        }
        ek3.e eVar3 = this.f354061d;
        if (eVar3 != null) {
            eVar3.setScaleX(1.0f);
        }
        ek3.e eVar4 = this.f354061d;
        if (eVar4 == null) {
            return;
        }
        eVar4.setScaleY(1.0f);
    }
}
