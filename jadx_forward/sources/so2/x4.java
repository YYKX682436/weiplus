package so2;

/* loaded from: classes9.dex */
public final class x4 {
    public x4(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final so2.z4 a(java.lang.String jsonString, so2.a5 source) {
        so2.i5 i5Var;
        cl0.g b17;
        cl0.g b18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonString, "jsonString");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        try {
            cl0.g gVar = new cl0.g(jsonString);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSelectProductInfo", "productInfoFromMiniAppResult json:".concat(jsonString));
            cl0.g b19 = gVar.b("commonDec");
            cl0.g b27 = b19 != null ? b19.b("previewIcon") : null;
            java.lang.String mo15083x48bce8a4 = b27 != null ? b27.mo15083x48bce8a4("lightUrl", "") : null;
            if (mo15083x48bce8a4 == null) {
                mo15083x48bce8a4 = "";
            }
            java.lang.String mo15083x48bce8a42 = b27 != null ? b27.mo15083x48bce8a4("darkUrl", "") : null;
            if (mo15083x48bce8a42 == null) {
                mo15083x48bce8a42 = "";
            }
            i5Var = new so2.i5(mo15083x48bce8a4, mo15083x48bce8a42);
            b17 = gVar.b("commodity");
            b18 = gVar.b("ecActivity");
        } catch (java.lang.Exception unused) {
        }
        if (b17 != null) {
            cl0.g b28 = b17.b("fullPage");
            java.lang.String mo15082x48bce8a4 = b28 != null ? b28.mo15082x48bce8a4("appid") : null;
            java.lang.String str = mo15082x48bce8a4 == null ? "" : mo15082x48bce8a4;
            java.lang.String mo15082x48bce8a42 = b28 != null ? b28.mo15082x48bce8a4(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714) : null;
            java.lang.String str2 = mo15082x48bce8a42 == null ? "" : mo15082x48bce8a42;
            java.lang.String mo15083x48bce8a43 = b17.mo15083x48bce8a4("productId", "");
            java.lang.String mo15083x48bce8a44 = b17.mo15083x48bce8a4(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15083x48bce8a44);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15083x48bce8a43);
            return new so2.z4(mo15083x48bce8a44, mo15083x48bce8a43, 0, str, str2, source, null, 0, "", i5Var);
        }
        if (b18 != null) {
            cl0.g b29 = b18.b("fullPage");
            if (b29 == null) {
                b29 = b18.b("halfPage");
            }
            java.lang.String mo15083x48bce8a45 = b29 != null ? b29.mo15083x48bce8a4("appid", "") : null;
            java.lang.String str3 = mo15083x48bce8a45 == null ? "" : mo15083x48bce8a45;
            java.lang.String mo15083x48bce8a46 = b29 != null ? b29.mo15083x48bce8a4(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "") : null;
            java.lang.String str4 = mo15083x48bce8a46 == null ? "" : mo15083x48bce8a46;
            java.lang.String mo15083x48bce8a47 = b18.mo15083x48bce8a4("ecActivityId", "");
            int optInt = b18.optInt("activityType");
            java.lang.String mo15083x48bce8a48 = b18.mo15083x48bce8a4(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
            java.lang.String mo15083x48bce8a49 = b18.mo15083x48bce8a4("iconUrl", "");
            cl0.g b37 = b18.b("jumpInfoConfig");
            int mo15080xc3ca103c = b37 != null ? b37.mo15080xc3ca103c("businessType", 0) : 0;
            java.lang.String mo15083x48bce8a410 = b37 != null ? b37.mo15083x48bce8a4("extInfo", "") : null;
            java.lang.String str5 = mo15083x48bce8a410 == null ? "" : mo15083x48bce8a410;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15083x48bce8a48);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15083x48bce8a47);
            return new so2.z4(mo15083x48bce8a48, mo15083x48bce8a47, optInt, str3, str4, source, mo15083x48bce8a49, mo15080xc3ca103c, str5, i5Var);
        }
        return null;
    }
}
