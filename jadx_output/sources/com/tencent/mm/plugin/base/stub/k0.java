package com.tencent.mm.plugin.base.stub;

/* loaded from: classes12.dex */
public class k0 extends com.tencent.mm.sdk.platformtools.d8 {
    public k0(com.tencent.mm.plugin.base.stub.WXCommProvider wXCommProvider, long j17, java.lang.Boolean bool, boolean z17) {
        super(j17, bool, z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean] */
    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        java.lang.String str = "MicroMsg.WXCommProvider";
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WXCommProvider", "checkIsLogin run");
            if (gm0.j1.a()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WXCommProvider", "checkIsLogin doScene");
                str = java.lang.Boolean.valueOf(c01.d9.e().h(new c01.ra(new com.tencent.mm.plugin.base.stub.j0(this), null), 0));
            } else {
                str = java.lang.Boolean.FALSE;
            }
            return str;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e(str, "exception in NetSceneLocalProxy.");
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            c(bool);
            return bool;
        }
    }
}
