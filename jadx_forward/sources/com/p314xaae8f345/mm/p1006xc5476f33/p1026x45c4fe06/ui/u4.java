package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class u4 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public float f171784d = 50.0f;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4 f171785e;

    public u4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4 w4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.i4 i4Var) {
        this.f171785e = w4Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        float f17 = this.f171784d;
        if (f17 >= 100.0f) {
            return false;
        }
        this.f171784d = f17 + 0.33f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4 w4Var = this.f171785e;
        if (w4Var.V.getVisibility() != 0) {
            return true;
        }
        w4Var.f171826p0.m50366x3ae760af(this.f171784d);
        return true;
    }
}
