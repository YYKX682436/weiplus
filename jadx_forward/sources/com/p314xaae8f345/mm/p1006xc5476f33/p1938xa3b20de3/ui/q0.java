package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class q0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.a1 f234226d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.a1 a1Var) {
        this.f234226d = a1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        yo3.m.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.a1 a1Var = this.f234226d;
        android.app.Activity activity = a1Var.f234110a;
        db5.e1.T(activity, activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l1k));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineLogicMgr", "closeOffline");
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.e eVar = a1Var.f234111b;
        if (eVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38) eVar).m83099x5406100e(new wo3.j(""), false);
        }
    }
}
