package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes5.dex */
public final class va implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15295xb55935d0 f214768d;

    public va(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15295xb55935d0 c15295xb55935d0) {
        this.f214768d = c15295xb55935d0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderHighLightTopicEditView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a aVar = this.f214768d.f212665m;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderHighLightTopicEditView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
