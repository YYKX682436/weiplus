package lm3;

/* loaded from: classes10.dex */
public final class b0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f401003e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.m8 f401004f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f401005g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f401006h;

    public b0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f401003e = activity;
        this.f401004f = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.m8();
        this.f401005g = new lm3.g(this);
    }

    public static final void n(lm3.b0 b0Var, in5.s0 s0Var, lm3.e eVar, int i17) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = b0Var.f401003e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) a17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("likeMvClick ");
        sb6.append(eVar.f401015d.f345656c);
        sb6.append(' ');
        fm3.u uVar = eVar.f401015d;
        sb6.append(uVar.f345657d);
        sb6.append(' ');
        sb6.append(uVar.f345669p);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvItemConvert", sb6.toString());
        int i18 = uVar.f345669p;
        fm3.j0 j0Var = fm3.j0.f345611a;
        if (i18 == 1) {
            boolean z17 = !uVar.f345667n;
            uVar.f345667n = z17;
            if (z17) {
                uVar.f345664k++;
            } else {
                uVar.f345664k--;
            }
            b0Var.s(s0Var, eVar);
            java.lang.Long l17 = uVar.f345656c;
            java.lang.String str = uVar.f345657d;
            if (l17 == null || str == null) {
                return;
            }
            long longValue = l17.longValue();
            j0Var.h(b0Var.f401003e, n0Var.f232843i, uVar, uVar.f345667n ? 1 : 2, i17);
            gm0.j1.d().g(new hm3.h(longValue, str, uVar.f345667n));
            return;
        }
        if (i18 == 4) {
            boolean z18 = !uVar.f345667n;
            uVar.f345667n = z18;
            if (z18) {
                uVar.f345664k++;
            } else {
                uVar.f345664k--;
            }
            b0Var.s(s0Var, eVar);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = uVar.f345673t;
            java.lang.Long valueOf = c19792x256d2725 != null ? java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()) : null;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = uVar.f345673t;
            java.lang.String m76803x6c285d75 = c19792x256d27252 != null ? c19792x256d27252.m76803x6c285d75() : null;
            if (valueOf == null || m76803x6c285d75 == null) {
                return;
            }
            gm0.j1.d().g(new hm3.h(valueOf.longValue(), m76803x6c285d75, uVar.f345667n));
            j0Var.h(b0Var.f401003e, n0Var.f232843i, uVar, uVar.f345667n ? 1 : 2, i17);
        }
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570855c51;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x095d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0a90  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0b03  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0c30  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0c6d  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0c7d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0c87  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0703  */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r47, in5.c r48, int r49, int r50, boolean r51, java.util.List r52) {
        /*
            Method dump skipped, instructions count: 3217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lm3.b0.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16639xd269873d) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.j8z)).m67244xf1df49aa(new lm3.z(this, holder));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.j7o);
        if (c1163xf1deaba4 != null) {
            android.content.Context context = holder.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            c1163xf1deaba4.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1917xbb6ca34f.C16657x90cca9e9(context, 0, false, 6, null));
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) (c1163xf1deaba4 != null ? c1163xf1deaba4.getLayoutParams() : null);
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.topMargin = (int) ((this.f401003e.getResources().getDisplayMetrics().heightPixels * 0.37f) - i65.a.b(holder.f3639x46306858.getContext(), 15));
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    public final java.lang.String o(int i17) {
        return ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Zi(i17);
    }

    public final void p(in5.s0 holder, lm3.e item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f401003e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class)).f232851t) {
            android.view.View findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.im7);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567215im3);
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        int i17 = item.f401015d.f345669p;
        if (i17 == 1) {
            android.view.View findViewById3 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.im7);
            if (findViewById3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById4 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567215im3);
            if (findViewById4 == null) {
                return;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 == 2) {
            android.view.View findViewById5 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.im7);
            if (findViewById5 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById5, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById6 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567215im3);
            if (findViewById6 == null) {
                return;
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 != 3) {
            if (i17 != 4) {
                return;
            }
            android.view.View findViewById7 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.im7);
            if (findViewById7 != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(findViewById7, arrayList7.toArray(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(findViewById7, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById8 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567215im3);
            if (findViewById8 == null) {
                return;
            }
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(findViewById8, arrayList8.toArray(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(findViewById8, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById9 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.im7);
        if (findViewById9 != null) {
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(findViewById9, arrayList9.toArray(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(findViewById9, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById10 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567215im3);
        if (findViewById10 != null) {
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal10 = zj0.c.f554818a;
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(findViewById10, arrayList10.toArray(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(findViewById10, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById11 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567215im3);
        if (findViewById11 != null) {
            findViewById11.setOnClickListener(new lm3.p(item));
        }
    }

    public final void q(in5.s0 s0Var, lm3.e eVar) {
        android.widget.TextView textView = (android.widget.TextView) s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.c6s);
        int i17 = eVar.f401015d.f345666m;
        if (i17 > 0) {
            textView.setText(o(i17));
        } else {
            textView.setText(this.f401003e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cpb));
        }
    }

    public final void r(in5.s0 holder, lm3.e item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.gbk);
        java.util.Set D0 = kz5.z.D0(new java.lang.Integer[]{java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.ndq), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.bzk), valueOf, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.gcd)});
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f401003e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class)).f232851t;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.m8 m8Var = this.f401004f;
        if (z17) {
            m8Var.a(holder.f3639x46306858);
            m8Var.b(D0);
            m8Var.f232836b.clear();
        } else {
            kz5.q1.h(D0, valueOf);
            m8Var.a(holder.f3639x46306858);
            m8Var.c(D0);
            m8Var.f232836b.clear();
        }
    }

    public final void s(in5.s0 s0Var, lm3.e eVar) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.h6i);
        if (eVar.f401015d.f345667n) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79774xc850a2af);
            c22699x3dcdb352.m82040x7541828(s0Var.f3639x46306858.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
        } else {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79774xc850a2af);
            c22699x3dcdb352.m82040x7541828(s0Var.f3639x46306858.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        }
        android.widget.TextView textView = (android.widget.TextView) s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.i1g);
        fm3.u uVar = eVar.f401015d;
        int i17 = uVar.f345664k;
        if (i17 > 0) {
            textView.setText(o(i17));
        } else {
            textView.setText(s0Var.f3639x46306858.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h3y));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvItemConvert", "updateLikeStatus isLike:" + uVar.f345667n + " likeCount:" + uVar.f345664k);
    }
}
