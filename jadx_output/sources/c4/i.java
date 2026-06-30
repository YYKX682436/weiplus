package c4;

/* loaded from: classes15.dex */
public class i extends c4.z {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c4.n f38302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38303f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f38304g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f38305h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media.MediaBrowserServiceCompat f38306i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat, java.lang.Object obj, c4.n nVar, java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2) {
        super(obj);
        this.f38306i = mediaBrowserServiceCompat;
        this.f38302e = nVar;
        this.f38303f = str;
        this.f38304g = bundle;
        this.f38305h = bundle2;
    }

    @Override // c4.z
    public void c(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f38306i;
        x.b bVar = mediaBrowserServiceCompat.f11705g;
        c4.n nVar = this.f38302e;
        if (bVar.getOrDefault(((c4.m0) nVar.f38325g).a(), null) != nVar) {
            int i17 = androidx.media.MediaBrowserServiceCompat.f11701m;
            return;
        }
        int i18 = this.f38352d & 1;
        android.os.Bundle bundle = this.f38304g;
        if (i18 != 0) {
            list = mediaBrowserServiceCompat.a(list, bundle);
        }
        try {
            ((c4.m0) nVar.f38325g).b(this.f38303f, list, bundle, this.f38305h);
        } catch (android.os.RemoteException unused) {
        }
    }
}
