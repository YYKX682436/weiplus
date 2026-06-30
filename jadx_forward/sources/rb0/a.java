package rb0;

/* loaded from: classes9.dex */
public final class a extends h04.a {
    @Override // h04.a
    /* renamed from: onTaskCanceled */
    public void mo45117xe8454bd() {
    }

    @Override // h04.a
    /* renamed from: onTaskExecute */
    public boolean mo45118x3e7092d1(android.os.CancellationSignal cancellationSignal) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cancellationSignal, "cancellationSignal");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VFSMaintainTask", "VFSMaintainTask invoked, wait for account ready...");
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.c cVar = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.c.f149210d;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("INSTANCE");
            throw null;
        }
        cVar.m134976x2690a4ac();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VFSMaintainTask", "VFSMaintainTask account ready");
        com.p314xaae8f345.mm.vfs.a3.f294314a.i(cancellationSignal);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VFSMaintainTask", "VFSMaintainTask done: canceled = " + cancellationSignal.isCanceled());
        return !cancellationSignal.isCanceled();
    }
}
