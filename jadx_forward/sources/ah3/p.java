package ah3;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f86448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ah3.v f86449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ah3.n f86450f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f86451g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f86452h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f86453i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ah3.v vVar, ah3.n nVar, java.util.List list, p3325xe03a0797.p3326xc267989b.y0 y0Var, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f86449e = vVar;
        this.f86450f = nVar;
        this.f86451g = list;
        this.f86452h = y0Var;
        this.f86453i = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ah3.p(this.f86449e, this.f86450f, this.f86451g, this.f86452h, this.f86453i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ah3.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f86448d;
        ah3.v vVar = this.f86449e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                p3325xe03a0797.p3326xc267989b.p3332x361a9b.m mVar = vVar.f86506a;
                this.f86448d = 1;
                if (((p3325xe03a0797.p3326xc267989b.p3332x361a9b.o) mVar).a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    return (java.util.List) obj;
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            int i18 = vVar.f86507b + 1;
            vVar.f86507b = i18;
            vVar.f86508c = java.lang.Math.max(i18, vVar.f86508c);
            ah3.n nVar = this.f86450f;
            nVar.f86443b++;
            ah3.v vVar2 = this.f86449e;
            java.util.List list = this.f86451g;
            p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f86452h;
            yz5.l lVar = this.f86453i;
            this.f86448d = 2;
            obj = ah3.v.b(vVar2, list, y0Var, lVar, nVar, this);
            if (obj == aVar) {
                return aVar;
            }
            return (java.util.List) obj;
        } finally {
            vVar.f86507b--;
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.o) vVar.f86506a).c();
        }
    }
}
