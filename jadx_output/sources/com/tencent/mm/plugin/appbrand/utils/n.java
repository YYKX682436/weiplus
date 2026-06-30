package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class n implements com.tencent.mm.plugin.appbrand.utils.o2 {
    public n(kotlin.jvm.internal.i iVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.o2
    public com.tencent.mm.plugin.appbrand.utils.p2 a(com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        android.content.Context context;
        if (tVar == null || (context = tVar.getContext()) == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        return new com.tencent.mm.plugin.appbrand.utils.o(context);
    }
}
