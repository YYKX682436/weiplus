package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class j7 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f160002a;

    public j7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f160002a = o6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0
    public void a(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11911xbdcd860) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11911xbdcd860) obj).f160020d) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "locationBackgroundStateChanged, not listening, appId[%s]", this.f160002a.f156336n);
            this.f160002a.N.f506965a.s(u81.u.ON_STOP_BACKGROUND_LOCATION_LISTENING, null);
            return;
        }
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.C12429xdd32d5a3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "onCustomDataNotify, appId[%s], WxaAppMsgChannel msg", this.f160002a.f156336n);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1097x95a79262.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1097x95a79262.h();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0 = this.f160002a.C0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.C12429xdd32d5a3 c12429xdd32d5a3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.C12429xdd32d5a3) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.onReceiveMsgChannelJsApiEvent", "dispatch msg channel to web ， msgContent:%s", c12429xdd32d5a3.f167546i);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("msgId", c12429xdd32d5a3.f167541d);
            hashMap.put("sendTime", java.lang.Long.valueOf(c12429xdd32d5a3.f167547m));
            hashMap.put("msgType", java.lang.Integer.valueOf(c12429xdd32d5a3.f167545h));
            hashMap.put("msgContent", c12429xdd32d5a3.f167546i);
            hVar.u(C0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.onReceiveMsgChannelJsApiEvent", "dispatch wxa msg channel");
            hVar.t(hashMap);
            hVar.m();
            return;
        }
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1103x5d6d1928.C12198xffa35265) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "onCustomDataNotify, appId[%s], AppBrandVoIP1v1FloatBallEvent msg", this.f160002a.f156336n);
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1103x5d6d1928.C12198xffa35265) obj).f164007d == 1) {
                md1.m1.b();
                return;
            }
            return;
        }
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.C12398x24351782) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "onCustomDataNotify appId[%s], receive LocationInfoData", this.f160002a.f156336n);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "isReported:%b", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.b.a(this.f160002a.f156336n)));
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.b.a(this.f160002a.f156336n)) {
                return;
            }
            java.lang.String str = this.f160002a.f156336n;
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.b.f167045b) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.b.f167044a.put(str, java.lang.Boolean.TRUE);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.b.c((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.C12398x24351782) obj, this.f160002a.u0().f128809v);
            return;
        }
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.C11869x56177d91) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "onCustomDataNotify, appId[%s], AppBrandContentFloatBallEvent msg", this.f160002a.f156336n);
            int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.C11869x56177d91) obj).f159591d;
            if (i17 == 1) {
                this.f160002a.N.f506965a.s(u81.u.ON_REMOVE_CONTENT_FLOAT_WINDOW, null);
            } else if (i17 == 2) {
                this.f160002a.N.f506965a.s(u81.u.ON_ADDED_CONTENT_FLOAT_WINDOW, null);
            }
        }
    }
}
