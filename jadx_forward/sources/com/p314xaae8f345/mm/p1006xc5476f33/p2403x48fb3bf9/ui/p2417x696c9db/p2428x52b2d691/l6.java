package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/l6;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenBizPublishImage$IPCBizPublishImageRet;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class l6 implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19442x1b70c93e> {
    public final l81.b1 a(org.json.JSONObject jSONObject) {
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = "wx0b2ec076ec39c786";
        b1Var.f398565k = jSONObject.has(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), 0) : 1018;
        b1Var.f398567l = jSONObject.optString("sceneNote");
        java.lang.String optString = jSONObject.optString("relativeURL");
        if (optString.length() == 0) {
            tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
            tk.v vVar = tk.w.f501411e;
            java.lang.String optString2 = jSONObject.optString("mpPublishAction");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
            optString = ((ox.g) oVar).ij(vVar.a(optString2));
        }
        b1Var.f398555f = optString;
        b1Var.f398551d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(jSONObject.optString("appVersion"), 0);
        b1Var.f398561i = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k6(jSONObject);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        c11812xa040dc98.f158855d = 2;
        c11812xa040dc98.f158858g = jSONObject.optString("privateExtraData");
        c11812xa040dc98.f158857f = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        c11812xa040dc98.f158856e = jSONObject.optString("sourceAppId");
        b1Var.f398574s = c11812xa040dc98;
        return b1Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r callback) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d data = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(data.f149939d);
            boolean optBoolean = jSONObject.optBoolean("useDraft", false);
            if (jSONObject.has("draftType") && jSONObject.has("draftScene")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBizPublishImage", "has draftType and draftScene");
                tk.a Bi = ((ox.z) ((tk.r) i95.n0.c(tk.r.class))).Bi(a(jSONObject));
                tk.s[] sVarArr = tk.s.f501403d;
                int optInt = jSONObject.optInt("bizType", 1);
                rm.b0 b0Var = (rm.b0) i95.n0.c(rm.b0.class);
                int optInt2 = jSONObject.optInt("draftType");
                java.lang.String optString = jSONObject.optString("draftScene");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
                optBoolean = ((ur1.s) b0Var).Bi(optInt2, optString, optInt, Bi.f501391b);
            }
            boolean z17 = optBoolean;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBizPublishImage", "invoke in MM process， useDraft: " + z17);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
            java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r2.f149185d;
            android.content.Context context = weakReference != null ? (android.app.Activity) weakReference.get() : null;
            if (context == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            ((ox.g) oVar).Zi(context, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.j6(callback, jSONObject, this, z17, context));
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenBizPublishImage", "parse json error");
            callback.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19442x1b70c93e(false, "parse json error", new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d("")));
        }
    }
}
