package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class w4 extends xt2.m6 implements jf2.j {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f201664d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f201665e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f201666f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f201667g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f201668h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f201669i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f201670m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f201671n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f201672o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f201673p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f201674q;

    public w4(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f201664d = root;
        this.f201665e = statusMonitor;
        this.f201666f = basePlugin;
        this.f201667g = "Finder.FinderLiveAnchorCameraOptionWidget";
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.er_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f201668h = findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.erf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f201669i = imageView;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.f565070b53);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f201670m = (android.widget.TextView) findViewById3;
        this.f201671n = "anchorlive.bottom.videosetting";
        this.f201672o = "anchorlive.bottom.audiosetting";
        this.f201673p = true;
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.b59);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f201674q = findViewById4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorCameraOptionWidget", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/live/plugin/ILiveStatus;Lcom/tencent/mm/plugin/finder/live/plugin/FinderBaseLivePlugin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorCameraOptionWidget", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/live/plugin/ILiveStatus;Lcom/tencent/mm/plugin/finder/live/plugin/FinderBaseLivePlugin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v4(this));
        android.graphics.drawable.Drawable drawable = root.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79303x9c11008);
        com.p314xaae8f345.mm.ui.uk.f(drawable, root.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        imageView.setImageDrawable(drawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        if (ll2.e.f400666a.h(r2.I1() ? "anchorlive.bottom.videosetting.filter" : "startlive.bottom.videosetting.filter") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
    
        if (ll2.e.f400666a.h(r2.I1() ? "anchorlive.bottom.videosetting.beauty" : "startlive.bottom.videosetting.beauty") == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011b  */
    @Override // jf2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w4.b():void");
    }

    @Override // jf2.j
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79304x6f264e65), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.du_));
    }

    @Override // jf2.j
    public void e(int i17) {
        this.f201668h.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f201664d.findViewById(com.p314xaae8f345.mm.R.id.er9);
    }

    @Override // jf2.h
    public void g() {
        this.f201664d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f201664d;
    }

    @Override // jf2.h
    public boolean i() {
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.h7 h7Var = (mm2.h7) efVar.i(mm2.h7.class);
        boolean z17 = h7Var != null && h7Var.O6();
        java.lang.String str = this.f201667g;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "#checkVisible invisible reason: is multi stream enable");
            return false;
        }
        if (sn0.b.f491497e2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "#checkVisible invisible reason: is secondary device");
            return false;
        }
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        boolean z18 = e1Var != null && e1Var.b7();
        boolean z19 = e1Var != null && e1Var.f7();
        boolean z27 = e1Var != null && e1Var.g7();
        boolean z28 = c1Var != null && c1Var.f410311a5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "#checkVisible invisible reason: ".concat(z27 ? "voice room" : z28 ? "game live" : z18 ? "ktv room" : z19 ? "screen cast game" : "all invisible conditions not match"));
        return (z27 || z28 || z18 || z19) ? false : true;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        return this.f201669i;
    }

    @Override // jf2.h
    /* renamed from: type */
    public int mo58036x368f3a() {
        return 5;
    }
}
