package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class v0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.a1 f234272d;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.a1 a1Var) {
        this.f234272d = a1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.a1 a1Var = this.f234272d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var = a1Var.f234112c;
        if (n8Var != null) {
            n8Var.dismiss();
            a1Var.f234112c = null;
        }
    }
}
