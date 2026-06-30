package bs5;

/* loaded from: classes13.dex */
public abstract class c extends bs5.h {

    /* renamed from: b, reason: collision with root package name */
    public final int f24014b;

    /* renamed from: c, reason: collision with root package name */
    public final tr5.g f24015c;

    public c(int i17) {
        this.f24014b = i17;
        this.f24015c = new tr5.g(f(), i17);
    }

    @Override // tr5.r
    public tr5.p a(tr5.a0 a0Var) {
        return new bs5.b(this, a0Var, this, null);
    }

    @Override // tr5.r
    public tr5.g0 c(tr5.f0 f0Var) {
        java.io.BufferedReader bufferedReader;
        java.lang.String i17;
        if (f0Var == null) {
            throw new java.lang.IllegalArgumentException("lookupParams".concat(" can not be null"));
        }
        java.lang.String str = f0Var.f421489o;
        int i18 = f0Var.f421477c;
        java.lang.String str2 = f0Var.f421478d;
        bs5.q qVar = (bs5.q) f0Var.f421479e;
        bs5.g gVar = new bs5.g();
        gVar.f24035r = f0Var.f421487m;
        gVar.f24037t = f0Var.f421486l;
        gVar.f24038u = f0Var.f421488n;
        gVar.f266350g = java.lang.System.currentTimeMillis();
        if (d(f0Var, gVar)) {
            gVar.h();
            return new tr5.g0(gVar.f266347d, gVar);
        }
        java.io.BufferedReader bufferedReader2 = null;
        try {
            try {
                i17 = i(str2, str, qVar);
            } catch (java.lang.Exception e17) {
                e = e17;
            }
            if (android.text.TextUtils.isEmpty(i17)) {
                gVar.f24029i = 1007;
                tr5.g0 g0Var = new tr5.g0(gVar.f266347d, gVar);
                gVar.h();
                return g0Var;
            }
            try {
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(i17).openConnection();
                httpURLConnection.setConnectTimeout(i18);
                httpURLConnection.setReadTimeout(i18);
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getInputStream(), com.tencent.mapsdk.internal.rv.f51270c));
                java.lang.String str3 = "";
                while (true) {
                    try {
                        try {
                            java.lang.String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            str3 = str3 + (readLine + '\n');
                        } catch (java.lang.Exception e18) {
                            e = e18;
                            if (!(e instanceof java.net.SocketTimeoutException)) {
                                gVar.f24029i = 31002;
                            }
                            gVar.f24030m = e.getMessage();
                            gVar.f266348e = true;
                            throw e;
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        sr5.a.a(bufferedReader);
                        gVar.h();
                        throw th;
                    }
                }
                java.lang.String substring = str3.length() > 0 ? str3.substring(0, str3.length() - 2) : "";
                bufferedReader.close();
                int responseCode = httpURLConnection.getResponseCode();
                gVar.f24039v = responseCode;
                bs5.o oVar = this.f24040a;
                if (responseCode == 401) {
                    try {
                        oVar.a(str);
                    } catch (java.lang.Exception e19) {
                        e = e19;
                        bufferedReader2 = bufferedReader;
                        or5.b.c(3, e, g() + "lookup failed", new java.lang.Object[0]);
                        bufferedReader = bufferedReader2;
                        sr5.a.a(bufferedReader);
                        gVar.h();
                        return new tr5.g0(sr5.a.d(gVar.f266347d, f0Var), gVar);
                    }
                }
                java.lang.String e27 = e(substring, qVar.f24057c);
                or5.b.a(g() + "lookup byUrl: %s, rsp:[%s]", i17, e27);
                if (android.text.TextUtils.isEmpty(e27)) {
                    gVar.f266348e = true;
                    gVar.f24029i = 41001;
                }
                cs5.a b17 = cs5.b.b(this.f24014b, e27);
                java.lang.String str4 = g() + "lookup response: ====> %s";
                java.lang.String obj = b17.toString();
                java.util.Map map = b17.f222130c;
                or5.b.a(str4, obj);
                if (b17 == cs5.a.f222126d) {
                    gVar.f266348e = true;
                    gVar.f24029i = 41002;
                    if (gVar.f24039v == 200) {
                        oVar.a(str);
                    }
                    tr5.g0 g0Var2 = new tr5.g0(gVar.f266347d, gVar);
                    sr5.a.a(bufferedReader);
                    gVar.h();
                    return g0Var2;
                }
                gVar.f24031n = b17.f222128a;
                gVar.f24032o = map;
                java.lang.String[] strArr = b17.f222129b;
                gVar.f266347d = strArr;
                if (strArr.length != 0) {
                    oVar.c(f0Var, b17);
                    gVar.f24029i = 0;
                    gVar.f24033p = gVar.i(map);
                    sr5.a.a(bufferedReader);
                    gVar.h();
                    return new tr5.g0(sr5.a.d(gVar.f266347d, f0Var), gVar);
                }
                or5.b.a(g() + "receive success, but no record", new java.lang.Object[0]);
                gVar.f266348e = true;
                gVar.f24029i = 3;
                if (gVar.f24039v == 200) {
                    oVar.a(str);
                }
                tr5.g0 g0Var3 = new tr5.g0(gVar.f266347d, gVar);
                sr5.a.a(bufferedReader);
                gVar.h();
                return g0Var3;
            } catch (java.lang.Exception e28) {
                e = e28;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            bufferedReader = null;
        }
    }

    public abstract java.lang.String e(java.lang.String str, java.lang.String str2);

    public abstract java.lang.String f();

    public abstract java.lang.String g();

    @Override // tr5.r
    public tr5.g getDescription() {
        return this.f24015c;
    }

    public abstract java.net.SocketAddress h(java.lang.String str, int i17);

    public abstract java.lang.String i(java.lang.String str, java.lang.String str2, bs5.q qVar);
}
