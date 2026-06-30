package com.p314xaae8f345.mm.ui.p2722x33325c.sdk;

/* loaded from: classes13.dex */
public class q implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2722x33325c.sdk.r f290754d;

    public q(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.r rVar) {
        this.f290754d = rVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.s sVar;
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.r rVar = this.f290754d;
        if (!rVar.f290755a || (sVar = rVar.f290756b) == null) {
            return;
        }
        sVar.f290759e.mo48702x3d6f0539();
        rVar.f290756b.dismiss();
    }
}
