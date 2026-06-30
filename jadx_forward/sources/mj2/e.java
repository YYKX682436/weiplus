package mj2;

/* loaded from: classes10.dex */
public abstract class e implements android.view.View.OnClickListener, si2.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f408546d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f408547e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f408548f;

    /* renamed from: g, reason: collision with root package name */
    public final zh2.c f408549g;

    /* renamed from: h, reason: collision with root package name */
    public final zh2.e f408550h;

    /* renamed from: i, reason: collision with root package name */
    public final zh2.d f408551i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f408552m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f408553n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f408554o;

    /* renamed from: p, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f408555p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f408556q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f408557r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f408558s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f408559t;

    /* renamed from: u, reason: collision with root package name */
    public final yh2.j f408560u;

    public e(android.content.Context context, gk2.e liveData, android.view.View root, zh2.c pluginAbility, zh2.e micUserInterface, zh2.d dVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUserInterface, "micUserInterface");
        this.f408546d = context;
        this.f408547e = liveData;
        this.f408548f = root;
        this.f408549g = pluginAbility;
        this.f408550h = micUserInterface;
        this.f408551i = dVar;
        this.f408552m = l();
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.fkj);
        this.f408553n = findViewById;
        this.f408554o = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.quy);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) root.findViewById(com.p314xaae8f345.mm.R.id.qs7);
        this.f408555p = c1163xf1deaba4;
        this.f408556q = root.findViewById(com.p314xaae8f345.mm.R.id.eku);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f408557r = arrayList;
        this.f408558s = new java.util.ArrayList();
        this.f408559t = jz5.h.b(new mj2.c(this));
        yh2.j jVar = new yh2.j(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.pk.p1509xbeeb310a.C14241x3314254d(liveData, new mj2.a(this)), arrayList);
        this.f408560u = jVar;
        c1163xf1deaba4.setNestedScrollingEnabled(false);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        c1163xf1deaba4.mo7960x6cab2c8d(jVar);
        findViewById.setOnClickListener(this);
    }

    public mi2.h j() {
        return new mi2.h(this.f408546d, this.f408549g, new mj2.b(this));
    }

    public void k(java.lang.String source) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f408558s.clear();
        java.util.ArrayList arrayList2 = this.f408558s;
        java.util.List list = ((mm2.o4) this.f408547e.a(mm2.o4.class)).f410860v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj).f390722t, java.lang.Boolean.TRUE)) {
                    arrayList.add(obj);
                }
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(new vi2.j((km2.q) it.next()));
        }
        arrayList2.addAll(arrayList3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f408552m, "fillApplyLinkUserList source: " + source + " applyRealSize: " + this.f408558s.size() + " audienceLinkMicUserList: " + ((mm2.o4) this.f408547e.a(mm2.o4.class)).f410860v);
        this.f408557r.clear();
        this.f408557r.addAll(this.f408558s);
    }

    public java.lang.String l() {
        return "VisitorAcceptPanelWidget";
    }

    public void m() {
        this.f408549g.i();
    }

    public void n(int i17, km2.q hungupUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hungupUser, "hungupUser");
        if (i17 == -1 || i17 >= this.f408560u.mo1894x7e414b06()) {
            return;
        }
        hungupUser.z();
        ((mm2.o4) this.f408547e.a(mm2.o4.class)).O7(hungupUser);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.u7) this.f408550h).b(hungupUser);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055 A[EDGE_INSN: B:20:0x0055->B:21:0x0055 BREAK  A[LOOP:0: B:8:0x002b->B:38:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[LOOP:0: B:8:0x002b->B:38:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca A[EDGE_INSN: B:67:0x00ca->B:68:0x00ca BREAK  A[LOOP:1: B:55:0x00a0->B:78:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[LOOP:1: B:55:0x00a0->B:78:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(boolean r9, km2.q r10) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mj2.e.o(boolean, km2.q):void");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        kn0.p pVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveBaseVisitorAcceptPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.fkj) {
            tn0.w0 h17 = this.f408549g.h();
            boolean z17 = true;
            if ((h17 == null || (pVar = h17.D) == null || !pVar.f391122i) ? false : true) {
                android.content.Context context = this.f408546d;
                db5.t7.m(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mlm));
                z17 = false;
            }
            if (!z17) {
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveBaseVisitorAcceptPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                fj2.s.c(fj2.s.f344716a, ml2.q2.f409373y, null, null, 0, 0, 30, null);
                ((mi2.h) ((jz5.n) this.f408559t).mo141623x754a37bb()).F();
                m();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveBaseVisitorAcceptPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void p() {
        android.view.View view = this.f408556q;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveBaseVisitorAcceptPanelWidget", "showContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveBaseVisitorAcceptPanelWidget", "showContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f408555p.setVisibility(0);
        this.f408554o.setText(this.f408546d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzc, java.lang.Integer.valueOf(this.f408558s.size())));
    }

    public void q() {
        android.view.View view = this.f408556q;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveBaseVisitorAcceptPanelWidget", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveBaseVisitorAcceptPanelWidget", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f408555p.setVisibility(8);
        this.f408554o.setText(this.f408546d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573209m00));
    }

    public void r(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        k(source);
        this.f408560u.m8146xced61ae5();
        if (this.f408558s.size() > 0) {
            p();
        } else {
            q();
        }
    }
}
