package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes8.dex */
public class y0 implements lt.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m f175352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f175353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f175354c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840 f175355d;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840 activityC12946xbb486840, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, android.os.Bundle bundle) {
        this.f175355d = activityC12946xbb486840;
        this.f175352a = mVar;
        this.f175353b = m1Var;
        this.f175354c = bundle;
    }

    @Override // lt.h0
    public void a(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar) {
        if (mVar == null) {
            mVar = this.f175352a;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840 activityC12946xbb486840 = this.f175355d;
        if (activityC12946xbb486840.f175234v.get() != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840) activityC12946xbb486840.f175234v.get()).d7();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840) activityC12946xbb486840.f175234v.get()).c7(this.f175353b, mVar, this.f175354c);
        }
        activityC12946xbb486840.finish();
    }
}
