package tl2;

/* loaded from: classes8.dex */
public final class k implements com.p314xaae8f345.mm.ui.fa {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl2.u f501787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f501788e;

    public k(tl2.u uVar, java.lang.Runnable runnable) {
        this.f501787d = uVar;
        this.f501788e = runnable;
    }

    @Override // com.p314xaae8f345.mm.ui.fa
    /* renamed from: onConfigurationChanged */
    public void mo74853x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        int i17 = newConfig.orientation;
        tl2.u uVar = this.f501787d;
        if (i17 == 1) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) uVar.f501807d).getWindow().getDecorView().postDelayed(this.f501788e, 1000L);
        }
        android.app.Activity activity = uVar.f501807d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.m78550x87bf02d5(this);
        }
    }
}
