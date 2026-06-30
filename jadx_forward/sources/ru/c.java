package ru;

/* loaded from: classes9.dex */
public final class c extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ru.j f481085d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ru.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f481085d = jVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ru.c(this.f481085d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((ru.c) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        pt0.e0 e0Var = pt0.f0.f439742b1;
        ru.j jVar = this.f481085d;
        oi3.e eVar = jVar.f481113i.f493721j;
        java.lang.String m75945x2fec8307 = eVar != null ? eVar.m75945x2fec8307(eVar.f427150d + 3) : null;
        oi3.e eVar2 = jVar.f481113i.f493721j;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(m75945x2fec8307, eVar2 != null ? eVar2.m75942xfb822ef2(eVar2.f427150d + 0) : 0L);
        if (k17 == null) {
            return null;
        }
        k17.r1(1);
        oi3.e eVar3 = jVar.f481113i.f493721j;
        if (eVar3 == null || (str = eVar3.m75945x2fec8307(eVar3.f427150d + 3)) == null) {
            str = "";
        }
        k17.e1(c01.w9.o(str));
        k17.j1(1);
        e0Var.s(k17.Q0(), k17.m124847x74d37ac6(), k17);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6192x4fa59aa4 c6192x4fa59aa4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6192x4fa59aa4();
        long m124847x74d37ac6 = k17.m124847x74d37ac6();
        am.vz vzVar = c6192x4fa59aa4.f136449g;
        vzVar.f89761a = m124847x74d37ac6;
        vzVar.f89763c = k17.Q0();
        vzVar.f89762b = k17.m124847x74d37ac6();
        vzVar.f89764d = k17.Q0();
        return java.lang.Boolean.valueOf(c6192x4fa59aa4.e());
    }
}
