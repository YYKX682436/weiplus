package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.c1 f101963d;

    public w0(com.tencent.mm.plugin.finder.activity.uic.c1 c1Var) {
        this.f101963d = c1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.activity.uic.c1 c1Var = this.f101963d;
        androidx.appcompat.app.AppCompatActivity activity = c1Var.getActivity();
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.L4).getValue()).r()).intValue();
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        java.util.Date date = new java.util.Date(zl2.r4.f473950a.M0());
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i18 = 1;
        int i19 = (date.getHours() < 23 || date.getMinutes() < 55) ? 0 : 1;
        int i27 = i19;
        while (i27 < intValue) {
            calendar.setTime(date);
            calendar.set(5, calendar.get(5) + i27);
            int i28 = calendar.get(5);
            int i29 = calendar.get(2) + i18;
            if (i27 == i19) {
                arrayList2.add(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.fd_));
            } else if (i27 == i19 + 1) {
                arrayList2.add(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e0g, java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i28)) + ' ' + com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.fda));
            } else if (i27 == i19 + 2) {
                arrayList2.add(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e0g, java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i28)) + ' ' + com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f492140fd1));
            } else {
                int i37 = calendar.get(7);
                arrayList2.add(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e0g, java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i28)) + ' ' + com.tencent.mm.plugin.finder.assist.w2.q(activity, i37 + (-2) >= 0 ? i37 - 1 : 7, ya.b.CAMPAIGN));
            }
            i27++;
            i18 = 1;
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.tencent.mars.xlog.Log.i("getNoticePicker", (java.lang.String) it.next());
        }
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        int size = arrayList2.size();
        ((b92.d1) zbVar).getClass();
        zl2.r4 r4Var = zl2.r4.f473950a;
        java.util.Date date2 = new java.util.Date(r4Var.M0());
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        r4Var.N0(arrayList3, com.tencent.mm.R.string.cmx);
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            com.tencent.mars.xlog.Log.i("getNoticePicker", (java.lang.String) it6.next());
        }
        for (int i38 = 0; i38 < size; i38++) {
            arrayList4.add(arrayList3);
        }
        java.lang.Object clone = arrayList3.clone();
        kotlin.jvm.internal.o.e(clone, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        java.util.ArrayList arrayList5 = (java.util.ArrayList) clone;
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTime(date2);
        int i39 = calendar2.get(11);
        if (i39 >= 0) {
            int i47 = 0;
            i17 = 0;
            while (true) {
                arrayList5.remove(0);
                if (i47 == i39) {
                    break;
                } else {
                    i47++;
                }
            }
        } else {
            i17 = 0;
        }
        arrayList4.remove(i17);
        if (!arrayList5.isEmpty()) {
            arrayList4.add(i17, arrayList5);
        }
        jz5.l lVar = new jz5.l(arrayList2, arrayList4);
        com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(c1Var.getActivity(), arrayList2, arrayList4);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        calendar3.setTimeInMillis(zl2.r4.f473950a.M0());
        c0Var.j(c1Var.f101860y, c1Var.f101861z);
        java.lang.String string = c1Var.getActivity().getResources().getString(com.tencent.mm.R.string.dbj);
        android.widget.Button button = c0Var.f212251i;
        if (button != null) {
            button.setText(string);
        }
        c0Var.f212260u = new com.tencent.mm.plugin.finder.activity.uic.b1(c0Var, c1Var, lVar);
        android.view.View inflate = android.view.LayoutInflater.from(c1Var.getActivity()).inflate(com.tencent.mm.R.layout.aes, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        c0Var.g(inflate);
        int color = c1Var.getActivity().getResources().getColor(com.tencent.mm.R.color.f478525a6);
        android.widget.Button button2 = c0Var.f212252m;
        if (button2 != null) {
            button2.setTextColor(color);
        }
        android.widget.Button button3 = c0Var.f212251i;
        if (button3 != null) {
            button3.setBackgroundResource(com.tencent.mm.R.drawable.f481057jk);
        }
        c0Var.l();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
