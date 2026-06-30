package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public final class a implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.report.a f87805d = new com.tencent.mm.plugin.appbrand.report.a();

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        kotlin.jvm.internal.o.g(it, "it");
        if (it.what != com.tencent.mm.plugin.appbrand.report.d.f87826c) {
            return true;
        }
        com.tencent.mm.plugin.appbrand.report.d.f(false);
        return true;
    }
}
