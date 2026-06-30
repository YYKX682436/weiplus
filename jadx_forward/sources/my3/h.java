package my3;

/* loaded from: classes2.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f414336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.eh3 f414337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ my3.q f414338f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414339g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r45.eh3 eh3Var, my3.q qVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f414337e = eh3Var;
        this.f414338f = qVar;
        this.f414339g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new my3.h(this.f414337e, this.f414338f, this.f414339g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((my3.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f414336d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                r45.eh3 eh3Var = this.f414337e;
                eh3Var.getClass();
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar.f152200d = 9076;
                lVar.f152199c = "/cgi-bin/micromsg-bin/get_ilink_device_oauth_ticket";
                lVar.f152197a = eh3Var;
                lVar.f152198b = new r45.fh3();
                com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
                com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
                iVar.p(a17);
                this.f414336d = 1;
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "onGYNetEnd errType = " + fVar.f152148a + " errCode = " + fVar.f152149b + ' ' + fVar.f152150c);
            boolean b17 = fVar.b();
            my3.q qVar = this.f414338f;
            if (b17) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
                if (fVar2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosServiceImpl", "ticketScene.getResp() == null");
                    qVar.fj(fVar.f152148a, 7);
                } else {
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = ((r45.fh3) fVar2).f455882d;
                    byte[] g17 = gVar != null ? gVar.g() : null;
                    my3.q.Ai(qVar, this.f414339g, g17 != null ? new java.lang.String(g17, r26.c.f450398a) : null);
                }
            } else {
                int i18 = fVar.f152149b;
                if (i18 == -2047) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosServiceImpl", "second device login no allow");
                    qVar.fj(fVar.f152148a, 15);
                } else if (i18 == -2039) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosServiceImpl", "license not register");
                    qVar.fj(fVar.f152148a, 3);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosServiceImpl", "Get Ticket Fail");
                    qVar.fj(fVar.f152148a, 7);
                }
            }
        } catch (rm0.j e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.RtosServiceImpl", "GetILinkDeviceOAuthTicketReq error, errCode:" + e17.f478958f + ", errType:" + e17.f478957e);
        }
        return jz5.f0.f384359a;
    }
}
