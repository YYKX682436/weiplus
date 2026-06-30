package p012xc85e97e9.p020x8ff2b28.p022xa1c79e6f;

/* renamed from: androidx.browser.customtabs.CustomTabsService */
/* loaded from: classes13.dex */
public abstract class AbstractServiceC0105x4c575d06 extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f91298d = new x.b();

    /* renamed from: e, reason: collision with root package name */
    public final b.d f91299e = new s.b(this);

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
        return this.f91299e;
    }
}
