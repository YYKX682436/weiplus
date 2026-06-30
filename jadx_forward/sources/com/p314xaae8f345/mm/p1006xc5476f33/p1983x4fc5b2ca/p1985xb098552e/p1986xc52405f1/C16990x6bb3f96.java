package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1985xb098552e.p1986xc52405f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/background/provider/WeSeeProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "pt3/b", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.background.provider.WeSeeProvider */
/* loaded from: classes8.dex */
public final class C16990x6bb3f96 extends android.content.ContentProvider {

    /* renamed from: g, reason: collision with root package name */
    public static final pt3.b f237182g = new pt3.b(null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f237183h = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ".plugin.recordvideo.background.provider.WeSeeProvider";

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f237184i = "query";

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f237185m = "delete";

    /* renamed from: n, reason: collision with root package name */
    public static final int f237186n = 100;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237187o = 101;

    /* renamed from: p, reason: collision with root package name */
    public static final int f237188p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f237189q = 3600000;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.UriMatcher f237190d;

    /* renamed from: e, reason: collision with root package name */
    public pt3.a f237191e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f237192f;

    public C16990x6bb3f96() {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        this.f237190d = uriMatcher;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select * from ");
        l75.e0 e0Var = pt3.c.f439792p;
        sb6.append(pt3.c.f439793q);
        this.f237192f = sb6.toString();
        java.lang.String str = f237184i;
        int i17 = f237186n;
        java.lang.String str2 = f237183h;
        uriMatcher.addURI(str2, str, i17);
        uriMatcher.addURI(str2, f237185m, f237187o);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1985xb098552e.p1986xc52405f1.C16990x6bb3f96.a():boolean");
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        uri.toString();
        if (!a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeSeeProvider", "delete checkValid failed");
            return 0;
        }
        if (this.f237190d.match(uri) == f237187o) {
            pt3.a aVar = this.f237191e;
            java.lang.Integer valueOf = aVar != null ? java.lang.Integer.valueOf(aVar.mo78086x7444f759()) : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            int intValue = valueOf.intValue();
            if (intValue != 0) {
                if (intValue > 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeSeeProvider", "delete count error, count: " + intValue + ' ');
                }
                pt3.a aVar2 = this.f237191e;
                if (aVar2 != null) {
                    aVar2.mo70496xb06685ab(f237188p);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeSeeProvider", "delete uriMatcher match failed");
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        uri.toString();
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        uri.toString();
        java.util.Objects.toString(contentValues);
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        uri.toString();
        if (!a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeSeeProvider", "query checkValid failed");
            return null;
        }
        if (this.f237190d.match(uri) != f237186n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeSeeProvider", "query uriMatcher match failed");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeSeeProvider", "query inner ");
        pt3.a aVar = this.f237191e;
        if (aVar == null) {
            return null;
        }
        return aVar.m145256x1d3f4980(this.f237192f, new java.lang.String[0]);
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        uri.toString();
        java.util.Objects.toString(contentValues);
        return 0;
    }
}
