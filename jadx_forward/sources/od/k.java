package od;

/* loaded from: classes8.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final od.l f426047a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f426048b;

    public k(od.l lVar) {
        this.f426047a = lVar;
        this.f426048b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("Js2JavaAsyncHandler_" + lVar.hashCode());
    }

    public java.lang.String a(java.lang.String str, boolean z17) {
        if (z17) {
            return b(str, true);
        }
        this.f426048b.mo50293x3498a0(new od.j(this, str));
        return "";
    }

    public final java.lang.String b(java.lang.String str, boolean z17) {
        od.i iVar;
        od.c cVar = null;
        try {
            iVar = new od.i(new org.json.JSONObject(str));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Js2JavaMessageQueue", "Message parse failed, ex = %s", e17.getMessage());
            iVar = null;
        }
        if (iVar == null) {
            return "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Js2JavaMessageQueue", "processImpl, jsMsg.type = %s", iVar.f426029a.name());
        int ordinal = iVar.f426029a.ordinal();
        if (ordinal == 1) {
            od.f fVar = this.f426047a.f426051c;
            synchronized (fVar) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Java2JsMessageQueue", "ready");
                fVar.f426036c = true;
                java.util.LinkedList linkedList = fVar.f426035b;
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    fVar.b((od.e) it.next());
                }
                linkedList.clear();
            }
        } else if (ordinal == 2) {
            od.l lVar = this.f426047a;
            lVar.getClass();
            try {
                od.g gVar = new od.g(lVar.f426051c, iVar, z17);
                java.lang.String str2 = gVar.f426038b;
                od.h hVar = (od.h) lVar.f426053e.get(str2);
                if (hVar != null) {
                    sd.h0 h0Var = (sd.h0) hVar;
                    sd.l0 l0Var = h0Var.f488137b;
                    l0Var.getClass();
                    sd.c cVar2 = h0Var.f488136a;
                    sd.i0 i0Var = new sd.i0(l0Var, cVar2, gVar);
                    td.c cVar3 = l0Var.f488152e;
                    if (cVar3 == null) {
                        cVar3 = td.c.f499116a;
                    }
                    cVar3.b(cVar2.b(), i0Var);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LuggageBridge", "Invoke Listener Not Found: %s", str2);
                    gVar.a("system:function_not_exist", null);
                }
                if (gVar.f426040d) {
                    cVar = new od.c(gVar.f426042f, gVar.f426041e, gVar.f426043g, gVar.f426044h, false);
                }
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LuggageBridge", "inflate Js2JavaInvokeContext failed: %s", e18);
            }
        } else if (ordinal == 3) {
            od.l lVar2 = this.f426047a;
            lVar2.getClass();
            try {
                org.json.JSONObject jSONObject = iVar.f426030b;
                jSONObject.getString(ya.b.f77491x8758c4e1);
                if (jSONObject.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306) == null) {
                    new org.json.JSONObject();
                }
                int optInt = jSONObject.optInt("callbackId", 0);
                jSONObject.optBoolean("keepCallback", false);
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(lVar2.f426055g.get(java.lang.Integer.valueOf(optInt)));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LuggageBridge", "no listener for callback: %d", java.lang.Integer.valueOf(optInt));
            } catch (org.json.JSONException e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LuggageBridge", "inflate Js2JavaEventContext failed: %s", e19);
            }
        } else if (ordinal == 4) {
            od.l lVar3 = this.f426047a;
            lVar3.getClass();
            try {
                org.json.JSONObject jSONObject2 = iVar.f426030b;
                java.lang.String string = jSONObject2.getString("event");
                if (jSONObject2.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306) == null) {
                    new org.json.JSONObject();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LuggageBridge", "processEventFromJs, EventName = %s", string);
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(lVar3.f426054f.get(string));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LuggageBridge", "no listener for event: %s", string);
            } catch (org.json.JSONException e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LuggageBridge", "inflate Js2JavaEventContext failed: %s", e27);
            }
        }
        if (cVar != null) {
            cVar.f426029a.name();
        }
        return cVar == null ? "" : cVar.m151054x9616526c();
    }
}
