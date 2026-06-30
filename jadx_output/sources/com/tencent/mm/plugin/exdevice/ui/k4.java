package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.l4 f99544d;

    public k4(com.tencent.mm.plugin.exdevice.ui.l4 l4Var) {
        this.f99544d = l4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f99544d.f99555a.f99322z;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
