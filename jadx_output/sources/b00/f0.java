package b00;

/* loaded from: classes8.dex */
public final class f0 extends com.tencent.mm.sdk.event.n {
    public f0() {
        super(0);
    }

    public static final r45.f03 b(com.tencent.mm.autogen.events.FinderRedDotExpirationEvent finderRedDotExpirationEvent, java.lang.String str, java.lang.String str2) {
        r45.f03 I0 = finderRedDotExpirationEvent.f54319g.f8453a.I0(str);
        if (I0 != null) {
            c00.b4 b4Var = (c00.b4) i95.n0.c(c00.b4.class);
            c00.a4 a4Var = c00.a4.f36952g;
            am.yc ycVar = finderRedDotExpirationEvent.f54319g;
            r45.vs2 field_ctrInfo = ycVar.f8453a.field_ctrInfo;
            kotlin.jvm.internal.o.f(field_ctrInfo, "field_ctrInfo");
            ((b00.q2) b4Var).Ai(a4Var, str2, field_ctrInfo, I0, ycVar.f8453a.field_time);
        }
        return I0;
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.FinderRedDotExpirationEvent event = (com.tencent.mm.autogen.events.FinderRedDotExpirationEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        int i17 = event.f54319g.f8453a.field_ctrType;
        if (i17 >= 700000 && i17 < 799999) {
            r45.f03 b17 = b(event, "Card.Entrance.Left", "order_card_reddot");
            r45.f03 b18 = b(event, "Card.Entrance.Right", "order_card_reddot");
            r45.f03 b19 = b(event, "MyTab", "me_reddot");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handlerEcsRedDotExpiredEventListener myTabShowInfo:");
            sb6.append(b19 != null);
            sb6.append(" leftShowInfo:");
            sb6.append(b17 != null);
            sb6.append(",rightShowInfo:");
            sb6.append(b18 != null);
            sb6.append(' ');
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsRedDotExpiredEventListener", sb6.toString());
        }
        return false;
    }
}
