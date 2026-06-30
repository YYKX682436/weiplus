package ad3;

/* loaded from: classes7.dex */
public final class b extends com.tencent.mm.plugin.magicbrush.u4 implements com.tencent.mm.sdk.platformtools.f7 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.magicbrush.i6 service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // com.tencent.mm.plugin.magicbrush.u4
    public void a() {
        com.tencent.mars.xlog.Log.i("MBOnScreenShotEventImpl", "onStartListen");
        try {
            ct.d3 d3Var = (ct.d3) i95.n0.c(ct.d3.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((com.tencent.mm.ui.feature.api.screenshot.t) d3Var).wi(context, this);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MBOnScreenShotEventImpl", "setScreenShotCallback fail e:%s", e17.getMessage());
        }
    }

    @Override // com.tencent.mm.plugin.magicbrush.u4
    public void b() {
        ct.d3 d3Var = (ct.d3) i95.n0.c(ct.d3.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.ui.feature.api.screenshot.t) d3Var).Bi(context, this);
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MBOnScreenShotEventImpl", "onScreenShot");
        ((com.tencent.mm.plugin.magicbrush.i6) this.f148167d).Bi(com.tencent.mm.plugin.magicbrush.z4.f148220e, "");
    }
}
