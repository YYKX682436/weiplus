package ro5;

/* loaded from: classes14.dex */
public final class b0 implements ro5.b {

    /* renamed from: a, reason: collision with root package name */
    public ro5.j f479677a;

    /* renamed from: b, reason: collision with root package name */
    public ro5.m1 f479678b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f479680d;

    /* renamed from: f, reason: collision with root package name */
    public so5.k0 f479682f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f479683g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f479684h;

    /* renamed from: i, reason: collision with root package name */
    public int f479685i;

    /* renamed from: k, reason: collision with root package name */
    public int f479687k;

    /* renamed from: n, reason: collision with root package name */
    public fp5.a f479690n;

    /* renamed from: o, reason: collision with root package name */
    public final so5.n0 f479691o;

    /* renamed from: p, reason: collision with root package name */
    public final android.util.SparseArray f479692p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f479693q;

    /* renamed from: r, reason: collision with root package name */
    public int f479694r;

    /* renamed from: c, reason: collision with root package name */
    public er4.r f479679c = er4.r.MP_ROOM_TYPE_VIDEO;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f479681e = new java.lang.ref.WeakReference(null);

    /* renamed from: j, reason: collision with root package name */
    public int f479686j = 8;

    /* renamed from: l, reason: collision with root package name */
    public int f479688l = 32;

    /* renamed from: m, reason: collision with root package name */
    public final so5.z f479689m = new ro5.m(this);

    public b0() {
        so5.n0 n0Var = new so5.n0();
        n0Var.a(new ro5.k(this));
        this.f479691o = n0Var;
        this.f479692p = new android.util.SparseArray();
        this.f479693q = new java.util.concurrent.ConcurrentSkipListSet();
    }

