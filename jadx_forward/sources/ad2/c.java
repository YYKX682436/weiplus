package ad2;

/* loaded from: classes2.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad2.h f84655d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ad2.h hVar) {
        super(0);
        this.f84655d = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        final ad2.h hVar = this.f84655d;
        return new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5476xff2a9b53>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.jumper.observer.FeedJumperObserver$descTopLeftStateEventListener$2$1
            {
                this.f39173x3fe91575 = -1003244733;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5476xff2a9b53 c5476xff2a9b53) {
                android.view.View view;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5476xff2a9b53 event = c5476xff2a9b53;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.lb lbVar = event.f135814g;
                if (lbVar != null) {
                    ad2.h hVar2 = ad2.h.this;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar2.k(), "[DescTopLeftStateEvent] showState:" + lbVar.f88768b + ", event feedId:" + pm0.v.u(lbVar.f88767a) + ", observer feedId:" + pm0.v.u(hVar2.f84678f));
                    if (lbVar.f88767a == hVar2.f84678f) {
                        int i17 = lbVar.f88768b;
                        xc2.u0[] u0VarArr = xc2.u0.f534841d;
                        boolean z17 = false;
                        if (i17 == 0) {
                            xc2.p0 p0Var = hVar2.f84680h;
                            if (p0Var != null && p0Var.f534789r == 15) {
                                z17 = true;
                            }
                            if (z17) {
                                hVar2.t();
                            }
                        } else if (i17 == 1) {
                            xc2.p0 p0Var2 = hVar2.f84680h;
                            if (p0Var2 != null && p0Var2.f534789r == 1) {
                                z17 = true;
                            }
                            if (z17 && (view = hVar2.f84676d) != null) {
                                hVar2.f(250L, view, true, hVar2.f84688s);
                            }
                        }
                    }
                }
                return true;
            }
        };
    }
}
