package dz3;

/* loaded from: classes15.dex */
public class c implements com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.e1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz3.i f326640d;

    public c(dz3.i iVar) {
        this.f326640d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReIdAiScanImageDecodeQueue", "release on task");
        if (this.f326640d.f326666a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.l();
            this.f326640d.f326666a = false;
        }
        dz3.i.H = null;
        dz3.i.I = null;
    }
}
