package com.tencent.luggage.sdk.customize.impl;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class h<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.luggage.sdk.customize.impl.h f47321a = new com.tencent.luggage.sdk.customize.impl.h();

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean dj6 = com.tencent.luggage.sdk.customize.impl.n.f47328e.dj();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LuggageBLEScanStats", "invoke, isScanningTooFrequently, isTooFrequently: " + dj6);
        return new com.tencent.mm.ipcinvoker.type.IPCBoolean(dj6);
    }
}
