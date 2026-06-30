package bp4;

/* loaded from: classes5.dex */
public final class x2 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f104956f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f104957g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f104958h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(android.view.ViewGroup parent, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f104956f = parent.findViewById(com.p314xaae8f345.mm.R.id.kdc);
        android.view.View findViewById = parent.findViewById(com.p314xaae8f345.mm.R.id.p4d);
        this.f104957g = findViewById;
        this.f104958h = findViewById;
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        android.view.View view = this.f104958h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/NormalModeContainerPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/NormalModeContainerPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void z() {
        android.view.View view = this.f104956f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/NormalModeContainerPlugin", "setupVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/NormalModeContainerPlugin", "setupVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f104958h = this.f104957g;
    }
}
