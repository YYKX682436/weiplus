package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class v4 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public int f171804d = 50;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4 f171805e;

    public v4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4 w4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.i4 i4Var) {
        this.f171805e = w4Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        int i17 = this.f171804d;
        if (i17 >= 100) {
            return false;
        }
        int i18 = i17 + 1;
        this.f171804d = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4 w4Var = this.f171805e;
        w4Var.H.m52905x3ae760af(i18);
        if (this.f171804d == 100) {
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
