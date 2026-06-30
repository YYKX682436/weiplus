package g0;

/* loaded from: classes14.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f348896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0.r f348897e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d1.g f348898f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(g0.r rVar, d1.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f348897e = rVar;
        this.f348898f = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new g0.p(this.f348897e, this.f348898f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((g0.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f348896d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g0.m mVar = this.f348897e.f348905g;
            if (mVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("responder");
                throw null;
            }
            this.f348896d = 1;
            b0.h hVar = (b0.h) mVar;
            d1.g localRect = this.f348898f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localRect, "localRect");
            p2.q qVar = hVar.f97841m;
            if (qVar == null) {
                throw new java.lang.IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
            }
            java.lang.Object b17 = hVar.b(localRect, hVar.a(localRect, qVar.f432929a), this);
            if (b17 != aVar) {
                b17 = f0Var;
            }
            if (b17 == aVar) {
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
