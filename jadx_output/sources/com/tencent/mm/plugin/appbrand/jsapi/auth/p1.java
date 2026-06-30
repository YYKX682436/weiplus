package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79680d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.tencent.mm.plugin.appbrand.y yVar) {
        super(0);
        this.f79680d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.y mComponent = this.f79680d;
        kotlin.jvm.internal.o.g(mComponent, "mComponent");
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        if (!L.getBoolean("has_ever_show_wmpf_voip_call_in_scope_auth_notify_bottom_sheet", false)) {
            fl1.g2 authorizeDialogContainer = mComponent.t3().getAuthorizeDialogContainer();
            android.content.Context f147807d = mComponent.getF147807d();
            kotlin.jvm.internal.o.f(f147807d, "getContext(...)");
            ((fl1.c0) authorizeDialogContainer).c(new ui1.e0(f147807d));
            L.putBoolean("has_ever_show_wmpf_voip_call_in_scope_auth_notify_bottom_sheet", true);
        }
        return jz5.f0.f302826a;
    }
}
