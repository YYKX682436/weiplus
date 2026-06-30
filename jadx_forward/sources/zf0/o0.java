package zf0;

/* loaded from: classes12.dex */
public final class o0 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f554028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.k0 f554029e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(zf0.v0 v0Var, qi3.k0 k0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f554028d = v0Var;
        this.f554029e = k0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zf0.o0(this.f554028d, this.f554029e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((zf0.o0) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        zf0.v0 v0Var = this.f554028d;
        vf0.h3 h3Var = v0Var.f554096i;
        oi3.h hVar = h3Var.f517711e;
        qi3.k0 k0Var = this.f554029e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (hVar == null) {
            k0Var.f445272a = -520009;
            return f0Var;
        }
        qi3.f0 f0Var2 = h3Var.f517714h;
        if (f0Var2 != null && (i28 = f0Var2.f445233a) != 0) {
            zf0.v0.G(v0Var, hVar, i28);
            return f0Var;
        }
        vf0.j1 j1Var = h3Var.f517715i;
        if (j1Var != null && (i27 = j1Var.f517730a) != 0) {
            zf0.v0.G(v0Var, hVar, i27);
            return f0Var;
        }
        vf0.k3 k3Var = h3Var.f517716j;
        qi3.i0 i0Var = k3Var.f517748a;
        if (i0Var != null && (i19 = i0Var.f445258a) != 0) {
            zf0.v0.G(v0Var, hVar, i19);
            return f0Var;
        }
        qi3.i0 i0Var2 = k3Var.f517749b;
        if (i0Var2 != null && (i18 = i0Var2.f445258a) != 0) {
            zf0.v0.G(v0Var, hVar, i18);
            return f0Var;
        }
        qi3.d0 d0Var = h3Var.f517717k;
        if (d0Var != null && (i17 = d0Var.f445216a) != 0) {
            zf0.v0.G(v0Var, hVar, i17);
            return f0Var;
        }
        if (d0Var == null) {
            k0Var.f445272a = -520006;
            return f0Var;
        }
        pt0.e0 e0Var = pt0.f0.f439742b1;
        java.lang.String m75945x2fec8307 = hVar != null ? hVar.m75945x2fec8307(hVar.f427150d + 3) : null;
        oi3.h hVar2 = v0Var.f554096i.f517711e;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(m75945x2fec8307, hVar2 != null ? hVar2.m75942xfb822ef2(hVar2.f427150d + 0) : 0L);
        if (k17 == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(v0Var.id());
            sb6.append(" updateMsg Fail msgInfo not exist msgId:");
            vf0.h3 h3Var2 = v0Var.f554096i;
            oi3.h hVar3 = h3Var2.f517711e;
            sb6.append(hVar3 != null ? new java.lang.Long(hVar3.m75942xfb822ef2(hVar3.f427150d + 0)) : null);
            sb6.append(" msgTalker:");
            oi3.h hVar4 = h3Var2.f517711e;
            sb6.append(hVar4 != null ? hVar4.m75945x2fec8307(hVar4.f427150d + 3) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoMsg.SendVideoTask", sb6.toString());
            k0Var.f445272a = -520002;
            return f0Var;
        }
        t21.v2 e17 = vf0.m3.e(hVar);
        if (e17 == null) {
            k0Var.f445272a = -520009;
            return f0Var;
        }
        t21.v2 f17 = vf0.m3.f(hVar);
        if (d0Var.f445218c != 0 || d0Var.f445219d != 0) {
            int i29 = qi3.y.f445295e1;
            com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(k17.m124847x74d37ac6(), k17.Q0());
            int i37 = d0Var.f445218c;
            int i38 = d0Var.f445219d;
            java.lang.String str = d0Var.f445220e;
            ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).getClass();
            java.util.HashMap T6 = hm.f.f363681i.a().T6();
            java.lang.String m66995x9616526c = c16564xb55e1d5.m66995x9616526c();
            java.lang.Object obj2 = T6.get(m66995x9616526c);
            if (obj2 == null) {
                obj2 = new pi3.a();
                T6.put(m66995x9616526c, obj2);
            }
            pi3.a aVar2 = (pi3.a) obj2;
            aVar2.o(i37);
            aVar2.l(i38);
            if (str == null) {
                str = "";
            }
            aVar2.n(str);
            k17.r1(5);
            e17.f496544i = nd1.d1.f72919x366c91de;
            if (f17 != null) {
                f17.f496544i = nd1.d1.f72919x366c91de;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.SendVideoTask", v0Var.id() + " updateMsg error MsgId:" + k17.m124847x74d37ac6() + " resp:" + d0Var);
        } else if (d0Var.f445222g != null) {
            v0Var.f554096i.f517712f.p(null);
            r45.ny3 ny3Var = d0Var.f445222g;
            boolean z17 = ny3Var instanceof r45.yu6;
            vf0.h3 h3Var3 = v0Var.f554096i;
            if (z17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(ny3Var, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.UploadVideoResponse");
                r45.yu6 yu6Var = (r45.yu6) ny3Var;
                c01.ia.P(k17, yu6Var.f472913m, false);
                k17.r1(2);
                k17.o1(yu6Var.f472911h);
                k17.d1(h3Var3.f517712f.m126747x696739c());
                e17.f496537c = yu6Var.f472911h;
                e17.f496558w = h3Var3.f517712f.m126747x696739c();
                e17.f496544i = 199;
                if (f17 != null) {
                    f17.f496537c = yu6Var.f472911h;
                    f17.f496558w = h3Var3.f517712f.m126747x696739c();
                    f17.f496544i = 199;
                }
                k0Var.f445273b.put("send_msg_svr_id", new java.lang.Long(yu6Var.f472911h));
                k0Var.f445273b.put("send_msg_svr_id", new java.lang.Long(yu6Var.f472911h));
            } else if (ny3Var instanceof r45.rr) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(ny3Var, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BypSendResponse");
                r45.rr rrVar = (r45.rr) ny3Var;
                k17.r1(2);
                k17.o1(rrVar.f466663d);
                k17.d1(h3Var3.f517712f.m126747x696739c());
                e17.f496537c = rrVar.f466663d;
                e17.f496558w = h3Var3.f517712f.m126747x696739c();
                e17.f496544i = 199;
                k0Var.f445273b.put("send_msg_svr_id", new java.lang.Long(rrVar.f466663d));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.SendVideoTask", v0Var.id() + " sendBypCgi updateMsg svrId:" + rrVar.f466663d);
                k0Var.f445273b.put("send_msg_svr_id", new java.lang.Long(rrVar.f466663d));
            } else {
                k17.r1(5);
                e17.f496544i = nd1.d1.f72919x366c91de;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.SendVideoTask", v0Var.id() + " updateMsg Fail resp not exist MsgId:" + k17.m124847x74d37ac6() + " SvrId: " + k17.I0());
            }
        }
        int lb6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2.class)).cj().lb(k17.m124847x74d37ac6(), k17, true);
        if (lb6 < 0) {
            k0Var.f445273b.put("update_msg_ret", new java.lang.Integer(lb6));
        }
        ((com.p314xaae8f345.mm.p793x2f25ba7b.a) ((v90.u) i95.n0.c(v90.u.class))).wi(k17);
        e17.U = -1;
        vf0.m3.k(e17);
        if (f17 != null) {
            f17.U = -1;
            vf0.m3.k(f17);
        }
        return f0Var;
    }
}
