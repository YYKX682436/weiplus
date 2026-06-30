package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.utils.e f90407d = new com.tencent.mm.plugin.appbrand.utils.e();

    public e() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.Object systemService = context != null ? context.getSystemService("accessibility") : null;
        if (systemService instanceof android.view.accessibility.AccessibilityManager) {
            return (android.view.accessibility.AccessibilityManager) systemService;
        }
        return null;
    }
}
