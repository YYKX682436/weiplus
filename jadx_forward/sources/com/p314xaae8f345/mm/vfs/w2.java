package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class w2 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f294756a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f294757b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.CancellationSignal f294758c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.b3 f294759d;

    public w2(com.p314xaae8f345.mm.vfs.b3 b3Var, com.p314xaae8f345.mm.vfs.r2 r2Var) {
        this.f294759d = b3Var;
    }

    public final void a() {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("VFS.FileSystemManager", "Idle status changed: charging = " + this.f294756a + ", interactive = " + this.f294757b);
        boolean z17 = this.f294756a;
        if (!z17 || this.f294757b || this.f294758c != null) {
            if ((!z17 || this.f294757b) && this.f294758c != null) {
                this.f294759d.f294359t.removeMessages(2);
                this.f294758c.cancel();
                this.f294758c = null;
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("VFS.FileSystemManager", "Exit idle state, maintenance cancelled.");
                return;
            }
            return;
        }
        long j17 = this.f294759d.f294361v;
        if (j17 < 0) {
            return;
        }
        android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
        this.f294758c = cancellationSignal;
        android.os.Handler handler = this.f294759d.f294359t;
        handler.sendMessageDelayed(android.os.Message.obtain(handler, 2, cancellationSignal), j17);
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("VFS.FileSystemManager", "System idle, trigger maintenance timer for " + (j17 / 1000) + " seconds.");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (action == null) {
            return;
        }
        char c17 = 65535;
        switch (action.hashCode()) {
            case -2128145023:
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    c17 = 1;
                    break;
                }
                break;
            case -1454123155:
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    c17 = 2;
                    break;
                }
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    c17 = 3;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                this.f294757b = false;
                break;
            case 1:
                this.f294756a = false;
                break;
            case 2:
                this.f294757b = true;
                break;
            case 3:
                this.f294756a = true;
                break;
        }
        a();
    }
}
