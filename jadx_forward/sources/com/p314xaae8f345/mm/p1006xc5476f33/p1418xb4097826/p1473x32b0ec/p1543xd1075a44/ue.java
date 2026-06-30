package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ue implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ve f201503d;

    public ue(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ve veVar) {
        this.f201503d = veVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansAnnouncementLevelSettingPanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ve veVar = this.f201503d;
        yz5.l lVar = veVar.f201597h;
        if (lVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15312xb2c5e319 c15312xb2c5e319 = veVar.f201598i;
            if (c15312xb2c5e319 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("picker");
                throw null;
            }
            lVar.mo146xb9724478(java.lang.Integer.valueOf(c15312xb2c5e319.m82064x754a37bb() + 1));
        }
        veVar.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansAnnouncementLevelSettingPanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
