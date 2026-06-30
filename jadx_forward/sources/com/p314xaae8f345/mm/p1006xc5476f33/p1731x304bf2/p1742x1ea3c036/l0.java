package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

/* loaded from: classes8.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825 f221339e;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825 activityC15876x18f56825, java.lang.String str) {
        this.f221339e = activityC15876x18f56825;
        this.f221338d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825 activityC15876x18f56825 = this.f221339e;
        if (activityC15876x18f56825.isFinishing() || activityC15876x18f56825.m78477x9d1e994e()) {
            return;
        }
        activityC15876x18f56825.f221027d.i(this.f221338d, activityC15876x18f56825.getIntent().getExtras());
    }
}
