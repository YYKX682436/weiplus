package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class w8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3 f198309d;

    public w8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3 c14340xe0508cb3) {
        this.f198309d = c14340xe0508cb3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView$manualRecordingView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3 c14340xe0508cb3 = this.f198309d;
        mm2.i7 i7Var = c14340xe0508cb3.f197610h;
        r45.hd5 hd5Var = i7Var != null ? i7Var.f410681e : null;
        if (i7Var != null && hd5Var != null) {
            if (hd5Var.m75939xb282bd08(5) == 1000) {
                if (hd5Var.m75939xb282bd08(2) > 0) {
                    long e17 = c01.id.e() - hd5Var.m75939xb282bd08(2);
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3.f197605s;
                    if (e17 < 5) {
                        i95.m c17 = i95.n0.c(ml2.j0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        ml2.j0.Qj((ml2.j0) c17, 7, 1, 0L, 0, 12, null);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3.e(c14340xe0508cb3, com.p314xaae8f345.mm.R.C30867xcad56011.e6v);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3.c(c14340xe0508cb3, 106, i7Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v8(c14340xe0508cb3, i7Var));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14340xe0508cb3.f197606d, "no recording");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView$manualRecordingView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
