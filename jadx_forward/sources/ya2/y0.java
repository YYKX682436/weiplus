package ya2;

/* loaded from: classes2.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f542112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f542113e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(android.content.Context context, android.content.Intent intent) {
        super(0);
        this.f542112d = context;
        this.f542113e = intent;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.ref.WeakReference k17;
        android.content.Context context = this.f542112d;
        android.app.Activity activity = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (activity == null && ((k17 = com.p314xaae8f345.mm.app.w.k()) == null || (activity = (android.app.Activity) k17.get()) == null)) {
            java.lang.ref.WeakReference j17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
            activity = j17 != null ? (android.app.Activity) j17.get() : null;
        }
        ya2.e1 e1Var = ya2.e1.f542005a;
        android.content.Intent intent = this.f542113e;
        if (activity == null || !(activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            ya2.e1.h(e1Var, context, intent, "topActivity is null or not MMActivity");
        } else {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity;
            android.view.Window window = abstractActivityC21394xb3d2c0cf.getWindow();
            android.view.KeyEvent.Callback decorView = window != null ? window.getDecorView() : null;
            android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
            if (viewGroup == null) {
                ya2.e1.h(e1Var, context, intent, "decorView is null");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m3.f183914a.b(abstractActivityC21394xb3d2c0cf, this.f542113e, viewGroup, true, new ya2.x0(new java.lang.ref.WeakReference(activity)));
            }
        }
        return jz5.f0.f384359a;
    }
}
