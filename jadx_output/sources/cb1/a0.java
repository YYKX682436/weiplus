package cb1;

/* loaded from: classes7.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eb1.d f40213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40214e;

    public a0(eb1.d dVar, com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f40213d = dVar;
        this.f40214e = v5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40213d.setPhoneItems((java.util.ArrayList) vi1.o0.f437416a.b());
        java.lang.String appId = this.f40214e.getAppId();
        if (appId != null) {
            vi1.l2.f437401a.b(appId);
        }
    }
}
