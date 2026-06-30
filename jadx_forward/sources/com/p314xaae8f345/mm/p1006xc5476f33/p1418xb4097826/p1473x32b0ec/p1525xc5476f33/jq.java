package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class jq implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 {

    /* renamed from: p, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gq f194687p = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gq(null);

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f194688d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f194689e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f194690f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f194691g;

    /* renamed from: h, reason: collision with root package name */
    public final cm2.t f194692h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f194693i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f194694m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f194695n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewGroup f194696o;

    public jq(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f194688d = context;
        this.f194689e = buContext;
        this.f194690f = statusMonitor;
        this.f194691g = lVar;
        this.f194692h = tVar;
        this.f194693i = "FinderLiveH5HalfBubble";
        this.f194694m = "PORTRAIT_ACTIONFinderLiveH5HalfBubble";
        this.f194695n = "PORTRAIT_ACTION_BUNDLE_OPEN_HALF_H5_INFO";
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.asj, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f194696o = (android.view.ViewGroup) inflate;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public cm2.t A() {
        return this.f194692h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = null;
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (string == null) {
            string = "";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string, this.f194694m)) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
            android.os.Bundle bundle2 = obj instanceof android.os.Bundle ? (android.os.Bundle) obj : null;
            byte[] byteArray = bundle2 != null ? bundle2.getByteArray(this.f194695n) : null;
            if (byteArray != null) {
                try {
                    c19786x6a1e28622.mo11468x92b714fd(byteArray);
                    c19786x6a1e2862 = c19786x6a1e28622;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            if (c19786x6a1e2862 != null) {
                f194687p.a(this.f194688d, c19786x6a1e2862);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void U() {
    }

    public final void a(cm2.v vVar) {
        android.view.ViewGroup viewGroup = this.f194696o;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f47);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        java.lang.String str = vVar.f124935w;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566205f44);
        java.lang.String str2 = vVar.f124936x;
        textView2.setText(str2 != null ? str2 : "");
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566206f45);
        java.lang.String str3 = vVar.f124938z;
        if (str3 == null || str3.length() == 0) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(str3);
            textView3.setVisibility(0);
        }
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.eqy);
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(vVar.f124937y, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById2 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566207f46);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        a17.c((android.widget.ImageView) findViewById2);
        if (zl2.r4.f555483a.y1(this.f194689e)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveH5HalfBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteH5HalfItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveH5HalfBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteH5HalfItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveH5HalfBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteH5HalfItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveH5HalfBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteH5HalfItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hq(this, vVar));
        }
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iq(this, vVar));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public int e0() {
        return com.p314xaae8f345.mm.R.id.eqy;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void f0(java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data instanceof cm2.v) {
            a((cm2.v) data);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    /* renamed from: getView */
    public android.view.View mo56902xfb86a31b() {
        android.view.ViewGroup viewGroup = this.f194696o;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void l(java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data instanceof cm2.v) {
            cm2.v vVar = (cm2.v) data;
            a(vVar);
            bf2.c.c(bf2.c.f101131a, this.f194689e, 1, 8, vVar.A, 0, null, 0, 0, null, 0, 1008, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void l0() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public int p0() {
        return com.p314xaae8f345.mm.R.id.f566204f43;
    }
}
