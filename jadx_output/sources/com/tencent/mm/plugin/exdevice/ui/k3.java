package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.n3 f99543d;

    public k3(com.tencent.mm.plugin.exdevice.ui.n3 n3Var) {
        this.f99543d = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f99543d.notifyDataSetChanged();
    }
}
