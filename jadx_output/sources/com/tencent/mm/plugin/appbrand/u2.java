package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class u2 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f89262d;

    public u2(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f89262d = appBrandRuntime;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.appbrand.e3 e3Var = (com.tencent.mm.plugin.appbrand.e3) obj;
        com.tencent.mm.plugin.appbrand.e3 e3Var2 = (com.tencent.mm.plugin.appbrand.e3) obj2;
        if (e3Var == e3Var2) {
            return 0;
        }
        return e3Var.hashCode() - e3Var2.hashCode();
    }
}
