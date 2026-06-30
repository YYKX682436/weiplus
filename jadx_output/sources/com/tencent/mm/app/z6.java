package com.tencent.mm.app;

/* loaded from: classes7.dex */
public class z6 implements com.tencent.mm.app.h4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.SupportProfile f53939d;

    public z6(com.tencent.mm.app.SupportProfile supportProfile) {
        this.f53939d = supportProfile;
    }

    @Override // com.tencent.mm.app.h4
    public void a(java.lang.Thread thread, java.lang.String str, java.lang.Throwable th6) {
        this.f53939d.getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(637L, 0L, 1L, false);
        com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.d();
    }

    @Override // com.tencent.mm.app.h4
    public void e(int i17, java.lang.String str) {
    }
}
