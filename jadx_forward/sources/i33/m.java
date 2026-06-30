package i33;

/* loaded from: classes.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f369752d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f369753e;

    /* renamed from: f, reason: collision with root package name */
    public int f369754f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f369755g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i33.u f369756h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i33.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f369756h = uVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        i33.m mVar = new i33.m(this.f369756h, interfaceC29045xdcb5ca57);
        mVar.f369755g = obj;
        return mVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((i33.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        i33.u uVar;
        java.util.Iterator it;
        i33.u uVar2 = this.f369756h;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f369754f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f369755g;
                java.util.List list = ((h33.b) ((jz5.n) uVar2.f369802e).mo141623x754a37bb()).f359987d;
                int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
                if (availableProcessors < 1) {
                    availableProcessors = 1;
                }
                java.util.Iterator it6 = kz5.n0.N(list, availableProcessors).iterator();
                uVar = uVar2;
                it = it6;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (java.util.Iterator) this.f369753e;
                uVar = (i33.u) this.f369752d;
                y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f369755g;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = y0Var;
            while (it.hasNext()) {
                java.util.List list2 = (java.util.List) it.next();
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
                java.util.Iterator it7 = list2.iterator();
                while (it7.hasNext()) {
                    arrayList.add(p3325xe03a0797.p3326xc267989b.l.b(y0Var2, null, null, new i33.l(uVar, (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it7.next(), null), 3, null));
                }
                this.f369755g = y0Var2;
                this.f369752d = uVar;
                this.f369753e = it;
                this.f369754f = 1;
                if (p3325xe03a0797.p3326xc267989b.h.a(arrayList, this) == aVar) {
                    return aVar;
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlbumFilePreviewUIC", "Thumbnail generation failed", e17);
        }
        return jz5.f0.f384359a;
    }
}
