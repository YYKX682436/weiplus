package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90389e;

    public b0(java.lang.String str, java.lang.String str2) {
        this.f90388d = str;
        this.f90389e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f90388d;
        java.lang.String str2 = this.f90389e;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "doCallback url:%s, localPath:%s", str, str2);
        java.util.HashMap hashMap = (java.util.HashMap) com.tencent.mm.plugin.appbrand.utils.d0.f90403b;
        java.util.List list = (java.util.List) hashMap.get(str);
        if (list == null || list.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "doCallback callbacks nil");
            return;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            ((com.tencent.mm.plugin.appbrand.utils.c0) list.get(i17)).a(str2);
        }
        hashMap.remove(str);
    }
}
