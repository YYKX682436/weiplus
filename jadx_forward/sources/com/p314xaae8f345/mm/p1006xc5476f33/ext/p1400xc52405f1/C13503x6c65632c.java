package com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1;

/* renamed from: com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy */
/* loaded from: classes12.dex */
public final class C13503x6c65632c extends com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba implements kv.e0 {
    public static final android.content.UriMatcher A;
    public static boolean B;
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 C;

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String[] f181429z = {"nickname", "avatar", "distance", "signature", "sex"};

    /* renamed from: o, reason: collision with root package name */
    public int f181430o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f181431p;

    /* renamed from: q, reason: collision with root package name */
    public i11.e f181432q;

    /* renamed from: r, reason: collision with root package name */
    public d95.e f181433r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.Set f181434s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.concurrent.CountDownLatch f181435t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.concurrent.CountDownLatch f181436u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f181437v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f181438w = false;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f181439x = new u62.h(this);

    /* renamed from: y, reason: collision with root package name */
    public final i11.c f181440y = new u62.i(this);

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ".plugin.ext.NearBy";
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        A = uriMatcher;
        uriMatcher.addURI(str, "male", 1);
        uriMatcher.addURI(str, "female", 2);
        uriMatcher.addURI(str, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18, 0);
        B = false;
        C = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new u62.f(), false);
    }

    public static void n(com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13503x6c65632c c13503x6c65632c) {
        c13503x6c65632c.getClass();
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderNearBy", "!MMCore.hasSetUin()");
            return;
        }
        gm0.j1.d().q(148, c13503x6c65632c.f181439x);
        i11.e eVar = c13503x6c65632c.f181432q;
        if (eVar != null) {
            ((i11.h) eVar).m(c13503x6c65632c.f181440y);
        }
    }

    public static void r(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = C;
        if (!z17) {
            b4Var.c(0L, 0L);
        } else {
            B = true;
            b4Var.c(15000L, 15000L);
        }
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderNearBy", "notifyChanged: " + str);
        if (this.f181437v) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderNearBy", "has finished");
        } else {
            o(p(str));
            this.f181436u.countDown();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        this.f181430o = -1;
        int match = A.match(uri);
        if (match == 0) {
            this.f181430o = 1;
            return null;
        }
        if (match == 1) {
            this.f181430o = 3;
            return null;
        }
        if (match != 2) {
            this.f181430o = -1;
            return null;
        }
        this.f181430o = 4;
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    public final void o(r45.b64 b64Var) {
        java.lang.String str;
        if (b64Var == null || (str = b64Var.f452083d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlProviderNearBy", "lbsContactInfo is null or lbsContactInfo's userName is null");
            return;
        }
        ((java.util.HashSet) this.f181434s).add(str);
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.String str2 = b64Var.f452083d;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p943x351df9c2.g.a(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderNearBy", "countDownLatchGet now count: " + this.f181436u.getCount());
        if (a17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderNearBy", "countDownLatchGet countDown now");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            byte[] bArr = new byte[0];
            if (a17.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)) {
                bArr = byteArrayOutputStream.toByteArray();
            }
            ((java.util.HashSet) this.f181434s).remove(b64Var.f452083d);
            this.f181433r.a(new java.lang.Object[]{b64Var.f452084e, bArr, b64Var.f452088i, b64Var.f452087h, java.lang.Integer.valueOf(b64Var.f452089m)});
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderNearBy", "bitmap recycle %s", a17);
            a17.recycle();
        }
    }

    public final r45.b64 p(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlProviderNearBy", "username is null or nill");
            return null;
        }
        for (r45.b64 b64Var : this.f181431p) {
            if (b64Var.f452083d.equals(str)) {
                return b64Var;
            }
        }
        return null;
    }

    public final void q() {
        this.f181431p = new java.util.ArrayList();
        this.f181433r = new d95.e(f181429z);
        this.f181435t = new java.util.concurrent.CountDownLatch(1);
        this.f181436u = null;
        this.f181434s = new java.util.HashSet();
        this.f181431p = new java.util.ArrayList();
        this.f181437v = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderNearBy", "query() " + uri);
        android.content.Context context = getContext();
        this.f181408g = c(uri);
        g(context);
        this.f181410i = 15;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f181406e = android.os.SystemClock.elapsedRealtime();
        if (uri == null) {
            k(3);
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f181408g) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d())) {
            k(3);
            return null;
        }
        if (B) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlProviderNearBy", "isDoingRequest, return null");
            k(5);
            return null;
        }
        r(true);
        if (!b()) {
            r(false);
            k(1);
            return this.f181405d;
        }
        if (!i(getContext())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlProviderNearBy", "invalid appid ! return null");
            r(false);
            k(2);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderNearBy", "find type = " + this.f181430o);
        getType(uri);
        if (this.f181430o < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlProviderNearBy", "unkown uri, return null");
            r(false);
            k(3);
            return null;
        }
        try {
            q();
            if (gm0.j1.a()) {
                gm0.j1.d().a(148, this.f181439x);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new u62.g(this));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderNearBy", "!MMCore.hasSetUin()");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderNearBy", "wait for get lbs info");
            java.util.concurrent.CountDownLatch countDownLatch = this.f181435t;
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
            if (!countDownLatch.await(15000L, timeUnit)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlProviderNearBy", "countDownLatchWait time out");
            }
            if (this.f181436u != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderNearBy", "get lbs info success, wait for get lbs friend");
                if (!this.f181436u.await(15000L, timeUnit)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlProviderNearBy", "countDownLatchGet time out");
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderNearBy", "not init countDownGet. return null");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlProviderNearBy", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExtControlProviderNearBy", e17, "", new java.lang.Object[0]);
            k(4);
        }
        r(false);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().q(this);
        this.f181437v = true;
        if (((java.util.HashSet) this.f181434s).size() > 0) {
            java.util.Iterator it = ((java.util.HashSet) this.f181434s).iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderNearBy", "add lbsfriend has no avatar: " + str3);
                r45.b64 p17 = p(str3);
                if (p17 != null && p17.f452083d != null) {
                    this.f181433r.a(new java.lang.Object[]{p17.f452084e, null, p17.f452088i, p17.f452087h, java.lang.Integer.valueOf(p17.f452089m)});
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderNearBy", "all user has got avatar");
        }
        d95.e eVar = this.f181433r;
        if (eVar == null || eVar.f309191f <= 0) {
            k(4);
        } else {
            k(0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderNearBy", "return now");
        return this.f181433r;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}
