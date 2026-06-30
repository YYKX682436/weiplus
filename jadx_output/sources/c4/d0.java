package c4;

/* loaded from: classes15.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4.l0 f38272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.IBinder f38274f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f38275g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c4.k0 f38276h;

    public d0(c4.k0 k0Var, c4.l0 l0Var, java.lang.String str, android.os.IBinder iBinder, android.os.Bundle bundle) {
        this.f38276h = k0Var;
        this.f38272d = l0Var;
        this.f38273e = str;
        this.f38274f = iBinder;
        this.f38275g = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.IBinder a17 = ((c4.m0) this.f38272d).a();
        c4.k0 k0Var = this.f38276h;
        c4.n nVar = (c4.n) k0Var.f38317a.f11705g.getOrDefault(a17, null);
        if (nVar == null) {
            return;
        }
        androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat = k0Var.f38317a;
        java.lang.String str = this.f38273e;
        android.os.Bundle bundle = this.f38275g;
        mediaBrowserServiceCompat.getClass();
        java.util.HashMap hashMap = nVar.f38326h;
        java.util.List list = (java.util.List) hashMap.get(str);
        if (list == null) {
            list = new java.util.ArrayList();
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            android.os.IBinder iBinder = this.f38274f;
            boolean z17 = true;
            if (!hasNext) {
                list.add(new m3.d(iBinder, bundle));
                hashMap.put(str, list);
                c4.i iVar = new c4.i(mediaBrowserServiceCompat, str, nVar, str, bundle, null);
                if (bundle == null) {
                    mediaBrowserServiceCompat.c(str, iVar);
                } else {
                    iVar.f38352d = 1;
                    mediaBrowserServiceCompat.c(str, iVar);
                }
                if (iVar.b()) {
                    return;
                }
                throw new java.lang.IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + nVar.f38322d + " id=" + str);
            }
            m3.d dVar = (m3.d) it.next();
            if (iBinder == dVar.f323092a) {
                android.os.Bundle bundle2 = (android.os.Bundle) dVar.f323093b;
                if (bundle != bundle2) {
                    z17 = bundle == null ? false : false;
                }
                if (z17) {
                    return;
                }
            }
        }
    }
}
