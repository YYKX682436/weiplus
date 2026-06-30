package hj3;

/* loaded from: classes14.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f363142d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f363143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lj3.c f363144f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hj3.m f363145g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hj3.r f363146h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(lj3.c cVar, hj3.m mVar, hj3.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f363144f = cVar;
        this.f363145g = mVar;
        this.f363146h = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        hj3.e eVar = new hj3.e(this.f363144f, this.f363145g, this.f363146h, interfaceC29045xdcb5ca57);
        eVar.f363143e = obj;
        return eVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hj3.e) mo148xaf65a0fc((jj3.c) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object c17;
        java.lang.Object c18;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f363142d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            jj3.c cVar = (jj3.c) this.f363143e;
            hj3.r rVar = this.f363146h;
            hj3.m mVar = this.f363145g;
            lj3.c cVar2 = this.f363144f;
            if (cVar2 == null) {
                jj3.d a17 = cVar.a();
                if (a17 != null) {
                    kj3.d dVar = mVar.f363182g;
                    hj3.p pVar = (hj3.p) rVar;
                    android.util.Size drawSize = a17.getSize();
                    boolean z17 = pVar.f363188d;
                    mj3.g renderInfo = pVar.f363185b;
                    if (z17) {
                        renderInfo = mj3.g.a(renderInfo, 0, 0, 0, !renderInfo.f408586d, false, 23, null);
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawSize, "drawSize");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderInfo, "renderInfo");
                    kj3.e eVar = new kj3.e(renderInfo, drawSize, pVar.f363187c.f375928e, true);
                    this.f363142d = 1;
                    c18 = dVar.c(eVar, this);
                    if (c18 == aVar) {
                        return aVar;
                    }
                    return (kj3.f) c18;
                }
            } else {
                jj3.d a18 = cVar.a();
                if (a18 != null) {
                    kj3.d dVar2 = mVar.f363182g;
                    android.util.Size drawSize2 = a18.getSize();
                    hj3.p pVar2 = (hj3.p) rVar;
                    boolean z18 = pVar2.f363188d;
                    mj3.g renderInfo2 = pVar2.f363185b;
                    if (z18) {
                        renderInfo2 = mj3.g.a(renderInfo2, 0, 0, 0, !renderInfo2.f408586d, false, 23, null);
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawSize2, "drawSize");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderInfo2, "renderInfo");
                    kj3.e eVar2 = new kj3.e(renderInfo2, drawSize2, cVar2.f400509c, false);
                    this.f363142d = 2;
                    c17 = dVar2.c(eVar2, this);
                    if (c17 == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i17 == 1) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                c18 = obj;
                return (kj3.f) c18;
            }
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c17 = obj;
        }
        return null;
    }
}
