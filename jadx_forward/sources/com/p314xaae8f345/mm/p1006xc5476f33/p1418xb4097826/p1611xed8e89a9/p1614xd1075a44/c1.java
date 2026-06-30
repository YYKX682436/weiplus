package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 f206029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f206031f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f206032g;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var, java.lang.String str, boolean z17, boolean z18) {
        this.f206029d = s1Var;
        this.f206030e = str;
        this.f206031f = z17;
        this.f206032g = z18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.fw4 fw4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleNextLiveNoticeInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f206030e;
        boolean z17 = this.f206031f;
        boolean z18 = this.f206032g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var = this.f206029d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) s1Var.f206254e.get(str);
        r45.c32 c32Var = l2Var != null ? l2Var.B : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        boolean m75933x41a8a7f2 = (c32Var == null || (fw4Var = (r45.fw4) c32Var.m75936x14adae67(1)) == null) ? false : fw4Var.m75933x41a8a7f2(2);
        c0Var.f391645d = m75933x41a8a7f2;
        if (m75933x41a8a7f2) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) s1Var.f206251b, 1, true);
            k0Var.X1 = true;
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.n1(s1Var);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.o1(c0Var, str, s1Var, z17, z18);
            k0Var.v();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1.m(c0Var, str, s1Var, z17, z18);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleNextLiveNoticeInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
