package g05;

@j95.b
/* loaded from: classes7.dex */
public final class r extends i95.w implements g05.i, gq0.v, jc3.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f349017d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f349018e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f349019f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f349020g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f349021h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f349022i;

    /* renamed from: m, reason: collision with root package name */
    public iq0.c f349023m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f349024n;

    public r() {
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5 f5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4 d4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 Vc = f5Var.Vc(764);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(Vc, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<*>");
        this.f349017d = kz5.c0.k(((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m5) d4Var).Ni((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f) Vc, "MagicWxGameDynamicCard"));
        ((op0.k) ((op0.i) i95.n0.c(op0.i.class))).getClass();
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o8();
        java.lang.String name = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o8.class.getName();
        ((et.o) ((ft.b4) i95.n0.c(ft.b4.class))).getClass();
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.eb();
        this.f349018e = kz5.p1.d(name, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.eb.class.getName(), f5Var.Vc(251).getClass().getName(), f5Var.Vc(969).getClass().getName(), f5Var.Vc(970).getClass().getName(), f5Var.Vc(984).getClass().getName(), f5Var.Vc(1065).getClass().getName(), f5Var.Vc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.r.f34013x366c91de).getClass().getName(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.g0.class.getName(), f5Var.Vc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.m0.f33740x366c91de).getClass().getName());
        this.f349019f = jz5.h.b(g05.l.f349011d);
        this.f349020g = jz5.h.b(g05.q.f349016d);
        this.f349022i = true;
        this.f349024n = jz5.h.b(g05.m.f349012d);
    }

    public boolean Ai(java.lang.String bizName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "checkPkgVersion, minPkgversion is null");
            return false;
        }
        i95.m c17 = i95.n0.c(gq0.t.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        this.f349023m = gq0.t.de((gq0.t) c17, new g05.n(this), null, 2, null);
        java.lang.String Ni = ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Ni(Di());
        if (r26.n0.N(Ni)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "pkgConfig is null");
            return false;
        }
        try {
            java.lang.String optString = new org.json.JSONObject(Ni).optString("version", "");
            java.lang.String optString2 = new org.json.JSONObject(Ni).optString("requiredMinLibVersion", "");
            java.lang.String bj6 = ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).bj("MagicSclPublicService");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "bizname: " + bizName + ", pkgVersion#" + optString + ", minPkgVersion#" + str + ", requiredMinLibVersion:" + optString2 + ", sclVersion:" + bj6);
            if (optString.compareTo(str) >= 0) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                if (bj6.compareTo(optString2) >= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "bizname: " + bizName + ", pkgversion success");
                    return true;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "bizname: " + bizName + ", pkgversion failed");
        } catch (java.lang.Throwable unused) {
        }
        return false;
    }

    public void Bi() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "createBiz and active");
        i95.m c17 = i95.n0.c(gq0.t.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        this.f349023m = gq0.t.de((gq0.t) c17, new g05.n(this), null, 2, null);
        iq0.c Di = Di();
        if (Di != null) {
            i95.m c18 = i95.n0.c(gq0.t.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            gq0.t.bh((gq0.t) c18, Di, null, 2, null);
        }
    }

    public final iq0.c Di() {
        iq0.c cVar = this.f349023m;
        if (cVar != null) {
            return cVar;
        }
        i95.m c17 = i95.n0.c(gq0.t.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        return gq0.t.de((gq0.t) c17, new g05.n(this), null, 2, null);
    }

    public final void Ni(java.lang.String str, java.lang.String str2, android.graphics.Rect rect, hq0.m0 m0Var) {
        i95.m c17 = i95.n0.c(gq0.t.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        this.f349023m = gq0.t.de((gq0.t) c17, new g05.n(this), null, 2, null);
        i95.m c18 = i95.n0.c(gq0.t.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        gq0.t.Qh((gq0.t) c18, Di(), null, str, str2, new android.graphics.Rect(0, 0, wi(), 0), hq0.m0.f364565d, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k) r0).f280857g == true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ri() {
        /*
            r3 = this;
            java.lang.String r0 = "onExitChattingRoom"
            java.lang.String r1 = "MicroMsg.MagicWxGameDynamicCardServiceFeatureService"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            iq0.c r0 = r3.Di()
            if (r0 == 0) goto L1a
            java.lang.Class<gq0.t> r2 = gq0.t.class
            i95.m r2 = i95.n0.c(r2)
            gq0.t r2 = (gq0.t) r2
            nq0.p r2 = (nq0.p) r2
            r2.Di(r0)
        L1a:
            r3.Zi()
            java.lang.ref.WeakReference r0 = r3.f349021h
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r0.get()
            g05.j r0 = (g05.j) r0
            if (r0 == 0) goto L2e
            com.tencent.mm.ui.chatting.component.k r0 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k) r0
            r0.n0()
        L2e:
            java.lang.ref.WeakReference r0 = r3.f349021h
            if (r0 == 0) goto L42
            java.lang.Object r0 = r0.get()
            g05.j r0 = (g05.j) r0
            if (r0 == 0) goto L42
            com.tencent.mm.ui.chatting.component.k r0 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k) r0
            boolean r0 = r0.f280857g
            r2 = 1
            if (r0 != r2) goto L42
            goto L43
        L42:
            r2 = 0
        L43:
            if (r2 == 0) goto L4a
            java.lang.String r0 = "destroyBiz, ignore, isInGameChattingRoom"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r0)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g05.r.Ri():void");
    }

    @Override // gq0.v
    public void S3(java.lang.String frameSetId) {
        g05.j jVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "notifyFrameSetRemove,frameSetId:" + frameSetId + ", isBizConnect:" + this.f349022i);
        java.lang.String b17 = vq0.a.b(frameSetId);
        java.lang.ref.WeakReference weakReference = this.f349021h;
        if (weakReference == null || (jVar = (g05.j) weakReference.get()) == null) {
            return;
        }
        boolean z17 = this.f349022i;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k) jVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "markview update framesetname:".concat(b17));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0) kVar.f280856f.get(b17);
        if (g0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "framesetname:" + b17 + " holder is null");
            return;
        }
        kVar.p0(g0Var, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "markview update isForeGround:" + kVar.f280857g + ", refresh:true");
        if (kVar.f280857g && z17) {
            kVar.f280113d.h().a(hd5.n.ACTION_UPDATE, false, new android.os.Bundle());
        }
    }

    public void Ui() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "onMainSessionExposed, preloadCountWhenMainSessionExposed: " + ((java.lang.Number) ((jz5.n) this.f349020g).mo141623x754a37bb()).intValue());
        ku5.u0 u0Var = ku5.t0.f394148d;
        g05.p pVar = new g05.p(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(pVar, 500L, false);
    }

    public void Vi(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        Ni(str, str2, new android.graphics.Rect(0, 0, wi(), 0), hq0.m0.f364565d);
    }

    public void Zi() {
        iq0.c Di = Di();
        if (Di != null) {
            i95.m c17 = i95.n0.c(gq0.t.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            gq0.t.gj((gq0.t) c17, Di, null, 2, null);
        }
    }

    @Override // jc3.l0
    public void b1() {
        this.f349022i = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "notifyConnException");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
    @Override // qp0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ca(java.lang.String r13, java.util.HashMap r14, yz5.q r15) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g05.r.ca(java.lang.String, java.util.HashMap, yz5.q):void");
    }

    @Override // jc3.l0
    public void d0(boolean z17) {
        g05.j jVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "notifyRecreateBiz");
        this.f349022i = true;
        java.lang.ref.WeakReference weakReference = this.f349021h;
        if (weakReference == null || (jVar = (g05.j) weakReference.get()) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k) jVar).n0();
    }

    @Override // gq0.v
    public void og(org.json.JSONObject data, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        callback.mo146xb9724478(null);
    }

    @Override // jc3.l0
    /* renamed from: onDestroy */
    public void mo252xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "notifyDestroyBiz");
        this.f349023m = null;
    }

    public final int wi() {
        float dimension = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
        bf3.x0 x0Var = bf3.x0.f101207a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.graphics.Point a17 = x0Var.a(context);
        return a06.d.b(java.lang.Math.min(a17.x, a17.y) - (dimension * 2));
    }

    @Override // gq0.v
    public jc3.m xc(java.lang.String containerTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerTag, "containerTag");
        return null;
    }
}
