package fr2;

/* loaded from: classes2.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f347263d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f347264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fr2.p f347265f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(fr2.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f347265f = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        fr2.l lVar = new fr2.l(this.f347265f, interfaceC29045xdcb5ca57);
        lVar.f347264e = obj;
        return lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fr2.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f347263d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            fr2.p pVar = this.f347265f;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = pVar.f347280r;
            jz5.f0 f0Var2 = null;
            if (c19792x256d2725 != null) {
                if (!(pVar.f347277o && pVar.f347278p > 0 && !pVar.f347269d.contains(new java.lang.Long(c19792x256d2725.m76784x5db1b11())))) {
                    c19792x256d2725 = null;
                }
                if (c19792x256d2725 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayTogetherBottomBarUIC", "onClick: use cache finderObject");
                    fr2.p.O6(pVar, c19792x256d2725);
                    f0Var2 = f0Var;
                }
            }
            if (f0Var2 == null) {
                this.f347263d = 1;
                if (fr2.p.Q6(pVar, false, this) == aVar) {
                    return aVar;
                }
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
