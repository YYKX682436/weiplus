package bz0;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 f118266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f118267f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p3325xe03a0797.p3326xc267989b.r2 r2Var, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f118266e = r2Var;
        this.f118267f = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bz0.e(this.f118266e, this.f118267f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bz0.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f118265d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f118266e;
            if (r2Var != null) {
                this.f118265d = 1;
                if (r2Var.C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6707xf4fd108e c6707xf4fd108e = bz0.f.f118270c;
        c6707xf4fd108e.f140462d = c6707xf4fd108e.b("sessionKey", bz0.a.f118255a, true);
        c6707xf4fd108e.f140463e = bz0.a.f118256b;
        int i18 = this.f118267f;
        c6707xf4fd108e.f140471m = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasReport24946", "report creationResult: " + i18);
        c6707xf4fd108e.k();
        bz0.f.f118270c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6707xf4fd108e();
        return jz5.f0.f384359a;
    }
}
