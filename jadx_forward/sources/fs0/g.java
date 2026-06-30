package fs0;

/* loaded from: classes10.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f347764a;

    /* renamed from: b, reason: collision with root package name */
    public final long f347765b;

    /* renamed from: c, reason: collision with root package name */
    public final hs0.a f347766c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.Surface f347767d;

    /* renamed from: f, reason: collision with root package name */
    public wo.i1 f347769f;

    /* renamed from: g, reason: collision with root package name */
    public android.media.MediaFormat f347770g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.r f347771h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f347772i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.l f347773j;

    /* renamed from: k, reason: collision with root package name */
    public yz5.a f347774k;

    /* renamed from: l, reason: collision with root package name */
    public int f347775l;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f347778o;

    /* renamed from: p, reason: collision with root package name */
    public int f347779p;

    /* renamed from: q, reason: collision with root package name */
    public float f347780q;

    /* renamed from: r, reason: collision with root package name */
    public final fs0.c f347781r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f347782s;

    /* renamed from: v, reason: collision with root package name */
    public volatile int f347785v;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f347768e = "MicroMsg.IMediaCodecTransDecoder";

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.Semaphore f347776m = new java.util.concurrent.Semaphore(1);

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Object f347777n = new java.lang.Object();

    /* renamed from: t, reason: collision with root package name */
    public long f347783t = -1;

    /* renamed from: u, reason: collision with root package name */
    public long f347784u = -1;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f347786w = new java.util.ArrayList();

    public g(long j17, long j18, hs0.a aVar, android.view.Surface surface, int i17, boolean z17) {
        this.f347764a = j17;
        this.f347765b = j18;
        this.f347766c = aVar;
        this.f347767d = surface;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IMediaCodecTransDecoder", "create IMediaCodecTransDecoder, startTimeMs:" + j17 + ", endTimeMs:" + j18);
        if (aVar != null) {
            aVar.g();
        }
        if (j17 >= 0 && aVar != null) {
            aVar.e(1000 * j17);
        }
        this.f347781r = new fs0.c(aVar != null ? aVar.f366080a : null, i17, j17 * 1000, z17);
        this.f347785v = 0;
    }

    public final void a(long j17, long j18, android.media.MediaCodec.BufferInfo bufferInfo) {
        java.util.ArrayList arrayList = this.f347786w;
        if (arrayList.contains(java.lang.Long.valueOf(j17))) {
            yz5.r rVar = this.f347771h;
            if (rVar != null) {
                return;
            }
            return;
        }
        arrayList.add(java.lang.Long.valueOf(j17));
        yz5.r rVar2 = this.f347771h;
        if (rVar2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01df, code lost:
    
        if (r7.longValue() != r8) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0297 A[EDGE_INSN: B:101:0x0297->B:61:0x0297 BREAK  A[LOOP:0: B:73:0x01a7->B:99:0x01a7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r13, android.media.MediaCodec.BufferInfo r14) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fs0.g.b(int, android.media.MediaCodec$BufferInfo):void");
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347768e, "releaseDecoder  " + hashCode());
        synchronized (this.f347777n) {
            try {
                this.f347781r.f347738g.clear();
                wo.i1 i1Var = this.f347769f;
                if (i1Var != null) {
                    i1Var.y();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347768e, "decoder?.stop()");
                wo.i1 i1Var2 = this.f347769f;
                if (i1Var2 != null) {
                    i1Var2.q();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347768e, "decoder?.release()");
                this.f347778o = true;
                android.view.Surface surface = this.f347767d;
                if (surface != null) {
                    surface.release();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347768e, "releaseDecoder end");
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public void d(boolean z17) {
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        java.util.concurrent.Semaphore semaphore = this.f347776m;
        semaphore.availablePermits();
        java.util.Objects.toString(java.lang.Thread.currentThread());
        if (z17) {
            java.util.Objects.toString(java.lang.Thread.currentThread());
            semaphore.acquire();
        } else {
            java.util.Objects.toString(java.lang.Thread.currentThread());
            semaphore.release();
        }
        semaphore.availablePermits();
        java.util.Objects.toString(java.lang.Thread.currentThread());
    }

    public abstract void e();
}
