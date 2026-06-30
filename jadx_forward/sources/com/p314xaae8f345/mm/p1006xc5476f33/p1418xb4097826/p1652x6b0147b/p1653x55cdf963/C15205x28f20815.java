package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B7\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/autoplay/FinderVideoAutoPlayManager;", "Lfc2/d;", "Ldw2/c0;", "Ltd2/c;", "Ldw2/a0;", "Lcom/tencent/mm/ui/MMFragmentActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lcom/tencent/mm/plugin/finder/viewmodel/component/nb0;", "recycler", "Ldw2/b0;", "feedSelectorAdapter", "Luo2/v;", "musicManager", "", "tabType", "<init>", "(Lcom/tencent/mm/ui/MMFragmentActivity;Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/finder/viewmodel/component/nb0;Ldw2/b0;Luo2/v;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager */
/* loaded from: classes2.dex */
public final class C15205x28f20815 extends fc2.d implements dw2.c0, td2.c, dw2.a0 {

    /* renamed from: z, reason: collision with root package name */
    public static long f212306z = -1;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f212307g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f212308h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0 f212309i;

    /* renamed from: m, reason: collision with root package name */
    public final dw2.b0 f212310m;

    /* renamed from: n, reason: collision with root package name */
    public final uo2.v f212311n;

    /* renamed from: o, reason: collision with root package name */
    public final int f212312o;

    /* renamed from: p, reason: collision with root package name */
    public final kz2.c f212313p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f212314q;

    /* renamed from: r, reason: collision with root package name */
    public long f212315r;

    /* renamed from: s, reason: collision with root package name */
    public final int f212316s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.p f212317t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashSet f212318u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f212319v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.HashSet f212320w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f212321x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f212322y;

    public C15205x28f20815(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0 recycler, dw2.b0 feedSelectorAdapter, uo2.v musicManager, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedSelectorAdapter, "feedSelectorAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicManager, "musicManager");
        this.f212307g = activity;
        this.f212308h = recyclerView;
        this.f212309i = recycler;
        this.f212310m = feedSelectorAdapter;
        this.f212311n = musicManager;
        this.f212312o = i17;
        this.f212313p = new kz2.c("ReadyPlayForward");
        this.f212314q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper(), new dw2.u(this));
        this.f212315r = -1L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.f212316s = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209583z2).mo141623x754a37bb()).r()).intValue();
        dw2.o oVar = (dw2.o) feedSelectorAdapter;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f325669a, "bindRecyclerView recyclerView:" + recyclerView);
        oVar.f325671c = recyclerView;
        oVar.f325672d = i17;
        if ((recyclerView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) && ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Z4).mo141623x754a37bb()).r()).intValue() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea c13728x20aad6ea = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) recyclerView;
            c13728x20aad6ea.m55759x63ac16d8(!((java.lang.Boolean) ((jz5.n) oVar.f325682n).mo141623x754a37bb()).booleanValue());
            c13728x20aad6ea.m55763x737778f5(new dw2.f(oVar));
        }
        recyclerView.O(new dw2.h(recyclerView, oVar));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = oVar.f325671c;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.i(new dw2.e(c1163xf1deaba4, oVar));
        }
        oVar.f325673e = this;
        this.f212318u = new java.util.HashSet();
        this.f212320w = new java.util.HashSet();
        this.f212322y = true;
    }

    public static final void P0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15205x28f20815 c15205x28f20815, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88, in5.s0 s0Var, kz2.a aVar, boolean z17) {
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(c14989xf862ae88.m59135x7efe73ec());
        jz5.f0 f0Var = null;
        if (mb4Var != null) {
            c15205x28f20815.N0(s0Var);
            long m59127x5db1b11 = c14989xf862ae88.m59127x5db1b11();
            jz5.f0 f0Var2 = jz5.f0.f384359a;
            if (s0Var != null) {
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.g2r);
                if (frameLayout != null && frameLayout.getVisibility() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoAutoPlayManager", "playFocusHolder videoContainer shareShadowView is visible, return}");
                } else {
                    cw2.v9 L0 = c15205x28f20815.L0(s0Var);
                    if (L0 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoAutoPlayManager", "playFocusHolder videoContainer " + L0.g());
                        if (aVar != null) {
                            aVar.c("playFocusHolder");
                        }
                        L0.mo61326x26d5cbcc(true);
                        cw2.da videoView = L0.getVideoView();
                        boolean mo58787xc00617a4 = videoView != null ? videoView.mo58787xc00617a4() : false;
                        boolean isPreRenderFirstFrame = L0.getIsPreRenderFirstFrame();
                        if (mo58787xc00617a4) {
                            if (aVar != null) {
                                aVar.b("hitPause");
                            }
                        } else if (isPreRenderFirstFrame && aVar != null) {
                            aVar.b("hitPreRender");
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoAutoPlayManager", "lxltest111 isLiveFeed:" + z17 + " videoContainer.isMute:" + L0.getIsMute());
                        if (z17 && L0.getIsMute()) {
                            L0.mo61320x764d819b(false);
                        }
                        L0.m(s0Var.m8183xf806b362(), aVar, abstractC14490x69736cb5);
                        if (!c15205x28f20815.f212321x && c15205x28f20815.f212322y) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) c15205x28f20815.f212309i).a7(dw2.y.f325707d);
                        }
                        f0Var = f0Var2;
                    }
                    if (f0Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.VideoAutoPlayManager", "playFocusHolder videoContainer is null! mediaId=" + mb4Var.m75945x2fec8307(9) + "] feedId=" + m59127x5db1b11);
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoAutoPlayManager", "playFocusHolder mediaList first feed.");
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.VideoAutoPlayManager", "playFocusHolder mediaList first feed null.");
        }
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event instanceof fc2.t) {
            int i17 = ((fc2.t) event).f342518d;
            if (i17 == 3 || i17 == 0 || i17 == 5 || i17 == 11) {
                return true;
            }
        } else if ((event instanceof ec2.f) && ((ec2.f) event).f332492d == 25) {
            return true;
        }
        return false;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        boolean z17 = ev6 instanceof fc2.t;
        dw2.b0 b0Var = this.f212310m;
        if (z17) {
            fc2.t tVar = (fc2.t) ev6;
            if (((dw2.o) b0Var).l(tVar.f342525k)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoAutoPlayManager", "onEventHappen event state:" + tVar.f342524j + " event feed:" + tVar.f342525k);
                this.f212308h.post(new dw2.v(ev6, this));
                return;
            }
            return;
        }
        if (ev6 instanceof ec2.f) {
            ec2.f fVar = (ec2.f) ev6;
            dw2.o oVar = (dw2.o) b0Var;
            if (oVar.l(fVar.f332498j)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoAutoPlayManager", "onEventHappen PlayEvent state:" + fVar.f332492d + " event feed:" + fVar.f332498j);
                int i17 = fVar.f332502n;
                oVar.getClass();
                oVar.c("PlayEvent", i17, false);
            }
        }
    }

    @Override // fc2.d
    public void H0() {
        this.f212314q.mo50302x6b17ad39(null);
    }

    public final void I0(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, boolean z17) {
        this.f212314q.mo50303x856b99f0(1);
        c01.id.c();
        ((dw2.o) this.f212310m).d(z17);
        c01.id.c();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530 J0(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530 c14493xfdc11530 = (k3Var == null || (view = k3Var.f3639x46306858) == null) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530) view.findViewById(com.p314xaae8f345.mm.R.id.agy);
        if ((c14493xfdc11530 != null ? c14493xfdc11530.getTag(com.p314xaae8f345.mm.R.id.fun) : null) == null) {
            return null;
        }
        java.lang.Object tag = c14493xfdc11530.getTag(com.p314xaae8f345.mm.R.id.fun);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.Boolean");
        if (((java.lang.Boolean) tag).booleanValue()) {
            return c14493xfdc11530;
        }
        return null;
    }

    public final cw2.v9 L0(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        android.view.View view;
        android.view.View view2;
        cw2.v9[] v9VarArr = new cw2.v9[2];
        java.lang.Object obj = null;
        v9VarArr[0] = (k3Var == null || (view2 = k3Var.f3639x46306858) == null) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) view2.findViewById(com.p314xaae8f345.mm.R.id.e_k);
        v9VarArr[1] = (k3Var == null || (view = k3Var.f3639x46306858) == null) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15181x7c9d924c) view.findViewById(com.p314xaae8f345.mm.R.id.tbm);
        java.util.Iterator it = kz5.c0.i(v9VarArr).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((cw2.v9) next) != null) {
                obj = next;
                break;
            }
        }
        return (cw2.v9) obj;
    }

    public final boolean M0() {
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity = this.f212307g;
        if (!(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799)) {
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) a17).S6() == this.f212312o;
    }

    public final void N0(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 c15401xb8016041;
        android.view.View view;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoAutoPlayManager", "pauseAllMedia without:" + k3Var);
        cw2.v9 L0 = L0(k3Var);
        cw2.da videoView = L0 != null ? L0.getVideoView() : null;
        android.content.Context context = (k3Var == null || (view = k3Var.f3639x46306858) == null) ? null : view.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) this.f212309i).a7(new dw2.x(videoView, activity != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) activity.findViewById(com.p314xaae8f345.mm.R.id.tba) : null, this, k3Var));
        this.f212311n.R6(new dw2.w(J0(k3Var)));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f212308h;
        int childCount = c1163xf1deaba4.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m07 = c1163xf1deaba4.m0(c1163xf1deaba4.getChildAt(i17));
            if (m07 != null && (m07 instanceof in5.s0) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k3Var, m07)) {
                in5.s0 s0Var = (in5.s0) m07;
                java.lang.Object obj = s0Var.f374658i;
                if ((obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj).getFeedObject().getMediaType() == 2 && (c15401xb8016041 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041) s0Var.p(com.p314xaae8f345.mm.R.id.f566402fs3)) != null) {
                    c15401xb8016041.o();
                }
            }
        }
    }

    public final void O0(in5.s0 s0Var) {
        jz5.f0 f0Var;
        if (s0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530 J0 = J0(s0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) s0Var.p(com.p314xaae8f345.mm.R.id.ghd);
            if (c15178x4303ff90 != null ? c15178x4303ff90.isSeekMode : false) {
                return;
            }
            if (J0 != null) {
                J0.e();
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.VideoAutoPlayManager", "playMusicHolder musicContainer is null!");
            }
        }
    }

    @Override // dw2.c0
    public void X(boolean z17) {
        this.f212322y = z17;
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
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f212314q;
        n3Var.mo50303x856b99f0(1);
        n3Var.mo50303x856b99f0(2);
        this.f212321x = false;
    }

    @Override // td2.c
    /* renamed from: onResume */
    public void mo55616x57429eec(p012xc85e97e9.p093xedfae76a.y var1) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity = this.f212307g;
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) a17).S6() == this.f212312o) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f212314q;
                if (!n3Var.mo50285x8fc9be06(1)) {
                    n3Var.mo50305x3d8a09a2(1);
                }
            }
        }
        this.f212321x = true;
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
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity = this.f212307g;
        D0(activity, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        fc2.c Y6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).Y6(this.f212312o);
        if (Y6 != null) {
            Y6.a(this);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f212314q;
        if (n3Var.mo50285x8fc9be06(1)) {
            return;
        }
        n3Var.mo50307xb9e94560(1, 500L);
    }

    @Override // dw2.c0
    public void w0(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoAutoPlayManager", "[postCheck] source=".concat(source));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f212314q;
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
        java.util.HashSet hashSet = this.f212318u;
        sb6.append(hashSet.size());
        sb6.append(" unLockAfterCheck=");
        sb6.append(z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoAutoPlayManager", sb6.toString());
        if (z17) {
            hashSet.add(scene);
            this.f212319v = true;
        } else {
            hashSet.remove(scene);
            if (hashSet.size() <= 0) {
                this.f212319v = false;
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f212314q;
        n3Var.mo50303x856b99f0(1);
        if (this.f212319v || !z18) {
            return;
        }
        n3Var.mo50305x3d8a09a2(1);
    }
}
