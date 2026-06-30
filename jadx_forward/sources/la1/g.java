package la1;

/* loaded from: classes7.dex */
public final class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.i {

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f399030g;

    public g(android.util.SparseArray captureDelegateContainer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(captureDelegateContainer, "captureDelegateContainer");
        this.f399030g = captureDelegateContainer;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.i
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.e P() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.e.f165335d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.i
    public void Q(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b component, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        super.Q(component, i17);
        ce.g gVar = (ce.g) component.B1(ce.g.class);
        if (gVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiInsertWebRTCRendererView", "hy: manually notify first frame ready from webrtc view");
            ((ce.o) gVar).Y();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.i, gb1.d
    /* renamed from: R */
    public void N(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        super.N(bVar, i17, view, jSONObject);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(bVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.game.page.WAGamePageView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 U1 = ((pa1.o) bVar).U1();
        ae.q qVar = U1 != null ? (ae.q) U1.z1(ae.q.class) : null;
        if (qVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("JsApiInsertHTMLCanvasElement", "hy: mb extension not exists!");
            return;
        }
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad w17 = ((ae.a) qVar).w();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Boolean.TRUE, G(jSONObject))) {
            w17.f130123n.m34848xd78cd66a(la1.d.f399027d);
            if (!((java.lang.Boolean) ha1.q.f361317c.e()).booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiInsertWebRTCRendererView", "hy: use js thread choreographer");
                w17.u(gh.b.ChoreographerInJsThread);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiInsertWebRTCRendererView", "hy: use main thread choreographer");
            if (((java.lang.Boolean) ha1.s.f361319c.e()).booleanValue()) {
                w17.u(gh.b.NativeLocker);
            } else {
                w17.u(gh.b.ChoreographerInMainThread);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.i
    public void S(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar, org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c renderView, int i17) {
        ce.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderView, "renderView");
        if (bVar == null || (gVar = (ce.g) bVar.B1(ce.g.class)) == null) {
            return;
        }
        la1.e eVar = new la1.e(renderView);
        this.f399030g.put(i17, eVar);
        ((ce.o) gVar).f122229t.add(0, eVar);
    }
}
