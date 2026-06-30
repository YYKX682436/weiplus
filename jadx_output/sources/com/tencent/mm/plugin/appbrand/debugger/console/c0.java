package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes2.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.debugger.console.c0 f77652d = new com.tencent.mm.plugin.appbrand.debugger.console.c0();

    public c0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window");
        if (systemService instanceof android.view.WindowManager) {
            return (android.view.WindowManager) systemService;
        }
        return null;
    }
}
