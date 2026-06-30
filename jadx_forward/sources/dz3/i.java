package dz3;

/* loaded from: classes15.dex */
public class i implements tz3.a {
    public static final boolean A;
    public static final float B;
    public static final boolean C;
    public static int D;
    public static int E;
    public static int F;
    public static volatile dz3.f H;
    public static volatile dz3.f I;

    /* renamed from: z, reason: collision with root package name */
    public static final int f326665z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f326666a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f326667b;

    /* renamed from: c, reason: collision with root package name */
    public tz3.c f326668c;

    /* renamed from: d, reason: collision with root package name */
    public dz3.g f326669d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f326670e;

    /* renamed from: f, reason: collision with root package name */
    public int f326671f;

    /* renamed from: g, reason: collision with root package name */
    public android.hardware.SensorManager f326672g;

    /* renamed from: h, reason: collision with root package name */
    public android.hardware.Sensor f326673h;

    /* renamed from: i, reason: collision with root package name */
    public android.hardware.Sensor f326674i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f326675j;

    /* renamed from: k, reason: collision with root package name */
    public final dz3.h f326676k;

    /* renamed from: l, reason: collision with root package name */
    public float f326677l;

    /* renamed from: m, reason: collision with root package name */
    public float f326678m;

    /* renamed from: n, reason: collision with root package name */
    public float f326679n;

    /* renamed from: o, reason: collision with root package name */
    public float f326680o;

    /* renamed from: p, reason: collision with root package name */
    public float f326681p;

    /* renamed from: q, reason: collision with root package name */
    public float f326682q;

    /* renamed from: r, reason: collision with root package name */
    public double f326683r;

    /* renamed from: s, reason: collision with root package name */
    public long f326684s;

    /* renamed from: t, reason: collision with root package name */
    public long f326685t;

    /* renamed from: u, reason: collision with root package name */
    public long f326686u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f326687v;

    /* renamed from: w, reason: collision with root package name */
    public long f326688w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f326689x;
    public static final dz3.i G = new dz3.i();

    /* renamed from: y, reason: collision with root package name */
    public static int f326664y = bz3.h.f118312f;

    static {
        boolean a17 = bz3.h.a();
        C = a17;
        int intValue = ((java.lang.Number) ((jz5.n) bz3.h.f118318l).mo141623x754a37bb()).intValue();
        f326665z = intValue;
        bz3.h hVar = bz3.h.f118307a;
        A = ((java.lang.Boolean) ((jz5.n) bz3.h.f118319m).mo141623x754a37bb()).booleanValue();
        B = ((java.lang.Number) ((jz5.n) bz3.h.f118320n).mo141623x754a37bb()).floatValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReIdAiScanImageDecodeQueue", "scanConfig enableFilterCodeFrame: %s, sensorSkipStableMs: %s", java.lang.Boolean.valueOf(a17), java.lang.Integer.valueOf(intValue));
        H = null;
        I = null;
    }

