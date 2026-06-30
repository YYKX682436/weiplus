package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes15.dex */
public final class u1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.w1 f240605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f240606e;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.w1 w1Var, long j17) {
        this.f240605d = w1Var;
        this.f240606e = j17;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductForGalleryHelper", "processGoodsImage onCancel and resumeScan");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.w1 w1Var = this.f240605d;
        if (w1Var.f240620c == this.f240606e) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.t1 t1Var = w1Var.f240619b;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) w1Var.f240618a).n7();
        sz3.w wVar = w1Var.f240622e;
    }
}
