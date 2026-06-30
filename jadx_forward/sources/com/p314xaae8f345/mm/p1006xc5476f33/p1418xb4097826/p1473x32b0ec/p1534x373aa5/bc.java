package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class bc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc f197746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lv1 f197747e;

    public bc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc mcVar, r45.lv1 lv1Var) {
        this.f197746d = mcVar;
        this.f197747e = lv1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.p42 p42Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindAttendButton$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc mcVar = this.f197746d;
        mcVar.b("attendClick");
        mcVar.getClass();
        boolean z17 = true;
        r45.uv1 uv1Var = (r45.uv1) this.f197747e.m75936x14adae67(1);
        java.lang.String m75945x2fec8307 = (uv1Var == null || (p42Var = (r45.p42) uv1Var.m75936x14adae67(10)) == null) ? null : p42Var.m75945x2fec8307(2);
        if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(mcVar.f198018c, "no noticeID");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(mcVar.f198017b, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.jc(m75945x2fec8307, mcVar, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindAttendButton$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
