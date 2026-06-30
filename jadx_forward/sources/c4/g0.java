package c4;

/* loaded from: classes15.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4.l0 f119827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f119828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119829f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f119830g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f119831h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c4.k0 f119832i;

    public g0(c4.k0 k0Var, c4.l0 l0Var, int i17, java.lang.String str, int i18, android.os.Bundle bundle) {
        this.f119832i = k0Var;
        this.f119827d = l0Var;
        this.f119828e = i17;
        this.f119829f = str;
        this.f119830g = i18;
        this.f119831h = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        c4.n nVar;
        android.os.IBinder a17 = ((c4.m0) this.f119827d).a();
        c4.k0 k0Var = this.f119832i;
        k0Var.f119850a.f93238g.m174754xc84af884(a17);
        java.util.Iterator it = k0Var.f119850a.f93237f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            c4.n nVar2 = (c4.n) it.next();
            if (nVar2.f119857f == this.f119828e) {
                nVar = (android.text.TextUtils.isEmpty(this.f119829f) || this.f119830g <= 0) ? new c4.n(k0Var.f119850a, nVar2.f119855d, nVar2.f119856e, nVar2.f119857f, this.f119831h, this.f119827d) : null;
                it.remove();
            }
        }
        if (nVar == null) {
            nVar = new c4.n(k0Var.f119850a, this.f119829f, this.f119830g, this.f119828e, this.f119831h, this.f119827d);
        }
        k0Var.f119850a.f93238g.put(a17, nVar);
        try {
            a17.linkToDeath(nVar, 0);
        } catch (android.os.RemoteException unused) {
        }
    }
}
