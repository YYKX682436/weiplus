package dv2;

/* loaded from: classes2.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f325475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dv2.v f325476e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(dv2.v vVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f325476e = vVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        dv2.s sVar = new dv2.s(this.f325476e, interfaceC29045xdcb5ca57);
        sVar.f325475d = ((java.lang.Boolean) obj).booleanValue();
        return sVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        dv2.s sVar = (dv2.s) mo148xaf65a0fc(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        sVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f325475d;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f325476e.f215192h;
        if (c1190x18d3c3fe != null) {
            if (c1190x18d3c3fe instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) c1190x18d3c3fe).m62442xecae6946(!z17);
            }
            if (z17) {
                int m8300xfda78ef6 = c1190x18d3c3fe.m8300xfda78ef6();
                dv2.i iVar = dv2.i.f325398e;
                if (m8300xfda78ef6 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FollowAggregationTabUIC", "applyFollowOnlyToPager: force pager to FOLLOW from " + c1190x18d3c3fe.m8300xfda78ef6());
                    c1190x18d3c3fe.m8317x940d026a(0, false);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
