package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes4.dex */
public final class r5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f146009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146010e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in.b f146011f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f146012g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.x5 f146013h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 f146014i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(java.lang.String str, in.b bVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, com.p314xaae8f345.mm.p648x55baa833.ui.x5 x5Var, com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 activityC10349x67700120, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f146010e = str;
        this.f146011f = bVar;
        this.f146012g = u3Var;
        this.f146013h = x5Var;
        this.f146014i = activityC10349x67700120;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p648x55baa833.ui.r5(this.f146010e, this.f146011f, this.f146012g, this.f146013h, this.f146014i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p648x55baa833.ui.r5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f146009d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.wc3 wc3Var = new r45.wc3();
            wc3Var.f470597d = this.f146010e;
            java.lang.String str = this.f146011f.f374251d.f374261n;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", "GetChatRoomQRCodeStatus " + wc3Var.f470597d + ", " + str);
            wc3Var.f470598e.add(str);
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = 20039;
            lVar.f152199c = "/cgi-bin/micromsg-bin/getchatroomqrcodestatus";
            lVar.f152197a = wc3Var;
            lVar.f152198b = new r45.xc3();
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
            iVar.p(a17);
            this.f146009d = 1;
            obj = rm0.h.b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        com.p314xaae8f345.mm.p648x55baa833.ui.q5 q5Var = new com.p314xaae8f345.mm.p648x55baa833.ui.q5(this.f146012g, fVar, this.f146011f, this.f146013h, this.f146014i, this.f146010e, null);
        this.f146009d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, q5Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
