package pj0;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.m1.class})
/* loaded from: classes11.dex */
public class f extends i95.w implements com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f436458d = "GPU_MEMORY_OPENGL_HOOK";

    @Override // com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a
    public double A4() {
        long Ui;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (o45.wf.f424566k) {
            Ui = 1;
        } else {
            Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_gpu_opengl_hook_open_sample, 100000000L);
        }
        if (Ui > 0) {
            return 1.0d / Ui;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GpuResService", "denominator <= -0L, does not need to rate()");
        return -1.0d;
    }

    @Override // com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a
    public void Sg(double d17) {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_gpu_process_open, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GpuResService", "openGpuProcess = " + fj6);
        if (fj6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GpuResService", "sample success & do action");
            ((ku5.t0) ku5.t0.f394148d).g(new pj0.e(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a
    public long V3() {
        return 0L;
    }

    @Override // com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a
    public java.lang.String key() {
        return this.f436458d;
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 == 29 || i17 == 30) {
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().j("clicfg_background_graphic_release_v2", "1", false, true), 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GpuResService", "[OpenglLeakPlugin: graphic_release open = %d]", java.lang.Integer.valueOf(P));
            if (P > 0) {
                if (!s63.b.f484946g) {
                    s63.b.f484946g = true;
                    com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40966xc74540ab(s63.b.f484945f);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GpuResService", "[OpenglLeakPlugin: GraphicCacheRelease start success, processName = %s]", bm5.f1.a());
            }
        }
    }
}
