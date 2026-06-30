package yw2;

/* loaded from: classes2.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f548209d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f548210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f548211f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yw2.a0 f548212g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15304x8ca13bae f548213h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(yz5.l lVar, yw2.a0 a0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15304x8ca13bae c15304x8ca13bae, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548211f = lVar;
        this.f548212g = a0Var;
        this.f548213h = c15304x8ca13bae;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        yw2.y yVar = new yw2.y(this.f548211f, this.f548212g, this.f548213h, interfaceC29045xdcb5ca57);
        yVar.f548210e = obj;
        return yVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yw2.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f548209d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f548210e;
            this.f548210e = y0Var2;
            this.f548209d = 1;
            java.lang.Object mo146xb9724478 = this.f548211f.mo146xb9724478(this);
            if (mo146xb9724478 == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
            obj = mo146xb9724478;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f548210e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean h17 = p3325xe03a0797.p3326xc267989b.z0.h(y0Var);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!h17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.TimelineDrawerBuilder", "showLastViewedAnchor scope canceled");
            return f0Var;
        }
        if (this.f548212g.D == null) {
            return f0Var;
        }
        this.f548213h.m62121x52c04cef(booleanValue);
        return f0Var;
    }
}
