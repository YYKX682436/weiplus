package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper */
/* loaded from: classes4.dex */
public class C17805xb6909733 extends android.widget.FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f245186o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f245187d;

    /* renamed from: e, reason: collision with root package name */
    public zy2.y7 f245188e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f245189f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f245190g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Set f245191h;

    /* renamed from: i, reason: collision with root package name */
    public int f245192i;

    /* renamed from: m, reason: collision with root package name */
    public int f245193m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f245194n;

    public C17805xb6909733(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f245190g = false;
        this.f245191h = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.f245194n = false;
        c(context);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17805xb6909733 c17805xb6909733, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        c17805xb6909733.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("prepareConfigIconAsyn", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        if (list != null && list.size() > 0) {
            java.util.Iterator it = list.iterator();
            java.util.ArrayList arrayList = null;
            java.util.ArrayList arrayList2 = null;
            while (it.hasNext()) {
                s34.q0 q0Var = (s34.q0) it.next();
                java.lang.String str = q0Var.f76712x61ad9236;
                java.util.Set set = c17805xb6909733.f245191h;
                if (!set.contains(str)) {
                    android.graphics.Bitmap i17 = za4.t0.i("adId_mm", q0Var.f76712x61ad9236);
                    if (i17 != null) {
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        if (arrayList2 == null) {
                            arrayList2 = new java.util.ArrayList();
                        }
                        arrayList.add(i17);
                        arrayList2.add(java.lang.Integer.valueOf(q0Var.f484276a));
                        set.add(q0Var.f76712x61ad9236);
                    } else {
                        a84.m.d(q0Var.f76712x61ad9236, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.e0(c17805xb6909733, q0Var));
                    }
                }
            }
            if (c17805xb6909733.f245188e != null && arrayList != null && arrayList.size() > 0 && arrayList2.size() > 0) {
                try {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf) c17805xb6909733.f245188e).b(arrayList, arrayList2);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivingAnimWrapper", "addCustomBitmapsAndRate, exp=" + th6.toString());
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prepareConfigIconAsyn", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
    }

    public static boolean e(s34.r0 r0Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showLivingAnim", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        boolean z18 = false;
        if (r0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivingAnimWrapper", "showLivingAnim but adLiveInfo is null, isLivingNow is " + z17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showLivingAnim", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivingAnimWrapper", "showLivingAnim, isLivingNow=" + z17 + ", showLikeAnimation=" + r0Var.f484285h + ", sdk_int=" + android.os.Build.VERSION.SDK_INT);
        if (z17 && r0Var.f484285h) {
            z18 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showLivingAnim", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        return z18;
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doClear", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivingAnimWrapper", "doClear");
        try {
            zy2.y7 y7Var = this.f245188e;
            if (y7Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf) y7Var).e();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivingAnimWrapper", "doClear, exp=" + android.util.Log.getStackTraceString(th6));
        }
        try {
            this.f245191h.clear();
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivingAnimWrapper", "doClear, exp=" + android.util.Log.getStackTraceString(th7));
        }
        this.f245190g = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClear", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        this.f245187d = context;
        this.f245192i = i65.a.b(context, 60);
        this.f245193m = i65.a.b(this.f245187d, 35);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("listenDestroy", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        try {
            if (context instanceof p012xc85e97e9.p093xedfae76a.y) {
                ((p012xc85e97e9.p093xedfae76a.y) context).mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper.1
                    @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
                    /* renamed from: onDestroy */
                    public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y yVar) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$1");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivingAnimWrapper", "onDestroy");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17805xb6909733 c17805xb6909733 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17805xb6909733.this;
                        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17805xb6909733.f245186o;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$002", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                        c17805xb6909733.f245194n = true;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$002", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17805xb6909733 c17805xb69097332 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17805xb6909733.this;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                        c17805xb69097332.b();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$1");
                    }
                });
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivingAnimWrapper", "listenDestroy, exp=" + e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("listenDestroy", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1697, 50);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
    }

    public void d(s34.r0 r0Var, java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdLiveInfo", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        try {
            this.f245192i = i17;
            this.f245193m = i18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivingAnimWrapper", "setAdLiveInfo, snsId=" + str + ", hash=" + hashCode());
            if (!android.text.TextUtils.isEmpty(this.f245189f) && !this.f245189f.equals(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLivingAnimWrapper", "setAdLiveInfo, snsId changed, old=" + this.f245189f + ", new=" + str);
                b();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivingAnimWrapper", "setAdLiveInfo, exp=" + android.util.Log.getStackTraceString(th6));
        }
        if (r0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivingAnimWrapper", "adLiveInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdLiveInfo", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
            return;
        }
        this.f245189f = str;
        this.f245194n = false;
        if (this.f245188e == null) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            vd2.t3 t3Var = vd2.t3.f517454a;
            android.content.Context context = this.f245187d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf c14394xb058b2bf = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf(context);
            this.f245188e = c14394xb058b2bf;
            android.widget.FrameLayout mo57883xfb86a31b = c14394xb058b2bf.mo57883xfb86a31b();
            if (mo57883xfb86a31b != null) {
                addView(mo57883xfb86a31b, new android.widget.FrameLayout.LayoutParams(-1, -1));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivingAnimWrapper", "mILiveView.getView()==null");
            }
        }
        zy2.y7 y7Var = this.f245188e;
        if (y7Var != null) {
            int i19 = (int) (r0Var.f484286i * 1000.0f);
            if (i19 <= 0) {
                i19 = 600;
            }
            y7Var.mo57885x98928347(i19);
            float f17 = r0Var.f484287j;
            if (f17 > 0.0f) {
                this.f245188e.mo57886x53aeca08(f17);
            }
        }
        java.util.List<s34.q0> list = r0Var.f76714x9f6a5b1f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("prepareIconAsynAndStart", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        if (this.f245188e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivingAnimWrapper", "prepareIconAsynAndStart, mILiveView==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prepareIconAsynAndStart", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        } else {
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.d0(this, list));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prepareIconAsynAndStart", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdLiveInfo", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        super.onDetachedFromWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivingAnimWrapper", "onDetachedFromWindow, snsId=" + this.f245189f + ", hash=" + hashCode());
        this.f245194n = true;
        b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        super.setVisibility(i17);
        if (i17 != 0 && this.f245188e != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivingAnimWrapper", "setVisibility=" + i17 + ", stopAndDestroy");
            b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
    }

    public C17805xb6909733(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f245190g = false;
        this.f245191h = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.f245194n = false;
        c(context);
    }
}
