package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ao implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.co f106319d;

    public ao(com.tencent.mm.plugin.finder.feed.co coVar) {
        this.f106319d = coVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelateViewCallback$initHeader$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.d(view);
        com.tencent.mm.plugin.finder.feed.co coVar = this.f106319d;
        com.tencent.mm.ui.MMActivity mMActivity = coVar.f106174d;
        int b17 = i65.a.b(mMActivity, 48);
        com.tencent.mm.plugin.finder.view.rm rmVar = coVar.f106489y;
        if (rmVar == null) {
            kotlin.jvm.internal.o.o("mPopupWindow");
            throw null;
        }
        rmVar.dismiss();
        android.view.View inflate = android.view.View.inflate(mMActivity, com.tencent.mm.R.layout.b5c, null);
        coVar.f106486v = inflate;
        rmVar.setContentView(inflate);
        rmVar.f132973l = b17;
        rmVar.d(view);
        rmVar.b();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelateViewCallback$initHeader$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
