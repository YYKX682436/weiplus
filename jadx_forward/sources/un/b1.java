package un;

/* loaded from: classes9.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f510771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ un.g1 f510772e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, un.g1 g1Var) {
        super(0);
        this.f510771d = activityC0065xcd7aa112;
        this.f510772e = g1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f510771d;
        final un.g1 g1Var = this.f510772e;
        return new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5887xfade37b>(activityC0065xcd7aa112) { // from class: com.tencent.mm.chatroom.ui.uic.SelectWxChatRoomAddMemberUIC$recordMsgNetSceneEventIListener$2$1
            {
                this.f39173x3fe91575 = 1734631819;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5887xfade37b c5887xfade37b) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5887xfade37b event = c5887xfade37b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.dq dqVar = event.f136195g;
                long j17 = dqVar.f88021a;
                if (j17 != 0) {
                    java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                    un.g1 g1Var2 = g1Var;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectWxChatRoomAddMemberUIC", "RecordMsgNetSceneEvent msgId:%s netSceneMsgId:%s isSucc:%s", valueOf, java.lang.Long.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) g1Var2.f510796n.first).f231013d), java.lang.Boolean.valueOf(dqVar.f88022b));
                    if (dqVar.f88021a == ((com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) g1Var2.f510796n.first).f231013d) {
                        if (dqVar.f88022b) {
                            g1Var2.Y6();
                        } else {
                            java.lang.String errMsg = dqVar.f88023c;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(errMsg, "errMsg");
                            g1Var2.W6(0, "send record error", errMsg);
                        }
                    }
                }
                return false;
            }
        };
    }
}
