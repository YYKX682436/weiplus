package fo5;

/* loaded from: classes14.dex */
public final class r0 extends fo5.a {
    public static final int L;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public long E;
    public final fo5.z G;
    public final fo5.q0 H;
    public yz5.a I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f346615J;
    public boolean K;

    /* renamed from: d, reason: collision with root package name */
    public er4.x f346618d;

    /* renamed from: e, reason: collision with root package name */
    public int f346619e;

    /* renamed from: f, reason: collision with root package name */
    public er4.l f346620f;

    /* renamed from: j, reason: collision with root package name */
    public hp5.e f346624j;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.ref.WeakReference f346627m;

    /* renamed from: p, reason: collision with root package name */
    public final ro5.b f346630p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f346632r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f346633s;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f346635u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f346636v;

    /* renamed from: w, reason: collision with root package name */
    public int f346637w;

    /* renamed from: x, reason: collision with root package name */
    public long f346638x;

    /* renamed from: y, reason: collision with root package name */
    public long f346639y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f346640z;

    /* renamed from: b, reason: collision with root package name */
    public er4.r f346616b = er4.r.MP_ROOM_TYPE_VOICE;

    /* renamed from: c, reason: collision with root package name */
    public er4.q f346617c = er4.q.MP_ROOM_ROLE_CALLER;

    /* renamed from: g, reason: collision with root package name */
    public final go5.x f346621g = new go5.x();

    /* renamed from: h, reason: collision with root package name */
    public final gp5.e f346622h = new gp5.e();

    /* renamed from: i, reason: collision with root package name */
    public final po5.i f346623i = new po5.i();

    /* renamed from: k, reason: collision with root package name */
    public final hp5.l f346625k = new hp5.l();

    /* renamed from: l, reason: collision with root package name */
    public final ko5.c f346626l = new ko5.c();

    /* renamed from: n, reason: collision with root package name */
    public final lo5.h f346628n = new lo5.h();

    /* renamed from: o, reason: collision with root package name */
    public final gp5.g f346629o = new gp5.g();

    /* renamed from: q, reason: collision with root package name */
    public final io5.e f346631q = new io5.e(null, new fo5.o(this), 1, null);

    /* renamed from: t, reason: collision with root package name */
    public final long f346634t = 3000;
    public long F = 30000;

    static {
        lp0.b.h();
        L = 119;
    }

