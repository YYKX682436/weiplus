package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes15.dex */
public class x5 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.z5 f173252a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.z5 z5Var, android.os.Looper looper) {
        super(looper);
        this.f173252a = z5Var;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        boolean z17 = true;
        if (i17 == 1 || i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.z5 z5Var = this.f173252a;
            if (z5Var.f173272b) {
                z17 = false;
            } else {
                z5Var.f173273c.b();
            }
            if (z17) {
                sendMessageDelayed(android.os.Message.obtain(z5Var.f173271a, 2), 50L);
            }
        }
    }
}
