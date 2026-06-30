package jn2;

/* loaded from: classes5.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f382172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.w f382173e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(jn2.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f382173e = wVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jn2.l(this.f382173e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((jn2.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.List list;
        java.util.List list2;
        jn2.c1 c1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f382172d;
        jn2.w wVar = this.f382173e;
        try {
            try {
                if (i17 == 0) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    wVar.A = true;
                    sf2.x xVar = wVar.f382255f;
                    java.lang.String str = wVar.D;
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = wVar.B;
                    this.f382172d = 1;
                    obj = xVar.p7(str, gVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i17 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                r45.ux1 ux1Var = (r45.ux1) obj;
                wVar.B = ux1Var != null ? ux1Var.f469247e : null;
                wVar.C = ux1Var != null ? ux1Var.f469248f : 0;
                list = ux1Var != null ? ux1Var.f469246d : null;
                list2 = kz5.p0.f395529d;
                if (list == null) {
                    list = list2;
                }
                java.util.List list3 = ux1Var != null ? ux1Var.f469249g : null;
                if (list3 != null) {
                    list2 = list3;
                }
                c1Var = wVar.f382270x;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAnchorSingSongAddPanelSearchWidget", "load more search results failed: " + e17.getMessage());
            }
            if (c1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchAdapter");
                throw null;
            }
            c1Var.x(kz5.n0.S0(list), list2, wVar.D);
            if (wVar.C == 0) {
                jn2.c1 c1Var2 = wVar.f382270x;
                if (c1Var2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchAdapter");
                    throw null;
                }
                if (c1Var2.f382108o) {
                    c1Var2.f382108o = false;
                    c1Var2.m8155x27702c4(((java.util.ArrayList) c1Var2.f382107n).size());
                }
            }
            wVar.A = false;
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            wVar.A = false;
            throw th6;
        }
    }
}