    @Override // ro5.b
    public void A(int i17, java.nio.ByteBuffer byteBuffer, int i18, int i19, int i27, int i28) {
        to5.c cVar;
        java.lang.Boolean bool;
        boolean z17;
        java.lang.Object m143895xf1229813;
        ro5.m1 m1Var = this.f479678b;
        if (m1Var == null || (cVar = m1Var.f479791t) == null) {
            return;
        }
        android.util.SparseArray sparseArray = cVar.f502537d;
        jz5.o oVar = (jz5.o) sparseArray.get(i17);
        if (oVar != null) {
            bool = java.lang.Boolean.valueOf(((java.lang.Number) oVar.f384374d).intValue() == i19 && ((java.lang.Number) oVar.f384375e).intValue() == i27 && ((java.lang.Number) oVar.f384376f).intValue() == i28);
        } else {
            bool = null;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            z17 = false;
        } else {
            sparseArray.put(i17, new jz5.o(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28)));
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPEngineOp", "onOnVideoFrameEvent() params change to: memberId = " + i17 + ", dataPtr = " + byteBuffer + ", dataLen = " + i18 + ", width = " + i19 + ", height = " + i27 + ", format = " + i28);
        }
        if (byteBuffer == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ILinkVoIPEngineOp", "data buffer is null");
            return;
        }
        cp5.a a17 = cVar.f502534a.a(i18, !((i28 & 18) == 18 || (i28 & 19) == 19));
        java.nio.ByteBuffer a18 = a17.a();
        if (a18 == null) {
            return;
        }
        if (a18.capacity() < i18 || i18 < 0) {
            throw new java.lang.RuntimeException("on video frame event datalen error " + i18);
        }
        synchronized (a18) {
            byteBuffer.clear();
            byteBuffer.limit(i18);
            a18.put(byteBuffer);
        }
        boolean z18 = (i28 & 128) == 128;
        boolean z19 = (i28 & 2048) == 2048;
        to5.b bVar = cVar.f502535b;
        if (bVar != null) {
            to5.a aVar = new to5.a(i17, a17, i19, i27, i28, z18, 4, z19);
            ro5.i0 i0Var = (ro5.i0) bVar;
            int i29 = aVar.f502529e;
            boolean z27 = (i29 & 18) == 18 || (i29 & 19) == 19;
            ro5.m1 m1Var2 = i0Var.f479741a;
            if (!z27) {
                p3325xe03a0797.p3326xc267989b.l.d((p3325xe03a0797.p3326xc267989b.y0) m1Var2.f479775d.f537332m.mo141623x754a37bb(), null, null, new ro5.h0(m1Var2, aVar, null), 3, null);
                return;
            }
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                java.nio.ByteBuffer a19 = aVar.f502526b.a();
                if (a19 != null) {
                    a19.rewind();
                }
                ((so5.m) m1Var2.f479795x.mo141623x754a37bb()).c(aVar);
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MVR.VoIPMPRenderLogic", m143898xd4a2fc34, "handle result", new java.lang.Object[0]);
            }
        }
    }

    @Override // ro5.b
    public void B() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController", "releaseVideoResource");
        so5.k0 k0Var = this.f479682f;
        if (k0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPCameraHelper", "stopCameraSync: ");
            k0Var.f492400q = false;
            zq4.b bVar = k0Var.f492392f;
            if (bVar != null) {
                bVar.e();
            }
        }
        this.f479682f = null;
        this.f479691o.c();
        z(false);
        ro5.m1 m1Var = this.f479678b;
        if (m1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MVR.VoIPMPRenderLogic", "release released " + m1Var.f479781j);
            if (!m1Var.f479781j) {
                m1Var.f479781j = true;
                ((mo5.b) m1Var.f479794w.mo141623x754a37bb()).f411959e = null;
                p3325xe03a0797.p3326xc267989b.z0.e(m1Var.f479777f, null, 1, null);
                boolean z17 = m1Var.f479782k;
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = m1Var.f479783l;
                ep5.d dVar = m1Var.f479780i;
                p3325xe03a0797.p3326xc267989b.l.d(dVar.f337306a, null, null, new ep5.c(dVar, concurrentHashMap, z17, null), 3, null);
                android.util.SparseArray sparseArray = m1Var.f479796y;
                int size = sparseArray.size();
                for (int i17 = 0; i17 < size; i17++) {
                    sparseArray.keyAt(i17);
                    ((ro5.f0) sparseArray.valueAt(i17)).f479724a.release();
                }
                sparseArray.clear();
                m1Var.f479793v.close();
                ((so5.m) m1Var.f479795x.mo141623x754a37bb()).close();
                xo5.n nVar = m1Var.f479775d;
                p3325xe03a0797.p3326xc267989b.l.d((p3325xe03a0797.p3326xc267989b.y0) nVar.f537332m.mo141623x754a37bb(), null, null, new ro5.d1(m1Var, null), 3, null);
                p3325xe03a0797.p3326xc267989b.l.d((p3325xe03a0797.p3326xc267989b.y0) nVar.f537330h.mo141623x754a37bb(), null, null, new ro5.e1(m1Var, null), 3, null);
                p3325xe03a0797.p3326xc267989b.l.d(nVar.f537328f, null, null, new ro5.f1(m1Var, null), 3, null);
                nVar.close();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ILinkVoIPRenderLogic release: close hander: ");
                int i18 = m1Var.f479774c;
                sb6.append(i18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MVR.VoIPMPRenderLogic", sb6.toString());
                if (i18 == 1) {
                    m1Var.f479792u.close();
                }
            }
        }
        this.f479678b = null;
        this.f479683g = false;
        yz5.a aVar = zo5.d.f556412a;
        zo5.d.f556412a = ro5.s.f479824d;
    }

    @Override // ro5.b
    public void C(int i17) {
        to5.c cVar;
        ro5.m1 m1Var = this.f479678b;
        if (m1Var == null || (cVar = m1Var.f479791t) == null) {
            return;
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(4);
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocateDirect.put((byte) i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPEngineOp", "setOri: " + i17 + " ret " + cVar.b(21, allocateDirect, allocateDirect.capacity()));
    }

    @Override // ro5.b
    public void D(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController", "bindSelfMid: " + i17);
        this.f479694r = i17;
        so5.k0 k0Var = this.f479682f;
        if (k0Var != null) {
            k0Var.a(i17);
        }
        ro5.j jVar = this.f479677a;
        if (jVar != null) {
            jVar.f479751e = this.f479694r;
        }
    }

    @Override // ro5.b
    public boolean H0() {
        so5.k0 k0Var = this.f479682f;
        boolean z17 = k0Var != null ? k0Var.f492391e : true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController", "isCameraPause " + z17);
        return z17;
    }

    @Override // ro5.b
    public void a() {
        so5.k0 k0Var = this.f479682f;
        java.lang.Boolean bool = null;
        if (k0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPCameraHelper", "markActivityResume: needDelayOpen " + k0Var.f492400q);
            boolean z17 = false;
            if (k0Var.f492400q && !k0Var.b()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ILinkVoIPCameraHelper", "markActivityResume: delay open cam");
                boolean c17 = so5.k0.c(k0Var, true, false, 2, null);
                k0Var.f492400q = false;
                z17 = c17;
            }
            bool = java.lang.Boolean.valueOf(z17);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            this.f479691o.b();
        }
    }

    @Override // ro5.b
    public boolean b() {
        zq4.b bVar;
        so5.k0 k0Var = this.f479682f;
        if (k0Var == null || (bVar = k0Var.f492392f) == null) {
            return false;
        }
        return bVar.f556574a;
    }

    @Override // ro5.b
    public void c(int i17, bp5.h hVar) {
        ro5.m1 m1Var;
        if (hVar == null || (m1Var = this.f479678b) == null) {
            return;
        }
        m1Var.f(i17, hVar);
    }

    @Override // ro5.b
    public void d(er4.r roomType) {
        ro5.m1 m1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomType, "roomType");
        if (this.f479679c != roomType) {
            this.f479679c = roomType;
            if (roomType == er4.r.MP_ROOM_TYPE_VIDEO || (m1Var = this.f479678b) == null) {
                return;
            }
            m1Var.A = 0;
        }
    }

    @Override // ro5.b
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController", "closeCamera");
        so5.k0 k0Var = this.f479682f;
        if (k0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPCameraHelper", "stopCamera: ");
            k0Var.f492400q = false;
            p3325xe03a0797.p3326xc267989b.l.d(k0Var.f492390d, null, null, new so5.h0(k0Var, null), 3, null);
        }
    }

    @Override // ro5.b
    public boolean f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController", "checkVirtualBackgroundState: enable " + this.f479680d);
        return this.f479680d;
    }

    @Override // ro5.b
    public synchronized void g() {
        if (this.f479678b == null) {
            ro5.m1 m1Var = new ro5.m1(ro5.d.f479711a, this.f479689m, so5.o0.f492428a.a());
            m1Var.f479779h = new ro5.n(this);
            yz5.a aVar = zo5.d.f556412a;
            zo5.d.f556412a = new ro5.o(this);
            if (this.f479682f == null) {
                this.f479682f = new so5.k0();
            }
            so5.k0 k0Var = this.f479682f;
            if (k0Var != null) {
                k0Var.f492396m = new ro5.p(this, null);
            }
            so5.k0 k0Var2 = this.f479682f;
            if (k0Var2 != null) {
                k0Var2.f492397n = new ro5.q(this, null);
            }
            so5.k0 k0Var3 = this.f479682f;
            if (k0Var3 != null) {
                k0Var3.a(this.f479694r);
            }
            ro5.j jVar = this.f479677a;
            if (jVar != null) {
                jVar.f479751e = this.f479694r;
            }
            this.f479678b = m1Var;
        }
    }

    @Override // ro5.b
    public er4.w h(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController", "blackscreen: " + this.f479677a + " for mid " + j17);
        if (this.f479677a == null) {
            this.f479693q.add(java.lang.Long.valueOf(j17));
        }
        ro5.j jVar = this.f479677a;
        ro5.c a17 = jVar != null ? jVar.a((int) j17) : null;
        er4.w wVar = new er4.w();
        wVar.d(a17 != null ? a17.f479701b : 1.0d);
        wVar.e(a17 != null ? a17.f479702c : 0L);
        wVar.f(a17 != null ? a17.f479700a : 0L);
        wVar.g(a17 != null ? a17.f479703d : 0.0d);
        wVar.b(a17 != null ? a17.f479704e : 0.0d);
        wVar.c(a17 != null ? a17.f479705f : false);
        return wVar;
    }

    @Override // ro5.b
    public void i(int i17, bp5.h renderTargetHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderTargetHolder, "renderTargetHolder");
        ro5.m1 m1Var = this.f479678b;
        if (m1Var != null) {
            m1Var.b(i17, renderTargetHolder);
        }
    }

    @Override // ro5.b
    /* renamed from: isCameraOn */
    public boolean mo162803xc7cd3f2e() {
        so5.k0 k0Var = this.f479682f;
        if (k0Var != null) {
            return k0Var.b();
        }
        return false;
    }

    @Override // ro5.b
    public void j(fp5.a remoteCameraStatusListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remoteCameraStatusListener, "remoteCameraStatusListener");
        this.f479690n = remoteCameraStatusListener;
    }

    @Override // ro5.b
    public void k(int i17) {
        so5.k0 k0Var = this.f479682f;
        if (k0Var == null || k0Var.f492393g == i17 || !k0Var.b()) {
            return;
        }
        if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6.f19964x4fbc8495.mo40975xf7b3660d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ILinkVoIPCameraHelper", "current camera on and exchange resolution");
            p3325xe03a0797.p3326xc267989b.l.d(k0Var.f492390d, null, null, new so5.i0(i17, k0Var, null), 3, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPCameraHelper", "startCamera: not in foreground, delay open cam");
            k0Var.f492400q = true;
        }
    }

    @Override // ro5.b
    public void l() {
        this.f479686j = 0;
    }

    @Override // ro5.b
    public void m(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController", "setLocalEncoderRotation: " + i17);
        ro5.m1 m1Var = this.f479678b;
        if (m1Var != null) {
            m1Var.A = i17;
        }
    }

    @Override // ro5.b
    public fo5.f n() {
        int[] iArr;
        ep5.d dVar;
        ro5.j jVar = this.f479677a;
        if (jVar == null) {
            this.f479687k = 16;
        }
        int i17 = (jVar != null ? jVar.f479753g : 0) | this.f479685i | this.f479686j | this.f479687k | this.f479688l | 0;
        this.f479685i = 0;
        this.f479686j = 8;
        this.f479687k = 0;
        this.f479688l = 32;
        ro5.m1 m1Var = this.f479678b;
        if (m1Var != null) {
            iArr = new int[5];
            int i18 = 0;
            while (true) {
                dVar = m1Var.f479780i;
                if (i18 >= 5) {
                    break;
                }
                dVar.getClass();
                iArr[i18] = 0;
                i18++;
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = dVar.f337308c;
            java.util.Set<java.lang.String> keySet = concurrentHashMap.keySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
            int i19 = 0;
            int i27 = -1;
            for (java.lang.String str : keySet) {
                if (concurrentHashMap.get(str) != null && dVar.f337309d != 0) {
                    java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(str);
                    if (num == null) {
                        num = 0;
                    }
                    int b17 = a06.d.b((num.intValue() / dVar.f337309d) * 100);
                    if (b17 > 0) {
                        int i28 = b17 <= 10 ? 0 : b17 <= 20 ? 1 : b17 <= 40 ? 2 : b17 <= 50 ? 3 : b17 <= 80 ? 4 : 5;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                        if (r26.n0.B(str, "camera", false)) {
                            ((jp5.o) i95.n0.c(jp5.o.class)).mo129946xf0018e90(2093L, i28 + 1, 1L);
                            iArr[0] = b17;
                        } else if (r26.n0.B(str, "local_render", false)) {
                            ((jp5.o) i95.n0.c(jp5.o.class)).mo129946xf0018e90(2093L, 7 + i28, 1L);
                            iArr[1] = b17;
                        } else if (r26.n0.B(str, "process", false)) {
                            ((jp5.o) i95.n0.c(jp5.o.class)).mo129946xf0018e90(2093L, 13 + i28, 1L);
                        } else if (r26.n0.B(str, "decode", false)) {
                            if (i19 > 0) {
                                if (b17 > 20) {
                                    i19++;
                                    iArr[3] = b17;
                                }
                                iArr[4] = i19;
                            } else {
                                if (i27 == -1) {
                                    i27 = i28;
                                }
                                iArr[3] = b17;
                                i19 = 1;
                            }
                        }
                    }
                }
            }
            if (i19 > 1) {
                ((jp5.o) i95.n0.c(jp5.o.class)).mo129946xf0018e90(2093L, 25L, i19);
            } else if (i27 != -1) {
                ((jp5.o) i95.n0.c(jp5.o.class)).mo129946xf0018e90(2093L, 19 + i27, 1L);
            }
            concurrentHashMap.clear();
            dVar.f337309d = 0;
        } else {
            iArr = new int[5];
            for (int i29 = 0; i29 < 5; i29++) {
                iArr[i29] = 0;
            }
        }
        return new fo5.f(iArr[0], iArr[1], iArr[2], iArr[3], i17);
    }

    @Override // ro5.b
    public void o(boolean z17, boolean z18) {
    }

    @Override // ro5.b
    public void p(yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        so5.k0 k0Var = this.f479682f;
        if (k0Var == null) {
            callback.mo152xb9724478();
            return;
        }
        if (k0Var != null) {
            ro5.l lVar = new ro5.l(callback);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPCameraHelper", "exchangeCamera: ");
            p3325xe03a0797.p3326xc267989b.l.d(k0Var.f492390d, null, null, new so5.c0(k0Var, lVar, null), 3, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController", "flipCamera");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    @Override // ro5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(java.util.ArrayList r18) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ro5.b0.q(java.util.ArrayList):void");
    }

    @Override // ro5.b
    public void r(boolean z17) {
        so5.k0 k0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController", "pauseCamera() called with: pause = " + z17);
        if (this.f479682f == null) {
            x();
        }
        so5.k0 k0Var2 = this.f479682f;
        if (((k0Var2 == null || k0Var2.b()) ? false : true) && !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController", "pauseCamera start");
            so5.k0 k0Var3 = this.f479682f;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k0Var3 != null ? java.lang.Boolean.valueOf(so5.k0.c(k0Var3, false, false, 3, null)) : null, java.lang.Boolean.TRUE)) {
                this.f479691o.b();
            }
        }
        so5.k0 k0Var4 = this.f479682f;
        if ((k0Var4 != null && k0Var4.b()) && z17 && (k0Var = this.f479682f) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPCameraHelper", "stopCamera: ");
            k0Var.f492400q = false;
            p3325xe03a0797.p3326xc267989b.l.d(k0Var.f492390d, null, null, new so5.h0(k0Var, null), 3, null);
        }
        so5.k0 k0Var5 = this.f479682f;
        if (k0Var5 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPCameraHelper", "pauseCam: new value " + z17);
            k0Var5.f492391e = z17;
        }
        ro5.m1 m1Var = this.f479678b;
        if (m1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MVR.VoIPMPRenderLogic", "pauseCam: new value " + z17);
            m1Var.f479782k = z17;
        }
        so5.k0 k0Var6 = this.f479682f;
        if (k0Var6 != null) {
            k0Var6.d();
        }
    }

    @Override // ro5.b
    public void s(er4.l mainUiScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainUiScene, "mainUiScene");
        this.f479683g = mainUiScene != er4.l.MAIN_UI_CALL_END;
        this.f479684h = mainUiScene == er4.l.MAIN_UI_TALKING;
    }

    @Override // ro5.b
    public long t(int i17, int i18, int i19) {
        ro5.j jVar = this.f479677a;
        if (jVar != null) {
            return jVar.c(i17, i18, i19);
        }
        return 0L;
    }

    @Override // ro5.b
    public void u(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 flutterTextureRegisterHelper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterTextureRegisterHelper, "flutterTextureRegisterHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController", "registerFlutterTextureRegister");
        ro5.j jVar = new ro5.j(flutterTextureRegisterHelper);
        this.f479677a = jVar;
        android.util.SparseArray sparseArray = this.f479692p;
        int size = sparseArray.size();
        for (int i17 = 0; i17 < size; i17++) {
            int keyAt = sparseArray.keyAt(i17);
            ro5.e eVar = (ro5.e) sparseArray.valueAt(i17);
            h(keyAt);
            jVar.d(keyAt, eVar.f479715b, eVar.f479716c, eVar.f479717d, eVar.f479718e, false);
        }
        sparseArray.clear();
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = this.f479693q;
        java.util.Iterator it = concurrentSkipListSet.iterator();
        while (it.hasNext()) {
            java.lang.Long l17 = (java.lang.Long) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
            h(l17.longValue());
        }
        concurrentSkipListSet.clear();
        android.util.SparseArray sparseArray2 = jVar.f479749c;
        int size2 = sparseArray2.size();
        for (int i18 = 0; i18 < size2; i18++) {
            int keyAt2 = sparseArray2.keyAt(i18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.FlutterTextureManager", "refresh render texture" + keyAt2);
            jVar.a(keyAt2);
            er4.w wVar = new er4.w();
            android.util.SparseArray sparseArray3 = jVar.f479748b;
            wVar.f(((ro5.a) sparseArray3.get(keyAt2)).f479661d.id());
            wVar.e(((ro5.e) sparseArray2.get(keyAt2)) != null ? r7.f479717d : 0L);
            ro5.e eVar2 = (ro5.e) sparseArray2.get(keyAt2);
            if (eVar2 != null) {
                int i19 = eVar2.f479716c;
                r8 = java.lang.Double.valueOf(i19 != 0 ? eVar2.f479715b / i19 : 1.0d).doubleValue();
            }
            wVar.d(r8);
            wVar.g(((ro5.e) sparseArray2.get(keyAt2)) != null ? r7.f479715b : 0.0d);
            wVar.b(((ro5.e) sparseArray2.get(keyAt2)) != null ? r7.f479716c : 0.0d);
            ro5.e eVar3 = (ro5.e) sparseArray2.get(keyAt2);
            wVar.c(eVar3 != null ? eVar3.f479718e : false);
            wVar.f337726m = ((ro5.a) sparseArray3.get(keyAt2)).f479663f;
            wVar.f337727n[7] = true;
            jVar.f479750d.put(java.lang.Integer.valueOf(keyAt2), java.lang.Boolean.TRUE);
            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.G(keyAt2, wVar, true, ro5.h.f479734a);
        }
        jVar.f479752f = new ro5.r(this);
    }

    @Override // ro5.b
    public void v(byte[] imageData, int i17, int i18) {
        mo5.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageData, "imageData");
        ro5.m1 m1Var = this.f479678b;
        if (m1Var == null || (bVar = (mo5.b) m1Var.f479794w.mo141623x754a37bb()) == null) {
            return;
        }
        if (i17 <= 0 || i18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMP.ScreenProjectSendManager", "onScreenFrame: invalid size " + i17 + 'x' + i18);
            return;
        }
        int length = imageData.length;
        java.nio.ByteBuffer byteBuffer = bVar.f411959e;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            byteBuffer = java.nio.ByteBuffer.allocateDirect(length);
            bVar.f411959e = byteBuffer;
        }
        java.nio.ByteBuffer byteBuffer2 = byteBuffer;
        if (byteBuffer2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMP.ScreenProjectSendManager", "onScreenFrame: buffer is null");
            return;
        }
        byteBuffer2.clear();
        byteBuffer2.put(imageData);
        byteBuffer2.flip();
        bVar.f411958d.a(byteBuffer2, i17, i18, 644, mo5.a.f411957d);
    }

    @Override // ro5.b
    public void w() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController", "unregisterFlutterTextureRegister");
        ro5.j jVar = this.f479677a;
        if (jVar != null) {
            jVar.b();
        }
        this.f479677a = null;
    }

    @Override // ro5.b
    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController", "start render ");
        g();
    }

    @Override // ro5.b
    public void y() {
        if (this.f479682f == null) {
            x();
        }
        ro5.m1 m1Var = this.f479678b;
        if (m1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MVR.VoIPMPRenderLogic", "pauseCam: new value false");
            m1Var.f479782k = false;
        }
        so5.k0 k0Var = this.f479682f;
        if (k0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPCameraHelper", "pauseCam: new value false");
            k0Var.f492391e = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController", "cameraHelper?.startCamera()");
        so5.k0 k0Var2 = this.f479682f;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k0Var2 != null ? java.lang.Boolean.valueOf(so5.k0.c(k0Var2, false, false, 3, null)) : null, java.lang.Boolean.TRUE)) {
            this.f479691o.b();
        }
        ro5.m1 m1Var2 = this.f479678b;
        if (m1Var2 == null) {
            return;
        }
        m1Var2.f479778g = new ro5.t(this);
    }

    @Override // ro5.b
    public void z(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController", "setVirtualBackground() called with: vbon = " + z17);
        this.f479680d = z17;
        so5.p0 p0Var = (so5.p0) this.f479681e.get();
        if (p0Var != null) {
            p0Var.d(this.f479680d);
        }
    }
}
