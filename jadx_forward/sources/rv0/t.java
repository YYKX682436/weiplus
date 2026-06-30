package rv0;

/* loaded from: classes5.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f481780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481781e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(rv0.n1 n1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f481781e = n1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rv0.t(this.f481781e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f481780d;
        rv0.n1 n1Var = this.f481781e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.bf p76 = n1Var.p7();
            this.f481780d = 1;
            if (gx0.bf.d7(p76, null, null, false, this, 7, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                yw0.p pVar = (yw0.p) n1Var.o7().f2().b(yw0.q.f548118h);
                pVar.f548113c = yw0.o.f548109d;
                ((yw0.l) pVar.f548120a).a();
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        gx0.bf p77 = n1Var.p7();
        this.f481780d = 2;
        if (gx0.bf.d7(p77, null, null, false, this, 7, null) == aVar) {
            return aVar;
        }
        yw0.p pVar2 = (yw0.p) n1Var.o7().f2().b(yw0.q.f548118h);
        pVar2.f548113c = yw0.o.f548109d;
        ((yw0.l) pVar2.f548120a).a();
        return jz5.f0.f384359a;
    }
}
