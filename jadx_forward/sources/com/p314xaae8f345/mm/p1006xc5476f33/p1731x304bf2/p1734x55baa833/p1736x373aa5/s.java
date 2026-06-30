package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes15.dex */
public class s implements com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.t f220812a;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.t tVar) {
        this.f220812a = tVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.m1
    public void a(boolean z17, boolean z18) {
        int h17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.ChatMemberListView", "checkPreload,  hasPreload:[%b], result[%b]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.t tVar = this.f220812a;
        if (z17) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("user_name", tVar.f220826p.f36637xf02988d6);
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = tVar.f220829s.f220835e.f220412m2;
                c15780xf49d6a1c.f36743xf0cd21de = s33.y.b(c15780xf49d6a1c.f36743xf0cd21de, "username=" + tVar.f220826p.f36637xf02988d6);
                jSONObject.put("user_data", pm0.b0.g(tVar.f220826p).toString());
                jSONObject.put("raw_url", tVar.f220827q.f36743xf0cd21de);
                jSONObject.put("source_id", 1302L);
                java.lang.String str = tVar.f220829s.f220835e.f220413n2;
                if (str != null) {
                    jSONObject.put("premade_info", str);
                }
            } catch (org.json.JSONException unused) {
            }
            java.lang.String encode = java.net.URLEncoder.encode(jSONObject.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15847x71fbf6b5 c15847x71fbf6b5 = tVar.f220829s.f220835e;
            h17 = s33.y.i(c15847x71fbf6b5.f220405f2, c15847x71fbf6b5.f220412m2, 12, encode);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.ChatMemberListView", "use preload personal profile url: %s", tVar.f220829s.f220835e.f220412m2.f36743xf0cd21de);
        } else {
            h17 = s33.y.h(tVar.f220829s.f220835e.f220405f2, tVar.f220827q);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c2 = tVar.f220827q;
            if (c15780xf49d6a1c2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.ChatMemberListView", "slot jump url: %s", c15780xf49d6a1c2.f36743xf0cd21de);
            }
        }
        tVar.i(h17);
    }
}
