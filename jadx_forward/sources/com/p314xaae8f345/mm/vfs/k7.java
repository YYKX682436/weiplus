package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class k7 implements com.p314xaae8f345.mm.vfs.x2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f294568a;

    public k7(java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        this.f294568a = atomicBoolean;
    }

    @Override // com.p314xaae8f345.mm.vfs.x2
    public void a(android.os.CancellationSignal cancellationSignal) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.VFSApplier", "onMaintenanceBegin");
        this.f294568a.set(true);
    }

    @Override // com.p314xaae8f345.mm.vfs.x2
    public boolean b(java.lang.String str, com.p314xaae8f345.mm.vfs.q2 q2Var, android.os.CancellationSignal cancellationSignal) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.vfs.x2
    public void c(boolean z17, boolean z18, android.os.CancellationSignal cancellationSignal) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.VFSApplier", "onMaintenanceEnd");
        this.f294568a.set(false);
    }
}
