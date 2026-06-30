package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class x5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6128x89a4de44 f255954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18631x6637f79d f255955e;

    public x5(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6128x89a4de44 c6128x89a4de44, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18631x6637f79d activityC18631x6637f79d) {
        this.f255954d = c6128x89a4de44;
        this.f255955e = activityC18631x6637f79d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("config update old");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6128x89a4de44 c6128x89a4de44 = this.f255954d;
        sb6.append(c6128x89a4de44.f136400g.f89939a);
        sb6.append(" new:");
        sb6.append(c6128x89a4de44.f136400g.f89940b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivity", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18631x6637f79d activityC18631x6637f79d = this.f255955e;
        activityC18631x6637f79d.f255057r.clear();
        activityC18631x6637f79d.f255057r.addAll(bk4.i.a().g());
        activityC18631x6637f79d.f255058s = activityC18631x6637f79d.Y6(activityC18631x6637f79d.f255057r);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = activityC18631x6637f79d.f255046d;
        if (c22849x81a93d25 == null || (mo7946xf939df19 = c22849x81a93d25.mo7946xf939df19()) == null) {
            return;
        }
        mo7946xf939df19.m8146xced61ae5();
    }
}
