package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.oc f88443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f88444e;

    public s2(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.oc ocVar) {
        this.f88444e = appBrandRuntime;
        this.f88443d = ocVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.util.SparseArray sparseArray = this.f88444e.S1;
        com.tencent.mm.plugin.appbrand.oc ocVar = this.f88443d;
        java.util.Set set = (java.util.Set) sparseArray.get(ocVar.f86243a);
        if (set != null) {
            set.remove(ocVar);
        }
    }
}
