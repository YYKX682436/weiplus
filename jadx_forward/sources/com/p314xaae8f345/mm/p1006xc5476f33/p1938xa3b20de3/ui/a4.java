package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public final class a4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.b4 f234116d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.b4 b4Var) {
        super(1);
        this.f234116d = b4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.b4 b4Var = this.f234116d;
        b4Var.f234124a.mo48627xce38d9a();
        if (fVar == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEnableUIC", "enable token response: " + fVar.f152148a + ", " + fVar.f152149b + ", " + ((r45.dy4) fVar.f152151d).f454386d);
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19111xd5a60886 activityC19111xd5a60886 = b4Var.f234124a;
        if (i17 != 0 || fVar.f152149b != 0) {
            db5.e1.y(activityC19111xd5a60886, activityC19111xd5a60886.getString(com.p314xaae8f345.mm.R.C30867xcad56011.krl), "", activityC19111xd5a60886.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571988vj), new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.z3(b4Var));
            activityC19111xd5a60886.f261511g.a();
            return null;
        }
        r45.dy4 dy4Var = (r45.dy4) fVar.f152151d;
        int i18 = dy4Var.f454386d;
        if (i18 == 0) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_ENABLECODEPAGE_STRING_SYNC, "");
            activityC19111xd5a60886.setResult(-1);
            activityC19111xd5a60886.finish();
            return null;
        }
        if (np5.t.a(activityC19111xd5a60886, fVar.f152152e, 1000, i18, dy4Var.f454387e) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.dy4) fVar.f152151d).f454387e)) {
            return null;
        }
        db5.e1.t(activityC19111xd5a60886, ((r45.dy4) fVar.f152151d).f454387e, "", new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.y3(b4Var));
        return null;
    }
}
