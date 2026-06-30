package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.j f222922d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.j jVar) {
        this.f222922d = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.j jVar = this.f222922d;
        g0Var.d(14217, jVar.f222960f.f67370x28d45f97, 6, "", jVar.f222960f.f319901J, 2);
        dialogInterface.dismiss();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommonGameClickLinstener", "addDownloadTask not wifi, user cancel");
    }
}
