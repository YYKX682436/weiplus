package ix3;

/* loaded from: classes10.dex */
public final class g implements android.util.Printer {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.i f376951d;

    public g(ix3.i iVar) {
        this.f376951d = iVar;
    }

    @Override // android.util.Printer
    public final void println(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        boolean y17 = r26.i0.y(str, ">>>", false);
        ix3.i iVar = this.f376951d;
        if (!y17) {
            if (!r26.i0.y(str, "<<<", false) || (n3Var = iVar.f376971b) == null) {
                return;
            }
            n3Var.mo50300x3fa464aa(iVar.f376973d);
            return;
        }
        if (iVar.f376970a == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("RepairerBlockMonitorThread");
            handlerThread.start();
            iVar.f376971b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(handlerThread.getLooper());
            iVar.f376970a = handlerThread;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = iVar.f376971b;
        if (n3Var2 != null) {
            n3Var2.mo50300x3fa464aa(iVar.f376973d);
        }
        iVar.f376973d = new ix3.h(iVar);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        iVar.f376974e = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var3 = iVar.f376971b;
        if (n3Var3 != null) {
            n3Var3.mo50295x41bd0e60(iVar.f376973d, android.os.SystemClock.uptimeMillis() + iVar.f376976g);
        }
    }
}
