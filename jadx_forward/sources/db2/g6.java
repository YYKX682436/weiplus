package db2;

/* loaded from: classes.dex */
public final class g6 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309527g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309528h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(java.lang.String anchorUserName, java.lang.String noticeId) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUserName, "anchorUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivenoticeqrcode";
        lVar.f152200d = 4214;
        r45.k32 k32Var = new r45.k32();
        k32Var.set(2, anchorUserName);
        k32Var.set(3, noticeId);
        te2.sc scVar = te2.sc.f499945a;
        k32Var.set(4, java.lang.Integer.valueOf(te2.sc.f499946b));
        k32Var.set(1, db2.t4.f309704a.a(4214));
        r45.l32 l32Var = new r45.l32();
        lVar.f152197a = k32Var;
        lVar.f152198b = l32Var;
        this.f309527g = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneGetLiveNoticeQrCode", "NetSceneGetLiveNoticeQrCode init userName:" + anchorUserName + ", noticeId:" + noticeId + ' ');
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneGetLiveNoticeQrCode", "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        r45.t52 t52Var = (r45.t52) K().m75936x14adae67(7);
        if (t52Var != null) {
            te2.sc.f499945a.c(t52Var.m75939xb282bd08(2), t52Var.m75933x41a8a7f2(1), t52Var.m75941xfb821914(0));
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309528h;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    public final r45.l32 K() {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f309527g;
        if (oVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rr");
            throw null;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveNoticeQRCodeResponse");
        return (r45.l32) fVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309528h = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f309527g;
        if (oVar != null) {
            return mo9409x10f9447a(sVar, oVar, this);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rr");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4214;
    }
}
