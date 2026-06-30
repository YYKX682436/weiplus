package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171922e;

    public b0(java.lang.String str, java.lang.String str2) {
        this.f171921d = str;
        this.f171922e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f171921d;
        java.lang.String str2 = this.f171922e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "doCallback url:%s, localPath:%s", str, str2);
        java.util.HashMap hashMap = (java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d0.f171936b;
        java.util.List list = (java.util.List) hashMap.get(str);
        if (list == null || list.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "doCallback callbacks nil");
            return;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c0) list.get(i17)).a(str2);
        }
        hashMap.remove(str);
    }
}
