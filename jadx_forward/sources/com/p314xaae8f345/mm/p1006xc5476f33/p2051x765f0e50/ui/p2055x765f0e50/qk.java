package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes.dex */
public final class qk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5868xe54ea839 f243011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17451x47a8746b f243012e;

    public qk(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5868xe54ea839 c5868xe54ea839, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17451x47a8746b activityC17451x47a8746b) {
        this.f243011d = c5868xe54ea839;
        this.f243012e = activityC17451x47a8746b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        am.lp lpVar = this.f243011d.f136177h;
        if (lpVar.f88786a == 0) {
            java.util.List list = lpVar.f88797l;
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17451x47a8746b activityC17451x47a8746b = this.f243012e;
            activityC17451x47a8746b.f242132e = list;
            if (list == null) {
                activityC17451x47a8746b.f242132e = new java.util.ArrayList();
            }
        }
    }
}
