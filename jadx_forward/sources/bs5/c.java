package bs5;

/* loaded from: classes13.dex */
public abstract class c extends bs5.h {

    /* renamed from: b, reason: collision with root package name */
    public final int f105547b;

    /* renamed from: c, reason: collision with root package name */
    public final tr5.g f105548c;

    public c(int i17) {
        this.f105547b = i17;
        this.f105548c = new tr5.g(f(), i17);
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
        java.lang.String str = f0Var.f503022o;
        int i18 = f0Var.f503010c;
        java.lang.String str2 = f0Var.f503011d;
        bs5.q qVar = (bs5.q) f0Var.f503012e;
        bs5.g gVar = new bs5.g();
        gVar.f105568r = f0Var.f503020m;
        gVar.f105570t = f0Var.f503019l;
        gVar.f105571u = f0Var.f503021n;
        gVar.f347883g = java.lang.System.currentTimeMillis();
        if (d(f0Var, gVar)) {
            gVar.h();
            return new tr5.g0(gVar.f347880d, gVar);
        }
        java.io.BufferedReader bufferedReader2 = null;
        try {
            try {
                i17 = i(str2, str, qVar);
            } catch (java.lang.Exception e17) {
                e = e17;
            }
            if (android.text.TextUtils.isEmpty(i17)) {
                gVar.f105562i = 1007;
                tr5.g0 g0Var = new tr5.g0(gVar.f347880d, gVar);
                gVar.h();
                return g0Var;
            }
            try {
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(i17).openConnection();
                httpURLConnection.setConnectTimeout(i18);
                httpURLConnection.setReadTimeout(i18);
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getInputStream(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
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
                                gVar.f105562i = 31002;
                            }
                            gVar.f105563m = e.getMessage();
                            gVar.f347881e = true;
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
                gVar.f105572v = responseCode;
                bs5.o oVar = this.f105573a;
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
                        return new tr5.g0(sr5.a.d(gVar.f347880d, f0Var), gVar);
                    }
                }
                java.lang.String e27 = e(substring, qVar.f105590c);
                or5.b.a(g() + "lookup byUrl: %s, rsp:[%s]", i17, e27);
                if (android.text.TextUtils.isEmpty(e27)) {
                    gVar.f347881e = true;
                    gVar.f105562i = 41001;
                }
                cs5.a b17 = cs5.b.b(this.f105547b, e27);
                java.lang.String str4 = g() + "lookup response: ====> %s";
                java.lang.String obj = b17.toString();
                java.util.Map map = b17.f303663c;
                or5.b.a(str4, obj);
                if (b17 == cs5.a.f303659d) {
                    gVar.f347881e = true;
                    gVar.f105562i = 41002;
                    if (gVar.f105572v == 200) {
                        oVar.a(str);
                    }
                    tr5.g0 g0Var2 = new tr5.g0(gVar.f347880d, gVar);
                    sr5.a.a(bufferedReader);
                    gVar.h();
                    return g0Var2;
                }
                gVar.f105564n = b17.f303661a;
                gVar.f105565o = map;
                java.lang.String[] strArr = b17.f303662b;
                gVar.f347880d = strArr;
                if (strArr.length != 0) {
                    oVar.c(f0Var, b17);
                    gVar.f105562i = 0;
                    gVar.f105566p = gVar.i(map);
                    sr5.a.a(bufferedReader);
                    gVar.h();
                    return new tr5.g0(sr5.a.d(gVar.f347880d, f0Var), gVar);
                }
                or5.b.a(g() + "receive success, but no record", new java.lang.Object[0]);
                gVar.f347881e = true;
                gVar.f105562i = 3;
                if (gVar.f105572v == 200) {
                    oVar.a(str);
                }
                tr5.g0 g0Var3 = new tr5.g0(gVar.f347880d, gVar);
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
    /* renamed from: getDescription */
    public tr5.g mo11135x730bcac6() {
        return this.f105548c;
    }

    public abstract java.net.SocketAddress h(java.lang.String str, int i17);

    public abstract java.lang.String i(java.lang.String str, java.lang.String str2, bs5.q qVar);
}
