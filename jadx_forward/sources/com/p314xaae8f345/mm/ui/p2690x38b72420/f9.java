package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes9.dex */
public class f9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.g9 f288241d;

    public f9(com.p314xaae8f345.mm.ui.p2690x38b72420.g9 g9Var) {
        this.f288241d = g9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2690x38b72420.g9 g9Var = this.f288241d;
        intent.putExtra("Select_Contact", g9Var.f288264f);
        intent.putExtra("App_MsgId", "fromSns");
        g9Var.f288265g.setResult(-1, intent);
        g9Var.f288265g.finish();
    }
}
