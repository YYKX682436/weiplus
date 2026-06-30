package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class bd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f102961d;

    public bd(com.tencent.mm.plugin.finder.convert.qe qeVar) {
        this.f102961d = qeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshPostProgress$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).bl(this.f102961d.f104358f.getF122643d(), com.tencent.mm.plugin.finder.storage.t70.f127590a.U0() ? ".ui.FinderHomeAffinityUI" : ".ui.FinderHomeUI");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshPostProgress$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
