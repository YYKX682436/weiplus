package qh1;

/* loaded from: classes9.dex */
public final class o extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public o() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        boolean z17;
        boolean z18;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5312x94e19bcc event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5312x94e19bcc) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        qh1.c cVar = qh1.c.f444952d;
        cVar.getClass();
        am.h4 h4Var = event.f135628g;
        java.lang.String Di = cVar.Di(h4Var.f88352a);
        boolean z19 = true;
        if (android.text.TextUtils.isEmpty(Di)) {
            z17 = false;
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p965xc41bc71e.p969x6b2e132.C11171xe3ef7b08(java.lang.System.nanoTime(), Di, 0), p31.e.class, p31.a.f432981d);
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DyeingTemplateMsgHandler", "[DyeingTemplateMsgHandler] handSubscribeMsgVoiceBroadcast done");
        } else {
            i50.m Ai = cVar.Ai(h4Var.f88352a, h4Var.f88353b);
            if (Ai != null) {
                ((h50.i) ((i50.o) i95.n0.c(i50.o.class))).Bi(Ai);
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DyeingTemplateMsgHandler", "[DyeingTemplateMsgHandler] handForceNotify done");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DyeingTemplateMsgHandler", "handle game force notify");
                i50.m Bi = cVar.Bi(h4Var.f88354c, h4Var.f88353b);
                if (Bi != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DyeingTemplateMsgHandler", "pre call force push service");
                    ((h50.i) ((i50.o) i95.n0.c(i50.o.class))).Bi(Bi);
                } else {
                    z19 = false;
                }
                if (z19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DyeingTemplateMsgHandler", "[DyeingTemplateMsgHandler] handGameForceNotify done");
                }
            }
        }
        return false;
    }
}
