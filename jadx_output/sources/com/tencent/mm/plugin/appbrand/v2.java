package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class v2 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f90641d;

    public v2(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f90641d = appBrandRuntime;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.appbrand.xc xcVar = (com.tencent.mm.plugin.appbrand.xc) obj;
        com.tencent.mm.plugin.appbrand.xc xcVar2 = (com.tencent.mm.plugin.appbrand.xc) obj2;
        if (xcVar == xcVar2) {
            return 0;
        }
        return xcVar.hashCode() - xcVar2.hashCode();
    }
}
