package z51;

/* loaded from: classes10.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f551704d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f551705e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z51.c f551706f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(z51.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f551706f = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        z51.b bVar = new z51.b(this.f551706f, interfaceC29045xdcb5ca57);
        bVar.f551705e = obj;
        return bVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((z51.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f551704d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f551705e;
            qp.b bVar = qp.b.f447207a;
            z51.c cVar = this.f551706f;
            a61.c cVar2 = cVar.f551707f;
            if (cVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceConfig");
                throw null;
            }
            java.lang.Long l17 = cVar2.f83255d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "getMediaId(...)");
            long longValue = l17.longValue();
            a61.c cVar3 = cVar.f551707f;
            if (cVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceConfig");
                throw null;
            }
            java.lang.String str = cVar3.f83254c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getVideoPath(...)");
            a61.c cVar4 = cVar.f551707f;
            if (cVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceConfig");
                throw null;
            }
            java.lang.String str2 = cVar4.f83252a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getThumbPath(...)");
            aq.u0 b17 = bVar.b(longValue, str, str2, 0L);
            if (!p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
                cVar.g("prepared get data finish but job is cancel");
                return f0Var;
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            z51.a aVar2 = new z51.a(cVar, b17, null);
            this.f551704d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
