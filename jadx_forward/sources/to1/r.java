package to1;

/* loaded from: classes15.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final to1.n f502467d = new to1.n(null);

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f502468e;

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f502469a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f502470b;

    /* renamed from: c, reason: collision with root package name */
    public final long f502471c;

    static {
        new android.util.SparseArray();
        f502468e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(1024);
    }

    public r(android.net.Uri uri, boolean z17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        this.f502469a = uri;
        this.f502470b = z17;
        this.f502471c = j17;
    }

    public final android.net.Uri a(java.lang.String str) {
        java.lang.String str2;
        boolean i07 = r26.n0.i0(str, '/', false, 2, null);
        android.net.Uri uri = this.f502469a;
        if (i07) {
            str2 = android.provider.DocumentsContract.getDocumentId(uri) + str;
        } else {
            str2 = android.provider.DocumentsContract.getDocumentId(uri) + '/' + str;
        }
        android.net.Uri buildDocumentUriUsingTree = android.provider.DocumentsContract.buildDocumentUriUsingTree(uri, str2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(buildDocumentUriUsingTree, "buildDocumentUriUsingTree(...)");
        return buildDocumentUriUsingTree;
    }

    public final boolean b(java.lang.String relativePath, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(relativePath, "relativePath");
        android.content.ContentResolver contentResolver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver();
        android.net.Uri a17 = a(relativePath);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = f502468e;
        if (z17) {
            r2Var.d(-1);
        } else {
            r2Var.m77803xc84af884(a17.getPath());
        }
        return android.provider.DocumentsContract.deleteDocument(contentResolver, a17);
    }

    public final to1.r c(java.lang.String relativePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(relativePath, "relativePath");
        return (to1.r) bm5.v1.a("findDocument", new to1.q(this, relativePath));
    }

    public final to1.r d(java.lang.String fileName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        if (!z17) {
            return c(fileName);
        }
        to1.r c17 = c(fileName);
        if (c17 != null) {
            return c17;
        }
        android.net.Uri uri = (android.net.Uri) bm5.v1.a("WxDocumentFile.createFile", new to1.p(this, "", fileName));
        return uri == null ? c(fileName) : new to1.r(uri, false, 0L);
    }

    public final java.lang.String e() {
        java.lang.String path = this.f502469a.getPath();
        if (path == null) {
            path = "";
        }
        java.lang.String substring = path.substring(r26.n0.O(path, '/', 0, false, 6, null) + 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        return substring;
    }

    public final to1.o f() {
        android.database.Cursor a17 = to1.n.a(f502467d, this.f502469a, "_size", "last_modified");
        if (a17 == null) {
            return new to1.o(0L, 0L);
        }
        try {
            a17.moveToFirst();
            if (a17.getColumnCount() < 2) {
                to1.o oVar = new to1.o(0L, 0L);
                vz5.b.a(a17, null);
                return oVar;
            }
            java.lang.Long valueOf = a17.isNull(0) ? null : java.lang.Long.valueOf(a17.getLong(0));
            long longValue = valueOf != null ? valueOf.longValue() : 0L;
            java.lang.Long valueOf2 = a17.isNull(1) ? null : java.lang.Long.valueOf(a17.getLong(1));
            to1.o oVar2 = new to1.o(longValue, valueOf2 != null ? valueOf2.longValue() : 0L);
            vz5.b.a(a17, null);
            return oVar2;
        } finally {
        }
    }

    public final java.util.List g() {
        android.net.Uri uri = this.f502469a;
        android.net.Uri buildChildDocumentsUriUsingTree = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(uri, android.provider.DocumentsContract.getDocumentId(uri));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxDocumentFile", "listFiles for childrenUri %s", buildChildDocumentsUriUsingTree);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        to1.n nVar = f502467d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(buildChildDocumentsUriUsingTree);
        android.database.Cursor a17 = to1.n.a(nVar, buildChildDocumentsUriUsingTree, "document_id", "mime_type", "_size");
        if (a17 != null) {
            while (true) {
                try {
                    java.lang.Long l17 = null;
                    if (!a17.moveToNext()) {
                        break;
                    }
                    java.lang.String string = a17.getString(0);
                    java.lang.String string2 = a17.isNull(1) ? null : a17.getString(1);
                    android.net.Uri buildDocumentUriUsingTree = android.provider.DocumentsContract.buildDocumentUriUsingTree(uri, string);
                    boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("vnd.android.document/directory", string2);
                    if (!a17.isNull(2)) {
                        l17 = java.lang.Long.valueOf(a17.getLong(2));
                    }
                    long longValue = l17 != null ? l17.longValue() : b17 ? 4096L : 0L;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(buildDocumentUriUsingTree);
                    arrayList.add(new to1.r(buildDocumentUriUsingTree, b17, longValue));
                } finally {
                }
            }
            vz5.b.a(a17, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxDocumentFile", "listFiles count %s", java.lang.Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public final to1.r h(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        if (name.length() == 0) {
            return this;
        }
        to1.r c17 = c(name);
        if (c17 == null) {
            android.net.Uri uri = (android.net.Uri) bm5.v1.a("WxDocumentFile.createFile", new to1.p(this, "vnd.android.document/directory", name));
            return uri == null ? c(name) : new to1.r(uri, true, 4096L);
        }
        if (c17.f502470b) {
            return c17;
        }
        return null;
    }

    /* renamed from: toString */
    public java.lang.String m166829x9616526c() {
        return "WxDocumentFile(uri=" + this.f502469a + ", isDirectory=" + this.f502470b + ')';
    }
}
