package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.n3 f99554d;

    public l3(com.tencent.mm.plugin.exdevice.ui.n3 n3Var) {
        this.f99554d = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.n3 n3Var = this.f99554d;
        ((java.util.LinkedList) n3Var.f99581d).remove(n3Var.f99587m);
        this.f99554d.notifyDataSetChanged();
        this.f99554d.f99587m = -1;
    }
}
