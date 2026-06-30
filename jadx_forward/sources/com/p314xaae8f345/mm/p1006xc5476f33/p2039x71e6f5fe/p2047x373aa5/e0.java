package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

/* loaded from: classes14.dex */
public final class e0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 f241462d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 t0Var) {
        this.f241462d = t0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 t0Var = this.f241462d;
        t0Var.x(22);
        t0Var.f241527x = false;
        java.lang.String str = t0Var.f241518p;
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        byte[] bArr = t0Var.D;
        if (bArr != null) {
            arrayList.add(bArr);
        }
        byte[] bArr2 = t0Var.H;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        byte[] bArr3 = t0Var.N;
        if (bArr3 != null) {
            arrayList.add(bArr3);
        }
        bundle.putSerializable("param_card_bitmap", arrayList);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.u uVar = t0Var.f241522s;
        if (uVar == null) {
            return true;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p1) uVar).a(0L, bundle);
        return true;
    }
}
