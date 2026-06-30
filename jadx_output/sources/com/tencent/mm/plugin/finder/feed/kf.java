package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class kf {
    public xh2.d A;
    public yj2.f B;
    public yz5.a C;
    public com.tencent.mm.view.ratio.RatioLayout D;
    public com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView E;
    public int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f107186J;
    public r45.hc1 K;
    public boolean L;
    public java.lang.ref.WeakReference M;
    public boolean N;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.uf f107187a;

    /* renamed from: b, reason: collision with root package name */
    public final int f107188b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f107189c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f107190d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f107191e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f107192f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f107193g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.FeedData f107194h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f107195i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.vf f107196j;

    /* renamed from: k, reason: collision with root package name */
    public kd2.v f107197k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f107198l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.y20 f107199m;

    /* renamed from: n, reason: collision with root package name */
    public final lj2.t0 f107200n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f107201o;

    /* renamed from: p, reason: collision with root package name */
    public em2.i f107202p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.ag f107203q;

    /* renamed from: r, reason: collision with root package name */
    public int f107204r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.ArrayList f107205s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Point f107206t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Point f107207u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f107208v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f107209w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f107210x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f107211y;

    /* renamed from: z, reason: collision with root package name */
    public pm2.a f107212z;

    public kf(com.tencent.mm.plugin.finder.feed.uf decorator, int i17, yz5.l lVar, yz5.l lVar2) {
        kotlin.jvm.internal.o.g(decorator, "decorator");
        this.f107187a = decorator;
        this.f107188b = i17;
        this.f107189c = lVar;
        this.f107190d = lVar2;
        this.f107191e = "FinderLiveFeedCoverAdapter_" + hashCode();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i18 = 1; i18 < 10; i18++) {
            hashMap.put(java.lang.Integer.valueOf(i18), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.lzi, java.lang.Integer.valueOf(i18)));
        }
        this.f107192f = hashMap;
        this.f107193g = new java.util.concurrent.ConcurrentHashMap();
        this.f107195i = new java.util.LinkedList();
        this.f107196j = new com.tencent.mm.plugin.finder.feed.vf(this.f107188b);
        com.tencent.mm.plugin.finder.feed.df dfVar = new com.tencent.mm.plugin.finder.feed.df(this);
        this.f107199m = dfVar;
        this.f107200n = new com.tencent.mm.plugin.finder.feed.cf(this);
        this.f107201o = jz5.h.b(new com.tencent.mm.plugin.finder.feed.jf(this));
        this.f107203q = new com.tencent.mm.plugin.finder.feed.ag(dfVar, this.f107188b);
        this.f107205s = new java.util.ArrayList();
        this.f107206t = new android.graphics.Point(0, 0);
        this.f107207u = new android.graphics.Point(0, 0);
        this.f107208v = "";
        this.f107209w = "";
        this.f107210x = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f107211y = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f107212z = pm2.a.f356853f;
    }

    public final void a() {
        android.view.View view;
        boolean z17 = this.L;
        if (z17) {
            if (!this.N) {
                b();
                return;
            }
            if (z17) {
                java.lang.ref.WeakReference weakReference = this.M;
                com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniView finderLiveFeedMiniView = weakReference != null ? (com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniView) weakReference.get() : null;
                com.tencent.mars.xlog.Log.i(this.f107191e, "attachKTVOutPreviewToMinimizeContainer:" + finderLiveFeedMiniView);
                if (finderLiveFeedMiniView == null) {
                    return;
                }
                em2.i iVar = this.f107202p;
                if ((iVar != null ? iVar.h() : null) instanceof fi2.e0) {
                    em2.i iVar2 = this.f107202p;
                    fi2.e0 h17 = iVar2 != null ? iVar2.h() : null;
                    kotlin.jvm.internal.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.core.KTVFeedContentServiceCore");
                    mh2.u1 u1Var = h17.f262825j;
                    if (u1Var != null) {
                        view = u1Var.f326292b;
                        kotlin.jvm.internal.o.d(view);
                    } else {
                        view = null;
                    }
                    if (kotlin.jvm.internal.o.b(view != null ? view.getParent() : null, finderLiveFeedMiniView.getF111317d())) {
                        return;
                    }
                    android.view.ViewParent parent = view != null ? view.getParent() : null;
                    android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                    }
                    finderLiveFeedMiniView.getF111317d().addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
                }
            }
        }
    }

    public final void b() {
        android.view.View view;
        java.lang.ref.WeakReference weakReference = this.M;
        com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniView finderLiveFeedMiniView = weakReference != null ? (com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniView) weakReference.get() : null;
        java.lang.String str = this.f107191e;
        com.tencent.mars.xlog.Log.i(str, "deAttachKTVOutPreviewFromMinimizeContainer:" + finderLiveFeedMiniView);
        if (finderLiveFeedMiniView == null) {
            return;
        }
        em2.i iVar = this.f107202p;
        if ((iVar != null ? iVar.h() : null) instanceof fi2.e0) {
            em2.i iVar2 = this.f107202p;
            fi2.e0 h17 = iVar2 != null ? iVar2.h() : null;
            kotlin.jvm.internal.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.core.KTVFeedContentServiceCore");
            mh2.u1 u1Var = h17.f262825j;
            if (u1Var != null) {
                view = u1Var.f326292b;
                kotlin.jvm.internal.o.d(view);
            } else {
                view = null;
            }
            if (kotlin.jvm.internal.o.b(view != null ? view.getParent() : null, finderLiveFeedMiniView.getF111317d())) {
                finderLiveFeedMiniView.getF111317d().removeView(view);
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ktvOutPreviewView.parent:");
            sb6.append(view != null ? view.getParent() : null);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
        }
    }

    public final lj2.y0 c() {
        return (lj2.y0) ((jz5.n) this.f107201o).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(r45.fa4 r36) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.kf.d(r45.fa4):void");
    }

    public final void e(boolean z17, java.lang.String userId) {
        kotlin.jvm.internal.o.g(userId, "userId");
        if (this.F == 0) {
            int i17 = 0;
            if (this.L) {
                kd2.v vVar = this.f107197k;
                if (vVar != null) {
                    if (vVar.f282613a != null) {
                        int childCount = vVar.d().getChildCount();
                        while (i17 < childCount) {
                            if (vVar.d().getChildAt(i17) instanceof yj2.e) {
                                android.view.View childAt = vVar.d().getChildAt(i17);
                                kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.widget.preview.FinderLiveMicCommonPreviewWidget");
                                yj2.e eVar = (yj2.e) childAt;
                                if (kotlin.jvm.internal.o.b(eVar.getBindSdkUserId(), userId)) {
                                    eVar.f(z17);
                                }
                            }
                            i17++;
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedCoverRatioAdapter", "onAnchorAudioChange layout isInitialized = false");
                    }
                }
            } else {
                com.tencent.mm.plugin.finder.feed.vf vfVar = this.f107196j;
                vfVar.getClass();
                if (vfVar.f282613a != null) {
                    int childCount2 = vfVar.d().getChildCount();
                    while (i17 < childCount2) {
                        if (vfVar.d().getChildAt(i17) instanceof yj2.e) {
                            android.view.View childAt2 = vfVar.d().getChildAt(i17);
                            kotlin.jvm.internal.o.e(childAt2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.widget.preview.FinderLiveMicCommonPreviewWidget");
                            yj2.e eVar2 = (yj2.e) childAt2;
                            if (kotlin.jvm.internal.o.b(eVar2.getBindSdkUserId(), userId)) {
                                eVar2.f(z17);
                            }
                        }
                        i17++;
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedCoverRatioAdapter", "onAnchorAudioChange layout isInitialized = false");
                }
            }
            this.f107193g.put(userId, java.lang.Boolean.valueOf(z17));
        }
    }

    public final void f(xh2.e micTopicData) {
        fi2.k g17;
        kotlin.jvm.internal.o.g(micTopicData, "micTopicData");
        if (!this.L) {
            fi2.l c17 = c().c();
            if (c17 != null) {
                c17.c(micTopicData);
                return;
            }
            return;
        }
        em2.i iVar = this.f107202p;
        if (iVar == null || (g17 = iVar.g()) == null) {
            return;
        }
        g17.c(micTopicData);
    }

    public final void g(android.view.View view, java.util.HashMap hashMap, int i17, int i18, int i19, int i27) {
        if (i27 == 4) {
            view.setBackground(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.cnf));
            return;
        }
        if (i27 == 5 || i27 == 6) {
            view.setBackground(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.cpw));
            return;
        }
        boolean z17 = false;
        if ((i17 == 0 && (i19 == 2 || i19 == 1 || i19 == 2 || i19 == 4)) || i17 == 2) {
            ya2.g gVar = ya2.h.f460484a;
            km2.q qVar = (km2.q) hashMap.get(this.f107208v);
            ya2.b2 b17 = gVar.b(qVar != null ? qVar.f309172c : null);
            if (b17 != null) {
                zl2.r4.f473950a.k(view, b17.y0());
                return;
            }
            return;
        }
        zy2.bc bcVar = this.f107187a.A;
        if (bcVar != null && bcVar.a()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        view.setBackground(null);
    }
}
