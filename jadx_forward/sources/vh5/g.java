package vh5;

/* loaded from: classes3.dex */
public final class g implements mg3.e, mf3.o {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f518742d;

    /* renamed from: e, reason: collision with root package name */
    public final mf3.n f518743e;

    /* renamed from: f, reason: collision with root package name */
    public final lf3.j f518744f;

    /* renamed from: g, reason: collision with root package name */
    public mf3.s f518745g;

    /* renamed from: h, reason: collision with root package name */
    public float f518746h;

    /* renamed from: i, reason: collision with root package name */
    public int f518747i;

    /* renamed from: m, reason: collision with root package name */
    public int f518748m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f518749n;

    public g(android.view.View content, mf3.n layer, lf3.j jVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layer, "layer");
        this.f518742d = content;
        this.f518743e = layer;
        this.f518744f = jVar;
        this.f518749n = jz5.h.b(new vh5.f(this));
    }

    @Override // mg3.e
    public void a(float f17, float f18) {
        int i17;
        int i18 = this.f518748m;
        android.view.View view = this.f518742d;
        if (i18 == 0 || this.f518747i == 0) {
            this.f518748m = view.getHeight();
            this.f518747i = view.getWidth();
        }
        if (this.f518747i == 0 || (i17 = this.f518748m) == 0) {
            return;
        }
        float f19 = 1;
        float f27 = f19 - (f18 / i17);
        if (f27 > 1.0f) {
            f27 = 1.0f;
        }
        lf3.j jVar = this.f518744f;
        vh5.e eVar = jVar instanceof vh5.e ? (vh5.e) jVar : null;
        if (eVar != null) {
            eVar.f518738f = f27;
            eVar.f518739g = f17;
            eVar.f518740h = f18;
        }
        view.setPivotX(r3 / 2);
        view.setPivotY(this.f518748m / 2);
        view.setScaleX(f27);
        view.setScaleY(f27);
        view.setTranslationX(f17);
        view.setTranslationY(f18);
        if (jVar != null) {
            jVar.d3(f27);
        }
        this.f518746h = f27;
        this.f518743e.d(f19 - f27);
        android.view.View view2 = (android.view.View) ((jz5.n) this.f518749n).mo141623x754a37bb();
        if (view2 != null) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(f27 < 1.0f);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/media/chat/legacy/ChatVirtualPageHandler", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/media/chat/legacy/ChatVirtualPageHandler", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view2, "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (((android.view.View) pm0.v.E(valueOf, view2)) == null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(java.lang.Integer.valueOf(intValue2));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/ui/media/chat/legacy/ChatVirtualPageHandler", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/media/chat/legacy/ChatVirtualPageHandler", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(view2, "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // mg3.e
    public void d() {
        float f17 = this.f518746h;
        android.view.View view = this.f518742d;
        if (f17 >= 1.0f) {
            view.setPivotX(this.f518747i / 2);
            view.setPivotY(this.f518748m / 2);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            this.f518746h = 0.0f;
            return;
        }
        android.view.View view2 = (android.view.View) ((jz5.n) this.f518749n).mo141623x754a37bb();
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/media/chat/legacy/ChatVirtualPageHandler", "exit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/media/chat/legacy/ChatVirtualPageHandler", "exit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view2, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        lf3.j jVar = this.f518744f;
        if (jVar != null) {
            jVar.E2(view);
        }
    }

    @Override // mg3.e
    public boolean f(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return this.f518743e.n(event);
    }

    @Override // mg3.e
    public boolean g(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return false;
    }

    @Override // mf3.o
    public void j() {
        d();
    }
}
