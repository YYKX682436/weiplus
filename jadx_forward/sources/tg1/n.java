package tg1;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.class})
/* loaded from: classes7.dex */
public final class n extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i6 {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f500676g = {1025, 1031, 1032};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f500677h = {1011, 1012, 1013, 1047, 1049, 1048, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.za.f35036x366c91de, 1124, 1125, 1126, mi1.k2.f72892x366c91de};

    /* renamed from: d, reason: collision with root package name */
    public final tg1.g f500678d = new tg1.g();

    /* renamed from: e, reason: collision with root package name */
    public final tg1.m f500679e = new tg1.m();

    /* renamed from: f, reason: collision with root package name */
    public final tg1.f f500680f = new tg1.f();

    public boolean Ai(android.content.Context context, java.lang.String str, int i17, android.os.Bundle bundle, android.os.Bundle bundle2, l81.e1 e1Var) {
        boolean a17 = yo.a.a(f500676g, i17);
        tg1.c cVar = tg1.c.OK;
        if (a17) {
            return cVar == this.f500678d.b(context, str, i17, bundle, bundle2, e1Var);
        }
        if (yo.a.a(f500677h, i17)) {
            return cVar == this.f500679e.b(context, str, i17, bundle, bundle2, e1Var);
        }
        if (1064 == i17 || 1078 == i17) {
            return cVar == this.f500680f.b(context, str, i17, bundle, bundle2, e1Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeAppLinkOpener", "handleScanCodeLink, unhandled case link[ %s ], scene[ %d ]", str, java.lang.Integer.valueOf(i17));
        return false;
    }

    public boolean wi(java.lang.String str, android.os.Bundle bundle) {
        tg1.e eVar;
        android.net.Uri uri;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeAppLinkOpener", "handle appLink = %s", str);
        tg1.e[] m166493xcee59d22 = tg1.e.m166493xcee59d22();
        int length = m166493xcee59d22.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                eVar = null;
                break;
            }
            eVar = m166493xcee59d22[i17];
            eVar.getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.startsWith(eVar.f500671d)) {
                break;
            }
            i17++;
        }
        if (eVar != null) {
            try {
                uri = android.net.Uri.parse(str);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeAppLinkOpener", "handle nativeLink = %s, exp = %s", str, e17);
                uri = null;
            }
            if (uri == null) {
                return false;
            }
            java.lang.String queryParameter = uri.getQueryParameter(dm.i4.f66875xa013b0d5);
            java.lang.String queryParameter2 = uri.getQueryParameter(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter) && com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(queryParameter)) {
                l81.b1 b1Var = new l81.b1();
                b1Var.f398545a = queryParameter;
                b1Var.f398551d = -1;
                b1Var.f398549c = 0;
                b1Var.f398555f = queryParameter2;
                b1Var.f398565k = eVar.f500672e;
                b1Var.f398567l = "";
                b1Var.f398568m = 0;
                b1Var.f398569n = "";
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11565x2acac113 c11565x2acac113 = bundle == null ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11565x2acac113) bundle.getParcelable("weapp_open_declare_prompt_key");
                if (c11565x2acac113 != null) {
                    b1Var.B = c11565x2acac113;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(null, b1Var);
                return true;
            }
        }
        return false;
    }
}
