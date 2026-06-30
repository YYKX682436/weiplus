package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class w2 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f90941d;

    public w2(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f90941d = appBrandRuntime;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Runnable runnable = (java.lang.Runnable) obj;
        java.lang.Runnable runnable2 = (java.lang.Runnable) obj2;
        if (runnable == runnable2) {
            return 0;
        }
        return runnable.hashCode() - runnable2.hashCode();
    }
}
