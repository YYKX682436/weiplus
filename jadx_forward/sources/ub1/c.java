package ub1;

/* loaded from: classes13.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f507553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f507554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f507555f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f507556g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f507557h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f507558i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f507559m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f507560n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f507561o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ub1.b f507562p;

    public c(ub1.b bVar, byte[] bArr, int i17, int i18, int i19, int i27, int i28, android.graphics.Point point, android.graphics.Rect rect, int i29) {
        this.f507562p = bVar;
        this.f507553d = bArr;
        this.f507554e = i17;
        this.f507555f = i18;
        this.f507556g = i19;
        this.f507557h = i27;
        this.f507558i = i28;
        this.f507559m = point;
        this.f507560n = rect;
        this.f507561o = i29;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object obj;
        int i17;
        int i18;
        int abs;
        int i19;
        int i27;
        int i28;
        if (this.f507562p.f507548a.compareAndSet(false, true)) {
            byte[] bArr = this.f507553d;
            int i29 = this.f507554e;
            if (270 == i29 || 90 == i29) {
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bArr.length);
                ry3.k kVar = (ry3.k) i95.n0.c(ry3.k.class);
                ry3.k kVar2 = (ry3.k) i95.n0.c(ry3.k.class);
                byte[] bArr2 = this.f507553d;
                ((jd0.o2) kVar2).getClass();
                java.nio.ByteBuffer c17 = et5.h.c(bArr2);
                int i37 = this.f507555f;
                int i38 = this.f507556g;
                ((jd0.o2) kVar).getClass();
                et5.h.a(allocateDirect, c17, i37, i38);
                java.nio.ByteBuffer allocateDirect2 = java.nio.ByteBuffer.allocateDirect(this.f507553d.length);
                ry3.k kVar3 = (ry3.k) i95.n0.c(ry3.k.class);
                int i39 = this.f507556g;
                int i47 = this.f507555f;
                ((jd0.o2) kVar3).getClass();
                et5.h.a(allocateDirect2, allocateDirect, i39, i47);
                bArr = allocateDirect2.array();
            }
            byte[] bArr3 = bArr;
            ub1.b bVar = this.f507562p;
            int i48 = this.f507555f;
            int i49 = this.f507556g;
            int i57 = this.f507557h;
            int i58 = this.f507558i;
            android.graphics.Point point = this.f507559m;
            android.graphics.Rect rect = this.f507560n;
            int i59 = this.f507554e;
            int i66 = this.f507561o;
            final ub1.a aVar = (ub1.a) bVar;
            java.lang.Object obj2 = aVar.f507544f;
            synchronized (obj2) {
                try {
                    if (aVar.f507545g) {
                        if (rect == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.appbrand.ScanQBarDecoder", "scanArea is null, use whole screen area, left: %d, top: %d, right: %d, bottom: %d", 0, 0, java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i49));
                            i19 = 0;
                            i28 = 0;
                            i27 = i48;
                            obj = obj2;
                            i17 = i59;
                            i18 = i58;
                            abs = i49;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.appbrand.ScanQBarDecoder", "origin scan area decodeDegrees: %d, left: %d, top: %d, right: %d, bottom: %d", java.lang.Integer.valueOf(i59), java.lang.Integer.valueOf(rect.left), java.lang.Integer.valueOf(rect.top), java.lang.Integer.valueOf(rect.right), java.lang.Integer.valueOf(rect.bottom));
                            obj = obj2;
                            i17 = i59;
                            i18 = i58;
                            try {
                                android.graphics.Rect b17 = aVar.b(rect, point, i48, i49, i59, i66);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.appbrand.ScanQBarDecoder", "translated scan area decodeDegrees: %d, left: %d, top: %d, right: %d, bottom: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(b17.left), java.lang.Integer.valueOf(b17.top), java.lang.Integer.valueOf(b17.right), java.lang.Integer.valueOf(b17.bottom));
                                int i67 = b17.left;
                                if (i67 >= i48) {
                                    i67 = i48 - 1;
                                }
                                int i68 = b17.top;
                                if (i68 >= i49) {
                                    i68 = i49 - 1;
                                }
                                int abs2 = java.lang.Math.abs(b17.width()) + i67 > i48 ? i48 - i67 : java.lang.Math.abs(b17.width());
                                abs = java.lang.Math.abs(b17.height()) + i68 > i49 ? i49 - i68 : java.lang.Math.abs(b17.height());
                                int i69 = i68;
                                i19 = i67;
                                i27 = abs2;
                                i28 = i69;
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                while (true) {
                                    try {
                                        break;
                                    } catch (java.lang.Throwable th7) {
                                        th = th7;
                                    }
                                }
                                throw th;
                            }
                        }
                        byte[] bArr4 = aVar.f507546h;
                        if (bArr4 == null) {
                            int i76 = i27 * abs;
                            aVar.f507546h = new byte[(i76 * 3) / 2];
                            aVar.f507547i = new byte[i76];
                            int i77 = ((i48 * i49) * 3) / 2;
                        } else {
                            int i78 = i27 * abs;
                            int i79 = i78 * 3;
                            if (bArr4.length != i79 / 2) {
                                aVar.f507546h = null;
                                aVar.f507546h = new byte[i79 / 2];
                                aVar.f507547i = null;
                                aVar.f507547i = new byte[i78];
                                int i86 = ((i48 * i49) * 3) / 2;
                            }
                        }
                        int[] iArr = new int[2];
                        byte[] f17 = ((zs5.z) aVar.f507543e).f(bArr3, new android.graphics.Point(i48, i49), i17, new android.graphics.Rect(i19, i28, i19 + i27, i28 + abs), iArr, new int[2]);
                        aVar.f507546h = f17;
                        byte[] bArr5 = aVar.f507547i;
                        java.lang.System.arraycopy(f17, 0, bArr5, 0, bArr5.length);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        byte[] bArr6 = aVar.f507547i;
                        if (bArr6 != null) {
                            java.util.List h17 = ((zs5.z) aVar.f507543e).h(bArr6, iArr[0], iArr[1], false, arrayList2, arrayList);
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            objArr[0] = java.lang.Boolean.valueOf((h17 == null || ((java.util.ArrayList) h17).isEmpty()) ? false : true);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.appbrand.ScanQBarDecoder", "after scanImage, result:%b", objArr);
                            if (h17 != null) {
                                java.util.ArrayList arrayList3 = (java.util.ArrayList) h17;
                                if (!arrayList3.isEmpty() && !arrayList2.isEmpty()) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.appbrand.ScanQBarDecoder", "GetResults size %d", java.lang.Integer.valueOf(arrayList3.size()));
                                    com.p314xaae8f345.p2891x34da02.C25311x69ff7e80 c25311x69ff7e80 = (com.p314xaae8f345.p2891x34da02.C25311x69ff7e80) arrayList3.get(0);
                                    com.p314xaae8f345.p2891x34da02.C25303x87b156a3 c25303x87b156a3 = (com.p314xaae8f345.p2891x34da02.C25303x87b156a3) arrayList2.get(0);
                                    aVar.c(c25303x87b156a3, i27, abs, i57, i18, i17);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.appbrand.ScanQBarDecoder", "decode type:%s, sCharset: %s, data:%s", c25311x69ff7e80.f556864e, c25311x69ff7e80.f556867h, c25311x69ff7e80.f556865f);
                                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c25311x69ff7e80.f556864e)) {
                                    } else {
                                        java.lang.String str = c25311x69ff7e80.f556864e;
                                        int i87 = arrayList.isEmpty() ? 0 : ((com.p314xaae8f345.p2891x34da02.C25312x3165f541) arrayList.get(0)).f45430x93fa756a;
                                        if (!str.equals("QR_CODE") && !str.equals("WX_CODE")) {
                                            java.lang.String str2 = c25311x69ff7e80.f556865f;
                                            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ub1.d(aVar, 2, str2 == null ? "" : str2, 0, i87, null, c25303x87b156a3));
                                        }
                                        java.lang.String str3 = c25311x69ff7e80.f556865f;
                                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ub1.d(aVar, 1, str3 == null ? "" : str3, 0, i87, c25311x69ff7e80.f556866g, c25303x87b156a3));
                                    }
                                }
                            }
                            com.p314xaae8f345.p2891x34da02.C25306xcef9dd2e j17 = ((zs5.z) aVar.f507543e).j();
                            if (j17 != null && j17.f45392xb9ac001d) {
                                final float f18 = j17.f45393xc24e9f02;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.appbrand.ScanDecoder", "notifyZoomFactor: %f", java.lang.Float.valueOf(f18));
                                if (f18 > 1.0d) {
                                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: ub1.b$$a
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ub1.e eVar = ub1.b.this.f507549b;
                                            if (eVar != null) {
                                                tb1.u uVar = (tb1.u) ((ub1.h) eVar).f507569a;
                                                uVar.getClass();
                                                float f19 = f18;
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "ScanCodeMode, zoom: %f", java.lang.Float.valueOf(f19));
                                                uVar.f498480l.q(f19);
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.appbrand.ScanQBarDecoder", "not init");
                    }
                    this.f507562p.f507548a.set(false);
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    obj = obj2;
                }
            }
            this.f507562p.f507548a.set(false);
        }
    }
}
