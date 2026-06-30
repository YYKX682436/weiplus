package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class gi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ri f205278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ii f205279e;

    public gi(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ri riVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ii iiVar) {
        this.f205278d = riVar;
        this.f205279e = iiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingSongListUIC$ViewActionCallback$updateState$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13911x99e9c3b7 c13911x99e9c3b7 = this.f205278d.f205729o;
        if (c13911x99e9c3b7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
            throw null;
        }
        c13911x99e9c3b7.mo56155xd210094c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ii iiVar = this.f205279e;
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864.y(iiVar.f214199d, false, 1, null);
        iiVar.b();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingSongListUIC$ViewActionCallback$updateState$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
