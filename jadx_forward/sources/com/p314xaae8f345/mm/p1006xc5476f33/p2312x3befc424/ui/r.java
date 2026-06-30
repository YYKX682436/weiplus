package com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui;

/* loaded from: classes11.dex */
public class r extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18771x75e3b580 f256868a;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18771x75e3b580 activityC18771x75e3b580) {
        this.f256868a = activityC18771x75e3b580;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17 = message.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18771x75e3b580 activityC18771x75e3b580 = this.f256868a;
        if (i17 == 1) {
            activityC18771x75e3b580.f256849i.d();
            jn4.m mVar = activityC18771x75e3b580.f256846f;
            if (mVar != null) {
                mVar.d();
            }
            if (activityC18771x75e3b580.f256845e < 95) {
                activityC18771x75e3b580.f256847g.m79071x3ae760af(95);
            }
            jn4.m mVar2 = activityC18771x75e3b580.f256846f;
            synchronized (mVar2) {
                jn4.h hVar = mVar2.f382350b;
                if (hVar != null) {
                    hVar.a();
                }
            }
            return;
        }
        if (i17 == 2) {
            if (activityC18771x75e3b580.f256845e < 95) {
                activityC18771x75e3b580.f256847g.m79071x3ae760af(95);
            }
            jn4.m mVar3 = activityC18771x75e3b580.f256846f;
            synchronized (mVar3) {
                jn4.h hVar2 = mVar3.f382350b;
                if (hVar2 != null) {
                    hVar2.a();
                }
            }
            return;
        }
        if (i17 == 3) {
            activityC18771x75e3b580.f256847g.m79071x3ae760af(100);
            com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18771x75e3b580.T6(activityC18771x75e3b580, false);
        } else {
            if (i17 != 4) {
                return;
            }
            activityC18771x75e3b580.f256847g.m79071x3ae760af(100);
            com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18771x75e3b580.T6(activityC18771x75e3b580, true);
        }
    }
}
