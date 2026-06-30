package hx2;

/* loaded from: classes2.dex */
public final class b extends hx2.i {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f367173b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f367174c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f367175d;

    public b(android.content.Context context, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f367173b = context;
        this.f367174c = z17;
    }

    @Override // hx2.i
    public android.view.View a() {
        if (this.f367175d == null) {
            android.view.View view = new android.view.View(this.f367173b);
            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            view.setBackgroundColor(view.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "getView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "getView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setOnClickListener(new hx2.a(this));
            this.f367175d = view;
        }
        return this.f367175d;
    }

    @Override // hx2.i
    public void g(gx2.q layout, float f17, java.lang.String source) {
        android.view.View view;
        android.view.View view2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.g(layout, f17, source);
        android.view.View view3 = this.f367175d;
        if (view3 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        float m62620x5b051b9d = layout.m62623x5e903915() ? layout.m62620x5b051b9d() : layout.m62616x9c78005c();
        float m62615x4ea7bf6 = layout.m62615x4ea7bf6();
        float f18 = (m62615x4ea7bf6 - f17) / (m62615x4ea7bf6 - m62620x5b051b9d);
        if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        if (0.0f >= f18) {
            f18 = 0.0f;
        }
        android.view.View view4 = this.f367175d;
        if (view4 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(f18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if ((f18 == 0.0f) && (view2 = this.f367175d) != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (!(((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Y9).mo141623x754a37bb()).r()).intValue() == 1) || this.f367174c || (view = this.f367175d) == null) {
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
        arrayList4.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public /* synthetic */ b(android.content.Context context, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i17 & 2) != 0 ? false : z17);
    }
}
