package b0;

/* loaded from: classes14.dex */
public final class j0 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f97886e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97887f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1.s f97888g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f97889h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f97890i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.p f97891m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p1.s sVar, yz5.a aVar, yz5.a aVar2, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97888g = sVar;
        this.f97889h = aVar;
        this.f97890i = aVar2;
        this.f97891m = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.j0 j0Var = new b0.j0(this.f97888g, this.f97889h, this.f97890i, this.f97891m, interfaceC29045xdcb5ca57);
        j0Var.f97887f = obj;
        return j0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.j0) mo148xaf65a0fc((p1.c) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p1.c cVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97886e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p1.c cVar2 = (p1.c) this.f97887f;
            long j17 = this.f97888g.f432412a;
            b0.i0 i0Var = new b0.i0(this.f97891m);
            this.f97887f = cVar2;
            this.f97886e = 1;
            java.lang.Object f17 = b0.p0.f(cVar2, j17, i0Var, this);
            if (f17 == aVar) {
                return aVar;
            }
            cVar = cVar2;
            obj = f17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (p1.c) this.f97887f;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            java.util.List list = ((p1.o0) cVar).f432397i.f432401h.f432375a;
            int size = list.size();
            for (int i18 = 0; i18 < size; i18++) {
                p1.s sVar = (p1.s) list.get(i18);
                if (p1.m.b(sVar)) {
                    sVar.a();
                }
            }
            this.f97889h.mo152xb9724478();
        } else {
            this.f97890i.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
