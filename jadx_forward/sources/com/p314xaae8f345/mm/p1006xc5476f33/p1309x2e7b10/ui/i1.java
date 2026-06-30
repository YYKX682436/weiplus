package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes9.dex */
public class i1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17 f176559d;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17 viewOnClickListenerC13051xc6cfcc17) {
        this.f176559d = viewOnClickListenerC13051xc6cfcc17;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17 viewOnClickListenerC13051xc6cfcc17 = this.f176559d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = viewOnClickListenerC13051xc6cfcc17.f176356g;
        if (u3Var != null && u3Var.isShowing()) {
            viewOnClickListenerC13051xc6cfcc17.f176356g.dismiss();
        }
        if (viewOnClickListenerC13051xc6cfcc17.m78513xc2a54588().getVisibility() == 8 || viewOnClickListenerC13051xc6cfcc17.m78513xc2a54588().getVisibility() == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "user cancel & finish");
            viewOnClickListenerC13051xc6cfcc17.finish();
        }
    }
}
