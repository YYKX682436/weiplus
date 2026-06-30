package bk1;

/* loaded from: classes4.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f21309d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f21310e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f21311f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f21312g;

    /* renamed from: h, reason: collision with root package name */
    public int f21313h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f21314i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ak1.a f21315m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ bk1.w f21316n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage f21317o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kotlin.jvm.internal.h0 h0Var, ak1.a aVar, bk1.w wVar, com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage appBrandPrivacyManagePage, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f21314i = h0Var;
        this.f21315m = aVar;
        this.f21316n = wVar;
        this.f21317o = appBrandPrivacyManagePage;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bk1.i(this.f21314i, this.f21315m, this.f21316n, this.f21317o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bk1.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var;
        ak1.a aVar;
        bk1.w wVar;
        com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage appBrandPrivacyManagePage;
        bk1.y yVar;
        pz5.a aVar2 = pz5.a.f359186d;
        int i17 = this.f21313h;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            h0Var = this.f21314i;
            java.lang.Integer num = (java.lang.Integer) h0Var.f310123d;
            if (num == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrivacyManagePage", "onLoadMore, fetchToken is null, not need");
                return f0Var;
            }
            bk1.e0 e0Var = bk1.e0.f21297a;
            int intValue = num.intValue();
            aVar = this.f21315m;
            this.f21309d = aVar;
            this.f21310e = h0Var;
            bk1.w wVar2 = this.f21316n;
            this.f21311f = wVar2;
            com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage appBrandPrivacyManagePage2 = this.f21317o;
            this.f21312g = appBrandPrivacyManagePage2;
            this.f21313h = 1;
            obj = e0Var.a(intValue, this);
            if (obj == aVar2) {
                return aVar2;
            }
            wVar = wVar2;
            appBrandPrivacyManagePage = appBrandPrivacyManagePage2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            appBrandPrivacyManagePage = (com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage) this.f21312g;
            wVar = (bk1.w) this.f21311f;
            h0Var = (kotlin.jvm.internal.h0) this.f21310e;
            aVar = (ak1.a) this.f21309d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        bk1.f0 f0Var2 = (bk1.f0) obj;
        bk1.d dVar = com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage.f89928e;
        java.lang.Integer num2 = null;
        if (f0Var2 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrivacyManagePage", "onSecondTimesFetched, fetchResp is empty");
            aVar.a(false);
            h0Var.f310123d = null;
        } else {
            int i18 = f0Var2.f21301a;
            aVar.a(1 == i18);
            if ((1 == i18) && (yVar = (bk1.y) kz5.n0.k0(f0Var2.f21302b)) != null) {
                num2 = java.lang.Integer.valueOf(yVar.f21361c);
            }
            h0Var.f310123d = num2;
            wVar.x(appBrandPrivacyManagePage.m0(f0Var2));
        }
        return f0Var;
    }
}
