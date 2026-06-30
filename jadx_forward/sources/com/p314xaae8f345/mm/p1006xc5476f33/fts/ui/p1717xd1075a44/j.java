package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes12.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v f219816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g23.c f219817e;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar, g23.c cVar) {
        this.f219816d = vVar;
        this.f219817e = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$initAISearchAndYuanbaoAd$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        z50.d dVar = z50.e.f551696a;
        vu4.a aVar = vu4.a.f521782s;
        vu4.b bVar = vu4.b.f521805v;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar = this.f219816d;
        dVar.b(aVar, bVar, vVar.f219866y.f219776b.a7(), vVar.f219866y.f219776b.f550934g);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.a0 a0Var = vVar.f219866y;
        a0Var.getClass();
        g23.c innerInputConfig = this.f219817e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(innerInputConfig, "innerInputConfig");
        java.lang.String str = innerInputConfig.f349427d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getExtParams(...)");
        java.lang.String str2 = innerInputConfig.f349428e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getNavBarParms(...)");
        org.json.JSONObject X6 = a0Var.f219776b.X6(str, str2);
        z50.b bVar2 = z50.c.f551695a;
        android.content.Context context = a0Var.f219775a;
        java.lang.String str3 = innerInputConfig.f349424a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getHotword(...)");
        bVar2.d(context, str3, innerInputConfig.f349425b, innerInputConfig.f349426c, X6);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$initAISearchAndYuanbaoAd$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
