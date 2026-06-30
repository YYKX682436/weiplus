package tl;

/* loaded from: classes14.dex */
public class d0 extends tl.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f501562d;

    /* renamed from: e, reason: collision with root package name */
    public final int f501563e;

    /* renamed from: f, reason: collision with root package name */
    public int f501564f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f501565g = 12800;

    /* renamed from: h, reason: collision with root package name */
    public boolean f501566h = false;

    /* renamed from: i, reason: collision with root package name */
    public android.os.HandlerThread f501567i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f501568j;

    /* renamed from: k, reason: collision with root package name */
    public final android.media.AudioRecord f501569k;

    /* renamed from: l, reason: collision with root package name */
    public final tl.b0 f501570l;

    /* renamed from: m, reason: collision with root package name */
    public to.b f501571m;

    /* renamed from: n, reason: collision with root package name */
    public tl.c f501572n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Object f501573o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f501574p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Object f501575q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.concurrent.Future f501576r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f501577s;

    public d0(android.media.AudioRecord audioRecord, boolean z17, int i17, tl.c cVar, boolean z18) {
        int i18 = pu5.i.f440006b;
        this.f501567i = pu5.f.a("RecordModeAsyncRead_record", 5);
        this.f501570l = new tl.b0(this);
        this.f501571m = null;
        this.f501573o = new java.lang.Object();
        this.f501574p = new byte[0];
        this.f501575q = new java.lang.Object();
        this.f501576r = null;
        this.f501577s = false;
        this.f501569k = audioRecord;
        this.f501562d = z17;
        this.f501563e = i17;
        this.f501572n = cVar;
        this.f501577s = z18;
    }

    @Override // tl.f0
    public boolean a() {
        int i17;
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordModeAsyncRead", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d3.f33784x24728b);
        synchronized (this.f501575q) {
            this.f501564f = 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordModeAsyncRead", "[startRecord] dumpRunningTask:%s", ((ku5.t0) ku5.t0.f394149e).f());
        this.f501567i.start();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(this.f501567i.getLooper());
        this.f501568j = n3Var;
        n3Var.mo50293x3498a0(this.f501570l);
        this.f501568j.m77789xc5a5549d(false);
        if (true == this.f501577s) {
            this.f501571m = new to.b();
            this.f501565g = this.f501563e * 20;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordModeAsyncRead", "audioBuffer init mAudioBufferSize: " + this.f501565g);
            to.b bVar = this.f501571m;
            int i18 = this.f501565g;
            bVar.getClass();
            if (i18 <= 0) {
                i17 = -1;
            } else {
                bVar.f502415c = new byte[i18];
                bVar.f502413a = i18;
                i17 = 0;
            }
            if (i17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordModeAsyncRead", "audioBuffer init failed, error code = " + i17);
                z17 = false;
            } else {
                z17 = true;
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordModeAsyncRead", "initAudioBuffer failed");
                return false;
            }
            if (this.f501576r != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordModeAsyncRead", "startRecord failed : last record is NOT stopped now");
                return false;
            }
            this.f501576r = ((ku5.t0) ku5.t0.f394148d).e(new tl.a0(this), 60L, 20L);
        }
        return true;
    }

    @Override // tl.f0
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordModeAsyncRead", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.l3.f33808x24728b);
        synchronized (this.f501575q) {
            this.f501564f = 3;
            this.f501570l.f501560d = new tl.z(this);
        }
        synchronized (this.f501574p) {
            this.f501574p.notify();
        }
    }

    @Override // tl.f0
    public void c(boolean z17) {
        this.f501566h = z17;
    }
}
