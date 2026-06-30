package com.tencent.mm.plugin.appbrand.backgroundfetch;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.r9.class})
/* loaded from: classes4.dex */
public class v extends i95.w implements com.tencent.mm.plugin.appbrand.backgroundfetch.s1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.backgroundfetch.k f76898d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.backgroundfetch.s0 f76899e;

    public final com.tencent.mm.plugin.appbrand.backgroundfetch.k Ai() {
        if (gm0.j1.a()) {
            requireAccountInitialized();
        }
        return this.f76898d;
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundfetch.s1
    public long D4(java.lang.String str, int i17) {
        com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel E4;
        com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel a17 = wi().a(str, i17);
        if (a17 != null) {
            return a17.f76783m;
        }
        if (Ai() == null || (E4 = Ai().E4(str, i17)) == null) {
            return 0L;
        }
        return E4.f76783m;
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundfetch.s1
    public com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel E4(java.lang.String str, int i17) {
        com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel E4;
        com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel a17 = wi() != null ? wi().a(str, i17) : null;
        if (a17 != null) {
            return a17;
        }
        if (Ai() == null || (E4 = Ai().E4(str, i17)) == null) {
            return null;
        }
        return E4;
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundfetch.s1
    public boolean L3(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, long j17, int i19) {
        boolean z17 = false;
        if (1 != i19) {
            if (Ai() == null) {
                return false;
            }
            return Ai().y0(str, i17, str2, str3, str4, i18, j17);
        }
        com.tencent.mm.plugin.appbrand.backgroundfetch.s0 wi6 = wi();
        wi6.getClass();
        if (!android.text.TextUtils.isEmpty(str)) {
            int hash = java.util.Objects.hash(str, java.lang.Integer.valueOf(i17));
            synchronized (wi6.f76892a) {
                com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel appBrandBackgroundFetchDataParcel = (com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel) wi6.f76892a.get(hash);
                if (appBrandBackgroundFetchDataParcel != null && j17 <= appBrandBackgroundFetchDataParcel.f76783m) {
                }
                com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel appBrandBackgroundFetchDataParcel2 = new com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel();
                appBrandBackgroundFetchDataParcel2.f76777d = str;
                appBrandBackgroundFetchDataParcel2.f76778e = i17;
                appBrandBackgroundFetchDataParcel2.f76781h = str2;
                appBrandBackgroundFetchDataParcel2.f76779f = str3;
                appBrandBackgroundFetchDataParcel2.f76780g = str4;
                appBrandBackgroundFetchDataParcel2.f76782i = i18;
                appBrandBackgroundFetchDataParcel2.f76783m = j17;
                appBrandBackgroundFetchDataParcel2.f76784n = i19;
                wi6.f76892a.put(hash, appBrandBackgroundFetchDataParcel2);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BackgroundFetchDataMemoryStorage", "set ok, username:%s, fetchType:%d, time:%d", str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
                z17 = true;
            }
        }
        if (z17 && Ai() != null) {
            Ai().z6(str, i17);
        }
        return z17;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        this.f76898d = (com.tencent.mm.plugin.appbrand.backgroundfetch.k) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.backgroundfetch.k.class);
        this.f76899e = new com.tencent.mm.plugin.appbrand.backgroundfetch.s0();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        this.f76898d = null;
        this.f76899e = null;
    }

    public final com.tencent.mm.plugin.appbrand.backgroundfetch.s0 wi() {
        if (gm0.j1.a()) {
            requireAccountInitialized();
        }
        return this.f76899e;
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundfetch.s1
    public boolean z6(java.lang.String str, int i17) {
        com.tencent.mm.plugin.appbrand.backgroundfetch.s0 wi6 = wi();
        wi6.getClass();
        boolean z17 = false;
        if (!android.text.TextUtils.isEmpty(str)) {
            int hash = java.util.Objects.hash(str, java.lang.Integer.valueOf(i17));
            synchronized (wi6.f76892a) {
                int indexOfKey = wi6.f76892a.indexOfKey(hash);
                if (indexOfKey >= 0) {
                    wi6.f76892a.removeAt(indexOfKey);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BackgroundFetchDataMemoryStorage", "delete ok, username:%s, fetchType:%d", str, java.lang.Integer.valueOf(i17));
                    z17 = true;
                }
            }
        }
        return Ai() != null ? z17 | Ai().z6(str, i17) : z17;
    }
}
