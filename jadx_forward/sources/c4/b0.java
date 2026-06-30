package c4;

/* loaded from: classes15.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4.l0 f119797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f119799f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f119800g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f119801h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c4.k0 f119802i;

    public b0(c4.k0 k0Var, c4.l0 l0Var, java.lang.String str, int i17, int i18, android.os.Bundle bundle) {
        this.f119802i = k0Var;
        this.f119797d = l0Var;
        this.f119798e = str;
        this.f119799f = i17;
        this.f119800g = i18;
        this.f119801h = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        c4.l0 l0Var = this.f119797d;
        android.os.IBinder a17 = ((c4.m0) l0Var).a();
        c4.k0 k0Var = this.f119802i;
        k0Var.f119850a.f93238g.m174754xc84af884(a17);
        c4.n nVar = new c4.n(k0Var.f119850a, this.f119798e, this.f119799f, this.f119800g, this.f119801h, this.f119797d);
        p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33 abstractServiceC1134x1ae0da33 = k0Var.f119850a;
        abstractServiceC1134x1ae0da33.getClass();
        nVar.f119860i = abstractServiceC1134x1ae0da33.b(this.f119798e, this.f119800g, this.f119801h);
        abstractServiceC1134x1ae0da33.getClass();
        if (nVar.f119860i == null) {
            try {
                ((c4.m0) l0Var).c(2, null);
                return;
            } catch (android.os.RemoteException unused) {
                return;
            }
        }
        try {
            abstractServiceC1134x1ae0da33.f93238g.put(a17, nVar);
            a17.linkToDeath(nVar, 0);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 c0047xab30f989 = abstractServiceC1134x1ae0da33.f93240i;
            if (c0047xab30f989 != null) {
                c4.l lVar = nVar.f119860i;
                java.lang.String str = lVar.f119851a;
                android.os.Bundle bundle = lVar.f119852b;
                c4.m0 m0Var = (c4.m0) l0Var;
                m0Var.getClass();
                if (bundle == null) {
                    bundle = new android.os.Bundle();
                }
                bundle.putInt("extra_service_version", 2);
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("data_media_item_id", str);
                bundle2.putParcelable("data_media_session_token", c0047xab30f989);
                bundle2.putBundle("data_root_hints", bundle);
                m0Var.c(1, bundle2);
            }
        } catch (android.os.RemoteException unused2) {
            abstractServiceC1134x1ae0da33.f93238g.m174754xc84af884(a17);
        }
    }
}
