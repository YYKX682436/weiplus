package a7;

/* loaded from: classes13.dex */
public class e1 implements a7.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final a7.p0 f1819a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.res.Resources f1820b;

    public e1(android.content.res.Resources resources, a7.p0 p0Var) {
        this.f1820b = resources;
        this.f1819a = p0Var;
    }

    @Override // a7.p0
    public /* bridge */ /* synthetic */ boolean a(java.lang.Object obj) {
        return true;
    }

    @Override // a7.p0
    public a7.o0 b(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        android.net.Uri uri;
        java.lang.Integer num = (java.lang.Integer) obj;
        android.content.res.Resources resources = this.f1820b;
        try {
            uri = android.net.Uri.parse("android.resource://" + resources.getResourcePackageName(num.intValue()) + '/' + resources.getResourceTypeName(num.intValue()) + '/' + resources.getResourceEntryName(num.intValue()));
        } catch (android.content.res.Resources.NotFoundException unused) {
            android.util.Log.isLoggable("ResourceLoader", 5);
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f1819a.b(uri, i17, i18, lVar);
    }
}
