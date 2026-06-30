package bp4;

/* loaded from: classes5.dex */
public final class x2 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f23423f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f23424g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f23425h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(android.view.ViewGroup parent, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f23423f = parent.findViewById(com.tencent.mm.R.id.kdc);
        android.view.View findViewById = parent.findViewById(com.tencent.mm.R.id.p4d);
        this.f23424g = findViewById;
        this.f23425h = findViewById;
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        android.view.View view = this.f23425h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/NormalModeContainerPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/NormalModeContainerPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void z() {
        android.view.View view = this.f23423f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/NormalModeContainerPlugin", "setupVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/NormalModeContainerPlugin", "setupVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f23425h = this.f23424g;
    }
}
