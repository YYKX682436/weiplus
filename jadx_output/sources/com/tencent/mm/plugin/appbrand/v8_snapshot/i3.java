package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes3.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.v8_snapshot.i3 f90735d = new com.tencent.mm.plugin.appbrand.v8_snapshot.i3();

    public i3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean z17 = true;
        if (!z65.c.a() && 1 != new java.util.Random().nextInt(100)) {
            z17 = false;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", "shouldReportNormalAction: " + valueOf.booleanValue());
        return valueOf;
    }
}
