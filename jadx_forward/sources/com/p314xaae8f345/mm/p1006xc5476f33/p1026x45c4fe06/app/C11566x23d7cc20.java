package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/app/AppBrandCriticalDataProvider;", "Lcom/tencent/luggage/wxa/storage/WxaCriticalDataProvider;", "Lhm0/u;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.app.AppBrandCriticalDataProvider */
/* loaded from: classes7.dex */
public final class C11566x23d7cc20 extends com.p314xaae8f345.p425x1ea3c036.wxa.p450x8fb0427b.AbstractC3958x4922e9a implements hm0.u {
    @Override // hm0.u
    public void a() {
        try {
            this.f129270d.mo70513x5a5ddf8();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.WxaCriticalDataProvider", th6, "uninstallDatabase", new java.lang.Object[0]);
        }
        this.f129270d = null;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.wxa.p450x8fb0427b.AbstractC3958x4922e9a
    public l75.k0 d() {
        l75.k0 Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ri();
        if (Ri == null) {
            return null;
        }
        k91.m4 ij6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij();
        java.util.Map map = this.f129271e;
        ((java.util.HashMap) map).put(k91.j4.class, ij6);
        ((java.util.HashMap) map).put(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di());
        ((java.util.HashMap) map).put(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a5.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a5.class));
        ((java.util.HashMap) map).put(t81.s.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.s.class));
        im0.g gVar = im0.g.f373700g;
        gVar.getClass();
        if (!(Ri instanceof hm0.u)) {
            return Ri;
        }
        gVar.f373701d.v((hm0.u) Ri);
        return Ri;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.wxa.p450x8fb0427b.AbstractC3958x4922e9a, android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        android.net.Uri insert = super.insert(uri, contentValues);
        if (insert != null && com.p314xaae8f345.p425x1ea3c036.wxa.p450x8fb0427b.AbstractC3958x4922e9a.f129268f.match(uri) == 5) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(contentValues != null ? contentValues.getAsString("CONTENT_KEY_ACTION") : null, "ACTION_FLUSH_WXA_DEBUG_PKG_INFO")) {
                java.lang.String asString = contentValues.getAsString("CONTENT_KEY_APPID");
                java.lang.Integer asInteger = contentValues.getAsInteger("CONTENT_KEY_PKG_TYPE");
                int intValue = asInteger == null ? -1 : asInteger.intValue();
                if (!(asString == null || asString.length() == 0) && intValue != -1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(asString);
                    com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r.u(a17, asString, intValue, false, 4, null);
                }
            }
        }
        return insert;
    }

    @Override // hm0.u
    public void r(gm0.m0 m0Var) {
    }
}
