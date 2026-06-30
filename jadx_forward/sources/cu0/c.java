package cu0;

/* loaded from: classes5.dex */
public final class c extends vu3.c {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f303841b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f303842c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f303843d;

    public c(android.content.Context context, yz5.l ignoreBackgroundTouchEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
        this.f303841b = context;
        this.f303842c = ignoreBackgroundTouchEvent;
    }

    @Override // vu3.c
    public android.view.View a() {
        if (this.f303843d == null) {
            cu0.a aVar = new cu0.a(this, this.f303841b);
            this.f303843d = aVar;
            aVar.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(aVar, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/common/music/ComposingBackgroundComponent", "getView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            aVar.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(aVar, "com/tencent/mm/mj_publisher/finder/common/music/ComposingBackgroundComponent", "getView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            aVar.setOnClickListener(new cu0.b(this));
        }
        return this.f303843d;
    }

    @Override // vu3.c
    public void f(uu3.u layout, float f17, java.lang.String source) {
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.f(layout, f17, source);
        android.view.View view2 = this.f303843d;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/common/music/ComposingBackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/drawer/MMCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/common/music/ComposingBackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/drawer/MMCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        float m68107x5b051b9d = layout.m68110x5e903915() ? layout.m68107x5b051b9d() : layout.m68103x9c78005c();
        float m68102x4ea7bf6 = layout.m68102x4ea7bf6();
        float f18 = (m68102x4ea7bf6 - f17) / (m68102x4ea7bf6 - m68107x5b051b9d);
        if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        if (0.0f >= f18) {
            f18 = 0.0f;
        }
        android.view.View view3 = this.f303843d;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(f18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/common/music/ComposingBackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/drawer/MMCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/common/music/ComposingBackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/drawer/MMCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (!(f18 == 0.0f) || (view = this.f303843d) == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/common/music/ComposingBackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/drawer/MMCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/common/music/ComposingBackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/recordvideo/ui/drawer/MMCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
