package h34;

/* loaded from: classes15.dex */
public class w extends c34.z {

    /* renamed from: g, reason: collision with root package name */
    public static h34.w f360099g;

    /* renamed from: e, reason: collision with root package name */
    public final h34.a f360100e;

    /* renamed from: f, reason: collision with root package name */
    public h34.t f360101f;

    public w(android.content.Context context, c34.x xVar) {
        super(xVar);
        this.f360100e = new h34.a();
    }

    @Override // c34.z
    public void a() {
        this.f360100e.b();
        this.f119780d = null;
    }

    @Override // c34.z
    public void b() {
    }

    @Override // c34.z
    public void c() {
    }

    @Override // c34.z
    public void d() {
    }

    @Override // c34.z
    public void e() {
        if (this.f119780d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Micromsg.ShakeMusicMgr", "shakeGetListener == null");
            return;
        }
        java.lang.System.currentTimeMillis();
        h34.a aVar = this.f360100e;
        aVar.f359998o = this.f360101f;
        h34.s sVar = new h34.s() { // from class: h34.w$$a
            @Override // h34.s
            public final void a(r45.js5 js5Var, long j17, boolean z17) {
                h34.w wVar = h34.w.this;
                if (wVar.f119780d == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Micromsg.ShakeMusicMgr", "shakeGetListener == null");
                    return;
                }
                if (js5Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Micromsg.ShakeMusicMgr", "resp null & return");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    c34.x xVar = wVar.f119780d;
                    if (xVar != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17671x63665fce) xVar).a7(arrayList, 4L);
                        return;
                    }
                    return;
                }
                java.util.LinkedList linkedList = ((r45.gh4) js5Var).f456784i;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.ShakeMusicMgr", "music size: %d", java.lang.Integer.valueOf(linkedList.size()));
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (linkedList.size() > 0) {
                    r45.eh4 eh4Var = (r45.eh4) linkedList.get(0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.ShakeMusicMgr", "shake music is success, songName: %s, singerName: %s, bgUrl: %s", eh4Var.f455017g, eh4Var.f455018h, eh4Var.f455020m);
                    c34.r rVar = new c34.r();
                    java.lang.String str = eh4Var.f455018h;
                    rVar.f66444xdec927b = str;
                    rVar.f66431x21f9b213 = eh4Var.f455017g;
                    rVar.f66426x2ef4959a = str;
                    rVar.f66442x433be87e = eh4Var.f455020m;
                    rVar.f66443x2262335f = 4;
                    rVar.f66429x63f8483c = 1;
                    rVar.f66436x13320506 = "newShake";
                    try {
                        rVar.f66430xbcdbef = js5Var.mo14344x5f01b1f6();
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Micromsg.ShakeMusicMgr", "insertItem, to lvbuf error [%s]", e17.getLocalizedMessage());
                    }
                    c34.h0.Ni().J0(rVar, true);
                    arrayList2.add(rVar);
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17671x63665fce) wVar.f119780d).a7(arrayList2, j17);
            }
        };
        c01.d9.e().a(5245, aVar);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        aVar.f359992f = (int) java.lang.System.currentTimeMillis();
        aVar.f359997n = sVar;
        tl.w wVar = new tl.w(8000, 1, 4);
        aVar.f359996m = wVar;
        wVar.f501693m = -19;
        wVar.f501705y = aVar.f360003t;
        if (!wVar.k()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicAndSingRecorder", "start record failed clientId: %d", java.lang.Integer.valueOf(aVar.f359992f));
            aVar.a();
            return;
        }
        aVar.f359993g = java.lang.System.currentTimeMillis();
        aVar.f359995i = false;
        aVar.f360000q = 0;
        aVar.f359994h = 1;
        aVar.f360001r = 0;
        aVar.f360002s = false;
    }
}
