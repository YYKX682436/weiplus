package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes4.dex */
public final class o7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandStorageUsageUI f89901a;

    public o7(com.tencent.mm.plugin.appbrand.ui.AppBrandStorageUsageUI appBrandStorageUsageUI) {
        this.f89901a = appBrandStorageUsageUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        com.tencent.mm.plugin.appbrand.ui.AppBrandStorageUsageUI appBrandStorageUsageUI = this.f89901a;
        if (appBrandStorageUsageUI.isFinishing() || appBrandStorageUsageUI.isDestroyed()) {
            km5.u.b().c(new java.lang.Object[0]);
        }
        java.util.List list2 = appBrandStorageUsageUI.f;
        ((java.util.ArrayList) list2).clear();
        kotlin.jvm.internal.o.d(list);
        ((java.util.ArrayList) list2).addAll(list);
        com.tencent.mm.plugin.appbrand.ui.sd sdVar = appBrandStorageUsageUI.e;
        if (sdVar == null) {
            return null;
        }
        sdVar.notifyDataSetChanged();
        return jz5.f0.f302826a;
    }
}
