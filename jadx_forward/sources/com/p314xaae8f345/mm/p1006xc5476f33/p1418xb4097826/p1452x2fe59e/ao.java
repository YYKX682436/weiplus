package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class ao implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co f187852d;

    public ao(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co coVar) {
        this.f187852d = coVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelateViewCallback$initHeader$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co coVar = this.f187852d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = coVar.f187707d;
        int b17 = i65.a.b(abstractActivityC21394xb3d2c0cf, 48);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm rmVar = coVar.f188022y;
        if (rmVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPopupWindow");
            throw null;
        }
        rmVar.dismiss();
        android.view.View inflate = android.view.View.inflate(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30864xbddafb2a.b5c, null);
        coVar.f188019v = inflate;
        rmVar.setContentView(inflate);
        rmVar.f214506l = b17;
        rmVar.d(view);
        rmVar.b();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelateViewCallback$initHeader$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
