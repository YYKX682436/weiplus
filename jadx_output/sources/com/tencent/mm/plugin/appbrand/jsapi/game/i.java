package com.tencent.mm.plugin.appbrand.jsapi.game;

/* loaded from: classes7.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f81259e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        super(0);
        this.f81258d = e9Var;
        this.f81259e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List<com.tencent.mm.plugin.appbrand.menu.u0> G1;
        java.lang.Object obj;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81258d;
        com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var.V0();
        if (V0 != null && (G1 = V0.G1()) != null) {
            java.util.Iterator<T> it = G1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.tencent.mm.plugin.appbrand.menu.u0) obj).f85993a == this.f81259e) {
                    break;
                }
            }
            com.tencent.mm.plugin.appbrand.menu.u0 u0Var = (com.tencent.mm.plugin.appbrand.menu.u0) obj;
            if (u0Var != null) {
                com.tencent.mm.plugin.appbrand.menu.l1.d(u0Var, "key_show_red_dot", true);
            }
        }
        mi1.v vVar = e9Var.getRuntime().f74821z;
        if (vVar != null) {
            vVar.d().performClick();
        }
        return jz5.f0.f302826a;
    }
}
