package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4;

/* loaded from: classes2.dex */
public class l implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.i, com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.p f192976d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.C14161x3a122e13 f192977e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f192978f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f192979g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f192980h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f192981i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f192982m;

    /* renamed from: n, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 f192983n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.Context f192984o;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.p presenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f192976d = presenter;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void a(float f17) {
        float f18 = f17 * 2.5f;
        float f19 = f18 < 0.0f ? 0.0f : f18;
        if (f19 > 1.0f) {
            f19 = 1.0f;
        }
        if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        float f27 = 0.0f < f18 ? f18 : 0.0f;
        android.content.Context context = this.f192984o;
        if (context == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
            throw null;
        }
        int b17 = i65.a.b(context, 16);
        android.content.Context context2 = this.f192984o;
        if (context2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
            throw null;
        }
        int b18 = i65.a.b(context2, 4);
        android.view.View view = this.f192979g;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLine");
            throw null;
        }
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLine");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (b18 + (f27 * (b17 - b18)));
        view.setLayoutParams(layoutParams);
        android.view.View view2 = this.f192981i;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerArrow");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightDrawerBuilder", "onDrawerTranslation", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightDrawerBuilder", "onDrawerTranslation", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void b() {
        this.f192976d.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.C14161x3a122e13 c14161x3a122e13 = this.f192977e;
        if (c14161x3a122e13 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("highlightDrawer");
            throw null;
        }
        c14161x3a122e13.t(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = g().m82555x4905e9fa();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var = this.f192983n;
        if (w2Var != null) {
            m82555x4905e9fa.V0(w2Var);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scrollListener");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void c(boolean z17, boolean z18, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.p pVar = this.f192976d;
        if (!z17 || !z18) {
            if (z17 || !z18) {
                return;
            }
            pVar.getClass();
            return;
        }
        if (this.f192977e == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("highlightDrawer");
            throw null;
        }
        pVar.getClass();
        pVar.f192990d = this;
        g().H(null);
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 g() {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f192982m;
        if (c22801x87cbdc00 != null) {
            return c22801x87cbdc00;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
        throw null;
    }
}
