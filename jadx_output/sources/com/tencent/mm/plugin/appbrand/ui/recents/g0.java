package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.o1 f90082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90083e;

    public g0(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList, com.tencent.mm.plugin.appbrand.ui.recents.o1 o1Var) {
        this.f90083e = appBrandLauncherRecentsList;
        this.f90082d = o1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!com.tencent.mm.sdk.platformtools.t8.L0(this.f90083e.f90017z)) {
            int size = this.f90083e.f90017z.size();
            this.f90083e.f90017z.clear();
            this.f90083e.f90016y.notifyItemRangeRemoved(0, size);
        }
        this.f90083e.f90017z.addAll(this.f90082d);
        this.f90083e.f90016y.notifyItemRangeInserted(0, this.f90082d.size());
        synchronized (this.f90083e.R) {
            this.f90083e.R.notifyAll();
        }
    }
}
