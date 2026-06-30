package df2;

/* loaded from: classes3.dex */
public final class ny extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.wy f312428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 f312429f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f312430g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny(df2.wy wyVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var, java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312428e = wyVar;
        this.f312429f = l1Var;
        this.f312430g = obj;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.ny(this.f312428e, this.f312429f, this.f312430g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.ny) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15390x96b299ef c15390x96b299ef;
        lj2.u0 y17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f312427d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f312427d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String str = this.f312429f.f197134s;
        df2.wy wyVar = this.f312428e;
        zi2.w wVar = (zi2.w) wyVar.R6(zi2.w.class);
        android.widget.FrameLayout mo124429x4ed4a76f = (wVar == null || (y17 = ((fi2.a) wVar.x1()).y(str)) == null) ? null : y17.mo124429x4ed4a76f();
        if (mo124429x4ed4a76f != null) {
            android.view.View childAt = mo124429x4ed4a76f.getChildAt(0);
            if (childAt == null || !(childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15390x96b299ef)) {
                mo124429x4ed4a76f.removeAllViews();
                android.content.Context context = mo124429x4ed4a76f.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                c15390x96b299ef = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15390x96b299ef(context);
                mo124429x4ed4a76f.addView(c15390x96b299ef, new android.view.ViewGroup.LayoutParams(-2, -2));
            } else {
                c15390x96b299ef = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15390x96b299ef) childAt;
            }
            mo124429x4ed4a76f.setVisibility(0);
            java.lang.String string = c15390x96b299ef.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e49, wyVar.f313276t.format(this.f312430g));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            c15390x96b299ef.a(string);
        }
        return jz5.f0.f384359a;
    }
}
