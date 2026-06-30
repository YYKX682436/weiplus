package v31;

/* loaded from: classes7.dex */
public final class d extends gb1.d {

    /* renamed from: CTRL_INDEX */
    public static final int f77243x366c91de = 1398;

    /* renamed from: NAME */
    public static final java.lang.String f77244x24728b = "insertMiniProgramPlayableViewNew";

    @Override // gb1.d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component, org.json.JSONObject data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicNewPlayable.JsApiInsertMiniProgramPlayableView", "invoke");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) component).mo32091x9a3f0ba2().N.a(v31.b.f514619d);
        B(component, data, i17, component.getF229341e());
    }

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return data.optInt("viewId");
    }

    @Override // gb1.d
    public android.view.View K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t component, org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicNewPlayable.JsApiInsertMiniProgramPlayableView", "inflateView");
        android.content.Context f229340d = component.getF229340d();
        android.content.Context f229340d2 = component.getF229340d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f229340d2, "getContext(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505(f229340d, new com.p314xaae8f345.mm.p615xea909fb1.p616x60b7c31.C4973xdc3db786(f229340d2, null, 0, 6, null));
    }

    @Override // gb1.d
    public void N(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t component, int i17, android.view.View view, org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicNewPlayable.JsApiInsertMiniProgramPlayableView", "onInsertView viewId:" + i17);
        com.p314xaae8f345.mm.p615xea909fb1.p616x60b7c31.C4973xdc3db786 c4973xdc3db786 = (com.p314xaae8f345.mm.p615xea909fb1.p616x60b7c31.C4973xdc3db786) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(com.p314xaae8f345.mm.p615xea909fb1.p616x60b7c31.C4973xdc3db786.class);
        if (c4973xdc3db786 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicNewPlayable.JsApiInsertMiniProgramPlayableView", "onInsertView playableContainerView fail");
            x31.b[] bVarArr = x31.b.f533132d;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("action", 2);
            hashMap.put("status", "");
            hashMap.put("extra", "");
            java.lang.String gVar = new cl0.g(hashMap).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 v37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) component).v3();
            w31.a aVar = new w31.a();
            aVar.f163907f = gVar;
            v37.p(aVar);
            return;
        }
        ((a41.k) ((a41.i) i95.n0.c(a41.i.class))).Di(c4973xdc3db786, new v31.c(component));
        boolean optBoolean = data.optBoolean("mute");
        java.lang.String optString = data.optString("extra");
        ((a41.k) ((a41.i) i95.n0.c(a41.i.class))).Bi(optBoolean);
        a41.k kVar = (a41.k) ((a41.i) i95.n0.c(a41.i.class));
        kVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicNewPlayableFeatureService", "setManualPauseStatus");
        y31.f fVar = kVar.f82722d;
        if (fVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "setManualPauseStatus");
            fVar.f540700h = true;
        }
        a41.i iVar = (a41.i) i95.n0.c(a41.i.class);
        com.p314xaae8f345.mm.p972xa642c151.mb.p973x60b7c31.p974xb1584af1.C11191xe67ddda0 c11191xe67ddda0 = new com.p314xaae8f345.mm.p972xa642c151.mb.p973x60b7c31.p974xb1584af1.C11191xe67ddda0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        cl0.g gVar2 = new cl0.g();
        gVar2.h("eventName", "injectJsFiles");
        gVar2.h(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, optString);
        java.lang.String gVar3 = gVar2.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar3, "toString(...)");
        ((a41.k) iVar).Ai(c11191xe67ddda0.f229414d, gVar3);
    }
}
