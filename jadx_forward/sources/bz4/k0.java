package bz4;

/* loaded from: classes12.dex */
public class k0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public k0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a c5824x69fbb00a = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a) abstractC20979x809547d1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenNoteFromSessionListener", "do OpenNoteFromSessionListener");
        r45.dq0 dq0Var = new r45.dq0();
        dq0Var.f454186d = c5824x69fbb00a.f136132g.f89443g;
        hz4.w wVar = new hz4.w();
        am.sn snVar = c5824x69fbb00a.f136132g;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("msgId", snVar.f89437a);
            jSONObject.put("talker", snVar.f89442f);
            java.lang.String str = snVar.f89438b;
            if (str == null) {
                str = "";
            }
            jSONObject.put("noteXmlStr", str);
            jSONObject.put("showShare", snVar.f89440d);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, snVar.f89443g);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Fav.NoteFloatBallHelper", e17, "eventToJson OpenNoteFromSessionEvent", new java.lang.Object[0]);
        }
        wVar.f367955p = jSONObject.toString();
        wVar.f367956q = 2;
        ((hz4.f) hz4.f.wi()).f367940d = wVar;
        hz4.u uVar = new hz4.u();
        am.sn snVar2 = c5824x69fbb00a.f136132g;
        uVar.f367988a = snVar2.f89443g;
        uVar.f367989b = java.lang.Long.valueOf(snVar2.f89437a);
        am.sn snVar3 = c5824x69fbb00a.f136132g;
        java.lang.String str2 = snVar3.f89442f;
        uVar.f367990c = snVar3.f89438b;
        uVar.f367991d = snVar3.f89440d;
        uVar.f367992e = snVar3.f89441e;
        uVar.f367993f = str2;
        uVar.f367994g = 0;
        uVar.f367995h = 0;
        uVar.f367996i = snVar3.f89445i;
        uVar.f367997j = snVar3.f89446j;
        uVar.f367998k = dq0Var;
        uVar.f367999l = snVar3.f89444h;
        wVar.s(snVar3.f89439c, uVar);
        wVar.f367951i.f367959b = c5824x69fbb00a.f136132g.f89440d ? 3 : 2;
        return false;
    }
}
