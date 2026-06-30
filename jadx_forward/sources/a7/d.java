package a7;

/* loaded from: classes13.dex */
public class d implements a7.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.AssetManager f83348a;

    /* renamed from: b, reason: collision with root package name */
    public final a7.a f83349b;

    public d(android.content.res.AssetManager assetManager, a7.a aVar) {
        this.f83348a = assetManager;
        this.f83349b = aVar;
    }

    @Override // a7.p0
    public boolean a(java.lang.Object obj) {
        android.net.Uri uri = (android.net.Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // a7.p0
    public a7.o0 b(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        android.net.Uri uri = (android.net.Uri) obj;
        return new a7.o0(new p7.b(uri), this.f83349b.a(this.f83348a, uri.toString().substring(22)));
    }
}
