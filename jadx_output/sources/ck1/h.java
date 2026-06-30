package ck1;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage f42329d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage appBrandUserInfoRevokePage) {
        super(0);
        this.f42329d = appBrandUserInfoRevokePage;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage appBrandUserInfoRevokePage = this.f42329d;
        java.lang.String stringExtra = appBrandUserInfoRevokePage.getStringExtra("appId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return (ck1.s0) new androidx.lifecycle.j1(appBrandUserInfoRevokePage.getViewModel(), new ck1.q0(appBrandUserInfoRevokePage, stringExtra)).a(ck1.s0.class);
    }
}
