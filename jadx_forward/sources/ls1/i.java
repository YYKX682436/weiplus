package ls1;

/* loaded from: classes7.dex */
public final /* synthetic */ class i extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.a {
    public i(java.lang.Object obj) {
        super(0, obj, ls1.e0.class, "updateData", "updateData()V", 0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        ls1.e0 e0Var = (ls1.e0) this.f72685xcfcbe9ef;
        e0Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        e0Var.V.a("onInjectStart", currentTimeMillis);
        java.lang.String B1 = e0Var.B1();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateData]data contentId:");
        java.lang.String str = e0Var.Y1;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentId");
            throw null;
        }
        sb6.append(str);
        sb6.append(" startLoadPage:");
        sb6.append(e0Var.Q1);
        sb6.append(" receivePageData:");
        sb6.append(e0Var.S1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(B1, sb6.toString());
        org.json.JSONObject put = new org.json.JSONObject().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "@param").put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, new org.json.JSONObject().put("startLoadPage", e0Var.Q1).put("receivePageData", e0Var.S1)).put("url", e0Var.i());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = e0Var.f263449a;
        org.json.JSONObject put2 = put.put("key", c22633x83752a59.m81403xce19f7b8());
        cy4.b bVar = cy4.b.f306392a;
        java.lang.String str2 = "";
        if (bVar.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPVideoPreviewDataMgr", "getOnReceiveNativeData");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 v3Var = cy4.b.f306394c;
            java.lang.String s17 = v3Var.s("MicroMsg.MPVideoPreviewDataMgr_prepareOnReceivePageData_vid", "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPVideoPreviewDataMgr", "getOnReceiveNativeData vid null");
            } else {
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) v3Var.i()).D("MicroMsg.MPVideoPreviewDataMgr_prepareOnReceivePageData_vid", "");
                java.util.Map b17 = bVar.b(s17);
                java.lang.Object obj2 = b17 != null ? b17.get("videoInitialSnapshot") : null;
                java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                if (str3 == null) {
                    str3 = "";
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPVideoPreviewDataMgr", "getOnReceiveNativeData snap null");
                } else {
                    if (b17 == null || (obj = b17.get("videoInitialTime")) == null) {
                        obj = 0;
                    }
                    jSONObject.put("videoInitialTime", obj);
                    jSONObject.put("videoInitialSnapshot", b17 != null ? b17.get("videoInitialSnapshot") : null);
                    str2 = ",window.onReceiveNativeData(" + jSONObject + ')';
                }
            }
        }
        java.lang.String jSONObject2 = put2.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String str4 = "[window.onReceivePageData(" + jSONObject2 + "),Date.now()" + str2 + "].join(',')";
        java.lang.String x17 = r26.i0.x(str4, "\"@param\"", e0Var.f402510c2, false, 4, null);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.g3 g3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175972e;
        java.lang.String str5 = e0Var.Y1;
        if (str5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentId");
            throw null;
        }
        com.p314xaae8f345.mm.vfs.r6 c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.c(g3Var, str5);
        if (c22633x83752a59.u(2008) && c17 != null) {
            java.lang.String w17 = r26.i0.w(str4, "\"@param\"", "@param", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e0Var.B1(), "onReceivePageData buff parse native:" + w17);
            com.p314xaae8f345.p3210x3857dc.y2 y2Var = new com.p314xaae8f345.p3210x3857dc.y2(0, 0, c22633x83752a59);
            y2Var.f302166c = w17;
            y2Var.f302165b = "string";
            y2Var.f302170g = c17.u();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(e0Var.f402508a2 + ".__log(JSON.stringify({err:window['___xweb_script_err']}));console.log('__log', {err:window['___xweb_script_err']});");
            sb7.append('\n');
            sb7.append(x17);
            y2Var.f302169f = sb7.toString();
            str4 = y2Var.m120528x9616526c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "toString(...)");
            c0Var.f391645d = true;
            ax4.a.d(120, java.lang.System.currentTimeMillis() - currentTimeMillis2);
        }
        if (!c0Var.f391645d) {
            str4 = "javascript:" + x17;
        }
        e0Var.L(str4, new ls1.c0(e0Var, currentTimeMillis, c0Var, currentTimeMillis2));
        return jz5.f0.f384359a;
    }
}
