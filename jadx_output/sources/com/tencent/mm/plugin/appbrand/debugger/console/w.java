package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.debugger.console.w f77718d = new com.tencent.mm.plugin.appbrand.debugger.console.w();

    public w() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.type = android.os.Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        layoutParams.format = 1;
        layoutParams.packageName = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageName();
        layoutParams.flags = 196904;
        layoutParams.width = -1;
        layoutParams.height = -1;
        return layoutParams;
    }
}
