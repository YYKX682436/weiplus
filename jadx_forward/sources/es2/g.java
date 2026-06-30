package es2;

/* loaded from: classes2.dex */
public final class g extends fc2.d implements cs2.j {

    /* renamed from: g, reason: collision with root package name */
    public int f337879g;

    /* renamed from: h, reason: collision with root package name */
    public final cw2.w9 f337880h;

    /* renamed from: i, reason: collision with root package name */
    public final vr2.e f337881i;

    /* renamed from: m, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f337882m;

    /* renamed from: n, reason: collision with root package name */
    public final es2.h0 f337883n;

    /* renamed from: o, reason: collision with root package name */
    public final wr2.a f337884o;

    /* renamed from: p, reason: collision with root package name */
    public cs2.a f337885p;

    /* renamed from: q, reason: collision with root package name */
    public cs2.c f337886q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f337887r;

    /* renamed from: s, reason: collision with root package name */
    public cw2.wa f337888s;

    /* renamed from: t, reason: collision with root package name */
    public fc2.c f337889t;

    /* renamed from: u, reason: collision with root package name */
    public int f337890u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f337891v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f337892w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f337893x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f337894y;

    /* renamed from: z, reason: collision with root package name */
    public yz5.p f337895z;

    public g(int i17, cw2.w9 preloadCore, vr2.e eVar, p012xc85e97e9.p093xedfae76a.y lifecycleOwner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preloadCore, "preloadCore");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        this.f337879g = i17;
        this.f337880h = preloadCore;
        this.f337881i = eVar;
        this.f337882m = lifecycleOwner;
        jz5.g b17 = jz5.h.b(es2.d.f337872d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.f337883n = t70Var.Z2() ? new es2.h0((yr2.k) ((jz5.n) b17).mo141623x754a37bb(), java.lang.String.valueOf(this.f337879g)) : null;
        this.f337884o = t70Var.Y2() ? new wr2.a() : null;
    }

    public static final void I0(es2.g gVar, int i17, int i18) {
        if (i18 <= 0) {
            gVar.getClass();
            pm0.v.X(new es2.b(gVar, i17, i18));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.M0(), "onPreloadComplete return loading:" + i17 + " waiting:" + i18);
    }

    @Override // cs2.j
    public void B(java.lang.String mediaId, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(M0(), J0("onPreloadStop :".concat(mediaId)));
        wr2.a aVar = this.f337884o;
        es2.h0 h0Var = this.f337883n;
        if (h0Var != null) {
            h0Var.g(mediaId, z17, i17);
        }
    }

    @Override // cs2.j
    public void C0() {
        pm0.v.X(new es2.e(this));
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return (event instanceof fc2.t) && ((fc2.t) event).f342518d == 5;
    }

    @Override // cs2.j
    public void G(vr2.i callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(M0(), J0("unregisterCallback  disable on v2"));
    }

    @Override // fc2.d
    public void G0(fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if ((event instanceof fc2.t) && ((fc2.t) event).f342518d == 5) {
            N0("onEventHappen");
        }
    }

