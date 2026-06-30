package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.k1 f99525d;

    public j1(com.tencent.mm.plugin.exdevice.ui.k1 k1Var) {
        this.f99525d = k1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.k1 k1Var = this.f99525d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = k1Var.f99541a.f99220m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        db5.e1.C(k1Var.f99541a.getContext(), k1Var.f99541a.getContext().getString(com.tencent.mm.R.string.c1z), "", k1Var.f99541a.getContext().getString(com.tencent.mm.R.string.c2t), "", false, new com.tencent.mm.plugin.exdevice.ui.i1(this), null).show();
    }
}
