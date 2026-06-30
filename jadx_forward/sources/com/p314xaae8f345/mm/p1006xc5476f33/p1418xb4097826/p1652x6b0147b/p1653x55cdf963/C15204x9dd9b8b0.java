package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/autoplay/FinderMultiFlowVideoAutoPlayManager;", "Lfc2/d;", "Ldw2/c0;", "Ltd2/c;", "Lcom/tencent/mm/ui/MMFragmentActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lcom/tencent/mm/plugin/finder/viewmodel/component/nb0;", "recycler", "", "tabType", "<init>", "(Lcom/tencent/mm/ui/MMFragmentActivity;Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/finder/viewmodel/component/nb0;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager */
/* loaded from: classes2.dex */
public final class C15204x9dd9b8b0 extends fc2.d implements dw2.c0, td2.c {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f212293g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f212294h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0 f212295i;

    /* renamed from: m, reason: collision with root package name */
    public final int f212296m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f212297n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f212298o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashSet f212299p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f212300q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f212301r;

    /* renamed from: s, reason: collision with root package name */
    public long f212302s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f212303t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Rect f212304u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f212305v;

    public C15204x9dd9b8b0(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0 recycler, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        this.f212293g = activity;
        this.f212294h = recyclerView;
        this.f212295i = recycler;
        this.f212296m = i17;
        this.f212297n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper(), new dw2.r(this));
        this.f212298o = new java.util.HashMap();
        this.f212299p = new java.util.HashSet();
        this.f212303t = new int[2];
        this.f212304u = new android.graphics.Rect();
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!(event instanceof fc2.y)) {
            return false;
        }
        int i17 = ((fc2.y) event).f342539d;
        return i17 == 0 || i17 == 5 || i17 == 11;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (ev6 instanceof fc2.y) {
            fc2.y yVar = (fc2.y) ev6;
            if (yVar.f342542g != yVar.f342540e) {
                this.f212297n.mo50305x3d8a09a2(1);
            }
        }
    }

    @Override // fc2.d
    public void H0() {
        this.f212297n.mo50302x6b17ad39(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I0(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r3) {
        /*
            r2 = this;
            com.tencent.mm.plugin.finder.view.lm r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mm.E
            com.tencent.mm.ui.MMFragmentActivity r1 = r2.f212293g
            boolean r0 = r0.a(r1)
            if (r0 != 0) goto L46
            com.tencent.mm.plugin.finder.view.f3 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g3.f213676a
            boolean r0 = r0.a(r1)
            if (r0 != 0) goto L46
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isHalfScreenLandingPageShowing:"
            r0.<init>(r1)
            boolean r1 = n54.i.f416673b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AdHalfScreenLandingPageState"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            boolean r0 = n54.i.f416673b
            if (r0 != 0) goto L46
            boolean r0 = eq.a.f337311b
            if (r0 != 0) goto L46
            boolean r0 = eq.a.f337312c
            if (r0 != 0) goto L46
            java.lang.Class<zy2.b6> r0 = zy2.b6.class
            i95.m r0 = i95.n0.c(r0)
            zy2.b6 r0 = (zy2.b6) r0
            c61.l7 r0 = (c61.l7) r0
            boolean r0 = r0.Bk()
            if (r0 == 0) goto L44
            goto L46
        L44:
            r0 = 0
            goto L47
        L46:
            r0 = 1
        L47:
            if (r0 == 0) goto L4a
            return
        L4a:
            if (r3 == 0) goto L5a
            android.view.View r3 = r3.f3639x46306858
            if (r3 == 0) goto L5a
            r0 = 2131305034(0x7f09224a, float:1.8228227E38)
            android.view.View r3 = r3.findViewById(r0)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) r3
            goto L5b
        L5a:
            r3 = 0
        L5b:
            dw2.s r0 = new dw2.s
            r0.<init>(r3)
            com.tencent.mm.plugin.finder.viewmodel.component.nb0 r3 = r2.f212295i
            com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) r3
            r3.a7(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15204x9dd9b8b0.I0(androidx.recyclerview.widget.k3):void");
    }

    @Override // dw2.c0
    public void X(boolean z17) {
    }

    @Override // td2.c
    /* renamed from: onCreate */
    public void mo55613x3e5a77bb(p012xc85e97e9.p093xedfae76a.y var1) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
    }

    @Override // td2.c
    /* renamed from: onDestroy */
    public void mo55614xac79a11b(p012xc85e97e9.p093xedfae76a.y var1) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
    }

    @Override // td2.c
    /* renamed from: onPause */
    public void mo55615xb01dfb57(p012xc85e97e9.p093xedfae76a.y var1) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
        this.f212305v = false;
        this.f212297n.mo50303x856b99f0(1);
        I0(null);
    }

    @Override // td2.c
    /* renamed from: onResume */
    public void mo55616x57429eec(p012xc85e97e9.p093xedfae76a.y var1) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
        this.f212305v = true;
        this.f212297n.mo50305x3d8a09a2(1);
    }

    @Override // td2.c
    /* renamed from: onStart */
    public void mo55617xb05099c3(p012xc85e97e9.p093xedfae76a.y var1) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
    }

    @Override // td2.c
    /* renamed from: onStop */
    public void mo55618xc39f8281(p012xc85e97e9.p093xedfae76a.y var1) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
    }

    @Override // dw2.c0
    public void s() {
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity = this.f212293g;
        D0(activity, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        fc2.c Y6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).Y6(this.f212296m);
        if (Y6 != null) {
            Y6.a(this);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f212297n;
        if (!n3Var.mo50285x8fc9be06(1)) {
            n3Var.mo50307xb9e94560(1, 500L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209358ma).mo141623x754a37bb()).r()).intValue() == 1) {
            android.view.View decorView = activity.getWindow().getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
            android.view.View view = new android.view.View(activity);
            view.setBackgroundColor(-16711936);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, 4);
            this.f212294h.post(new dw2.t(this, layoutParams));
            view.setLayoutParams(layoutParams);
            ((android.widget.FrameLayout) decorView).addView(view);
        }
    }

    @Override // dw2.c0
    public void w0(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f212297n;
        n3Var.mo50303x856b99f0(1);
        n3Var.mo50305x3d8a09a2(1);
    }

    @Override // dw2.c0
    public void y(java.lang.String scene, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[lock] scene=");
        sb6.append(scene);
        sb6.append(" isLock=");
        sb6.append(z17);
        sb6.append(" lockSize=");
        java.util.HashSet hashSet = this.f212299p;
        sb6.append(hashSet.size());
        sb6.append(" unLockAfterCheck=");
        sb6.append(z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MultiFlowVideoAutoPlayManager", sb6.toString());
        if (z17) {
            hashSet.add(scene);
            this.f212300q = true;
        } else {
            hashSet.remove(scene);
            if (hashSet.size() <= 0) {
                this.f212300q = false;
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f212297n;
        n3Var.mo50303x856b99f0(1);
        if (this.f212300q || !z18) {
            return;
        }
        n3Var.mo50305x3d8a09a2(1);
    }
}
