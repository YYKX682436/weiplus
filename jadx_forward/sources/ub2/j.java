package ub2;

/* loaded from: classes4.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f507597d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f507598e;

    /* renamed from: f, reason: collision with root package name */
    public int f507599f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f507600g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f507601h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f507602i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ub2.k f507603m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f507604n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String str, long j17, long j18, ub2.k kVar, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f507600g = str;
        this.f507601h = j17;
        this.f507602i = j18;
        this.f507603m = kVar;
        this.f507604n = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ub2.j(this.f507600g, this.f507601h, this.f507602i, this.f507603m, this.f507604n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ub2.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long uptimeMillis;
        gp.d dVar;
        java.lang.String str;
        long j17;
        java.lang.ThreadLocal threadLocal;
        android.graphics.Bitmap frameAtTime;
        zj0.a aVar;
        boolean z17;
        java.lang.Object g17;
        pz5.a aVar2 = pz5.a.f440719d;
        int i17 = this.f507599f;
        long j18 = this.f507602i;
        long j19 = this.f507601h;
        java.lang.String str2 = this.f507600g;
        try {
            try {
                if (i17 == 0) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    uptimeMillis = android.os.SystemClock.uptimeMillis();
                    dVar = new gp.d();
                    try {
                        dVar.setDataSource(str2);
                        long j27 = 1000;
                        zj0.a aVar3 = new zj0.a();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        aVar3.c(java.lang.Long.valueOf(j19 * j27));
                        yj0.a.d(dVar, aVar3.b(), "com/tencent/mm/plugin/finder/core/FinderPostWatermarkDetHelper$watermarkDetectInner$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "getFrameAtTime", "(J)Landroid/graphics/Bitmap;");
                        threadLocal = zj0.c.f554818a;
                        threadLocal.set(aVar3);
                        long longValue = ((java.lang.Long) aVar3.a(0)).longValue();
                        zj0.c.a();
                        frameAtTime = dVar.getFrameAtTime(longValue);
                        yj0.a.e(dVar, frameAtTime, "com/tencent/mm/plugin/finder/core/FinderPostWatermarkDetHelper$watermarkDetectInner$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "getFrameAtTime", "(J)Landroid/graphics/Bitmap;");
                        aVar = new zj0.a();
                        aVar.c(java.lang.Long.valueOf(j18 * j27));
                        str = str2;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        str = str2;
                    }
                    try {
                        yj0.a.d(dVar, aVar.b(), "com/tencent/mm/plugin/finder/core/FinderPostWatermarkDetHelper$watermarkDetectInner$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "getFrameAtTime", "(J)Landroid/graphics/Bitmap;");
                        threadLocal.set(aVar);
                        long longValue2 = ((java.lang.Long) aVar.a(0)).longValue();
                        zj0.c.a();
                        android.graphics.Bitmap frameAtTime2 = dVar.getFrameAtTime(longValue2);
                        yj0.a.e(dVar, frameAtTime2, "com/tencent/mm/plugin/finder/core/FinderPostWatermarkDetHelper$watermarkDetectInner$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "getFrameAtTime", "(J)Landroid/graphics/Bitmap;");
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        if (frameAtTime != null) {
                            arrayList.add(frameAtTime);
                        }
                        if (frameAtTime2 != null) {
                            arrayList.add(frameAtTime2);
                        }
                        if (!arrayList.isEmpty()) {
                            ub2.k kVar = this.f507603m;
                            this.f507598e = dVar;
                            this.f507597d = uptimeMillis;
                            this.f507599f = 1;
                            kVar.getClass();
                            g17 = ub2.n.f507617a.a() ? p3325xe03a0797.p3326xc267989b.l.g((ub2.b) ((jz5.n) kVar.f507605a).mo141623x754a37bb(), new ub2.l(arrayList, null), this) : java.lang.Boolean.FALSE;
                            if (g17 == aVar2) {
                                return aVar2;
                            }
                            j17 = uptimeMillis;
                        } else {
                            z17 = false;
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        j17 = uptimeMillis;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderPostWatermarkDetHelper", th, "WatermarkDetect", new java.lang.Object[0]);
                        dVar.release();
                        z17 = false;
                        uptimeMillis = j17;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostWatermarkDetHelper", "[watermarkDet] video index:" + this.f507604n + ", has watermark: " + z17 + ", detectTime:" + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + ", startTimeMs:" + j19 + " endTimeMs:" + j18 + ", path:" + str);
                        return java.lang.Boolean.valueOf(z17);
                    }
                } else {
                    if (i17 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j17 = this.f507597d;
                    dVar = (gp.d) this.f507598e;
                    try {
                        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                        g17 = obj;
                        str = str2;
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        str = str2;
                        try {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderPostWatermarkDetHelper", th, "WatermarkDetect", new java.lang.Object[0]);
                            try {
                                dVar.release();
                            } catch (java.lang.RuntimeException unused) {
                            }
                            z17 = false;
                            uptimeMillis = j17;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostWatermarkDetHelper", "[watermarkDet] video index:" + this.f507604n + ", has watermark: " + z17 + ", detectTime:" + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + ", startTimeMs:" + j19 + " endTimeMs:" + j18 + ", path:" + str);
                            return java.lang.Boolean.valueOf(z17);
                        } finally {
                            try {
                                dVar.release();
                            } catch (java.lang.RuntimeException unused2) {
                            }
                        }
                    }
                }
            } catch (java.lang.RuntimeException unused3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostWatermarkDetHelper", "[watermarkDet] video index:" + this.f507604n + ", has watermark: " + z17 + ", detectTime:" + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + ", startTimeMs:" + j19 + " endTimeMs:" + j18 + ", path:" + str);
                return java.lang.Boolean.valueOf(z17);
            }
            z17 = ((java.lang.Boolean) g17).booleanValue();
            uptimeMillis = j17;
        } catch (java.lang.Throwable th9) {
            th = th9;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderPostWatermarkDetHelper", th, "WatermarkDetect", new java.lang.Object[0]);
            dVar.release();
            z17 = false;
            uptimeMillis = j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostWatermarkDetHelper", "[watermarkDet] video index:" + this.f507604n + ", has watermark: " + z17 + ", detectTime:" + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + ", startTimeMs:" + j19 + " endTimeMs:" + j18 + ", path:" + str);
            return java.lang.Boolean.valueOf(z17);
        }
    }
}
