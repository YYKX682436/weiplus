package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes15.dex */
public class n3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88 f220774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d f220775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs f220776f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f220777g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15861xcec1ad88 f220778h;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15861xcec1ad88 c15861xcec1ad88, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88 c15744x2fe9df88, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d c15720x34e10e9d, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs lbs, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c) {
        this.f220778h = c15861xcec1ad88;
        this.f220774d = c15744x2fe9df88;
        this.f220775e = c15720x34e10e9d;
        this.f220776f = lbs;
        this.f220777g = c15780xf49d6a1c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/JoinChatRoomConfirmView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15861xcec1ad88 c15861xcec1ad88 = this.f220778h;
        fVar.m(1L, 13L, 0L, c15861xcec1ad88.f220521f, c15861xcec1ad88.f220520e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88 c15744x2fe9df88 = this.f220774d;
        if (c15744x2fe9df88.f36627x2ff63fd0) {
            gm0.j1.d().g(new v33.o(this.f220775e.f36490x3923b317, this.f220776f, true, c15861xcec1ad88.f220521f, c15861xcec1ad88.f220520e));
        } else if (c15744x2fe9df88.f36623x75cdca0a != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = this.f220777g;
            if (c15780xf49d6a1c != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c15780xf49d6a1c.f36743xf0cd21de)) {
                java.lang.String str = c15780xf49d6a1c.f36744xf6825b11;
                if (str == null) {
                    str = "";
                }
                if (str.equals(c15744x2fe9df88.f36623x75cdca0a.f36744xf6825b11)) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("source_id", 1311L);
                    } catch (org.json.JSONException unused) {
                    }
                    s33.y.i(c15861xcec1ad88.f220519d, c15744x2fe9df88.f36623x75cdca0a, 11, java.net.URLEncoder.encode(jSONObject.toString()));
                }
            }
            s33.y.i(c15861xcec1ad88.f220519d, c15744x2fe9df88.f36623x75cdca0a, 11, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/JoinChatRoomConfirmView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
