package fn2;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ux1 f345878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn2.s f345879e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r45.ux1 ux1Var, fn2.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f345878d = ux1Var;
        this.f345879e = sVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fn2.p(this.f345878d, this.f345879e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        fn2.p pVar = (fn2.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        pVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.ux1 ux1Var = this.f345878d;
        java.util.List list = ux1Var != null ? ux1Var.f469246d : null;
        java.util.List list2 = kz5.p0.f395529d;
        if (list == null) {
            list = list2;
        }
        java.util.List list3 = ux1Var != null ? ux1Var.f469249g : null;
        if (list3 != null) {
            list2 = list3;
        }
        fn2.s sVar = this.f345879e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar = sVar.f345913s;
        if (dvVar != null) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = ux1Var != null ? ux1Var.f469247e : null;
            int i17 = ux1Var != null ? ux1Var.f469248f : 0;
            dvVar.f199690j = gVar;
            dvVar.f199691k = i17;
        }
        sVar.f345910p.J(list, list2, (ux1Var == null || ux1Var.f469248f == 0) ? false : true, sVar.f345916v);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar2 = sVar.f345913s;
        if (dvVar2 != null && (c1163xf1deaba4 = dvVar2.f199685e) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongSearchWidget$initSearchView$4$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
            c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongSearchWidget$initSearchView$4$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar3 = sVar.f345913s;
        if (dvVar3 != null) {
            dvVar3.d();
        }
        fn2.s.a(sVar, list);
        return jz5.f0.f384359a;
    }
}
