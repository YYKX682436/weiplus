package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui;

/* loaded from: classes5.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w33.c f220397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.v f220398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.s f220399f;

    public u(w33.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.v vVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.s sVar) {
        this.f220397d = cVar;
        this.f220398e = vVar;
        this.f220399f = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/ui/MentionUserViewHolder$setData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
        w33.c cVar = this.f220397d;
        long j17 = cVar.f524245d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.v vVar = this.f220398e;
        fVar.e(j17, 2L, vVar.f220402f, vVar.f220403g, cVar.f524243b.f524248a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.s sVar = this.f220399f;
        if (sVar != null) {
            w33.e eVar = cVar.f524243b;
            java.lang.String str = eVar.f524248a;
            java.lang.String str2 = eVar.f524249b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 c15854x49003e70 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.g2) sVar).f220663a;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = c15854x49003e70.L;
            if (z2Var != null) {
                z2Var.B();
            }
            c15854x49003e70.h(str, str2, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/ui/MentionUserViewHolder$setData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
