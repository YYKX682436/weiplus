package tl;

/* loaded from: classes12.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl.t f501596d;

    public o(tl.t tVar) {
        this.f501596d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "start to wait pcmrecorder stop, markStop: %s", java.lang.Boolean.valueOf(this.f501596d.f501664k));
        java.lang.Object obj = tl.t.f501653y;
        synchronized (obj) {
            try {
                obj.wait(300L);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMAudioRecorder", e17, "", new java.lang.Object[0]);
            }
        }
        synchronized (tl.t.f501652x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "wait pcmrecorder stop, timeout, mPcmRecorder: %s", this.f501596d.f501669p);
            tl.w wVar = this.f501596d.f501669p;
            if (wVar != null) {
                try {
                    wVar.l();
                    tl.t tVar = this.f501596d;
                    tVar.f501669p.f501705y = null;
                    tVar.f501669p = null;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMAudioRecorder", e18, "", new java.lang.Object[0]);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "finish to pcmrecorder stop, markStop: %s", java.lang.Boolean.valueOf(this.f501596d.f501664k));
    }
}
