package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes9.dex */
public class t0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13049x1183363c f176693d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13049x1183363c viewOnClickListenerC13049x1183363c) {
        this.f176693d = viewOnClickListenerC13049x1183363c;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13049x1183363c viewOnClickListenerC13049x1183363c = this.f176693d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = viewOnClickListenerC13049x1183363c.f176334y;
        if (u3Var != null && u3Var.isShowing()) {
            viewOnClickListenerC13049x1183363c.f176334y.dismiss();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftAcceptUI", "user cancel & finish");
        viewOnClickListenerC13049x1183363c.finish();
    }
}
