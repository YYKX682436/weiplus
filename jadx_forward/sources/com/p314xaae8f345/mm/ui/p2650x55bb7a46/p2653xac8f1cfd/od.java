package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public class od implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le f281172d;

    public od(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le leVar) {
        this.f281172d = leVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le leVar = this.f281172d;
        java.lang.Thread thread = leVar.f280962x;
        objArr[0] = thread != null ? java.lang.Boolean.valueOf(thread.isAlive()) : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsComponet", "getRecentToolsThread interrupt() %s", objArr);
        java.lang.Thread thread2 = leVar.f280962x;
        if (thread2 == null || !thread2.isAlive()) {
            return;
        }
        leVar.f280962x.interrupt();
    }
}
