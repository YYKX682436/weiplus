package com.tencent.mm.feature.performance;

@j95.b
/* loaded from: classes12.dex */
public class q1 extends i95.w implements ob0.x2 {

    /* renamed from: d, reason: collision with root package name */
    public kj.m f67633d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f67634e;

    public q1() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean z17 = true;
        if (!o45.wf.f343033k) {
            int o17 = com.tencent.mm.sdk.platformtools.o4.L().o("clicfg_matrix_new_frame_tracer_switch", 0);
            if (!(o17 > 0 && (o17 >= 100 || java.lang.Math.abs(com.tencent.mm.sdk.platformtools.z.f193112h ^ new java.security.SecureRandom().nextInt()) % 100 < o17))) {
                z17 = false;
            }
        }
        this.f67634e = z17;
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        if (this.f67634e) {
            kj.m mVar = new kj.m(com.tencent.mm.sdk.platformtools.i.a(), 42, 24, 9, 3);
            this.f67633d = mVar;
            mVar.g();
            com.tencent.mars.xlog.Log.i("FrameTraceService", "frameTracer is started");
            if (jr0.e.f301327b == null && jr0.e.f301328c) {
                synchronized (jr0.e.class) {
                    if (jr0.e.f301327b == null) {
                        jr0.e.f301327b = new jr0.e();
                    }
                }
            }
            jr0.e eVar = jr0.e.f301327b;
            if (eVar != null) {
                this.f67633d.k(eVar);
            }
            if (jr0.d.f301324b == null && jr0.d.f301325c) {
                synchronized (jr0.e.class) {
                    if (jr0.d.f301324b == null) {
                        jr0.d.f301324b = new jr0.d();
                    }
                }
            }
            jr0.d dVar = jr0.d.f301324b;
            if (dVar != null) {
                kj.m mVar2 = this.f67633d;
                mVar2.f308246h = dVar;
                mVar2.f308247i = 9;
            }
        }
    }

    public void wi(jj.e eVar) {
        kj.m mVar = this.f67633d;
        if (mVar != null && mVar.f308216d) {
            this.f67633d.k(eVar);
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        kj.m mVar2 = this.f67633d;
        objArr[0] = mVar2 == null ? "null" : java.lang.Boolean.valueOf(mVar2.f308216d);
        com.tencent.mars.xlog.Log.w("FrameTraceService", "register failed, frameTrace=%s", objArr);
    }
}
