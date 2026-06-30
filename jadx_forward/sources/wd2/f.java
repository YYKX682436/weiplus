package wd2;

/* loaded from: classes3.dex */
public final class f extends y9.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wd2.g f526363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f526364b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f526365c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f526366d;

    public f(wd2.g gVar, float f17, float f18, float f19) {
        this.f526363a = gVar;
        this.f526364b = f17;
        this.f526365c = f18;
        this.f526366d = f19;
    }

    @Override // y9.c
    public void a(android.view.View view, float f17) {
        float f18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        boolean isNaN = java.lang.Float.isNaN(f17);
        wd2.g gVar = this.f526363a;
        float f19 = 0.0f;
        if (isNaN) {
            f18 = 0.0f;
        } else {
            boolean a17 = gVar.a();
            float height = view.getHeight();
            float max = java.lang.Math.max(java.lang.Math.min(java.lang.Math.abs(a17 ? height * (1.0f - java.lang.Math.abs(f17)) : height * f17) / this.f526364b, 1.0f), 0.0f);
            f19 = max;
            f18 = java.lang.Math.max(java.lang.Math.min((max - 0.5f) * 2.0f, 1.0f), 0.0f);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBottomSheet", "onSlide " + f17 + ", percent:" + f19 + ", arrowPercent:" + f18);
        android.view.ViewGroup.LayoutParams layoutParams = gVar.f526382p.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(layoutParams, "getLayoutParams(...)");
        float f27 = this.f526366d;
        float f28 = this.f526365c;
        layoutParams.height = (int) (f28 + (f19 * (f27 - f28)));
        gVar.f526382p.setLayoutParams(layoutParams);
        android.view.View view2 = gVar.f526383q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet$enableScrollHeaderLine$1", "onSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet$enableScrollHeaderLine$1", "onSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // y9.c
    public void b(android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStateChanged ");
        sb6.append(i17);
        sb6.append(", isShowing:");
        wd2.g gVar = this.f526363a;
        sb6.append(gVar.f526369c.f());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBottomSheet", sb6.toString());
        if (i17 == 5 && gVar.f526369c.f()) {
            gVar.f526369c.q();
        }
        if (i17 == 4 && gVar.a() && gVar.f526369c.f()) {
            gVar.f526369c.q();
        }
    }
}
