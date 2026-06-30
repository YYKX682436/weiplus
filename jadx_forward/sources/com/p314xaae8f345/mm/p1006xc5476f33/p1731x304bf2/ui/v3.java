package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes5.dex */
public class v3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f223331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15972xd538386d f223332e;

    public v3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15972xd538386d c15972xd538386d, int i17) {
        this.f223332e = c15972xd538386d;
        this.f223331d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameIndexSearchView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15972xd538386d c15972xd538386d = this.f223332e;
        if (tag == null || !(view.getTag() instanceof java.lang.String)) {
            android.content.Intent intent = new android.content.Intent(c15972xd538386d.f222399d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15989x4803986e.class);
            intent.putExtra("game_report_from_scene", 1001);
            android.content.Context context = c15972xd538386d.f222399d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameIndexSearchView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/game/ui/GameIndexSearchView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            i17 = 6;
        } else {
            i17 = r53.f.v(c15972xd538386d.f222399d, (java.lang.String) view.getTag(), "game_center_msgcenter", null);
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(c15972xd538386d.f222399d, 14, 1401, 1, i17, 0, null, this.f223331d, 0, null, null, null);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameIndexSearchView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
