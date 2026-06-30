package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class we extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f287460b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f287461c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f287462d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f287463e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ProgressBar f287464f;

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 a(android.view.View view) {
        super.mo80050xaf65a0fc(view);
        this.f287460b = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bkm);
        this.f287461c = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bko);
        this.f39493x8ad70635 = view.findViewById(com.p314xaae8f345.mm.R.id.bkg);
        this.f287462d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bqy);
        this.f39502xce2b2f8d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.brc);
        this.f287463e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bjp);
        this.f287464f = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.br_);
        this.f39499x8eebed7e = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bqx);
        this.f39492x5b9aa3a3 = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.bkf);
        this.f39496x10665fb1 = view.findViewById(com.p314xaae8f345.mm.R.id.bpa);
        return this;
    }

    public void b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.we weVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q qVar, yb5.d dVar, rd5.d dVar2, boolean z17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ve veVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 q0Var) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        ot0.q v17 = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeishiVideoItemViewHolder", "parseMsgInfo, content is null");
            return;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str2 = v17.f430179d;
        int i17 = v17.G;
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m i18 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.i(str2, i17);
        java.lang.String str3 = (i18 == null || (str = i18.f67372x453d1e07) == null || str.trim().length() <= 0) ? v17.H : i18.f67372x453d1e07;
        java.lang.String str4 = v17.f430179d;
        if (str4 == null || str4.length() <= 0 || !com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.y(str3)) {
            weVar.f287463e.setVisibility(8);
        } else {
            weVar.f287463e.setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Vi(dVar.g(), i18, str3));
            weVar.f287463e.setVisibility(0);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.w(dVar, weVar.f287463e, v17.f430179d);
        }
        weVar.f287462d.setImageDrawable(i65.a.i(dVar.g(), com.p314xaae8f345.mm.R.raw.f81043x73ab7191));
        android.widget.ProgressBar progressBar = weVar.f287464f;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        java.lang.String D2 = m11.b1.Di().D2(f9Var, f9Var.z0(), true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeishiVideoItemViewHolder", "parseMsgInfo, msgImgPath:%s, thumbFullPath:%s", f9Var.z0(), D2);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        android.graphics.Bitmap b37 = m11.b1.Di().b3(D2, i65.a.g(dVar.g()), dVar.g(), com.p314xaae8f345.mm.R.C30861xcebc809e.bzt);
        if (b37 == null || b37.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeishiVideoItemViewHolder", "parseMsgInfo, has no video thumb");
            weVar.f287461c.setLayoutParams(new android.widget.FrameLayout.LayoutParams(0, 0));
            int b17 = i65.a.b(dVar.g(), 85);
            int h17 = i65.a.h(dVar.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561126a3);
            weVar.f287460b.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.q(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560752t7), b17, h17), com.p314xaae8f345.mm.R.C30861xcebc809e.bzt, b17, h17));
            weVar.f287460b.setLayoutParams(new android.widget.FrameLayout.LayoutParams(b17, h17));
            weVar.f287461c.setLayoutParams(new android.widget.FrameLayout.LayoutParams(b17, h17));
        } else {
            weVar.f287460b.setImageBitmap(b37);
            weVar.f287460b.setLayoutParams(new android.widget.FrameLayout.LayoutParams(b37.getWidth(), b37.getHeight()));
            weVar.f287461c.setLayoutParams(new android.widget.FrameLayout.LayoutParams(b37.getWidth(), b37.getHeight()));
        }
        if (z17) {
            if (f9Var.P0() == 5 || f9Var.P0() == 2) {
                android.widget.ProgressBar progressBar2 = weVar.f287464f;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                }
            } else {
                android.widget.ProgressBar progressBar3 = weVar.f287464f;
                if (progressBar3 != null) {
                    progressBar3.setVisibility(0);
                }
            }
        }
        weVar.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, dVar.D(), weVar, f9Var.Q0()));
        weVar.f39493x8ad70635.setOnClickListener(veVar);
        weVar.f39493x8ad70635.setOnLongClickListener(q0Var);
        weVar.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16979, v17.f430210k2, v17.f430202i2, 0, 0);
        l01.b bVar = l01.d0.f396294a;
        bVar.k("file://" + D2);
        ot0.a aVar = (ot0.a) v17.y(ot0.a.class);
        if (aVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.C)) {
            bVar.k(aVar.C);
        }
        if (i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Yf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.B);
        }
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) || aVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.B)) {
            return;
        }
        java.lang.String str5 = aVar.B;
        if (i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x5.class) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x5.class)).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeishiVideoItemViewHolder", "[weishi] parseMsgInfo, invoke video cache task");
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_weishi_video_preload_size, -1);
            if (Ni != -1) {
                Ni = Ni * 1024 * 1024;
            }
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10760xe54e7d63.f149982e, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1237xfa7dc33e.p1238x6b0147b.C12820x9ba6562b(str5, 0L, Ni), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ue.class, null);
        }
    }
}
