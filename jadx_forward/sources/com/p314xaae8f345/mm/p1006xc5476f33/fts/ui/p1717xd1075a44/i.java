package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes12.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v f219810d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar) {
        this.f219810d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$initAISearchAndYuanbaoAd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar = this.f219810d;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.a0 a0Var = vVar.f219866y;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fts] handleYuanbaoAdClick ");
        xj.m mVar = (xj.m) ((jz5.n) a0Var.f219776b.f550942r).mo141623x754a37bb();
        jz5.f0 f0Var = null;
        sb6.append(mVar != null ? mVar.f536286a : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSActionBarAISearchViewModel", sb6.toString());
        xj.m mVar2 = (xj.m) ((jz5.n) a0Var.f219776b.f550942r).mo141623x754a37bb();
        if (mVar2 != null) {
            i95.m c17 = i95.n0.c(xj.i.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            xj.i.y3((xj.i) c17, mVar2.f536286a, null, new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.w(a0Var), 2, null);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTSActionBarAISearchViewModel", "[handleYuanbaoAdClick] adInfo is null, jump failed.");
        }
        z50.d dVar = z50.e.f551696a;
        vu4.a aVar = vu4.a.f521778o;
        vu4.b bVar = vu4.b.f521804u;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.a0 a0Var2 = vVar.f219866y;
        dVar.b(aVar, bVar, a0Var2.f219776b.a7(), a0Var2.f219776b.f550934g);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$initAISearchAndYuanbaoAd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
