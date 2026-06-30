package bg2;

/* loaded from: classes3.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f101874d;

    /* renamed from: e, reason: collision with root package name */
    public int f101875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f101876f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bg2.r f101877g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.util.List list, bg2.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101876f = list;
        this.f101877g = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.o(this.f101876f, this.f101877g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object j17;
        bg2.r rVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f101875e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.util.List<r45.h30> list = this.f101876f;
            if (list != null) {
                bg2.r rVar2 = this.f101877g;
                this.f101874d = rVar2;
                this.f101875e = 1;
                rVar2.getClass();
                p3325xe03a0797.p3326xc267989b.r rVar3 = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
                rVar3.k();
                v65.n nVar = new v65.n(rVar3);
                for (r45.h30 h30Var : list) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.String m75945x2fec8307 = h30Var.m75945x2fec8307(0);
                    int m75939xb282bd08 = h30Var.m75939xb282bd08(1);
                    r45.mb4 mb4Var = new r45.mb4();
                    mb4Var.set(9, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(m75945x2fec8307));
                    mb4Var.set(0, m75945x2fec8307);
                    mb4Var.set(1, m75945x2fec8307);
                    java.lang.String k17 = hc2.l.k(m75945x2fec8307);
                    mb4Var.set(46, k17);
                    mb4Var.set(47, k17);
                    mn2.c1 c1Var = new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null);
                    mn2.g1 g1Var = mn2.g1.f411508a;
                    wo0.c a17 = g1Var.e().a(c1Var);
                    a17.g(g1Var.h(mn2.f1.f411486d));
                    a17.f529406d = new bg2.m(arrayList, arrayList2, m75939xb282bd08, list, nVar);
                    a17.a();
                }
                j17 = rVar3.j();
                pz5.a aVar2 = pz5.a.f440719d;
                if (j17 == aVar) {
                    return aVar;
                }
                rVar = rVar2;
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rVar = (bg2.r) this.f101874d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        j17 = obj;
        jz5.l lVar = (jz5.l) j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf c14394xb058b2bf = rVar.f101970m;
        if (c14394xb058b2bf != null) {
            c14394xb058b2bf.b((java.util.ArrayList) lVar.f384366d, (java.util.ArrayList) lVar.f384367e);
        }
        return jz5.f0.f384359a;
    }
}
