package c4;

/* loaded from: classes15.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4.l0 f38279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.IBinder f38281f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c4.k0 f38282g;

    public e0(c4.k0 k0Var, c4.l0 l0Var, java.lang.String str, android.os.IBinder iBinder) {
        this.f38282g = k0Var;
        this.f38279d = l0Var;
        this.f38280e = str;
        this.f38281f = iBinder;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.IBinder a17 = ((c4.m0) this.f38279d).a();
        c4.k0 k0Var = this.f38282g;
        c4.n nVar = (c4.n) k0Var.f38317a.f11705g.getOrDefault(a17, null);
        if (nVar == null) {
            return;
        }
        k0Var.f38317a.getClass();
        java.util.HashMap hashMap = nVar.f38326h;
        java.lang.String str = this.f38280e;
        android.os.IBinder iBinder = this.f38281f;
        if (iBinder == null) {
            hashMap.remove(str);
            return;
        }
        java.util.List list = (java.util.List) hashMap.get(str);
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (iBinder == ((m3.d) it.next()).f323092a) {
                    it.remove();
                }
            }
            if (list.size() == 0) {
                hashMap.remove(str);
            }
        }
    }
}
