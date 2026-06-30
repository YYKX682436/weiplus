package zh5;

/* loaded from: classes12.dex */
public abstract class a implements mf3.k, zh5.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f554524a;

    /* renamed from: b, reason: collision with root package name */
    public final e60.t0 f554525b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f554526c;

    /* renamed from: d, reason: collision with root package name */
    public final dn.m f554527d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f554528e;

    /* renamed from: f, reason: collision with root package name */
    public final long f554529f;

    public a(java.lang.String mediaId, java.lang.String uriString, e60.t0 config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uriString, "uriString");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f554524a = mediaId;
        this.f554525b = config;
        android.net.Uri parse = android.net.Uri.parse(uriString);
        java.lang.String queryParameter = parse.getQueryParameter("thumb_path");
        this.f554526c = queryParameter == null ? "" : queryParameter;
        java.lang.String queryParameter2 = parse.getQueryParameter("duration_ms");
        this.f554529f = queryParameter2 != null ? java.lang.Long.parseLong(queryParameter2) : 0L;
        dn.m mVar = new dn.m();
        android.net.Uri parse2 = android.net.Uri.parse(uriString);
        java.lang.String path = parse2.getPath();
        mVar.f69595x6d25b0d9 = path != null ? r26.n0.W(path, "cdn://") : "";
        java.util.Set<java.lang.String> queryParameterNames = parse2.getQueryParameterNames();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(queryParameterNames, "getQueryParameterNames(...)");
        for (java.lang.String str : queryParameterNames) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -350592554:
                        if (str.equals("field_totalLen")) {
                            java.lang.String queryParameter3 = parse2.getQueryParameter(str);
                            mVar.f69620xeb1a61d6 = queryParameter3 != null ? java.lang.Long.parseLong(queryParameter3) : 0L;
                            break;
                        } else {
                            break;
                        }
                    case -249694731:
                        if (str.equals("field_aesKey")) {
                            java.lang.String queryParameter4 = parse2.getQueryParameter(str);
                            mVar.f69575xf11df5f5 = queryParameter4 == null ? "" : queryParameter4;
                            break;
                        } else {
                            break;
                        }
                    case -103039332:
                        if (str.equals("field_fileId")) {
                            java.lang.String queryParameter5 = parse2.getQueryParameter(str);
                            mVar.f69591xf9dbbe9c = queryParameter5 == null ? "" : queryParameter5;
                            break;
                        } else {
                            break;
                        }
                    case 1100782653:
                        if (str.equals("field_filemd5")) {
                            java.lang.String queryParameter6 = parse2.getQueryParameter(str);
                            mVar.f69593x419c9c3d = queryParameter6 == null ? "" : queryParameter6;
                            break;
                        } else {
                            break;
                        }
                    case 1109408056:
                        if (str.equals("download_url")) {
                            java.lang.String queryParameter7 = parse2.getQueryParameter(str);
                            mVar.f323344z = queryParameter7 == null ? "" : queryParameter7;
                            break;
                        } else {
                            break;
                        }
                    case 1309226322:
                        if (str.equals("field_authKey")) {
                            java.lang.String queryParameter8 = parse2.getQueryParameter(str);
                            mVar.f69582x4e093552 = queryParameter8 == null ? "" : queryParameter8;
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        mVar.f69606xccdbf540 = false;
        mVar.f323319e = false;
        this.f554527d = mVar;
        java.lang.String str2 = mVar.f69595x6d25b0d9;
        this.f554528e = str2 != null ? str2 : "";
    }

    @Override // zh5.j0
    public java.lang.String b() {
        return null;
    }

    public abstract dn.m d();

    @Override // mf3.k
    public abstract java.lang.String g();

    @Override // mf3.k
    /* renamed from: getId */
    public abstract java.lang.String mo2110x5db1b11();
}
