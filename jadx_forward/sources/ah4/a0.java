package ah4;

/* loaded from: classes13.dex */
public class a0 extends ah4.m implements java.lang.Runnable {

    /* renamed from: z, reason: collision with root package name */
    public static final int f86512z = dh4.a.f314035a;

    /* renamed from: e, reason: collision with root package name */
    public final int f86513e;

    /* renamed from: f, reason: collision with root package name */
    public final int f86514f;

    /* renamed from: g, reason: collision with root package name */
    public android.media.AudioTrack f86515g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2255xac8f1cfd.C18548xe95a3bbe f86516h;

    /* renamed from: i, reason: collision with root package name */
    public final ah4.h f86517i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f86518m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Object f86519n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f86520o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f86521p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f86522q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f86523r;

    /* renamed from: s, reason: collision with root package name */
    public long f86524s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f86525t;

    /* renamed from: u, reason: collision with root package name */
    public int f86526u;

    /* renamed from: v, reason: collision with root package name */
    public int f86527v;

    /* renamed from: w, reason: collision with root package name */
    public long f86528w;

    /* renamed from: x, reason: collision with root package name */
    public short f86529x;

    /* renamed from: y, reason: collision with root package name */
    public short f86530y;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2255xac8f1cfd.C18548xe95a3bbe c18548xe95a3bbe, ah4.h hVar) {
        int i17 = f86512z;
        this.f86513e = i17;
        this.f86514f = (i17 / 1000) * 20 * 2;
        this.f86518m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f86519n = new java.lang.Object();
        this.f86520o = false;
        this.f86522q = true;
        this.f86523r = false;
        this.f86524s = 0L;
        this.f86525t = true;
        this.f86527v = 0;
        this.f86528w = 0L;
        this.f86516h = c18548xe95a3bbe;
        this.f86517i = hVar;
        this.f86521p = true;
        android.media.AudioTrack audioTrack = this.f86515g;
        if (audioTrack != null && audioTrack.getState() == 1) {
            this.f86515g.stop();
        }
        android.media.AudioTrack audioTrack2 = this.f86515g;
        if (audioTrack2 != null) {
            try {
                audioTrack2.release();
            } catch (java.lang.Exception unused) {
            }
        }
        ym1.f.Ai("music").A(true);
        int g17 = ym1.f.f544667h.g(true);
        int minBufferSize = android.media.AudioTrack.getMinBufferSize(this.f86513e, 2, 2);
        if (minBufferSize == -2 || minBufferSize == -1) {
            return;
        }
        this.f86515g = new to.e(g17, this.f86513e, 2, 2, minBufferSize * 8, 1);
        this.f86521p = false;
    }

    @Override // ah4.n
    public void a1() {
        this.f86522q = true;
        android.media.AudioTrack audioTrack = this.f86515g;
        if (audioTrack == null || audioTrack.getState() != 1) {
            return;
        }
        this.f86515g.pause();
    }

    @Override // ah4.n
    public int o1() {
        short s17 = this.f86530y;
        short s18 = this.f86529x;
        if (s17 < s18) {
            this.f86530y = s18;
        }
        short s19 = this.f86530y;
        if (s19 == 0) {
            return 0;
        }
        short s27 = (short) ((s18 * 100) / s19);
        this.f86529x = (short) 0;
        return s27;
    }

    @Override // ah4.n
    /* renamed from: release */
    public void mo2059x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomPlayer", "release");
        this.f86520o = true;
        android.media.AudioTrack audioTrack = this.f86515g;
        if (audioTrack != null && audioTrack.getState() == 1) {
            this.f86515g.stop();
        }
        android.media.AudioTrack audioTrack2 = this.f86515g;
        if (audioTrack2 != null) {
            audioTrack2.release();
        }
        synchronized (this.f86519n) {
            this.f86522q = false;
            this.f86519n.notify();
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
    /* renamed from: start */
    public void mo2060x68ac462() {
        ((ku5.t0) ku5.t0.f394148d).q(this);
    }

    @Override // ah4.n
    public void u() {
        android.media.AudioTrack audioTrack = this.f86515g;
        if (audioTrack != null && audioTrack.getState() == 1) {
            this.f86515g.play();
        }
        synchronized (this.f86519n) {
            this.f86522q = false;
            this.f86519n.notify();
        }
        this.f86530y = (short) 0;
        this.f86529x = (short) 0;
    }
}
