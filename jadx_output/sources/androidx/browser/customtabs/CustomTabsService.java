package androidx.browser.customtabs;

/* loaded from: classes13.dex */
public abstract class CustomTabsService extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f9765d = new x.b();

    /* renamed from: e, reason: collision with root package name */
    public final b.d f9766e = new s.b(this);

    public abstract android.os.Bundle a(java.lang.String str, android.os.Bundle bundle);

    public abstract boolean b(s.c cVar, android.net.Uri uri, android.os.Bundle bundle, java.util.List list);

    public abstract boolean c(s.c cVar);

    public abstract int d(s.c cVar, java.lang.String str, android.os.Bundle bundle);

    public abstract boolean e(s.c cVar, android.net.Uri uri);

    public abstract boolean f(s.c cVar, android.os.Bundle bundle);

    public abstract boolean g(s.c cVar, int i17, android.net.Uri uri, android.os.Bundle bundle);

    public abstract boolean h(long j17);

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return this.f9766e;
    }
}
