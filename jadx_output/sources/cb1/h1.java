package cb1;

/* loaded from: classes7.dex */
public class h1 extends vi1.v {
    @Override // vi1.v, vi1.g0
    public void M6(android.content.Context context) {
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) context).hideVKB();
        }
    }

    @Override // vi1.v, vi1.g0
    public android.text.SpannableString ka(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String string = context.getString(com.tencent.mm.R.string.a3i);
        java.lang.String format = java.lang.String.format(context.getString(com.tencent.mm.R.string.a3j), string);
        k91.z5 z5Var = new k91.z5();
        z5Var.f305863a = str;
        z5Var.f305873k = str2;
        z5Var.f305872j = 8;
        com.tencent.mm.plugin.appbrand.config.WxaExposedParams a17 = z5Var.a();
        java.lang.String str3 = com.tencent.mm.plugin.appbrand.v9.f90852d;
        java.lang.String str4 = a17.f77478d;
        java.lang.String str5 = "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUrlBuilders", "buildExposeUrl fail, null or nil appId");
        } else {
            try {
                java.lang.String str6 = com.tencent.mm.plugin.appbrand.v9.f90853e;
                java.lang.Object[] objArr = new java.lang.Object[5];
                objArr[0] = str4;
                java.lang.String str7 = a17.f77488q;
                if (str7 == null) {
                    str7 = "";
                }
                objArr[1] = java.net.URLEncoder.encode(str7, com.tencent.mapsdk.internal.rv.f51270c);
                objArr[2] = java.lang.Integer.valueOf(a17.f77487p);
                objArr[3] = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.o1(java.lang.Integer.valueOf(a17.f77484m), -1));
                objArr[4] = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.o1(java.lang.Integer.valueOf(a17.f77485n), -1));
                str5 = java.lang.String.format(str6, objArr);
            } catch (java.io.UnsupportedEncodingException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUrlBuilders", "buildExposeUrl encode fail, invalid arguments");
            }
        }
        cb1.a aVar = new cb1.a(str5);
        android.text.SpannableString spannableString = new android.text.SpannableString(format);
        spannableString.setSpan(aVar, format.indexOf(string), format.indexOf(string) + string.length(), 18);
        return spannableString;
    }

    @Override // vi1.v, vi1.g0
    public void o8(android.content.Context context, yz5.l lVar) {
        db5.e1.L(context, false, context.getString(com.tencent.mm.R.string.f490140m1), context.getString(com.tencent.mm.R.string.f490141m2), context.getString(com.tencent.mm.R.string.f490148m9), context.getString(com.tencent.mm.R.string.f490347sg), new cb1.f1(this, context, lVar), new cb1.g1(this, lVar), com.tencent.mm.R.color.f479206su, com.tencent.mm.R.color.f479206su);
    }

    @Override // vi1.v, vi1.g0
    public void ud(vi1.j2 j2Var) {
        com.tencent.mm.autogen.mmdata.rpt.WAPhoneAuthActionLogStruct wAPhoneAuthActionLogStruct = new com.tencent.mm.autogen.mmdata.rpt.WAPhoneAuthActionLogStruct();
        wAPhoneAuthActionLogStruct.f61987d = j2Var.f437352a;
        wAPhoneAuthActionLogStruct.f61988e = j2Var.f437353b;
        wAPhoneAuthActionLogStruct.f61989f = j2Var.f437354c;
        wAPhoneAuthActionLogStruct.f61990g = j2Var.f437355d;
        wAPhoneAuthActionLogStruct.f61991h = j2Var.f437356e;
        wAPhoneAuthActionLogStruct.f61992i = j2Var.f437357f;
        wAPhoneAuthActionLogStruct.f61993j = j2Var.f437358g;
        wAPhoneAuthActionLogStruct.f61994k = j2Var.f437359h;
        wAPhoneAuthActionLogStruct.f61995l = j2Var.f437360i;
        wAPhoneAuthActionLogStruct.f61996m = j2Var.f437361j;
        wAPhoneAuthActionLogStruct.f61997n = j2Var.f437362k;
        wAPhoneAuthActionLogStruct.f61998o = j2Var.f437363l;
        long j17 = j2Var.f437376y;
        wAPhoneAuthActionLogStruct.f61999p = j17;
        wAPhoneAuthActionLogStruct.f62000q = j2Var.f437365n;
        wAPhoneAuthActionLogStruct.f62001r = j2Var.f437366o;
        wAPhoneAuthActionLogStruct.f62002s = j2Var.f437367p;
        wAPhoneAuthActionLogStruct.f62003t = j2Var.f437368q;
        wAPhoneAuthActionLogStruct.f62004u = j2Var.f437369r;
        wAPhoneAuthActionLogStruct.f62005v = j2Var.f437370s;
        wAPhoneAuthActionLogStruct.f62006w = j2Var.f437371t;
        wAPhoneAuthActionLogStruct.f62007x = j2Var.f437372u;
        wAPhoneAuthActionLogStruct.f62008y = j2Var.f437373v;
        wAPhoneAuthActionLogStruct.f62009z = j2Var.f437374w;
        wAPhoneAuthActionLogStruct.A = j2Var.f437375x;
        wAPhoneAuthActionLogStruct.B = j17;
        wAPhoneAuthActionLogStruct.C = j2Var.f437377z;
        wAPhoneAuthActionLogStruct.D = wAPhoneAuthActionLogStruct.b("appid", j2Var.A, true);
        wAPhoneAuthActionLogStruct.E = wAPhoneAuthActionLogStruct.b("phoneNumber", j2Var.B, true);
        wAPhoneAuthActionLogStruct.k();
    }
}
