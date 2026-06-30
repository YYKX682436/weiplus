package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes3.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 f183496d;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 c1Var) {
        this.f183496d = c1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 c1Var = this.f183496d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = c1Var.m158354x19263085();
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.L4).mo141623x754a37bb()).r()).intValue();
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        java.util.Date date = new java.util.Date(zl2.r4.f555483a.M0());
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
                arrayList2.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fd_));
            } else if (i27 == i19 + 1) {
                arrayList2.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0g, java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i28)) + ' ' + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fda));
            } else if (i27 == i19 + 2) {
                arrayList2.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0g, java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i28)) + ' ' + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573673fd1));
            } else {
                int i37 = calendar.get(7);
                arrayList2.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0g, java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i28)) + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.q(m158354x19263085, i37 + (-2) >= 0 ? i37 - 1 : 7, ya.b.f77465x264ef110));
            }
            i27++;
            i18 = 1;
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("getNoticePicker", (java.lang.String) it.next());
        }
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        int size = arrayList2.size();
        ((b92.d1) zbVar).getClass();
        zl2.r4 r4Var = zl2.r4.f555483a;
        java.util.Date date2 = new java.util.Date(r4Var.M0());
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        r4Var.N0(arrayList3, com.p314xaae8f345.mm.R.C30867xcad56011.cmx);
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("getNoticePicker", (java.lang.String) it6.next());
        }
        for (int i38 = 0; i38 < size; i38++) {
            arrayList4.add(arrayList3);
        }
        java.lang.Object clone = arrayList3.clone();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(clone, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
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
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0(c1Var.m158354x19263085(), arrayList2, arrayList4);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        calendar3.setTimeInMillis(zl2.r4.f555483a.M0());
        c0Var.j(c1Var.f183393y, c1Var.f183394z);
        java.lang.String string = c1Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dbj);
        android.widget.Button button = c0Var.f293784i;
        if (button != null) {
            button.setText(string);
        }
        c0Var.f293793u = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.b1(c0Var, c1Var, lVar);
        android.view.View inflate = android.view.LayoutInflater.from(c1Var.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aes, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        c0Var.g(inflate);
        int color = c1Var.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560058a6);
        android.widget.Button button2 = c0Var.f293785m;
        if (button2 != null) {
            button2.setTextColor(color);
        }
        android.widget.Button button3 = c0Var.f293784i;
        if (button3 != null) {
            button3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk);
        }
        c0Var.l();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
