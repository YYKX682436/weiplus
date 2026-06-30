package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class w1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.h2 f180615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z1 f180616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.a2 f180617f;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.a2 a2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.h2 h2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z1 z1Var) {
        this.f180617f = a2Var;
        this.f180615d = h2Var;
        this.f180616e = z1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.n().f354821b.d(this.f180615d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.a2 a2Var = this.f180617f;
        android.app.ProgressDialog progressDialog = a2Var.f180379d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        a2Var.f180380e = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z1 z1Var = this.f180616e;
        if (z1Var != null) {
            z1Var.a(false);
        }
        a2Var.f180379d = null;
    }
}
