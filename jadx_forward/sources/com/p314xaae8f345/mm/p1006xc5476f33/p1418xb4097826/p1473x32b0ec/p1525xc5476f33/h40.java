package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class h40 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f194300d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f194301e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f194302f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f194303g;

    /* renamed from: h, reason: collision with root package name */
    public final cm2.t f194304h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f194305i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.ViewGroup f194306m;

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.d40(null);
    }

    public h40(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f194300d = context;
        this.f194301e = buContext;
        this.f194302f = statusMonitor;
        this.f194303g = lVar;
        this.f194304h = tVar;
        this.f194305i = "FinderLivePayVideoListBubble";
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570489dg1, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f194306m = (android.view.ViewGroup) inflate;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public cm2.t A() {
        return this.f194304h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string != null ? string : "", "FinderLivePayVideoListBubble_POST_PAY_VIDEOS_PORTRAIT")) {
            android.os.Bundle bundle2 = obj instanceof android.os.Bundle ? (android.os.Bundle) obj : null;
            if (bundle2 != null) {
                r45.do2 do2Var = new r45.do2();
                do2Var.mo11468x92b714fd(bundle2.getByteArray("FinderLivePayVideoListBubble_PAY_VIDEOS_PORTRAIT_DATA"));
                android.content.Context context = this.f194300d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).dk(context, null, null, do2Var, true);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void U() {
    }

    public final void a(cm2.c0 c0Var) {
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        android.view.ViewGroup viewGroup = this.f194306m;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.pxl);
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.q0_);
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.hiz);
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.eqy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
        com.p314xaae8f345.mm.ui.fk.a(textView3);
        int m75939xb282bd08 = c0Var.f124867v.m75939xb282bd08(2);
        java.lang.String str = "";
        android.content.Context context = this.f194300d;
        r45.do2 do2Var = c0Var.f124867v;
        if (m75939xb282bd08 == 1) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            r45.uz0 uz0Var = (r45.uz0) do2Var.m75936x14adae67(0);
            if (uz0Var != null && (m75945x2fec8307 = uz0Var.m75945x2fec8307(1)) != null) {
                str = m75945x2fec8307;
            }
            objArr[0] = str;
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573278fy4, objArr));
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            r45.uz0 uz0Var2 = (r45.uz0) do2Var.m75936x14adae67(0);
            objArr2[0] = java.lang.Integer.valueOf(uz0Var2 != null ? uz0Var2.m75939xb282bd08(4) : 0);
            r45.uz0 uz0Var3 = (r45.uz0) do2Var.m75936x14adae67(0);
            objArr2[1] = java.lang.Integer.valueOf(uz0Var3 != null ? uz0Var3.m75939xb282bd08(5) : 0);
            textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fbb, objArr2));
        } else if (m75939xb282bd08 == 2) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            r45.n11 n11Var = (r45.n11) do2Var.m75936x14adae67(1);
            if (n11Var != null && (m75945x2fec83072 = n11Var.m75945x2fec8307(1)) != null) {
                str = m75945x2fec83072;
            }
            objArr3[0] = str;
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gvd, objArr3));
            java.lang.Object[] objArr4 = new java.lang.Object[2];
            r45.n11 n11Var2 = (r45.n11) do2Var.m75936x14adae67(1);
            objArr4[0] = java.lang.Integer.valueOf(n11Var2 != null ? n11Var2.m75939xb282bd08(4) : 0);
            r45.n11 n11Var3 = (r45.n11) do2Var.m75936x14adae67(1);
            objArr4[1] = java.lang.Integer.valueOf(n11Var3 != null ? n11Var3.m75939xb282bd08(5) : 0);
            textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjp, objArr4));
        }
        textView3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e40(this, c0Var));
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        viewGroup.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f40(this, c0Var));
        if (zl2.r4.f555483a.y1(this.f194301e)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePayVideoListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePayVideoListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePayVideoListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePayVideoListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePayVideoListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePayVideoListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePayVideoListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePayVideoListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g40(this, c0Var));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public int e0() {
        return com.p314xaae8f345.mm.R.id.eqy;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void f0(java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data instanceof cm2.c0) {
            a((cm2.c0) data);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    /* renamed from: getView */
    public android.view.View mo56902xfb86a31b() {
        android.view.ViewGroup viewGroup = this.f194306m;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void l(java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data instanceof cm2.c0) {
            cm2.c0 c0Var = (cm2.c0) data;
            a(c0Var);
            bf2.c.c(bf2.c.f101131a, this.f194301e, 1, 15, pm0.v.u(zl2.r4.f555483a.c0(c0Var.f124867v)), 0, null, 0, 1, null, 0, nd1.y0.f72985x366c91de, null);
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
