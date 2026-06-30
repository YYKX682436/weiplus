package ln1;

/* loaded from: classes12.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln1.r f401317d;

    public p(ln1.r rVar) {
        this.f401317d = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ln1.y yVar;
        ln1.z zVar;
        this.f401317d.f401326h = true;
        while (true) {
            long j17 = this.f401317d.f401321c.get();
            ln1.r rVar = this.f401317d;
            if (rVar.f401325g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupFlowQueue", "backup flow close index:%d, outIndex:%d", java.lang.Long.valueOf(rVar.f401320b.get()), java.lang.Long.valueOf(j17));
                this.f401317d.f401326h = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupFlowQueue", "outTask end");
                return;
            }
            synchronized (rVar.f401321c) {
                yVar = (ln1.y) rVar.f401319a.get(java.lang.Long.valueOf(rVar.f401321c.get()));
                if (yVar != null) {
                    rVar.f401319a.remove(java.lang.Long.valueOf(rVar.f401321c.get()));
                    rVar.f401321c.addAndGet(1L);
                } else {
                    yVar = null;
                }
            }
            if (yVar != null) {
                this.f401317d.f401328j.addAndGet(-yVar.f401408c);
                this.f401317d.f401324f.c();
                this.f401317d.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupFlowQueue", "outTask flowData hashCode:%d, outIndex:%d, sendSeqCount:%d, cacheSize:%d", java.lang.Integer.valueOf(yVar.m146101x8cdac1b()), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(sn1.i.f491546g.size()), java.lang.Long.valueOf(this.f401317d.f401328j.get()));
                java.lang.Object obj = yVar.f401407b;
                if (obj != null && (zVar = yVar.f401406a) != null) {
                    zVar.a(obj);
                }
            } else {
                this.f401317d.f401323e.b();
                this.f401317d.f401323e.a(200L);
            }
        }
    }
}
