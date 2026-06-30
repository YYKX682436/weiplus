package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class z40 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f196814d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f196815e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f196816f;

    /* renamed from: g, reason: collision with root package name */
    public final cm2.t f196817g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f196818h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f196819i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f196820m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f196821n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f196822o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f196823p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f196824q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f196825r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f196826s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f196827t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f196828u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f196829v;

    /* renamed from: w, reason: collision with root package name */
    public final long f196830w;

    /* renamed from: x, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f196831x;

    public z40(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f196814d = context;
        this.f196815e = buContext;
        this.f196816f = statusMonitor;
        this.f196817g = tVar;
        this.f196818h = "FinderLivePlayListBubble";
        this.f196820m = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.y40(this));
        this.f196821n = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x40(this));
        jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l40(this));
        this.f196822o = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.m40(this));
        this.f196823p = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.n40(this));
        this.f196824q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o40(this));
        this.f196825r = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i40(this));
        this.f196826s = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.j40(this));
        this.f196827t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k40(this));
        this.f196828u = "PORTRAIT_ACTION_FINDER_PLAY_LIST_CLICK";
        this.f196829v = "PORTRAIT_ACTION_BUNDLE_OPEN_PLAY_LIST";
        this.f196830w = 5000L;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570497ax4, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f196819i = (android.view.ViewGroup) inflate;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public cm2.t A() {
        return this.f196817g;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = null;
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (string == null) {
            string = "";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string, this.f196828u)) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
            android.os.Bundle bundle2 = obj instanceof android.os.Bundle ? (android.os.Bundle) obj : null;
            byte[] byteArray = bundle2 != null ? bundle2.getByteArray(this.f196829v) : null;
            if (byteArray != null) {
                try {
                    c19786x6a1e28622.mo11468x92b714fd(byteArray);
                    c19786x6a1e2862 = c19786x6a1e28622;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            if (c19786x6a1e2862 != null) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                android.content.Context context = this.f196814d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                xc2.y2 y2Var = xc2.y2.f534876a;
                xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
                p0Var.f534785n = 0;
                xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void U() {
    }

    public final void a(cm2.d0 d0Var) {
        ((android.widget.TextView) ((jz5.n) this.f196820m).mo141623x754a37bb()).setText(d0Var.f124868v.m75945x2fec8307(1));
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f196821n).mo141623x754a37bb();
        android.view.ViewGroup viewGroup = this.f196819i;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.content.Context context = viewGroup.getContext();
        r45.v42 v42Var = d0Var.f124868v;
        textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e4r, k35.m1.d("HH:mm", v42Var.m75939xb282bd08(2))));
        int m75939xb282bd08 = v42Var.m75939xb282bd08(4);
        jz5.g gVar = this.f196823p;
        jz5.g gVar2 = this.f196822o;
        gk2.e eVar = this.f196815e;
        if (m75939xb282bd08 == 0) {
            android.view.View view = (android.view.View) ((jz5.n) gVar2).mo141623x754a37bb();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).setText(viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e4q));
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f196831x;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
        } else {
            android.view.View view2 = (android.view.View) ((jz5.n) gVar2).mo141623x754a37bb();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).setText(viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e4s));
            yg2.b bVar = eVar.f354008i;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(bVar, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q40(this, d0Var, null), 2, null);
        }
        boolean y17 = zl2.r4.f555483a.y1(eVar);
        jz5.g gVar3 = this.f196827t;
        jz5.g gVar4 = this.f196826s;
        jz5.g gVar5 = this.f196824q;
        if (y17) {
            android.view.View view3 = (android.view.View) ((jz5.n) gVar5).mo141623x754a37bb();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.view.View) ((jz5.n) gVar5).mo141623x754a37bb()).setOnClickListener(null);
            ((android.widget.TextView) ((jz5.n) gVar4).mo141623x754a37bb()).setVisibility(0);
            ((android.widget.TextView) ((jz5.n) gVar4).mo141623x754a37bb()).setText(this.f196814d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e8k, java.lang.Long.valueOf(v42Var.m75942xfb822ef2(3))));
            android.view.View view4 = (android.view.View) ((jz5.n) gVar3).mo141623x754a37bb();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(4);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view5 = (android.view.View) ((jz5.n) gVar5).mo141623x754a37bb();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) ((jz5.n) gVar4).mo141623x754a37bb()).setVisibility(8);
            android.view.View view6 = (android.view.View) ((jz5.n) gVar3).mo141623x754a37bb();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.view.View) ((jz5.n) gVar5).mo141623x754a37bb()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.u40(this, d0Var));
            ((android.view.View) ((jz5.n) gVar3).mo141623x754a37bb()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v40(this, d0Var));
        }
        ((android.view.View) ((jz5.n) this.f196825r).mo141623x754a37bb()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w40(this, d0Var));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public int e0() {
        return com.p314xaae8f345.mm.R.id.bys;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void f0(java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data instanceof cm2.d0) {
            a((cm2.d0) data);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    /* renamed from: getView */
    public android.view.View mo56902xfb86a31b() {
        android.view.ViewGroup viewGroup = this.f196819i;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void l(java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data instanceof cm2.d0) {
            a((cm2.d0) data);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void l0() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public int p0() {
        return com.p314xaae8f345.mm.R.id.hhj;
    }
}
