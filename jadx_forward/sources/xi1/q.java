package xi1;

/* loaded from: classes7.dex */
public abstract class q implements xi1.g {

    /* renamed from: d, reason: collision with root package name */
    public final xi1.g f536246d;

    /* renamed from: e, reason: collision with root package name */
    public final xi1.s f536247e;

    public q(xi1.g base, xi1.s windowViewImplScope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(base, "base");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowViewImplScope, "windowViewImplScope");
        this.f536246d = base;
        this.f536247e = windowViewImplScope;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        xi1.g other = (xi1.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (!(other instanceof xi1.q)) {
            return -1;
        }
        xi1.q qVar = (xi1.q) other;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar.f536247e, this.f536247e)) {
            return this.f536246d.compareTo(qVar.f536246d);
        }
        return -1;
    }

    @Override // xi1.g, xi1.s
    /* renamed from: createFullscreenHandler */
    public xi1.m mo51609xe80d1173(xi1.k kVar) {
        xi1.m mo51609xe80d1173 = this.f536247e.mo51609xe80d1173(kVar);
        if (mo51609xe80d1173 != null) {
            return mo51609xe80d1173;
        }
        xi1.m mo51609xe80d11732 = this.f536246d.mo51609xe80d1173(kVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo51609xe80d11732, "createFullscreenHandler(...)");
        return mo51609xe80d11732;
    }

    @Override // xi1.s
    /* renamed from: forceLightMode */
    public boolean mo52324x6c02152e() {
        return this.f536247e.mo52324x6c02152e();
    }

    @Override // xi1.g
    /* renamed from: getContext */
    public android.content.Context mo52325x76847179() {
        android.content.Context mo52325x76847179 = this.f536246d.mo52325x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo52325x76847179, "getContext(...)");
        return mo52325x76847179;
    }

    @Override // xi1.g
    /* renamed from: getNavigationBar */
    public xi1.e mo51611xad2f8da9() {
        return this.f536246d.mo51611xad2f8da9();
    }

    @Override // xi1.g, xi1.s
    /* renamed from: getOrientationHandler */
    public xi1.p mo51612x60543150() {
        xi1.p mo51612x60543150 = this.f536247e.mo51612x60543150();
        if (mo51612x60543150 != null) {
            return mo51612x60543150;
        }
        xi1.p mo51612x605431502 = this.f536246d.mo51612x60543150();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo51612x605431502, "getOrientationHandler(...)");
        return mo51612x605431502;
    }

    @Override // xi1.g
    /* renamed from: getSafeAreaInsets */
    public android.graphics.Rect mo51613x2ae93e46() {
        return this.f536246d.mo51613x2ae93e46();
    }

    @Override // xi1.s
    /* renamed from: getScale */
    public float mo51614x7520af94() {
        return this.f536247e.mo51614x7520af94();
    }

    @Override // xi1.s
    /* renamed from: getStatusBar */
    public xi1.f mo51615x8408480b() {
        return this.f536247e.mo51615x8408480b();
    }

    @Override // xi1.g, xi1.s
    /* renamed from: getVDisplayMetrics */
    public android.util.DisplayMetrics mo48807xad90d981() {
        android.util.DisplayMetrics mo48807xad90d981 = this.f536247e.mo48807xad90d981();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48807xad90d981, "getVDisplayMetrics(...)");
        return mo48807xad90d981;
    }

    @Override // xi1.g
    /* renamed from: isInMultiWindowMode */
    public boolean mo51617xea4a57dd() {
        return this.f536246d.mo51617xea4a57dd();
    }

    @Override // xi1.s
    /* renamed from: isLargeScreenWindow */
    public boolean mo51618xbcb3824d() {
        return this.f536247e.mo51618xbcb3824d();
    }

    @Override // xi1.g
    public boolean q5() {
        return this.f536246d.q5();
    }

    @Override // xi1.g, xi1.s
    /* renamed from: setSoftOrientation */
    public void mo51619xfa43b684(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f536247e.mo51619xfa43b684(name);
    }

    @Override // xi1.g
    /* renamed from: setWindowDescription */
    public void mo48810x4820daa(xi1.d description) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(description, "description");
        this.f536246d.mo48810x4820daa(description);
    }

    @Override // xi1.g, xi1.s
    /* renamed from: shouldInLargeScreenCompatMode */
    public boolean mo51620x1ab1e3d4() {
        return this.f536247e.mo51620x1ab1e3d4();
    }
}
