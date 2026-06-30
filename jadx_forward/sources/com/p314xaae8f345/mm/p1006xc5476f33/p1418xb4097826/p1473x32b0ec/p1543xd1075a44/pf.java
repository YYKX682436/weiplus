package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class pf extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h1 implements android.view.View.OnClickListener {
    public final android.view.View A;
    public final android.view.View B;
    public final android.widget.TextView C;
    public final android.view.View D;
    public final android.widget.TextView E;
    public final android.widget.TextView F;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f200914z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f200914z = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aqb, (android.view.ViewGroup) this, false);
        android.view.View findViewById = mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.drg);
        this.A = findViewById;
        android.view.View findViewById2 = mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.dre);
        this.B = findViewById2;
        this.C = (android.widget.TextView) mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.dri);
        this.D = mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.krc);
        this.E = (android.widget.TextView) mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.ds6);
        android.widget.TextView joinBtn = (android.widget.TextView) mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.f566980hp5);
        this.F = joinBtn;
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        joinBtn.setOnClickListener(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(joinBtn, "joinBtn");
        m58110x3ab833d4(joinBtn);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h1
    public void c() {
        if (!m58052x24f779db()) {
            p3325xe03a0797.p3326xc267989b.l.d(this.f200025i, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d1(this, null), 3, null);
            return;
        }
        d();
        yz5.l m58051xf236f49c = m58051xf236f49c();
        if (m58051xf236f49c != null) {
            m58051xf236f49c.mo146xb9724478(m58049x38bbc4c());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h1
    public void e(gk2.e business, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0 fromScene) {
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(business, "business");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromScene, "fromScene");
        m58057x33ccff9a(business);
        m58064x5b4074e7(z17);
        m58060xf08e18e8(fromScene == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0.f193950g);
        m58061x5fdf7cc0(fromScene);
        ya2.b2 b17 = ya2.h.f542017a.b(((mm2.c1) business.a(mm2.c1.class)).f410385o);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = mo58053xfb84e958().getContext();
        android.content.Context context2 = mo58053xfb84e958().getContext();
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = "";
        objArr[0] = b17 != null ? b17.w0() : "";
        r45.eq1 eq1Var = ((mm2.n2) business.a(mm2.n2.class)).f410812g;
        if (eq1Var != null && (m75945x2fec8307 = eq1Var.m75945x2fec8307(0)) != null) {
            str = m75945x2fec8307;
        }
        objArr[1] = str;
        java.lang.String string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ddy, objArr);
        android.widget.TextView textView = this.C;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, string, textSize));
        android.content.Context context3 = mo58053xfb84e958().getContext();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        r45.eq1 eq1Var2 = ((mm2.n2) business.a(mm2.n2.class)).f410812g;
        objArr2[0] = java.lang.Integer.valueOf(eq1Var2 != null ? eq1Var2.m75939xb282bd08(2) : 0);
        this.E.setText(context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573061de4, objArr2));
        zl2.r4 r4Var = zl2.r4.f555483a;
        m58059xca992b3(r4Var.q1(business));
        boolean m58047x19745ea7 = m58047x19745ea7();
        android.widget.TextView textView2 = this.F;
        if (m58047x19745ea7) {
            if (z17) {
                android.view.View view = this.D;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView2.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dem));
            } else {
                android.view.View view2 = this.D;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView2.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573064lu4));
            }
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Kj(ml2.j4.f409149i, java.lang.Boolean.valueOf(z17), m58049x38bbc4c());
        } else {
            if (z17) {
                android.view.View view3 = this.D;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view4 = this.D;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            textView2.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.del));
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.Lj((ml2.r0) c17, ml2.j4.f409147g, null, m58049x38bbc4c(), 2, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.io ioVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.io(getContext());
        android.view.View mo58053xfb84e958 = mo58053xfb84e958();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo58053xfb84e958, "<get-root>(...)");
        r4Var.Q2(mo58053xfb84e958);
        ioVar.k(mo58053xfb84e958());
        ioVar.B.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b8l);
        ioVar.s();
        m58056x4b413032(ioVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h1
    /* renamed from: getRoot */
    public android.view.View mo58053xfb84e958() {
        return this.f200914z;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.drg) {
            d();
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.dre) {
            yz5.a m58050x527e5fe5 = m58050x527e5fe5();
            if (m58050x527e5fe5 != null) {
                m58050x527e5fe5.mo152xb9724478();
            }
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f566980hp5) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - qd2.h.f443300a >= 500) {
                z17 = false;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
                z17 = true;
            }
            qd2.h.f443300a = currentTimeMillis;
            if (z17) {
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (m58047x19745ea7()) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Kj(ml2.j4.f409150m, java.lang.Boolean.valueOf(m58052x24f779db()), m58049x38bbc4c());
                c();
            } else {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Kj(ml2.j4.f409148h, java.lang.Boolean.valueOf(m58052x24f779db()), m58049x38bbc4c());
                b();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
