package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class kc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.nc f101233d;

    public kc(com.tencent.mm.plugin.fav.ui.nc ncVar) {
        this.f101233d = ncVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/PhotoTransControl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        o72.e5 e5Var = this.f101233d.f101303e;
        if (e5Var != null) {
            e5Var.x2();
        }
        com.tencent.mm.autogen.events.CancelScanTranslationEvent cancelScanTranslationEvent = new com.tencent.mm.autogen.events.CancelScanTranslationEvent();
        am.r1 r1Var = cancelScanTranslationEvent.f54027g;
        r1Var.f7757a = 1;
        r1Var.f7758b = this.f101233d.f101301c;
        cancelScanTranslationEvent.f54027g.getClass();
        cancelScanTranslationEvent.e();
        this.f101233d.b();
        this.f101233d.f101301c = 0;
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/PhotoTransControl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
