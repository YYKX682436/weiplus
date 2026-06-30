package fn2;

/* loaded from: classes10.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f345871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn2.q1 f345872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345873f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(fn2.q1 q1Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f345872e = q1Var;
        this.f345873f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fn2.n1(this.f345872e, this.f345873f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn2.n1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f345871d;
        fn2.q1 q1Var = this.f345872e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            sf2.d3 d3Var = q1Var.f345891a;
            java.lang.String str = this.f345873f;
            this.f345871d = 1;
            obj = sf2.d3.i7(d3Var, null, false, str, null, this, 11, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.kx1 kx1Var = (r45.kx1) obj;
        if (this.f345873f != null) {
            if (!(kx1Var != null && kx1Var.f460555o)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestedSongPlayListTabViewDataSource", "Target song not in sung list, not caching has sung response");
                if (kx1Var != null && kx1Var.f460550g != null) {
                    q1Var.getClass();
                }
                return obj;
            }
        }
        q1Var.f345893c = kx1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Cached has sung list response, target song in sung list: ");
        sb6.append(kx1Var != null ? java.lang.Boolean.valueOf(kx1Var.f460555o) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestedSongPlayListTabViewDataSource", sb6.toString());
        if (kx1Var != null) {
            q1Var.getClass();
        }
        return obj;
    }
}
