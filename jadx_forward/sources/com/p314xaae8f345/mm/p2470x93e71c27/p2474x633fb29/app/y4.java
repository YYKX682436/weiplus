package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes12.dex */
public class y4 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z4 f270692a;

    public y4(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z4 z4Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.x4 x4Var) {
        this.f270692a = z4Var;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        if (message.what == 1) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z4 z4Var = this.f270692a;
            if (z4Var.f270723n && z4Var.f270720h.f68112x10a0fed7 != 105 && ((d73.i) i95.n0.c(d73.i.class)).Wa(z4Var.f270719g, z4Var.f270721i)) {
                sendMessageDelayed(android.os.Message.obtain(this, 1, z4Var.f270719g), 5000L);
            }
        }
    }
}
