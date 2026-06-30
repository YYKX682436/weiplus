package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2048x37c70a;

/* renamed from: com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine */
/* loaded from: classes15.dex */
public class C17351x2827be15 implements g04.j, p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f241549d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f241550e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f241551f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f241552g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241553h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f241554i;

    public C17351x2827be15(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, boolean z17) {
        this(abstractActivityC21394xb3d2c0cf);
        this.f241554i = z17;
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2048x37c70a.C17351x2827be15 c17351x2827be15, g04.i iVar, g04.l lVar) {
        c17351x2827be15.getClass();
        java.lang.String str = iVar != null ? iVar.f348997a : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageWordScanDetailEngine", "onScanEnd path = %s, result = %s", str, lVar.f349002a);
        ((ku5.t0) ku5.t0.f394148d).B(new g04.e(c17351x2827be15, str, lVar));
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onActivityDestroy */
    private void m68926x2711d60c() {
        this.f241553h = true;
        this.f241551f.clear();
        this.f241549d.mo273xed6858b4().c(this);
        ((ku5.t0) ku5.t0.f394148d).A("WordDetectThread");
        this.f241549d = null;
        this.f241552g.clear();
        if (this.f241554i) {
            boolean z17 = gx5.f.f358991a;
            ((ku5.t0) ku5.t0.f394148d).h(new gx5.c(), "WordDetectThread");
        }
    }

    public void b(java.lang.String str, g04.h hVar) {
        g04.i iVar = new g04.i(str);
        g04.a aVar = new g04.a(this, hVar);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageWordScanDetailEngine", "input is  nil");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageWordScanDetailEngine", "image word scan called, session: %s, input: %s", java.lang.Long.valueOf(currentTimeMillis), str);
        if (!this.f241550e.m7805x4365e2e3()) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f241549d;
            if (abstractActivityC21394xb3d2c0cf == null || abstractActivityC21394xb3d2c0cf.isFinishing()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageWordScanDetailEngine", "activity destroy called, just return");
                return;
            }
            this.f241550e.mo7806x9d92d11c(this.f241549d, new g04.b(this));
        }
        ((ku5.t0) ku5.t0.f394148d).A("WordDetectThread");
        ((ku5.t0) ku5.t0.f394148d).h(new g04.c(this, str, aVar, iVar, currentTimeMillis), "WordDetectThread");
    }

    public C17351x2827be15(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f241550e = new p012xc85e97e9.p093xedfae76a.j0();
        this.f241551f = new java.util.concurrent.ConcurrentHashMap();
        this.f241552g = new java.util.concurrent.ConcurrentHashMap();
        this.f241553h = false;
        this.f241554i = true;
        abstractActivityC21394xb3d2c0cf.mo273xed6858b4().a(this);
        this.f241549d = abstractActivityC21394xb3d2c0cf;
        this.f241553h = false;
    }
}
