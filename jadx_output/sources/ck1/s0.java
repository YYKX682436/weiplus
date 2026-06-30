package ck1;

/* loaded from: classes4.dex */
public final class s0 extends androidx.lifecycle.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage f42373d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.j0 f42374e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.g0 f42375f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.j0 f42376g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.g0 f42377h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.j0 f42378i;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.lifecycle.g0 f42379m;

    public s0(com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage appBrandUserInfoRevokePage, java.lang.String str, kotlin.jvm.internal.i iVar) {
        this.f42373d = appBrandUserInfoRevokePage;
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0(null);
        this.f42374e = j0Var;
        this.f42375f = j0Var;
        androidx.lifecycle.j0 j0Var2 = new androidx.lifecycle.j0(ck1.l0.f42345d);
        this.f42376g = j0Var2;
        this.f42377h = j0Var2;
        androidx.lifecycle.j0 j0Var3 = new androidx.lifecycle.j0(null);
        this.f42378i = j0Var3;
        this.f42379m = j0Var3;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.UserInfoRevokeViewModel", "<init>, appId: " + str);
        kotlinx.coroutines.l.d(androidx.lifecycle.z.a(appBrandUserInfoRevokePage), null, null, new ck1.p0(this, str, null), 3, null);
    }

    public final void N6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.UserInfoRevokeViewModel", "onManageBtnClick");
        androidx.lifecycle.j0 j0Var = this.f42376g;
        ck1.l0 l0Var = (ck1.l0) j0Var.getValue();
        if (l0Var == null) {
            l0Var = ck1.l0.f42345d;
        }
        ck1.l0 l0Var2 = ck1.l0.f42345d;
        if (l0Var2 == l0Var) {
            l0Var2 = ck1.l0.f42346e;
        }
        j0Var.setValue(l0Var2);
    }
}
