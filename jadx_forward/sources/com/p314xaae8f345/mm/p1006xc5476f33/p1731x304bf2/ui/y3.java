package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class y3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15974x21f4466f f223409d;

    public y3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15974x21f4466f c15974x21f4466f) {
        this.f223409d = c15974x21f4466f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameInfoViewForeign$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        java.lang.String str = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15974x21f4466f c15974x21f4466f = this.f223409d;
        if (tag == null || !(view.getTag() instanceof java.lang.String)) {
            android.content.Intent intent = new android.content.Intent();
            if (((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).wi(e42.d0.clicfg_game_open_message_center_v2, 1) == 1) {
                intent.setClass(c15974x21f4466f.f222404d, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC15995xdf941836.class);
            } else {
                intent.setClass(c15974x21f4466f.f222404d, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15982xf89d78e9.class);
            }
            intent.putExtra("game_report_from_scene", 1001);
            android.content.Context context = c15974x21f4466f.f222404d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameInfoViewForeign$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/game/ui/GameInfoViewForeign$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            i17 = 6;
        } else {
            i17 = r53.f.v(c15974x21f4466f.f222404d, (java.lang.String) view.getTag(), "game_center_msgcenter", null);
        }
        int i18 = i17;
        java.lang.String valueOf = java.lang.String.valueOf(5);
        if (valueOf != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("function_type", "resource");
                jSONObject.put("function_value", valueOf);
            } catch (org.json.JSONException unused) {
            }
            str = nj0.a.d(jSONObject.toString());
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(c15974x21f4466f.f222404d, 10, 1001, c15974x21f4466f.f222408h, i18, 0, null, c15974x21f4466f.f222406f, 0, null, null, str);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameInfoViewForeign$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
