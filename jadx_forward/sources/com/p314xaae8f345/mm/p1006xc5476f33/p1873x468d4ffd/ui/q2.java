package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f230939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d f230940e;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d, long j17) {
        this.f230940e = activityC16554x70dcab5d;
        this.f230939d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCaptureUI", "connect cost %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f230939d));
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = this.f230940e;
        di3.w.e(activityC16554x70dcab5d.V.f230352f, di3.v.MMSightCameraConfig);
        activityC16554x70dcab5d.m78582xfed654b2(-637534208);
        activityC16554x70dcab5d.m78583x85ccfe01(8);
        if (activityC16554x70dcab5d.V == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCaptureUI", "sightParams error!");
            return;
        }
        int c17 = wo.i.c();
        activityC16554x70dcab5d.f230785y0 = c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCaptureUI", "initOnCreate, numCamera: %s", java.lang.Integer.valueOf(c17));
        activityC16554x70dcab5d.f230782x0 = new fp.e(activityC16554x70dcab5d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 c16528xd9aafd63 = activityC16554x70dcab5d.V;
        activityC16554x70dcab5d.f230763f = c16528xd9aafd63.f230357n;
        int i17 = c16528xd9aafd63.f230351e;
        activityC16554x70dcab5d.f230762e = i17;
        activityC16554x70dcab5d.L = i17 == 2;
        ei3.y.f334722b.f334723a = c16528xd9aafd63;
        int i18 = c16528xd9aafd63.f230350d;
        activityC16554x70dcab5d.f230761d = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCaptureUI", "SightCaptureUI onCreate, captureMode: %s, showHint: %s, defaultCamera: %s, scene: %s", java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(activityC16554x70dcab5d.f230763f), java.lang.Integer.valueOf(activityC16554x70dcab5d.f230762e), java.lang.Integer.valueOf(activityC16554x70dcab5d.V.f230358o));
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = activityC16554x70dcab5d.V.f230352f;
        activityC16554x70dcab5d.f230765h = c11120x15dce88d;
        if (c11120x15dce88d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCaptureUI", "SightCaptureUI onCreate, cannot get videoParams");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCaptureUI", "SightCaptureUI onCreate, videoParams: %s", c11120x15dce88d);
        activityC16554x70dcab5d.getWindow().addFlags(2097280);
        if (fp.h.c(19)) {
            activityC16554x70dcab5d.getWindow().setFlags(201327616, 201327616);
            ai3.d.f86640a = true;
            com.p314xaae8f345.mm.ui.r0.a(activityC16554x70dcab5d, false);
        } else {
            activityC16554x70dcab5d.getWindow().setFlags(1024, 1024);
            ai3.d.f86640a = false;
        }
        activityC16554x70dcab5d.getWindow().addFlags(67108864);
        di3.d dVar = new di3.d(activityC16554x70dcab5d, 2);
        activityC16554x70dcab5d.X = dVar;
        dVar.f314222g = activityC16554x70dcab5d;
        dVar.enable();
        activityC16554x70dcab5d.f230778u = (android.view.ViewGroup) activityC16554x70dcab5d.findViewById(com.p314xaae8f345.mm.R.id.chs);
        activityC16554x70dcab5d.f230779v = (android.view.ViewGroup) activityC16554x70dcab5d.findViewById(com.p314xaae8f345.mm.R.id.cij);
        activityC16554x70dcab5d.f230787z = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16545x39e5705e) activityC16554x70dcab5d.findViewById(com.p314xaae8f345.mm.R.id.gfh);
        activityC16554x70dcab5d.f230769n = (com.p314xaae8f345.mm.p1006xc5476f33.p2323x6b0147b.TextureViewSurfaceTextureListenerC18786x5422a8fd) activityC16554x70dcab5d.findViewById(com.p314xaae8f345.mm.R.id.l4r);
        activityC16554x70dcab5d.f230770o = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360) activityC16554x70dcab5d.findViewById(com.p314xaae8f345.mm.R.id.los);
        activityC16554x70dcab5d.f230775r = activityC16554x70dcab5d.findViewById(com.p314xaae8f345.mm.R.id.mwp);
        activityC16554x70dcab5d.f230776s = activityC16554x70dcab5d.findViewById(com.p314xaae8f345.mm.R.id.mwn);
        activityC16554x70dcab5d.f230771p = (android.widget.ImageView) activityC16554x70dcab5d.findViewById(com.p314xaae8f345.mm.R.id.mwg);
        activityC16554x70dcab5d.f230774q = (android.widget.ImageView) activityC16554x70dcab5d.findViewById(com.p314xaae8f345.mm.R.id.mwh);
        activityC16554x70dcab5d.f230777t = activityC16554x70dcab5d.findViewById(com.p314xaae8f345.mm.R.id.bz7);
        activityC16554x70dcab5d.A = (android.view.ViewGroup) activityC16554x70dcab5d.findViewById(com.p314xaae8f345.mm.R.id.f569092p02);
        android.widget.TextView textView = (android.widget.TextView) activityC16554x70dcab5d.findViewById(com.p314xaae8f345.mm.R.id.b6r);
        activityC16554x70dcab5d.E = textView;
        int i19 = activityC16554x70dcab5d.f230761d;
        if (i19 == 2) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574077gw5);
        } else if (i19 == 1) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gw6);
        } else if (i19 == 0) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574076gw4);
        }
        activityC16554x70dcab5d.H = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) activityC16554x70dcab5d.findViewById(com.p314xaae8f345.mm.R.id.l27);
        android.widget.ImageView imageView = (android.widget.ImageView) activityC16554x70dcab5d.findViewById(com.p314xaae8f345.mm.R.id.ntp);
        activityC16554x70dcab5d.f230780w = imageView;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) imageView.getLayoutParams();
        int i27 = layoutParams.topMargin;
        if (com.p314xaae8f345.mm.ui.bk.u(activityC16554x70dcab5d.mo55332x76847179(), false)) {
            i27 += com.p314xaae8f345.mm.ui.bk.p(activityC16554x70dcab5d.mo55332x76847179());
        }
        layoutParams.setMargins(layoutParams.leftMargin, i27, layoutParams.rightMargin, layoutParams.bottomMargin);
        activityC16554x70dcab5d.f230780w.setLayoutParams(layoutParams);
        android.widget.ImageView imageView2 = (android.widget.ImageView) activityC16554x70dcab5d.findViewById(com.p314xaae8f345.mm.R.id.d6l);
        activityC16554x70dcab5d.f230781x = imageView2;
        imageView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.i3(activityC16554x70dcab5d));
        if (!activityC16554x70dcab5d.V.f230361r) {
            activityC16554x70dcab5d.f230781x.setVisibility(8);
        }
        activityC16554x70dcab5d.B = (android.widget.ImageView) activityC16554x70dcab5d.findViewById(com.p314xaae8f345.mm.R.id.nxo);
        activityC16554x70dcab5d.C = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.p1876xea0e606f.C16557x646260ab) activityC16554x70dcab5d.findViewById(com.p314xaae8f345.mm.R.id.d4k);
        activityC16554x70dcab5d.F = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16549xbfc1cbdb) activityC16554x70dcab5d.findViewById(com.p314xaae8f345.mm.R.id.j98);
        activityC16554x70dcab5d.G = activityC16554x70dcab5d.findViewById(com.p314xaae8f345.mm.R.id.f568109lq0);
        activityC16554x70dcab5d.f230760J = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16553x9b9a9a23) activityC16554x70dcab5d.findViewById(com.p314xaae8f345.mm.R.id.ofi);
        if (com.p314xaae8f345.mm.ui.bk.u(activityC16554x70dcab5d.mo55332x76847179(), false)) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) activityC16554x70dcab5d.f230760J.getLayoutParams();
            layoutParams2.height = com.p314xaae8f345.mm.ui.bk.p(activityC16554x70dcab5d.mo55332x76847179()) + activityC16554x70dcab5d.mo55332x76847179().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562102a62);
            activityC16554x70dcab5d.f230760J.setLayoutParams(layoutParams2);
        }
        activityC16554x70dcab5d.D = new hi3.b(activityC16554x70dcab5d.C);
        if (activityC16554x70dcab5d.f230763f) {
            activityC16554x70dcab5d.E.setVisibility(0);
        } else {
            activityC16554x70dcab5d.E.setVisibility(8);
        }
        int b17 = i65.a.b(activityC16554x70dcab5d.mo55332x76847179(), 120);
        activityC16554x70dcab5d.f230787z.b(b17, b17);
        if (fp.h.c(19)) {
            int max = java.lang.Math.max(com.p314xaae8f345.mm.ui.bl.c(activityC16554x70dcab5d), com.p314xaae8f345.mm.ui.bl.g(activityC16554x70dcab5d));
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) activityC16554x70dcab5d.f230770o.getLayoutParams();
            marginLayoutParams.bottomMargin += max;
            activityC16554x70dcab5d.f230770o.setLayoutParams(marginLayoutParams);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) activityC16554x70dcab5d.f230777t.getLayoutParams();
            marginLayoutParams2.bottomMargin += max;
            activityC16554x70dcab5d.f230777t.setLayoutParams(marginLayoutParams2);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) activityC16554x70dcab5d.f230771p.getLayoutParams();
            marginLayoutParams3.bottomMargin += max;
            activityC16554x70dcab5d.f230771p.setLayoutParams(marginLayoutParams3);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = (android.view.ViewGroup.MarginLayoutParams) activityC16554x70dcab5d.f230781x.getLayoutParams();
            marginLayoutParams4.bottomMargin += max;
            activityC16554x70dcab5d.f230781x.setLayoutParams(marginLayoutParams4);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams5 = (android.view.ViewGroup.MarginLayoutParams) activityC16554x70dcab5d.f230775r.getLayoutParams();
            marginLayoutParams5.bottomMargin += max;
            activityC16554x70dcab5d.f230775r.setLayoutParams(marginLayoutParams5);
        }
        int i28 = activityC16554x70dcab5d.f230761d;
        if (i28 == 1 || i28 == 0) {
            activityC16554x70dcab5d.f230770o.m66973x86d19c4a(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.j3(activityC16554x70dcab5d));
            activityC16554x70dcab5d.f230770o.m66970x27310482(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.k3(activityC16554x70dcab5d));
            activityC16554x70dcab5d.f230770o.m66974x7f8af277(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.l3(activityC16554x70dcab5d));
        }
        int i29 = activityC16554x70dcab5d.f230761d;
        if (i29 == 0 || i29 == 2) {
            activityC16554x70dcab5d.f230770o.m66975xee2457b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.m3(activityC16554x70dcab5d));
        }
        if (activityC16554x70dcab5d.f230785y0 > 1) {
            activityC16554x70dcab5d.f230780w.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.n3(activityC16554x70dcab5d));
        } else {
            activityC16554x70dcab5d.f230780w.setVisibility(8);
        }
        activityC16554x70dcab5d.f230774q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.f2(activityC16554x70dcab5d));
        activityC16554x70dcab5d.f230771p.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.g2(activityC16554x70dcab5d));
        activityC16554x70dcab5d.f230777t.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.h2(activityC16554x70dcab5d));
        activityC16554x70dcab5d.F.m66959x73ebd762(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.i2(activityC16554x70dcab5d));
        activityC16554x70dcab5d.i7(0);
        activityC16554x70dcab5d.c7();
        activityC16554x70dcab5d.D1 = java.lang.Boolean.TRUE;
    }
}
