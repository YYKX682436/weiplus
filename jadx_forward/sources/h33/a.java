package h33;

/* loaded from: classes.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f359983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym3.c f359984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h33.b f359985f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f359986g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ym3.c cVar, h33.b bVar, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f359984e = cVar;
        this.f359985f = bVar;
        this.f359986g = i2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new h33.a(this.f359984e, this.f359985f, this.f359986g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((h33.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f359983d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ym3.c cVar = this.f359984e;
            ym3.d dVar = new ym3.d(cVar);
            int i18 = cVar.f544677b;
            int i19 = cVar.f544678c;
            h33.b bVar = this.f359985f;
            if (i18 < ((java.util.ArrayList) bVar.f359987d).size()) {
                int i27 = i19 + i18;
                if (((java.util.ArrayList) bVar.f359987d).size() > i27) {
                    dVar.f544681b = true;
                } else {
                    i27 = ((java.util.ArrayList) bVar.f359987d).size();
                }
                java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078> arrayList = new java.util.ArrayList();
                while (i18 < i27) {
                    arrayList.add(((java.util.ArrayList) bVar.f359987d).get(i18));
                    i18++;
                }
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 : arrayList) {
                    java.lang.String str = abstractC15633xee433078.f219963e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getOriginalPath(...)");
                    if (!r26.n0.N(str)) {
                        dVar.f544682c.add(new h33.c(0, abstractC15633xee433078));
                    }
                }
            }
            this.f359983d = 1;
            if (this.f359986g.mo771x2f8fd3(dVar, this) == aVar) {
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
