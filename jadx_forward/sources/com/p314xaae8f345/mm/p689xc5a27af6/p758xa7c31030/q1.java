package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

@j95.b
/* loaded from: classes12.dex */
public class q1 extends i95.w implements ob0.x2 {

    /* renamed from: d, reason: collision with root package name */
    public kj.m f149166d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f149167e;

    public q1() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        boolean z17 = true;
        if (!o45.wf.f424566k) {
            int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().o("clicfg_matrix_new_frame_tracer_switch", 0);
            if (!(o17 > 0 && (o17 >= 100 || java.lang.Math.abs(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h ^ new java.security.SecureRandom().nextInt()) % 100 < o17))) {
                z17 = false;
            }
        }
        this.f149167e = z17;
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
        if (this.f149167e) {
            kj.m mVar = new kj.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a(), 42, 24, 9, 3);
            this.f149166d = mVar;
            mVar.g();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FrameTraceService", "frameTracer is started");
            if (jr0.e.f382860b == null && jr0.e.f382861c) {
                synchronized (jr0.e.class) {
                    if (jr0.e.f382860b == null) {
                        jr0.e.f382860b = new jr0.e();
                    }
                }
            }
            jr0.e eVar = jr0.e.f382860b;
            if (eVar != null) {
                this.f149166d.k(eVar);
            }
            if (jr0.d.f382857b == null && jr0.d.f382858c) {
                synchronized (jr0.e.class) {
                    if (jr0.d.f382857b == null) {
                        jr0.d.f382857b = new jr0.d();
                    }
                }
            }
            jr0.d dVar = jr0.d.f382857b;
            if (dVar != null) {
                kj.m mVar2 = this.f149166d;
                mVar2.f389779h = dVar;
                mVar2.f389780i = 9;
            }
        }
    }

    public void wi(jj.e eVar) {
        kj.m mVar = this.f149166d;
        if (mVar != null && mVar.f389749d) {
            this.f149166d.k(eVar);
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        kj.m mVar2 = this.f149166d;
        objArr[0] = mVar2 == null ? "null" : java.lang.Boolean.valueOf(mVar2.f389749d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FrameTraceService", "register failed, frameTrace=%s", objArr);
    }
}
