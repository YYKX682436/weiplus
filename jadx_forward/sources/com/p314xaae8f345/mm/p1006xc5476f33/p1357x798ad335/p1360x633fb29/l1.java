package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class l1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a f178612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f178613e;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a aVar, vz.z1 z1Var) {
        this.f178612d = aVar;
        this.f178613e = z1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGameDownloadManager", "new style, not wifi, reserve download task for wifi");
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.d(this.f178612d, this.f178613e, true, true);
    }
}
