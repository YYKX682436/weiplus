package uj3;

/* loaded from: classes14.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f509756a;

    /* renamed from: b, reason: collision with root package name */
    public final uj3.b f509757b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f509758c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f509759d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.p1893xe821e364.C16593x8cfa3099 f509760e;

    /* renamed from: f, reason: collision with root package name */
    public xj3.e f509761f;

    /* renamed from: g, reason: collision with root package name */
    public xj3.b f509762g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f509763h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f509764i;

    /* renamed from: j, reason: collision with root package name */
    public uj3.y0 f509765j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.FrameLayout f509766k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f509767l;

    /* renamed from: m, reason: collision with root package name */
    public int f509768m;

    /* renamed from: n, reason: collision with root package name */
    public int f509769n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f509770o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f509771p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f509772q;

    /* renamed from: r, reason: collision with root package name */
    public int f509773r;

    /* renamed from: s, reason: collision with root package name */
    public int f509774s;

    public b1(android.content.Context context, uj3.b statusManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusManager, "statusManager");
        this.f509756a = context;
        this.f509757b = statusManager;
        this.f509758c = new java.util.concurrent.CopyOnWriteArrayList();
        this.f509768m = -1;
        this.f509769n = -1;
        this.f509774s = 3;
    }

    public final void a() {
        android.widget.FrameLayout frameLayout = this.f509766k;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            uj3.y0 y0Var = this.f509765j;
            if (y0Var != null) {
                y0Var.c(this.f509756a, frameLayout);
            }
        }
        uj3.b bVar = this.f509757b;
        if (bVar.e() == 90 || bVar.e() == 270) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f509763h;
            if (c1163xf1deaba4 == null) {
                return;
            }
            c1163xf1deaba4.setVisibility(4);
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f509763h;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.setVisibility(4);
        }
        android.view.View view = this.f509767l;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbUI", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbUI", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void b() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("thumb_current_page", this.f509773r);
        this.f509757b.f(uj3.a.f509737r, bundle);
    }

    public final void c() {
        android.widget.FrameLayout frameLayout = this.f509766k;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            uj3.y0 y0Var = this.f509765j;
            if (y0Var != null) {
                y0Var.c(this.f509756a, frameLayout);
            }
        }
        uj3.y0 y0Var2 = this.f509765j;
        if (y0Var2 != null) {
            y0Var2.d();
        }
        android.widget.FrameLayout frameLayout2 = this.f509766k;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        android.widget.FrameLayout frameLayout3 = this.f509764i;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(0);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f509763h;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.setVisibility(0);
        }
        android.view.View view = this.f509767l;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbUI", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbUI", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        d(this.f509768m);
    }

    public final void d(int i17) {
        if (this.f509763h == null || i17 < 0 || this.f509769n < 0) {
            return;
        }
        uj3.y0 y0Var = this.f509765j;
        if (y0Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(i17 + 1);
            sb6.append('/');
            sb6.append(this.f509769n);
            y0Var.e(sb6.toString());
        }
        xj3.b bVar = this.f509762g;
        if (bVar != null) {
            bVar.f536399i = i17;
            bVar.m8146xced61ae5();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.p1893xe821e364.C16593x8cfa3099 c16593x8cfa3099 = this.f509760e;
        if (c16593x8cfa3099 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f509763h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1163xf1deaba4);
            c16593x8cfa3099.mo7942xd1b4653f(c1163xf1deaba4, new p012xc85e97e9.p103xe821e364.p104xd1075a44.h3(), i17);
        }
    }
}
