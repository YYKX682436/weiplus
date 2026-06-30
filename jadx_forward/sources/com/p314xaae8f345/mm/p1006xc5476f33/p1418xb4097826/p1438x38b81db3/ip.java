package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class ip implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f185214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.jp f185215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.o3 f185216f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185217g;

    public ip(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.jp jpVar, so2.o3 o3Var, in5.s0 s0Var) {
        this.f185214d = c22699x3dcdb352;
        this.f185215e = jpVar;
        this.f185216f = o3Var;
        this.f185217g = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert$bindOperateLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f185214d;
        java.lang.Object tag = c22699x3dcdb352.getTag(com.p314xaae8f345.mm.R.id.qco);
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        boolean z17 = !(bool != null ? bool.booleanValue() : false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.jp jpVar = this.f185215e;
        yz5.p pVar = jpVar.f185305m;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        so2.o3 o3Var = this.f185216f;
        pVar.mo149xb9724478(valueOf, o3Var);
        c22699x3dcdb352.setTag(com.p314xaae8f345.mm.R.id.qco, java.lang.Boolean.valueOf(z17));
        in5.s0 s0Var = this.f185217g;
        if (z17) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79758xc84e73d5);
            c22699x3dcdb352.m82040x7541828(s0Var.f374654e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
            dm.pd pdVar = o3Var.f491944d;
            int i17 = pdVar.f66082x26b1b2e8;
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            pdVar.f66082x26b1b2e8 = i17 | 128;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            hc2.f1.d(view);
        } else {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80313x7abd4f8b);
            c22699x3dcdb352.m82040x7541828(s0Var.f374654e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            dm.pd pdVar2 = o3Var.f491944d;
            int i18 = pdVar2.f66082x26b1b2e8;
            java.util.regex.Pattern pattern2 = pm0.v.f438335a;
            pdVar2.f66082x26b1b2e8 = i18 & (-129);
        }
        long j17 = jpVar.f185303h.f185384a == 2 ? 15L : 14L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d c14727x5e078d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        int i19 = jpVar.f185303h.f185384a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = o3Var.f491944d.f66078xad49d1db;
        if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
            str = "";
        }
        java.lang.String l17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.l(c14727x5e078d, context, i19, false, str, o3Var.f491944d, false, false, true, true, 100, null);
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        android.content.Context context2 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Mj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, context2, j17, 1L, false, jpVar.f185303h.f185384a, 6, l17, 8, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert$bindOperateLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
