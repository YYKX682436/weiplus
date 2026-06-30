package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes15.dex */
public class s9 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f21.e f284200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.n9 f284201e;

    public s9(com.p314xaae8f345.mm.ui.p2650x55bb7a46.n9 n9Var, f21.e eVar) {
        this.f284201e = n9Var;
        this.f284200d = eVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        java.lang.String str = (java.lang.String) obj2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggMgr", "show %s, %s", bool, str);
        if (!bool.booleanValue() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        d12.b bVar = new d12.b(null, null, null, false, 0, null, 63, null);
        bVar.f307253f = str;
        f21.e eVar = this.f284200d;
        if (eVar.f340416s.f340445e == null) {
            return null;
        }
        this.f284201e.f(eVar, bVar);
        return null;
    }
}
