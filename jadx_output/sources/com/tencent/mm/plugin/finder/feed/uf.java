package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class uf implements zy2.a8 {
    public zy2.bc A;
    public yz5.l B;
    public final java.util.HashMap C;
    public long D;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f109155a;

    /* renamed from: b, reason: collision with root package name */
    public final int f109156b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.view.ratio.RatioLayout f109157c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView f109158d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f109159e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f109160f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.FeedData f109161g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f109162h;

    /* renamed from: i, reason: collision with root package name */
    public zy2.a f109163i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f109164j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.List f109165k;

    /* renamed from: l, reason: collision with root package name */
    public xh2.e f109166l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f109167m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.kf f109168n;

    /* renamed from: o, reason: collision with root package name */
    public cl0.g f109169o;

    /* renamed from: p, reason: collision with root package name */
    public cl0.g f109170p;

    /* renamed from: q, reason: collision with root package name */
    public cl0.g f109171q;

    /* renamed from: r, reason: collision with root package name */
    public org.json.JSONArray f109172r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f109173s;

    /* renamed from: t, reason: collision with root package name */
    public r45.xn1 f109174t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashMap f109175u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f109176v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.FinderItem f109177w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f109178x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f109179y;

    /* renamed from: z, reason: collision with root package name */
    public kotlinx.coroutines.y0 f109180z;

    public uf(android.view.View parentView, int i17, com.tencent.mm.view.ratio.RatioLayout ratioLayout, com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView, yz5.l lVar, yz5.l lVar2, boolean z17, yz5.p pVar, int i18, kotlin.jvm.internal.i iVar) {
        yz5.l lVar3 = (i18 & 16) != 0 ? null : lVar;
        yz5.l lVar4 = (i18 & 32) != 0 ? null : lVar2;
        boolean z18 = (i18 & 64) != 0 ? true : z17;
        yz5.p pVar2 = (i18 & 128) == 0 ? pVar : null;
        kotlin.jvm.internal.o.g(parentView, "parentView");
        this.f109155a = parentView;
        this.f109156b = i17;
        this.f109157c = ratioLayout;
        this.f109158d = liveVoiceRoomLayoutView;
        this.f109159e = lVar3;
        this.f109160f = pVar2;
        this.f109163i = new zy2.a(null, null, false, null, null, 31, null);
        this.f109164j = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f109165k = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f109166l = new xh2.e("", "", -1L);
        com.tencent.mm.plugin.finder.feed.kf kfVar = new com.tencent.mm.plugin.finder.feed.kf(this, i17, lVar3, lVar4);
        this.f109168n = kfVar;
        this.f109175u = new java.util.HashMap();
        this.f109176v = "";
        this.f109178x = true;
        this.f109180z = kotlinx.coroutines.z0.b();
        jz5.g b17 = jz5.h.b(new com.tencent.mm.plugin.finder.feed.tf(this));
        boolean z19 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f3490x).getValue()).r()).intValue() == 1;
        this.f109178x = z19;
        kfVar.D = ratioLayout;
        kfVar.f107186J = parentView;
        kfVar.E = liveVoiceRoomLayoutView;
        kd2.v vVar = kfVar.f107197k;
        if (!kfVar.L || vVar == null) {
            if (ratioLayout != null) {
                ratioLayout.setAdapter(kfVar.f107196j);
            }
        } else if (ratioLayout != null) {
            ratioLayout.setAdapter(vVar);
        }
        if (ratioLayout != null) {
            ratioLayout.setLayoutManager(new com.tencent.mm.view.ratio.a());
        }
        if (kfVar.L) {
            em2.i iVar2 = kfVar.f107202p;
            if (iVar2 != null) {
                iVar2.b(liveVoiceRoomLayoutView);
            }
        } else {
            kfVar.c().b(liveVoiceRoomLayoutView);
        }
        s();
        com.tencent.mars.xlog.Log.i(j(), "feedDecorate enable:" + z19);
        if (z18) {
            parentView.addOnAttachStateChangeListener((com.tencent.mm.plugin.finder.feed.sf) ((jz5.n) b17).getValue());
        }
        this.C = new java.util.HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1 A[Catch: Exception -> 0x0103, TryCatch #0 {Exception -> 0x0103, blocks: (B:12:0x002c, B:15:0x003c, B:18:0x0048, B:20:0x0052, B:21:0x0064, B:30:0x0086, B:32:0x0095, B:37:0x00a1, B:38:0x00ac, B:40:0x00b4, B:44:0x00f3, B:46:0x00fd, B:47:0x0100, B:53:0x00bc, B:55:0x00c0, B:57:0x00ca, B:59:0x00d1, B:61:0x00de, B:62:0x00e4, B:64:0x00ef, B:69:0x00a7, B:71:0x008d, B:75:0x0058, B:78:0x005f), top: B:11:0x002c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd A[Catch: Exception -> 0x0103, TryCatch #0 {Exception -> 0x0103, blocks: (B:12:0x002c, B:15:0x003c, B:18:0x0048, B:20:0x0052, B:21:0x0064, B:30:0x0086, B:32:0x0095, B:37:0x00a1, B:38:0x00ac, B:40:0x00b4, B:44:0x00f3, B:46:0x00fd, B:47:0x0100, B:53:0x00bc, B:55:0x00c0, B:57:0x00ca, B:59:0x00d1, B:61:0x00de, B:62:0x00e4, B:64:0x00ef, B:69:0x00a7, B:71:0x008d, B:75:0x0058, B:78:0x005f), top: B:11:0x002c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1 A[Catch: Exception -> 0x0103, TryCatch #0 {Exception -> 0x0103, blocks: (B:12:0x002c, B:15:0x003c, B:18:0x0048, B:20:0x0052, B:21:0x0064, B:30:0x0086, B:32:0x0095, B:37:0x00a1, B:38:0x00ac, B:40:0x00b4, B:44:0x00f3, B:46:0x00fd, B:47:0x0100, B:53:0x00bc, B:55:0x00c0, B:57:0x00ca, B:59:0x00d1, B:61:0x00de, B:62:0x00e4, B:64:0x00ef, B:69:0x00a7, B:71:0x008d, B:75:0x0058, B:78:0x005f), top: B:11:0x002c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a7 A[Catch: Exception -> 0x0103, TryCatch #0 {Exception -> 0x0103, blocks: (B:12:0x002c, B:15:0x003c, B:18:0x0048, B:20:0x0052, B:21:0x0064, B:30:0x0086, B:32:0x0095, B:37:0x00a1, B:38:0x00ac, B:40:0x00b4, B:44:0x00f3, B:46:0x00fd, B:47:0x0100, B:53:0x00bc, B:55:0x00c0, B:57:0x00ca, B:59:0x00d1, B:61:0x00de, B:62:0x00e4, B:64:0x00ef, B:69:0x00a7, B:71:0x008d, B:75:0x0058, B:78:0x005f), top: B:11:0x002c, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.tencent.mm.plugin.finder.feed.uf r9, int r10, cl0.g r11, java.lang.ref.WeakReference r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.uf.a(com.tencent.mm.plugin.finder.feed.uf, int, cl0.g, java.lang.ref.WeakReference):void");
    }

    public final void b(android.graphics.Point windowSize) {
        kotlin.jvm.internal.o.g(windowSize, "windowSize");
        com.tencent.mm.plugin.finder.feed.kf kfVar = this.f109168n;
        kfVar.getClass();
        if (!kfVar.L) {
            kfVar.c().a(windowSize, kfVar.F);
            return;
        }
        em2.i iVar = kfVar.f107202p;
        if (iVar != null) {
            iVar.a(windowSize, kfVar.F);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        if (r1 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r3 = this;
            kotlinx.coroutines.y0 r0 = r3.f109180z
            if (r0 == 0) goto L11
            r1 = 0
            if (r0 == 0) goto Lf
            boolean r0 = kotlinx.coroutines.z0.h(r0)
            r2 = 1
            if (r0 != r2) goto Lf
            r1 = r2
        Lf:
            if (r1 != 0) goto L17
        L11:
            kotlinx.coroutines.y0 r0 = kotlinx.coroutines.z0.b()
            r3.f109180z = r0
        L17:
            com.tencent.mm.plugin.finder.feed.kf r0 = r3.f109168n
            boolean r1 = r0.L
            if (r1 == 0) goto L25
            em2.i r0 = r0.f107202p
            if (r0 == 0) goto L2c
            r0.onAttach()
            goto L2c
        L25:
            lj2.y0 r0 = r0.c()
            r0.onAttach()
        L2c:
            java.lang.String r0 = r3.j()
            java.lang.String r1 = "feedCoverScope onViewAttachedToWindow"
            com.tencent.mars.xlog.Log.i(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.uf.c():void");
    }

    public void d(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(j(), "checkLinkMicMode videoW: " + i18);
        r();
    }

    public final void e() {
        kotlinx.coroutines.y0 y0Var = this.f109180z;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        this.f109180z = null;
        com.tencent.mm.plugin.finder.feed.kf kfVar = this.f109168n;
        if (!kfVar.L) {
            kfVar.c().getClass();
        }
        com.tencent.mars.xlog.Log.i(j(), "feedCoverScope onViewDetachedFromWindow");
    }

    public final com.tencent.mm.ui.MMActivity f(android.view.View view) {
        if (view == null) {
            return null;
        }
        if (!(view.getContext() instanceof com.tencent.mm.ui.MMActivity)) {
            android.view.ViewParent parent = view.getParent();
            return f(parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null);
        }
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        return (com.tencent.mm.ui.MMActivity) context;
    }

    public final java.lang.String g() {
        java.lang.String str;
        ya2.b2 contact;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        com.tencent.mm.protocal.protobuf.FinderContact contact2;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f109177w;
        java.lang.String str2 = "";
        if (finderItem == null || (feedObject = finderItem.getFeedObject()) == null || (contact2 = feedObject.getContact()) == null || (str = contact2.getHeadUrl()) == null) {
            str = "";
        }
        if (!(str.length() == 0)) {
            return str;
        }
        com.tencent.mm.plugin.finder.storage.FeedData feedData = this.f109161g;
        if (feedData != null && (contact = feedData.getContact()) != null) {
            str2 = contact.getAvatarUrl();
        }
        return str2;
    }

    public java.util.List h() {
        java.lang.String j17 = j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getAnchorPkUserList size: ");
        java.util.List pkAnchorData = this.f109164j;
        sb6.append(pkAnchorData.size());
        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
        kotlin.jvm.internal.o.f(pkAnchorData, "pkAnchorData");
        return pkAnchorData;
    }

    public me2.a i() {
        me2.a aVar = new me2.a();
        aVar.f325916a = this.f109169o;
        aVar.f325917b = this.f109170p;
        aVar.f325918c = this.f109171q;
        java.util.HashMap hashMap = this.f109175u;
        kotlin.jvm.internal.o.g(hashMap, "<set-?>");
        aVar.f325919d = hashMap;
        return aVar;
    }

    public final java.lang.String j() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FeedDecorator_");
        sb6.append(hashCode());
        sb6.append('_');
        com.tencent.mm.plugin.finder.storage.FeedData feedData = this.f109161g;
        sb6.append(feedData != null ? feedData.getNickname() : null);
        return sb6.toString();
    }

    public final void k(java.lang.String str, java.lang.ref.WeakReference weakReference) {
        java.lang.Object obj;
        yz5.l lVar;
        this.f109173s = str;
        if (str != null) {
            cl0.g gVar = new cl0.g(str);
            java.lang.String optString = gVar.optString("userId");
            if (optString == null) {
                optString = "";
            }
            int optInt = gVar.optInt("userStatus");
            this.D = gVar.optLong("st");
            boolean z17 = true;
            if (weakReference != null && (lVar = (yz5.l) weakReference.get()) != null) {
                r45.s7 s7Var = new r45.s7();
                s7Var.set(0, java.lang.Integer.valueOf(optInt));
                s7Var.set(1, java.lang.Integer.valueOf((int) java.lang.Math.abs(c01.id.a() - this.D)));
                lVar.invoke(s7Var);
            }
            boolean z18 = pm0.v.z(optInt, 2);
            if (pm0.v.z(optInt, 4)) {
                z18 = false;
            }
            km2.q qVar = (km2.q) this.f109175u.get(optString);
            if (qVar != null) {
                qVar.f309185p = z18;
            }
            java.lang.String str2 = this.f109163i.f477334a;
            if (str2 != null && str2.length() != 0) {
                z17 = false;
            }
            if (z17) {
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.D0(this.f109163i.f477334a, optString)) {
                zy2.a aVar = this.f109163i;
                if (aVar.f477336c != z18) {
                    aVar.f477336c = z18;
                    m(z18, aVar.f477334a);
                    return;
                }
                return;
            }
            java.util.List pkAnchorData = this.f109164j;
            kotlin.jvm.internal.o.f(pkAnchorData, "pkAnchorData");
            synchronized (pkAnchorData) {
                java.util.Iterator it = pkAnchorData.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (kotlin.jvm.internal.o.b(((zy2.a) obj).f477334a, optString)) {
                            break;
                        }
                    }
                }
            }
            zy2.a aVar2 = (zy2.a) obj;
            if (aVar2 == null || aVar2.f477336c == z18) {
                return;
            }
            aVar2.f477336c = z18;
            m(z18, optString);
        }
    }

    public void l(byte[] bArr, int i17, java.lang.ref.WeakReference weakReference) {
        if (this.f109178x) {
            java.lang.String str = this.f109163i.f477334a;
            if (str == null || str.length() == 0) {
                return;
            }
            java.lang.Integer[] numArr = co0.t.f43736a;
            if (kz5.z.G(co0.t.f43736a, java.lang.Integer.valueOf(i17))) {
                ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.finder.feed.of(bArr, this, weakReference), "Sei_Message_Handler");
            } else if (zl2.q4.f473933a.E()) {
                j();
            }
        }
    }

    public final void m(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(j(), "notifyAudioModeChange: isAudioMode" + z17 + " userId: " + str);
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.pf(this, z17, str));
    }

    public void n() {
        if (this.f109178x) {
            this.f109162h = false;
            this.f109163i = new zy2.a(null, null, false, null, null, 31, null);
            this.f109164j.clear();
            this.f109165k.clear();
            this.f109175u.clear();
        }
    }

    public void o() {
        if (this.f109178x) {
            this.f109162h = false;
            this.f109172r = null;
            this.f109169o = null;
            this.f109170p = null;
            this.f109171q = null;
            com.tencent.mars.xlog.Log.i(j(), "resetSeiData");
            com.tencent.mm.plugin.finder.feed.kf kfVar = this.f109168n;
            com.tencent.mars.xlog.Log.i(kfVar.f107191e, "reset");
            android.view.View view = kfVar.f107186J;
            if (view != null) {
                view.setBackground(null);
            }
            kfVar.f107204r = 0;
            kfVar.f107205s.clear();
            kfVar.G = 0;
            kfVar.I = 0;
            kfVar.f107208v = "";
            kfVar.f107209w = "";
            kfVar.f107195i.clear();
            kfVar.A = null;
            kfVar.B = null;
            kfVar.C = null;
            com.tencent.mm.plugin.finder.feed.ag agVar = kfVar.f107203q;
            agVar.f106285c = null;
            ((kotlinx.coroutines.flow.h3) agVar.f106287e).k(null);
            com.tencent.mm.plugin.finder.feed.vf vfVar = kfVar.f107196j;
            vfVar.f110900c.clear();
            vfVar.f();
            kd2.v vVar = kfVar.f107197k;
            if (vVar != null) {
                vVar.f306846b.clear();
                vVar.f();
            }
            kfVar.c().reset();
            em2.i iVar = kfVar.f107202p;
            if (iVar != null) {
                iVar.reset();
            }
            kfVar.M = null;
            kfVar.N = false;
            com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView = this.f109158d;
            if (liveVoiceRoomLayoutView != null) {
                liveVoiceRoomLayoutView.setVisibility(8);
            }
            if (liveVoiceRoomLayoutView != null) {
                liveVoiceRoomLayoutView.setBackground(null);
            }
            this.f109163i = new zy2.a(null, null, false, null, null, 31, null);
            this.f109164j.clear();
            this.f109165k.clear();
            this.f109175u.clear();
            com.tencent.mm.view.ratio.RatioLayout ratioLayout = this.f109157c;
            if (ratioLayout != null) {
                ratioLayout.removeAllViews();
            }
            this.C.clear();
        }
    }

    public void p(com.tencent.mm.plugin.finder.storage.FeedData feedData, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        java.lang.String userName;
        r45.nw1 liveInfo;
        r45.ma4 ma4Var;
        if (this.f109178x) {
            this.f109161g = feedData;
            this.f109177w = finderItem;
            zy2.a aVar = this.f109163i;
            java.lang.String str = (feedData == null || (liveInfo = feedData.getLiveInfo()) == null || (ma4Var = (r45.ma4) liveInfo.getCustom(23)) == null) ? null : ma4Var.f380301n;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            aVar.getClass();
            aVar.f477334a = str;
            zy2.a aVar2 = this.f109163i;
            if (feedData != null && (userName = feedData.getUserName()) != null) {
                str2 = userName;
            }
            aVar2.getClass();
            aVar2.f477335b = str2;
            this.f109168n.f107194h = feedData;
            com.tencent.mm.plugin.finder.storage.FeedData feedData2 = this.f109161g;
            if (feedData2 != null) {
                boolean z17 = pm0.v.z(feedData2.getAnchorStatus(), 256);
                com.tencent.mars.xlog.Log.i(j(), "checkViewAlpha audioMode: " + z17);
                yz5.l lVar = this.f109159e;
                if (z17) {
                    if (lVar != null) {
                        lVar.invoke(java.lang.Boolean.FALSE);
                    }
                } else if (lVar != null) {
                    lVar.invoke(java.lang.Boolean.TRUE);
                }
            }
            r();
        }
    }

    public final void q(android.graphics.Point size) {
        kotlin.jvm.internal.o.g(size, "size");
        com.tencent.mm.plugin.finder.feed.kf kfVar = this.f109168n;
        kfVar.getClass();
        kfVar.f107206t = size;
        com.tencent.mars.xlog.Log.i(kfVar.f107191e, "setWindowSize: " + size);
        com.tencent.mars.xlog.Log.i(j(), "setWindowSize size:" + size);
    }

    public final void r() {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        if (this.f109162h) {
            com.tencent.mars.xlog.Log.i(j(), "isFetching, skip!");
            return;
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f109177w;
        if ((((finderItem == null || (feedObject = finderItem.getFeedObject()) == null) ? 0L : feedObject.getBlock_cgi_flag()) & 1) != 0) {
            com.tencent.mars.xlog.Log.i(j(), "block_cgi_flag");
            return;
        }
        this.f109162h = true;
        java.lang.String j17 = j();
        com.tencent.mm.plugin.finder.storage.FeedData feedData = this.f109161g;
        com.tencent.mars.xlog.Log.i(j17, "[NearbyEndLive] tryFetchMicUserInfo feedId: ".concat(pm0.v.u(feedData != null ? feedData.getFeedId() : 0L)));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r45.in2 in2Var = new r45.in2();
        com.tencent.mm.plugin.finder.storage.FeedData feedData2 = this.f109161g;
        in2Var.set(0, java.lang.Long.valueOf(feedData2 != null ? feedData2.getFeedId() : 0L));
        com.tencent.mm.plugin.finder.storage.FeedData feedData3 = this.f109161g;
        if (feedData3 == null || (str = feedData3.getNonceId()) == null) {
            str = "";
        }
        in2Var.set(1, str);
        java.util.List c17 = kz5.b0.c(in2Var);
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        java.util.List i27 = kz5.c0.i(3, 7);
        r45.vg0 vg0Var = null;
        int i28 = 0;
        java.lang.String str4 = null;
        r45.fr0 fr0Var = null;
        java.lang.Integer num = null;
        java.lang.String str5 = null;
        com.tencent.mm.view.ratio.RatioLayout ratioLayout = this.f109157c;
        com.tencent.mm.ui.MMActivity f17 = f(ratioLayout);
        km5.d T = pm0.v.T(new db2.u(c17, i17, i18, i19, str2, str3, i27, vg0Var, i28, str4, fr0Var, num, str5, f17 != null ? ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).wi(f17) : null, null, null, null, 122814, null).l(), new com.tencent.mm.plugin.finder.feed.qf(currentTimeMillis, this));
        com.tencent.mm.ui.MMActivity f18 = f(ratioLayout);
        if (f18 != null) {
            T.f(f18);
        }
    }

    public final void s() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.tencent.mm.view.ratio.RatioLayout ratioLayout = this.f109157c;
        java.lang.Object parent = ratioLayout != null ? ratioLayout.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(new com.tencent.mm.plugin.finder.feed.rf(viewGroup, this));
        }
        com.tencent.mars.xlog.Log.i(j(), "feedDecorate enable:" + this.f109178x);
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0559 A[Catch: JSONException -> 0x0568, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0568, blocks: (B:137:0x051c, B:140:0x0522, B:142:0x053e, B:148:0x054c, B:154:0x0559), top: B:136:0x051c }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x03f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(boolean r29) {
        /*
            Method dump skipped, instructions count: 1629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.uf.t(boolean):void");
    }
}
