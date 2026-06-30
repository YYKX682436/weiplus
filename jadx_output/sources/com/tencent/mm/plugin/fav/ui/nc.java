package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class nc {

    /* renamed from: a, reason: collision with root package name */
    public g04.h f101299a;

    /* renamed from: b, reason: collision with root package name */
    public g04.j f101300b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f101301c;

    /* renamed from: d, reason: collision with root package name */
    public int f101302d = 0;

    /* renamed from: e, reason: collision with root package name */
    public o72.e5 f101303e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f101304f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f101305g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f101306h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f101307i;

    /* renamed from: j, reason: collision with root package name */
    public android.animation.ValueAnimator f101308j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f101309k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.network.s0 f101310l;

    public nc(com.tencent.mm.ui.MMActivity mMActivity, o72.e5 e5Var, g04.h hVar) {
        com.tencent.mm.plugin.fav.ui.PhotoTransControl$1 photoTransControl$1 = new com.tencent.mm.plugin.fav.ui.PhotoTransControl$1(this, com.tencent.mm.app.a0.f53288d);
        this.f101309k = photoTransControl$1;
        this.f101310l = new com.tencent.mm.plugin.fav.ui.jc(this);
        this.f101299a = hVar;
        this.f101304f = mMActivity;
        this.f101303e = e5Var;
        this.f101306h = (android.widget.ImageView) mMActivity.findViewById(com.tencent.mm.R.id.ma9);
        this.f101307i = (android.widget.ImageView) this.f101304f.findViewById(com.tencent.mm.R.id.ma7);
        this.f101305g = (android.widget.ImageView) this.f101304f.findViewById(com.tencent.mm.R.id.ma_);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f101307i.getLayoutParams();
        layoutParams.bottomMargin += com.tencent.mm.ui.bk.j(this.f101304f);
        this.f101307i.setLayoutParams(layoutParams);
        this.f101307i.setOnClickListener(new com.tencent.mm.plugin.fav.ui.kc(this));
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f101308j = ofFloat;
        ofFloat.setDuration(5000L);
        this.f101308j.addListener(new com.tencent.mm.plugin.fav.ui.lc(this));
        this.f101308j.addUpdateListener(new com.tencent.mm.plugin.fav.ui.mc(this, this.f101304f.getWindowManager().getDefaultDisplay().getHeight()));
        photoTransControl$1.alive();
    }

    public void a() {
        java.lang.String x27 = this.f101303e.x2();
        int i17 = this.f101302d;
        if ((i17 == 0 || i17 == 2) && !com.tencent.mm.sdk.platformtools.t8.K0(x27)) {
            com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct galleryTranslateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct();
            galleryTranslateReportStruct.f58318f = 5L;
            galleryTranslateReportStruct.f58316d = this.f101302d == 2 ? 1L : 0L;
            galleryTranslateReportStruct.f58317e = 3L;
            galleryTranslateReportStruct.q(this.f101303e.y3());
            galleryTranslateReportStruct.p(this.f101303e.getAesKey());
            galleryTranslateReportStruct.k();
            this.f101301c = (int) (c01.z1.r().hashCode() + java.lang.System.currentTimeMillis());
            dm.aa bj6 = ((com.tencent.mm.plugin.scanner.q0) ((com.tencent.mm.plugin.scanner.z) i95.n0.c(com.tencent.mm.plugin.scanner.z.class))).bj(x27);
            if (bj6 != null && com.tencent.mm.vfs.w6.j(bj6.field_resultFile)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("original_file_path", x27);
                intent.putExtra("translate_source", 5);
                intent.setClassName(this.f101304f, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
                intent.putExtra("fileid", this.f101303e.y3());
                intent.putExtra("aeskey", this.f101303e.getAesKey());
                com.tencent.mm.ui.MMActivity mMActivity = this.f101304f;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(mMActivity, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/PhotoTransControl", "doTransPhoto", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mMActivity.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(mMActivity, "com/tencent/mm/plugin/fav/ui/PhotoTransControl", "doTransPhoto", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                this.f101304f.finish();
                this.f101304f.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
                return;
            }
            if (gm0.j1.d().n() == 6 || gm0.j1.d().n() == 4) {
                this.f101302d = 1;
                this.f101305g.setVisibility(0);
                this.f101306h.setVisibility(0);
                this.f101307i.setVisibility(0);
                this.f101303e.L0();
                this.f101308j.setRepeatMode(1);
                this.f101308j.setRepeatCount(-1);
                this.f101308j.start();
            } else {
                com.tencent.mm.ui.MMActivity mMActivity2 = this.f101304f;
                db5.e1.s(mMActivity2, mMActivity2.getString(com.tencent.mm.R.string.f490500wu), "");
                b();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PhotoTransControl", "try to translate img %s, sessionId %d", x27, java.lang.Integer.valueOf(this.f101301c));
            com.tencent.mm.autogen.events.ScanTranslationEvent scanTranslationEvent = new com.tencent.mm.autogen.events.ScanTranslationEvent();
            am.bt btVar = scanTranslationEvent.f54738g;
            btVar.f6282a = 2;
            btVar.f6284c = x27;
            btVar.f6283b = this.f101301c;
            scanTranslationEvent.e();
        }
    }

    public void b() {
        this.f101302d = 0;
        this.f101305g.setVisibility(8);
        this.f101306h.setVisibility(8);
        this.f101307i.setVisibility(8);
        this.f101303e.l5();
        this.f101308j.setRepeatMode(1);
        this.f101308j.setRepeatCount(0);
        this.f101308j.end();
    }

    public void c() {
        this.f101308j.setRepeatMode(1);
        this.f101308j.setRepeatCount(0);
        this.f101308j.end();
        this.f101308j.removeAllUpdateListeners();
        this.f101309k.dead();
        gm0.j1.n().d(this.f101310l);
        this.f101299a = null;
        this.f101304f = null;
        this.f101303e = null;
    }

    public void d(java.lang.String str) {
        com.tencent.mm.ui.MMActivity mMActivity = this.f101304f;
        if (mMActivity == null || mMActivity.isFinishing()) {
            return;
        }
        if (this.f101300b == null) {
            kd0.h2 h2Var = (kd0.h2) i95.n0.c(kd0.h2.class);
            com.tencent.mm.ui.MMActivity mMActivity2 = this.f101304f;
            ((jd0.u1) h2Var).getClass();
            this.f101300b = new com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine(mMActivity2);
        }
        ((com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine) this.f101300b).b(str, this.f101299a);
    }
}
