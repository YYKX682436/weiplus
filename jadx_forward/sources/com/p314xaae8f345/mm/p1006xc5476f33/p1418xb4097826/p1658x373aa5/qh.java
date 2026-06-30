package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class qh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15336x844a2f32 f214427d;

    public qh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15336x844a2f32 c15336x844a2f32) {
        this.f214427d = c15336x844a2f32;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPostTextModifyView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15336x844a2f32 c15336x844a2f32 = this.f214427d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c15336x844a2f32.f212954i;
        android.text.Editable text = c22621x7603e017.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        c15336x844a2f32.p(c15336x844a2f32.f212958p, str, c15336x844a2f32.f212961s, false);
        int length = str.length() - c15336x844a2f32.f212958p.length();
        c15336x844a2f32.o(length, c15336x844a2f32.f212959q);
        c15336x844a2f32.q(new so2.n6(c15336x844a2f32.f212958p, str, c15336x844a2f32.f212959q, c15336x844a2f32.f212960r + length, c15336x844a2f32.f212961s, so2.a.f491774e, null, 0, null, 0L, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, null));
        c15336x844a2f32.f212955m.setText((java.lang.CharSequence) null);
        c22621x7603e017.setText((java.lang.CharSequence) null);
        c22621x7603e017.clearFocus();
        c15336x844a2f32.n();
        c15336x844a2f32.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pp ppVar = c15336x844a2f32.f212966x;
        if (ppVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pp.p5(ppVar, c15336x844a2f32.f212958p, str, c15336x844a2f32.f212959q, c15336x844a2f32.f212960r, c15336x844a2f32.f212961s, false, false, 64, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPostTextModifyView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
