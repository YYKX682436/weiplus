package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.e4 f206203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.n3 f206204e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f206205f;

    public p3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.e4 e4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.n3 n3Var, int i17) {
        this.f206203d = e4Var;
        this.f206204e = n3Var;
        this.f206205f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.fw4 fw4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/MoreLiveNoticeListWidget$RecyclerAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.n3 n3Var = this.f206204e;
        int i17 = this.f206205f;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.e4 e4Var = this.f206203d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var = e4Var.f206065h;
        r45.c32 c32Var = s4Var.f206298s;
        boolean m75933x41a8a7f2 = (c32Var == null || (fw4Var = (r45.fw4) c32Var.m75936x14adae67(1)) == null) ? false : fw4Var.m75933x41a8a7f2(2);
        c0Var.f391645d = m75933x41a8a7f2;
        if (m75933x41a8a7f2) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(e4Var.f206063f, 1, true);
            k0Var.X1 = true;
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.z3(e4Var);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.a4(c0Var, e4Var, e4Var.f206065h, n3Var, i17);
            k0Var.v();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.e4.x(c0Var, e4Var, s4Var, n3Var, i17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/MoreLiveNoticeListWidget$RecyclerAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
