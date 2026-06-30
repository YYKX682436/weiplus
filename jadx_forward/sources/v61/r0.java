package v61;

/* loaded from: classes5.dex */
public abstract class r0 implements v61.p0, com.p314xaae8f345.mm.p944x882e457a.u0 {
    @Override // v61.p0
    public void a(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RefreshTokenListener", "onError : errType = " + i17 + ", errMsg = " + str);
    }

    @Override // v61.p0
    public void b(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString("access_token");
        java.lang.String string2 = bundle.getString("expires");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RefreshTokenListener", "onComplete : newToken = " + string + ", expires = " + string2);
        if (string2 != null) {
            gm0.j1.u().c().w(65832, string2);
        }
        gm0.j1.u().c().w(65830, string);
        gm0.j1.u().c().w(65831, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        gm0.j1.d().a(183, this);
        gm0.j1.d().g(new r61.a1(2, string));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public final void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() != 183) {
            return;
        }
        gm0.j1.d().q(183, this);
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RefreshTokenListener", "update token success");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RefreshTokenListener", "update token fail");
        }
    }
}
