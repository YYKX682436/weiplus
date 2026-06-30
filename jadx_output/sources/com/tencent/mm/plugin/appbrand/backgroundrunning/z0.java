package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
public class z0 implements com.tencent.mm.sdk.platformtools.h5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.backgroundrunning.b1 f77003a;

    public z0(com.tencent.mm.plugin.appbrand.backgroundrunning.b1 b1Var) {
        this.f77003a = b1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.h5
    public void a(int i17) {
        if (i17 == 1 || i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMBackgroundRunningManagerService", "onPhoneCall, kill voip, state:%s", java.lang.Integer.valueOf(i17));
            this.f77003a.wi();
        }
    }
}
