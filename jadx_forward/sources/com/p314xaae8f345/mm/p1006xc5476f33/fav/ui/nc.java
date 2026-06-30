package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class nc {

    /* renamed from: a, reason: collision with root package name */
    public g04.h f182832a;

    /* renamed from: b, reason: collision with root package name */
    public g04.j f182833b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f182834c;

    /* renamed from: d, reason: collision with root package name */
    public int f182835d = 0;

    /* renamed from: e, reason: collision with root package name */
    public o72.e5 f182836e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f182837f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f182838g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f182839h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f182840i;

    /* renamed from: j, reason: collision with root package name */
    public android.animation.ValueAnimator f182841j;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f182842k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.s0 f182843l;

    public nc(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, o72.e5 e5Var, g04.h hVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13583x9afc4394 c13583x9afc4394 = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13583x9afc4394(this, com.p314xaae8f345.mm.app.a0.f134821d);
        this.f182842k = c13583x9afc4394;
        this.f182843l = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.jc(this);
        this.f182832a = hVar;
        this.f182837f = abstractActivityC21394xb3d2c0cf;
        this.f182836e = e5Var;
        this.f182839h = (android.widget.ImageView) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.ma9);
        this.f182840i = (android.widget.ImageView) this.f182837f.findViewById(com.p314xaae8f345.mm.R.id.ma7);
        this.f182838g = (android.widget.ImageView) this.f182837f.findViewById(com.p314xaae8f345.mm.R.id.ma_);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f182840i.getLayoutParams();
        layoutParams.bottomMargin += com.p314xaae8f345.mm.ui.bk.j(this.f182837f);
        this.f182840i.setLayoutParams(layoutParams);
        this.f182840i.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.kc(this));
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f182841j = ofFloat;
        ofFloat.setDuration(5000L);
        this.f182841j.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.lc(this));
        this.f182841j.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.mc(this, this.f182837f.getWindowManager().getDefaultDisplay().getHeight()));
        c13583x9afc4394.mo48813x58998cd();
    }

    public void a() {
        java.lang.String x27 = this.f182836e.x2();
        int i17 = this.f182835d;
        if ((i17 == 0 || i17 == 2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x27)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85 c6631xd817ea85 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85();
            c6631xd817ea85.f139851f = 5L;
            c6631xd817ea85.f139849d = this.f182835d == 2 ? 1L : 0L;
            c6631xd817ea85.f139850e = 3L;
            c6631xd817ea85.q(this.f182836e.y3());
            c6631xd817ea85.p(this.f182836e.mo54574x1061ea06());
            c6631xd817ea85.k();
            this.f182834c = (int) (c01.z1.r().hashCode() + java.lang.System.currentTimeMillis());
            dm.aa bj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z.class))).bj(x27);
            if (bj6 != null && com.p314xaae8f345.mm.vfs.w6.j(bj6.f65916x970b0f9e)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("original_file_path", x27);
                intent.putExtra("translate_source", 5);
                intent.setClassName(this.f182837f, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
                intent.putExtra("fileid", this.f182836e.y3());
                intent.putExtra("aeskey", this.f182836e.mo54574x1061ea06());
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f182837f;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(abstractActivityC21394xb3d2c0cf, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/PhotoTransControl", "doTransPhoto", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                abstractActivityC21394xb3d2c0cf.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(abstractActivityC21394xb3d2c0cf, "com/tencent/mm/plugin/fav/ui/PhotoTransControl", "doTransPhoto", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                this.f182837f.finish();
                this.f182837f.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
                return;
            }
            if (gm0.j1.d().n() == 6 || gm0.j1.d().n() == 4) {
                this.f182835d = 1;
                this.f182838g.setVisibility(0);
                this.f182839h.setVisibility(0);
                this.f182840i.setVisibility(0);
                this.f182836e.L0();
                this.f182841j.setRepeatMode(1);
                this.f182841j.setRepeatCount(-1);
                this.f182841j.start();
            } else {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f182837f;
                db5.e1.s(abstractActivityC21394xb3d2c0cf2, abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu), "");
                b();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhotoTransControl", "try to translate img %s, sessionId %d", x27, java.lang.Integer.valueOf(this.f182834c));
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5973x2e8f3b26 c5973x2e8f3b26 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5973x2e8f3b26();
            am.bt btVar = c5973x2e8f3b26.f136271g;
            btVar.f87815a = 2;
            btVar.f87817c = x27;
            btVar.f87816b = this.f182834c;
            c5973x2e8f3b26.e();
        }
    }

    public void b() {
        this.f182835d = 0;
        this.f182838g.setVisibility(8);
        this.f182839h.setVisibility(8);
        this.f182840i.setVisibility(8);
        this.f182836e.l5();
        this.f182841j.setRepeatMode(1);
        this.f182841j.setRepeatCount(0);
        this.f182841j.end();
    }

    public void c() {
        this.f182841j.setRepeatMode(1);
        this.f182841j.setRepeatCount(0);
        this.f182841j.end();
        this.f182841j.removeAllUpdateListeners();
        this.f182842k.mo48814x2efc64();
        gm0.j1.n().d(this.f182843l);
        this.f182832a = null;
        this.f182837f = null;
        this.f182836e = null;
    }

    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f182837f;
        if (abstractActivityC21394xb3d2c0cf == null || abstractActivityC21394xb3d2c0cf.isFinishing()) {
            return;
        }
        if (this.f182833b == null) {
            kd0.h2 h2Var = (kd0.h2) i95.n0.c(kd0.h2.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f182837f;
            ((jd0.u1) h2Var).getClass();
            this.f182833b = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2048x37c70a.C17351x2827be15(abstractActivityC21394xb3d2c0cf2);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2048x37c70a.C17351x2827be15) this.f182833b).b(str, this.f182832a);
    }
}
