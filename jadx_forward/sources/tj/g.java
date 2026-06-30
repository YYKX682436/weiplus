package tj;

/* loaded from: classes7.dex */
public final class g extends gb1.h {

    /* renamed from: CTRL_INDEX */
    public static final int f76818x366c91de = 1195;

    /* renamed from: NAME */
    public static final java.lang.String f76819x24728b = "updateMiniProgramPlayableView";

    @Override // gb1.h, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component, org.json.JSONObject data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPlayable.JsApiUpdateMiniProgramPlayableView", "invoke");
        if (data.has("resume") && data.optBoolean("resume", true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicPlayableMgr", "manualResume");
            uj.p pVar = uj.f.f509686b;
            if (pVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicPlayableService", "manualResume");
                if (pVar.f509706h) {
                    jc3.j0 j0Var = pVar.f509702d;
                    if (j0Var == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicBrush");
                        throw null;
                    }
                    ((rc3.w0) j0Var).A();
                    pVar.f509706h = false;
                }
            }
        }
        if (data.has("mute")) {
            boolean optBoolean = data.optBoolean("mute");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicPlayableMgr", "muteAudio mute:" + optBoolean);
            uj.p pVar2 = uj.f.f509686b;
            if (pVar2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicPlayableService", "muteAudio mute:" + optBoolean);
                jc3.j0 j0Var2 = pVar2.f509702d;
                if (j0Var2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicBrush");
                    throw null;
                }
                rc3.w0 w0Var = (rc3.w0) j0Var2;
                w0Var.M(new rc3.s0(w0Var, optBoolean));
            }
        }
        if (data.has("customEvent")) {
            java.lang.String optString = data.optString("customEvent");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicPlayableMgr", "sendCustomEvent:".concat(optString));
            uj.p pVar3 = uj.f.f509686b;
            if (pVar3 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicPlayableService", "sendCustomEvent event:".concat(optString));
                cl0.g gVar = new cl0.g();
                gVar.h(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, optString);
                java.lang.String gVar2 = gVar.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                jc3.j0 j0Var3 = pVar3.f509702d;
                if (j0Var3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicBrush");
                    throw null;
                }
                ((rc3.w0) j0Var3).k(new com.p314xaae8f345.mm.p615xea909fb1.p616x60b7c31.C4974xef4759bc().f229414d, gVar2);
            }
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        B(component, data, i17, component.getF229341e());
    }

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int i17 = data.getInt("viewId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPlayable.JsApiUpdateMiniProgramPlayableView", "viewId:" + i17);
        return i17;
    }

    @Override // gb1.h
    public boolean K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPlayable.JsApiUpdateMiniProgramPlayableView", "onUpdateView");
        return true;
    }
}
