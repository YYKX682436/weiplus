package com.tencent.mm.plugin.appbrand;

/* loaded from: classes3.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.n0 f86017d = new com.tencent.mm.plugin.appbrand.n0();

    public n0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.cp9);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.plugin.appbrand.m0 m0Var = new com.tencent.mm.plugin.appbrand.m0(string, "app_brand_pay_guide.pag", 1, 2, com.tencent.mm.sdk.platformtools.x2.f193075e.getText(com.tencent.mm.R.string.bx_), null, null, true, null);
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.cpo);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return kz5.c0.i(m0Var, new com.tencent.mm.plugin.appbrand.m0(string2, "app_brand_short_play_guide.pag", 0, 1, null, com.tencent.mm.sdk.platformtools.x2.f193075e.getText(com.tencent.mm.R.string.bx_), com.tencent.mm.sdk.platformtools.x2.f193075e.getText(com.tencent.mm.R.string.cma), true, null));
    }
}
