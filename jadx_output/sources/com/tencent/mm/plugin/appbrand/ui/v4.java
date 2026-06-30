package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class v4 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public int f90271d = 50;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.w4 f90272e;

    public v4(com.tencent.mm.plugin.appbrand.ui.w4 w4Var, com.tencent.mm.plugin.appbrand.ui.i4 i4Var) {
        this.f90272e = w4Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int i17 = this.f90271d;
        if (i17 >= 100) {
            return false;
        }
        int i18 = i17 + 1;
        this.f90271d = i18;
        com.tencent.mm.plugin.appbrand.ui.w4 w4Var = this.f90272e;
        w4Var.H.setProgress(i18);
        if (this.f90271d == 100) {
            w4Var.L = true;
            java.lang.Runnable runnable = w4Var.M;
            if (runnable != null) {
                runnable.run();
                w4Var.M = null;
            }
        }
        return true;
    }
}