    @Override // fc2.d
    public void H0() {
        es2.h0 h0Var = this.f337883n;
        if (h0Var != null) {
            h0Var.f337903c = true;
            h0Var.f();
        }
        cs2.a aVar = this.f337885p;
        if (aVar != null) {
            aVar.f303591a.clear();
            ((c00.z3) i95.n0.c(c00.z3.class)).getClass();
        }
        cs2.c cVar = this.f337886q;
        if (cVar != null) {
            pm0.v.C(cVar.f303595c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPreloadSearchWorker", "preload search onRelease");
        }
        this.f337886q = null;
    }

    public final java.lang.String J0(java.lang.String str) {
        return hc2.b0.c(this.f337888s) + ' ' + str;
    }

    public final java.util.List L0() {
        bs2.b0 b0Var;
        db2.c3 c3Var;
        java.util.LinkedList m75941xfb821914;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f81534if).mo141623x754a37bb()).r()).booleanValue()) {
            java.util.List list = this.f337887r;
            if (list == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(ya.b.f77502x92235c1b);
                throw null;
            }
            if (((java.util.ArrayList) list).isEmpty()) {
                bs2.n1 R6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379) pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.class)).R6(this.f337890u);
                int i17 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().S;
                if (i17 < 2) {
                    i17 = 2;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (R6 != null && (b0Var = R6.f105458s) != null && (c3Var = b0Var.f105339b) != null && (m75941xfb821914 = c3Var.m75941xfb821914(1)) != null) {
                    int size = m75941xfb821914.size();
                    if (i17 <= size) {
                        size = i17;
                    }
                    int i18 = 0;
                    java.util.List subList = m75941xfb821914.subList(0, size);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subList, "subList(...)");
                    for (java.lang.Object obj : subList) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p17 = cu2.u.f303974a.p(h90Var.a(c19792x256d2725, hc2.d0.d(this.f337890u)));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(M0(), "getSourceList return cache " + i18 + ' ' + hc2.b0.f(p17, true) + " size:" + i17);
                        arrayList.add(p17);
                        i18 = i19;
                    }
                }
                return arrayList;
            }
        }
        java.util.List list2 = this.f337887r;
        if (list2 != null) {
            return list2;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(ya.b.f77502x92235c1b);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011c A[EDGE_INSN: B:76:0x011c->B:53:0x011c BREAK  A[LOOP:1: B:31:0x00d5->B:71:?], SYNTHETIC] */
    @Override // cs2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M(cw2.wa r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: es2.g.M(cw2.wa):void");
    }

    public final java.lang.String M0() {
        return "FMPIS2." + this.f337879g + '.' + hashCode();
    }

    public final void N0(java.lang.String str) {
        java.lang.Object obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(M0(), J0("onSourceListChange source:" + L0().size() + ' ' + str));
        if (!this.f337880h.V0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(M0(), J0("onSourceListChange return for isPlayFeedBufferAboveWater"));
            return;
        }
        cw2.wa waVar = this.f337888s;
        jz5.f0 f0Var = null;
        if (waVar != null) {
            C0();
            java.util.Iterator it = L0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((so2.j5) obj).mo2128x1ed62e84() == waVar.f305632f.getFeedId()) {
                        break;
                    }
                }
            }
            so2.j5 j5Var = (so2.j5) obj;
            if (j5Var != null) {
                O0(j5Var, "onSourceListChange");
                f0Var = jz5.f0.f384359a;
            }
        }
        if (f0Var == null && !this.f337892w && this.f337893x) {
            p("onSourceListChange");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O0(so2.j5 r41, java.lang.String r42) {
        /*
            Method dump skipped, instructions count: 1400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: es2.g.O0(so2.j5, java.lang.String):void");
    }

    @Override // cs2.j
    public void P(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(M0(), J0("onPreloadStart :".concat(source)));
        es2.h0 h0Var = this.f337883n;
        if (h0Var != null && h0Var.f337911k.compareAndSet(true, false)) {
            h0Var.h();
        }
        cs2.a aVar = this.f337885p;
        if (aVar != null) {
            aVar.a(m());
        }
    }

    public void P0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa dataList, int i17, final int i18, fc2.c cVar) {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        this.f337890u = i18;
        this.f337887r = dataList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if ((t70Var.Z2() || t70Var.Y2()) && cVar != null) {
            cVar.a(this);
        }
        this.f337889t = cVar;
        this.f337879g = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(M0(), "setup commentScene:" + i17 + " tabType:" + i18 + " isPreloadMediaEnable=" + t70Var.Z2() + " isPreloadImageEnable=" + t70Var.Y2());
        es2.h0 h0Var = this.f337883n;
        if (h0Var != null && (concurrentLinkedQueue = h0Var.f337907g) != null) {
            concurrentLinkedQueue.add(new es2.f(this));
        }
        final p012xc85e97e9.p093xedfae76a.y yVar = this.f337882m;
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5515x11ebd8ad>(yVar) { // from class: com.tencent.mm.plugin.finder.preload.video.v2.FinderMediaPreloadInStream$setup$2
            {
                this.f39173x3fe91575 = 1338237085;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5515x11ebd8ad c5515x11ebd8ad) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5515x11ebd8ad event = c5515x11ebd8ad;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (event.f135846g.f89425a != i18) {
                    return false;
                }
                this.N0("callback");
                return true;
            }
        }.mo48813x58998cd();
        this.f337894y = true;
    }

    @Override // cs2.j
    public void V(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f337886q = new cs2.c(context);
    }

    @Override // cs2.j
    public void f(java.lang.String mediaId, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
    }

    @Override // cs2.j
    /* renamed from: getCommentScene */
    public int mo122608x8fadefe3() {
        return this.f337879g;
    }

    @Override // cs2.j
    public void i0(cw2.wa mediaSource) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        this.f337891v = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(M0(), J0("onPlayFeedBufferBelowWater " + hc2.b0.c(mediaSource)));
        p0("onPlayFeedBufferBelowWater");
        vr2.e eVar = this.f337881i;
        if (eVar == null || (i17 = this.f337879g) != eVar.a()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FMTPScheduler", "onPlayFeedBufferBelowWater " + i17);
        java.util.Iterator it = eVar.b(eVar.a()).iterator();
        while (it.hasNext()) {
            cs2.j jVar = ((cs2.k) it.next()).f303609d;
            if (jVar != null) {
                jVar.p0("FMTPScheduler.onPlayFeedBufferBelowWater." + eVar.a());
            }
        }
    }

    @Override // cs2.j
    public int m() {
        es2.h0 h0Var = this.f337883n;
        if (h0Var != null) {
            return h0Var.f337904d.size() + h0Var.f337905e.size();
        }
        return 0;
    }

    @Override // cs2.j
    public void p(java.lang.String invokeSource) {
        es2.h0 h0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeSource, "invokeSource");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(M0(), J0("onNextPageComplete " + invokeSource + ' ' + this.f337892w + " source:" + L0().size()));
        if (this.f337892w) {
            return;
        }
        if (!this.f337880h.V0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(M0(), J0("onNextPageComplete return for isPlayFeedBufferAboveWater"));
            this.f337893x = true;
            return;
        }
        java.util.List L0 = L0();
        jz5.f0 f0Var = null;
        if (!(!L0.isEmpty())) {
            L0 = null;
        }
        if (L0 != null && (h0Var = this.f337883n) != null) {
            h0Var.i(new ek4.b(1, -1, this.f337879g, 3, 0L, null, 1, 48, null), kz5.n0.V0(L0), 0, "FinderMediaPreloadInStreamV2");
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            this.f337893x = true;
        }
    }

    @Override // cs2.j
    public void p0(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(M0(), J0("onPreloadStop :".concat(source)));
        es2.h0 h0Var = this.f337883n;
        if (h0Var != null && h0Var.f337911k.compareAndSet(false, true)) {
            h0Var.j("resetRunningTask", new es2.f0(h0Var));
        }
        cs2.a aVar = this.f337885p;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // cs2.j
    public void q(yz5.p pVar) {
        this.f337895z = pVar;
    }

    @Override // cs2.j
    public void u0(java.lang.String mediaId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(M0(), J0("onMediaFocusDownload :" + mediaId + " isFocused:" + z17));
        wr2.a aVar = this.f337884o;
        es2.h0 h0Var = this.f337883n;
        if (h0Var != null) {
            h0Var.g(mediaId, z17, -1);
        }
    }

    @Override // cs2.j
    public void x0(cw2.wa mediaSource) {
        so2.e eVar;
        java.lang.Object obj;
        so2.d contextInStream;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        java.util.Iterator it = L0().iterator();
        while (true) {
            eVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((so2.j5) obj).mo2128x1ed62e84() == mediaSource.f305632f.getFeedId()) {
                    break;
                }
            }
        }
        so2.j5 j5Var = (so2.j5) obj;
        if (j5Var != null) {
            so2.u1 u1Var = j5Var instanceof so2.u1 ? (so2.u1) j5Var : null;
            if (u1Var != null && (contextInStream = u1Var.getContextInStream()) != null) {
                eVar = contextInStream.f491838d;
            }
            if (eVar != null) {
                eVar.f491850a = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(M0(), J0("onPreRenderToFirstFrame " + hc2.b0.c(mediaSource)));
        }
    }

    @Override // cs2.j
    public void z(cw2.wa mediaSource, java.lang.String invokeSource) {
        so2.e eVar;
        java.lang.Object obj;
        so2.d contextInStream;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeSource, "invokeSource");
        this.f337891v = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(M0(), J0("onFeedSelectToPlay " + invokeSource + ' ' + hc2.b0.c(mediaSource)));
        this.f337888s = mediaSource;
        java.util.Iterator it = L0().iterator();
        while (true) {
            eVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((so2.j5) obj).mo2128x1ed62e84() == mediaSource.f305632f.getFeedId()) {
                    break;
                }
            }
        }
        so2.j5 j5Var = (so2.j5) obj;
        if (j5Var != null) {
            so2.u1 u1Var = j5Var instanceof so2.u1 ? (so2.u1) j5Var : null;
            if (u1Var != null && (contextInStream = u1Var.getContextInStream()) != null) {
                eVar = contextInStream.f491838d;
            }
            if (eVar == null) {
                return;
            }
            eVar.f491850a = false;
        }
    }
}
