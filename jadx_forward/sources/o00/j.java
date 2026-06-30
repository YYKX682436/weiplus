package o00;

/* loaded from: classes9.dex */
public final class j implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p724x306930.ui.ActivityC10526x6bc25cfc f423398a;

    public j(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p724x306930.ui.ActivityC10526x6bc25cfc activityC10526x6bc25cfc) {
        this.f423398a = activityC10526x6bc25cfc;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsGiftSendThanksLogicUI", "getPresentUserAttr errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.wechat.aff.proto.MmecGetPresentUserAttrResp");
        bw5.df0 df0Var = (bw5.df0) fVar;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p724x306930.ui.ActivityC10526x6bc25cfc activityC10526x6bc25cfc = this.f423398a;
        if (i18 != 0 || i17 != 0) {
            int i19 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p724x306930.ui.ActivityC10526x6bc25cfc.f147150h;
            activityC10526x6bc25cfc.P6();
        } else {
            if (df0Var.mo11484xe92ab0a8().f458492d == 0) {
                activityC10526x6bc25cfc.f147151e.mo7808x76db6cb1(df0Var);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsGiftSendThanksLogicUI", "getPresentUserAttr resp error: " + df0Var.mo11484xe92ab0a8().f458492d);
            int i27 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p724x306930.ui.ActivityC10526x6bc25cfc.f147150h;
            activityC10526x6bc25cfc.P6();
        }
    }
}
