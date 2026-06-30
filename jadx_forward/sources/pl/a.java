package pl;

/* loaded from: classes13.dex */
public abstract class a {

    /* renamed from: m, reason: collision with root package name */
    public static volatile java.util.concurrent.atomic.AtomicInteger f438085m = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: n, reason: collision with root package name */
    public static volatile java.util.concurrent.atomic.AtomicInteger f438086n = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: o, reason: collision with root package name */
    public static volatile java.util.concurrent.atomic.AtomicInteger f438087o = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    public volatile android.media.AudioTrack f438088a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f438089b;

    /* renamed from: e, reason: collision with root package name */
    public final int f438092e;

    /* renamed from: f, reason: collision with root package name */
    public final int f438093f;

    /* renamed from: h, reason: collision with root package name */
    public hl.d f438095h;

    /* renamed from: i, reason: collision with root package name */
    public ol.j f438096i;

    /* renamed from: c, reason: collision with root package name */
    public int f438090c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f438091d = 0;

    /* renamed from: g, reason: collision with root package name */
    public double f438094g = 0.0d;

    /* renamed from: j, reason: collision with root package name */
    public int f438097j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f438098k = -1;

    /* renamed from: l, reason: collision with root package name */
    public float f438099l = 1.0f;

    public a(int i17, int i18, hl.d dVar, ol.j jVar) {
        this.f438092e = 0;
        this.f438093f = 0;
        this.f438092e = i17;
        this.f438093f = i18;
        this.f438095h = dVar;
        this.f438096i = jVar;
    }

    public long a() {
        long j17 = -1;
        try {
            if (this.f438088a == null || this.f438088a.getState() == 0) {
                j17 = this.f438098k;
            } else {
                j17 = java.lang.Math.round((this.f438088a.getPlaybackHeadPosition() / this.f438088a.getSampleRate()) * 1000.0d);
                this.f438098k = j17;
            }
        } catch (java.lang.Exception e17) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioPcmBasePlayComponent", e17, "getCurrentPosition", new java.lang.Object[0]);
        }
        return j17;
    }

    public void b() {
    }

    public abstract void c(byte[] bArr);

    public abstract void d();

    public void e() {
        try {
            if (this.f438088a != null) {
                f438087o.decrementAndGet();
            }
            if (this.f438088a != null && this.f438088a.getState() != 0) {
                this.f438088a.stop();
                this.f438088a.flush();
            }
            if (this.f438088a != null) {
                this.f438088a.release();
                this.f438088a = null;
            }
        } catch (java.lang.Exception e17) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioPcmBasePlayComponent", e17, "releaseAudioTrack", new java.lang.Object[0]);
        }
    }

    public void f() {
        this.f438090c = 0;
        this.f438091d = 0;
        byte[] bArr = this.f438089b;
        if (bArr != null) {
            java.util.Arrays.fill(bArr, 0, bArr.length, (byte) 0);
        }
    }

    public void g() {
    }

    public void h(double d17) {
        java.lang.Object[] objArr = {java.lang.Double.valueOf(d17)};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioPcmBasePlayComponent", "setPlaybackRate:%f", objArr);
        try {
            if (this.f438088a != null) {
                if (this.f438088a.getState() == 1 || this.f438088a.getState() == 2) {
                    android.media.PlaybackParams playbackParams = this.f438088a.getPlaybackParams();
                    playbackParams.setSpeed((float) d17);
                    this.f438088a.setPlaybackParams(playbackParams);
                }
            }
        } catch (java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioPcmBasePlayComponent", e17, "setPlaybackRate", new java.lang.Object[0]);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioPcmBasePlayComponent", e18, "setPlaybackRate", new java.lang.Object[0]);
        }
    }

    public void i(float f17, float f18) {
        try {
            if (this.f438088a != null && (this.f438088a.getState() == 1 || this.f438088a.getState() == 2)) {
                this.f438088a.setStereoVolume(f17, f18);
            }
        } catch (java.lang.IllegalStateException e17) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioPcmBasePlayComponent", e17, be1.x0.f4239x24728b, new java.lang.Object[0]);
        } catch (java.lang.Exception e18) {
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioPcmBasePlayComponent", e18, be1.x0.f4239x24728b, new java.lang.Object[0]);
        }
        this.f438099l = f17;
    }
}
