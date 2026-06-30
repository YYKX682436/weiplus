package id2;

/* loaded from: classes2.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f372325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f372326e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(com.p314xaae8f345.mm.p944x882e457a.f fVar, id2.u3 u3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f372325d = fVar;
        this.f372326e = u3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new id2.s2(this.f372325d, this.f372326e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        id2.s2 s2Var = (id2.s2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        s2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#loadDataWithCgi cgi end. errType=");
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f372325d;
        sb6.append(fVar.f152148a);
        sb6.append(" errCode=");
        sb6.append(fVar.f152149b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", sb6.toString());
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.lk2 lk2Var = (r45.lk2) fVar.f152151d;
            id2.u3.f372351p = lk2Var;
            dk2.ef efVar = dk2.ef.f314905a;
            r45.v32 v32Var = (r45.v32) lk2Var.m75936x14adae67(31);
            dk2.ef.C = v32Var != null && v32Var.m75933x41a8a7f2(6);
            r45.v32 v32Var2 = (r45.v32) ((r45.lk2) fVar.f152151d).m75936x14adae67(31);
            dk2.ef.D = v32Var2 != null && v32Var2.m75933x41a8a7f2(7);
            id2.u3 u3Var = this.f372326e;
            ((im2.p4) ((zy2.m8) ((jz5.n) u3Var.f372354f).mo141623x754a37bb())).S6((r45.lk2) fVar.f152151d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
            u3Var.T6((r45.lk2) resp);
        }
        return jz5.f0.f384359a;
    }
}
