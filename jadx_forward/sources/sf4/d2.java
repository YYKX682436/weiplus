package sf4;

/* loaded from: classes4.dex */
public final class d2 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f488981d;

    /* renamed from: e, reason: collision with root package name */
    public t21.h0 f488982e;

    /* renamed from: f, reason: collision with root package name */
    public nf4.o f488983f;

    /* renamed from: g, reason: collision with root package name */
    public if4.h f488984g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sf4.j2 f488985h;

    public d2(sf4.j2 j2Var) {
        this.f488985h = j2Var;
    }

    @Override // dn.n
    public void f(java.lang.String mediaId, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onProgress, mediaId:");
        sb6.append(mediaId);
        sb6.append(", offset:");
        sb6.append(j17);
        sb6.append(", total:");
        sb6.append(j18);
        sb6.append(" this:");
        sb6.append(this);
        sb6.append(" currVideoItem:");
        if4.h hVar = this.f488985h.f489037f;
        sb6.append(hVar != null ? hVar.f372789d : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayProxy", sb6.toString());
        pm0.v.X(new sf4.c2(this.f488985h, mediaId, j17, j18, this));
    }

    @Override // dn.n
    public void g(java.lang.String mediaId, int i17, dn.h hVar) {
        long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFinish, mediaId:");
        sb6.append(mediaId);
        sb6.append(", ret:");
        sb6.append(i17);
        sb6.append(", sceneResult:");
        sb6.append(hVar != null ? hVar.f69553xb5f54fe9 : 0);
        sb6.append(" this:");
        sb6.append(this);
        sb6.append(" currVideoItem:");
        if4.h hVar2 = this.f488985h.f489037f;
        sb6.append(hVar2 != null ? hVar2.f372789d : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayProxy", sb6.toString());
        if4.h hVar3 = this.f488984g;
        if (hVar3 != null) {
            mf4.b bVar = mf4.b.f407675a;
            long j18 = hVar3.f372787b;
            java.lang.Long valueOf = java.lang.Long.valueOf(j18);
            java.util.Map map = mf4.b.f407677c;
            if (map.containsKey(valueOf)) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(map.get(java.lang.Long.valueOf(j18)));
                if (j18 != 0) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(map.get(java.lang.Long.valueOf(j18)));
                }
            }
            sf4.u1 u1Var = sf4.u1.f489116a;
            long j19 = hVar3.f372787b;
            java.lang.Long l17 = sf4.u1.f489128m;
            if (l17 != null && l17.longValue() == j19) {
                sf4.u1.f489128m = 0L;
            }
            if (sf4.u1.f489131p != j19) {
                sf4.u1.f489131p = j19;
                if (sf4.u1.f489118c != 0 && sf4.u1.f489120e != 0 && sf4.u1.f489124i.size() <= 0) {
                    sf4.o1 o1Var = sf4.u1.f489126k;
                    if (o1Var != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GroupData.StoryVideoPreloadMgr", "resetWalk");
                        o1Var.f489075e = o1Var.f489071a;
                        o1Var.f489076f = o1Var.f489072b;
                        o1Var.f489077g = 0;
                    }
                    u1Var.m(false);
                }
            }
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o oVar = (com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class);
        nf4.o oVar2 = this.f488983f;
        java.lang.String str = oVar2 != null ? oVar2.f66550xf1e9b966 : null;
        ((be0.e) oVar).getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true) != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6929xde0a2746 c6929xde0a2746 = mf4.d.f407704l;
            c6929xde0a2746.f142433j = r2.f243915a;
            c6929xde0a2746.f142434k = r2.f243916b;
            c6929xde0a2746.f142435l = r2.f243921g;
            c6929xde0a2746.f142436m = r2.f243919e;
            c6929xde0a2746.f142437n = r2.f243917c;
            c6929xde0a2746.f142438o = r2.f243918d;
            c6929xde0a2746.f142440q = r2.f243920f;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6929xde0a2746 c6929xde0a27462 = mf4.d.f407704l;
        nf4.o oVar3 = this.f488983f;
        c6929xde0a27462.f142432i = oVar3 != null ? oVar3.f66552x78351860 : 0L;
        c6929xde0a27462.f142428e = c6929xde0a27462.b("VideoUrl", oVar3 != null ? oVar3.f66553x4b6e88aa : null, true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6929xde0a2746 c6929xde0a27463 = mf4.d.f407704l;
        sx.a0 a0Var = (sx.a0) i95.n0.c(sx.a0.class);
        nf4.o oVar4 = this.f488983f;
        c6929xde0a27463.f142429f = c6929xde0a27463.b("NewMd5", ((rx.a) a0Var).Di(oVar4 != null ? oVar4.f66550xf1e9b966 : null), true);
        if (hVar != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6929xde0a2746 c6929xde0a27464 = mf4.d.f407704l;
            c6929xde0a27464.f142430g = hVar.f69559x1bb3b54a;
            c6929xde0a27464.f142431h = hVar.f69520x14c61803;
        }
        if ((hVar != null ? hVar.f69567x3391a1bf : null) != null) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            java.lang.String[] field_usedSvrIps = hVar.f69567x3391a1bf;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_usedSvrIps, "field_usedSvrIps");
            for (java.lang.String str2 : field_usedSvrIps) {
                stringBuffer.append(str2);
                stringBuffer.append("|");
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6929xde0a2746 c6929xde0a27465 = mf4.d.f407704l;
            c6929xde0a27465.f142439p = c6929xde0a27465.b("CDNIp", stringBuffer.toString(), true);
        }
        sf4.f2 f2Var = this.f488985h.f489033b;
        if (f2Var != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6929xde0a2746 c6929xde0a27466 = mf4.d.f407704l;
            c6929xde0a27466.f142441r = f2Var.f489009g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f2Var);
            if (f2Var.f489010h) {
                j17 = 3;
            } else {
                sf4.f2 f2Var2 = this.f488985h.f489033b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f2Var2);
                j17 = f2Var2.f489009g > 0 ? 2L : 1L;
            }
            c6929xde0a27466.f142442s = j17;
        }
        mf4.d.f407704l.k();
        mf4.d.f407704l = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6929xde0a2746();
        pm0.v.X(new sf4.a2(this, mediaId, i17));
    }

    @Override // dn.n
    /* renamed from: onDataAvailable */
    public void mo65706x9bb59ea0(java.lang.String mediaId, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDataAvailable, mediaId:");
        sb6.append(mediaId);
        sb6.append(", offset:");
        sb6.append(j17);
        sb6.append(", length:");
        sb6.append(j18);
        sb6.append(" this:");
        sb6.append(this);
        sb6.append(" currVideoItem:");
        if4.h hVar = this.f488985h.f489037f;
        sb6.append(hVar != null ? hVar.f372789d : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayProxy", sb6.toString());
        pm0.v.X(new sf4.z1(this.f488985h, mediaId, j17, j18));
    }

    @Override // dn.n
    /* renamed from: onM3U8Ready */
    public void mo65707xc5dd699b(java.lang.String mediaId, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
    }

    @Override // dn.n
    /* renamed from: onMoovReady */
    public void mo65708xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMoovReady, mediaId:");
        sb6.append(str);
        sb6.append(", offset:");
        sb6.append(j17);
        sb6.append(", length:");
        sb6.append(j18);
        sb6.append(", isMoovReady:");
        sb6.append(this.f488981d);
        sb6.append(" this:");
        sb6.append(this);
        sb6.append(" currVideoItem:");
        if4.h hVar = this.f488985h.f489037f;
        sb6.append(hVar != null ? hVar.f372789d : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayProxy", sb6.toString());
        if (this.f488981d) {
            return;
        }
        this.f488981d = true;
        pm0.v.X(new sf4.b2(this.f488985h, str, j17, j18, videoInfo));
    }
}
