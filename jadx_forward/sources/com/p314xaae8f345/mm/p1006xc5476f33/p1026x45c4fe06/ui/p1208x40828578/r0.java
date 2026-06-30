package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public final class r0 extends android.os.Handler {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f171675b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 f171676a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90) {
        super(android.os.Looper.getMainLooper());
        this.f171676a = c12723x5ab2de90;
    }

    public final void a() {
        removeMessages(1);
        removeMessages(2);
        removeCallbacksAndMessages(null);
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 != 1) {
            if (i17 == 2) {
                ((java.lang.Runnable) message.obj).run();
                return;
            } else {
                super.handleMessage(message);
                return;
            }
        }
        ((java.lang.Runnable) message.obj).run();
        removeMessages(2);
        synchronized (this.f171676a.R) {
            this.f171676a.R.notifyAll();
        }
    }
}
