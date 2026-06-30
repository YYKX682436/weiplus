package df2;

/* loaded from: classes3.dex */
public final class za extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f313469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.zb f313470e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.d22 f313471f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(df2.zb zbVar, r45.d22 d22Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f313470e = zbVar;
        this.f313471f = d22Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.za(this.f313470e, this.f313471f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.za) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f313469d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f313469d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(800L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        df2.zb zbVar = this.f313470e;
        ((mm2.c1) zbVar.m56788xbba4bfc0(mm2.c1.class)).Z6().a(new dk2.vg(this.f313471f, 0, 0, 0, false, 0L, 56, null), true);
        if2.b.Y6(zbVar, qo0.b.f446920n2, null, 2, null);
        long m75942xfb822ef2 = ((mm2.e1) zbVar.m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        byte[] bArr = ((mm2.e1) zbVar.m56788xbba4bfc0(mm2.e1.class)).f410518o;
        java.lang.String e17 = xy2.c.e(zbVar.O6());
        long j17 = ((mm2.e1) zbVar.m56788xbba4bfc0(mm2.e1.class)).f410516m;
        r45.xl1 f17 = ((mm2.c1) zbVar.m56788xbba4bfc0(mm2.c1.class)).Z6().f();
        new ek2.p1(m75942xfb822ef2, bArr, e17, j17, f17, 3, new xl2.a(m75942xfb822ef2, bArr, e17, j17, f17)).l();
        return jz5.f0.f384359a;
    }
}
