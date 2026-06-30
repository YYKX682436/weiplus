package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 f264350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264352f;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 l2Var, java.lang.String str, java.lang.String str2) {
        this.f264350d = l2Var;
        this.f264351e = str;
        this.f264352f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        ex4.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 l2Var = this.f264350d;
        java.lang.String pageUrl = this.f264351e;
        java.lang.String str = this.f264352f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2 o2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2) l2Var;
        o2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageUrl, "pageUrl");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) o2Var.f263434a.get();
        if (e3Var == null || (aVar = e3Var.f263333b1) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) aVar;
        ex4.o oVar = viewOnCreateContextMenuListenerC19337x37f3384d.E;
        oVar.getClass();
        if (oVar.f338760c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewSnapshotHelper", "enterSnapshotMode already in snap shot mode now");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.b6.l(16L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewSnapshotHelper", "enterSnapshotMode pageUrl=".concat(pageUrl));
        oVar.f338774q = new java.lang.ref.WeakReference(viewOnCreateContextMenuListenerC19337x37f3384d);
        if (oVar.f338761d == null) {
            oVar.f338761d = (android.view.ViewGroup) ((android.view.ViewStub) viewOnCreateContextMenuListenerC19337x37f3384d.findViewById(com.p314xaae8f345.mm.R.id.f569115p25)).inflate();
        }
        if (oVar.f338761d != null) {
            oVar.f338762e = viewOnCreateContextMenuListenerC19337x37f3384d.findViewById(com.p314xaae8f345.mm.R.id.n1k);
            oVar.f338763f = (android.widget.FrameLayout) viewOnCreateContextMenuListenerC19337x37f3384d.findViewById(com.p314xaae8f345.mm.R.id.n1j);
            oVar.f338764g = (android.widget.ScrollView) viewOnCreateContextMenuListenerC19337x37f3384d.findViewById(com.p314xaae8f345.mm.R.id.n1e);
            oVar.f338766i = viewOnCreateContextMenuListenerC19337x37f3384d.findViewById(com.p314xaae8f345.mm.R.id.n1f);
            oVar.f338767j = viewOnCreateContextMenuListenerC19337x37f3384d.findViewById(com.p314xaae8f345.mm.R.id.n1i);
            oVar.f338768k = (android.widget.TextView) viewOnCreateContextMenuListenerC19337x37f3384d.findViewById(com.p314xaae8f345.mm.R.id.n1h);
            oVar.f338769l = viewOnCreateContextMenuListenerC19337x37f3384d.findViewById(com.p314xaae8f345.mm.R.id.n1g);
            oVar.f338770m = viewOnCreateContextMenuListenerC19337x37f3384d.findViewById(com.p314xaae8f345.mm.R.id.qwq);
            oVar.f338771n = viewOnCreateContextMenuListenerC19337x37f3384d.findViewById(com.p314xaae8f345.mm.R.id.qwr);
            oVar.f338772o = viewOnCreateContextMenuListenerC19337x37f3384d.findViewById(com.p314xaae8f345.mm.R.id.qwt);
            android.view.View view = oVar.f338769l;
            if (view != null) {
                view.setOnClickListener(ex4.c.f338746d);
            }
            com.p314xaae8f345.mm.ui.p2740x696c9db.d8.a(oVar.f338767j);
            com.p314xaae8f345.mm.ui.p2740x696c9db.d8.a(oVar.f338772o);
            fq1.e.f347040a.g(oVar.f338762e, i65.a.b(viewOnCreateContextMenuListenerC19337x37f3384d, 8), false, true);
            ex4.f fVar = new ex4.f(oVar);
            android.view.View view2 = oVar.f338767j;
            if (view2 != null) {
                view2.setOnClickListener(new ex4.d(fVar));
            }
            android.view.View view3 = oVar.f338772o;
            if (view3 != null) {
                view3.setOnClickListener(new ex4.e(fVar));
            }
        }
        oVar.f338760c = true;
        viewOnCreateContextMenuListenerC19337x37f3384d.mo78514x143f1b92().D0(8);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = viewOnCreateContextMenuListenerC19337x37f3384d.f265348f;
        if (c22633x83752a59 != null) {
            c22633x83752a59.setVisibility(8);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = viewOnCreateContextMenuListenerC19337x37f3384d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l79);
        }
        android.widget.TextView textView = oVar.f338768k;
        if (textView != null) {
            textView.setText(str);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 b17 = al5.l2.b(viewOnCreateContextMenuListenerC19337x37f3384d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        oVar.f338765h = b17;
        b17.setBackgroundColor(0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a592 = oVar.f338765h;
        if (c22633x83752a592 != null) {
            c22633x83752a592.mo120189xb61559a7(oVar.f338778u);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        android.widget.FrameLayout frameLayout = oVar.f338763f;
        if (frameLayout != null) {
            frameLayout.addView(oVar.f338765h, layoutParams);
        }
        android.view.View view4 = oVar.f338766i;
        if (view4 != null) {
            view4.setOnClickListener(new ex4.b(oVar, viewOnCreateContextMenuListenerC19337x37f3384d));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a593 = oVar.f338765h;
        android.widget.ScrollView scrollView = oVar.f338764g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(scrollView);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.x3 x3Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.x3.f263545a;
        if (c22633x83752a593 != null) {
            scrollView.getViewTreeObserver().addOnScrollChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.w3(scrollView, c22633x83752a593, c22633x83752a593.mo120151x7520af94()));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a594 = oVar.f338765h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22633x83752a594);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3(c22633x83752a594, null, new zg0.k2(null, false, false, false, false, 0, true, 63, null), kz5.r0.f395535d, null, 18, null);
        oVar.f338773p = e3Var2;
        e3Var2.q0();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", pageUrl);
        oVar.f338775r = true;
        ku5.u0 u0Var = ku5.t0.f394148d;
        ex4.j jVar = new ex4.j(oVar);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(jVar, 3000L, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var3 = oVar.f338773p;
        if (e3Var3 != null) {
            e3Var3.D(oVar.f338776s);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var4 = oVar.f338773p;
        if (e3Var4 != null) {
            e3Var4.j(intent);
        }
    }
}
