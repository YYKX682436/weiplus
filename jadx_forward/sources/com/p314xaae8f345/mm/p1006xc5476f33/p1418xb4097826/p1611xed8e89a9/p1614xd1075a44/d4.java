package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class d4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 f206052d;

    public d4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var) {
        this.f206052d = s4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/MoreLiveNoticeListWidget$RecyclerAdapter$updateSectionHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var = this.f206052d;
        if (s4Var.f206304y) {
            yz5.a aVar = s4Var.A;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        } else {
            r45.j32 j32Var = s4Var.f206297r;
            if (j32Var != null && j32Var.m75939xb282bd08(2) == j32Var.m75939xb282bd08(3)) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(s4Var.f206281b, 1, false);
                s4Var.f206301v = k0Var;
                k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.p4(s4Var);
                k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.q4(s4Var);
                k0Var.v();
            } else {
                s4Var.c(null, 3, -1);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4.b(s4Var);
                s4Var.e();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/MoreLiveNoticeListWidget$RecyclerAdapter$updateSectionHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
