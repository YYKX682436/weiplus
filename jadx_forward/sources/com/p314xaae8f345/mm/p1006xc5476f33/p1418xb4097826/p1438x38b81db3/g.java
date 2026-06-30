package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f184961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f184963f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f184964g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f184965h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f184966i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f184967m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var3, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f184962e = str;
        this.f184963f = f0Var;
        this.f184964g = f0Var2;
        this.f184965h = g0Var;
        this.f184966i = f0Var3;
        this.f184967m = c0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.g(this.f184962e, this.f184963f, this.f184964g, this.f184965h, this.f184966i, this.f184967m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f184961d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            i95.m c17 = i95.n0.c(bg0.v.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            this.f184961d = 1;
            com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            r45.q41 q41Var = new r45.q41();
            q41Var.set(2, this.f184962e);
            q41Var.set(3, pm0.b0.h(null));
            lVar.f152197a = q41Var;
            lVar.f152198b = new r45.r41();
            lVar.f152200d = 11196;
            lVar.f152199c = "/cgi-bin/micromsg-bin/findergetaigctaskresult";
            lVar.f152201e = 0;
            lVar.f152202f = 0;
            iVar.p(lVar.a());
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
        this.f184963f.f391649d = ((r45.r41) fVar.f152151d).m75939xb282bd08(7);
        this.f184964g.f391649d = ((r45.r41) fVar.f152151d).m75939xb282bd08(6);
        this.f184965h.f391654d = ((r45.r41) fVar.f152151d).m75939xb282bd08(1) * 1000;
        this.f184966i.f391649d = ((r45.r41) fVar.f152151d).m75939xb282bd08(2);
        this.f184967m.f391645d = ((r45.r41) fVar.f152151d).m75933x41a8a7f2(3);
        return jz5.f0.f384359a;
    }
}
