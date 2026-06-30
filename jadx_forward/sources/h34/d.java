package h34;

/* loaded from: classes15.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f360027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f360028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h34.f f360029f;

    public d(h34.f fVar, boolean z17, boolean z18) {
        this.f360029f = fVar;
        this.f360027d = z17;
        this.f360028e = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f360027d;
        boolean z18 = this.f360028e;
        h34.f fVar = this.f360029f;
        if (z17) {
            h34.f.a(fVar, null, -1L, z18);
            return;
        }
        if (!fVar.f360043i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MusicFingerPrintRecorder", "tryCallBack netscen not return.");
            return;
        }
        if (fVar.f360047p != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MusicFingerPrintRecorder", "tryCallBack device not ready!");
            return;
        }
        h34.j jVar = fVar.f360044m;
        if (jVar == null) {
            h34.f.a(fVar, null, -1L, z18);
            return;
        }
        r45.js5 H = jVar.H();
        h34.j jVar2 = fVar.f360044m;
        jVar2.getClass();
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = jVar2.f360078e;
        if (j17 > 0 && j17 < currentTimeMillis) {
            currentTimeMillis = j17;
        }
        h34.f.a(fVar, H, currentTimeMillis, z18);
    }
}
