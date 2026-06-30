package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler */
/* loaded from: classes2.dex */
public final class C15482x9b531b34 extends pf5.o0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0 {

    /* renamed from: g, reason: collision with root package name */
    public int f215207g;

    /* renamed from: q, reason: collision with root package name */
    public int f215214q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1691x19f68a54.p1692xcfcbe9ef.C15517x99f0671 f215215r;

    /* renamed from: u, reason: collision with root package name */
    public cw2.da f215218u;

    /* renamed from: v, reason: collision with root package name */
    public android.os.HandlerThread f215219v;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15484x81b1e2e3 f215222y;

    /* renamed from: e, reason: collision with root package name */
    public boolean f215205e = true;

    /* renamed from: f, reason: collision with root package name */
    public int f215206f = 1;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f215208h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashSet f215209i = new java.util.HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f215210m = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f215211n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f215212o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashSet f215213p = new java.util.HashSet();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f215216s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final fz2.b f215217t = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.y90(this);

    /* renamed from: w, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f215220w = new java.util.concurrent.ConcurrentSkipListSet();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.HashMap f215221x = new java.util.HashMap();

    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$onlineVideoEventListener$1] */
    public C15482x9b531b34() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f215222y = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2>(a0Var) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$onlineVideoEventListener$1
            {
                this.f39173x3fe91575 = -2133747774;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2 c5814x771f4db2) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2 event = c5814x771f4db2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.hn hnVar = event.f136121g;
                if (hnVar.f88378b != -21112) {
                    return false;
                }
                java.lang.String str = hnVar.f88379c;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.VideoRecycler", "[videoSourceChange] mediaId=" + str);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34.this;
                c15482x9b531b34.O6(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.aa0(str, c15482x9b531b34));
                return false;
            }
        };
    }

    public static final void N6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34, cw2.da daVar) {
        int V6;
        int i17;
        boolean z17;
        c15482x9b531b34.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean W6 = c15482x9b531b34.W6(daVar);
        daVar.m122873xca0297d8(com.p314xaae8f345.mm.R.id.g4z, 0);
        c15482x9b531b34.O6(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fa0(daVar));
        java.util.HashSet hashSet = c15482x9b531b34.f215209i;
        hashSet.remove(daVar);
        if (cq.k.f302754n.a()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            c15482x9b531b34.O6(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.w90(null, c15482x9b531b34, W6, f0Var));
            V6 = f0Var.f391649d;
            i17 = W6 ? 2 : c15482x9b531b34.f215206f;
        } else {
            V6 = c15482x9b531b34.V6(null);
            i17 = c15482x9b531b34.f215206f;
        }
        boolean z18 = V6 < i17 && c15482x9b531b34.f215213p.contains(java.lang.String.valueOf(daVar.mo56698x4ee17f0a().getContext().hashCode()));
        if (z18) {
            c15482x9b531b34.f215210m.add(new java.lang.ref.WeakReference(daVar));
            hashSet.add(daVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.l90 l90Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.l90) c15482x9b531b34.f215212o.remove(java.lang.Integer.valueOf(daVar.hashCode()));
            if (l90Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s90 s90Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s90) l90Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b342 = s90Var.f217410a;
                java.util.HashMap hashMap = c15482x9b531b342.f215211n;
                int i18 = s90Var.f217411b;
                java.lang.Object obj = hashMap.get(java.lang.Integer.valueOf(i18));
                java.lang.String str = s90Var.f217412c;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "getOrCreate hit cache for wait recycled for mediaId:" + str + ' ' + i18);
                    s90Var.f217413d.mo146xb9724478(daVar);
                    z17 = true;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "getOrCreate wait for callback, but it(" + str + ") has been replace(" + ((java.lang.String) c15482x9b531b342.f215211n.get(java.lang.Integer.valueOf(i18))) + "). key=" + i18);
                    z17 = false;
                }
                if (z17) {
                    hashSet.remove(daVar);
                }
            }
        } else {
            daVar.m122873xca0297d8(com.p314xaae8f345.mm.R.id.twb, java.lang.Boolean.FALSE);
            daVar.b();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[recycledVideoView] ret=");
        sb6.append(z18);
        sb6.append(" cost=");
        sb6.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
        sb6.append("ms view=");
        sb6.append(daVar.hashCode());
        sb6.append(" isLP=");
        sb6.append(W6);
        sb6.append(" bucketCount=");
        sb6.append(V6);
        sb6.append(" bucketMax=");
        sb6.append(i17);
        sb6.append(" videoCount=");
        sb6.append(c15482x9b531b34.V6(null));
        sb6.append(", recycledCount=");
        sb6.append(hashSet.size());
        sb6.append(", ");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(hashSet, 10));
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((cw2.da) it.next()).hashCode()));
        }
        sb6.append(arrayList);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", sb6.toString());
    }

    public static /* synthetic */ cw2.da R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34, android.content.Context context, int i17, boolean z17, boolean z18, boolean z19, int i18, java.lang.Object obj) {
        return c15482x9b531b34.Q6(context, (i18 & 2) != 0 ? 0 : i17, (i18 & 4) != 0 ? false : z17, (i18 & 8) != 0 ? false : z18, (i18 & 16) != 0 ? false : z19);
    }

    public final void O6(yz5.l isRemoveFun) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isRemoveFun, "isRemoveFun");
        java.util.Iterator it = this.f215210m.iterator();
        while (it.hasNext()) {
            cw2.da daVar = (cw2.da) ((java.lang.ref.WeakReference) it.next()).get();
            if (daVar != null) {
                if (((java.lang.Boolean) isRemoveFun.mo146xb9724478(daVar)).booleanValue()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "acrossCreatedVideoViews 1 remove it:" + daVar + " mediaid:" + daVar.mo56696x9040359a());
                    it.remove();
                }
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "acrossCreatedVideoViews 2 remove");
                it.remove();
            }
        }
    }

    public void P6(cw2.da videoView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoView, "videoView");
        this.f215210m.add(new java.lang.ref.WeakReference(videoView));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "[addVideoView] videoCount=" + V6(null) + " videoView=" + videoView.getClass().getSimpleName());
    }

    public final cw2.da Q6(android.content.Context context, int i17, boolean z17, boolean z18, boolean z19) {
        cw2.da daVar;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (i17 == 1) {
            ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            cw2.da c15189x4abd2ecf = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15189x4abd2ecf(context);
            c15189x4abd2ecf.mo56700x2cb6856d(context.hashCode());
            daVar = c15189x4abd2ecf;
        } else if (i17 == 2) {
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            ((b92.d1) zbVar).getClass();
            cw2.da c15201xe049f190 = z19 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190(context2) : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b(context2);
            c15201xe049f190.mo56700x2cb6856d(context.hashCode());
            cw2.y9 mo56693x1399c8ca = c15201xe049f190.mo56693x1399c8ca();
            daVar = c15201xe049f190;
            if (mo56693x1399c8ca != null) {
                mo56693x1399c8ca.mo61343x71948e2a(context.getClass().getSimpleName());
                daVar = c15201xe049f190;
            }
        } else if (!((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Ni() || z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15174xba50c26a c15174xba50c26a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15174xba50c26a(context);
            c15174xba50c26a.mo56700x2cb6856d(context.hashCode());
            c15174xba50c26a.m61194xc96655c4(true);
            daVar = c15174xba50c26a;
        } else if (z18) {
            android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            cw2.da c15176x3a5a59de = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15176x3a5a59de(context3);
            c15176x3a5a59de.mo56700x2cb6856d(context.hashCode());
            daVar = c15176x3a5a59de;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209304ja).mo141623x754a37bb()).r()).intValue() > 0) {
                android.content.Context context4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
                cw2.da oVar = new cw2.o(context4);
                oVar.mo56700x2cb6856d(context.hashCode());
                daVar = oVar;
            } else {
                android.content.Context context5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context5, "getContext(...)");
                cw2.da c15188xd8bd4bd = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd(context5);
                c15188xd8bd4bd.mo56700x2cb6856d(context.hashCode());
                daVar = c15188xd8bd4bd;
            }
        }
        this.f215210m.add(new java.lang.ref.WeakReference(daVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "[createVideoView] activity=" + context.getClass().getSimpleName() + " videoCount=" + V6(null) + " videoView=" + daVar.getClass().getSimpleName() + " cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
        return daVar;
    }

    public cw2.da S6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        O6(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p90(context, h0Var));
        return (cw2.da) h0Var.f391656d;
    }

    public final java.lang.String T6(java.lang.String str, cw2.da daVar) {
        if (!(daVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd)) {
            return "mediaId:" + str;
        }
        return "ftpp:" + ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) daVar).m61380xe56ce956() + " mediaId:" + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U6(android.view.ViewGroup r23, int r24, mn2.j4 r25, boolean r26, yz5.l r27) {
        /*
            Method dump skipped, instructions count: 1414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34.U6(android.view.ViewGroup, int, mn2.j4, boolean, yz5.l):void");
    }

    public final int V6(java.lang.Class cls) {
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        O6(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v90(cls, f0Var));
        return f0Var.f391649d;
    }

    public final boolean W6(cw2.da daVar) {
        java.lang.Object m122870xb5887064 = daVar.m122870xb5887064(com.p314xaae8f345.mm.R.id.twb);
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m122870xb5887064 instanceof java.lang.Boolean ? (java.lang.Boolean) m122870xb5887064 : null, java.lang.Boolean.TRUE);
    }

    public void X6(cw2.da daVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "markRecentFocusView videoView:" + daVar);
        this.f215218u = daVar;
    }

    public final void Y6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "onFinish");
        this.f215218u = null;
        mo48814x2efc64();
        this.f215208h.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.x90(this));
        this.f215213p.clear();
        this.f215212o.clear();
        this.f215216s.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1691x19f68a54.p1692xcfcbe9ef.C15517x99f0671 c15517x99f0671 = this.f215215r;
        if (c15517x99f0671 != null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            c15517x99f0671.c(context);
        }
    }

    public final void Z6(java.lang.String mediaId) {
        java.lang.String mo56696x9040359a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.H4).mo141623x754a37bb()).r()).intValue() != 1) {
            return;
        }
        java.util.Iterator it = this.f215210m.iterator();
        while (it.hasNext()) {
            cw2.da daVar = (cw2.da) ((java.lang.ref.WeakReference) it.next()).get();
            if (daVar != null && (mo56696x9040359a = daVar.mo56696x9040359a()) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "onPreloadComplete " + mo56696x9040359a + ' ' + mediaId);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo56696x9040359a, mediaId)) {
                    daVar.F();
                }
            }
        }
    }

    public void a7(yz5.l filter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filter, "filter");
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ca0(this, filter));
    }

    public void b7(android.view.ViewGroup parent, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f215211n.put(java.lang.Integer.valueOf(parent.hashCode()), null);
        android.view.KeyEvent.Callback findViewWithTag = parent.findViewWithTag(java.lang.Integer.valueOf(parent.hashCode()));
        if (findViewWithTag instanceof cw2.da) {
            cw2.da daVar = (cw2.da) findViewWithTag;
            daVar.mo56696x9040359a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "[pauseOrRecycle] pauseWithCancel mediaId:" + daVar.mo56696x9040359a() + " videoView(" + daVar.hashCode() + ") isForceRemove=" + z17 + " isTryKeep=" + z18);
            daVar.mo56716x4121a19(false);
            if (z18 || !z17) {
                daVar.w();
            } else {
                d7(daVar, "pauseAndRecycle");
            }
        }
    }

    public void c7(android.content.Context context) {
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ea0(this, context));
    }

    public final void d7(cw2.da daVar, java.lang.String str) {
        java.util.HashMap hashMap = this.f215221x;
        if (hashMap.containsKey(java.lang.Integer.valueOf(daVar.hashCode()))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.VideoRecycler", "[releaseVideoView] videoView=" + daVar.hashCode() + " is releasing, source=" + str);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        hashMap.put(java.lang.Integer.valueOf(daVar.hashCode()), daVar);
        e7(daVar.mo56698x4ee17f0a());
        daVar.mo58788x65825f6();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[releaseVideoView] async release videoView(");
        sb6.append(daVar.hashCode());
        sb6.append(") parent=");
        android.view.ViewParent mo56691xdfac0a65 = daVar.mo56691xdfac0a65();
        sb6.append(mo56691xdfac0a65 != null ? mo56691xdfac0a65.hashCode() : 0);
        sb6.append(" source=");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", sb6.toString());
        pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ja0(daVar, this, currentTimeMillis, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e7(android.view.View view) {
        android.view.ViewParent parent;
        if (view == 0 || (parent = view.getParent()) == null) {
            return false;
        }
        this.f215211n.put(java.lang.Integer.valueOf(parent.hashCode()), null);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        viewGroup.removeView(view);
        cw2.da daVar = view instanceof cw2.da ? (cw2.da) view : null;
        if (daVar != null) {
            daVar.mo58788x65825f6();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "[removeViewFromParent] parent=" + parent.hashCode() + ", videoView=" + view.hashCode() + ", parentTag=" + viewGroup.getTag());
        return true;
    }

    public void f7(android.content.Context context) {
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.na0(this, context));
    }

    @Override // pf5.e, p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "[onCleared] videoCount=" + V6(null));
        Y6();
    }
}
