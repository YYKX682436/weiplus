package av1;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cast.ui.CastUIC f14178d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.cast.ui.CastUIC castUIC) {
        super(1);
        this.f14178d = castUIC;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            int i17 = com.tencent.mm.plugin.cast.ui.CastUIC.f95480m;
            com.tencent.mm.plugin.cast.ui.CastUIC castUIC = this.f14178d;
            com.tencent.mars.xlog.Log.i((java.lang.String) castUIC.f95485h.getValue(), "on drawerView invisible, finish");
            castUIC.finish();
        }
        return jz5.f0.f302826a;
    }
}
