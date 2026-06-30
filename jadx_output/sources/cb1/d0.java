package cb1;

/* loaded from: classes7.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eb1.d f40223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40224e;

    public d0(eb1.d dVar, com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f40223d = dVar;
        this.f40224e = v5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40223d.setPhoneItems((java.util.ArrayList) vi1.o0.f437416a.b());
        vi1.l2 l2Var = vi1.l2.f437401a;
        java.lang.String appId = this.f40224e.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        l2Var.b(appId);
    }
}
