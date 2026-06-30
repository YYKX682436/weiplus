package s35;

/* loaded from: classes5.dex */
public abstract class b implements s35.a {

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f484374f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f484375g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.LinearLayout f484376h;

    /* renamed from: d, reason: collision with root package name */
    public boolean f484372d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f484373e = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f484377i = false;

    public b(android.content.Context context) {
        this.f484375g = null;
        this.f484375g = new java.lang.ref.WeakReference(context);
        this.f484376h = new android.widget.LinearLayout(context);
    }

    public abstract void a();

    public abstract int b();

    public int c() {
        return 0;
    }

    public void d() {
        k(8);
    }

    public android.view.View e(android.content.Context context, int i17, android.view.ViewGroup viewGroup) {
        if (i17 <= 0) {
            return null;
        }
        return android.view.View.inflate(context, i17, viewGroup);
    }

    public final void f() {
        android.widget.LinearLayout linearLayout;
        if (this.f484377i) {
            return;
        }
        if (this.f484374f == null && (linearLayout = this.f484376h) != null) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) e(linearLayout.getContext(), b(), linearLayout);
            this.f484374f = viewGroup != null ? viewGroup.getChildAt(0) : null;
        }
        h(this.f484374f);
        this.f484377i = true;
    }

    public final boolean g() {
        android.view.View childAt;
        android.view.View view = this.f484374f;
        return (view == null || (childAt = ((android.view.ViewGroup) view).getChildAt(0)) == null || childAt.getVisibility() != 0) ? false : true;
    }

    public abstract void h(android.view.View view);

    public boolean i() {
        android.view.View view = this.f484374f;
        return view != null && view.getVisibility() == 0;
    }

    public void j() {
    }

    public void k(int i17) {
        android.view.View view = this.f484374f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/banner/BaseBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/banner/BaseBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.LinearLayout linearLayout = this.f484376h;
        if (linearLayout != null) {
            linearLayout.setVisibility(i17);
        }
    }
}
