package vg2;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f518016a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f518017b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f518018c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f518019d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f518020e;

    public c(android.content.Context context, android.view.ViewGroup parentRoot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentRoot, "parentRoot");
        this.f518016a = context;
        this.f518017b = parentRoot;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(a(), (android.view.ViewGroup) null);
        this.f518018c = inflate;
        this.f518019d = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a4f);
        this.f518020e = "";
    }

    public abstract int a();

    public int b() {
        return i65.a.b(this.f518016a, 4);
    }

    public final void c() {
        android.view.View view = this.f518018c;
        if (view.getVisibility() == 0) {
            android.view.View view2 = this.f518018c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/BaseGiftWidget", "hideWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/gift/widget/BaseGiftWidget", "hideWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f518017b.removeView(view);
        }
    }

    public void d(android.view.ViewGroup attachView, java.lang.String giftId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attachView, "attachView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
        this.f518020e = giftId;
        android.view.View view = this.f518018c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/BaseGiftWidget", "showWidget", "(Landroid/view/ViewGroup;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/gift/widget/BaseGiftWidget", "showWidget", "(Landroid/view/ViewGroup;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f518018c;
        view2.getViewTreeObserver().addOnPreDrawListener(new vg2.b(this, attachView));
        android.view.ViewGroup viewGroup = this.f518017b;
        viewGroup.removeView(view2);
        viewGroup.addView(view2);
    }
}
