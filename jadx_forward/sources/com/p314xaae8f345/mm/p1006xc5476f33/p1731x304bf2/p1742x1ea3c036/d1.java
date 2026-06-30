package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

/* loaded from: classes8.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15878x593061c5 f221081e;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15878x593061c5 activityC15878x593061c5, java.lang.String str) {
        this.f221081e = activityC15878x593061c5;
        this.f221080d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15878x593061c5 activityC15878x593061c5 = this.f221081e;
        if (activityC15878x593061c5.isFinishing() || activityC15878x593061c5.m78477x9d1e994e()) {
            return;
        }
        activityC15878x593061c5.f221037d.i(this.f221080d, activityC15878x593061c5.getIntent().getExtras());
    }
}
