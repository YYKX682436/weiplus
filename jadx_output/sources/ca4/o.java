package ca4;

/* loaded from: classes.dex */
public final class o implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f40002d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f40003e;

    public o(java.lang.Object obj, yz5.l action) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(action, "action");
        this.f40002d = action;
        this.f40003e = new java.lang.ref.WeakReference(obj);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.data.SafeDialogDismissListener");
        this.f40002d.invoke(this.f40003e.get());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.data.SafeDialogDismissListener");
    }
}
