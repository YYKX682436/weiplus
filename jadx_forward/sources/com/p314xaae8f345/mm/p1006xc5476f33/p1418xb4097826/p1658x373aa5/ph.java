package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class ph implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15336x844a2f32 f214372d;

    public ph(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15336x844a2f32 c15336x844a2f32) {
        this.f214372d = c15336x844a2f32;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPostTextModifyView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15336x844a2f32 c15336x844a2f32 = this.f214372d;
        if (!c15336x844a2f32.f212962t.isEmpty()) {
            c15336x844a2f32.k();
        } else {
            c15336x844a2f32.l();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pp ppVar = c15336x844a2f32.f212966x;
        if (ppVar != null) {
            sr2.w0 w0Var = (sr2.w0) ppVar;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = w0Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo48674x36654fab();
            w0Var.R6(w0Var.L);
            w0Var.R6(w0Var.M);
        }
        c15336x844a2f32.f212954i.setText((java.lang.CharSequence) null);
        if (c15336x844a2f32.f212961s == so2.p6.f492075e) {
            c15336x844a2f32.f212964v += 0;
        } else {
            c15336x844a2f32.f212965w += 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pp ppVar2 = c15336x844a2f32.f212966x;
        if (ppVar2 != null) {
            ((sr2.w0) ppVar2).P6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPostTextModifyView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
