package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9;

/* loaded from: classes9.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f165416d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f165417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.C12290x66551320 f165418f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f165419g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.C12290x66551320 c12290x66551320, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f165418f = c12290x66551320;
        this.f165419g = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.f(this.f165418f, this.f165419g, interfaceC29045xdcb5ca57);
        fVar.f165417e = obj;
        return fVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        byte[] wi6;
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f165416d;
        java.lang.String str2 = null;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f165417e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.C12290x66551320 args = this.f165418f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(args, "$args");
            this.f165417e = y0Var;
            this.f165416d = 1;
            if (((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ri()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandHTMLWebView.EmojiFetcher.MMLogic", "load with args:" + args + ", invalid state, emojiMgr is NULL");
                obj = null;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Ni = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ni(args.f165398d);
                h0Var.f391656d = Ni;
                if (Ni == null) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class))).getClass();
                    com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
                    c21053xdbf1e5f4.f68671x4b6e68b9 = args.f165398d;
                    c21053xdbf1e5f4.f68663x861009b5 = args.f165401g;
                    c21053xdbf1e5f4.f68659x5efe714f = args.f165399e;
                    c21053xdbf1e5f4.f68642xf11e6e15 = args.f165400f;
                    c21053xdbf1e5f4.f68653x95b20dd4 = 65;
                    c21053xdbf1e5f4.f68657xb76d85ab = args.f165402h;
                    c21053xdbf1e5f4.f68685x2261e7f9 = 1;
                    h0Var.f391656d = c21053xdbf1e5f4;
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class))).wi((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d);
                }
                java.lang.Object obj2 = h0Var.f391656d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                if (((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) obj2).Q1()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHTMLWebView.EmojiFetcher.MMLogic", "load with args:" + args + ", return cached info");
                    obj = (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d;
                } else {
                    p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
                    rVar.k();
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.m0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5.class))).wi((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.e(args, rVar, h0Var));
                    obj = rVar.j();
                }
            }
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) obj;
        if (interfaceC4987x84e327cb == null) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar2 = this.f165419g;
            if (rVar2 != null) {
                rVar2.a(null);
            }
            return jz5.f0.f384359a;
        }
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ri()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandHTMLWebView.EmojiFetcher.MMLogic", "decode with md5:" + interfaceC4987x84e327cb.mo42933xb5885648() + ", invalid state, emojiMgr is NULL");
            wi6 = null;
        } else {
            wi6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).wi(interfaceC4987x84e327cb);
        }
        if (wi6 != null) {
            if (!(wi6.length == 0)) {
                synchronized (lp0.b.class) {
                    str = lp0.b.e() + "appbrand/emojicache/";
                }
                java.lang.String str3 = str + interfaceC4987x84e327cb.mo42933xb5885648() + ".data";
                try {
                    com.p314xaae8f345.mm.vfs.w6.u(str);
                    com.p314xaae8f345.mm.vfs.w6.S(str3, wi6, 0, wi6.length);
                    str2 = str3;
                } catch (java.io.IOException unused) {
                }
                com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar3 = this.f165419g;
                if (rVar3 != null) {
                    rVar3.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str2));
                }
                return jz5.f0.f384359a;
            }
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar4 = this.f165419g;
        if (rVar4 != null) {
            rVar4.a(null);
        }
        return jz5.f0.f384359a;
    }
}
