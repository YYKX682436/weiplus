package xg4;

/* loaded from: classes7.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg4.p f535985d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(xg4.p pVar) {
        super(0);
        this.f535985d = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        final xg4.p pVar = this.f535985d;
        return new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6272x44a4fad>(a0Var) { // from class: com.tencent.mm.plugin.surface.magiclivecard.mb.MagicLiveCardService$webViewUIDestroyEventEventListener$2$1
            {
                this.f39173x3fe91575 = -1681666147;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6272x44a4fad c6272x44a4fad) {
                hq0.e0 e0Var;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6272x44a4fad event = c6272x44a4fad;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SurfaceApp.MagicLiveCardService", "webview destroy!");
                for (java.util.Map.Entry entry : xg4.p.this.f364534p.entrySet()) {
                    if (entry != null && (e0Var = (hq0.e0) entry.getValue()) != null) {
                        e0Var.j();
                    }
                }
                return false;
            }
        };
    }
}
