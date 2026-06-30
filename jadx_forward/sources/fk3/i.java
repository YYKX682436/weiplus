package fk3;

/* loaded from: classes8.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk3.o f345093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f345094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.Interpolator f345095f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(fk3.o oVar, android.view.ViewGroup viewGroup, android.view.animation.Interpolator interpolator) {
        super(0);
        this.f345093d = oVar;
        this.f345094e = viewGroup;
        this.f345095f = interpolator;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        fk3.o oVar = this.f345093d;
        fk3.f fVar = new fk3.f(oVar);
        android.view.animation.Interpolator interpolator = this.f345095f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(interpolator, "$interpolator");
        android.view.ViewGroup forParent = this.f345094e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forParent, "forParent");
        android.content.Context context = forParent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ek3.d dVar = new ek3.d(context, forParent, fVar, interpolator, null);
        oVar.f345120c = dVar;
        dVar.f335134p = 1;
        android.app.Activity mo2157x19263085 = oVar.c().mo2157x19263085();
        float g17 = (mo2157x19263085 == null || (resources = mo2157x19263085.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? i65.a.g(oVar.c().mo2157x19263085()) : displayMetrics.density;
        float f17 = 100 * g17;
        float f18 = 300 * g17;
        ek3.d dVar2 = oVar.f345120c;
        if (dVar2 != null) {
            dVar2.f335132n = f17;
        }
        if (dVar2 != null) {
            dVar2.f335131m = f18;
        }
        return jz5.f0.f384359a;
    }
}
