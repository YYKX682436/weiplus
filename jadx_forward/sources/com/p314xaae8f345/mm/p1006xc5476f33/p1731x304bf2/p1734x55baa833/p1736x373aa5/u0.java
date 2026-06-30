package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes8.dex */
public class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.v0 f220836d;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.v0 v0Var) {
        this.f220836d = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b c15741x8495618b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$MyChatRoomVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.v0 v0Var = this.f220836d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d c15793xe0873b6d = v0Var.f220849o;
        if (c15793xe0873b6d != null && (c15741x8495618b = c15793xe0873b6d.f36787x39219d3a) != null && c15741x8495618b.f36604x391f2836 != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("reportStr", v0Var.f220849o.f36787x39219d3a.f36604x391f2836.f36497x732388a6);
            } catch (java.lang.Exception unused) {
            }
            int c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.j1.c(v0Var.f220830d, 3, v0Var.f220849o.f36787x39219d3a.f36604x391f2836, v0Var.f220851q, v0Var.f220843f, null, 0L, 1001L);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d c15720x34e10e9d = v0Var.f220850p;
            java.lang.String str = c15720x34e10e9d == null ? "" : c15720x34e10e9d.f36482x58b82fc;
            java.lang.String str2 = c15720x34e10e9d != null ? c15720x34e10e9d.f36490x3923b317 : "";
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
            if (c17 == 1) {
                fVar.k(1001L, v0Var.f220852r, 6L, 0L, v0Var.f220853s, v0Var.f220854t, str, str2, jSONObject.toString());
            } else if (c17 == 2) {
                fVar.k(1001L, v0Var.f220852r, 7L, 0L, v0Var.f220853s, v0Var.f220854t, str, str2, jSONObject.toString());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$MyChatRoomVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
