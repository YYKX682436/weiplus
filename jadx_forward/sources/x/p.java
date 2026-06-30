package x;

/* loaded from: classes16.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f C;
    public final /* synthetic */ df2.lm D;
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p944x882e457a.f fVar, df2.lm lmVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(0);
        this.C = fVar;
        this.D = lmVar;
        this.E = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.E;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) h0Var.f391656d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        h0Var.f391656d = null;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.C;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            df2.lm lmVar = this.D;
            lmVar.Z6();
            db5.t7.h(lmVar.O6(), lmVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573106er));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ACCOUNT_LIVE_VISITOR_HONOR_RANK_SWITCH_ENABLE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            if2.b.Y6(lmVar, qo0.b.f446872d2, null, 2, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveHonorVisitorGuideController", "CgiFinderLiveModBasicInfo failed. errType=" + fVar.f152148a + " errCode=" + fVar.f152149b);
        }
        return jz5.f0.f384359a;
    }
}
