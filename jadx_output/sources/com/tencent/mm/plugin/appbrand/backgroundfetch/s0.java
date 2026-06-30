package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes4.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f76892a = new android.util.SparseArray();

    public com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel a(java.lang.String str, int i17) {
        com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel appBrandBackgroundFetchDataParcel;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        int hash = java.util.Objects.hash(str, java.lang.Integer.valueOf(i17));
        synchronized (this.f76892a) {
            appBrandBackgroundFetchDataParcel = (com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel) this.f76892a.get(hash);
            if (appBrandBackgroundFetchDataParcel != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BackgroundFetchDataMemoryStorage", "get ok, username:%s, fetchType:%d, time:%d", str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(appBrandBackgroundFetchDataParcel.f76783m));
            }
        }
        return appBrandBackgroundFetchDataParcel;
    }
}
