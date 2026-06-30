package fg1;

/* loaded from: classes7.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f343439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f343440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f343441f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fg1.z f343442g;

    public v(fg1.z zVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f343442g = zVar;
        this.f343439d = v5Var;
        this.f343440e = lVar;
        this.f343441f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f343439d;
        if (!v5Var.mo50262x39e05d35() || v5Var.a2() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "requestFullscreen, invalid state");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f343440e;
        fg1.z zVar = this.f343442g;
        zVar.f(lVar);
        xi1.m mo14663xe55fc971 = v5Var.a2().mo14663xe55fc971();
        android.view.View mo14669x50cdf8a2 = v5Var.a2().mo14669x50cdf8a2();
        if (mo14663xe55fc971 == null || mo14669x50cdf8a2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "requestFullscreen, state error, FullscreenImp[%s], fullscreenWebView[%s]", mo14663xe55fc971, mo14669x50cdf8a2);
            return;
        }
        int i17 = this.f343441f;
        mo14663xe55fc971.e(mo14669x50cdf8a2, i17);
        xi1.c cVar = zVar.f343453a;
        if (cVar != null) {
            mo14663xe55fc971.d(cVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "requestFullscreen, target orientation:%s", java.lang.Integer.valueOf(i17));
    }
}
