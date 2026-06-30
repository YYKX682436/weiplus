package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 f91225d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var) {
        super(0);
        this.f91225d = l0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = false;
        if ("wxca8d4b8e8feedc2a".equals(this.f91225d.f91195a.f74803n)) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_appbrand_we_shop_halfscreen_drag_height_max, (!o45.zf.f343043d || com.tencent.mm.sdk.platformtools.z.f193112h > 671104511) ? 0 : 1) == 1) {
                z17 = true;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
