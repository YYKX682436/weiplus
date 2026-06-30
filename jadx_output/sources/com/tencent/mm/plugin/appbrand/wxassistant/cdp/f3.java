package com.tencent.mm.plugin.appbrand.wxassistant.cdp;

/* loaded from: classes7.dex */
public final class f3 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f92181c;

    static {
        new java.util.concurrent.atomic.AtomicInteger(0);
        f92181c = new java.util.concurrent.ConcurrentHashMap();
    }

    @android.webkit.JavascriptInterface
    public final void onResolve(int i17, java.lang.String result) {
        kotlin.jvm.internal.o.g(result, "result");
        yz5.p pVar = (yz5.p) f92181c.remove(java.lang.Integer.valueOf(i17));
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(i17), result);
        }
    }
}
