package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes4.dex */
public final class o7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandStorageUsageUI f171434a;

    public o7(com.tencent.mm.plugin.appbrand.ui.AppBrandStorageUsageUI appBrandStorageUsageUI) {
        this.f171434a = appBrandStorageUsageUI;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        com.tencent.mm.plugin.appbrand.ui.AppBrandStorageUsageUI appBrandStorageUsageUI = this.f171434a;
        if (appBrandStorageUsageUI.isFinishing() || appBrandStorageUsageUI.isDestroyed()) {
            km5.u.b().c(new java.lang.Object[0]);
        }
        java.util.List list2 = appBrandStorageUsageUI.f;
        ((java.util.ArrayList) list2).clear();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        ((java.util.ArrayList) list2).addAll(list);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.sd sdVar = appBrandStorageUsageUI.e;
        if (sdVar == null) {
            return null;
        }
        sdVar.m8146xced61ae5();
        return jz5.f0.f384359a;
    }
}
