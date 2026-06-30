package com.tencent.mm.plugin.appbrand.luggage.customize;

/* loaded from: classes.dex */
public class k0 extends dg1.i {

    /* renamed from: d, reason: collision with root package name */
    public boolean f85530d = false;

    @Override // lf.f
    public boolean a() {
        if (this.f85530d) {
            return true;
        }
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, null, com.tencent.mm.plugin.appbrand.luggage.customize.j0.class);
        boolean z17 = iPCBoolean == null ? false : iPCBoolean.f68400d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaMapViewFactoryWC", "isOverseasUserFromMainTask:%b", java.lang.Boolean.valueOf(z17));
        this.f85530d = z17;
        return z17;
    }
}
