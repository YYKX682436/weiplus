package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f232553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1 f232554e;

    public a1(java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1 e1Var) {
        this.f232553d = obj;
        this.f232554e = e1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String m76197x6c03c64c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvInfoUIC$mediaChangeListener$1$onChange$1$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) this.f232553d).m76760x76845fea();
        if (m76760x76845fea != null && (m76197x6c03c64c = m76760x76845fea.m76197x6c03c64c()) != null) {
            this.f232554e.O6(m76197x6c03c64c, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvInfoUIC$mediaChangeListener$1$onChange$1$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
