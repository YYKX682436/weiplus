package xc2;

/* loaded from: classes2.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f534679d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f534680e;

    /* renamed from: f, reason: collision with root package name */
    public int f534681f;

    /* renamed from: g, reason: collision with root package name */
    public int f534682g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f534683h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ xc2.k0 f534684i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f534685m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(java.util.List list, xc2.k0 k0Var, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f534683h = list;
        this.f534684i = k0Var;
        this.f534685m = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xc2.h0(this.f534683h, this.f534684i, this.f534685m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc2.h0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        xc2.k0 k0Var;
        int i17;
        java.util.Iterator it;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f534682g;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : this.f534683h) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) obj2).f66937x27cd822a;
                boolean z17 = false;
                if (c19792x256d2725 != null && c19792x256d2725.m76784x5db1b11() == 0) {
                    z17 = true;
                }
                if (z17) {
                    arrayList.add(obj2);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            k0Var = this.f534684i;
            i17 = this.f534685m;
            it = it6;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i17 = this.f534681f;
            it = (java.util.Iterator) this.f534680e;
            k0Var = (xc2.k0) this.f534679d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            xc2.g0 g0Var = new xc2.g0(c14994x9b99c079, k0Var, i17, null);
            this.f534679d = k0Var;
            this.f534680e = it;
            this.f534681f = i17;
            this.f534682g = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, g0Var, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
