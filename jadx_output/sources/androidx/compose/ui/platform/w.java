package androidx.compose.ui.platform;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.AndroidComposeView f10778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.compose.ui.platform.AndroidComposeView androidComposeView) {
        super(1);
        this.f10778d = androidComposeView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        final yz5.a command = (yz5.a) obj;
        kotlin.jvm.internal.o.g(command, "command");
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f10778d;
        android.os.Handler handler = androidComposeView.getHandler();
        if ((handler != null ? handler.getLooper() : null) == android.os.Looper.myLooper()) {
            command.invoke();
        } else {
            android.os.Handler handler2 = androidComposeView.getHandler();
            if (handler2 != null) {
                handler2.post(new java.lang.Runnable() { // from class: androidx.compose.ui.platform.w$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        yz5.a tmp0 = yz5.a.this;
                        kotlin.jvm.internal.o.g(tmp0, "$tmp0");
                        tmp0.invoke();
                    }
                });
            }
        }
        return jz5.f0.f302826a;
    }
}
