package tf;

/* loaded from: classes7.dex */
public class b implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tf.c f500314d;

    public b(tf.c cVar) {
        this.f500314d = cVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w
    /* renamed from: onDestroy */
    public void mo32094xac79a11b() {
        tf.c cVar = this.f500314d;
        java.lang.ref.WeakReference weakReference = cVar.f500322c;
        if (weakReference == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onDestroy, mPageViewRef is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get();
        if (v5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onDestroy, thePageView is null");
            return;
        }
        android.app.Activity v17 = v5Var.v1();
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onDestroy, null == activity");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.e0 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.e0.b(v17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.f0 orientationObserver = cVar.f500326g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orientationObserver, "orientationObserver");
        ((java.util.concurrent.CopyOnWriteArrayList) b17.f169119f).remove(orientationObserver);
        v5Var.K(cVar.f500327h);
    }
}
