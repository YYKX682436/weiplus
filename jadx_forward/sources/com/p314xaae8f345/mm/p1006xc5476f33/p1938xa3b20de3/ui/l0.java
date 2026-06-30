package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class l0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.a1 f234197d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.a1 a1Var) {
        this.f234197d = a1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        android.app.Activity activity = this.f234197d.f234110a;
        yo3.m.y(activity, "freeze", activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l1r), 0, -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineLogicMgr", "doFreezeOffline");
    }
}
