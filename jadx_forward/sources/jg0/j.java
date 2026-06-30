package jg0;

/* loaded from: classes12.dex */
public final class j extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jg0.x f381110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f381111e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qi3.f0 f381112f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(jg0.x xVar, yz5.l lVar, qi3.f0 f0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f381110d = xVar;
        this.f381111e = lVar;
        this.f381112f = f0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jg0.j(this.f381110d, this.f381111e, this.f381112f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((jg0.j) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean Ui;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        oi3.i iVar = new oi3.i();
        jg0.x xVar = this.f381110d;
        xVar.f381171i.f122584d = iVar;
        int i17 = iVar.f427150d;
        iVar.set(i17 + 7, 1);
        cg0.d dVar = xVar.f381171i;
        int i18 = i17 + 3;
        iVar.set(i18, dVar.f122581a);
        iVar.set(i17 + 2, java.lang.Long.valueOf(c01.w9.o(dVar.f122581a)));
        iVar.set(i17 + 4, 34);
        iVar.set(i17 + 9, 1);
        pt0.e0 e0Var = pt0.f0.f439742b1;
        if (!e0Var.j()) {
            iVar.k(dVar.f122582b);
        }
        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
        java.lang.String str = dVar.f122581a;
        ((qv.o) u2Var).getClass();
        if (r01.z.g(str)) {
            ((qv.c) ((rv.l2) i95.n0.c(rv.l2.class))).getClass();
            java.lang.String i19 = s01.r.i();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i19, "getMsgSource(...)");
            iVar.set(i17 + 12, i19);
        } else {
            java.lang.String f17 = c01.ia.f(null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getAndResetMsgSrcIn(...)");
            iVar.set(i17 + 12, f17);
        }
        z15.b bVar = new z15.b();
        bVar.u(dVar.f122588h);
        bVar.t(false);
        bVar.q(dVar.f122589i);
        bVar.r(c01.z1.r());
        dVar.f122585e = bVar;
        iVar.set(i17 + 13, bVar.m126747x696739c());
        int i27 = i17 + 0;
        iVar.set(i27, java.lang.Long.valueOf(e0Var.r(iVar)));
        this.f381111e.mo146xb9724478(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(iVar.m75942xfb822ef2(i27), iVar.m75945x2fec8307(i18)));
        cv.h1 h1Var = (cv.h1) i95.n0.c(cv.h1.class);
        java.lang.String str2 = dVar.f122582b;
        ((bv.p0) h1Var).getClass();
        w21.w0 j17 = w21.x0.j(str2);
        long m75942xfb822ef2 = iVar.m75942xfb822ef2(i27);
        jz5.f0 f0Var = jz5.f0.f384359a;
        qi3.f0 f0Var2 = this.f381112f;
        if (m75942xfb822ef2 > 0) {
            java.util.Map map = f0Var2.f445234b;
            oi3.g gVar = dVar.f122584d;
            map.put("send_msg_local_id", new java.lang.Long(gVar != null ? gVar.m75942xfb822ef2(gVar.f427150d + 0) : 0L));
            java.util.Map map2 = f0Var2.f445234b;
            oi3.g gVar2 = dVar.f122584d;
            map2.put("send_msg_create_time", new java.lang.Long(gVar2 != null ? gVar2.m75942xfb822ef2(gVar2.f427150d + 2) : 0L));
            z15.b bVar2 = dVar.f122585e;
            map2.put("send_msg_file_size", bVar2 != null ? new java.lang.Integer(bVar2.m178312x23255ddc()) : new java.lang.Long(0L));
            if (j17 == null) {
                java.lang.String str3 = "newSendVoice_" + dVar.f122582b;
                w21.w0 w0Var = new w21.w0();
                w0Var.f524018b = dVar.f122582b;
                w0Var.f524019c = dVar.f122581a;
                long j18 = 1000;
                w0Var.f524026j = java.lang.System.currentTimeMillis() / j18;
                w0Var.f524020d = str3;
                w0Var.f524027k = java.lang.System.currentTimeMillis() / j18;
                w0Var.f524025i = 3;
                int e17 = w21.v0.e(iVar, dVar.f122582b);
                w0Var.f524024h = e17;
                if (e17 <= 0) {
                    f0Var2.f445233a = -520009;
                    return f0Var;
                }
                w0Var.f524028l = dVar.f122588h;
                w0Var.f524030n = c01.z1.r();
                w0Var.f524017a = -1;
                i27 = i27;
                w0Var.f524029m = iVar.m75942xfb822ef2(i27);
                w0Var.f524040x = dVar.f122581a;
                ((bv.p0) ((cv.i1) i95.n0.c(cv.i1.class))).getClass();
                Ui = w21.p0.Di().L0(w0Var);
            } else {
                int i28 = j17.f524025i;
                if (i28 != 97 && i28 != 98) {
                    j17.f524025i = 3;
                }
                int e18 = w21.v0.e(iVar, dVar.f122582b);
                j17.f524024h = e18;
                if (e18 <= 0) {
                    f0Var2.f445233a = -520009;
                    return f0Var;
                }
                j17.f524027k = java.lang.System.currentTimeMillis() / 1000;
                j17.f524028l = dVar.f122588h;
                j17.f524017a = 4197728;
                j17.f524029m = iVar.m75942xfb822ef2(i27);
                j17.f524040x = dVar.f122581a;
                Ui = ((bv.p0) ((cv.i1) i95.n0.c(cv.i1.class))).Ui(dVar.f122582b, j17);
            }
            if (!Ui) {
                f0Var2.f445233a = -520014;
                e0Var.b(iVar.m75945x2fec8307(i18), iVar.m75942xfb822ef2(i27));
                return f0Var;
            }
            oi3.g gVar3 = dVar.f122591k;
            if (gVar3 != null) {
                ui3.b bVar3 = new ui3.b();
                bVar3.f66416x297eb4f7 = iVar.m75942xfb822ef2(i27);
                int i29 = gVar3.f427150d;
                int i37 = i29 + 0;
                bVar3.f66418xb3e44c2f = gVar3.m75942xfb822ef2(i37);
                bVar3.f66419x34d46056 = gVar3.m75942xfb822ef2(i29 + 1);
                bVar3.f66420x66425b6d = gVar3.m75945x2fec8307(i29 + 3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceMsg.VoiceMsgSendTask", "insert voice msg result:%s msgQuoteId:%s", java.lang.Boolean.valueOf(((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Di().mo880xb970c2b9(bVar3)), new java.lang.Long(gVar3.m75942xfb822ef2(i37)));
            }
            jg0.x.f381170r.remove(dVar.f122582b);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceMsg.VoiceMsgSendTask", xVar.i() + " prepare msgInsertResult:" + iVar.m75942xfb822ef2(i27));
            f0Var2.f445233a = -520001;
        }
        return f0Var;
    }
}
