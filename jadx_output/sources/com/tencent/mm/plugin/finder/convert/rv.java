package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class rv implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.ew f104509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f104511f;

    public rv(com.tencent.mm.plugin.finder.convert.ew ewVar, in5.s0 s0Var, int i17) {
        this.f104509d = ewVar;
        this.f104510e = s0Var;
        this.f104511f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.ew ewVar = this.f104509d;
        if (ewVar.f103299n) {
            com.tencent.mars.xlog.Log.w("Finder.FinderStreamCardAlbumConvert", "isRefreshing");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ewVar.f103299n = true;
        in5.s0 s0Var = this.f104510e;
        com.tencent.mm.plugin.finder.feed.ys ysVar = (com.tencent.mm.plugin.finder.feed.ys) s0Var.f293125i;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - ewVar.f103308w.f103425c;
        int indexOf = ewVar.f103293e.C.getDataListJustForAdapter().indexOf(ysVar);
        com.tencent.mm.plugin.finder.report.x4 x4Var = com.tencent.mm.plugin.finder.report.x4.f125435a;
        java.lang.String string = ysVar.f111192d.getString(1);
        java.lang.String str = string == null ? "" : string;
        r45.qt2 qt2Var = ewVar.f103296h;
        if (qt2Var == null) {
            kotlin.jvm.internal.o.o("contextObj");
            throw null;
        }
        x4Var.a(str, ysVar, indexOf, currentTimeMillis, qt2Var);
        java.lang.String string2 = ysVar.f111192d.getString(1);
        java.lang.String str2 = string2 != null ? string2 : "";
        long j17 = ysVar.f111192d.getLong(14);
        r45.qt2 qt2Var2 = ewVar.f103296h;
        if (qt2Var2 == null) {
            kotlin.jvm.internal.o.o("contextObj");
            throw null;
        }
        x4Var.b(str2, j17, 3, 0L, qt2Var2, indexOf);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f486582lr0);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f486585lr3);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r45.vd6 q17 = ewVar.q(ysVar);
        java.util.List c17 = kz5.b0.c(q17);
        r45.qt2 qt2Var3 = ewVar.f103296h;
        if (qt2Var3 == null) {
            kotlin.jvm.internal.o.o("contextObj");
            throw null;
        }
        db2.y2 y2Var = new db2.y2(c17, qt2Var3);
        y2Var.f70649i = true;
        y2Var.l();
        ewVar.p(true, ysVar, q17, new com.tencent.mm.plugin.finder.convert.qv(view, ewVar, s0Var, this.f104511f));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
