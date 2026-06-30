package qb0;

/* loaded from: classes12.dex */
public class k implements hm0.q {
    @Override // hm0.q
    /* renamed from: onConfigurationChanged */
    public void mo43788x50e1c15d(android.content.res.Configuration configuration) {
    }

    @Override // hm0.q
    /* renamed from: onLowMemory */
    public void mo43789xb5d8ba56() {
        ((ku5.t0) ku5.t0.f394148d).h(new qb0.i(this), "MicroMsg.PluginPerformance");
    }

    @Override // hm0.q
    /* renamed from: onTerminate */
    public void mo43790x7784fb42() {
    }

    @Override // hm0.q
    /* renamed from: onTrimMemory */
    public void mo43791x29685b02(int i17) {
        if (i17 <= 15) {
            ((ku5.t0) ku5.t0.f394148d).h(new qb0.j(this, i17), "MicroMsg.PluginPerformance");
        }
    }
}
