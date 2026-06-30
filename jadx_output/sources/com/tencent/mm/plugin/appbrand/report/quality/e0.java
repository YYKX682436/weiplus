package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public final class e0 implements com.tencent.mm.plugin.appbrand.report.quality.b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.report.quality.e0 f88179a = new com.tencent.mm.plugin.appbrand.report.quality.e0();

    @Override // com.tencent.mm.plugin.appbrand.report.quality.b0
    public final boolean isEnable() {
        if (com.tencent.mm.plugin.appbrand.jsruntime.f2.f83986a.b()) {
            return org.xwalk.core.XWalkEnvironment.o() && org.xwalk.core.XWalkEnvironment.f(1043);
        }
        return false;
    }
}
