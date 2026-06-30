package xg4;

/* loaded from: classes7.dex */
public final class p extends hq0.i0 {
    public jc3.x A;
    public oe0.w B;
    public oe0.v C;
    public xg4.e D;
    public final jz5.g E;

    /* renamed from: x, reason: collision with root package name */
    public final xg4.p f535986x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.Collection f535987y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashSet f535988z;

    public p() {
        super(null, 1, null);
        this.f535986x = this;
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5 f5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4 d4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 Vc = f5Var.Vc(764);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(Vc, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<*>");
        this.f535987y = kz5.n0.t0(kz5.c0.i(new vg4.b(), new vg4.a(), new sg4.a(), new sg4.c(), new sg4.b(), new lq0.g(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m5) d4Var).Ni((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f) Vc, "wxe208ce76dfa39515"), new wg4.a(), new ug4.a(), new ug4.b()), ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f4.class))).Ni("MagicLiveCard"));
        java.lang.String name = mg4.d.class.getName();
        java.lang.String name2 = mg4.c.class.getName();
        java.lang.String name3 = vb1.v.class.getName();
        ((et.o) ((ft.b4) i95.n0.c(ft.b4.class))).getClass();
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.eb();
        java.lang.String name4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.eb.class.getName();
        ((op0.k) ((op0.i) i95.n0.c(op0.i.class))).getClass();
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o8();
        this.f535988z = kz5.p1.d(name, name2, name3, name4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o8.class.getName(), f5Var.Vc(251).getClass().getName(), f5Var.Vc(969).getClass().getName(), f5Var.Vc(970).getClass().getName(), f5Var.Vc(984).getClass().getName(), f5Var.Vc(1065).getClass().getName(), f5Var.Vc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.r.f34013x366c91de).getClass().getName(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.g0.class.getName(), f5Var.Vc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.m0.f33740x366c91de).getClass().getName());
        this.E = jz5.h.b(new xg4.o(this));
    }

    @Override // lc3.e
    public android.app.Activity B0() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.util.Collection values;
        fq0.x xVar;
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d;
        java.util.Collection values2 = this.f364534p.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "<get-values>(...)");
        hq0.e0 e0Var = (hq0.e0) kz5.n0.Y(values2);
        android.content.Context context = (e0Var == null || (concurrentHashMap = e0Var.f364518f) == null || (values = concurrentHashMap.values()) == null || (xVar = (fq0.x) kz5.n0.Y(values)) == null || (c10867x3e50a04d = xVar.f347021l) == null) ? null : c10867x3e50a04d.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            return activity;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r2.f149185d;
        return weakReference != null ? (android.app.Activity) weakReference.get() : null;
    }

    @Override // lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerTag, "containerTag");
        return new tp0.l();
    }

    public final jc3.x J1() {
        jc3.x xVar = this.A;
        if (xVar != null) {
            return xVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkg");
        throw null;
    }

    public final void N1() {
        yg4.a aVar = yg4.a.f543861a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicLiveCardReporter", "resetReport");
        yg4.a.f543862b.clear();
        yg4.a.f543863c.clear();
    }

    @Override // hq0.i0
    public java.lang.String O0() {
        return "MagicLiveCard";
    }

    @Override // hq0.i0, jc3.u
    public void Q9(java.lang.String envId, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(envId, "envId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        super.Q9(envId, msg);
        yg4.a aVar = yg4.a.f543861a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1740, yg4.a.f543864d);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7027x2fee734d c7027x2fee734d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7027x2fee734d();
        c7027x2fee734d.f143437e = c7027x2fee734d.b("AppId", "wx2f3fb5db9f226462", true);
        c7027x2fee734d.f143438f = 0L;
        c7027x2fee734d.f143441i = c7027x2fee734d.b("ErrorMessage", msg, true);
        c7027x2fee734d.f143436d = 1L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicLiveCardReporter", "reportJsException report appId:" + c7027x2fee734d.f143437e + " ErrMsg:" + c7027x2fee734d.f143441i);
        c7027x2fee734d.k();
    }

    @Override // hq0.i0
    public void X0() {
        super.X0();
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        jc3.j0 j0Var = this.f364528g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var);
        this.A = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.T9((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) c17, ((rc3.w0) j0Var).f475620e, null, 2, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b(null, null, null, null, false, false, false, null, false, null, 1023, null);
        xg4.p bizContext = this.f535986x;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizContext, "bizContext");
        c16416x87606a7b.f229367x = bizContext;
        c16416x87606a7b.f229354h = z65.c.a();
        c16416x87606a7b.f229365v = ((je3.i) i95.n0.c(je3.i.class)).Ii(0.01f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.y4.a(c16416x87606a7b, this.f535988z);
        c16416x87606a7b.a(this.f535987y);
        I1(c16416x87606a7b);
        mo123044x68ac462();
    }

    @Override // hq0.i0, jc3.u
    public void b1() {
        super.b1();
        oe0.v vVar = this.C;
        if (vVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bj) vVar).a("dynamicCardServerLost", new org.json.JSONObject());
        }
        oe0.w wVar = this.B;
        if (wVar != null) {
            wVar.a("dynamicCardServerLost", new org.json.JSONObject());
        }
        if (this.D != null) {
            xg4.q[] qVarArr = xg4.q.f535989d;
            xg4.m mVar = xg4.m.f535979a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SurfaceApp.MagicLiveCardMgr", "cleanUpService");
            xg4.p pVar = xg4.m.f535980b;
            if (pVar != null) {
                pVar.mo123041x5cd39ffa();
            }
            xg4.m.f535980b = null;
        }
        yg4.a aVar = yg4.a.f543861a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1740, yg4.a.f543865e);
        ((com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) ((jz5.n) this.E).mo141623x754a37bb()).mo48814x2efc64();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r2 = yg4.a.f543861a;
        r0 = r0.f347011b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, "frameSetId");
        r7 = ((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).Ai(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r7 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        r7 = r7.f347010a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r7 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        r14 = yg4.a.f543862b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r14.containsKey(r7) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r7.length() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r8 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        r16 = java.lang.System.currentTimeMillis();
        r8 = (java.lang.Long) r14.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r8 = 0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        r12 = r8.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        if (r12 != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicLiveCardReporter", "markFirstFrameForScene startTime 0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        r2.a(r7, 17, r12, r16 - r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r7, "portrait_game_outfits") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        r4 = (java.lang.Long) r14.get("portrait_game_outfits_data_available");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        if (r4 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        r4 = 0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        r12 = r4.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        if (r12 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        r2.a("portrait_game_outfits_data_available", 17, r12, r16 - r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c7, code lost:
    
        r4 = yg4.a.f543863c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
    
        if (r4.containsKey(r0) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d3, code lost:
    
        if (r0.length() != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d8, code lost:
    
        if (r7 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        r7 = java.lang.System.currentTimeMillis();
        r4 = (java.lang.Long) r4.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ee, code lost:
    
        if (r4 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f0, code lost:
    
        r4 = 0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f4, code lost:
    
        r12 = r4.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fa, code lost:
    
        if (r12 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fc, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicLiveCardReporter", "markFrameSetFirstRender startTime 0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0103, code lost:
    
        r14 = r7 - r12;
        r0 = ((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).Ai(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0111, code lost:
    
        if (r0 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0113, code lost:
    
        r0 = r0.f347010a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0115, code lost:
    
        if (r0 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0118, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011f, code lost:
    
        if (r9.length() <= 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0121, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0124, code lost:
    
        if (r4 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0126, code lost:
    
        r2.a(r9, 3, r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0123, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011a, code lost:
    
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d7, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00da, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicLiveCardReporter", "markFrameSetFirstRender no start or frameSetId null:".concat(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0068, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012d, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicLiveCardReporter", "markFirstFrameForScene frameSetName:" + r7 + " has no start time");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0145, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return;
     */
    @Override // hq0.i0, jc3.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xg4.p.c(int, boolean):void");
    }

    @Override // hq0.i0
    /* renamed from: destroy */
    public void mo123041x5cd39ffa() {
        super.mo123041x5cd39ffa();
        this.B = null;
        this.C = null;
        this.D = null;
        ((uz.e2) ((vz.p1) i95.n0.c(vz.p1.class))).getClass();
        vz.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.k2.f178610a;
        if (i1Var != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178442f).remove(i1Var);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178440d;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.k2.f178610a = null;
        N1();
    }

    @Override // hq0.i0, jc3.u
    public void n() {
        super.n();
        ((ku5.t0) ku5.t0.f394148d).q(new xg4.n(this));
    }

    @Override // hq0.i0, jc3.u
    /* renamed from: onCreated */
    public void mo123042x8cf48009() {
        super.mo123042x8cf48009();
        ((com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) ((jz5.n) this.E).mo141623x754a37bb()).mo48813x58998cd();
    }

    @Override // hq0.i0, jc3.u
    /* renamed from: onDestroy */
    public void mo123043xac79a11b(int i17) {
        super.mo123043xac79a11b(i17);
        ((com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) ((jz5.n) this.E).mo141623x754a37bb()).mo48814x2efc64();
    }

    @Override // hq0.i0
    public void s1(hq0.e0 root, fq0.x frameSet, java.lang.String info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        yg4.a.f543861a.b(frameSet.f347010a);
        if (frameSet.f347021l == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SurfaceApp.MagicLiveCardService", "sclView empty, addCustomView error");
        }
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = frameSet.f347021l;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c10867x3e50a04d);
        frameSet.f347025p = C0(c10867x3e50a04d);
        super.s1(root, frameSet, info);
    }
}
