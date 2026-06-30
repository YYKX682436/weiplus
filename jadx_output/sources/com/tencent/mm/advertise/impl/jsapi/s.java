package com.tencent.mm.advertise.impl.jsapi;

/* loaded from: classes.dex */
public final class s implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.advertise.impl.jsapi.t f53178d;

    public s(com.tencent.mm.advertise.impl.jsapi.t tVar) {
        this.f53178d = tVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$AdPushMsgListWrapper mBJsApiGetAdPushMsg$AdPushMsgListWrapper = (com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$AdPushMsgListWrapper) obj;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        boolean z17 = mBJsApiGetAdPushMsg$AdPushMsgListWrapper.f53165e;
        com.tencent.mm.advertise.impl.jsapi.t tVar = this.f53178d;
        if (!z17) {
            tVar.s().invoke(tVar.i(lc3.x.f317936c));
            return;
        }
        for (com.tencent.mm.advertise.util.MagicAdPushMsg magicAdPushMsg : mBJsApiGetAdPushMsg$AdPushMsgListWrapper.f53164d) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("opcode", magicAdPushMsg.f53183d);
            jSONObject.put("aid", magicAdPushMsg.f53184e);
            jSONObject.put("slotid", magicAdPushMsg.f53185f);
            jSONObject.put("op_time", magicAdPushMsg.f53186g);
            jSONObject.put("traceid", magicAdPushMsg.f53187h);
            jSONArray.put(jSONObject);
        }
        yz5.l s17 = tVar.s();
        lc3.a0 a0Var = new lc3.a0();
        a0Var.put("msgData", jSONArray);
        tVar.m(a0Var);
        s17.invoke(a0Var);
    }
}
