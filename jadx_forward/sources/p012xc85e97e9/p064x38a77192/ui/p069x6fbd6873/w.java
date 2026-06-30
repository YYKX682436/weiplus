package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes5.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 f92311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988) {
        super(1);
        this.f92311d = c1059xa8272988;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        final yz5.a command = (yz5.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(command, "command");
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988 = this.f92311d;
        android.os.Handler handler = c1059xa8272988.getHandler();
        if ((handler != null ? handler.getLooper() : null) == android.os.Looper.myLooper()) {
            command.mo152xb9724478();
        } else {
            android.os.Handler handler2 = c1059xa8272988.getHandler();
            if (handler2 != null) {
                handler2.post(new java.lang.Runnable() { // from class: androidx.compose.ui.platform.w$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        yz5.a tmp0 = yz5.a.this;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tmp0, "$tmp0");
                        tmp0.mo152xb9724478();
                    }
                });
            }
        }
        return jz5.f0.f384359a;
    }
}