    public r0() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5716x51d5635f>(a0Var) { // from class: com.tencent.mm.voipmp.v2.VoIPMPCoreV2$multiTalkActionListener$1
            {
                this.f39173x3fe91575 = 1177822575;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5716x51d5635f c5716x51d5635f) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5716x51d5635f event = c5716x51d5635f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                int i17 = event.f136037g.f87792a;
                er4.r rVar = er4.r.MP_ROOM_TYPE_MULTI_TALK;
                fo5.r0 r0Var = fo5.r0.this;
                am.ck ckVar = event.f136038h;
                if (i17 == 1) {
                    er4.l lVar = r0Var.f346620f;
                    if (((lVar == null || lVar == er4.l.MAIN_UI_CALL_END) ? false : true) && r0Var.f346616b == rVar) {
                        ckVar.f87892a = true;
                    }
                } else if (i17 == 2) {
                    ro5.b bVar = r0Var.f346630p;
                    if (bVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderController");
                        throw null;
                    }
                    if (bVar.mo162803xc7cd3f2e() && r0Var.f346616b == rVar) {
                        ckVar.f87892a = true;
                    }
                }
                return false;
            }
        }.mo48813x58998cd();
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_voipmp_use_rendermp_android, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "Use RenderMP: " + fj6);
        this.f346630p = fj6 ? new ro5.a0() : new ro5.b0();
        gl.i.f354285p.add(new fo5.j(this));
        this.G = new fo5.z(this);
        this.H = new fo5.q0(this);
    }

    public static final void g(fo5.r0 r0Var) {
        r0Var.getClass();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "adpative rotate is not enable");
            return;
        }
        if (((jp5.o) i95.n0.c(jp5.o.class)).a5()) {
            if (r0Var.f346616b == er4.r.MP_ROOM_TYPE_VIDEO && r0Var.f346620f == er4.l.MAIN_UI_TALKING) {
                iq4.c cVar = iq4.b.f375331a;
                cVar.h0(4, false, r0Var.f346631q.a());
                cVar.g();
            }
        }
    }

    public final void A(int i17, er4.r roomType, long j17, int i18, java.lang.String toUser, java.util.ArrayList arrayList, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomType, "roomType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new fo5.o0(this, i17, roomType, j17, i18, toUser, arrayList, z17, null), 3, null);
    }

    public final void B() {
        if (this.f346616b == er4.r.MP_ROOM_TYPE_VOICE) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "roomType is voice, not sync device info to flutter");
            return;
        }
        w();
        z();
        y();
        x();
        ((jp5.o) i95.n0.c(jp5.o.class)).W2(this.f346631q.f375072g == 1 ? 0 : 270);
        h();
        i();
    }

    @Override // fo5.a
    public java.util.ArrayList b() {
        this.f346621g.getClass();
        java.util.List rj6 = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).rj();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(rj6, 10));
        java.util.Iterator it = ((java.util.ArrayList) rj6).iterator();
        while (it.hasNext()) {
            cv.v0 v0Var = (cv.v0) it.next();
            er4.c cVar = new er4.c();
            cVar.f337596g = v0Var.f304052d;
            boolean[] zArr = cVar.f337597h;
            zArr[4] = true;
            cVar.f337594e = v0Var.f304050b;
            zArr[2] = true;
            cVar.f337593d = er4.d.a(v0Var.f304049a);
            zArr[1] = true;
            cVar.f337595f = false;
            zArr[3] = true;
            arrayList.add(cVar);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        kz5.n0.O0(arrayList, arrayList2);
        return arrayList2;
    }

    @Override // fo5.a
    public er4.c c() {
        cv.v0 g17 = this.f346621g.g();
        er4.c cVar = new er4.c();
        cVar.f337596g = g17.f304052d;
        boolean[] zArr = cVar.f337597h;
        zArr[4] = true;
        java.lang.String str = g17.f304050b;
        if (str == null) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6p);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
        }
        cVar.f337594e = str;
        zArr[2] = true;
        cVar.f337593d = er4.d.a(g17.f304049a);
        zArr[1] = true;
        cVar.f337595f = true;
        zArr[3] = true;
        return cVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(13:5|6|7|(1:(1:10)(2:43|44))(2:45|(2:47|48)(2:49|(1:51)))|11|(1:13)(7:25|(1:42)(1:29)|(2:41|35)|36|(2:38|35)|34|35)|14|15|(1:17)|18|(1:20)|21|22))|54|6|7|(0)(0)|11|(0)(0)|14|15|(0)|18|(0)|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ca, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cb, code lost:
    
        r6 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        r5 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067 A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:10:0x0023, B:11:0x005f, B:13:0x0067, B:14:0x00c5, B:25:0x006a, B:27:0x0089, B:29:0x008d, B:35:0x00b0, B:36:0x00a5, B:39:0x0099, B:49:0x004f), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:10:0x0023, B:11:0x005f, B:13:0x0067, B:14:0x00c5, B:25:0x006a, B:27:0x0089, B:29:0x008d, B:35:0x00b0, B:36:0x00a5, B:39:0x0099, B:49:0x004f), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // fo5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.String r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fo5.r0.d(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // fo5.a
    public void e(er4.r rVar, boolean z17) {
        if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoIPMP.CoreV2", "FloatWindowOp Not Allowed");
        }
        i95.m c17 = i95.n0.c(jp5.o.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        jp5.o.R3((jp5.o) c17, context, false, 2, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "launchPageAsync succ ");
    }

    @Override // fo5.a
    public boolean f() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopRecord, curRecorder ");
        go5.x xVar = this.f346621g;
        sb6.append(xVar.e());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.VoIPMPAudioController", sb6.toString());
        ((go5.k) xVar.e()).a();
        xVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0 v0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b;
        boolean z17 = xVar.f355686e;
        v0Var.w(false, go5.w.f355681a);
        return true;
    }

    public final void h() {
        er4.r rVar = this.f346616b;
        if (rVar == er4.r.MP_ROOM_TYPE_MULTI_TALK || rVar == er4.r.MP_ROOM_TYPE_TRANS_MUTLTI) {
            io5.e eVar = this.f346631q;
            int i17 = eVar.f375068c;
            int i18 = eVar.f375072g;
            int i19 = (i17 + (i18 == 1 ? 0 : 270)) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
            int i27 = i18 != 1 ? 270 : 0;
            ro5.b bVar = this.f346630p;
            if (bVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderController");
                throw null;
            }
            int i28 = bVar.b() ? ((360 - i19) + i27) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3 : ((i19 - i27) + com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "pad multi-talk: use adjustRotate(" + i28 + ") as encoder rotation");
            bVar.m(i28);
        }
    }

    public final void i() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.m() && this.f346616b == er4.r.MP_ROOM_TYPE_VIDEO) {
            int i17 = this.f346631q.f375072g == 1 ? 0 : 270;
            ro5.b bVar = this.f346630p;
            if (bVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderController");
                throw null;
            }
            if (!bVar.b()) {
                i17 = (360 - i17) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "p2p video & trifold: use adjustRotate(" + i17 + ") as encoder rotation");
            bVar.m(i17);
        }
    }

    public void j(boolean z17) {
        if (!(bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2538xd14fac7c.C20347x6d75015e()) != -1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "Traffic saving is disable");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "Traffic saving is enable, changeFloatingWindowStatus: " + (z17 ? 1 : 0));
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(4);
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN).clear();
        allocateDirect.putShort(z17 ? (short) 1 : (short) 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.D(L, allocateDirect, allocateDirect.capacity());
    }

    public final boolean k() {
        er4.r rVar = this.f346616b;
        return rVar == er4.r.MP_ROOM_TYPE_MULTI_TALK || rVar == er4.r.MP_ROOM_TYPE_TRANS_MUTLTI;
    }

    public final void l() {
        boolean z17 = this.f346616b == er4.r.MP_ROOM_TYPE_VIDEO;
        go5.x xVar = this.f346621g;
        boolean z18 = true ^ xVar.f355686e;
        boolean z19 = xVar.f355687f;
        ro5.b bVar = this.f346630p;
        if (bVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderController");
            throw null;
        }
        boolean mo162803xc7cd3f2e = bVar.mo162803xc7cd3f2e();
        if (bVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderController");
            throw null;
        }
        boolean f17 = bVar.f();
        if (bVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderController");
            throw null;
        }
        sq4.a aVar = new sq4.a(z17, z18, z19, mo162803xc7cd3f2e, f17, bVar.b(), this.A);
        long j17 = this.f346638x;
        long j18 = this.f346639y;
        long j19 = this.f346616b.f337699d;
        boolean z27 = this.f346640z;
        long j27 = this.f346637w;
        java.lang.String valueOf = java.lang.String.valueOf(xVar.g().f304050b);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7011xe05dc99 c7011xe05dc99 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7011xe05dc99();
        c7011xe05dc99.f143237d = j17;
        c7011xe05dc99.f143238e = j18;
        c7011xe05dc99.f143239f = j19 == 0 ? 1L : 2L;
        c7011xe05dc99.f143240g = z27 ? 1L : 2L;
        c7011xe05dc99.p(aVar.m165056x9616526c());
        c7011xe05dc99.f143243j = j27;
        c7011xe05dc99.f143242i = java.lang.System.currentTimeMillis();
        c7011xe05dc99.q(valueOf);
        c7011xe05dc99.k();
    }

    public final void m(int i17) {
        if (p()) {
            if (t()) {
                l();
                return;
            }
            long j17 = this.f346638x;
            long j18 = this.f346639y;
            long j19 = this.f346616b.f337699d;
            boolean z17 = this.f346640z;
            long j27 = this.f346637w;
            java.lang.String valueOf = java.lang.String.valueOf(this.f346621g.g().f304050b);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7011xe05dc99 c7011xe05dc99 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7011xe05dc99();
            c7011xe05dc99.f143237d = j17;
            c7011xe05dc99.f143238e = j18;
            c7011xe05dc99.f143239f = j19 == 0 ? 1L : 2L;
            c7011xe05dc99.p(java.lang.String.valueOf(i17));
            c7011xe05dc99.f143240g = z17 ? 1L : 2L;
            c7011xe05dc99.f143243j = j27;
            c7011xe05dc99.f143242i = java.lang.System.currentTimeMillis();
            c7011xe05dc99.q(valueOf);
            c7011xe05dc99.k();
        }
    }

    public final boolean n() {
        int h17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2538xd14fac7c.C20341xb5a9b006());
        if (h17 == -1) {
            return false;
        }
        if (h17 == 1) {
            return true;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_ilink_bluetooth_quick_accept_enable, false);
    }

    public final android.app.Activity o() {
        java.lang.ref.WeakReference weakReference = this.f346627m;
        if (weakReference != null) {
            return (android.app.Activity) weakReference.get();
        }
        return null;
    }

    public final boolean p() {
        return this.f346636v && this.f346637w != 0;
    }

    public final void q() {
        ro5.b bVar = this.f346630p;
        if (bVar != null) {
            bVar.g();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderController");
            throw null;
        }
    }

    public final boolean r() {
        er4.l lVar = this.f346620f;
        return lVar != null && lVar == er4.l.MAIN_UI_INVITED;
    }

    public final void s() {
        java.lang.String r17;
        java.lang.String str;
        nq4.e eVar = nq4.e.f420541a;
        java.lang.String b17 = nq4.e.f420541a.b();
        boolean booleanValue = java.lang.Boolean.valueOf(!(b17 == null || b17.length() == 0) && (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, "zh_CN") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, "zh_TW") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, "zh_HK") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, "en"))).booleanValue();
        if (!a() || !r() || !booleanValue) {
            if (booleanValue) {
                return;
            }
            v();
            return;
        }
        gp5.e eVar2 = this.f346622h;
        if (eVar2.f355997e) {
            eVar2.b();
        }
        if (this.f346621g.g().f304049a != 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMP.CoreV2", "Trigger invalid quickAccept in non bluetooth scene");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("launchQuickAccept in caller : ");
        er4.x xVar = this.f346618d;
        sb6.append(xVar != null ? xVar.m128056xfb82e301() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", sb6.toString());
        er4.x xVar2 = this.f346618d;
        if (xVar2 != null) {
            er4.r roomType = this.f346616b;
            er4.q roomRole = this.f346617c;
            fo5.x xVar3 = new fo5.x(this);
            ko5.c cVar = this.f346626l;
            cVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomType, "roomType");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomRole, "roomRole");
            cVar.f391631a = roomType;
            java.lang.String m128056xfb82e301 = xVar2.m128056xfb82e301();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m128056xfb82e301, "getName(...)");
            boolean z17 = roomType == er4.r.MP_ROOM_TYPE_VIDEO;
            if ((roomRole == er4.q.MP_ROOM_ROLE_CALLER) || !nq4.f.f420547a.b()) {
                xVar3.mo152xb9724478();
                return;
            }
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(m128056xfb82e301);
            if (!ip.b.a()) {
                r17 = z17 ? i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f573832mt3) : i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f573834mt5);
            } else if (z17) {
                r17 = e17 + i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f573831mt2);
            } else {
                r17 = e17 + i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f573833mt4);
            }
            if (ip.b.a()) {
                if (z17) {
                    str = "video_" + m128056xfb82e301 + '_' + e17 + "_showDetail";
                } else {
                    str = "voice_" + m128056xfb82e301 + '_' + e17 + "_showDetail";
                }
            } else if (z17) {
                str = "video_" + m128056xfb82e301 + '_' + e17 + "_hideDetail";
            } else {
                str = "voice_" + m128056xfb82e301 + '_' + e17 + "_hideDetail";
            }
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            eVar.c(context, new ko5.b(str, r17, xVar3));
        }
    }

    public final boolean t() {
        int i17 = this.f346637w;
        return i17 == 1 || i17 == 3 || i17 == 5;
    }

    public final void u() {
        er4.l lVar = this.f346620f;
        if (lVar != null) {
            ko5.c cVar = this.f346626l;
            cVar.getClass();
            cVar.f391633c = lVar;
            int ordinal = lVar.ordinal();
            if (ordinal == 0) {
                nq4.f.f420547a.f();
                return;
            }
            if (ordinal == 1) {
                nq4.f.f420547a.c();
            } else if (ordinal == 2) {
                nq4.f.f420547a.d();
            } else {
                if (ordinal != 3) {
                    return;
                }
                nq4.f.f420547a.e();
            }
        }
    }

    public final void v() {
        er4.x xVar = this.f346618d;
        if (xVar != null) {
            gp5.e eVar = this.f346622h;
            java.lang.String m128056xfb82e301 = xVar.m128056xfb82e301();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m128056xfb82e301, "getName(...)");
            er4.r rVar = this.f346616b;
            er4.r rVar2 = er4.r.MP_ROOM_TYPE_VIDEO;
            boolean z17 = rVar == rVar2;
            er4.q qVar = this.f346617c;
            er4.q qVar2 = er4.q.MP_ROOM_ROLE_CALLER;
            boolean z18 = qVar == qVar2;
            qo5.b bVar = qo5.b.f447196a;
            eVar.a(m128056xfb82e301, z17, z18, qo5.b.f447199d, this.f346621g.a(rVar == rVar2, qVar == qVar2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        if (r7 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        r2 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
    
        if (r7 != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            r10 = this;
            com.tencent.mm.plugin.voipmp.platform.v0 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b
            boolean r1 = r0.m()
            r2 = 0
            r3 = 270(0x10e, float:3.78E-43)
            r4 = 1
            io5.e r5 = r10.f346631q
            java.lang.String r6 = "MicroMsg.VoIPMP.CoreV2"
            if (r1 == 0) goto L2a
            java.lang.Class<jp5.o> r1 = jp5.o.class
            i95.m r1 = i95.n0.c(r1)
            jp5.o r1 = (jp5.o) r1
            int r7 = r5.f375069d
            int r8 = r5.f375072g
            if (r8 != r4) goto L20
            r8 = r2
            goto L21
        L20:
            r8 = r3
        L21:
            int r7 = r7 - r8
            int r7 = r7 + 360
            int r7 = r7 % 360
            r1.I6(r7)
            goto L2f
        L2a:
            java.lang.String r1 = "adpative rotate is not enable"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r1)
        L2f:
            er4.r r1 = r10.f346616b
            er4.r r7 = er4.r.MP_ROOM_TYPE_VIDEO
            if (r1 == r7) goto L3b
            java.lang.String r0 = "is not in p2p video"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r0)
            return
        L3b:
            ro5.b r1 = r10.f346630p
            if (r1 == 0) goto L8c
            boolean r7 = r1.b()
            int r8 = r5.f375069d
            int r9 = r5.f375072g
            if (r9 != r4) goto L4a
            goto L4b
        L4a:
            r2 = r3
        L4b:
            int r8 = r8 - r2
            int r8 = r8 + 360
            int r8 = r8 % 360
            r2 = 90
            if (r8 == r2) goto L61
            r2 = 180(0xb4, float:2.52E-43)
            if (r8 == r2) goto L5f
            if (r8 == r3) goto L5c
            r2 = r4
            goto L66
        L5c:
            if (r7 == 0) goto L63
            goto L65
        L5f:
            r2 = 3
            goto L66
        L61:
            if (r7 == 0) goto L65
        L63:
            r2 = 2
            goto L66
        L65:
            r2 = 4
        L66:
            boolean r0 = r0.l()
            if (r0 == 0) goto L6d
            goto L71
        L6d:
            boolean r0 = r5.f375070e
            if (r0 != 0) goto L72
        L71:
            r4 = r2
        L72:
            r1.C(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "send changed ori_"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = " to remote"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r0)
            return
        L8c:
            java.lang.String r0 = "renderController"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fo5.r0.w():void");
    }

    public final void x() {
        jp5.o oVar = (jp5.o) i95.n0.c(jp5.o.class);
        io5.e eVar = this.f346631q;
        oVar.n2((eVar.f375068c + (eVar.f375072g == 1 ? 0 : 270)) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3);
        h();
    }

    public final void y() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.m()) {
            ((jp5.o) i95.n0.c(jp5.o.class)).Hh(this.f346631q.f375071f);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "adpative rotate is not enable");
        }
    }

    public final void z() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.m()) {
            ((jp5.o) i95.n0.c(jp5.o.class)).N5(this.f346631q.f375070e);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "adpative rotate is not enable");
        }
    }
}
