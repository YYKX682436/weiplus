package rr3;

/* loaded from: classes4.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f480706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym3.c f480707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rr3.c f480708f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f480709g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ym3.c cVar, rr3.c cVar2, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f480707e = cVar;
        this.f480708f = cVar2;
        this.f480709g = i2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rr3.b(this.f480707e, this.f480708f, this.f480709g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rr3.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f480706d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ym3.c cVar = this.f480707e;
            ym3.d dVar = new ym3.d(cVar);
            int i18 = cVar.f544677b;
            rr3.c cVar2 = this.f480708f;
            cVar2.f480712e = i18 == 0 ? (int) (java.lang.System.currentTimeMillis() / 1000) : cVar2.f480712e;
            java.lang.String str = cVar2.f480711d;
            int i19 = cVar2.f480712e;
            r45.o14 o14Var = new r45.o14();
            o14Var.f463352d = str;
            o14Var.f463353e = i19;
            o14Var.f463354f = 10;
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = o14Var;
            lVar.f152198b = new r45.p14();
            lVar.f152199c = "/cgi-bin/mmbiz-bin/jsapi-getbizuseuserinforecordlist";
            lVar.f152200d = 1850;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j a17 = o01.d.f423424a.a(lVar.a());
            rr3.a aVar2 = new rr3.a(dVar, cVar2, this.f480709g);
            this.f480706d = 1;
            if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.r) a17).a(aVar2, this) == aVar) {
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
