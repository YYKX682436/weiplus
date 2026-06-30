package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/t7;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderSearchView$OpenFinderSearchViewTaskData;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
final class t7 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    public final java.util.List a(org.json.JSONArray jSONArray, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            int length = jSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                r45.lu2 lu2Var = new r45.lu2();
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                lu2Var.set(0, jSONObject.optString("hotword_text", ""));
                lu2Var.set(1, java.lang.Integer.valueOf(jSONObject.optInt("action_type", 0)));
                lu2Var.set(2, jSONObject.optString("link", ""));
                lu2Var.set(3, jSONObject.optString("appid", ""));
                lu2Var.set(4, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode(jSONObject.optString("session_buffer", ""), 0)));
                lu2Var.set(5, jSONObject.optString("reason_wording", ""));
                if (i18 == i17) {
                    lu2Var.m75945x2fec8307(0);
                }
                arrayList.add(lu2Var);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiOpenFinderSearchView", e17, "optHotWords", new java.lang.Object[0]);
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19448x629d8d62 c19448x629d8d62 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19448x629d8d62) obj;
        boolean z17 = false;
        try {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184147d;
            android.content.Context context = weakReference != null ? (android.app.Activity) weakReference.get() : null;
            if (context == null) {
                java.util.Set set = ((lf0.f0) ((pm4.u) i95.n0.c(pm4.u.class))).f399741d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(set);
                context = (android.app.Activity) kz5.n0.j0(set);
                if (context == null) {
                    context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                }
            }
            android.content.Context context2 = context;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenFinderSearchView", "OpenFinderSearchViewTask context:" + context2);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19448x629d8d62 != null ? c19448x629d8d62.f267433d : null)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(c19448x629d8d62 != null ? c19448x629d8d62.f267433d : null);
                int optInt = jSONObject.optInt("selectIndex");
                int optInt2 = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
                java.lang.String optString = jSONObject.optString("reportInfo");
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("allSearchWord");
                if (optJSONArray != null) {
                    java.util.List a17 = a(optJSONArray, optInt);
                    r45.lu2 lu2Var = (r45.lu2) (((((java.util.ArrayList) a17).isEmpty() ^ true) && ((java.util.ArrayList) a17).size() > optInt ? a17 : null) != null ? ((java.util.ArrayList) a17).get(optInt) : null);
                    if (lu2Var != null) {
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        ya2.e1 e1Var = ya2.e1.f542005a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                        e1Var.o(context2, lu2Var, optInt, a17, optInt2, optString);
                        z17 = true;
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiOpenFinderSearchView", e17, "OpenFinderPostViewTask exception", new java.lang.Object[0]);
        }
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(z17));
        }
    }
}
