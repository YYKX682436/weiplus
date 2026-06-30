package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class fx implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f194130d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f194131e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f194132f;

    /* renamed from: g, reason: collision with root package name */
    public final cm2.t f194133g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f194134h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f194135i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f194136m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f194137n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f194138o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f194139p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f194140q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f194141r;

    public fx(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f194130d = context;
        this.f194131e = buContext;
        this.f194132f = lVar;
        this.f194133g = tVar;
        this.f194134h = "FinderLiveMemberBubble";
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aub, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f194135i = (android.view.ViewGroup) inflate;
        this.f194136m = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dx(this));
        this.f194137n = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ex(this));
        this.f194138o = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zw(this));
        this.f194139p = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xw(this));
        this.f194140q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yw(this));
        this.f194141r = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ax(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public cm2.t A() {
        return this.f194133g;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void U() {
    }

    public final void a(cm2.a0 a0Var) {
        ((android.widget.ImageView) ((jz5.n) this.f194136m).mo141623x754a37bb()).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(this.f194130d, com.p314xaae8f345.mm.R.raw.f81311x8a0b4ea5, android.graphics.Color.parseColor("#C4A364")));
        ((android.widget.TextView) ((jz5.n) this.f194137n).mo141623x754a37bb()).setText(a0Var.f124862v.m75945x2fec8307(0));
        ((android.widget.TextView) ((jz5.n) this.f194138o).mo141623x754a37bb()).setText(a0Var.f124862v.m75945x2fec8307(1));
        ((android.view.View) ((jz5.n) this.f194140q).mo141623x754a37bb()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bx(this, a0Var));
        boolean y17 = zl2.r4.f555483a.y1(this.f194131e);
        jz5.g gVar = this.f194141r;
        jz5.g gVar2 = this.f194139p;
        if (y17) {
            android.view.View view = (android.view.View) ((jz5.n) gVar2).mo141623x754a37bb();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteMemberItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteMemberItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(8);
            return;
        }
        android.view.View view2 = (android.view.View) ((jz5.n) gVar2).mo141623x754a37bb();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteMemberItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteMemberItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(0);
        ((android.view.View) ((jz5.n) gVar2).mo141623x754a37bb()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cx(this, a0Var));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public int e0() {
        return com.p314xaae8f345.mm.R.id.eqy;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void f0(java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data instanceof cm2.a0) {
            a((cm2.a0) data);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    /* renamed from: getView */
    public android.view.View mo56902xfb86a31b() {
        return this.f194135i;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void l(java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data instanceof cm2.a0) {
            cm2.a0 a0Var = (cm2.a0) data;
            a(a0Var);
            bf2.c.c(bf2.c.f101131a, this.f194131e, 1, 10, java.lang.String.valueOf(a0Var.f124918d), 0, null, 0, 0, null, 0, 1008, null);
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
