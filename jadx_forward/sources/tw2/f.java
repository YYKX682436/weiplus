package tw2;

/* loaded from: classes2.dex */
public final class f extends p012xc85e97e9.p087x9da2e250.app.y1 {

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d f504000i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f504001m;

    /* renamed from: n, reason: collision with root package name */
    public final int f504002n;

    public /* synthetic */ f(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d, java.util.List list, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(abstractC1104xc1ad431d, list, (i18 & 4) != 0 ? 0 : i17);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f504001m.size();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.y1
    /* renamed from: getItem */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7764xfb80e389(int i17) {
        return (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) this.f504001m.get(i17);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.y1, p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup container, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        java.lang.Object mo7744x8d1aed1d = super.mo7744x8d1aed1d(container, i17);
        if (this.f504002n == 1) {
            java.lang.reflect.Field declaredField = p012xc85e97e9.p087x9da2e250.app.y1.class.getDeclaredField("f");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(this);
            p012xc85e97e9.p087x9da2e250.app.i2 i2Var = obj instanceof p012xc85e97e9.p087x9da2e250.app.i2 ? (p012xc85e97e9.p087x9da2e250.app.i2) obj : null;
            if (i2Var != null) {
                i2Var.m((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) mo7744x8d1aed1d, p012xc85e97e9.p093xedfae76a.n.INITIALIZED);
            }
        }
        return mo7744x8d1aed1d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d fm6, java.util.List fragments, int i17) {
        super(fm6, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fm6, "fm");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragments, "fragments");
        this.f504000i = fm6;
        this.f504001m = fragments;
        this.f504002n = i17;
    }
}
