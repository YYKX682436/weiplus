package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class s3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.u3 f99658d;

    public s3(com.tencent.mm.plugin.exdevice.ui.u3 u3Var) {
        this.f99658d = u3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f99658d.notifyDataSetChanged();
    }
}
