package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class b3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.f f222576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f222577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15955xbd627646 f222578f;

    public b3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15955xbd627646 activityC15955xbd627646, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, long j17) {
        this.f222578f = activityC15955xbd627646;
        this.f222576d = fVar;
        this.f222577e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15955xbd627646 activityC15955xbd627646 = this.f222578f;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f222576d;
        if (fVar == null) {
            activityC15955xbd627646.f222293y = new m53.e2();
        } else {
            activityC15955xbd627646.f222293y = (m53.e2) fVar;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.a3(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.v1(fVar)));
    }
}
