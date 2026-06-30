package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class dk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.ek f103162d;

    public dk(com.tencent.mm.plugin.finder.convert.ek ekVar) {
        this.f103162d = ekVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedSameCityLiveConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f103162d.f103267e;
        kotlin.jvm.internal.o.d(view);
        lVar.invoke(view);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedSameCityLiveConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
