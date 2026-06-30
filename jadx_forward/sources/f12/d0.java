package f12;

/* loaded from: classes4.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f340127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340128e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340129f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f12.j0 f340130g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(java.lang.String str, java.lang.String str2, f12.j0 j0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f340128e = str;
        this.f340129f = str2;
        this.f340130g = j0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new f12.d0(this.f340128e, this.f340129f, this.f340130g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((f12.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f340127d;
        f12.j0 j0Var = this.f340130g;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                java.lang.String str = this.f340128e;
                java.lang.String str2 = this.f340129f;
                java.lang.String str3 = j0Var.f340153g;
                if (str3 == null) {
                    str3 = "";
                }
                c12.a aVar2 = new c12.a(str, str2, "CNY_EXPRESSION", str3);
                this.f340127d = 1;
                obj = b12.d.a(aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            uq.l lVar = (uq.l) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SpringLuckyEggViewModel", "accept coupon result: " + lVar.f511689d);
            if (lVar.f511689d == 0) {
                j0Var.f340162s.mo523x53d8522f(java.lang.Boolean.TRUE);
                j0Var.f340156m.mo7808x76db6cb1(d12.a.f307241d);
            } else {
                j0Var.f340156m.mo7808x76db6cb1(d12.a.f307242e);
            }
        } catch (b12.a e17) {
            j0Var.getClass();
            p012xc85e97e9.p093xedfae76a.j0 j0Var2 = j0Var.f340156m;
            if (e17.f98570d > 0) {
                j0Var2.mo7808x76db6cb1(d12.a.f307243f);
            } else {
                j0Var2.mo7808x76db6cb1(d12.a.f307242e);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SpringLuckyEggViewModel", "Unable to accept money");
        }
        return jz5.f0.f384359a;
    }
}
