package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes5.dex */
public final class xa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15295xb55935d0 f214855d;

    public xa(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15295xb55935d0 c15295xb55935d0) {
        this.f214855d = c15295xb55935d0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderHighLightTopicEditView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15295xb55935d0 c15295xb55935d0 = this.f214855d;
        yz5.l lVar = c15295xb55935d0.f212664i;
        if (lVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("onAddListener");
            throw null;
        }
        lVar.mo146xb9724478(c15295xb55935d0.f212666n);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderHighLightTopicEditView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
