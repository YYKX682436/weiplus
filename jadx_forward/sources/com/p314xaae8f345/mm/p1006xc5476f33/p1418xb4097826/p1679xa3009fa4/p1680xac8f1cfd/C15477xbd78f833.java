package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC */
/* loaded from: classes2.dex */
public final class C15477xbd78f833 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: x */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n50 f215168x = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n50(null);

    /* renamed from: d */
    public final jz5.g f215169d;

    /* renamed from: e */
    public final jz5.g f215170e;

    /* renamed from: f */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15478xc79d4a86 f215171f;

    /* renamed from: g */
    public java.lang.Long f215172g;

    /* renamed from: h */
    public in5.s0 f215173h;

    /* renamed from: i */
    public float f215174i;

    /* renamed from: m */
    public long f215175m;

    /* renamed from: n */
    public android.view.MotionEvent f215176n;

    /* renamed from: o */
    public long f215177o;

    /* renamed from: p */
    public long f215178p;

    /* renamed from: q */
    public long f215179q;

    /* renamed from: r */
    public long f215180r;

    /* renamed from: s */
    public final ow2.h f215181s;

    /* renamed from: t */
    public final ow2.a f215182t;

    /* renamed from: u */
    public boolean f215183u;

    /* renamed from: v */
    public float f215184v;

    /* renamed from: w */
    public boolean f215185w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC$toggleAnimEndListener$1] */
    public C15477xbd78f833(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f215169d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.b60(activity, this));
        this.f215170e = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a60.f215270d);
        this.f215171f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5151xfdcfc6b3>(this) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC$toggleAnimEndListener$1

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833 f215187e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112.this);
                this.f215187e = this;
                this.f39173x3fe91575 = 2063121603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5151xfdcfc6b3 c5151xfdcfc6b3) {
                in5.s0 s0Var;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5151xfdcfc6b3 event = c5151xfdcfc6b3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112.this.hashCode() != event.f135500g.f88248a) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedControlUIC", "ActivityToggleAnimEndEvent: notify resize speed tips");
                ow2.h hVar = this.f215187e.f215181s;
                if (hVar.f430920h || (s0Var = hVar.f430918f) == null || !hVar.f430917e) {
                    return false;
                }
                ow2.h.f430911k = null;
                ow2.h.f430912l = null;
                hVar.a(true, s0Var, true);
                return false;
            }
        };
        this.f215174i = 1.0f;
        jz5.g b17 = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.z50(this));
        android.app.Activity m80379x76847179 = m80379x76847179();
        android.view.View view = (android.view.View) ((jz5.n) b17).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "<get-speedPlayLayout>(...)");
        this.f215181s = new ow2.h(m80379x76847179, view, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.y50(this));
        this.f215182t = new ow2.a(U6());
        this.f215184v = 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap P6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833 r20, in5.s0 r21, float r22, boolean r23, boolean r24, boolean r25, int r26, java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.P6(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC, in5.s0, float, boolean, boolean, boolean, int, java.lang.Object):java.util.HashMap");
    }

    public static /* synthetic */ void a7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833 c15477xbd78f833, in5.s0 s0Var, java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k60 k60Var, yz5.a aVar, ow2.h hVar, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            k60Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k60.f216457d;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k60 k60Var2 = k60Var;
        if ((i17 & 16) != 0) {
            aVar = null;
        }
        yz5.a aVar2 = aVar;
        if ((i17 & 32) != 0) {
            hVar = c15477xbd78f833.f215181s;
        }
        c15477xbd78f833.Z6(s0Var, list, c15188xd8bd4bd, k60Var2, aVar2, hVar);
    }

    public final void O6(in5.s0 s0Var, android.view.MotionEvent motionEvent, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 c15379x1d4ea971, yz5.l lVar) {
        android.view.View p17;
        this.f215185w = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedControlUIC", "showLockSpeedArea");
        android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.uql);
        if (p18 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "showLockSpeedArea", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "showLockSpeedArea", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        Q6(s0Var, this.f215184v, false);
        android.graphics.Rect rect = new android.graphics.Rect();
        in5.s0 V6 = V6();
        if (V6 != null && (p17 = V6.p(com.p314xaae8f345.mm.R.id.uql)) != null) {
            p17.getGlobalVisibleRect(rect);
        }
        if (rect.height() == 0) {
            rect.set(0, m80379x76847179().getResources().getDisplayMetrics().heightPixels - ((int) m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.by)), m80379x76847179().getResources().getDisplayMetrics().widthPixels, m80379x76847179().getResources().getDisplayMetrics().heightPixels);
        }
        float f17 = this.f215184v;
        ow2.a aVar = this.f215182t;
        aVar.c(f17, motionEvent, rect);
        if (!(this.f215184v == 1.0f)) {
            aVar.f430903g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o50(this, lVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p50 p50Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p50.f217050d;
        ow2.h hVar = this.f215181s;
        hVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15348xd72dc333 e17 = hVar.e();
        if (e17 != null) {
            e17.m62388xd77827d4(p50Var);
        }
        aVar.f430904h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q50(this, s0Var);
        aVar.f430905i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.r50(this, s0Var);
        aVar.f430906j = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s50(this, s0Var);
        if (c15379x1d4ea971 != null) {
            c15379x1d4ea971.m62503x64af001c(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t50((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) s0Var.p(com.p314xaae8f345.mm.R.id.ghd), this, c15379x1d4ea971));
        }
    }

    public final void Q6(in5.s0 s0Var, float f17, boolean z17) {
        android.view.View p17;
        java.lang.String string;
        android.view.View p18;
        java.lang.String string2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedControlUIC", "changeLockAreaState " + z17);
        android.view.View p19 = s0Var.p(com.p314xaae8f345.mm.R.id.uql);
        if (p19 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p19, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "changeLockAreaState", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "changeLockAreaState", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.getLayoutParams().height = (int) ((s0Var.p(com.p314xaae8f345.mm.R.id.gbz) != null ? r6.getHeight() : 0) + m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1));
        p19.requestLayout();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.p(com.p314xaae8f345.mm.R.id.tqz);
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(0);
        }
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f566398tr1);
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (!z17) {
            android.view.View p27 = s0Var.p(com.p314xaae8f345.mm.R.id.mhc);
            if (p27 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p27, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "changeLockAreaState", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                p27.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(p27, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "changeLockAreaState", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.p(com.p314xaae8f345.mm.R.id.tqz);
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.m82040x7541828(m80379x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adi));
            }
            android.widget.TextView textView2 = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f566398tr1);
            if (textView2 != null) {
                if (f17 == 1.0f) {
                    string = m80379x76847179().getString(U6() ? com.p314xaae8f345.mm.R.C30867xcad56011.p5i : com.p314xaae8f345.mm.R.C30867xcad56011.o1z);
                } else {
                    string = m80379x76847179().getString(U6() ? com.p314xaae8f345.mm.R.C30867xcad56011.p5j : com.p314xaae8f345.mm.R.C30867xcad56011.f573617o20, b7(f17));
                }
                textView2.setText(string);
            }
            i95.m c17 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.M1().r()).booleanValue() && (p17 = s0Var.p(com.p314xaae8f345.mm.R.id.u3d)) != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "changeLockAreaState", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "changeLockAreaState", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView3 = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f566398tr1);
            if (textView3 != null) {
                textView3.setTextColor(m80379x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adi));
            }
            p19.setBackground(m80379x76847179().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f560693rk));
            return;
        }
        android.view.View p28 = s0Var.p(com.p314xaae8f345.mm.R.id.mhc);
        if (p28 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p28, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "changeLockAreaState", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p28.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "changeLockAreaState", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.p(com.p314xaae8f345.mm.R.id.tqz);
        if (c22699x3dcdb3523 != null) {
            c22699x3dcdb3523.m82040x7541828(m80379x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        }
        android.widget.TextView textView4 = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f566398tr1);
        if (textView4 != null) {
            if (f17 == 1.0f) {
                string2 = m80379x76847179().getString(U6() ? com.p314xaae8f345.mm.R.C30867xcad56011.p5k : com.p314xaae8f345.mm.R.C30867xcad56011.f573621o24);
            } else {
                string2 = m80379x76847179().getString(U6() ? com.p314xaae8f345.mm.R.C30867xcad56011.p5l : com.p314xaae8f345.mm.R.C30867xcad56011.f573622o25, b7(f17));
            }
            textView4.setText(string2);
        }
        i95.m c18 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.M1().r()).booleanValue() && (p18 = s0Var.p(com.p314xaae8f345.mm.R.id.u3d)) != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p18, arrayList5.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "changeLockAreaState", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "changeLockAreaState", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView5 = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f566398tr1);
        if (textView5 != null) {
            textView5.setTextColor(m80379x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        }
        p19.setBackground(m80379x76847179().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
        hc2.f1.x(s0Var.f3639x46306858);
    }

    public final void R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd targetVideoView) {
        float floatValue;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetVideoView, "targetVideoView");
        float playSpeedRatio = targetVideoView.getPlaySpeedRatio();
        jz5.g gVar = this.f215170e;
        int indexOf = ((java.util.ArrayList) ((jz5.n) gVar).mo141623x754a37bb()).indexOf(java.lang.Float.valueOf(playSpeedRatio));
        if (indexOf == -1) {
            floatValue = 1.0f;
        } else {
            int i18 = indexOf + 1;
            if (i18 >= ((java.util.ArrayList) ((jz5.n) gVar).mo141623x754a37bb()).size()) {
                i18 = 0;
            }
            java.lang.Object obj = ((java.util.ArrayList) ((jz5.n) gVar).mo141623x754a37bb()).get(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            floatValue = ((java.lang.Number) obj).floatValue();
        }
        targetVideoView.m61420xeb2d9731(floatValue);
        if (floatValue == 0.5f) {
            i17 = com.p314xaae8f345.mm.R.raw.f80041x58acb40d;
        } else {
            if (!(floatValue == 1.0f)) {
                if (floatValue == 1.5f) {
                    i17 = com.p314xaae8f345.mm.R.raw.f80043x58acb7ce;
                } else {
                    if (floatValue == 2.0f) {
                        i17 = com.p314xaae8f345.mm.R.raw.f80044xdb98d219;
                    }
                }
            }
            i17 = com.p314xaae8f345.mm.R.raw.f80042xdb98d218;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.iqj);
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setImageResource(i17);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f567864kx3);
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setImageResource(i17);
        }
        db5.t7.m123883x26a183b(m158354x19263085(), m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gix, java.lang.Float.valueOf(floatValue)), 0).show();
    }

    public final void S6(in5.s0 holder) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        android.view.ViewParent parent;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f;
        lw2.m videoScaleCleanHelper;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d808;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 m62197x3d6fab31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (this.f215173h == null) {
            return;
        }
        if ((m80379x76847179() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) && (c15359x536ace78 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.f569103p16)) != null) {
            c15359x536ace78.m62442xecae6946(((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.W0().r()).intValue() == 1);
        }
        if (!this.f215185w && this.f215176n != null) {
            so2.j5 j5Var = (so2.j5) holder.f374658i;
            if ((j5Var != null && j5Var.h() == 2) && (c15324x3354d808 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) holder.p(com.p314xaae8f345.mm.R.id.fs6)) != null && (m62197x3d6fab31 = c15324x3354d808.m62197x3d6fab31()) != null) {
                m62197x3d6fab31.m62722xa6fb01c1(this.f215174i);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) holder.p(com.p314xaae8f345.mm.R.id.e_k);
            cw2.da videoView = c15196x85976f5f2 != null ? c15196x85976f5f2.getVideoView() : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView : null;
            if (c15188xd8bd4bd != null) {
                c15188xd8bd4bd.m61420xeb2d9731(this.f215174i);
            }
            hc2.f1.x(holder.f3639x46306858);
            float f17 = this.f215174i;
            if (f17 == 1.0f) {
                this.f215181s.f(holder, false);
                b(holder);
            } else {
                ow2.h.k(this.f215181s, holder, f17, null, false, 12, null);
                a(holder);
            }
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.M1().r()).booleanValue()) {
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.u3d);
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "finishSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "finishSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.h6o);
            if (p18 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "finishSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "finishSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        so2.j5 j5Var2 = (so2.j5) holder.f374658i;
        long mo2128x1ed62e84 = j5Var2 != null ? j5Var2.mo2128x1ed62e84() : 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) holder.p(com.p314xaae8f345.mm.R.id.e_k);
        if (!(c15196x85976f5f3 != null && c15196x85976f5f3.D())) {
            android.view.View T6 = T6();
            if (T6 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(T6, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "finishSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                T6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(T6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "finishSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            in5.s0 V6 = V6();
            if (V6 != null && (c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) V6.p(com.p314xaae8f345.mm.R.id.e_k)) != null && (videoScaleCleanHelper = c15196x85976f5f.getVideoScaleCleanHelper()) != null) {
                videoScaleCleanHelper.i();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) holder.p(com.p314xaae8f345.mm.R.id.ghd);
            if (c15178x4303ff90 != null) {
                c15178x4303ff90.G();
            }
        }
        this.f215173h = null;
        this.f215174i = 1.0f;
        this.f215183u = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d8082 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) holder.p(com.p314xaae8f345.mm.R.id.fs6);
        android.view.ViewParent parent2 = (c15324x3354d8082 == null || (parent = c15324x3354d8082.getParent()) == null) ? null : parent.getParent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 c15285xe7032952 = parent2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952) parent2 : null;
        W6(holder);
        ow2.a aVar = this.f215182t;
        aVar.f430898b = 0.0f;
        aVar.f430900d = 1.0f;
        aVar.f430902f = false;
        aVar.f430903g = null;
        aVar.f430904h = null;
        aVar.f430905i = null;
        aVar.f430906j = null;
        if (c15285xe7032952 != null) {
            c15285xe7032952.m62503x64af001c(null);
        }
        if (mo2128x1ed62e84 == 0 || this.f215176n == null) {
            return;
        }
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V62 = nyVar != null ? nyVar.V6() : null;
        android.view.MotionEvent motionEvent = this.f215176n;
        java.lang.Number valueOf = motionEvent != null ? java.lang.Float.valueOf(motionEvent.getX()) : 0;
        android.view.MotionEvent motionEvent2 = this.f215176n;
        java.lang.Number valueOf2 = motionEvent2 != null ? java.lang.Float.valueOf(motionEvent2.getY()) : 0;
        float f18 = 100;
        int floatValue = (int) ((valueOf.floatValue() / m80379x76847179().getResources().getDisplayMetrics().widthPixels) * f18);
        int floatValue2 = (int) ((valueOf2.floatValue() / m80379x76847179().getResources().getDisplayMetrics().heightPixels) * f18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedid", pm0.v.u(mo2128x1ed62e84));
        jSONObject.put("push_time", java.lang.System.currentTimeMillis() - this.f215175m);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(floatValue);
        sb6.append('_');
        sb6.append(floatValue2);
        jSONObject.put("push_area", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, V62, "video_card", 4, jSONObject, false, null, 48, null);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("long_press_accelerate_play", null, P6(this, holder, this.f215184v, true, this.f215185w, false, 16, null), 1, false);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str2 = "";
        if (V62 == null || (str = V62.m75945x2fec8307(2)) == null) {
            str = "";
        }
        hashMap.put("finder_tab_context_id", str);
        if (V62 != null && (m75945x2fec8307 = V62.m75945x2fec8307(1)) != null) {
            str2 = m75945x2fec8307;
        }
        hashMap.put("finder_context_id", str2);
        hashMap.put("comment_scene", java.lang.Integer.valueOf(V62 != null ? V62.m75939xb282bd08(5) : 0));
        hashMap.put("accelerate_type", java.lang.Float.valueOf(this.f215184v));
        hashMap.put("feed_id", pm0.v.u(mo2128x1ed62e84));
        hashMap.put("accelerate_duration", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f215175m));
        hashMap.put("accelerate_leave_type", java.lang.Integer.valueOf(this.f215185w ? 1 : 2));
        ((cy1.a) rVar).yj("long_press_temporary_accelerate_play", null, hashMap, 1, false);
    }

    public final android.view.View T6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl.class);
        if (blVar != null) {
            android.view.View mo144222x4ff8c0f0 = blVar.f215425e != null ? blVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.e5c) : null;
            if (mo144222x4ff8c0f0 != null) {
                return mo144222x4ff8c0f0;
            }
        }
        return m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.ggn);
    }

    public final boolean U6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.L3).mo141623x754a37bb()).r()).booleanValue();
    }

    public final in5.s0 V6() {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        if (m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            android.view.View m7474xfb86a31b = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).m63052x8f02c6c().m7474xfb86a31b();
            c22801x87cbdc00 = m7474xfb86a31b != null ? (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) m7474xfb86a31b.findViewById(com.p314xaae8f345.mm.R.id.m6e) : null;
        } else {
            c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.m6e);
        }
        if (c22801x87cbdc00 == null || (m82555x4905e9fa = c22801x87cbdc00.m82555x4905e9fa()) == null) {
            return null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m82555x4905e9fa.getLayoutManager();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager : null;
        if (c15415x74224fd8 == null) {
            return null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = m82555x4905e9fa.p0(c15415x74224fd8.w());
        in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
        boolean z17 = false;
        if (s0Var != null && s0Var.m8185xcdaf1228() == 4) {
            z17 = true;
        }
        if (z17) {
            return s0Var;
        }
        return null;
    }

    public final void W6(in5.s0 s0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedControlUIC", "hideLockSpeedArea");
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.uql);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "hideLockSpeedArea", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "hideLockSpeedArea", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setBackground(m80379x76847179().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f560693rk));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.p(com.p314xaae8f345.mm.R.id.tqz);
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(8);
        }
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f566398tr1);
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    public final void X6(in5.s0 holder) {
        jz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        so2.j5 j5Var = (so2.j5) holder.f374658i;
        if (j5Var != null) {
            if (j5Var.h() == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d808 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) holder.p(com.p314xaae8f345.mm.R.id.fs6);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 m62197x3d6fab31 = c15324x3354d808 != null ? c15324x3354d808.m62197x3d6fab31() : null;
                lVar = new jz5.l(java.lang.Float.valueOf(m62197x3d6fab31 != null ? m62197x3d6fab31.getCurLoopSpeed() : 1.0f), java.lang.Boolean.valueOf(m62197x3d6fab31 != null && m62197x3d6fab31.f213857v));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) holder.p(com.p314xaae8f345.mm.R.id.e_k);
                zy2.g5 videoView = c15196x85976f5f != null ? c15196x85976f5f.getVideoView() : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView : null;
                lVar = new jz5.l(java.lang.Float.valueOf(c15188xd8bd4bd != null ? c15188xd8bd4bd.getPlaySpeedRatio() : 1.0f), java.lang.Boolean.valueOf(c15188xd8bd4bd != null && c15188xd8bd4bd.mo58787xc00617a4()));
            }
            float floatValue = ((java.lang.Number) lVar.f384366d).floatValue();
            boolean booleanValue = ((java.lang.Boolean) lVar.f384367e).booleanValue();
            if ((floatValue == 1.0f) || !booleanValue) {
                this.f215181s.f(holder, false);
                b(holder);
            } else {
                ow2.h.k(this.f215181s, holder, floatValue, null, false, 12, null);
                a(holder);
            }
        }
    }

    public final void Y6(float f17) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (f17 == 3.0f) {
            i17 = 6;
        } else {
            i17 = f17 == 1.25f ? 5 : (int) (f17 * 2);
        }
        jSONObject.put("speedplay_click_result", i17);
        java.lang.Long l17 = this.f215172g;
        if (l17 != null) {
            jSONObject.put("feedid", pm0.v.u(l17.longValue()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, V6, "speedplayresult", 1, jSONObject, false, null, 48, null);
        this.f215172g = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x037d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6(in5.s0 r19, java.util.List r20, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd r21, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k60 r22, yz5.a r23, ow2.h r24) {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.Z6(in5.s0, java.util.List, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, com.tencent.mm.plugin.finder.viewmodel.component.k60, yz5.a, ow2.h):void");
    }

    public final void a(in5.s0 s0Var) {
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.tty);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "hidePromotion", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "hidePromotion", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.te_);
        if (p18 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "hidePromotion", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "hidePromotion", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r0.m59319xdd99097b() == true) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(in5.s0 r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r12.f374658i
            boolean r1 = r0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5
            if (r1 == 0) goto L9
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) r0
            goto La
        L9:
            r0 = 0
        La:
            r1 = 0
            if (r0 == 0) goto L1b
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.getFeedObject()
            if (r0 == 0) goto L1b
            boolean r0 = r0.m59319xdd99097b()
            r2 = 1
            if (r0 != r2) goto L1b
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L6a
            r0 = 2131308222(0x7f092ebe, float:1.8234693E38)
            android.view.View r0 = r12.p(r0)
            if (r0 != 0) goto L28
            goto L6a
        L28:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.ThreadLocal r2 = zj0.c.f554818a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r10.add(r2)
            java.util.Collections.reverse(r10)
            java.lang.Object[] r3 = r10.toArray()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC"
            java.lang.String r5 = "showPromotion"
            java.lang.String r6 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r0
            yj0.a.d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r10.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC"
            java.lang.String r4 = "showPromotion"
            java.lang.String r5 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r0
            yj0.a.f(r2, r3, r4, r5, r6, r7, r8)
        L6a:
            r0 = 2131305380(0x7f0923a4, float:1.822893E38)
            android.view.View r12 = r12.p(r0)
            if (r12 != 0) goto L74
            goto Lb6
        L74:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.ThreadLocal r2 = zj0.c.f554818a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.add(r2)
            java.util.Collections.reverse(r0)
            java.lang.Object[] r3 = r0.toArray()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC"
            java.lang.String r5 = "showPromotion"
            java.lang.String r6 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r12
            yj0.a.d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12.setVisibility(r0)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC"
            java.lang.String r4 = "showPromotion"
            java.lang.String r5 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r12
            yj0.a.f(r2, r3, r4, r5, r6, r7, r8)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.b(in5.s0):void");
    }

    public final java.lang.String b7(float f17) {
        return f17 % ((float) 1) == 0.0f ? java.lang.String.valueOf((int) f17) : java.lang.String.valueOf(f17);
    }

    public final void c7(in5.s0 holder, android.view.MotionEvent motionEvent, int i17) {
        android.view.ViewParent parent;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 m62197x3d6fab31;
        float f17;
        android.view.View p17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f;
        lw2.m videoScaleCleanHelper;
        android.view.ViewParent parent2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        so2.j5 j5Var = (so2.j5) holder.f374658i;
        if (j5Var != null) {
            int h17 = j5Var.h();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) holder.p(com.p314xaae8f345.mm.R.id.ghd);
            if (c15178x4303ff90 != null && c15178x4303ff90.isSeekMode && !c15178x4303ff90.isPendingExitMode) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90.I(c15178x4303ff90, "LongPress", false, 2, null);
            }
            this.f215173h = holder;
            this.f215175m = java.lang.System.currentTimeMillis();
            this.f215177o = java.lang.System.currentTimeMillis();
            this.f215176n = motionEvent;
            if ((m80379x76847179() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) && (c15359x536ace78 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.f569103p16)) != null) {
                c15359x536ace78.m62442xecae6946(false);
            }
            if (h17 == 2) {
                this.f215178p = 0L;
            } else if (h17 == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) holder.p(com.p314xaae8f345.mm.R.id.e_k);
                cw2.da videoView = c15196x85976f5f2 != null ? c15196x85976f5f2.getVideoView() : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView : null;
                this.f215178p = c15188xd8bd4bd != null ? c15188xd8bd4bd.mo56685x3d7f3f1d() : 0L;
            }
            this.f215179q = this.f215177o;
            this.f215180r = this.f215178p;
            if (h17 == 2) {
                android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.mhc);
                if (p18 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "triggerSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/MotionEvent;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(p18, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "triggerSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/MotionEvent;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d808 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) holder.p(com.p314xaae8f345.mm.R.id.fs6);
                if (c15324x3354d808 != null && (m62197x3d6fab31 = c15324x3354d808.m62197x3d6fab31()) != null) {
                    float curLoopSpeed = m62197x3d6fab31.getCurLoopSpeed();
                    this.f215174i = curLoopSpeed;
                    f17 = (curLoopSpeed > 1.0f ? 1 : (curLoopSpeed == 1.0f ? 0 : -1)) == 0 ? 2.0f : 1.0f;
                    this.f215184v = f17;
                    m62197x3d6fab31.m62722xa6fb01c1(f17);
                    m62197x3d6fab31.m();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d8082 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) holder.p(com.p314xaae8f345.mm.R.id.fs6);
                android.view.ViewParent parent3 = (c15324x3354d8082 == null || (parent = c15324x3354d8082.getParent()) == null) ? null : parent.getParent();
                O6(holder, motionEvent, parent3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952) parent3 : null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.c60(this, holder));
            } else if (h17 == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) holder.p(com.p314xaae8f345.mm.R.id.e_k);
                cw2.da videoView2 = c15196x85976f5f3 != null ? c15196x85976f5f3.getVideoView() : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2 = videoView2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView2 : null;
                if (c15188xd8bd4bd2 == null) {
                    return;
                }
                float playSpeedRatio = c15188xd8bd4bd2.getPlaySpeedRatio();
                this.f215174i = playSpeedRatio;
                f17 = (playSpeedRatio > 1.0f ? 1 : (playSpeedRatio == 1.0f ? 0 : -1)) == 0 ? 2.0f : 1.0f;
                this.f215184v = f17;
                c15188xd8bd4bd2.m61420xeb2d9731(f17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d8083 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) holder.p(com.p314xaae8f345.mm.R.id.fs6);
                android.view.ViewParent parent4 = (c15324x3354d8083 == null || (parent2 = c15324x3354d8083.getParent()) == null) ? null : parent2.getParent();
                O6(holder, motionEvent, parent4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971) parent4 : null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d60(this, holder, c15188xd8bd4bd2));
            }
            android.view.View T6 = T6();
            if (T6 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(T6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "triggerSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/MotionEvent;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                T6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(T6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "triggerSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/MotionEvent;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            float f18 = this.f215184v;
            ow2.h.k(this.f215181s, holder, f18, (f18 > 1.0f ? 1 : (f18 == 1.0f ? 0 : -1)) == 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213186e : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213185d, false, 8, null);
            a(holder);
            hc2.f1.x(holder.f3639x46306858);
            in5.s0 V6 = V6();
            if (V6 != null && (c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) V6.p(com.p314xaae8f345.mm.R.id.e_k)) != null && (videoScaleCleanHelper = c15196x85976f5f.getVideoScaleCleanHelper()) != null) {
                videoScaleCleanHelper.a(false, true);
            }
            i95.m c17 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.M1().r()).booleanValue() && (p17 = holder.p(com.p314xaae8f345.mm.R.id.h6o)) != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "triggerSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/MotionEvent;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "triggerSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/MotionEvent;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f215183u = true;
            android.content.Context context = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d647 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.class);
            if (c15442xfd56d647 != null) {
                cq.k1.a();
                if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209390o6).mo141623x754a37bb()).r()).booleanValue()) {
                    bb2.a1 a1Var = c15442xfd56d647.f215037q;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13683xee96bb27 c13683xee96bb27 = a1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13683xee96bb27 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13683xee96bb27) a1Var : null;
                    if (c13683xee96bb27 != null) {
                        c13683xee96bb27.j();
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f;
        lw2.m videoScaleCleanHelper;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f2;
        jz5.g gVar = this.f215169d;
        boolean z17 = false;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.x60) ((jz5.n) gVar).mo141623x754a37bb()).f217939c != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.x60.c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.x60) ((jz5.n) gVar).mo141623x754a37bb(), true, true, 0.0f, 4, null);
            return true;
        }
        in5.s0 V6 = V6();
        if (V6 != null && (c15196x85976f5f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) V6.p(com.p314xaae8f345.mm.R.id.e_k)) != null && c15196x85976f5f2.D()) {
            z17 = true;
        }
        if (!z17) {
            return super.mo2274xbdc3c5dc();
        }
        in5.s0 V62 = V6();
        if (V62 != null && (c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) V62.p(com.p314xaae8f345.mm.R.id.e_k)) != null && (videoScaleCleanHelper = c15196x85976f5f.getVideoScaleCleanHelper()) != null) {
            videoScaleCleanHelper.i();
            videoScaleCleanHelper.h(64, true);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        mo48814x2efc64();
    }
}
