package kf3;

/* loaded from: classes5.dex */
public class u implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 f388969a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f388970b;

    /* renamed from: c, reason: collision with root package name */
    public final kf3.t f388971c;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Vibrator f388973e;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f388975g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f388976h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f388977i;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.e1 f388979k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.f1 f388980l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f388981m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f388982n;

    /* renamed from: d, reason: collision with root package name */
    public long f388972d = -1;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f388974f = null;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f388978j = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new kf3.j(this), true);

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33, java.lang.String str, java.util.List list, boolean z17) {
        kf3.k kVar = new kf3.k(this);
        this.f388979k = kVar;
        kf3.l lVar = new kf3.l(this);
        this.f388980l = lVar;
        this.f388981m = false;
        this.f388982n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new kf3.m(this), true);
        this.f388969a = activityC16488xbf7e6679;
        this.f388970b = c19666xfd6e2f33;
        this.f388975g = str;
        this.f388976h = list;
        this.f388977i = z17;
        kf3.t tVar = new kf3.t(this, activityC16488xbf7e6679);
        this.f388971c = tVar;
        tVar.f501619s = kVar;
        tVar.f501618r = lVar;
        this.f388973e = (android.os.Vibrator) activityC16488xbf7e6679.getSystemService("vibrator");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public java.lang.String a() {
        kf3.t tVar = this.f388971c;
        return tVar != null ? tVar.f388963y : "";
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public void b(android.view.View view) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public long c() {
        kf3.t tVar = this.f388971c;
        if (tVar != null) {
            return tVar.c();
        }
        return 0L;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public boolean d(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        this.f388970b.m75500x1f95af65(str);
        this.f388969a.c7(new kf3.p(this, str));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public boolean e() {
        this.f388978j.d();
        this.f388982n.d();
        this.f388972d = -1L;
        this.f388970b.d1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.f5.Cancel);
        kf3.t tVar = this.f388971c;
        tVar.mo47960x360802();
        w21.x0.e(null, tVar.f388963y);
        ((com.p314xaae8f345.mm.p642xad8b531f.b) c01.d9.c()).b();
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public boolean f(boolean z17) {
        this.f388978j.d();
        this.f388982n.d();
        this.f388972d = -1L;
        boolean mo47960x360802 = this.f388971c.mo47960x360802();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f388970b;
        if (mo47960x360802) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.e.I.b(0);
            this.f388969a.c7(new kf3.o(this));
            c19666xfd6e2f33.d1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.f5.SendVoice);
        } else {
            c19666xfd6e2f33.n1();
        }
        ((com.p314xaae8f345.mm.p642xad8b531f.b) c01.d9.c()).b();
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public boolean g() {
        this.f388978j.d();
        this.f388982n.d();
        this.f388972d = -1L;
        this.f388971c.mo47960x360802();
        this.f388970b.d1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.f5.StopRecord);
        ((com.p314xaae8f345.mm.p642xad8b531f.b) c01.d9.c()).b();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public void h(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public void i(android.view.View view, android.view.MotionEvent motionEvent) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public boolean j() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public boolean k(java.lang.String str) {
        return w21.x0.e(null, str);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public void l(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public void m() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public r15.b n() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public void o() {
        this.f388970b.d1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.f5.Cancel);
        kf3.t tVar = this.f388971c;
        tVar.mo47960x360802();
        w21.x0.e(null, tVar.f388963y);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    /* renamed from: onPause */
    public void mo75553xb01dfb57() {
        this.f388978j.d();
        this.f388982n.d();
        this.f388972d = -1L;
        kf3.t tVar = this.f388971c;
        if (!(ba5.a.f100235b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ba5.a.f100234a, tVar.f388963y))) {
            if (!(ba5.a.f100237d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ba5.a.f100236c, tVar.f388963y))) {
                tVar.mo47960x360802();
            }
        }
        ((com.p314xaae8f345.mm.p642xad8b531f.b) c01.d9.c()).b();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    /* renamed from: onResume */
    public void mo75554x57429eec() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public boolean p(java.lang.String str, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f388969a.c7(new kf3.o(this));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public boolean q(boolean z17) {
        boolean E = c01.d9.b().E();
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679 = this.f388969a;
        if (!E) {
            db5.t7.k(activityC16488xbf7e6679, null);
            return false;
        }
        iq.b.s(activityC16488xbf7e6679);
        this.f388973e.vibrate(50L);
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.e eVar = com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.e.I;
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.e.I.f256910a = true;
        this.f388978j.c(100L, 100L);
        this.f388981m = false;
        this.f388982n.c(200L, 200L);
        int i17 = activityC16488xbf7e6679.getResources().getDisplayMetrics().heightPixels;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f388970b;
        c19666xfd6e2f33.w1(i17 - c19666xfd6e2f33.getHeight());
        kf3.t tVar = this.f388971c;
        tVar.g("_USER_FOR_THROWBOTTLE_", tVar.f501608h);
        tVar.f501618r = this.f388980l;
        tVar.f501619s = this.f388979k;
        ((com.p314xaae8f345.mm.p642xad8b531f.b) c01.d9.c()).a();
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public void r() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    /* renamed from: release */
    public void mo75555x41012807() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public void s(android.view.View view) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public void t() {
    }
}
