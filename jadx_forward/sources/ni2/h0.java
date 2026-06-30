package ni2;

/* loaded from: classes10.dex */
public class h0 implements android.view.View.OnClickListener {
    public xh2.c A;
    public final bj2.b B;
    public int C;
    public final jz5.g D;
    public final aj2.f E;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f418838d;

    /* renamed from: e, reason: collision with root package name */
    public final zh2.c f418839e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f418840f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f418841g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f418842h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f418843i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f418844m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f418845n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f418846o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f418847p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f418848q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f418849r;

    /* renamed from: s, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f418850s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f418851t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f418852u;

    /* renamed from: v, reason: collision with root package name */
    public int f418853v;

    /* renamed from: w, reason: collision with root package name */
    public int f418854w;

    /* renamed from: x, reason: collision with root package name */
    public int f418855x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.LinkedList f418856y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Integer f418857z;

    public h0(android.view.View rootView, zh2.c pluginAbility, yz5.p notifyViewClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyViewClick, "notifyViewClick");
        this.f418838d = rootView;
        this.f418839e = pluginAbility;
        this.f418840f = notifyViewClick;
        android.content.Context context = rootView.getContext();
        this.f418841g = context;
        this.f418842h = rootView.findViewById(com.p314xaae8f345.mm.R.id.f567861kx0);
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.juw);
        this.f418843i = findViewById;
        this.f418844m = rootView.findViewById(com.p314xaae8f345.mm.R.id.jux);
        this.f418845n = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.juz);
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.jiy);
        this.f418846o = findViewById2;
        this.f418847p = rootView.findViewById(com.p314xaae8f345.mm.R.id.jiz);
        this.f418848q = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.f567451jj1);
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.fam);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 c22840x82866af5 = (com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.g_q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById4;
        this.f418849r = viewOnClickListenerC22631x1cc07cc8;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) rootView.findViewById(com.p314xaae8f345.mm.R.id.f566258fa1);
        this.f418850s = c1163xf1deaba4;
        java.lang.String str = ((mm2.e1) pluginAbility.g().a(mm2.e1.class)).f410520q.f461834n;
        str = str == null ? "" : str;
        this.f418851t = str;
        this.f418852u = str;
        this.f418853v = 1;
        this.f418854w = 1;
        this.f418855x = 1;
        jz5.g b17 = jz5.h.b(new ni2.g0(this));
        this.D = b17;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "context");
        this.B = new bj2.b(context, pluginAbility, c22840x82866af5);
        aj2.f fVar = new aj2.f((java.util.ArrayList) ((jz5.n) b17).mo141623x754a37bb(), str, new ni2.e0(this));
        this.E = fVar;
        c1163xf1deaba4.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1508x6580a04.C14235xc8ce86e6(context));
        c1163xf1deaba4.mo7960x6cab2c8d(fVar);
        viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new ni2.f0(this));
    }

    public final java.util.LinkedList a() {
        android.view.View view = this.f418844m;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToGrabFocusMicMode", "()Ljava/util/LinkedList;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToGrabFocusMicMode", "()Ljava/util/LinkedList;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f418847p;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToGrabFocusMicMode", "()Ljava/util/LinkedList;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToGrabFocusMicMode", "()Ljava/util/LinkedList;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f418850s.setVisibility(0);
        xh2.c cVar = this.A;
        if (cVar == null) {
            return null;
        }
        java.lang.String str = this.f418852u;
        return this.B.b(4, cVar.f536064a, str);
    }

    public final void b(boolean z17) {
        android.view.View view = this.f418844m;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToGrabMicMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToGrabMicMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f418847p;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToGrabMicMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToGrabMicMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f418850s.setVisibility(8);
        if (!z17) {
            this.f418852u = this.f418851t;
        }
        xh2.c cVar = this.A;
        if (cVar != null) {
            int i17 = bj2.b.f102674h;
            this.B.b(3, cVar.f536064a, "");
        }
    }

    public final java.util.LinkedList c() {
        android.view.View view = this.f418844m;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToNormalFocusMicMode", "()Ljava/util/LinkedList;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToNormalFocusMicMode", "()Ljava/util/LinkedList;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f418847p;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToNormalFocusMicMode", "()Ljava/util/LinkedList;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToNormalFocusMicMode", "()Ljava/util/LinkedList;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f418850s.setVisibility(0);
        xh2.c cVar = this.A;
        if (cVar == null) {
            return null;
        }
        java.lang.String str = this.f418852u;
        return this.B.b(2, cVar.f536064a, str);
    }

    public final void d(boolean z17) {
        android.view.View view = this.f418844m;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToNormalMicMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToNormalMicMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f418847p;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToNormalMicMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "changeToNormalMicMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f418850s.setVisibility(8);
        if (!z17) {
            this.f418852u = this.f418851t;
        }
        xh2.c cVar = this.A;
        if (cVar != null) {
            int i17 = bj2.b.f102674h;
            this.B.b(1, cVar.f536064a, "");
        }
    }

    public final void e(boolean z17) {
        int i17;
        int i18 = this.C;
        int i19 = this.f418854w;
        if (i19 == 3) {
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            i17 = (i18 & (-65)) | 32;
        } else if (i19 != 4) {
            java.util.regex.Pattern pattern2 = pm0.v.f438335a;
            i17 = i18 & (-33) & (-65);
        } else {
            java.util.regex.Pattern pattern3 = pm0.v.f438335a;
            i17 = (i18 & (-33)) | 64;
        }
        this.f418840f.mo149xb9724478(java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
    }

    public final boolean f() {
        if (!((mm2.y2) this.f418839e.g().a(mm2.y2.class)).Y6()) {
            return true;
        }
        android.content.Context context = this.f418841g;
        db5.t7.m(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d8j));
        return false;
    }

    public final void g(java.util.ArrayList arrayList) {
        jz5.g gVar = this.D;
        ((java.util.ArrayList) ((jz5.n) gVar).mo141623x754a37bb()).clear();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) ((jz5.n) gVar).mo141623x754a37bb();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            km2.q qVar = (km2.q) it.next();
            arrayList3.add(new aj2.a(qVar, p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar.f390703a, this.f418852u), false, false, 12, null));
        }
        arrayList2.addAll(arrayList3);
        ((java.util.ArrayList) ((jz5.n) gVar).mo141623x754a37bb()).add(0, new aj2.a(new km2.q(this.f418851t, null, null, null, 0, null, null, false, 0, null, null, 0, 0, false, null, false, 0L, null, false, null, null, 0, 0, 0L, null, null, 0L, null, 0, 0L, null, null, null, -64, 1, null), p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f418851t, this.f418852u), false, false, 12, null));
        aj2.f fVar = this.E;
        if (fVar != null) {
            fVar.m8146xced61ae5();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("focusSelectAdapter");
            throw null;
        }
    }

    public final void h() {
        this.f418856y = null;
        this.f418857z = null;
        bj2.b bVar = this.B;
        if (bVar != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 c22840x82866af5 = bVar.f102676b;
            int childCount = c22840x82866af5.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = c22840x82866af5.getChildAt(i17);
                if (childAt != null && (childAt instanceof cj2.h)) {
                    ((cj2.h) childAt).c();
                }
            }
        }
    }

    public final boolean i() {
        if (!f()) {
            return false;
        }
        bj2.b bVar = this.B;
        java.util.LinkedList linkedList = bVar.f102680f;
        if (linkedList != null) {
            java.util.LinkedList linkedList2 = ((mm2.y2) bVar.f102675a.g().a(mm2.y2.class)).f411092i;
            linkedList2.clear();
            linkedList2.addAll(linkedList);
        }
        fj2.s.c(fj2.s.f344716a, ml2.q2.f409370x, java.lang.String.valueOf(this.f418855x), this.f418849r.f292896x ? "1" : "2", 0, 0, 24, null);
        return true;
    }

    public final void j(r45.il4 micSetting, xh2.c micData, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micSetting, "micSetting");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micData, "micData");
        this.C = i17;
        this.A = micData.a();
        xh2.a aVar = (xh2.a) kz5.n0.Z(micData.f536064a);
        this.f418852u = aVar != null ? aVar.b() : this.f418851t;
        int i18 = micData.f536066c;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.f418849r;
        int i19 = 2;
        boolean z17 = true;
        if (i18 != 1) {
            int i27 = 3;
            if (i18 == 2) {
                b(true);
                this.f418855x = 2;
                viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(false);
            } else if (i18 != 3) {
                d(true);
                this.f418855x = 1;
                viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(false);
                i19 = 1;
            } else {
                i27 = 4;
                l(4, a());
                this.f418855x = 2;
                viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(true);
            }
            i19 = i27;
        } else {
            l(2, c());
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(true);
            this.f418855x = 1;
        }
        this.f418853v = i19;
        this.f418854w = i19;
        zh2.c cVar = this.f418839e;
        k(cVar.g());
        r45.kl4 kl4Var = ((mm2.y2) cVar.g().a(mm2.y2.class)).f411095o;
        java.lang.String m75945x2fec8307 = kl4Var != null ? kl4Var.m75945x2fec8307(0) : null;
        boolean z18 = m75945x2fec8307 == null || m75945x2fec8307.length() == 0;
        android.content.Context context = this.f418841g;
        if (z18) {
            m75945x2fec8307 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dvj);
        }
        android.widget.TextView textView = this.f418845n;
        if (textView != null) {
            textView.setText(m75945x2fec8307);
        }
        r45.kl4 kl4Var2 = ((mm2.y2) cVar.g().a(mm2.y2.class)).f411095o;
        java.lang.String m75945x2fec83072 = kl4Var2 != null ? kl4Var2.m75945x2fec8307(1) : null;
        if (m75945x2fec83072 != null && m75945x2fec83072.length() != 0) {
            z17 = false;
        }
        if (z17) {
            m75945x2fec83072 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573202dv2);
        }
        android.widget.TextView textView2 = this.f418848q;
        if (textView2 != null) {
            textView2.setText(m75945x2fec83072);
        }
        e(false);
    }

    public final void k(gk2.e buContext) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        int i17 = this.f418854w;
        if (i17 == 4 || i17 == 2) {
            java.util.List list = ((mm2.o4) buContext.a(mm2.o4.class)).f410851o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-linkMicUserList>(...)");
            synchronized (list) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (!((km2.q) obj).f390710h) {
                        arrayList.add(obj);
                    }
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i18 = ((km2.q) next).f390714l;
                if (i18 == 3 || i18 == 4) {
                    arrayList2.add(next);
                }
            }
            g(arrayList2);
            this.f418850s.setVisibility(0);
        }
    }

    public final void l(int i17, java.util.LinkedList linkedList) {
        if (this.f418856y == null) {
            this.f418856y = linkedList;
        }
        if (this.f418857z == null) {
            this.f418857z = java.lang.Integer.valueOf(i17);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.view.View view2 = this.f418846o;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, view2 != null ? java.lang.Integer.valueOf(view2.getId()) : null);
        int i17 = 2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.f418849r;
        if (!b17) {
            if (this.f418855x != 1) {
                viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(false);
            }
            this.f418855x = 1;
            if (viewOnClickListenerC22631x1cc07cc8.f292896x) {
                c();
            } else {
                d(false);
                i17 = 1;
            }
        } else {
            if (!f()) {
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (this.f418855x != 2) {
                viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(false);
            }
            this.f418855x = 2;
            if (viewOnClickListenerC22631x1cc07cc8.f292896x) {
                i17 = 4;
                l(4, a());
            } else {
                b(false);
                i17 = 3;
            }
        }
        this.f418854w = i17;
        k(this.f418839e.g());
        e(this.f418854w != this.f418853v);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
