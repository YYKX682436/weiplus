package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class az implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f193479d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f193480e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f193481f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f193482g;

    /* renamed from: h, reason: collision with root package name */
    public final cm2.t f193483h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f193484i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.ViewGroup f193485m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f193486n;

    /* renamed from: o, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f193487o;

    public az(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f193479d = context;
        this.f193480e = buContext;
        this.f193481f = statusMonitor;
        this.f193482g = lVar;
        this.f193483h = tVar;
        this.f193484i = "FinderLiveMpArticleBubble";
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ans, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f193485m = (android.view.ViewGroup) inflate;
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.az azVar, java.lang.String str) {
        azVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        android.net.Uri.Builder buildUpon = android.net.Uri.parse(str).buildUpon();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(buildUpon, "buildUpon(...)");
        buildUpon.appendQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "221");
        java.lang.String uri = buildUpon.build().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "toString(...)");
        boolean E = zl2.q4.f555466a.E();
        android.content.Context context = azVar.f193479d;
        if (E) {
            db5.t7.m123883x26a183b(context, "url: ".concat(uri), 0).show();
        }
        intent.putExtra("rawUrl", uri);
        intent.putExtra("convertActivityFromTranslucent", true);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public cm2.t A() {
        return this.f193483h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void U() {
    }

    public final void b(cm2.x xVar) {
        android.view.ViewGroup viewGroup = this.f193485m;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.fbl);
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566311fi1);
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566310fi0);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.eqy);
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d e17 = g1Var.e();
        mn2.q3 q3Var = new mn2.q3(xVar.f124940v.m75945x2fec8307(2), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        e17.c(q3Var, imageView, g1Var.h(mn2.f1.f411505z));
        textView.setText(xVar.f124940v.m75945x2fec8307(0));
        textView2.setText(xVar.f124940v.m75945x2fec8307(4));
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        viewGroup.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yy(this, xVar));
        if (zl2.r4.f555483a.y1(this.f193480e)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveMpArticleItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveMpArticleItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveMpArticleItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveMpArticleItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zy(this, xVar));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public int e0() {
        return com.p314xaae8f345.mm.R.id.eqy;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void f0(java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data instanceof cm2.x) {
            b((cm2.x) data);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    /* renamed from: getView */
    public android.view.View mo56902xfb86a31b() {
        android.view.ViewGroup viewGroup = this.f193485m;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void l(java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data instanceof cm2.x) {
            cm2.x xVar = (cm2.x) data;
            b(xVar);
            bf2.c cVar = bf2.c.f101131a;
            gk2.e eVar = this.f193480e;
            java.lang.String m75945x2fec8307 = xVar.f124940v.m75945x2fec8307(3);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            bf2.c.c(cVar, eVar, 1, 2, m75945x2fec8307, 0, null, 0, 0, null, 0, 1008, null);
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
