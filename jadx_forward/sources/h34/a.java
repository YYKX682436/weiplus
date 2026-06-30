package h34;

/* loaded from: classes15.dex */
public class a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f359995i;

    /* renamed from: m, reason: collision with root package name */
    public tl.w f359996m;

    /* renamed from: o, reason: collision with root package name */
    public h34.t f359998o;

    /* renamed from: d, reason: collision with root package name */
    public int f359990d = 400;

    /* renamed from: e, reason: collision with root package name */
    public int f359991e = 8194;

    /* renamed from: f, reason: collision with root package name */
    public int f359992f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f359993g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f359994h = 1;

    /* renamed from: n, reason: collision with root package name */
    public h34.s f359997n = null;

    /* renamed from: p, reason: collision with root package name */
    public volatile byte[] f359999p = new byte[8194];

    /* renamed from: q, reason: collision with root package name */
    public int f360000q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f360001r = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f360002s = false;

    /* renamed from: t, reason: collision with root package name */
    public final tl.v f360003t = new h34.b(this);

    public final void a() {
        tl.w wVar = this.f359996m;
        if (wVar != null) {
            wVar.l();
            this.f359996m = null;
        }
    }

    public boolean b() {
        c01.d9.e().q(5245, this);
        tl.w wVar = this.f359996m;
        if (wVar == null) {
            return true;
        }
        wVar.l();
        this.f359996m = null;
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() != 5245) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicAndSingRecorder", "clientId: %d, onSceneEnd >> errType: %d, errCode: %d", java.lang.Integer.valueOf(this.f359992f), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 0 && i18 == 0) {
            h34.j jVar = (h34.j) m1Var;
            if (jVar.H() != null) {
                r45.gh4 gh4Var = (r45.gh4) jVar.H();
                int i19 = gh4Var.f456780e;
                this.f359990d = i19;
                this.f359991e = gh4Var.f456781f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicAndSingRecorder", "onSceneEnd: pullInterval: %d, maxPacketSize: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.f359991e));
                if (gh4Var.f456782g == 1) {
                    java.util.LinkedList linkedList = gh4Var.f456784i;
                    if (linkedList == null || linkedList.size() <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicAndSingRecorder", "NetSceneShakeMedia isRecoFailed stop now clientId: %d", java.lang.Integer.valueOf(this.f359992f));
                        b();
                        ik1.h0.b(new h34.RunnableC28437x2ca3e1(this, null));
                        return;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicAndSingRecorder", "NetSceneShakeMedia isRecoSuccess stop now ! clientId: %d", java.lang.Integer.valueOf(this.f359992f));
                        b();
                        ik1.h0.b(new h34.RunnableC28437x2ca3e1(this, gh4Var));
                        return;
                    }
                }
                if (this.f359995i) {
                    int i27 = this.f360001r + 1;
                    this.f360001r = i27;
                    if (i27 >= 5) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicAndSingRecorder", "null package count is max");
                        ik1.h0.b(new h34.RunnableC28437x2ca3e1(this, null));
                        return;
                    }
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f359993g;
                    int i28 = this.f359994h;
                    this.f359994h = i28 + 1;
                    gm0.j1.e().j(new h34.RunnableC28436x2ca3e0(this, new byte[1], currentTimeMillis, i28));
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicAndSingRecorder", "network error, errType: %d, errCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        a();
        ik1.h0.b(new h34.RunnableC28437x2ca3e1(this, null));
    }
}
