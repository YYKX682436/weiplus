package b7;

/* loaded from: classes13.dex */
public class f implements a7.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f18179a;

    public f(android.content.Context context) {
        this.f18179a = context.getApplicationContext();
    }

    @Override // a7.p0
    public boolean a(java.lang.Object obj) {
        android.net.Uri uri = (android.net.Uri) obj;
        return v6.b.a(uri) && !uri.getPathSegments().contains("video");
    }

    @Override // a7.p0
    public a7.o0 b(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        android.net.Uri uri = (android.net.Uri) obj;
        if (!(i17 != Integer.MIN_VALUE && i18 != Integer.MIN_VALUE && i17 <= 512 && i18 <= 384)) {
            return null;
        }
        p7.b bVar = new p7.b(uri);
        android.content.Context context = this.f18179a;
        return new a7.o0(bVar, v6.e.c(context, uri, new v6.c(context.getContentResolver())));
    }
}
