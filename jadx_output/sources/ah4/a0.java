package ah4;

/* loaded from: classes13.dex */
public class a0 extends ah4.m implements java.lang.Runnable {

    /* renamed from: z, reason: collision with root package name */
    public static final int f4979z = dh4.a.f232502a;

    /* renamed from: e, reason: collision with root package name */
    public final int f4980e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4981f;

    /* renamed from: g, reason: collision with root package name */
    public android.media.AudioTrack f4982g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.talkroom.component.v2engine f4983h;

    /* renamed from: i, reason: collision with root package name */
    public final ah4.h f4984i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f4985m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Object f4986n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4987o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4988p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4989q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4990r;

    /* renamed from: s, reason: collision with root package name */
    public long f4991s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4992t;

    /* renamed from: u, reason: collision with root package name */
    public int f4993u;

    /* renamed from: v, reason: collision with root package name */
    public int f4994v;

    /* renamed from: w, reason: collision with root package name */
    public long f4995w;

    /* renamed from: x, reason: collision with root package name */
    public short f4996x;

    /* renamed from: y, reason: collision with root package name */
    public short f4997y;

    public a0(com.tencent.mm.plugin.talkroom.component.v2engine v2engineVar, ah4.h hVar) {
        int i17 = f4979z;
        this.f4980e = i17;
        this.f4981f = (i17 / 1000) * 20 * 2;
        this.f4985m = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f4986n = new java.lang.Object();
        this.f4987o = false;
        this.f4989q = true;
        this.f4990r = false;
        this.f4991s = 0L;
        this.f4992t = true;
        this.f4994v = 0;
        this.f4995w = 0L;
        this.f4983h = v2engineVar;
        this.f4984i = hVar;
        this.f4988p = true;
        android.media.AudioTrack audioTrack = this.f4982g;
        if (audioTrack != null && audioTrack.getState() == 1) {
            this.f4982g.stop();
        }
        android.media.AudioTrack audioTrack2 = this.f4982g;
        if (audioTrack2 != null) {
            try {
                audioTrack2.release();
            } catch (java.lang.Exception unused) {
            }
        }
        ym1.f.Ai("music").A(true);
        int g17 = ym1.f.f463134h.g(true);
        int minBufferSize = android.media.AudioTrack.getMinBufferSize(this.f4980e, 2, 2);
        if (minBufferSize == -2 || minBufferSize == -1) {
            return;
        }
        this.f4982g = new to.e(g17, this.f4980e, 2, 2, minBufferSize * 8, 1);
        this.f4988p = false;
    }

    @Override // ah4.n
    public void a1() {
        this.f4989q = true;
        android.media.AudioTrack audioTrack = this.f4982g;
        if (audioTrack == null || audioTrack.getState() != 1) {
            return;
        }
        this.f4982g.pause();
    }

    @Override // ah4.n
    public int o1() {
        short s17 = this.f4997y;
        short s18 = this.f4996x;
        if (s17 < s18) {
            this.f4997y = s18;
        }
        short s19 = this.f4997y;
        if (s19 == 0) {
            return 0;
        }
        short s27 = (short) ((s18 * 100) / s19);
        this.f4996x = (short) 0;
        return s27;
    }

    @Override // ah4.n
    public void release() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomPlayer", "release");
        this.f4987o = true;
        android.media.AudioTrack audioTrack = this.f4982g;
        if (audioTrack != null && audioTrack.getState() == 1) {
            this.f4982g.stop();
        }
        android.media.AudioTrack audioTrack2 = this.f4982g;
        if (audioTrack2 != null) {
            audioTrack2.release();
        }
        synchronized (this.f4986n) {
            this.f4989q = false;
            this.f4986n.notify();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x011f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0000 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah4.a0.run():void");
    }

    @Override // ah4.n
    public void start() {
        ((ku5.t0) ku5.t0.f312615d).q(this);
    }

    @Override // ah4.n
    public void u() {
        android.media.AudioTrack audioTrack = this.f4982g;
        if (audioTrack != null && audioTrack.getState() == 1) {
            this.f4982g.play();
        }
        synchronized (this.f4986n) {
            this.f4989q = false;
            this.f4986n.notify();
        }
        this.f4997y = (short) 0;
        this.f4996x = (short) 0;
    }
}
