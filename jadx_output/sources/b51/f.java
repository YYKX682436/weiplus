package b51;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b51.m f18014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f18015e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b51.m mVar, android.view.View view) {
        super(0);
        this.f18014d = mVar;
        this.f18015e = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f18014d.f18046f) {
            android.view.View view = this.f18015e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pagloader/PagLoader$load$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pagloader/PagLoader$load$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
