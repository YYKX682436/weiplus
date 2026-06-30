package cb1;

/* loaded from: classes7.dex */
public class h1 extends vi1.v {
    @Override // vi1.v, vi1.g0
    public void M6(android.content.Context context) {
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo48674x36654fab();
        }
    }

    @Override // vi1.v, vi1.g0
    public android.text.SpannableString ka(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3i);
        java.lang.String format = java.lang.String.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3j), string);
        k91.z5 z5Var = new k91.z5();
        z5Var.f387396a = str;
        z5Var.f387406k = str2;
        z5Var.f387405j = 8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11832x1f85bd26 a17 = z5Var.a();
        java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v9.f172385d;
        java.lang.String str4 = a17.f159011d;
        java.lang.String str5 = "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandUrlBuilders", "buildExposeUrl fail, null or nil appId");
        } else {
            try {
                java.lang.String str6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v9.f172386e;
                java.lang.Object[] objArr = new java.lang.Object[5];
                objArr[0] = str4;
                java.lang.String str7 = a17.f159021q;
                if (str7 == null) {
                    str7 = "";
                }
                objArr[1] = java.net.URLEncoder.encode(str7, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                objArr[2] = java.lang.Integer.valueOf(a17.f159020p);
                objArr[3] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(java.lang.Integer.valueOf(a17.f159017m), -1));
                objArr[4] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(java.lang.Integer.valueOf(a17.f159018n), -1));
                str5 = java.lang.String.format(str6, objArr);
            } catch (java.io.UnsupportedEncodingException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandUrlBuilders", "buildExposeUrl encode fail, invalid arguments");
            }
        }
        cb1.a aVar = new cb1.a(str5);
        android.text.SpannableString spannableString = new android.text.SpannableString(format);
        spannableString.setSpan(aVar, format.indexOf(string), format.indexOf(string) + string.length(), 18);
        return spannableString;
    }

    @Override // vi1.v, vi1.g0
    public void o8(android.content.Context context, yz5.l lVar) {
        db5.e1.L(context, false, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571673m1), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571674m2), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571681m9), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new cb1.f1(this, context, lVar), new cb1.g1(this, lVar), com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su, com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su);
    }

    @Override // vi1.v, vi1.g0
    public void ud(vi1.j2 j2Var) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7037x4cb92477 c7037x4cb92477 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7037x4cb92477();
        c7037x4cb92477.f143520d = j2Var.f518885a;
        c7037x4cb92477.f143521e = j2Var.f518886b;
        c7037x4cb92477.f143522f = j2Var.f518887c;
        c7037x4cb92477.f143523g = j2Var.f518888d;
        c7037x4cb92477.f143524h = j2Var.f518889e;
        c7037x4cb92477.f143525i = j2Var.f518890f;
        c7037x4cb92477.f143526j = j2Var.f518891g;
        c7037x4cb92477.f143527k = j2Var.f518892h;
        c7037x4cb92477.f143528l = j2Var.f518893i;
        c7037x4cb92477.f143529m = j2Var.f518894j;
        c7037x4cb92477.f143530n = j2Var.f518895k;
        c7037x4cb92477.f143531o = j2Var.f518896l;
        long j17 = j2Var.f518909y;
        c7037x4cb92477.f143532p = j17;
        c7037x4cb92477.f143533q = j2Var.f518898n;
        c7037x4cb92477.f143534r = j2Var.f518899o;
        c7037x4cb92477.f143535s = j2Var.f518900p;
        c7037x4cb92477.f143536t = j2Var.f518901q;
        c7037x4cb92477.f143537u = j2Var.f518902r;
        c7037x4cb92477.f143538v = j2Var.f518903s;
        c7037x4cb92477.f143539w = j2Var.f518904t;
        c7037x4cb92477.f143540x = j2Var.f518905u;
        c7037x4cb92477.f143541y = j2Var.f518906v;
        c7037x4cb92477.f143542z = j2Var.f518907w;
        c7037x4cb92477.A = j2Var.f518908x;
        c7037x4cb92477.B = j17;
        c7037x4cb92477.C = j2Var.f518910z;
        c7037x4cb92477.D = c7037x4cb92477.b("appid", j2Var.A, true);
        c7037x4cb92477.E = c7037x4cb92477.b("phoneNumber", j2Var.B, true);
        c7037x4cb92477.k();
    }
}
