package pv0;

/* loaded from: classes5.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pv0.y f440090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f440091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dw0.c f440092f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(pv0.y yVar, boolean z17, dw0.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f440090d = yVar;
        this.f440091e = z17;
        this.f440092f = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pv0.x(this.f440090d, this.f440091e, this.f440092f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pv0.x xVar = (pv0.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        xVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pv0.m mVar;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        pv0.y yVar = this.f440090d;
        if (yVar.f440098s.f440073a.get() <= 0) {
            boolean z17 = this.f440091e;
            dw0.c timbreInfo = this.f440092f;
            if (z17) {
                gw0.e eVar = yVar.f440094o;
                eVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timbreInfo, "timbreInfo");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTimbreFailed: timbreID = ");
                com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 c4104x6d422cb2 = timbreInfo.f325619a;
                sb6.append(c4104x6d422cb2.f129757b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimbreMaterialViewModel", sb6.toString());
                com.p314xaae8f345.p457x3304c6.p476x11d36527.g gVar = c4104x6d422cb2.f129756a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "getMaterialScene(...)");
                fv0.d c17 = fv0.e.c(gVar);
                dw0.d dVar = (dw0.d) eVar.a(c17).f557206a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "<this>");
                eVar.e(new zu0.k(c17.f348501d, new zu0.h(fv0.e.f(dVar, timbreInfo, zu0.i.f557210g))));
            } else {
                gw0.e eVar2 = yVar.f440094o;
                eVar2.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timbreInfo, "timbreInfo");
                com.p314xaae8f345.p457x3304c6.p476x11d36527.g gVar2 = timbreInfo.f325619a.f129756a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "getMaterialScene(...)");
                fv0.d c18 = fv0.e.c(gVar2);
                dw0.d dVar2 = (dw0.d) eVar2.a(c18).f557206a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar2, "<this>");
                eVar2.e(new zu0.k(c18.f348501d, new zu0.h(fv0.e.f(dVar2, timbreInfo, zu0.i.f557209f))));
            }
            if (!yVar.m7() && (mVar = (pv0.m) yVar.f150773i) != null) {
                mVar.C();
            }
            if (yVar.f440098s.f440074b) {
                com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k.U6(yVar, false, 1, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
