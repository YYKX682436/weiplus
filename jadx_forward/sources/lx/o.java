package lx;

/* loaded from: classes.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f403417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lx.u f403418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f403419f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f403420g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f403421h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403422i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(lx.u uVar, int i17, long j17, java.util.List list, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f403418e = uVar;
        this.f403419f = i17;
        this.f403420g = j17;
        this.f403421h = list;
        this.f403422i = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new lx.o(this.f403418e, this.f403419f, this.f403420g, this.f403421h, this.f403422i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((lx.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.List list;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f403417d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int i18 = (int) this.f403420g;
            lx.u uVar = this.f403418e;
            android.database.Cursor b17 = lx.u.b(uVar, 1, this.f403419f, i18);
            while (true) {
                try {
                    boolean moveToNext = b17.moveToNext();
                    list = this.f403421h;
                    if (!moveToNext) {
                        break;
                    }
                    list.add(lx.u.a(uVar, b17));
                } finally {
                }
            }
            vz5.b.a(b17, null);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            lx.n nVar = new lx.n(this.f403422i, list, null);
            this.f403417d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, nVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
