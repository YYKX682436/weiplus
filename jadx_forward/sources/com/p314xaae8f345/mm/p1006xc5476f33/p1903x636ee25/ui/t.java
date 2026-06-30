package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* loaded from: classes11.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public ql3.a f232312a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16632x3976002 f232313b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f232314c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f232315d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f232316e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f232317f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f232318g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f232319h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16630x650e2b84 f232320i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f232322k;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.u f232324m;

    /* renamed from: j, reason: collision with root package name */
    public int f232321j = 1;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.animation.Animation.AnimationListener f232323l = new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.r(this);

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.u uVar) {
        this.f232324m = uVar;
    }

    public void a() {
        if (this.f232322k || this.f232321j == 2) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.u uVar = this.f232324m;
        pl3.c.b(2, uVar.f232338p);
        if (uVar.f232337o == 0) {
            uVar.f232337o = this.f232314c.getMeasuredHeight();
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, uVar.f232337o);
            layoutParams.weight = 0.0f;
            this.f232314c.setLayoutParams(layoutParams);
        }
        pl3.c.f438232b = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(285L, 4L, 1L, false);
        this.f232321j = 2;
        this.f232322k = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.s(this, this.f232320i, uVar.f232333h);
        sVar.setDuration(500L);
        sVar.setAnimationListener(this.f232323l);
        this.f232320i.startAnimation(sVar);
    }

    public void b() {
        if (this.f232322k || this.f232321j == 1) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.u uVar = this.f232324m;
        pl3.c.b(3, uVar.f232338p);
        if (uVar.f232337o == 0) {
            uVar.f232337o = this.f232314c.getMeasuredHeight();
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, uVar.f232337o);
            layoutParams.weight = 0.0f;
            this.f232314c.setLayoutParams(layoutParams);
        }
        pl3.c.f438232b = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(285L, 4L, 1L, false);
        this.f232321j = 1;
        this.f232322k = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.s(this, this.f232320i, uVar.f232332g);
        sVar.setDuration(500L);
        sVar.setAnimationListener(this.f232323l);
        this.f232320i.startAnimation(sVar);
    }

    public void c(ql3.a aVar, boolean z17) {
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicMainAdapter", "updateView %s", aVar.f67001x79435ae5);
            this.f232312a = aVar;
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f66995x4a6948ee);
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.u uVar = this.f232324m;
            if (K0) {
                ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).E(aVar, uVar.f232339q, true);
            }
            this.f232313b.setTag(this);
            if ((!ll3.j2.h(aVar) || uVar.f232338p == 3) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f67002x3ed1b556)) {
                this.f232319h.setText(aVar.f67002x3ed1b556);
                this.f232319h.setVisibility(0);
            } else {
                this.f232319h.setVisibility(8);
            }
            this.f232318g.setText(aVar.f67001x79435ae5);
            this.f232318g.setTag(aVar.f67001x79435ae5);
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16630x650e2b84 c16630x650e2b84 = this.f232320i;
            ql3.b Ai = ll3.o2.Ai();
            boolean z18 = uVar.f232339q;
            lt0.f fVar = (lt0.f) Ai.f446115f;
            c16630x650e2b84.m67233x12e1de9a(fVar.get(aVar.f66983xc8c6afdb) != null ? (ll3.h1) fVar.get(aVar.f66983xc8c6afdb) : Ai.z0(aVar, z18, true));
            if (!ll3.j2.h(aVar) || uVar.f232339q) {
                this.f232320i.m67231x9411da24(1L);
            }
            b();
            uVar.f232336n.b(aVar, this.f232317f, uVar.f309888d, z17, uVar.f232339q);
        }
    }
}
