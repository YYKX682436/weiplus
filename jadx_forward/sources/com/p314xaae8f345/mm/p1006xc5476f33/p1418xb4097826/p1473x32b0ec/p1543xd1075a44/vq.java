package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class vq implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wq f201614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f201615e;

    public vq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wq wqVar, r45.h32 h32Var) {
        this.f201614d = wqVar;
        this.f201615e = h32Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivePostNoticeInfoPanel$show$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wq wqVar = this.f201614d;
        r45.h32 h32Var = wqVar.T;
        if (h32Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noticeInfo");
            throw null;
        }
        int m75939xb282bd08 = h32Var.m75939xb282bd08(18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c80 c80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c80) ((jz5.n) wqVar.S).mo141623x754a37bb();
        r45.h32 h32Var2 = wqVar.T;
        if (h32Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noticeInfo");
            throw null;
        }
        c80Var.e0(h32Var2, 2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.uq(wqVar, m75939xb282bd08, this.f201615e));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePostNoticeInfoPanel$show$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
