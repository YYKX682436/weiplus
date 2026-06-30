package c4;

/* loaded from: classes15.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4.l0 f38294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38296f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f38297g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f38298h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c4.k0 f38299i;

    public g0(c4.k0 k0Var, c4.l0 l0Var, int i17, java.lang.String str, int i18, android.os.Bundle bundle) {
        this.f38299i = k0Var;
        this.f38294d = l0Var;
        this.f38295e = i17;
        this.f38296f = str;
        this.f38297g = i18;
        this.f38298h = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        c4.n nVar;
        android.os.IBinder a17 = ((c4.m0) this.f38294d).a();
        c4.k0 k0Var = this.f38299i;
        k0Var.f38317a.f11705g.remove(a17);
        java.util.Iterator it = k0Var.f38317a.f11704f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            c4.n nVar2 = (c4.n) it.next();
            if (nVar2.f38324f == this.f38295e) {
                nVar = (android.text.TextUtils.isEmpty(this.f38296f) || this.f38297g <= 0) ? new c4.n(k0Var.f38317a, nVar2.f38322d, nVar2.f38323e, nVar2.f38324f, this.f38298h, this.f38294d) : null;
                it.remove();
            }
        }
        if (nVar == null) {
            nVar = new c4.n(k0Var.f38317a, this.f38296f, this.f38297g, this.f38295e, this.f38298h, this.f38294d);
        }
        k0Var.f38317a.f11705g.put(a17, nVar);
        try {
            a17.linkToDeath(nVar, 0);
        } catch (android.os.RemoteException unused) {
        }
    }
}
