package com.tencent.mm.plugin.appbrand.wxassistant.cdp;

/* loaded from: classes7.dex */
public final class q3 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.wxassistant.cdp.s3 f92182d;

    public q3(com.tencent.mm.plugin.appbrand.wxassistant.cdp.s3 s3Var) {
        this.f92182d = s3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.plugin.appbrand.wxassistant.cdp.s3 s3Var = this.f92182d;
        java.util.Iterator it = s3Var.f92186x.iterator();
        while (it.hasNext()) {
            ((lk1.b) it.next()).j(0, "ok", s3Var.f("wgs84"));
        }
        java.util.Iterator it6 = s3Var.f92187y.iterator();
        while (it6.hasNext()) {
            ((lk1.b) it6.next()).j(0, "ok", s3Var.f("gcj02"));
        }
        return true;
    }
}
