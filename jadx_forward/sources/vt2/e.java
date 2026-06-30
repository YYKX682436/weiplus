package vt2;

/* loaded from: classes3.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f521480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vt2.g f521481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f521482f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.i56 f521483g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(vt2.g gVar, gk2.e eVar, r45.i56 i56Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f521481e = gVar;
        this.f521482f = eVar;
        this.f521483g = i56Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vt2.e(this.f521481e, this.f521482f, this.f521483g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vt2.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object g17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f521480d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return obj;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        dk2.q4 q4Var = dk2.q4.f315471a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) this.f521481e.f521489a;
        gk2.e eVar = this.f521482f;
        r45.i56 i56Var = this.f521483g;
        long m75942xfb822ef2 = i56Var.m75942xfb822ef2(3);
        long m75942xfb822ef22 = i56Var.m75942xfb822ef2(2);
        java.lang.String m75945x2fec8307 = i56Var.m75945x2fec8307(9);
        java.lang.String m75945x2fec83072 = i56Var.m75945x2fec8307(4);
        java.lang.String str = m75945x2fec83072 == null ? "" : m75945x2fec83072;
        gk2.e eVar2 = this.f521482f;
        byte[] bArr = ((mm2.e1) eVar2.a(mm2.e1.class)).f410518o;
        java.lang.String m75945x2fec83073 = i56Var.m75945x2fec8307(6);
        java.lang.String str2 = m75945x2fec83073 != null ? m75945x2fec83073 : "";
        java.lang.String str3 = ((mm2.c1) eVar2.a(mm2.c1.class)).f410377m5;
        this.f521480d = 1;
        g17 = q4Var.g(abstractActivityC21394xb3d2c0cf, eVar, true, true, m75942xfb822ef2, m75942xfb822ef22, m75945x2fec8307, str, bArr, str2, null, 3, str3, (r37 & 8192) != 0 ? java.lang.Boolean.TRUE : null, this);
        return g17 == aVar ? aVar : g17;
    }
}
