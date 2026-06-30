package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public final class l2 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.n2 f47475d;

    public l2(com.tencent.luggage.sdk.jsapi.component.service.n2 n2Var) {
        this.f47475d = n2Var;
    }

    @Override // u81.f
    public final void D(java.lang.String str, u81.b bVar) {
        vp5.h hVar;
        int i17 = bVar == null ? -1 : com.tencent.luggage.sdk.jsapi.component.service.k2.f47466a[bVar.ordinal()];
        if (i17 == 1) {
            hVar = vp5.h.f439111d;
        } else if (i17 == 2) {
            hVar = vp5.h.f439112e;
        } else if (i17 == 3) {
            hVar = vp5.h.f439113f;
        } else {
            if (i17 != 4) {
                throw new jz5.j();
            }
            hVar = vp5.h.f439114g;
        }
        com.tencent.mm.weapp_core.JsBridge jsBridge = this.f47475d.f47502a;
        if (jsBridge != null) {
            jsBridge.onRunningStateChange(hVar);
        } else {
            kotlin.jvm.internal.o.o("jsBridge");
            throw null;
        }
    }
}
