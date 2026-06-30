package com.tencent.mm.plugin.ext.provider;

/* loaded from: classes12.dex */
public final class ExtControlProviderNearBy extends com.tencent.mm.plugin.ext.provider.ExtContentProviderBase implements kv.e0 {
    public static final android.content.UriMatcher A;
    public static boolean B;
    public static final com.tencent.mm.sdk.platformtools.b4 C;

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String[] f99896z = {"nickname", "avatar", "distance", "signature", "sex"};

    /* renamed from: o, reason: collision with root package name */
    public int f99897o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f99898p;

    /* renamed from: q, reason: collision with root package name */
    public i11.e f99899q;

    /* renamed from: r, reason: collision with root package name */
    public d95.e f99900r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.Set f99901s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.concurrent.CountDownLatch f99902t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.concurrent.CountDownLatch f99903u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f99904v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f99905w = false;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f99906x = new u62.h(this);

    /* renamed from: y, reason: collision with root package name */
    public final i11.c f99907y = new u62.i(this);

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b + ".plugin.ext.NearBy";
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        A = uriMatcher;
        uriMatcher.addURI(str, "male", 1);
        uriMatcher.addURI(str, "female", 2);
        uriMatcher.addURI(str, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL, 0);
        B = false;
        C = new com.tencent.mm.sdk.platformtools.b4(new u62.f(), false);
    }

    public static void n(com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy extControlProviderNearBy) {
        extControlProviderNearBy.getClass();
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderNearBy", "!MMCore.hasSetUin()");
            return;
        }
        gm0.j1.d().q(148, extControlProviderNearBy.f99906x);
        i11.e eVar = extControlProviderNearBy.f99899q;
        if (eVar != null) {
            ((i11.h) eVar).m(extControlProviderNearBy.f99907y);
        }
    }

    public static void r(boolean z17) {
        com.tencent.mm.sdk.platformtools.b4 b4Var = C;
        if (!z17) {
            b4Var.c(0L, 0L);
        } else {
            B = true;
            b4Var.c(15000L, 15000L);
        }
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderNearBy", "notifyChanged: " + str);
        if (this.f99904v) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderNearBy", "has finished");
        } else {
            o(p(str));
            this.f99903u.countDown();
        }
    }

    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        this.f99897o = -1;
        int match = A.match(uri);
        if (match == 0) {
            this.f99897o = 1;
            return null;
        }
        if (match == 1) {
            this.f99897o = 3;
            return null;
        }
        if (match != 2) {
            this.f99897o = -1;
            return null;
        }
        this.f99897o = 4;
        return null;
    }

    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    public final void o(r45.b64 b64Var) {
        java.lang.String str;
        if (b64Var == null || (str = b64Var.f370550d) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtControlProviderNearBy", "lbsContactInfo is null or lbsContactInfo's userName is null");
            return;
        }
        ((java.util.HashSet) this.f99901s).add(str);
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.String str2 = b64Var.f370550d;
        ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
        android.graphics.Bitmap a17 = com.tencent.mm.modelavatar.g.a(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderNearBy", "countDownLatchGet now count: " + this.f99903u.getCount());
        if (a17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderNearBy", "countDownLatchGet countDown now");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            byte[] bArr = new byte[0];
            if (a17.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)) {
                bArr = byteArrayOutputStream.toByteArray();
            }
            ((java.util.HashSet) this.f99901s).remove(b64Var.f370550d);
            this.f99900r.a(new java.lang.Object[]{b64Var.f370551e, bArr, b64Var.f370555i, b64Var.f370554h, java.lang.Integer.valueOf(b64Var.f370556m)});
            com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderNearBy", "bitmap recycle %s", a17);
            a17.recycle();
        }
    }

    public final r45.b64 p(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtControlProviderNearBy", "username is null or nill");
            return null;
        }
        for (r45.b64 b64Var : this.f99898p) {
            if (b64Var.f370550d.equals(str)) {
                return b64Var;
            }
        }
        return null;
    }

    public final void q() {
        this.f99898p = new java.util.ArrayList();
        this.f99900r = new d95.e(f99896z);
        this.f99902t = new java.util.concurrent.CountDownLatch(1);
        this.f99903u = null;
        this.f99901s = new java.util.HashSet();
        this.f99898p = new java.util.ArrayList();
        this.f99904v = false;
    }

    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderNearBy", "query() " + uri);
        android.content.Context context = getContext();
        this.f99875g = c(uri);
        g(context);
        this.f99877i = 15;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f99873e = android.os.SystemClock.elapsedRealtime();
        if (uri == null) {
            k(3);
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f99875g) || com.tencent.mm.sdk.platformtools.t8.K0(d())) {
            k(3);
            return null;
        }
        if (B) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExtControlProviderNearBy", "isDoingRequest, return null");
            k(5);
            return null;
        }
        r(true);
        if (!b()) {
            r(false);
            k(1);
            return this.f99872d;
        }
        if (!i(getContext())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExtControlProviderNearBy", "invalid appid ! return null");
            r(false);
            k(2);
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderNearBy", "find type = " + this.f99897o);
        getType(uri);
        if (this.f99897o < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtControlProviderNearBy", "unkown uri, return null");
            r(false);
            k(3);
            return null;
        }
        try {
            q();
            if (gm0.j1.a()) {
                gm0.j1.d().a(148, this.f99906x);
                com.tencent.mm.sdk.platformtools.u3.h(new u62.g(this));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderNearBy", "!MMCore.hasSetUin()");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderNearBy", "wait for get lbs info");
            java.util.concurrent.CountDownLatch countDownLatch = this.f99902t;
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
            if (!countDownLatch.await(15000L, timeUnit)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ExtControlProviderNearBy", "countDownLatchWait time out");
            }
            if (this.f99903u != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderNearBy", "get lbs info success, wait for get lbs friend");
                if (!this.f99903u.await(15000L, timeUnit)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ExtControlProviderNearBy", "countDownLatchGet time out");
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderNearBy", "not init countDownGet. return null");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExtControlProviderNearBy", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ExtControlProviderNearBy", e17, "", new java.lang.Object[0]);
            k(4);
        }
        r(false);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().q(this);
        this.f99904v = true;
        if (((java.util.HashSet) this.f99901s).size() > 0) {
            java.util.Iterator it = ((java.util.HashSet) this.f99901s).iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderNearBy", "add lbsfriend has no avatar: " + str3);
                r45.b64 p17 = p(str3);
                if (p17 != null && p17.f370550d != null) {
                    this.f99900r.a(new java.lang.Object[]{p17.f370551e, null, p17.f370555i, p17.f370554h, java.lang.Integer.valueOf(p17.f370556m)});
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderNearBy", "all user has got avatar");
        }
        d95.e eVar = this.f99900r;
        if (eVar == null || eVar.f227658f <= 0) {
            k(4);
        } else {
            k(0);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderNearBy", "return now");
        return this.f99900r;
    }

    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}
