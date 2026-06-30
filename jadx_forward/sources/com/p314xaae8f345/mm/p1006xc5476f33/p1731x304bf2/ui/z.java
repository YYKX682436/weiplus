package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes5.dex */
public class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f223423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15943x8273b8e0 f223424e;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15943x8273b8e0 c15943x8273b8e0, int i17) {
        this.f223424e = c15943x8273b8e0;
        this.f223423d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameBlockView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof java.lang.String)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBlockView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = (java.lang.String) view.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15943x8273b8e0 c15943x8273b8e0 = this.f223424e;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(c15943x8273b8e0.getContext(), 10, 1002, 99, r53.f.v(c15943x8273b8e0.getContext(), str, "game_center_mygame_more", null), this.f223423d, null);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBlockView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
