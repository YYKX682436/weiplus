package bk5;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f21668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f21669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f21670f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kotlin.jvm.internal.h0 h0Var, java.lang.CharSequence charSequence, int i17) {
        super(0);
        this.f21668d = h0Var;
        this.f21669e = charSequence;
        this.f21670f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity activity;
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
            java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
            activity = j17 != null ? (android.app.Activity) j17.get() : null;
        }
        kotlin.jvm.internal.h0 h0Var = this.f21668d;
        h0Var.f310123d = activity;
        if (activity == null) {
            h0Var.f310123d = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        com.tencent.mars.xlog.Log.i("WeToastStarter", "snackBarMsgReceiver1 msgReceiver topActivity:%s", h0Var.f310123d);
        android.content.Context context = (android.content.Context) h0Var.f310123d;
        int i17 = com.tencent.mm.ui.toast.WeToastStarter$snackBarMsgReceiver$1.f209958a;
        if (context != null) {
            int i18 = al5.u4.f6058t;
            al5.t4 t4Var = new al5.t4(context);
            t4Var.f6042e = this.f21669e;
            t4Var.e(this.f21670f);
            t4Var.g();
        }
        return jz5.f0.f302826a;
    }
}
