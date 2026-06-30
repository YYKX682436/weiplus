package ek2;

/* loaded from: classes3.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.j01 f334950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ek2.c2 f334951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(r45.j01 j01Var, ek2.c2 c2Var) {
        super(0);
        this.f334950d = j01Var;
        this.f334951e = c2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        r45.i22 i22Var = this.f334950d.M1;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (i22Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f334951e.f334961v, "[saveNetworkIdentityAuthParams] org_id:" + i22Var.m75945x2fec8307(0) + ", app_id:" + i22Var.m75945x2fec8307(1));
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                throw new java.lang.IllegalStateException("FinderLiveNetworkIdentityAuthManager must be called on main thread".toString());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNetworkIdentityAuthManager", "[saveAuthParams] hasParams=true");
            dk2.ya.f315920b = i22Var;
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                throw new java.lang.IllegalStateException("FinderLiveNetworkIdentityAuthManager must be called on main thread".toString());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNetworkIdentityAuthManager", "[clearAuthParams]");
            dk2.ya.f315920b = null;
        }
        return f0Var2;
    }
}
