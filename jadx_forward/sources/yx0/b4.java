package yx0;

/* loaded from: classes5.dex */
public final class b4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f548692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f548694f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f548695g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f548696h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(yx0.b8 b8Var, java.lang.String str, java.lang.String str2, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548693e = b8Var;
        this.f548694f = str;
        this.f548695g = str2;
        this.f548696h = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.b4(this.f548693e, this.f548694f, this.f548695g, this.f548696h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.b4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f548692d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int ordinal = this.f548693e.f548725s.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f548693e.f548727u;
                if (r2Var != null) {
                    yx0.b8 b8Var = this.f548693e;
                    this.f548692d = 1;
                    if (b8Var.a0(r2Var, "openAsyncAIGCDraft", this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "openAsyncAIGCDraft: " + this.f548693e.f548725s);
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).vj(true);
        yx0.b8 b8Var2 = this.f548693e;
        p3325xe03a0797.p3326xc267989b.l.d(b8Var2.L, null, null, new yx0.a4(b8Var2, this.f548694f, this.f548695g, this.f548696h, null), 3, null);
        return jz5.f0.f384359a;
    }
}
