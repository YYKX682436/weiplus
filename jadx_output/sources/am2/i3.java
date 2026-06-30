package am2;

/* loaded from: classes3.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final am2.i3 f8697d = new am2.i3();

    public i3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        return new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiveConfigClickEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.utils.fake.LiveConfigDebug$configEventListener$2$1
            {
                this.__eventId = -313050608;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiveConfigClickEvent liveConfigClickEvent) {
                dk2.g0 g0Var;
                mm2.x4 x4Var;
                df2.cy cyVar;
                df2.cy cyVar2;
                df2.cy cyVar3;
                com.tencent.mm.autogen.events.LiveConfigClickEvent event = liveConfigClickEvent;
                kotlin.jvm.internal.o.g(event, "event");
                kotlinx.coroutines.flow.j2 j2Var = null;
                am.vi viVar = event.f54472g;
                java.lang.Integer valueOf = viVar != null ? java.lang.Integer.valueOf(viVar.f8197a) : null;
                if (valueOf != null && valueOf.intValue() == 3) {
                    com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
                    if (liveRoomControllerStore != null && (cyVar3 = (df2.cy) liveRoomControllerStore.controller(df2.cy.class)) != null) {
                        r45.u12 u12Var = new r45.u12();
                        u12Var.f386927d = 0;
                        u12Var.f386929f = "安全打击toast title";
                        u12Var.f386930g = "安全打击toast content";
                        u12Var.f386935o = "安全打击toast short_content";
                        u12Var.f386931h = "btn_title";
                        cyVar3.e7(u12Var);
                    }
                } else if (valueOf != null && valueOf.intValue() == 2) {
                    com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore2 = dk2.ef.f233371J;
                    if (liveRoomControllerStore2 != null && (cyVar2 = (df2.cy) liveRoomControllerStore2.controller(df2.cy.class)) != null) {
                        cyVar2.a7();
                    }
                } else if (valueOf != null && valueOf.intValue() == 1) {
                    com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore3 = dk2.ef.f233371J;
                    if (liveRoomControllerStore3 != null && (cyVar = (df2.cy) liveRoomControllerStore3.controller(df2.cy.class)) != null) {
                        cyVar.b7();
                    }
                } else if (valueOf != null && valueOf.intValue() == 4) {
                    com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore4 = dk2.ef.f233371J;
                    if (liveRoomControllerStore4 != null && (x4Var = (mm2.x4) liveRoomControllerStore4.business(mm2.x4.class)) != null) {
                        j2Var = x4Var.A;
                    }
                    if (j2Var != null) {
                        r45.nh1 nh1Var = new r45.nh1();
                        nh1Var.set(0, 2);
                        ((kotlinx.coroutines.flow.h3) j2Var).k(nh1Var);
                    }
                } else if (valueOf != null && valueOf.intValue() == 5 && (g0Var = dk2.ef.f233394l) != null) {
                    g0Var.g();
                }
                return true;
            }
        };
    }
}
