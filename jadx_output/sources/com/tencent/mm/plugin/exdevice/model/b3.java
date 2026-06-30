package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes12.dex */
public class b3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.c3 f98853d;

    public b3(com.tencent.mm.plugin.exdevice.model.c3 c3Var) {
        this.f98853d = c3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.model.c3 c3Var = this.f98853d;
        if (c3Var.f98862b.f98904l.isShowing()) {
            c3Var.f98862b.f98904l.dismiss();
        }
    }
}
