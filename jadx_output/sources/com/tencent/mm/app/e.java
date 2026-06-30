package com.tencent.mm.app;

/* loaded from: classes7.dex */
public class e implements com.tencent.mm.app.h4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.AppBrandProfile f53397d;

    public e(com.tencent.mm.app.AppBrandProfile appBrandProfile) {
        this.f53397d = appBrandProfile;
    }

    @Override // com.tencent.mm.app.h4
    public void a(java.lang.Thread thread, java.lang.String str, java.lang.Throwable th6) {
        this.f53397d.getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(365L, 3L, 1L, false);
        com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.d();
    }

    @Override // com.tencent.mm.app.h4
    public void e(int i17, java.lang.String str) {
    }
}
