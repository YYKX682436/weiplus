package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes4.dex */
public class k extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f76847d = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.backgroundfetch.j.f76841z, "AppBrandBackgroundFetchData")};

    public k(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.appbrand.backgroundfetch.j.f76841z, "AppBrandBackgroundFetchData", null);
    }

    public com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel E4(java.lang.String str, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.backgroundfetch.j jVar = new com.tencent.mm.plugin.appbrand.backgroundfetch.j();
        jVar.field_username = str;
        jVar.field_fetchType = i17;
        if (!super.get(jVar, dm.i4.COL_USERNAME, "fetchType")) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel appBrandBackgroundFetchDataParcel = new com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel();
        appBrandBackgroundFetchDataParcel.f76777d = jVar.field_username;
        appBrandBackgroundFetchDataParcel.f76778e = jVar.field_fetchType;
        appBrandBackgroundFetchDataParcel.f76779f = jVar.field_path;
        appBrandBackgroundFetchDataParcel.f76780g = jVar.field_query;
        appBrandBackgroundFetchDataParcel.f76781h = jVar.field_data;
        appBrandBackgroundFetchDataParcel.f76782i = jVar.field_scene;
        appBrandBackgroundFetchDataParcel.f76783m = jVar.field_updateTime;
        return appBrandBackgroundFetchDataParcel;
    }

    public boolean y0(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return true;
        }
        com.tencent.mm.plugin.appbrand.backgroundfetch.j jVar = new com.tencent.mm.plugin.appbrand.backgroundfetch.j();
        jVar.field_username = str;
        jVar.field_fetchType = i17;
        jVar.field_data = str2;
        jVar.field_path = str3;
        jVar.field_query = str4;
        jVar.field_scene = i18;
        jVar.field_updateTime = j17;
        com.tencent.mm.plugin.appbrand.backgroundfetch.j jVar2 = null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.appbrand.backgroundfetch.j jVar3 = new com.tencent.mm.plugin.appbrand.backgroundfetch.j();
            jVar3.field_username = str;
            jVar3.field_fetchType = i17;
            if (super.get(jVar3, dm.i4.COL_USERNAME, "fetchType")) {
                jVar2 = jVar3;
            }
        }
        return jVar2 == null ? super.insert(jVar) : super.update(jVar, dm.i4.COL_USERNAME, "fetchType");
    }

    public boolean z6(java.lang.String str, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return true;
        }
        com.tencent.mm.plugin.appbrand.backgroundfetch.j jVar = new com.tencent.mm.plugin.appbrand.backgroundfetch.j();
        jVar.field_username = str;
        jVar.field_fetchType = i17;
        return super.delete(jVar, dm.i4.COL_USERNAME, "fetchType");
    }
}
