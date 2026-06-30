package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes15.dex */
public class x5 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.z5 f91719a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(com.tencent.mm.plugin.appbrand.widget.input.z5 z5Var, android.os.Looper looper) {
        super(looper);
        this.f91719a = z5Var;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        boolean z17 = true;
        if (i17 == 1 || i17 == 2) {
            com.tencent.mm.plugin.appbrand.widget.input.z5 z5Var = this.f91719a;
            if (z5Var.f91739b) {
                z17 = false;
            } else {
                z5Var.f91740c.b();
            }
            if (z17) {
                sendMessageDelayed(android.os.Message.obtain(z5Var.f91738a, 2), 50L);
            }
        }
    }
}
