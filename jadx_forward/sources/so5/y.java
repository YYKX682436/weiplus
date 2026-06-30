package so5;

/* loaded from: classes14.dex */
public final class y implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f492453d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f492454e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f492455f;

    /* renamed from: g, reason: collision with root package name */
    public final so5.a0 f492456g;

    /* renamed from: h, reason: collision with root package name */
    public final to5.c f492457h;

    /* renamed from: i, reason: collision with root package name */
    public final bp5.k f492458i;

    /* renamed from: m, reason: collision with root package name */
    public final yo5.h f492459m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f492460n;

    /* renamed from: o, reason: collision with root package name */
    public final yz5.l f492461o;

    /* renamed from: p, reason: collision with root package name */
    public final int f492462p;

    /* renamed from: q, reason: collision with root package name */
    public final so5.t[] f492463q;

    /* renamed from: r, reason: collision with root package name */
    public final so5.n[] f492464r;

    /* renamed from: s, reason: collision with root package name */
    public final bp5.h[] f492465s;

    /* renamed from: t, reason: collision with root package name */
    public final int f492466t;

    /* renamed from: u, reason: collision with root package name */
    public final java.nio.ByteBuffer f492467u;

    /* renamed from: v, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f492468v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f492469w;

    /* renamed from: x, reason: collision with root package name */
    public long f492470x;

    public y(boolean z17, boolean z18, boolean z19, so5.a0 hwCodecManager, to5.c engineOp, bp5.k renderTargetHolder, yo5.h handlerDispatcher, java.util.List list, yz5.l qosSizeChange) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hwCodecManager, "hwCodecManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engineOp, "engineOp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderTargetHolder, "renderTargetHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handlerDispatcher, "handlerDispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qosSizeChange, "qosSizeChange");
        this.f492453d = z17;
        this.f492454e = z18;
        this.f492455f = z19;
        this.f492456g = hwCodecManager;
        this.f492457h = engineOp;
        this.f492458i = renderTargetHolder;
        this.f492459m = handlerDispatcher;
        this.f492460n = list;
        this.f492461o = qosSizeChange;
        this.f492462p = 2;
        so5.t[] tVarArr = new so5.t[2];
        for (int i17 = 0; i17 < 2; i17++) {
            tVarArr[i17] = so5.q.f492439b;
        }
        this.f492463q = tVarArr;
        int i18 = this.f492462p;
        so5.n[] nVarArr = new so5.n[i18];
        for (int i19 = 0; i19 < i18; i19++) {
            nVarArr[i19] = new so5.n(0, 0, false, false, false);
        }
        this.f492464r = nVarArr;
        int i27 = this.f492462p;
        bp5.h[] hVarArr = new bp5.h[i27];
        for (int i28 = 0; i28 < i27; i28++) {
            hVarArr[i28] = null;
        }
        this.f492465s = hVarArr;
        this.f492466t = this.f492453d ? 78 : 61;
        this.f492467u = java.nio.ByteBuffer.allocateDirect(14);
        this.f492468v = p3325xe03a0797.p3326xc267989b.z0.a(this.f492459m.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        this.f492469w = this.f492460n == null;
    }

    public final void a(short s17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ILinkVoIP.EncoderManager", "closeCodec() called with: targetCodec = " + ((int) s17) + ", codecFlag = " + i17);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(6);
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN).clear();
        allocateDirect.putShort((short) i17).putShort(s17).putShort((short) 0);
        this.f492457h.b(39, allocateDirect, allocateDirect.capacity());
    }

    public final void b(int i17, so5.t tVar) {
        if (!this.f492469w) {
            this.f492469w = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.EncoderManager", "before setLocalQoS: ");
            java.util.List<so5.a> list = this.f492460n;
            if (list != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.EncoderManager", "after setLocalQoS: ");
                to5.c engineOp = this.f492457h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engineOp, "engineOp");
                for (so5.a config : list) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.EncoderQoSConfigHelper", "configCodec: " + config);
                    java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(12);
                    allocateDirect.order(java.nio.ByteOrder.BIG_ENDIAN);
                    allocateDirect.position(2);
                    java.nio.ByteBuffer put = allocateDirect.put(config.f492318a).put(config.f492319b).put(config.f492320c).put(config.f492321d).put(config.f492322e).put(config.f492323f);
                    int i18 = config.f492324g;
                    put.put((byte) (i18 & 65535)).put((byte) ((i18 >> 8) & 65535)).put((byte) ((i18 >> 16) & 65535)).put((byte) ((i18 >> 24) & 65535));
                    engineOp.b(98, allocateDirect, allocateDirect.capacity());
                    if (allocateDirect.get(0) == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ILinkVoIP.EncoderQoSConfigHelper", "configCodec: config error " + config);
                    }
                }
            }
        }
        if (!(tVar instanceof so5.s)) {
            if (tVar instanceof so5.o) {
                i(i17);
                c(i17, false);
                return;
            } else if (tVar instanceof so5.p) {
                i(i17);
                c(i17, true);
                return;
            } else {
                if (tVar instanceof so5.q) {
                    i(i17);
                    return;
                }
                return;
            }
        }
        i(i17);
        uo5.u uVar = ((so5.s) tVar).f492440b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.EncoderManager", "configSWEncoder() called with: wayIndex = " + i17);
        bp5.c cVar = new bp5.c(new so5.x(this));
        int i19 = uVar.f511277a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init ");
        sb6.append(i19);
        sb6.append(' ');
        int i27 = uVar.f511278b;
        sb6.append(i27);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MVR.ImageReaderWrapper", sb6.toString());
        if (cVar.f104985e != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MVR.ImageReaderWrapper", "already has an instance, release first");
            cVar.close();
        }
        cVar.f104985e = android.media.ImageReader.newInstance(i19, i27, 1, 2);
        cVar.f104986f = new android.util.Size(i19, i27);
        android.media.ImageReader imageReader = cVar.f104985e;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(new bp5.b(cVar), null);
        }
        bp5.h[] hVarArr = this.f492465s;
        bp5.h hVar = hVarArr[i17];
        java.io.Closeable closeable = hVar instanceof java.io.Closeable ? (java.io.Closeable) hVar : null;
        if (closeable != null) {
            closeable.close();
        }
        hVarArr[i17] = cVar;
        this.f492458i.a((i17 << 16) | com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965, cVar);
        this.f492464r[i17].f492421c = true;
    }

    public final void c(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.EncoderManager", "configHWEncoder() called with: wayIndex = " + i17 + ", hevc = " + z17);
        wo5.b bVar = new wo5.b(z17, (android.os.Handler) ((jz5.n) this.f492459m.f545904g).mo141623x754a37bb(), new so5.w(this, i17));
        ((ro5.d) this.f492456g).getClass();
        to5.c engineOp = this.f492457h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engineOp, "engineOp");
        uo5.l lVar = new uo5.l(true, new uo5.b(ro5.d.f479712b, bVar, new wo5.e(engineOp, bVar.f529848a, i17)));
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f492468v;
        p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new so5.v(lVar, i17, z17, this, null), 3, null);
        bp5.f fVar = new bp5.f(y0Var, lVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecEncoderWrapper", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        ((uo5.l) fVar.f104992e).f();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = fVar.f104994g;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        fVar.f104994g = p3325xe03a0797.p3326xc267989b.l.d(fVar.f104991d, null, null, new bp5.e(fVar, null), 3, null);
        bp5.h[] hVarArr = this.f492465s;
        bp5.h hVar = hVarArr[i17];
        java.io.Closeable closeable = hVar instanceof java.io.Closeable ? (java.io.Closeable) hVar : null;
        if (closeable != null) {
            closeable.close();
        }
        hVarArr[i17] = fVar;
        this.f492458i.a((i17 << 16) | com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965, fVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.EncoderManager", "close");
        int length = this.f492465s.length;
        for (int i17 = 0; i17 < length; i17++) {
            i(i17);
        }
        so5.t[] tVarArr = this.f492463q;
        int length2 = tVarArr.length;
        for (int i18 = 0; i18 < length2; i18++) {
            tVarArr[i18] = so5.q.f492439b;
        }
        this.f492469w = false;
    }

    public final void f(boolean z17, int i17, uo5.u newParams) {
        uo5.q qVar;
        java.lang.Object m143895xf1229813;
        bp5.f fVar;
        uo5.q qVar2;
        uo5.q qVar3;
        uo5.q qVar4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newParams, "newParams");
        byte b17 = newParams.f511282f;
        boolean z18 = newParams.f511283g;
        if (!z18 || (!(z17 && this.f492455f) && (z17 || !this.f492454e))) {
            if (z18) {
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ILinkVoIP.EncoderManager", "close hevc codec for way idx " + i17);
                    a((short) b17, 2);
                    return;
                }
                if (z17) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ILinkVoIP.EncoderManager", "close avc codec for way idx " + i17);
                a((short) b17, 2);
                return;
            }
            return;
        }
        so5.n[] nVarArr = this.f492464r;
        so5.n nVar = nVarArr[i17];
        if (nVar.f492420b > 2 || nVar.f492419a > 2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("close local encoder ");
            short s17 = b17;
            sb6.append((int) s17);
            sb6.append(" for way idx ");
            sb6.append(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ILinkVoIP.EncoderManager", sb6.toString());
            a(s17, 2);
            return;
        }
        so5.t[] tVarArr = this.f492463q;
        if ((z17 && !(tVarArr[i17] instanceof so5.p)) || ((!z17 && !(tVarArr[i17] instanceof so5.o)) || nVar.f492423e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.EncoderManager", "hwLogic: newParams " + newParams + ", needRecreate " + nVarArr[i17].f492423e);
            nVarArr[i17].f492423e = false;
            so5.t pVar = z17 ? new so5.p(newParams) : new so5.o(newParams);
            tVarArr[i17] = pVar;
            b(i17, pVar);
        }
        if (newParams.f511284h) {
            tVarArr[i17].f492441a = false;
            return;
        }
        so5.t tVar = tVarArr[i17];
        boolean z19 = true;
        tVar.f492441a = true;
        boolean z27 = newParams.f511285i;
        bp5.h[] hVarArr = this.f492465s;
        if (z27) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.EncoderManager", i17 + " request I frame, mPrevMakeIMs: " + this.f492470x + ", lMakeIMs: " + currentTimeMillis);
            if (currentTimeMillis - this.f492470x >= 500) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.EncoderManager", i17 + " request I frame");
                bp5.h hVar = hVarArr[i17];
                bp5.f fVar2 = hVar instanceof bp5.f ? (bp5.f) hVar : null;
                if (fVar2 != null && (qVar4 = fVar2.f104992e) != null) {
                    uo5.l lVar = (uo5.l) qVar4;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f511259c, "requestIFrame");
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("request-sync", 0);
                    lVar.d(bundle);
                }
                this.f492470x = currentTimeMillis;
            }
        }
        if (tVar instanceof so5.r) {
            uo5.u uVar = ((so5.r) tVar).f492440b;
            if (uVar.f511277a == newParams.f511277a && uVar.f511278b == newParams.f511278b) {
                z19 = false;
            }
            byte b18 = newParams.f511281e;
            if (!z19 && !nVarArr[i17].f492422d) {
                short s18 = uVar.f511279c;
                short s19 = newParams.f511279c;
                if (s18 == s19) {
                    if (uVar.f511281e != b18) {
                        bp5.h hVar2 = hVarArr[i17];
                        fVar = hVar2 instanceof bp5.f ? (bp5.f) hVar2 : null;
                        if (fVar == null || (qVar2 = fVar.f104992e) == null) {
                            return;
                        }
                        ((uo5.l) qVar2).b(b18 & 255);
                        return;
                    }
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.EncoderManager", i17 + " hwLogic: bitrate change newParams " + newParams);
                tVarArr[i17] = z17 ? new so5.p(newParams) : new so5.o(newParams);
                bp5.h hVar3 = hVarArr[i17];
                fVar = hVar3 instanceof bp5.f ? (bp5.f) hVar3 : null;
                if (fVar == null || (qVar3 = fVar.f104992e) == null) {
                    return;
                }
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("video-bitrate", s19 * 1000);
                uo5.l lVar2 = (uo5.l) qVar3;
                lVar2.d(bundle2);
                lVar2.b(b18 & 255);
                return;
            }
            this.f492461o.mo146xb9724478(newParams);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.EncoderManager", i17 + " hwLogic: size change newParams " + newParams + ", needReset: " + nVarArr[i17].f492422d);
            nVarArr[i17].f492422d = false;
            tVarArr[i17] = z17 ? new so5.p(newParams) : new so5.o(newParams);
            bp5.h hVar4 = hVarArr[i17];
            bp5.f fVar3 = hVar4 instanceof bp5.f ? (bp5.f) hVar4 : null;
            if (fVar3 == null || (qVar = fVar3.f104992e) == null) {
                return;
            }
            uo5.l lVar3 = (uo5.l) qVar;
            java.lang.String str = lVar3.f511259c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "resetCodec");
            lVar3.e(uo5.g.f511252a);
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                uo5.r rVar = lVar3.f511262f;
                if (rVar != null) {
                    ((uo5.s) rVar).f511272a.stop();
                    lVar3.f511261e = null;
                    ((uo5.s) rVar).f511272a.reset();
                }
                lVar3.e(uo5.f.f511251a);
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, m143898xd4a2fc34, "codec call error", new java.lang.Object[0]);
                java.lang.String message = m143898xd4a2fc34.getMessage();
                lVar3.c(message != null ? message : "codec call error");
            }
            p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
            lVar3.f();
            lVar3.b(b18 & 255);
        }
    }

    public final void i(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ILinkVoIP.EncoderManager", "releaseCurrentCodec() called with: wayIndex = " + i17);
        bp5.h[] hVarArr = this.f492465s;
        bp5.h hVar = hVarArr[i17];
        if (hVar != null) {
            this.f492458i.c((i17 << 16) | com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965, hVar);
        }
        bp5.h hVar2 = hVarArr[i17];
        java.io.Closeable closeable = hVar2 instanceof java.io.Closeable ? (java.io.Closeable) hVar2 : null;
        if (closeable != null) {
            closeable.close();
        }
        hVarArr[i17] = null;
    }

    public final void j(int i17, uo5.u uVar) {
        so5.t[] tVarArr = this.f492463q;
        if (!(tVarArr[i17] instanceof so5.s)) {
            so5.s sVar = new so5.s(uVar);
            tVarArr[i17] = sVar;
            b(i17, sVar);
        }
        so5.t tVar = tVarArr[i17];
        boolean z17 = true;
        tVar.f492441a = !uVar.f511284h;
        if (tVar instanceof so5.r) {
            uo5.u uVar2 = ((so5.r) tVar).f492440b;
            if (uVar2.f511277a == uVar.f511277a && uVar2.f511278b == uVar.f511278b) {
                z17 = false;
            }
            if (z17) {
                this.f492461o.mo146xb9724478(uVar);
                so5.s sVar2 = new so5.s(uVar);
                tVarArr[i17] = sVar2;
                b(i17, sVar2);
            }
        }
    }
}
