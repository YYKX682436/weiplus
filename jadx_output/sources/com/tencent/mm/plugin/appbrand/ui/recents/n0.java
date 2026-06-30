package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f90128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f90129e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.p0 f90130f;

    public n0(com.tencent.mm.plugin.appbrand.ui.recents.p0 p0Var, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        this.f90130f = p0Var;
        this.f90128d = arrayList;
        this.f90129e = arrayList2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.q0(this.f90130f.f90137d, this.f90128d, this.f90129e, true);
    }
}
