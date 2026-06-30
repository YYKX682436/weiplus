package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes8.dex */
public final class i implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.m f213806d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.m mVar) {
        this.f213806d = mVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.m mVar = this.f213806d;
        mVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AnnounceWebViewDialogWrapper", "onDismiss");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = mVar.f214155g.f213726c;
        if (c22633x83752a59 != null) {
            c22633x83752a59.mo120189xb61559a7(null);
        }
        android.content.DialogInterface.OnDismissListener onDismissListener = mVar.f214154f;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(mVar.f214149a);
        }
        mVar.f214152d = false;
        mVar.f214156h.mo63379x41012807();
    }
}
