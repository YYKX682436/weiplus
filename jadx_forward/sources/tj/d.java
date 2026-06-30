package tj;

/* loaded from: classes7.dex */
public final class d extends gb1.d {

    /* renamed from: CTRL_INDEX */
    public static final int f76812x366c91de = 1194;

    /* renamed from: NAME */
    public static final java.lang.String f76813x24728b = "insertMiniProgramPlayableView";

    @Override // gb1.d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component, org.json.JSONObject data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPlayable.JsApiInsertMiniProgramPlayableView", "invoke");
        java.lang.String optString = data.optString("appId");
        java.lang.String optString2 = data.optString("moduleName");
        boolean z17 = false;
        if (!(optString == null || optString.length() == 0)) {
            if (!(optString2 == null || optString2.length() == 0)) {
                int optInt = data.optInt("versionType");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPlayable.JsApiInsertMiniProgramPlayableView", "appId:" + optString + " moduleName:" + optString2 + " versionType:" + optInt);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                uj.k kVar = uj.k.f509694a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicPlayablePkgRecordMgr", "setWxaPkgInfo appId:" + optString + " moduleName:" + optString2 + " versionType:" + optInt + '!');
                kVar.a().D("AppID", optString);
                kVar.a().D("ModuleName", optString2);
                kVar.a().A("VersionType", optInt);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 b17 = kVar.b();
                if (b17 != null && com.p314xaae8f345.mm.vfs.w6.j(b17.f67183x55b471cc)) {
                    z17 = true;
                }
                if (!z17) {
                    component.a(i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(this, 2, "fail:insert view failed pkg not exist", null));
                    return;
                } else {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) component).mo32091x9a3f0ba2().N.a(tj.b.f501206d);
                    B(component, data, i17, component.getF229341e());
                    return;
                }
            }
        }
        component.a(i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(this, 1, "fail:insert view failed appId or moduleName null!", null));
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPlayable.JsApiInsertMiniProgramPlayableView", "inflateView");
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPlayable.JsApiInsertMiniProgramPlayableView", "onInsertView viewId:" + i17);
        com.p314xaae8f345.mm.p615xea909fb1.p616x60b7c31.C4973xdc3db786 c4973xdc3db786 = (com.p314xaae8f345.mm.p615xea909fb1.p616x60b7c31.C4973xdc3db786) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(com.p314xaae8f345.mm.p615xea909fb1.p616x60b7c31.C4973xdc3db786.class);
        if (c4973xdc3db786 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicPlayable.JsApiInsertMiniProgramPlayableView", "onInsertView playableContainerView fail");
            x31.b[] bVarArr = x31.b.f533132d;
            java.lang.String P = P(2, "");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 v37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) component).v3();
            tj.e eVar = new tj.e();
            eVar.f163907f = P;
            v37.p(eVar);
            return;
        }
        tj.c cVar = new tj.c(this, component);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicPlayableMgr", "startPlayableService");
        uj.p pVar = new uj.p();
        uj.f.f509686b = pVar;
        pVar.f509705g = cVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicPlayableService", "setContainerView");
        pVar.f509703e = c4973xdc3db786;
        bf3.p pVar2 = pVar.f509707i;
        if (pVar2 != null) {
            pVar2.a(c4973xdc3db786);
        }
        android.content.Context context = c4973xdc3db786.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p615xea909fb1.p616x60b7c31.C4973xdc3db786 c4973xdc3db7862 = new com.p314xaae8f345.mm.p615xea909fb1.p616x60b7c31.C4973xdc3db786(context, null, 0, 6, null);
        pVar.f509704f = c4973xdc3db7862;
        c4973xdc3db7862.setLayoutParams(c4973xdc3db786.getLayoutParams());
        c4973xdc3db786.addView(pVar.f509704f);
        uj.p pVar3 = uj.f.f509686b;
        if (pVar3 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicPlayableService", "start");
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4 d4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4.class);
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            bf3.p Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m5) d4Var).Di(context2);
            pVar3.f509707i = Di;
            jc3.j0 wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.b6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p4.class))).wi("MagicAdPlayable");
            rc3.w0 w0Var = (rc3.w0) wi6;
            w0Var.w(pVar3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b(null, null, null, null, false, false, false, null, false, null, 1023, null);
            c16416x87606a7b.f229367x = pVar3;
            c16416x87606a7b.f229361r = pVar3;
            c16416x87606a7b.f229364u = Di;
            c16416x87606a7b.f229366w = true;
            c16416x87606a7b.f229365v = ((je3.i) i95.n0.c(je3.i.class)).Ii(0.1f);
            c16416x87606a7b.a(pVar3.f509708m);
            c16416x87606a7b.f229354h = z65.c.a();
            w0Var.W(c16416x87606a7b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicPlayableService", "MagicBrush setUp");
            pVar3.f509702d = wi6;
            uj.m mVar = uj.m.f509698a;
            java.lang.String sessionId = java.lang.String.valueOf(pVar3.hashCode());
            synchronized (mVar) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
                uj.l lVar = new uj.l(0L, 0L, 3, null);
                lVar.f509696a = java.lang.System.currentTimeMillis();
                uj.m.f509699b.put(sessionId, lVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicPlayableReporter", "markInitTime sessionId:" + sessionId + " initTime:" + lVar.f509696a);
                i95.m c17 = i95.n0.c(je3.i.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                je3.i.La((je3.i) c17, sessionId, "MagicPlayable", "", com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16454xc40f4d3c.f37603x4c7d442, 0L, null, null, 96, null);
            }
        }
    }

    public final java.lang.String P(int i17, java.lang.String status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("action", java.lang.Integer.valueOf(i17));
        hashMap.put("status", status);
        java.lang.String gVar = new cl0.g(hashMap).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
        return gVar;
    }
}
