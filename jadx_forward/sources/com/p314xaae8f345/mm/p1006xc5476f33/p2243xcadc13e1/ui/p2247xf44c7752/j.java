package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public g04.h f253916a;

    /* renamed from: b, reason: collision with root package name */
    public g04.j f253917b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f253918c;

    /* renamed from: d, reason: collision with root package name */
    public int f253919d = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.i f253920e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f253921f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.h f253922g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f253923h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f253924i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.ImageView f253925j;

    /* renamed from: k, reason: collision with root package name */
    public android.animation.ValueAnimator f253926k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f253927l;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f253928m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.s0 f253929n;

    /* renamed from: o, reason: collision with root package name */
    public sy3.c f253930o;

    /* renamed from: p, reason: collision with root package name */
    public long f253931p;

    /* renamed from: q, reason: collision with root package name */
    public final sy3.e f253932q;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.ActivityC18509x4a85de3d activityC18509x4a85de3d, com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.i iVar, g04.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.h hVar2, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.C18508x534b42a5 c18508x534b42a5 = new com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.C18508x534b42a5(this, com.p314xaae8f345.mm.app.a0.f134821d);
        this.f253928m = c18508x534b42a5;
        this.f253929n = new com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.c(this);
        this.f253930o = null;
        this.f253931p = 0L;
        this.f253932q = new com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.g(this);
        this.f253916a = hVar;
        this.f253921f = activityC18509x4a85de3d;
        this.f253920e = iVar;
        this.f253927l = z17;
        this.f253922g = hVar2;
        this.f253924i = (android.widget.ImageView) activityC18509x4a85de3d.findViewById(com.p314xaae8f345.mm.R.id.ma9);
        this.f253925j = (android.widget.ImageView) this.f253921f.findViewById(com.p314xaae8f345.mm.R.id.ma7);
        this.f253923h = (android.widget.ImageView) this.f253921f.findViewById(com.p314xaae8f345.mm.R.id.ma_);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f253925j.getLayoutParams();
        layoutParams.bottomMargin += com.p314xaae8f345.mm.ui.bk.j(this.f253921f);
        this.f253925j.setLayoutParams(layoutParams);
        this.f253925j.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.d(this));
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f253926k = ofFloat;
        ofFloat.setDuration(5000L);
        this.f253926k.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.e(this));
        this.f253926k.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.f(this, this.f253921f.getWindowManager().getDefaultDisplay().getHeight()));
        c18508x534b42a5.mo48813x58998cd();
    }

    public boolean a() {
        sy3.c cVar = this.f253930o;
        if (cVar == null || ((kz3.l) cVar).c()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.h hVar = this.f253922g;
        if (hVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.ActivityC18509x4a85de3d) hVar).x7();
        }
        sy3.c cVar2 = this.f253930o;
        if (cVar2 == null) {
            return false;
        }
        if (!((kz3.l) cVar2).b(this.f253931p)) {
            return false;
        }
        this.f253931p = 0L;
        return true;
    }

    public void b(android.view.View view, android.view.View view2, java.lang.String str) {
        if (this.f253930o == null) {
            sy3.c Ai = ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).Ai(this.f253921f, 1);
            this.f253930o = Ai;
            ((kz3.l) Ai).f395420e = view;
        }
        ry3.p pVar = new ry3.p();
        pVar.f483066g = 12;
        pVar.f483060a = java.lang.System.currentTimeMillis();
        pVar.f483061b = 3;
        pVar.f483071l = false;
        pVar.f483072m = true;
        pVar.f483073n = 204;
        pVar.f483064e = str;
        this.f253923h.setVisibility(0);
        this.f253924i.setVisibility(0);
        this.f253925j.setVisibility(0);
        this.f253926k.setRepeatMode(1);
        this.f253926k.setRepeatCount(-1);
        this.f253926k.start();
        ((kz3.l) this.f253930o).a(view2);
        ry3.m mVar = new ry3.m();
        mVar.f483058b = true;
        this.f253931p = ((kz3.l) this.f253930o).i(pVar, mVar, this.f253932q);
    }

    public void c() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85 c6631xd817ea85 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85();
        c6631xd817ea85.f139849d = this.f253919d == 2 ? 1L : 0L;
        c6631xd817ea85.f139850e = 2L;
        c6631xd817ea85.f139851f = this.f253927l ? 6L : 5L;
        c6631xd817ea85.k();
    }

    public void d() {
        java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.ActivityC18509x4a85de3d) this.f253920e).f253727g;
        int i17 = this.f253919d;
        if ((i17 == 0 || i17 == 2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85 c6631xd817ea85 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85();
            c6631xd817ea85.f139849d = this.f253919d == 2 ? 1L : 0L;
            c6631xd817ea85.f139850e = 3L;
            c6631xd817ea85.f139851f = this.f253927l ? 6L : 5L;
            c6631xd817ea85.k();
            this.f253918c = (int) (c01.z1.r().hashCode() + java.lang.System.currentTimeMillis());
            dm.aa bj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z.class))).bj(str);
            if (bj6 != null && com.p314xaae8f345.mm.vfs.w6.j(bj6.f65916x970b0f9e)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("original_file_path", str);
                intent.putExtra("translate_source", this.f253927l ? 6 : 5);
                intent.setClassName(this.f253921f, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f253921f;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(abstractActivityC21394xb3d2c0cf, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryTransAndOcrLogic", "doTransPhoto", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                abstractActivityC21394xb3d2c0cf.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(abstractActivityC21394xb3d2c0cf, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryTransAndOcrLogic", "doTransPhoto", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                this.f253921f.finish();
                this.f253921f.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
                return;
            }
            if (gm0.j1.d().n() == 6 || gm0.j1.d().n() == 4) {
                this.f253919d = 1;
                this.f253923h.setVisibility(0);
                this.f253924i.setVisibility(0);
                this.f253925j.setVisibility(0);
                this.f253926k.setRepeatMode(1);
                this.f253926k.setRepeatCount(-1);
                this.f253926k.start();
            } else {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f253921f;
                db5.e1.s(abstractActivityC21394xb3d2c0cf2, abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu), "");
                e();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GestureGalleryTransLogic", "try to translate img %s, sessionId %d", str, java.lang.Integer.valueOf(this.f253918c));
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5973x2e8f3b26 c5973x2e8f3b26 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5973x2e8f3b26();
            am.bt btVar = c5973x2e8f3b26.f136271g;
            btVar.f87815a = this.f253927l ? 6 : 5;
            btVar.f87817c = str;
            btVar.f87816b = this.f253918c;
            c5973x2e8f3b26.e();
        }
    }

    public void e() {
        this.f253919d = 0;
        this.f253923h.setVisibility(8);
        this.f253924i.setVisibility(8);
        this.f253925j.setVisibility(8);
        g();
    }

    public void f(java.lang.String str) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f253921f;
        if (abstractActivityC21394xb3d2c0cf == null || abstractActivityC21394xb3d2c0cf.isFinishing()) {
            return;
        }
        if (this.f253917b == null) {
            kd0.h2 h2Var = (kd0.h2) i95.n0.c(kd0.h2.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f253921f;
            ((jd0.u1) h2Var).getClass();
            this.f253917b = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2048x37c70a.C17351x2827be15(abstractActivityC21394xb3d2c0cf2);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2048x37c70a.C17351x2827be15) this.f253917b).b(str, this.f253916a);
    }

    public void g() {
        this.f253926k.setRepeatMode(1);
        this.f253926k.setRepeatCount(0);
        this.f253926k.end();
    }
}
