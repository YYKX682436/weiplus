package bk5;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f21665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f21666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f21667f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kotlin.jvm.internal.h0 h0Var, java.lang.Integer num, java.lang.CharSequence charSequence) {
        super(0);
        this.f21665d = h0Var;
        this.f21666e = num;
        this.f21667f = charSequence;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity activity;
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
            java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
            activity = j17 != null ? (android.app.Activity) j17.get() : null;
        }
        kotlin.jvm.internal.h0 h0Var = this.f21665d;
        h0Var.f310123d = activity;
        if (activity == null) {
            h0Var.f310123d = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        com.tencent.mars.xlog.Log.i("WeToastStarter", "msgReceiver topActivity:%s", h0Var.f310123d);
        java.lang.Integer num = this.f21666e;
        kotlin.jvm.internal.o.d(num);
        int intValue = num.intValue();
        java.lang.CharSequence charSequence = this.f21667f;
        if (intValue > 0 && charSequence != null) {
            android.content.Context context = (android.content.Context) h0Var.f310123d;
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = charSequence;
            e4Var.b(num.intValue());
            e4Var.c();
        } else if (charSequence != null) {
            android.content.Context context2 = (android.content.Context) h0Var.f310123d;
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
            e4Var2.f211776c = charSequence;
            e4Var2.c();
        }
        return jz5.f0.f302826a;
    }
}
