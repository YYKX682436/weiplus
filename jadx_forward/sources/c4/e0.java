package c4;

/* loaded from: classes15.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4.l0 f119812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.IBinder f119814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c4.k0 f119815g;

    public e0(c4.k0 k0Var, c4.l0 l0Var, java.lang.String str, android.os.IBinder iBinder) {
        this.f119815g = k0Var;
        this.f119812d = l0Var;
        this.f119813e = str;
        this.f119814f = iBinder;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.IBinder a17 = ((c4.m0) this.f119812d).a();
        c4.k0 k0Var = this.f119815g;
        c4.n nVar = (c4.n) k0Var.f119850a.f93238g.m174751x4aabfc28(a17, null);
        if (nVar == null) {
            return;
        }
        k0Var.f119850a.getClass();
        java.util.HashMap hashMap = nVar.f119859h;
        java.lang.String str = this.f119813e;
        android.os.IBinder iBinder = this.f119814f;
        if (iBinder == null) {
            hashMap.remove(str);
            return;
        }
        java.util.List list = (java.util.List) hashMap.get(str);
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (iBinder == ((m3.d) it.next()).f404625a) {
                    it.remove();
                }
            }
            if (list.size() == 0) {
                hashMap.remove(str);
            }
        }
    }
}
