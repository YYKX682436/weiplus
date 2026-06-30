package v31;

/* loaded from: classes7.dex */
public final class k extends gb1.h {

    /* renamed from: CTRL_INDEX */
    public static final int f77251x366c91de = 1399;

    /* renamed from: NAME */
    public static final java.lang.String f77252x24728b = "updateMiniProgramPlayableViewNew";

    @Override // gb1.h, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component, org.json.JSONObject data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicNewPlayable.JsApiUpdateMiniProgramPlayableViewNew", "invoke");
        if (data.has("resume") && data.optBoolean("resume", true)) {
            a41.k kVar = (a41.k) ((a41.i) i95.n0.c(a41.i.class));
            kVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicNewPlayableFeatureService", "manualResume");
            y31.f fVar = kVar.f82722d;
            if (fVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "manualResume manualPause:" + fVar.f540700h);
                if (fVar.f540700h) {
                    jc3.j0 j0Var = fVar.f540696d;
                    if (j0Var != null) {
                        ((rc3.w0) j0Var).A();
                    }
                    fVar.f540700h = false;
                }
            }
        }
        if (data.has("mute")) {
            ((a41.k) ((a41.i) i95.n0.c(a41.i.class))).Bi(data.optBoolean("mute"));
        }
        if (data.has("extra")) {
            java.lang.String optString = data.optString("extra");
            a41.i iVar = (a41.i) i95.n0.c(a41.i.class);
            com.p314xaae8f345.mm.p972xa642c151.mb.p973x60b7c31.p974xb1584af1.C11191xe67ddda0 c11191xe67ddda0 = new com.p314xaae8f345.mm.p972xa642c151.mb.p973x60b7c31.p974xb1584af1.C11191xe67ddda0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            cl0.g gVar = new cl0.g();
            gVar.h("eventName", "updateStatus");
            gVar.h(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, optString);
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            ((a41.k) iVar).Ai(c11191xe67ddda0.f229414d, gVar2);
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        B(component, data, i17, component.getF229341e());
    }

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int i17 = data.getInt("viewId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicNewPlayable.JsApiUpdateMiniProgramPlayableViewNew", "viewId:" + i17);
        return i17;
    }

    @Override // gb1.h
    public boolean K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicNewPlayable.JsApiUpdateMiniProgramPlayableViewNew", "onUpdateView");
        return true;
    }
}
