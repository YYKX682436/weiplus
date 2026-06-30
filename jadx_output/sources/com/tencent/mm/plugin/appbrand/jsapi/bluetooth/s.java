package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public interface s extends com.tencent.mm.plugin.appbrand.jsapi.h0 {
    static /* synthetic */ void n8(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s sVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: disable");
        }
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        sVar.Fd(z17);
    }

    void Fd(boolean z17);

    boolean H6();

    java.lang.String N6();

    void S6(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.r rVar);

    void j8(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.r rVar);

    void v4();

    void y();
}
