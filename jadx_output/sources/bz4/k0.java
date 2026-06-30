package bz4;

/* loaded from: classes12.dex */
public class k0 extends com.tencent.mm.sdk.event.n {
    public k0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.OpenNoteFromSessionEvent openNoteFromSessionEvent = (com.tencent.mm.autogen.events.OpenNoteFromSessionEvent) iEvent;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenNoteFromSessionListener", "do OpenNoteFromSessionListener");
        r45.dq0 dq0Var = new r45.dq0();
        dq0Var.f372653d = openNoteFromSessionEvent.f54599g.f7910g;
        hz4.w wVar = new hz4.w();
        am.sn snVar = openNoteFromSessionEvent.f54599g;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("msgId", snVar.f7904a);
            jSONObject.put("talker", snVar.f7909f);
            java.lang.String str = snVar.f7905b;
            if (str == null) {
                str = "";
            }
            jSONObject.put("noteXmlStr", str);
            jSONObject.put("showShare", snVar.f7907d);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, snVar.f7910g);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Fav.NoteFloatBallHelper", e17, "eventToJson OpenNoteFromSessionEvent", new java.lang.Object[0]);
        }
        wVar.f286422p = jSONObject.toString();
        wVar.f286423q = 2;
        ((hz4.f) hz4.f.wi()).f286407d = wVar;
        hz4.u uVar = new hz4.u();
        am.sn snVar2 = openNoteFromSessionEvent.f54599g;
        uVar.f286455a = snVar2.f7910g;
        uVar.f286456b = java.lang.Long.valueOf(snVar2.f7904a);
        am.sn snVar3 = openNoteFromSessionEvent.f54599g;
        java.lang.String str2 = snVar3.f7909f;
        uVar.f286457c = snVar3.f7905b;
        uVar.f286458d = snVar3.f7907d;
        uVar.f286459e = snVar3.f7908e;
        uVar.f286460f = str2;
        uVar.f286461g = 0;
        uVar.f286462h = 0;
        uVar.f286463i = snVar3.f7912i;
        uVar.f286464j = snVar3.f7913j;
        uVar.f286465k = dq0Var;
        uVar.f286466l = snVar3.f7911h;
        wVar.s(snVar3.f7906c, uVar);
        wVar.f286418i.f286426b = openNoteFromSessionEvent.f54599g.f7907d ? 3 : 2;
        return false;
    }
}
