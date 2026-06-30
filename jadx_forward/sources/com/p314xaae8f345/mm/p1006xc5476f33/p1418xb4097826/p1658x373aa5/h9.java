package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes5.dex */
public final class h9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15280xb0aa035b f213760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f213761e;

    public h9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15280xb0aa035b c15280xb0aa035b, java.lang.String str) {
        this.f213760d = c15280xb0aa035b;
        this.f213761e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderExtendReadingEditView$checkEnableAdd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f213760d.f212569d;
        if (lVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("onAddListener");
            throw null;
        }
        lVar.mo146xb9724478(this.f213761e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderExtendReadingEditView$checkEnableAdd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
