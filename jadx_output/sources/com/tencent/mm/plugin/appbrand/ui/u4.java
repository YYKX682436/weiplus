package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class u4 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public float f90251d = 50.0f;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.w4 f90252e;

    public u4(com.tencent.mm.plugin.appbrand.ui.w4 w4Var, com.tencent.mm.plugin.appbrand.ui.i4 i4Var) {
        this.f90252e = w4Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        float f17 = this.f90251d;
        if (f17 >= 100.0f) {
            return false;
        }
        this.f90251d = f17 + 0.33f;
        com.tencent.mm.plugin.appbrand.ui.w4 w4Var = this.f90252e;
        if (w4Var.V.getVisibility() != 0) {
            return true;
        }
        w4Var.f90293p0.setProgress(this.f90251d);
        return true;
    }
}
