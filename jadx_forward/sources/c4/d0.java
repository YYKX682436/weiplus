package c4;

/* loaded from: classes15.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4.l0 f119805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.IBinder f119807f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f119808g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c4.k0 f119809h;

    public d0(c4.k0 k0Var, c4.l0 l0Var, java.lang.String str, android.os.IBinder iBinder, android.os.Bundle bundle) {
        this.f119809h = k0Var;
        this.f119805d = l0Var;
        this.f119806e = str;
        this.f119807f = iBinder;
        this.f119808g = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.IBinder a17 = ((c4.m0) this.f119805d).a();
        c4.k0 k0Var = this.f119809h;
        c4.n nVar = (c4.n) k0Var.f119850a.f93238g.m174751x4aabfc28(a17, null);
        if (nVar == null) {
            return;
        }
        p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33 abstractServiceC1134x1ae0da33 = k0Var.f119850a;
        java.lang.String str = this.f119806e;
        android.os.Bundle bundle = this.f119808g;
        abstractServiceC1134x1ae0da33.getClass();
        java.util.HashMap hashMap = nVar.f119859h;
        java.util.List list = (java.util.List) hashMap.get(str);
        if (list == null) {
            list = new java.util.ArrayList();
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            android.os.IBinder iBinder = this.f119807f;
            boolean z17 = true;
            if (!hasNext) {
                list.add(new m3.d(iBinder, bundle));
                hashMap.put(str, list);
                c4.i iVar = new c4.i(abstractServiceC1134x1ae0da33, str, nVar, str, bundle, null);
                if (bundle == null) {
                    abstractServiceC1134x1ae0da33.c(str, iVar);
                } else {
                    iVar.f119885d = 1;
                    abstractServiceC1134x1ae0da33.c(str, iVar);
                }
                if (iVar.b()) {
                    return;
                }
                throw new java.lang.IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + nVar.f119855d + " id=" + str);
            }
            m3.d dVar = (m3.d) it.next();
            if (iBinder == dVar.f404625a) {
                android.os.Bundle bundle2 = (android.os.Bundle) dVar.f404626b;
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
