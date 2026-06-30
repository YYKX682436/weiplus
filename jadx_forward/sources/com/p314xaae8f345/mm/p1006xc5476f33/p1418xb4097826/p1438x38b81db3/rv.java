package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class rv implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew f186042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f186044f;

    public rv(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew ewVar, in5.s0 s0Var, int i17) {
        this.f186042d = ewVar;
        this.f186043e = s0Var;
        this.f186044f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew ewVar = this.f186042d;
        if (ewVar.f184832n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderStreamCardAlbumConvert", "isRefreshing");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ewVar.f184832n = true;
        in5.s0 s0Var = this.f186043e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys ysVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys) s0Var.f374658i;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - ewVar.f184841w.f184958c;
        int indexOf = ewVar.f184826e.C.m56388xcaeb60d0().indexOf(ysVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x4 x4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x4.f206968a;
        java.lang.String m75945x2fec8307 = ysVar.f192725d.m75945x2fec8307(1);
        java.lang.String str = m75945x2fec8307 == null ? "" : m75945x2fec8307;
        r45.qt2 qt2Var = ewVar.f184829h;
        if (qt2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
            throw null;
        }
        x4Var.a(str, ysVar, indexOf, currentTimeMillis, qt2Var);
        java.lang.String m75945x2fec83072 = ysVar.f192725d.m75945x2fec8307(1);
        java.lang.String str2 = m75945x2fec83072 != null ? m75945x2fec83072 : "";
        long m75942xfb822ef2 = ysVar.f192725d.m75942xfb822ef2(14);
        r45.qt2 qt2Var2 = ewVar.f184829h;
        if (qt2Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
            throw null;
        }
        x4Var.b(str2, m75942xfb822ef2, 3, 0L, qt2Var2, indexOf);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f568115lr0);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f568118lr3);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r45.vd6 q17 = ewVar.q(ysVar);
        java.util.List c17 = kz5.b0.c(q17);
        r45.qt2 qt2Var3 = ewVar.f184829h;
        if (qt2Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
            throw null;
        }
        db2.y2 y2Var = new db2.y2(c17, qt2Var3);
        y2Var.f152182i = true;
        y2Var.l();
        ewVar.p(true, ysVar, q17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qv(view, ewVar, s0Var, this.f186044f));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
