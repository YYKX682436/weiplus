package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public interface c0 extends com.tencent.mm.plugin.appbrand.jsruntime.u {
    void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback);

    default boolean p() {
        return false;
    }
}
