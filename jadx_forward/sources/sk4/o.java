package sk4;

/* loaded from: classes15.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sk4.p f490521d;

    public o(sk4.p pVar) {
        this.f490521d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioRecorderImpl", "stop");
        sk4.p pVar = this.f490521d;
        if (pVar.f490527i) {
            tl.w wVar = pVar.f490532q;
            if (!((wVar == null || wVar.l()) ? false : true)) {
                pVar.f490527i = false;
                pVar.f490531p.b(new byte[2], 2);
                pVar.f490532q = null;
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AudioRecorderImpl", "not isRunning or MMPcmRecorder stop error");
    }
}
