package com.tencent.luggage.sdk.customize.impl;

@j95.b
/* loaded from: classes.dex */
public final class l extends i95.w implements pb1.u {
    @Override // pb1.u
    public int F9() {
        iz5.a.g(null, qk0.c.a(com.tencent.luggage.sdk.customize.impl.i.f47322a.getClass()));
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.x2.f193072b, null, com.tencent.luggage.sdk.customize.impl.i.class);
        int i17 = iPCInteger != null ? iPCInteger.f68404d : -1;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LuggageBLEScanStats", "recordScanStart#Agent, id: " + i17);
        return i17;
    }

    @Override // pb1.u
    public boolean dj() {
        iz5.a.g(null, qk0.c.a(com.tencent.luggage.sdk.customize.impl.h.f47321a.getClass()));
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.x2.f193072b, null, com.tencent.luggage.sdk.customize.impl.h.class);
        boolean z17 = iPCBoolean != null ? iPCBoolean.f68400d : false;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LuggageBLEScanStats", "isScanningTooFrequently#Agent, isTooFrequently: " + z17);
        return z17;
    }

    @Override // pb1.u
    public void t9(int i17) {
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = new com.tencent.mm.ipcinvoker.type.IPCInteger(i17);
        com.tencent.luggage.sdk.customize.impl.j jVar = com.tencent.luggage.sdk.customize.impl.j.f47323d;
        com.tencent.luggage.sdk.customize.impl.k kVar = com.tencent.luggage.sdk.customize.impl.k.f47324d;
        iz5.a.g(null, qk0.c.a(jVar.getClass()));
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.x2.f193072b, iPCInteger, jVar.getClass(), kVar);
    }
}