    public i() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.y0 y0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.y0.f240635d;
        this.f326671f = 0;
        this.f326675j = false;
        this.f326676k = new dz3.h(this);
        this.f326687v = false;
    }

    public static void p(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.e1 e1Var) {
        ((ku5.t0) ku5.t0.f394148d).h(e1Var, "ReIdAiScanImageDecodeQueue_decode_task");
    }

    @Override // tz3.a
    public void a() {
        dz3.g gVar = this.f326669d;
        if (gVar != null) {
            gVar.f326654j++;
        }
    }

    @Override // tz3.a
    public void b(int i17) {
        dz3.g gVar = this.f326669d;
        if (gVar != null) {
            if (i17 == 0) {
                gVar.f326659o++;
                return;
            }
            if (i17 == 2) {
                gVar.f326658n++;
                return;
            }
            if (i17 == 3) {
                gVar.f326660p++;
            } else if (i17 == 4) {
                gVar.f326661q++;
            } else {
                if (i17 != 5) {
                    return;
                }
                gVar.f326662r++;
            }
        }
    }

    @Override // tz3.a
    public void c(int i17) {
    }

    @Override // tz3.a
    public void d(int i17, int i18, int i19, int i27) {
    }

    @Override // tz3.a
    public void e(int i17, sz3.a1 a1Var, sz3.x0 x0Var, android.graphics.RectF rectF, byte[] bArr, int i18, int i19, tz3.c cVar) {
        if (this.f326670e) {
            p(new dz3.a(this, bArr, rectF, cVar, i17, i18, i19));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReIdAiScanImageDecodeQueue", "decodeFullImage is not working");
        }
    }

    @Override // tz3.a
    public void f(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.n nVar) {
    }

    @Override // tz3.a
    public void g(long j17) {
        if (this.f326670e) {
            if (this.f326672g == null) {
                this.f326672g = (android.hardware.SensorManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("sensor");
            }
            android.hardware.SensorManager sensorManager = this.f326672g;
            if (sensorManager != null) {
                if (this.f326673h == null) {
                    this.f326673h = sensorManager.getDefaultSensor(10);
                }
                if (A && this.f326674i == null) {
                    this.f326674i = this.f326672g.getDefaultSensor(4);
                }
            }
            if (this.f326672g != null && !this.f326675j) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReIdAiScanImageDecodeQueue", "startSensorShakeDetect");
                android.hardware.Sensor sensor = this.f326673h;
                dz3.h hVar = this.f326676k;
                if (sensor != null) {
                    this.f326672g.registerListener(hVar, sensor, 3);
                }
                android.hardware.Sensor sensor2 = this.f326674i;
                if (sensor2 != null) {
                    this.f326672g.registerListener(hVar, sensor2, 3);
                }
                this.f326675j = true;
            }
            this.f326688w = 0L;
            this.f326689x = false;
        }
    }

    @Override // tz3.a
    public void h(tz3.c cVar) {
        this.f326668c = cVar;
    }

    @Override // tz3.a
    public void i(byte[] bArr, tz3.b bVar) {
    }

    @Override // tz3.a
    /* renamed from: init */
    public void mo126481x316510() {
        this.f326669d = new dz3.g(this);
        this.f326670e = true;
        f326664y = e04.j2.a();
        this.f326688w = 0L;
        this.f326689x = false;
    }

    @Override // tz3.a
    public void j() {
        dz3.g gVar = this.f326669d;
        if (gVar != null) {
            gVar.f326655k++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    @Override // tz3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.y r17, tz3.d r18) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dz3.i.k(com.tencent.wechat.aff.iam_scan.y, tz3.d):void");
    }

    @Override // tz3.a
    public void l(long j17) {
        if (this.f326670e) {
            if (this.f326672g != null && this.f326675j) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReIdAiScanImageDecodeQueue", "stopSensorShakeDetect");
                this.f326672g.unregisterListener(this.f326676k);
            }
            this.f326675j = false;
            this.f326688w = 0L;
            this.f326689x = false;
        }
        this.f326671f = 0;
        p(new dz3.d(this));
    }

    @Override // tz3.a
    public void m() {
        dz3.g gVar = this.f326669d;
        if (gVar != null) {
            int i17 = gVar.f326656l;
            if (!(i17 > 0)) {
                gVar.f326657m = gVar.f326654j;
            }
            gVar.f326656l = i17 + 1;
        }
    }

    public final void n(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.y yVar, tz3.d dVar, boolean z17) {
        if (this.f326667b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ReIdAiScanImageDecodeQueue", "dealDecodeImage image is decoding");
            return;
        }
        if (H == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ReIdAiScanImageDecodeQueue", "dealDecodeImage sPendingImage is null");
            return;
        }
        if (I != null && H.f326643a == I.f326643a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ReIdAiScanImageDecodeQueue", "dealDecodeImage image id is same, do not decode");
            return;
        }
        this.f326667b = true;
        dz3.g gVar = this.f326669d;
        if (gVar != null) {
            gVar.f326649e++;
        }
        if (z17) {
            p(new dz3.b(this, yVar, dVar));
        } else {
            o(yVar, dVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x031a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.y r30, tz3.d r31) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dz3.i.o(com.tencent.wechat.aff.iam_scan.y, tz3.d):void");
    }

    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.hardware.SensorManager, android.hardware.Sensor, dz3.g] */
    @Override // tz3.a
    /* renamed from: release */
    public void mo126482x41012807() {
        java.lang.String str;
        ?? r17;
        dz3.i iVar = this;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReIdAiScanImageDecodeQueue", "release");
        p(new dz3.c(iVar));
        iVar.f326670e = false;
        iVar.f326671f = 0;
        iVar.f326668c = null;
        dz3.g gVar = iVar.f326669d;
        if (gVar == null) {
            str = "MicroMsg.ReIdAiScanImageDecodeQueue";
            r17 = 0;
        } else {
            str = "MicroMsg.ReIdAiScanImageDecodeQueue";
            r17 = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24190, 0, java.lang.Integer.valueOf(gVar.f326645a), java.lang.Integer.valueOf(gVar.f326646b), java.lang.Integer.valueOf(gVar.f326647c), java.lang.Integer.valueOf(gVar.f326649e), java.lang.Integer.valueOf(gVar.f326650f), java.lang.Integer.valueOf(gVar.f326651g), java.lang.Integer.valueOf(gVar.f326652h), java.lang.Integer.valueOf(gVar.f326653i), java.lang.Integer.valueOf(gVar.f326654j), java.lang.Integer.valueOf(gVar.f326655k), java.lang.Integer.valueOf(gVar.f326656l), java.lang.Integer.valueOf(gVar.f326657m), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, java.lang.Integer.valueOf(gVar.f326658n), java.lang.Integer.valueOf(gVar.f326659o), java.lang.Integer.valueOf(gVar.f326660p), java.lang.Integer.valueOf(gVar.f326661q), java.lang.Integer.valueOf(gVar.f326662r), java.lang.Integer.valueOf(gVar.f326648d));
            iVar = this;
        }
        iVar.f326669d = r17;
        if (iVar.f326672g != null && iVar.f326675j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "stopSensorShakeDetect");
            iVar.f326672g.unregisterListener(iVar.f326676k);
        }
        iVar.f326675j = false;
        iVar.f326672g = r17;
        iVar.f326673h = r17;
        iVar.f326688w = 0L;
        iVar.f326689x = false;
        if (D == 0 || E == 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.c(0);
        cVar.f240365i = ((int) ((F * 100.0f) / E)) + "_" + ((int) ((E * 100.0f) / D)) + "_" + D + "_" + E + "_" + F;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(140, cVar);
        D = 0;
        E = 0;
        F = 0;
    }
}
