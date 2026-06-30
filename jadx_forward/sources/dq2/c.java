package dq2;

/* loaded from: classes2.dex */
public class c extends p012xc85e97e9.p087x9da2e250.app.y1 {

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f323895i;

    /* renamed from: m, reason: collision with root package name */
    public final int f323896m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d fm6, java.util.List fragments, int i17) {
        super(fm6, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fm6, "fm");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragments, "fragments");
        this.f323895i = fragments;
        this.f323896m = i17;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.y1
    public long a(int i17) {
        return java.lang.System.identityHashCode(this.f323895i.get(i17));
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f323895i.size();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.y1
    /* renamed from: getItem */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7764xfb80e389(int i17) {
        return (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) this.f323895i.get(i17);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.y1, p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup container, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        java.lang.Object mo7744x8d1aed1d = super.mo7744x8d1aed1d(container, i17);
        if (this.f323896m == 1) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                java.lang.reflect.Field declaredField = p012xc85e97e9.p087x9da2e250.app.y1.class.getDeclaredField("f");
                declaredField.setAccessible(true);
                java.lang.reflect.Field declaredField2 = p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.class.getDeclaredField("mState");
                declaredField2.setAccessible(true);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(declaredField2.get(mo7744x8d1aed1d), -1)) {
                    java.lang.Object obj = declaredField.get(this);
                    p012xc85e97e9.p087x9da2e250.app.i2 i2Var = obj instanceof p012xc85e97e9.p087x9da2e250.app.i2 ? (p012xc85e97e9.p087x9da2e250.app.i2) obj : null;
                    if (i2Var != null) {
                        i2Var.m((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) mo7744x8d1aed1d, p012xc85e97e9.p093xedfae76a.n.INITIALIZED);
                    }
                }
            } catch (java.lang.Throwable th6) {
                pm0.z.b(xy2.b.f539688b, "squareTabInflateError", false, null, null, false, false, new dq2.b(th6), 60, null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveSquareFragmentPagerAdapter", "instantiateItem fragment cost =  " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ' ');
        }
        return mo7744x8d1aed1d;
    }
}
