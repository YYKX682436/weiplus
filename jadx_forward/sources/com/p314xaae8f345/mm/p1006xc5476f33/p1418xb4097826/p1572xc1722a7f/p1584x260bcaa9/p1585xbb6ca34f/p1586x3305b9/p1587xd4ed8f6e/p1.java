package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public class p1 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f203403e;

    /* renamed from: f, reason: collision with root package name */
    public final sp2.c4 f203404f;

    /* renamed from: g, reason: collision with root package name */
    public final sp2.k f203405g;

    /* renamed from: h, reason: collision with root package name */
    public tx2.s f203406h;

    /* renamed from: i, reason: collision with root package name */
    public final ml2.d f203407i;

    /* renamed from: m, reason: collision with root package name */
    public tp2.f f203408m;

    /* renamed from: n, reason: collision with root package name */
    public r45.qt2 f203409n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f203410o;

    public p1(android.content.Context context, sp2.c4 outsideEventListener, sp2.k outsideOperator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outsideEventListener, "outsideEventListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outsideOperator, "outsideOperator");
        this.f203403e = context;
        this.f203404f = outsideEventListener;
        this.f203405g = outsideOperator;
        this.f203407i = new ml2.d();
        this.f203410o = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.c1(this));
    }

    public static final void n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p1 p1Var, in5.s0 s0Var, vp2.l lVar) {
        java.lang.String m76197x6c03c64c;
        r45.oa2 oa2Var;
        r45.h32 h32Var;
        p1Var.getClass();
        cl0.g gVar = new cl0.g();
        gVar.s("Noticeid", (lVar == null || (oa2Var = lVar.f520468d) == null || (h32Var = (r45.h32) oa2Var.m75936x14adae67(0)) == null) ? null : h32Var.m75945x2fec8307(4));
        gVar.s("style", java.lang.Integer.valueOf(lVar.f520472h ? 1 : 2));
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        p1Var.r("main_page_notice_card", gVar2, false);
        r45.oa2 oa2Var2 = lVar.f520468d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) oa2Var2.m75936x14adae67(1);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) oa2Var2.m75936x14adae67(1);
        java.lang.String str = (c19782x23db1cfa2 == null || (m76197x6c03c64c = c19782x23db1cfa2.m76197x6c03c64c()) == null) ? "" : m76197x6c03c64c;
        r45.h32 h32Var2 = (r45.h32) oa2Var2.m75936x14adae67(0);
        r45.qt2 qt2Var = p1Var.f203409n;
        if (c19782x23db1cfa == null || h32Var2 == null || qt2Var == null) {
            return;
        }
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        boolean z17 = lVar.f520472h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.o1 o1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.o1(p1Var, str, h32Var2);
        tx2.s sVar = p1Var.f203406h;
        if (sVar != null) {
            cl0.g gVar3 = new cl0.g();
            gVar3.o("style", z17 ? 1 : 2);
            sVar.f504179b = str;
            sVar.f504178a = 265;
            sVar.f504180c = activity;
            sVar.f504181d = qt2Var;
            sVar.f504182e = h32Var2;
            sVar.f504183f = 1L;
            sVar.f504184g = "";
            sVar.f504185h = 302;
            sVar.f504186i = o1Var;
            sVar.f504187j = gVar3;
        } else {
            sVar = new tx2.s(265, str, activity, qt2Var, h32Var2, 1L, "", 302, o1Var);
            p1Var.f203406h = sVar;
            cl0.g gVar4 = new cl0.g();
            gVar4.o("style", z17 ? 1 : 2);
            sVar.f504187j = gVar4;
        }
        tx2.n nVar = new tx2.n(sVar);
        p1Var.q().z(str, h32Var2, null);
        java.lang.String str2 = str;
        p1Var.q().A(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.m1(s0Var, h32Var2, p1Var, nVar, lVar));
        p1Var.q().F = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.n1(h32Var2);
        p1Var.q().w();
        cl0.g gVar5 = new cl0.g();
        r45.ov2 a17 = zl2.t.a(h32Var2);
        gVar5.h("coupon_id", a17 != null ? a17.m75945x2fec8307(1) : null);
        gVar5.o("style", lVar.f520472h ? 1 : 2);
        i95.m c17 = i95.n0.c(c50.c1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c50.c1 c1Var = (c50.c1) c17;
        ml2.i5 i5Var = ml2.i5.f409103e;
        java.lang.String m75945x2fec8307 = h32Var2.m75945x2fec8307(3);
        java.lang.String str3 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
        java.lang.String m75945x2fec83072 = h32Var2.m75945x2fec8307(4);
        java.lang.String gVar6 = gVar5.toString();
        android.content.Context context2 = p1Var.f203403e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        c50.c1.l9(c1Var, i5Var, str2, 0L, 0, "265", null, null, null, null, str3, "", m75945x2fec83072, gVar6, 0L, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n, null, 33248, null);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c6o;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0142  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r29, in5.c r30, int r31, int r32, boolean r33, java.util.List r34) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p1.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p(holder);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) holder.p(com.p314xaae8f345.mm.R.id.m8y);
        if (c22849x81a93d25 != null) {
            in5.o.b(c22849x81a93d25, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.j1(holder, this), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.k1.f203285d);
        }
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HeadLivingListConvert", "#onViewRecycled holder=" + holder);
        o(holder);
    }

    public final void o(in5.s0 s0Var) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25;
        java.lang.Object obj = s0Var.f374657h;
        if (obj != null && (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.b1)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.b1) obj;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = b1Var.f203118a;
            if (c22849x81a93d252 != null) {
                android.content.Context context = s0Var.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                c22849x81a93d252.mo7960x6cab2c8d(new up2.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.C14539x4f07c273((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, false, false, 0, false, 16, null), new java.util.ArrayList()));
            }
            sp2.b4 b4Var = b1Var.f203119b;
            if (b4Var != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[AutoPlayCheck] REMOVE caller=");
                sb6.append(b4Var);
                sb6.append(", item.hashCode=");
                sb6.append(b1Var.f203122e);
                sb6.append(", size before=");
                sp2.c4 c4Var = this.f203404f;
                sb6.append(((java.util.ArrayList) c4Var.f492530a).size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HeadLivingListConvert", sb6.toString());
                ((java.util.ArrayList) c4Var.f492530a).remove(b4Var);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var = b1Var.f203120c;
            if (w2Var != null && (c22849x81a93d25 = b1Var.f203118a) != null) {
                c22849x81a93d25.V0(w2Var);
            }
            android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = b1Var.f203121d;
            if (activityLifecycleCallbacks != null) {
                android.content.Context applicationContext = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext();
                android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
            }
        }
        s0Var.f374657h = null;
    }

    public final void p(in5.s0 s0Var) {
        if (this.f203409n == null || this.f203408m == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HeadLivingListConvert", "reportContext:" + this.f203409n + ", nearbyLiveViewItemClick:" + this.f203408m);
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            android.content.Context context2 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            this.f203408m = new tp2.f(V6, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2, null, 0, this.f203405g);
            this.f203409n = V6;
        }
    }

    public final tx2.i0 q() {
        return (tx2.i0) ((jz5.n) this.f203410o).mo141623x754a37bb();
    }

    public final void r(java.lang.String str, java.lang.String str2, boolean z17) {
        android.content.Context context = this.f203403e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(rq2.w.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            rq2.w wVar = (rq2.w) a17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HeadLivingListConvert", "optionIconReport: " + z17);
            if (z17) {
                wVar.P6("", V6.m75945x2fec8307(1), str, r26.i0.t(str2, ",", ";", false));
            } else {
                wVar.Q6(V6.m75945x2fec8307(1), str, r26.i0.t(str2, ",", ";", false));
            }
        }
    }
}
