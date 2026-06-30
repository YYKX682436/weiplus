package fr2;

/* loaded from: classes2.dex */
public final class s implements com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f347286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f347287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fr2.x f347288c;

    public s(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var2, fr2.x xVar) {
        this.f347286a = e0Var;
        this.f347287b = e0Var2;
        this.f347288c = xVar;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.e
    public final void a(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c, int i17) {
        if (c2678xa407981c != null) {
            int height = c2678xa407981c.getHeight();
            float f17 = height * 1;
            p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f347286a;
            e0Var.f391648d = f17 / 3.0f;
            p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var2 = this.f347287b;
            e0Var2.f391648d = f17 / 6.0f;
            int height2 = c2678xa407981c.getHeight() + i17;
            float f18 = e0Var.f391648d;
            fr2.x xVar = this.f347288c;
            float O6 = fr2.x.O6(xVar, height2, f18);
            float O62 = fr2.x.O6(xVar, height2, e0Var2.f391648d);
            android.view.View findViewById = xVar.m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.nv_);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(O62));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeActionBarUIC", "updateTabListBackground", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeActionBarUIC", "updateTabListBackground", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            android.widget.ImageView imageView = xVar.f347300h;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerBgView");
                throw null;
            }
            imageView.setAlpha(O6);
            android.widget.TextView textView = xVar.f347301i;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerTitleTextView");
                throw null;
            }
            textView.setAlpha(O6);
            android.widget.ImageView imageView2 = xVar.f347298f;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("themeHeaderBgView");
                throw null;
            }
            imageView2.setAlpha((1.0f - O6) * 0.5f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "onOffsetChanged: " + height2 + " mainAlpha: " + O6 + " tabListAlpha: " + O62 + " initHeaderHeight: " + height + " mainOffestHeight: " + e0Var.f391648d + " tabListOffestHeight: " + e0Var2.f391648d);
        }
    }
}
