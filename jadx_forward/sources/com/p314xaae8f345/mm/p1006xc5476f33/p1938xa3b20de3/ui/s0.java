package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class s0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo3.z f234236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.a1 f234237e;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.a1 a1Var, wo3.z zVar) {
        this.f234237e = a1Var;
        this.f234236d = zVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.e eVar = this.f234237e.f234111b;
        if (eVar != null) {
            wo3.z zVar = this.f234236d;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38) eVar).Y6(1, zVar.f529771f, "", zVar.f529773h);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineLogicMgr", "launchPwdDialog do pay");
    }
}
