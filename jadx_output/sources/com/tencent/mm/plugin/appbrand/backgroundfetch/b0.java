package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes4.dex */
public class b0 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f76803d = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.backgroundfetch.a0.f76802p, "AppBrandBackgroundFetchDataToken")};

    public b0(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.appbrand.backgroundfetch.a0.f76802p, "AppBrandBackgroundFetchDataToken", null);
    }

    public boolean P2(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str2 == null) {
            return true;
        }
        l75.f0 f0Var = null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.appbrand.backgroundfetch.a0 a0Var = new com.tencent.mm.plugin.appbrand.backgroundfetch.a0();
            a0Var.field_username = str;
            if (super.get(a0Var, dm.i4.COL_USERNAME)) {
                f0Var = a0Var;
            }
        }
        if (str2.isEmpty()) {
            if (f0Var == null) {
                return true;
            }
            return super.delete(f0Var, dm.i4.COL_USERNAME);
        }
        com.tencent.mm.plugin.appbrand.backgroundfetch.a0 a0Var2 = new com.tencent.mm.plugin.appbrand.backgroundfetch.a0();
        a0Var2.field_username = str;
        a0Var2.field_token = str2;
        return f0Var == null ? super.insert(a0Var2) : super.update(a0Var2, dm.i4.COL_USERNAME);
    }

    public boolean d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return true;
        }
        com.tencent.mm.plugin.appbrand.backgroundfetch.a0 a0Var = new com.tencent.mm.plugin.appbrand.backgroundfetch.a0();
        a0Var.field_username = str;
        return super.delete(a0Var, dm.i4.COL_USERNAME);
    }

    public com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenParcel get(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.backgroundfetch.a0 a0Var = new com.tencent.mm.plugin.appbrand.backgroundfetch.a0();
        a0Var.field_username = str;
        if (!super.get(a0Var, dm.i4.COL_USERNAME)) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenParcel appBrandBackgroundFetchDataTokenParcel = new com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenParcel();
        appBrandBackgroundFetchDataTokenParcel.f76795d = a0Var.field_username;
        appBrandBackgroundFetchDataTokenParcel.f76796e = a0Var.field_token;
        return appBrandBackgroundFetchDataTokenParcel;
    }
}
