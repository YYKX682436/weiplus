package c43;

/* loaded from: classes15.dex */
public class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15834xf3f76701 f120017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c43.w0 f120018e;

    public v0(c43.w0 w0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15834xf3f76701 c15834xf3f76701) {
        this.f120018e = w0Var;
        this.f120017d = c15834xf3f76701;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15811xf3f16a2f c15811xf3f16a2f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$6$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15834xf3f76701 c15834xf3f76701 = this.f120017d;
        if (c15834xf3f76701 != null && (c15811xf3f16a2f = c15834xf3f76701.f36905x14024ea2) != null) {
            c43.w0 w0Var = this.f120018e;
            s33.y.h(w0Var.f120020e.f120050a.f120025g, c15811xf3f16a2f.f36852x28d1961f);
            if (w0Var.f120020e.f120050a.f120028m != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("role", c15834xf3f76701.f36904x358076);
                } catch (org.json.JSONException unused) {
                }
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
                c43.x xVar = w0Var.f120020e.f120050a;
                long j17 = xVar.f120027i;
                long j18 = xVar.f120026h;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = xVar.f120028m;
                fVar.h(21L, 2L, j17, j18, c15731x94356d67.seq, c15731x94356d67.f36570xfd4da1cb, 0L, xVar.X, jSONObject.toString());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$6$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
