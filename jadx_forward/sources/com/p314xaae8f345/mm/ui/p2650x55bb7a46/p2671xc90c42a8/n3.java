package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes12.dex */
public class n3 implements zb5.f, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q4, k70.w, wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public zb5.g f283889d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f283890e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f283891f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f283892g;

    /* renamed from: h, reason: collision with root package name */
    public long f283893h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.a0 f283894i;

    /* renamed from: m, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d f283895m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f283896n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f283897o;

    /* renamed from: p, reason: collision with root package name */
    public int f283898p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f283899q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f283900r;

    /* renamed from: s, reason: collision with root package name */
    public int f283901s;

    /* renamed from: t, reason: collision with root package name */
    public int f283902t;

    public n3(android.content.Context context) {
        this.f283890e = null;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f283896n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5568xa650f04c>(a0Var) { // from class: com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter$3
            {
                this.f39173x3fe91575 = 1036677180;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5568xa650f04c c5568xa650f04c) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5568xa650f04c c5568xa650f04c2 = c5568xa650f04c;
                long j17 = c5568xa650f04c2.f135888g.f88480c;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 n3Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3.this;
                java.util.Iterator it = n3Var.f283894i.f279919f.iterator();
                int i17 = -1;
                int i18 = -1;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    i18++;
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.w) it.next()).f279980b;
                    if (f9Var != null && f9Var.m124847x74d37ac6() == j17) {
                        i17 = i18;
                        break;
                    }
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) n3Var.d(n3Var.f283891f);
                int w17 = c1161x57298f5d.w();
                int y17 = c1161x57298f5d.y();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[getPhotoInfo] msgId:%s pos:%s [%s:%s]", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(w17), java.lang.Integer.valueOf(y17));
                if (i17 >= w17 && i17 <= y17) {
                    android.view.View childAt = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316) n3Var.f283889d).f282278f.getChildAt(i17 - w17);
                    if (childAt != null) {
                        int[] iArr = new int[2];
                        childAt.getLocationInWindow(iArr);
                        int i19 = iArr[0];
                        am.je jeVar = c5568xa650f04c2.f135889h;
                        jeVar.f88560a = i19;
                        jeVar.f88561b = iArr[1];
                        jeVar.f88562c = childAt.getWidth();
                        jeVar.f88563d = childAt.getHeight();
                    }
                }
                return false;
            }
        };
        this.f283897o = false;
        this.f283898p = 0;
        this.f283899q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f283900r = false;
        this.f283901s = 0;
        this.f283902t = 0;
        this.f283891f = context;
        this.f283890e = new java.util.ArrayList();
    }

    public final void c(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73) {
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87860m = 45;
        c4Var.f87856i = (android.app.Activity) this.f283891f;
        c5303xc75d2f73.e();
        int i17 = c5303xc75d2f73.f135624h.f87966a;
        if (i17 == -2 || i17 > 0 || i17 > 0) {
            return;
        }
        am.c4 c4Var2 = c5303xc75d2f73.f135623g;
        if (14 != c4Var2.f87850c) {
            return;
        }
        r45.sq0 sq0Var = c4Var2.f87849b;
        if (sq0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaHistoryGalleryPresenter", "want to report record fav, but type count is null");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11142, java.lang.Integer.valueOf(sq0Var.f467439d), java.lang.Integer.valueOf(c4Var2.f87849b.f467440e), java.lang.Integer.valueOf(c4Var2.f87849b.f467441f), java.lang.Integer.valueOf(c4Var2.f87849b.f467442g), java.lang.Integer.valueOf(c4Var2.f87849b.f467443h), java.lang.Integer.valueOf(c4Var2.f87849b.f467444i), java.lang.Integer.valueOf(c4Var2.f87849b.f467445m), java.lang.Integer.valueOf(c4Var2.f87849b.f467446n), java.lang.Integer.valueOf(c4Var2.f87849b.f467447o), java.lang.Integer.valueOf(c4Var2.f87849b.f467448p), java.lang.Integer.valueOf(c4Var2.f87849b.f467449q), java.lang.Integer.valueOf(c4Var2.f87849b.f467450r), java.lang.Integer.valueOf(c4Var2.f87849b.f467451s), java.lang.Integer.valueOf(c4Var2.f87849b.f467452t), java.lang.Integer.valueOf(c4Var2.f87849b.f467453u));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q4
    /* renamed from: clear */
    public void mo79579x5a5b64d() {
    }

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager d(android.content.Context context) {
        if (this.f283895m == null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(context, 4);
            this.f283895m = c1161x57298f5d;
            c1161x57298f5d.B = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.e3(this);
        }
        return this.f283895m;
    }

    public final boolean e() {
        return this.f283898p == 0;
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[onImgTaskEnd] mNeedDownloadCount:%s imgLocalId:%s msgLocalId:%s err[%s:%s:%s]", java.lang.Integer.valueOf(this.f283898p), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str2);
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316) this.f283889d).f282286q) {
            this.f283898p--;
            if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.j(this.f283891f, pt0.f0.Li(this.f283892g, j18), false)) {
                this.f283900r = true;
            }
            if (e()) {
                boolean z17 = this.f283900r;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f283899q;
                if (z17) {
                    n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.i3(this));
                } else {
                    n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.h3(this));
                }
            }
        }
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        zb5.g gVar = this.f283889d;
        if (gVar == null || !((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316) gVar).f282286q) {
            return;
        }
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String str = r1Var.f527062a;
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(str);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaHistoryGalleryPresenter", "[notifyChanged] videoInfo is null!");
            k();
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316) this.f283889d).U6(0);
        } else if (h17.i()) {
            this.f283898p--;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.l(this.f283891f, pt0.f0.Li(h17.h(), h17.f496549n), false);
        }
        if (e()) {
            boolean z17 = this.f283900r;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f283899q;
            if (z17) {
                n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.j3(this));
            } else {
                n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.k3(this));
            }
        }
    }

    public void j(boolean z17, int i17) {
        if (!z17 && this.f283902t + this.f283901s == this.f283890e.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[loadData] that's all msg :%s offset:%s", java.lang.Integer.valueOf(this.f283902t), java.lang.Integer.valueOf(i17));
            return;
        }
        this.f283894i.f279925o = true;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316 viewOnClickListenerC21789x2eb4d316 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316) this.f283889d;
        if (z17) {
            viewOnClickListenerC21789x2eb4d316.W6(true, null);
        } else {
            viewOnClickListenerC21789x2eb4d316.f282293x = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) viewOnClickListenerC21789x2eb4d316.f282278f.getLayoutManager()).y();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryUI", "onDataLoading mLastVisibleItemPosition:%s", java.lang.Integer.valueOf(viewOnClickListenerC21789x2eb4d316.f282293x));
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.d3(this, z17, i17), "MediaHistoryLoadData");
    }

    public void k() {
        ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).d(this);
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().A(this);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316 viewOnClickListenerC21789x2eb4d316 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316) this.f283889d;
        viewOnClickListenerC21789x2eb4d316.X6();
        viewOnClickListenerC21789x2eb4d316.f282286q = false;
        viewOnClickListenerC21789x2eb4d316.W6(false, "");
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q4
    public void l0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        this.f283897o = true;
    }

    @Override // k70.w
    public void o(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z
    /* renamed from: onDetach */
    public void mo79813x3f5eee52() {
        this.f283896n.mo48814x2efc64();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316 viewOnClickListenerC21789x2eb4d316 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316) this.f283889d;
        viewOnClickListenerC21789x2eb4d316.getClass();
        viewOnClickListenerC21789x2eb4d316.f282276d = null;
        this.f283889d = null;
        ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).d(this);
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().A(this);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r4 r4Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p4.f282798a;
        r4Var.f282868c.clear();
        r4Var.b();
        r4Var.f282867b = false;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.a();
    }
}
