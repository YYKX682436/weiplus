package hw2;

/* loaded from: classes5.dex */
public final class b0 implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f367036d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f367037e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f367038f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f367039g;

    public b0(android.view.View view, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f367036d = view;
        this.f367037e = status;
        this.f367038f = view.getContext();
        this.f367039g = jz5.h.b(new hw2.a0(this));
        view.setOnClickListener(this);
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/plugin/FinderSubRecordDeletePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ju3.d0.k(this.f367037e, ju3.c0.f383426p, null, 2, null);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0) ((jz5.n) this.f367039g).mo141623x754a37bb()).show();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/plugin/FinderSubRecordDeletePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        android.view.View view = this.f367036d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/plugin/FinderSubRecordDeletePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/video/plugin/FinderSubRecordDeletePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
