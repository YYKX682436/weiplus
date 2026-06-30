package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g2 f213595d;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g2 g2Var) {
        this.f213595d = g2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initSecondPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean booleanValue = ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.K().r()).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g2 g2Var = this.f213595d;
        if (booleanValue) {
            java.util.List list = g2Var.f213674m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(java.lang.Integer.valueOf(((r45.jy0) it.next()).m75939xb282bd08(0)));
            }
            long j17 = g2Var.f213664c;
            java.lang.String str = g2Var.f213665d;
            int i17 = g2Var.f213667f;
            java.lang.String m75945x2fec8307 = g2Var.f213668g.m75945x2fec8307(3);
            java.lang.String str2 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
            java.lang.String m75945x2fec83072 = g2Var.f213668g.m75945x2fec8307(4);
            new db2.n(2, arrayList2, j17, str, i17, str2, m75945x2fec83072 == null ? "" : m75945x2fec83072, null, null, 384, null);
        } else {
            int i18 = 2;
            java.util.List list2 = g2Var.f213674m;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list2, 10));
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                arrayList3.add(java.lang.Integer.valueOf(((r45.jy0) it6.next()).m75939xb282bd08(0)));
            }
            long j18 = g2Var.f213664c;
            java.lang.String str3 = g2Var.f213665d;
            int i19 = g2Var.f213667f;
            java.lang.String m75945x2fec83073 = g2Var.f213668g.m75945x2fec8307(3);
            java.lang.String str4 = m75945x2fec83073 == null ? "" : m75945x2fec83073;
            java.lang.String m75945x2fec83074 = g2Var.f213668g.m75945x2fec8307(4);
            gm0.j1.d().g(new db2.j5(i18, arrayList3, j18, str3, i19, str4, m75945x2fec83074 == null ? "" : m75945x2fec83074, null, null, 384, null));
        }
        yz5.l lVar = g2Var.f213669h;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Long.valueOf(g2Var.f213666e));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(g2Var.f213674m)) {
            android.content.Context context = g2Var.f213663b;
            db5.t7.h(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572832cp1));
        } else {
            android.content.Context context2 = g2Var.f213663b;
            db5.t7.h(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572834cp3));
        }
        g2Var.f213670i = 2;
        g2Var.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initSecondPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
