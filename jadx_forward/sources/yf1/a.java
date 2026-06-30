package yf1;

/* loaded from: classes7.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f543163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f543164e;

    public a(yf1.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17) {
        this.f543163d = v5Var;
        this.f543164e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f543163d;
        if (!v5Var.mo50262x39e05d35() || v5Var.a2() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "requestFullscreen, invalid state");
            return;
        }
        xi1.m mo14663xe55fc971 = v5Var.a2().mo14663xe55fc971();
        android.view.View mo14669x50cdf8a2 = v5Var.a2().mo14669x50cdf8a2();
        if (mo14663xe55fc971 == null || mo14669x50cdf8a2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "requestFullscreen, state error, FullscreenImp[%s], fullscreenWebView[%s]", mo14663xe55fc971, mo14669x50cdf8a2);
            return;
        }
        int i17 = this.f543164e;
        mo14663xe55fc971.e(mo14669x50cdf8a2, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "requestFullscreen, target orientation:%s", java.lang.Integer.valueOf(i17));
    }
}
