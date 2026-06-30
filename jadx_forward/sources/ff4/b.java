package ff4;

/* loaded from: classes4.dex */
public final class b extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.ke6 f343194d;

    /* renamed from: e, reason: collision with root package name */
    public final gf4.a f343195e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f343196f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f343197g;

    public b(java.lang.String clientId, r45.ke6 commentDetail, java.lang.String str, gf4.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientId, "clientId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentDetail, "commentDetail");
        this.f343194d = commentDetail;
        this.f343195e = aVar;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.me6();
        lVar.f152198b = new r45.ne6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmstorycomment";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.m.f34560x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f343196f = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryCommentRequest");
        r45.me6 me6Var = (r45.me6) fVar;
        me6Var.f461959d = clientId;
        me6Var.f461960e = commentDetail;
        mf4.d dVar = mf4.d.f407693a;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6936x5d31fefc c6936x5d31fefc = mf4.d.f407696d;
        me6Var.f461962g = (int) c6936x5d31fefc.f142452e;
        me6Var.f461963h = (int) c6936x5d31fefc.f142453f;
        me6Var.f461964i = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCgi.NetSceneStoryComment", "ClientId " + me6Var.f461959d + " PreviewEnterScene " + me6Var.f461962g + " sessionID: " + me6Var.f461964i + ' ');
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f343197g = callback;
        return mo9409x10f9447a(dispatcher, this.f343196f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.m.f34560x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCgi.NetSceneStoryComment", "netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str);
        r45.ke6 ke6Var = this.f343194d;
        if (i18 == 0 && i19 == 0) {
            java.lang.String str2 = ke6Var.f460168m;
            if (str2 == null || str2.length() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(994L, 6L, 1L);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(994L, 5L, 1L);
            }
        } else {
            java.lang.String str3 = ke6Var.f460168m;
            if (str3 == null || str3.length() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.C(994L, 8L, 1L);
                if (i18 == 4) {
                    g0Var.C(994L, 10L, 1L);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var2.C(994L, 7L, 1L);
                if (i18 == 4) {
                    g0Var2.C(994L, 9L, 1L);
                }
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f343197g;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
            throw null;
        }
    }
}
