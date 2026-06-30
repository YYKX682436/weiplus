package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class w1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.h2 f99082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.z1 f99083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.a2 f99084f;

    public w1(com.tencent.mm.plugin.exdevice.model.a2 a2Var, com.tencent.mm.plugin.exdevice.model.h2 h2Var, com.tencent.mm.plugin.exdevice.model.z1 z1Var) {
        this.f99084f = a2Var;
        this.f99082d = h2Var;
        this.f99083e = z1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.n().f273288b.d(this.f99082d);
        com.tencent.mm.plugin.exdevice.model.a2 a2Var = this.f99084f;
        android.app.ProgressDialog progressDialog = a2Var.f98846d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        a2Var.f98847e = false;
        com.tencent.mm.plugin.exdevice.model.z1 z1Var = this.f99083e;
        if (z1Var != null) {
            z1Var.a(false);
        }
        a2Var.f98846d = null;
    }
}
