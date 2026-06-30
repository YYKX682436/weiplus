package fy2;

/* loaded from: classes10.dex */
public final class d extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public r45.g84 f348772f;

    /* renamed from: g, reason: collision with root package name */
    public r45.g84 f348773g;

    /* renamed from: h, reason: collision with root package name */
    public long f348774h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
    }

    public final java.lang.String N6(r45.g84 g84Var) {
        java.lang.String m75945x2fec8307 = g84Var != null ? g84Var.m75945x2fec8307(1) : null;
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            return "";
        }
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(g84Var != null ? g84Var.m75945x2fec8307(1) : null);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        mn2.e1 e1Var = new mn2.e1("", a17, "", false, false, null, 56, null);
        ((c61.p2) ybVar).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183668d + "decoration/" + e1Var.n() + ".pag";
    }

    public final void O6(r45.g84 g84Var, yz5.l lVar) {
        if (g84Var != null) {
            boolean z17 = true;
            java.lang.String m75945x2fec8307 = g84Var.m75945x2fec8307(1);
            if (m75945x2fec8307 != null) {
                fy2.a aVar = new fy2.a(((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), g84Var.m75945x2fec8307(2));
                aVar.f323318d = "task_FinderCdnDownloader";
                java.lang.String N6 = N6(g84Var);
                com.p314xaae8f345.mm.vfs.w6.h(N6);
                com.p314xaae8f345.mm.vfs.w6.u(new com.p314xaae8f345.mm.vfs.r6(N6).r());
                try {
                    java.lang.String host = new java.net.URL(m75945x2fec8307).getHost();
                    int f17 = com.p314xaae8f345.mm.p971x6de15a2e.n.f(host, false, new java.util.ArrayList());
                    int f18 = com.p314xaae8f345.mm.p971x6de15a2e.n.f(host, true, new java.util.ArrayList());
                    char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                    aVar.f69601xaca5bdda = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec8307.getBytes());
                    aVar.D1 = m75945x2fec8307;
                    aVar.E1 = host;
                    aVar.G1 = N6;
                    aVar.J1 = f17;
                    aVar.K1 = f18;
                    aVar.M1 = "" + com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.c();
                    aVar.N1 = "";
                    aVar.P1 = 150;
                    aVar.Q1 = 20201;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveDecorationSlice", "attachDecorTaskInfo url:%s", m75945x2fec8307);
                } catch (java.net.MalformedURLException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.LiveDecorationSlice", e17, "", new java.lang.Object[0]);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.LiveDecorationSlice", "attachGiftPagTaskInfo fail:" + e17);
                    z17 = false;
                }
                if (z17) {
                    aVar.f323320f = new fy2.b(this, aVar, lVar);
                    if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(aVar)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveDecorationSlice", "SubCoreCdnTransport addRecvTask suc");
                        return;
                    }
                    if (lVar != null) {
                        lVar.mo146xb9724478(java.lang.Boolean.FALSE);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.LiveDecorationSlice", "SubCoreCdnTransport addRecvTask failed");
                }
            }
        }
    }

    public final boolean P6(java.lang.String str, int i17) {
        if (i17 == 0) {
            r45.g84 g84Var = this.f348772f;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(g84Var != null ? g84Var.m75945x2fec8307(1) : null, str)) {
                return false;
            }
        } else {
            if (i17 != 1) {
                return false;
            }
            r45.g84 g84Var2 = this.f348773g;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(g84Var2 != null ? g84Var2.m75945x2fec8307(1) : null, str)) {
                return false;
            }
        }
        return true;
    }

    public final void Q6(yz5.p pVar) {
        dk2.ef efVar = dk2.ef.f314905a;
        dk2.ef.f314925k.e(8, new r45.oy2(), new fy2.c(pVar, r45.py2.class), false);
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        this.f348772f = null;
        this.f348773g = null;
        this.f348774h = 0L;
    }
}
