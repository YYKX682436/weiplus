package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class j9 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 {

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 f285773b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f285774c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f285775d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f285776e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f285777f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f285778g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f285779h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f285780i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.ImageView f285781j;

    /* renamed from: k, reason: collision with root package name */
    public int f285782k = 0;

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j9 a(android.view.View view, boolean z17) {
        super.mo80050xaf65a0fc(view);
        this.f39493x8ad70635 = this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.bkg);
        this.f39502xce2b2f8d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.brc);
        this.f285774c = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bj6);
        this.f285775d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bj8);
        this.f285773b = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) view.findViewById(com.p314xaae8f345.mm.R.id.bj7);
        this.f285778g = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f566680gq4);
        this.f285776e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565173bj5);
        this.f285777f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.f565172bj4);
        this.f285779h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view.findViewById(com.p314xaae8f345.mm.R.id.pum);
        this.f285780i = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.puk);
        this.f285781j = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.pul);
        this.f285782k = com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        this.f39492x5b9aa3a3 = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.bkf);
        this.f39496x10665fb1 = view.findViewById(com.p314xaae8f345.mm.R.id.bpa);
        return this;
    }

    public void b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j9 j9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q qVar, yb5.d dVar, rd5.d dVar2, java.lang.String str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, boolean z17) {
        int i17;
        int i18;
        android.graphics.Bitmap bitmap;
        int i19;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameShareViewHolder", "null == content");
            return;
        }
        ((l63.h) ((m63.g) i95.n0.c(m63.g.class))).wi(v17, java.lang.Long.valueOf(f9Var.I0()), 1);
        j9Var.m80053x54fd00d3(j9Var.f39493x8ad70635, j9Var.f285782k);
        java.lang.String str2 = v17.f430187f;
        if (str2 == null || str2.length() <= 0) {
            j9Var.f285773b.setVisibility(8);
        } else {
            j9Var.f285773b.setMaxLines(2);
            j9Var.f285773b.setText(v17.m());
            j9Var.f285773b.setVisibility(0);
        }
        j9Var.f285779h.setVisibility(8);
        j9Var.f285780i.setMaxLines(3);
        j9Var.f285780i.setText(v17.f430191g);
        j9Var.f285780i.setVisibility(0);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0 g0Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0) v17.y(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0.class);
        java.lang.String str3 = v17.f430179d;
        if (str3 == null || str3.length() == 0) {
            i17 = 0;
            j9Var.f285778g.setVisibility(0);
            i18 = 8;
            j9Var.f285777f.setVisibility(8);
            j9Var.f285776e.setVisibility(8);
            j9Var.f285781j.setVisibility(8);
        } else {
            j9Var.f285778g.setVisibility(0);
            j9Var.f285781j.setVisibility(0);
            j9Var.f285777f.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562761nu);
            android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(v17.f430179d, 2, i65.a.g(dVar.g()));
            if (Di == null || Di.isRecycled()) {
                i19 = 0;
            } else {
                j9Var.f285777f.setVisibility(0);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = j9Var.f285777f;
                c22699x3dcdb352.m82040x7541828(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
                android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(Di);
                int dimension = (int) dVar.s().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
                i19 = 0;
                bitmapDrawable.setBounds(0, 0, dimension, dimension);
                c22699x3dcdb352.setImageDrawable(bitmapDrawable);
                c22699x3dcdb352.setImageBitmap(Di);
            }
            j9Var.f285776e.setVisibility(i19);
            java.lang.String str4 = v17.H;
            if (str4 == null) {
                j9Var.f285776e.setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(dVar.g(), v17.f430179d));
            } else {
                j9Var.f285776e.setText(str4);
            }
            if (g0Var.f273170i == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameShareViewHolder", "johnjh begin expose");
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(f9Var.Q0(), f9Var.m124847x74d37ac6());
                ot0.q v18 = ot0.q.v(f9Var.U1());
                if (v18 != null) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0 g0Var2 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0) v18.y(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0.class);
                    g0Var2.f273170i = 1;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    v18.f(g0Var2);
                    g0Var2.c(sb6, v18, null, null, 0, 0);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o9.a(sb6, Li);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.m124847x74d37ac6(), Li, true);
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g0Var.f273171j)) {
                    java.lang.String str5 = g0Var.f273167f;
                    m63.g gVar = (m63.g) i95.n0.c(m63.g.class);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i9 i9Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i9(f9Var);
                    l63.h hVar = (l63.h) gVar;
                    hVar.getClass();
                    r45.f73 f73Var = new r45.f73();
                    f73Var.f455606d = str5;
                    com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                    lVar.f152197a = f73Var;
                    lVar.f152200d = 5020;
                    lVar.f152199c = "/cgi-bin/mmgame-bin/gameshareappsvr/gamesharefirstexpose";
                    lVar.f152198b = new r45.g73();
                    i17 = 0;
                    lVar.f152201e = 0;
                    lVar.f152202f = 0;
                    com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new l63.g(hVar, i9Var), false);
                } else {
                    i17 = 0;
                }
            } else {
                i17 = 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameShareViewHolder", "johnjh isexposed");
            }
            i18 = 8;
        }
        if (g0Var.f273168g == 1) {
            j9Var.f285775d.setVisibility(i17);
        } else {
            j9Var.f285775d.setVisibility(i18);
        }
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.s1.a(f9Var, f9Var.z0())) {
            bitmap = null;
        } else {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            bitmap = m11.b1.Di().m0(f9Var, f9Var.z0(), i65.a.g(dVar.g()), false);
        }
        if (bitmap == null || bitmap.isRecycled()) {
            j9Var.f285774c.setImageResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560349i1);
        } else {
            j9Var.f285774c.setImageBitmap(bitmap);
        }
        j9Var.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, dVar.D(), j9Var, null));
        j9Var.f39493x8ad70635.setOnClickListener(a0Var.w(dVar));
        j9Var.f39493x8ad70635.setOnLongClickListener(a0Var.u(dVar));
        j9Var.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
    }
}
