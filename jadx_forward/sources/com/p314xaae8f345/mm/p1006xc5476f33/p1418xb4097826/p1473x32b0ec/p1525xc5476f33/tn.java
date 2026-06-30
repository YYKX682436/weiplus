package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class tn {
    public final android.animation.ObjectAnimator A;
    public volatile boolean B;
    public volatile boolean C;
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap D;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f195967a;

    /* renamed from: b, reason: collision with root package name */
    public final int f195968b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f195969c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f195970d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f195971e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f195972f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f195973g;

    /* renamed from: h, reason: collision with root package name */
    public volatile java.lang.String f195974h;

    /* renamed from: i, reason: collision with root package name */
    public volatile int f195975i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f195976j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f195977k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f195978l;

    /* renamed from: m, reason: collision with root package name */
    public volatile int f195979m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.un f195980n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn f195981o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f195982p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f195983q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f195984r;

    /* renamed from: s, reason: collision with root package name */
    public volatile java.lang.String f195985s;

    /* renamed from: t, reason: collision with root package name */
    public r45.ch1 f195986t;

    /* renamed from: u, reason: collision with root package name */
    public volatile java.lang.String f195987u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f195988v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f195989w;

    /* renamed from: x, reason: collision with root package name */
    public final android.animation.AnimatorSet f195990x;

    /* renamed from: y, reason: collision with root package name */
    public final android.animation.ObjectAnimator f195991y;

    /* renamed from: z, reason: collision with root package name */
    public final android.animation.ObjectAnimator f195992z;

    public tn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar, android.view.ViewGroup container, int i17, boolean z17, boolean z18, boolean z19, boolean z27, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        boolean z28 = (i19 & 8) != 0 ? false : z18;
        boolean z29 = (i19 & 16) != 0 ? false : z19;
        boolean z37 = (i19 & 32) != 0 ? false : z27;
        int i27 = (i19 & 64) != 0 ? 0 : i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        this.D = apVar;
        this.f195967a = container;
        this.f195968b = i17;
        this.f195969c = z29;
        this.f195970d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f195972f = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f195974h = "";
        this.f195978l = new java.util.concurrent.ConcurrentLinkedDeque();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.un unVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.un(container, z17, z29, z37, i27);
        this.f195980n = unVar;
        this.f195981o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn(container);
        this.f195982p = z28;
        this.f195985s = "";
        this.f195987u = ((mm2.c1) apVar.P0(mm2.c1.class)).f410385o;
        this.f195988v = new java.util.concurrent.atomic.AtomicBoolean(true);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f195990x = animatorSet;
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(unVar.f196130g, "scaleX", 0.0f, 1.1f).setDuration(63L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration, "setDuration(...)");
        this.f195991y = duration;
        android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofFloat(unVar.f196130g, "scaleY", 0.0f, 1.1f).setDuration(63L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration2, "setDuration(...)");
        this.f195992z = duration2;
        android.animation.ObjectAnimator duration3 = android.animation.ObjectAnimator.ofFloat(unVar.f196130g, "alpha", 0.0f, 1.0f).setDuration(104L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration3, "setDuration(...)");
        this.A = duration3;
        android.animation.ObjectAnimator duration4 = android.animation.ObjectAnimator.ofFloat(unVar.f196130g, "scaleX", 1.1f, 1.0f).setDuration(42L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration4, "setDuration(...)");
        duration4.setStartDelay(63L);
        android.animation.ObjectAnimator duration5 = android.animation.ObjectAnimator.ofFloat(unVar.f196130g, "scaleY", 1.1f, 1.0f).setDuration(42L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration5, "setDuration(...)");
        duration5.setStartDelay(63L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd3329234 = unVar.f196130g;
        if (c14323xd3329234 != null) {
            c14323xd3329234.setPivotX(0.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd33292342 = unVar.f196130g;
        if (c14323xd33292342 != null) {
            c14323xd33292342.setPivotY(c14323xd33292342.getMeasuredHeight());
        }
        animatorSet.playTogether(duration, duration2, duration4, duration5, duration3);
    }

    public final void a() {
        java.util.Map map = this.D.D;
        java.lang.String str = this.f195974h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vn vnVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vn();
        vnVar.f196333a.getAndSet(this.f195972f.get());
        vnVar.f196334b = this.f195975i;
        vnVar.f196335c = c01.id.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this.f195985s, "<set-?>");
        map.put(str, vnVar);
        pm0.v.O("giftQueueMapClear", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.on(this.D, this));
        java.lang.Integer num = (java.lang.Integer) this.f195978l.peekLast();
        if (num != null) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pn(this, num));
        }
        this.f195970d.getAndSet(false);
        this.f195971e = false;
        this.f195972f.getAndSet(false);
        this.f195973g = false;
        this.f195974h = "";
        this.f195975i = 0;
        this.f195979m = 0;
        this.f195978l.clear();
        this.f195983q = 0L;
        this.f195984r = 0L;
        this.f195985s = "";
        this.f195986t = null;
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qn(this));
        f(false);
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rn(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd3329234 = this.f195980n.f196130g;
        if (c14323xd3329234 == null) {
            return;
        }
        c14323xd3329234.setTag(null);
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.un unVar = this.f195980n;
        android.view.ViewGroup viewGroup = unVar.f196133j;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        android.view.View view = unVar.f196132i;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2GiftBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2GiftBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = unVar.f196135l;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2GiftBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2GiftBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = unVar.f196135l;
        if (view3 != null) {
            view3.setOnClickListener(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn wnVar = this.f195981o;
        android.view.View view4 = wnVar.f196502a;
        if (view4 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2GiftBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2GiftBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view5 = wnVar.f196505d;
        if (view5 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2GiftBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2GiftBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view6 = wnVar.f196502a;
        if (view6 != null) {
            view6.setOnClickListener(null);
        }
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.un unVar = this.f195980n;
        android.view.ViewGroup viewGroup = unVar.f196133j;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        android.view.View view = unVar.f196132i;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2NotifyBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2NotifyBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = unVar.f196135l;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2NotifyBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2NotifyBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = unVar.f196135l;
        if (view3 != null) {
            view3.setOnClickListener(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn wnVar = this.f195981o;
        android.view.View view4 = wnVar.f196502a;
        if (view4 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2NotifyBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2NotifyBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view5 = wnVar.f196505d;
        if (view5 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2NotifyBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2NotifyBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view6 = wnVar.f196502a;
        if (view6 != null) {
            view6.setOnClickListener(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.C
            if (r3 == r0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "bulletFlying origin value:"
            r0.<init>(r1)
            boolean r1 = r2.C
            r0.append(r1)
            java.lang.String r1 = ",value:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderLiveGiftQueuePlugin"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            if (r3 != 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            r2.C = r3
            if (r0 == 0) goto L2f
            java.lang.String r3 = "bulletFlying Stop"
            r2.g(r3)
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn.d(boolean):void");
    }

    public final void e(int i17, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 giftShowInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftShowInfo, "giftShowInfo");
        boolean z18 = false;
        if (giftShowInfo.f197135t) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.un unVar = this.f195980n;
            int i18 = this.f195975i;
            unVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "showBatchCntText: " + i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd3329234 = unVar.f196130g;
            if (c14323xd3329234 != null) {
                c14323xd3329234.setVisibility(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1499x306930.p1500xd1075a44.C14224x1cce21ec c14224x1cce21ec = unVar.f196131h;
            if (c14224x1cce21ec != null) {
                c14224x1cce21ec.setVisibility(0);
            }
            if (c14224x1cce21ec != null) {
                c14224x1cce21ec.h1(i18);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.un unVar2 = this.f195980n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd33292342 = unVar2.f196130g;
        if (c14323xd33292342 != null) {
            c14323xd33292342.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1499x306930.p1500xd1075a44.C14224x1cce21ec c14224x1cce21ec2 = unVar2.f196131h;
        if (c14224x1cce21ec2 != null) {
            c14224x1cce21ec2.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd33292343 = this.f195980n.f196130g;
        java.lang.Object tag = c14323xd33292343 != null ? c14323xd33292343.getTag() : null;
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        int intValue = num != null ? num.intValue() : this.f195979m;
        if (intValue < 1) {
            intValue = 1;
            z18 = true;
        }
        this.f195978l.clear();
        if (i17 <= intValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "setCntQueue: destinationCnt:" + i17 + " <= startCnt:" + intValue);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd33292344 = this.f195980n.f196130g;
            if (c14323xd33292344 != null) {
                c14323xd33292344.setText("x" + i17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd33292345 = this.f195980n.f196130g;
            if (c14323xd33292345 != null) {
                c14323xd33292345.setTag(java.lang.Integer.valueOf(i17));
            }
            if (this.f195977k) {
                pm0.v.V(500L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sn(this, this.D));
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("localSend:" + z17 + ",startCnt:" + intValue + ",lastCountOnBackToLive:" + this.f195979m + ",firstGift:" + z18 + ';');
        if (!z17) {
            int ceil = (int) java.lang.Math.ceil((i17 - intValue) / 5);
            int i19 = 1 < ceil ? ceil : 1;
            if (!z18) {
                intValue += i19;
            }
            while (intValue < i17) {
                this.f195978l.offer(java.lang.Integer.valueOf(intValue));
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(intValue);
                sb7.append(',');
                sb6.append(sb7.toString());
                intValue += i19;
            }
        }
        this.f195978l.offer(java.lang.Integer.valueOf(i17));
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "setCntQueue " + ((java.lang.Object) sb6));
        g("setCntQueue");
    }

    public final void f(boolean z17) {
        if (z17 != this.B) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "cntTransferAniming origin value:" + this.B + ",value:" + z17);
        }
        this.B = z17;
        if (this.B) {
            return;
        }
        g("cntTransferAnim end");
    }

    public final void g(java.lang.String prefix) {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b;
        df2.zo zoVar;
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        java.lang.Object obj;
        android.widget.TextView textView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        boolean isEmpty = this.f195978l.isEmpty();
        if (isEmpty || this.B || this.C) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "startTransferCnt(" + prefix + ") cntQueueEmpty:" + isEmpty + ",cntTransferAniming:" + this.B + ",bulletFlying:" + this.C);
            return;
        }
        java.lang.Integer num = (java.lang.Integer) this.f195978l.pollFirst();
        int intValue = num == null ? this.f195975i : num.intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd3329234 = this.f195980n.f196130g;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c14323xd3329234 != null ? c14323xd3329234.getF212379i() : null, "x" + intValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "startTransferCnt(" + prefix + ") number:" + intValue + ", sameValue:" + b17 + ", cntQueueEmpty:" + isEmpty + ",cntTransferAniming:" + this.B + ",bulletFlying:" + this.C);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd33292342 = this.f195980n.f196130g;
        if (c14323xd33292342 != null) {
            c14323xd33292342.setText("x" + intValue);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd33292343 = this.f195980n.f196130g;
        if (c14323xd33292343 != null) {
            c14323xd33292343.setTag(java.lang.Integer.valueOf(intValue));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd33292344 = this.f195980n.f196130g;
        if (c14323xd33292344 != null) {
            c14323xd33292344.setPivotX(0.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd33292345 = this.f195980n.f196130g;
        if (c14323xd33292345 != null) {
            c14323xd33292345.setPivotY(c14323xd33292345 != null ? c14323xd33292345.getMeasuredHeight() : 0.0f);
        }
        this.f195990x.start();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar = this.D;
        apVar.getClass();
        if (!b17 && this.f195980n.f196124a) {
            java.util.List list = ((mm2.o4) apVar.P0(mm2.o4.class)).f410860v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (android.text.TextUtils.equals(((km2.q) obj).f390705c, this.f195987u)) {
                            break;
                        }
                    }
                }
            }
            km2.q qVar = (km2.q) obj;
            if (!(qVar != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar.f390722t, java.lang.Boolean.TRUE) : false)) {
                android.widget.TextView textView2 = this.f195980n.f196128e;
                java.lang.CharSequence text = textView2 != null ? textView2.getText() : null;
                boolean z17 = true;
                if (!(text == null || text.length() == 0)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.un unVar = this.f195980n;
                    if (unVar.f196128e != null) {
                        android.widget.TextView textView3 = unVar.f196127d;
                        int measuredWidth = textView3 != null ? textView3.getMeasuredWidth() : 0;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd33292346 = this.f195980n.f196130g;
                        int measuredWidth2 = c14323xd33292346 != null ? c14323xd33292346.getMeasuredWidth() : 0;
                        float f17 = measuredWidth + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap.R;
                        float f18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap.P;
                        int i17 = (int) (f17 + f18 + measuredWidth2 + f18);
                        zl2.r4.f555483a.M2("Finder.FinderLiveGiftQueuePlugin", "enoughSpaceForRelaunch comboSumCount:" + this.f195975i + ",fromUserNameWidth:" + measuredWidth + ", countWidth:" + measuredWidth2 + ",takePlaceWidth:" + i17 + ",outSpaceWidth:" + this.f195980n.f196126c);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.un unVar2 = this.f195980n;
                        int i18 = unVar2.f196126c;
                        android.widget.TextView textView4 = unVar2.f196128e;
                        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dha, "");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        int paddingLeft = ((i18 - i17) - textView4.getPaddingLeft()) - textView4.getPaddingRight();
                        android.view.ViewParent parent = textView4.getParent();
                        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                        int paddingLeft2 = paddingLeft - (viewGroup != null ? viewGroup.getPaddingLeft() : 0);
                        android.view.ViewParent parent2 = textView4.getParent();
                        android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
                        int paddingRight = (paddingLeft2 - (viewGroup2 != null ? viewGroup2.getPaddingRight() : 0)) - 6;
                        z17 = (paddingRight > 0 ? new android.text.StaticLayout(string, textView4.getPaint(), paddingRight, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true).getLineCount() : Integer.MAX_VALUE) <= 1;
                    }
                }
                if (!z17 && (textView = this.f195980n.f196128e) != null) {
                    textView.setText("");
                }
            }
        }
        if (!this.f195977k || (c22789xd23e9a9b = this.f195980n.f196129f) == null || (zoVar = (df2.zo) this.D.U0(df2.zo.class)) == null || (j0Var = zoVar.f313513n) == null) {
            return;
        }
        j0Var.mo7808x76db6cb1(new jz5.l(this.f195985s, pm0.v.t(c22789xd23e9a9b)));
    }

    /* renamed from: toString */
    public java.lang.String m57048x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("index = " + this.f195968b);
        sb6.append(", ");
        sb6.append("giftId = " + this.f195985s);
        sb6.append(", ");
        sb6.append("isShowing = " + this.f195970d);
        sb6.append(", ");
        sb6.append("isPreciousGift = " + this.f195972f);
        sb6.append(", ");
        sb6.append("isAnimationEnd = " + this.f195971e);
        sb6.append(", ");
        sb6.append("comboId = " + this.f195974h);
        sb6.append(", ");
        sb6.append("comboSumCount = " + this.f195975i);
        sb6.append(", ");
        sb6.append("lastCountOnBackToLive = " + this.f195979m);
        sb6.append(", ");
        sb6.append("totalShowingTime = " + this.f195983q);
        sb6.append(", ");
        sb6.append("cntTransferAniming = " + this.B);
        sb6.append(", ");
        sb6.append("bulletFlying = " + this.C);
        sb6.append(", ");
        sb6.append("targetUserName = " + this.f195987u);
        sb6.append(", ");
        sb6.append("enabled = " + this.f195988v);
        sb6.append("isFromBatchSend = " + this.f195976j);
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
