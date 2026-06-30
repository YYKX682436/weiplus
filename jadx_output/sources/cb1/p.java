package cb1;

/* loaded from: classes7.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40280d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        super(1);
        this.f40280d = v5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String appId = this.f40280d.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        r45.vq5 vq5Var = new r45.vq5();
        vq5Var.f388449d = appId;
        vq5Var.f388450e = booleanValue;
        ((km5.q) ((com.tencent.mm.plugin.appbrand.networking.c0) nd.f.a(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxabusiness/reportusercheckphoneprivacy", appId, vq5Var, r45.wq5.class).n(cb1.i1.f40257a)).s(cb1.j1.f40260a);
        return jz5.f0.f302826a;
    }
}
