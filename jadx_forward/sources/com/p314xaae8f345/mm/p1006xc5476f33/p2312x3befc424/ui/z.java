package com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui;

/* loaded from: classes11.dex */
public class z implements c01.qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18771x75e3b580 f256876a;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18771x75e3b580 activityC18771x75e3b580) {
        this.f256876a = activityC18771x75e3b580;
    }

    @Override // c01.qa
    public void a(com.p314xaae8f345.mm.p971x6de15a2e.s sVar) {
        if (sVar == null) {
            return;
        }
        jn4.m mVar = new jn4.m(c01.z1.r());
        com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18771x75e3b580 activityC18771x75e3b580 = this.f256876a;
        activityC18771x75e3b580.f256846f = mVar;
        activityC18771x75e3b580.f256846f.b(sVar.e1(true), true);
        activityC18771x75e3b580.f256846f.b(sVar.e1(false), false);
        jn4.m mVar2 = activityC18771x75e3b580.f256846f;
        mVar2.f382354f = new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.v(this);
        mVar2.f382353e = new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.w(this);
        mVar2.f382356h = new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.x(this);
        mVar2.f382355g = new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.y(this);
        java.util.Map map = mVar2.f382351c;
        if (map == null || ((java.util.HashMap) map).size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTraceRoute", "no iplist");
        } else {
            if (jn4.m.f382348j == null) {
                jn4.m.f382348j = new jn4.p();
            }
            s75.d.b(new jn4.l(mVar2, null), "MMTraceRoute_start");
        }
        activityC18771x75e3b580.f256849i.c(1200L, 1200L);
    }
}
