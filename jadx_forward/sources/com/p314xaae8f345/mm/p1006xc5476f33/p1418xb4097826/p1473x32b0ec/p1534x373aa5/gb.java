package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class gb extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public final java.lang.String H;
    public android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f197867J;
    public android.widget.TextView K;
    public android.view.ViewGroup L;
    public android.view.ViewGroup M;
    public android.view.ViewGroup N;
    public final java.util.LinkedList P;
    public android.view.View Q;
    public wt2.a R;
    public android.view.View.OnClickListener S;
    public yz5.p T;
    public android.view.View.OnClickListener U;
    public yz5.l V;
    public yz5.p W;
    public final int X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(android.content.Context context) {
        super(context, false, null, 0.75f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.H = "FinderLivePromoteAddView";
        this.P = new java.util.LinkedList();
        this.X = 1;
    }

    public static final void e0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.gb gbVar, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.q1 K2;
        if (gbVar.f199716e.getResources().getConfiguration().orientation == 2) {
            i95.m c17 = i95.n0.c(zg0.u2.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            K2 = zg0.u2.K2((zg0.u2) c17, gbVar.f199716e, str, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1(1.0f, 0.0f, null, false, false, 1, false, false, 0, false, false, 0, false, false, false, null, false, 0, false, 2, false, false, false, 7864014, null), 4, null);
        } else {
            i95.m c18 = i95.n0.c(zg0.u2.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            K2 = zg0.u2.K2((zg0.u2) c18, gbVar.f199716e, str, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1(0.0f, 0.0f, null, false, false, 1, false, false, 1, false, false, 0, false, false, false, null, false, 0, false, 2, false, false, false, 7864015, null), 4, null);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1) K2).show();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.axk;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.I = rootView.findViewById(com.p314xaae8f345.mm.R.id.fhp);
        this.f197867J = rootView.findViewById(com.p314xaae8f345.mm.R.id.fhy);
        this.K = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.fhz);
        this.L = (android.view.ViewGroup) rootView.findViewById(com.p314xaae8f345.mm.R.id.fji);
        this.M = (android.view.ViewGroup) rootView.findViewById(com.p314xaae8f345.mm.R.id.fiw);
        this.N = (android.view.ViewGroup) rootView.findViewById(com.p314xaae8f345.mm.R.id.fix);
        this.Q = rootView.findViewById(com.p314xaae8f345.mm.R.id.fhs);
        android.view.View view = this.I;
        if (view != null) {
            view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.bb(this));
        }
        android.view.View view2 = this.f197867J;
        if (view2 != null) {
            view2.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.cb.f197765d);
        }
        android.widget.TextView textView = this.K;
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0a76  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0a87 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f0(wt2.a r26, r45.jg1 r27, java.util.LinkedList r28) {
        /*
            Method dump skipped, instructions count: 2746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.gb.f0(wt2.a, r45.jg1, java.util.LinkedList):void");
    }

    public final void g0(android.view.View view) {
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.hix);
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.hiy);
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.hh7);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget", "setAddStatus", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget", "setAddStatus", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget", "setAddStatus", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget", "setAddStatus", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById3 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget", "setAddStatus", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget", "setAddStatus", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void h0(android.view.View view, long j17) {
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.hix);
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.hiy);
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.hh7);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget", "setAddedStatus", "(Landroid/view/View;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget", "setAddedStatus", "(Landroid/view/View;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.fb(view, this, j17));
        }
        if (findViewById != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget", "setAddedStatus", "(Landroid/view/View;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget", "setAddedStatus", "(Landroid/view/View;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById3 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget", "setAddedStatus", "(Landroid/view/View;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget", "setAddedStatus", "(Landroid/view/View;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void i0(android.view.View view) {
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.hix);
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.hiy);
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.hh7);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget", "setInvalidStatus", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget", "setInvalidStatus", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget", "setInvalidStatus", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget", "setInvalidStatus", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById3 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget", "setInvalidStatus", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget", "setInvalidStatus", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean w() {
        return true;
    }
}
