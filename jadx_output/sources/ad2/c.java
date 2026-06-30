package ad2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad2.h f3122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ad2.h hVar) {
        super(0);
        this.f3122d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        final ad2.h hVar = this.f3122d;
        return new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderJumperDescTopLeftStateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.jumper.observer.FeedJumperObserver$descTopLeftStateEventListener$2$1
            {
                this.__eventId = -1003244733;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderJumperDescTopLeftStateEvent finderJumperDescTopLeftStateEvent) {
                android.view.View view;
                com.tencent.mm.autogen.events.FinderJumperDescTopLeftStateEvent event = finderJumperDescTopLeftStateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.lb lbVar = event.f54281g;
                if (lbVar != null) {
                    ad2.h hVar2 = ad2.h.this;
                    com.tencent.mars.xlog.Log.i(hVar2.k(), "[DescTopLeftStateEvent] showState:" + lbVar.f7235b + ", event feedId:" + pm0.v.u(lbVar.f7234a) + ", observer feedId:" + pm0.v.u(hVar2.f3145f));
                    if (lbVar.f7234a == hVar2.f3145f) {
                        int i17 = lbVar.f7235b;
                        xc2.u0[] u0VarArr = xc2.u0.f453308d;
                        boolean z17 = false;
                        if (i17 == 0) {
                            xc2.p0 p0Var = hVar2.f3147h;
                            if (p0Var != null && p0Var.f453256r == 15) {
                                z17 = true;
                            }
                            if (z17) {
                                hVar2.t();
                            }
                        } else if (i17 == 1) {
                            xc2.p0 p0Var2 = hVar2.f3147h;
                            if (p0Var2 != null && p0Var2.f453256r == 1) {
                                z17 = true;
                            }
                            if (z17 && (view = hVar2.f3143d) != null) {
                                hVar2.f(250L, view, true, hVar2.f3155s);
                            }
                        }
                    }
                }
                return true;
            }
        };
    }
}
