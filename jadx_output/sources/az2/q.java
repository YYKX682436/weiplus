package az2;

/* loaded from: classes3.dex */
public final class q extends az2.s {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f16148b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f16149c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f16150d;

    public q() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490604zq);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f16149c = string;
    }

    @Override // az2.s
    public void a() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f16148b;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }

    @Override // az2.s
    public void b() {
        android.content.Context context;
        java.lang.ref.WeakReference weakReference = this.f16152a;
        if (weakReference == null || (context = (android.content.Context) weakReference.get()) == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        java.lang.String str = this.f16149c;
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f16150d;
        this.f16148b = com.tencent.mm.ui.widget.dialog.u3.f(context, str, onCancelListener != null, 0, onCancelListener);
    }
}
