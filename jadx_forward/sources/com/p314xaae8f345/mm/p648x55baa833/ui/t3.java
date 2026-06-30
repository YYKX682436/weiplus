package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public class t3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f146055d;

    public t3(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10344x9fa852c8 activityC10344x9fa852c8, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f146055d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f146055d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsManagereUI", "dialog onCancel scene:%s", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        gm0.j1.d().d(m1Var);
    }
}
