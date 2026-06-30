package al4;

/* loaded from: classes11.dex */
public final class c extends com.tencent.unit_rc.BaseObject implements jm4.g2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f5859d = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.ting.floatball.TingMinimizeManagerJava$floatballEventListener$1 f5860e;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.ting.floatball.TingMinimizeManagerJava$floatballEventListener$1] */
    public c() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f5860e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TingFloatBallAddedChangedEvent>(a0Var) { // from class: com.tencent.mm.plugin.ting.floatball.TingMinimizeManagerJava$floatballEventListener$1
            {
                this.__eventId = 1371600873;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.TingFloatBallAddedChangedEvent tingFloatBallAddedChangedEvent) {
                com.tencent.mm.autogen.events.TingFloatBallAddedChangedEvent event = tingFloatBallAddedChangedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.util.Iterator it = al4.c.this.f5859d.iterator();
                while (it.hasNext()) {
                    jm4.e2 e2Var = (jm4.e2) it.next();
                    urgen.ur_0025.UR_EEA5.UR_DF9F(((jm4.f2) e2Var).getCppPointer(), event.f54896g.f6293a);
                }
                return false;
            }
        };
    }
}
