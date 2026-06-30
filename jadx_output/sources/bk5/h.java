package bk5;

/* loaded from: classes10.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final android.content.BroadcastReceiver f21671a = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.ui.toast.WeToastStarter$msgReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            android.app.Activity activity;
            if (intent != null) {
                java.lang.CharSequence charSequenceExtra = intent.getCharSequenceExtra("toast_text");
                java.lang.Integer valueOf = java.lang.Integer.valueOf(intent.getIntExtra("toast_icon", 0));
                if (com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE.isForeground()) {
                    kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                    java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
                    if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
                        java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
                        activity = j17 != null ? (android.app.Activity) j17.get() : null;
                    }
                    h0Var.f310123d = activity;
                    if (activity != null && (activity instanceof android.app.Activity) && activity.isFinishing()) {
                        if (intent.getBooleanExtra("toast_ignore", false)) {
                            com.tencent.mars.xlog.Log.i("WeToastStarter", "msgReceiver ignoreFinishing!!");
                            return;
                        } else {
                            com.tencent.mars.xlog.Log.i("WeToastStarter", "topActivity is finishing!!");
                            pm0.v.V(100L, new bk5.f(h0Var, valueOf, charSequenceExtra));
                            return;
                        }
                    }
                    if (h0Var.f310123d == null) {
                        h0Var.f310123d = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    }
                    com.tencent.mars.xlog.Log.i("WeToastStarter", "msgReceiver topActivity:%s", h0Var.f310123d);
                    if (valueOf.intValue() > 0 && charSequenceExtra != null) {
                        android.content.Context context2 = (android.content.Context) h0Var.f310123d;
                        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context2);
                        e4Var.f211776c = charSequenceExtra;
                        e4Var.b(valueOf.intValue());
                        e4Var.c();
                        return;
                    }
                    if (charSequenceExtra != null) {
                        android.content.Context context3 = (android.content.Context) h0Var.f310123d;
                        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                        com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context3);
                        e4Var2.f211776c = charSequenceExtra;
                        e4Var2.c();
                    }
                }
            }
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final android.content.BroadcastReceiver f21672b = new com.tencent.mm.ui.toast.WeToastStarter$snackBarMsgReceiver$1();

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.ui.toast.ForwardSnackBarReceiver f21673c = new com.tencent.mm.ui.toast.ForwardSnackBarReceiver();
}
