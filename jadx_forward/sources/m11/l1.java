package m11;

/* loaded from: classes12.dex */
public class l1 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f404282a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public m11.k1 f404283b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f404284c = false;

    public static java.lang.String c(java.lang.String str) {
        try {
            java.lang.String encode = java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(encode)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UrlImageCacheService", "encode result is null: " + str);
                return null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(lp0.b.l());
            int length = encode.length();
            int i17 = 0;
            while (i17 < length) {
                sb6.append('/');
                int i18 = i17 + 20;
                if (i18 < length) {
                    sb6.append(encode.substring(i17, i18));
                    i17 = i18;
                } else {
                    sb6.append(encode.substring(i17, length));
                    i17 = length;
                }
            }
            return sb6.toString();
        } catch (java.io.UnsupportedEncodingException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UrlImageCacheService", "try encode unsupport character: " + str);
            return null;
        }
    }

    @Override // k70.u
    public void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        boolean z17;
        k70.f0 f0Var;
        k70.f0 f0Var2;
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UrlImageCacheService", "load from url failed: " + this.f404283b.f404261a);
            if (!this.f404284c && (f0Var2 = (k70.f0) this.f404283b.f404263c.get()) != null) {
                f0Var2.a(this.f404283b.f404261a, bitmap, null);
            }
            this.f404283b = null;
            e();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UrlImageCacheService", "load from %s successed", this.f404283b.f404261a);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f404283b.f404262b) || bArr == null) {
            z17 = true;
        } else {
            java.lang.String g17 = kk.k.g(bArr);
            z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(g17, this.f404283b.f404262b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UrlImageCacheService", "orgmd5:%s newmd5:%s checkReuslt:%s", this.f404283b.f404262b, g17, java.lang.Boolean.valueOf(z17));
        }
        if (z17) {
            java.lang.String c17 = c(this.f404283b.f404261a);
            new m11.i1(this).execute(new m11.j1(c17, bitmap));
            if (!this.f404284c) {
                m11.b1.wi().c(this.f404283b.f404261a, bitmap);
                k70.f0 f0Var3 = (k70.f0) this.f404283b.f404263c.get();
                if (f0Var3 != null) {
                    f0Var3.a(this.f404283b.f404261a, bitmap, c17);
                }
            }
        } else if (!this.f404284c && (f0Var = (k70.f0) this.f404283b.f404263c.get()) != null) {
            f0Var.a(this.f404283b.f404261a, null, "");
        }
        this.f404283b = null;
        e();
    }

    public final void b(java.lang.String str, k70.f0 f0Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UrlImageCacheService", "url is null or nil, or callback is null");
            return;
        }
        m11.k1 k1Var = this.f404283b;
        if (k1Var != null && k1Var.f404261a.equals(str) && this.f404283b.f404263c.get() == f0Var) {
            this.f404284c = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UrlImageCacheService", "cancel task that is loading, url:%s", str);
            return;
        }
        java.util.List<m11.k1> list = this.f404282a;
        for (m11.k1 k1Var2 : list) {
            if (k1Var2.f404261a.equals(str) && k1Var2.f404263c.get() == f0Var) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UrlImageCacheService", "cancel task, url:%s", str);
                ((java.util.LinkedList) list).remove(k1Var2);
                return;
            }
        }
    }

    public final void d(java.lang.String str, java.lang.String str2, k70.f0 f0Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UrlImageCacheService", "url is null or nil, or callback is null");
            return;
        }
        m11.k1 k1Var = this.f404283b;
        if (k1Var != null && k1Var.f404261a.equals(str) && this.f404283b.f404263c.get() == f0Var) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UrlImageCacheService", "url and callback is loading");
            return;
        }
        java.util.List<m11.k1> list = this.f404282a;
        for (m11.k1 k1Var2 : list) {
            if (k1Var2.f404261a.equals(str) && k1Var2.f404263c.get() == f0Var) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UrlImageCacheService", "url and callback is loading");
                return;
            }
        }
        ((java.util.LinkedList) list).add(new m11.k1(str, str2, f0Var));
        e();
    }

    public final void e() {
        k70.f0 f0Var;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UrlImageCacheService", "err call tryLoadImage:%s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        }
        if (this.f404283b == null) {
            java.util.List list = this.f404282a;
            if (((java.util.LinkedList) list).size() == 0) {
                return;
            }
            this.f404283b = (m11.k1) ((java.util.LinkedList) list).get(0);
            ((java.util.LinkedList) list).remove(0);
            this.f404284c = false;
            android.graphics.Bitmap b17 = m11.b1.wi().b(this.f404283b.f404261a);
            if (b17 == null) {
                new m11.h1(this).execute(this.f404283b.f404261a);
                return;
            }
            m11.k1 k1Var = this.f404283b;
            java.lang.String str = k1Var.f404261a;
            if (!this.f404284c && (f0Var = (k70.f0) k1Var.f404263c.get()) != null) {
                java.lang.String str2 = this.f404283b.f404261a;
                f0Var.a(str2, b17, c(str2));
            }
            this.f404283b = null;
            e();
        }
    }
}
