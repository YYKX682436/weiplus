package to1;

/* loaded from: classes15.dex */
public final class n {
    public n(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final android.database.Cursor a(to1.n nVar, android.net.Uri uri, java.lang.String... strArr) {
        nVar.getClass();
        return (android.database.Cursor) bm5.v1.a("WxDocumentFile.query", new to1.m(strArr, uri));
    }

    public final to1.r b(android.net.Uri uri) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        return (to1.r) bm5.v1.a("WxDocumentFile.fromUri", new to1.l(uri));
    }
}
