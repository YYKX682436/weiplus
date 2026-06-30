package id2;

/* loaded from: classes2.dex */
public final class y1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f372419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.b2 f372420e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.p314xaae8f345.mm.p944x882e457a.f fVar, id2.b2 b2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f372419d = fVar;
        this.f372420e = b2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new id2.y1(this.f372419d, this.f372420e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        id2.y1 y1Var = (id2.y1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        y1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#loadDataWithCgi cgi end. errType=");
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f372419d;
        sb6.append(fVar.f152148a);
        sb6.append(" errCode=");
        sb6.append(fVar.f152149b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMoreOptionSettingUIC", sb6.toString());
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
            id2.b2.f372023g = (r45.lk2) fVar2;
            dk2.ef efVar = dk2.ef.f314905a;
            r45.v32 v32Var = (r45.v32) ((r45.lk2) fVar2).m75936x14adae67(31);
            boolean z17 = false;
            if (v32Var != null && v32Var.m75933x41a8a7f2(6)) {
                z17 = true;
            }
            dk2.ef.C = z17;
            id2.b2 b2Var = this.f372420e;
            ((im2.p4) ((zy2.m8) ((jz5.n) b2Var.f372026f).mo141623x754a37bb())).S6((r45.lk2) fVar.f152151d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
            b2Var.P6((r45.lk2) resp);
        }
        return jz5.f0.f384359a;
    }
}
