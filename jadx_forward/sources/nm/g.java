package nm;

/* loaded from: classes12.dex */
public final class g extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nm.i f419966a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(nm.i iVar) {
        super(android.os.Looper.getMainLooper());
        this.f419966a = iVar;
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FirstScreenArrangement2", "[+] PendingActionScheduler.schedulePendingActions called.");
        sendMessageAtFrontOfQueue(android.os.Message.obtain(this.f419966a.f419971b, 2));
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FirstScreenArrangement2", "[!] Watchdog barked.");
            removeMessages(1);
            removeMessages(2);
            sendEmptyMessage(2);
            return;
        }
        if (i17 != 2) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FirstScreenArrangement2", "[+] Pending actions scheduled.");
        removeMessages(1);
        removeMessages(2);
        synchronized (this.f419966a.f419973d) {
            if (this.f419966a.f419975f) {
                return;
            }
            this.f419966a.f419975f = true;
            ((ku5.t0) ku5.t0.f394148d).g(new nm.f(this));
        }
    }
}
