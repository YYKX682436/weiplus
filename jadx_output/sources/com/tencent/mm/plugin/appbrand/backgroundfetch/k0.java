package com.tencent.mm.plugin.appbrand.backgroundfetch;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.r9.class})
/* loaded from: classes4.dex */
public class k0 extends i95.w implements com.tencent.mm.plugin.appbrand.backgroundfetch.t1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.backgroundfetch.b0 f76848d;

    @Override // com.tencent.mm.plugin.appbrand.backgroundfetch.t1
    public boolean P2(java.lang.String str, java.lang.String str2) {
        if (wi() == null) {
            return false;
        }
        return str2.isEmpty() ? wi().d(str) : wi().P2(str, str2);
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundfetch.t1
    public boolean d(java.lang.String str) {
        if (wi() == null) {
            return false;
        }
        return wi().d(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundfetch.t1
    public com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenParcel get(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenParcel appBrandBackgroundFetchDataTokenParcel;
        if (wi() == null || (appBrandBackgroundFetchDataTokenParcel = wi().get(str)) == null) {
            return null;
        }
        return appBrandBackgroundFetchDataTokenParcel;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        this.f76848d = (com.tencent.mm.plugin.appbrand.backgroundfetch.b0) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.backgroundfetch.b0.class);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        this.f76848d = null;
    }

    public final com.tencent.mm.plugin.appbrand.backgroundfetch.b0 wi() {
        if (gm0.j1.a()) {
            requireAccountInitialized();
        }
        return this.f76848d;
    }
}
