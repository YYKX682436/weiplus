package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes2.dex */
public final class s1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f152943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f152944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.lo5 f152945f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.r f152946g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(int i17, r45.lo5 lo5Var, yz5.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f152944e = i17;
        this.f152945f = lo5Var;
        this.f152946g = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p957x53236a1b.s1(this.f152944e, this.f152945f, this.f152946g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p957x53236a1b.s1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f152943d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.e26 e26Var = new r45.e26();
            int i18 = this.f152944e;
            if (i18 == 0) {
                i18 = 1;
            }
            e26Var.f454463d = i18;
            e26Var.f454464e = this.f152945f;
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = 525;
            lVar.f152199c = "/cgi-bin/micromsg-bin/setmsgremind";
            lVar.f152197a = e26Var;
            lVar.f152198b = new r45.f26();
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
            iVar.p(a17);
            this.f152943d = 1;
            obj = rm0.h.b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        yz5.r rVar = this.f152946g;
        if (rVar != null) {
            rVar.C(new java.lang.Integer(fVar.f152148a), new java.lang.Integer(fVar.f152149b), fVar.f152150c, ((r45.f26) fVar.f152151d).f455487d);
        }
        return jz5.f0.f384359a;
    }
}
