package com.p314xaae8f345.mm.ui;

/* loaded from: classes12.dex */
public class bf extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.cf f279415a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(com.p314xaae8f345.mm.ui.cf cfVar, android.os.Looper looper) {
        super(looper);
        this.f279415a = cfVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        super.handleMessage(message);
        if (message.what == 255) {
            this.f279415a.b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MainThreadSyncBarrier", "Remove sync barrier from a protection timer. Unexpected.");
        }
    }
}
