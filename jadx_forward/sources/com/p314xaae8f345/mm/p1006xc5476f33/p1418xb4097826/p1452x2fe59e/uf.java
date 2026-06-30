package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class uf implements zy2.a8 {
    public zy2.bc A;
    public yz5.l B;
    public final java.util.HashMap C;
    public long D;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f190688a;

    /* renamed from: b, reason: collision with root package name */
    public final int f190689b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 f190690c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 f190691d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f190692e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f190693f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 f190694g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f190695h;

    /* renamed from: i, reason: collision with root package name */
    public zy2.a f190696i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f190697j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.List f190698k;

    /* renamed from: l, reason: collision with root package name */
    public xh2.e f190699l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f190700m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kf f190701n;

    /* renamed from: o, reason: collision with root package name */
    public cl0.g f190702o;

    /* renamed from: p, reason: collision with root package name */
    public cl0.g f190703p;

    /* renamed from: q, reason: collision with root package name */
    public cl0.g f190704q;

    /* renamed from: r, reason: collision with root package name */
    public org.json.JSONArray f190705r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f190706s;

    /* renamed from: t, reason: collision with root package name */
    public r45.xn1 f190707t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashMap f190708u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f190709v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f190710w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f190711x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f190712y;

    /* renamed from: z, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f190713z;

    public uf(android.view.View parentView, int i17, com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 c22840x82866af5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950, yz5.l lVar, yz5.l lVar2, boolean z17, yz5.p pVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        yz5.l lVar3 = (i18 & 16) != 0 ? null : lVar;
        yz5.l lVar4 = (i18 & 32) != 0 ? null : lVar2;
        boolean z18 = (i18 & 64) != 0 ? true : z17;
        yz5.p pVar2 = (i18 & 128) == 0 ? pVar : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        this.f190688a = parentView;
        this.f190689b = i17;
        this.f190690c = c22840x82866af5;
        this.f190691d = c14245x86828950;
        this.f190692e = lVar3;
        this.f190693f = pVar2;
        this.f190696i = new zy2.a(null, null, false, null, null, 31, null);
        this.f190697j = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f190698k = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f190699l = new xh2.e("", "", -1L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kf kfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kf(this, i17, lVar3, lVar4);
        this.f190701n = kfVar;
        this.f190708u = new java.util.HashMap();
        this.f190709v = "";
        this.f190711x = true;
        this.f190713z = p3325xe03a0797.p3326xc267989b.z0.b();
        jz5.g b17 = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tf(this));
        boolean z19 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f85023x).mo141623x754a37bb()).r()).intValue() == 1;
        this.f190711x = z19;
        kfVar.D = c22840x82866af5;
        kfVar.f188719J = parentView;
        kfVar.E = c14245x86828950;
        kd2.v vVar = kfVar.f188730k;
        if (!kfVar.L || vVar == null) {
            if (c22840x82866af5 != null) {
                c22840x82866af5.m82883x6cab2c8d(kfVar.f188729j);
            }
        } else if (c22840x82866af5 != null) {
            c22840x82866af5.m82883x6cab2c8d(vVar);
        }
        if (c22840x82866af5 != null) {
            c22840x82866af5.m82887x900dcbe1(new com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.a());
        }
        if (kfVar.L) {
            em2.i iVar2 = kfVar.f188735p;
            if (iVar2 != null) {
                iVar2.b(c14245x86828950);
            }
        } else {
            kfVar.c().b(c14245x86828950);
        }
        s();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "feedDecorate enable:" + z19);
        if (z18) {
            parentView.addOnAttachStateChangeListener((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.sf) ((jz5.n) b17).mo141623x754a37bb());
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
    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf r9, int r10, cl0.g r11, java.lang.ref.WeakReference r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf.a(com.tencent.mm.plugin.finder.feed.uf, int, cl0.g, java.lang.ref.WeakReference):void");
    }

    public final void b(android.graphics.Point windowSize) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowSize, "windowSize");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kf kfVar = this.f190701n;
        kfVar.getClass();
        if (!kfVar.L) {
            kfVar.c().a(windowSize, kfVar.F);
            return;
        }
        em2.i iVar = kfVar.f188735p;
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
            kotlinx.coroutines.y0 r0 = r3.f190713z
            if (r0 == 0) goto L11
            r1 = 0
            if (r0 == 0) goto Lf
            boolean r0 = p3325xe03a0797.p3326xc267989b.z0.h(r0)
            r2 = 1
            if (r0 != r2) goto Lf
            r1 = r2
        Lf:
            if (r1 != 0) goto L17
        L11:
            kotlinx.coroutines.y0 r0 = p3325xe03a0797.p3326xc267989b.z0.b()
            r3.f190713z = r0
        L17:
            com.tencent.mm.plugin.finder.feed.kf r0 = r3.f190701n
            boolean r1 = r0.L
            if (r1 == 0) goto L25
            em2.i r0 = r0.f188735p
            if (r0 == 0) goto L2c
            r0.mo56531x3b13c504()
            goto L2c
        L25:
            lj2.y0 r0 = r0.c()
            r0.mo56531x3b13c504()
        L2c:
            java.lang.String r0 = r3.j()
            java.lang.String r1 = "feedCoverScope onViewAttachedToWindow"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf.c():void");
    }

    public void d(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "checkLinkMicMode videoW: " + i18);
        r();
    }

    public final void e() {
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f190713z;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
        this.f190713z = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kf kfVar = this.f190701n;
        if (!kfVar.L) {
            kfVar.c().getClass();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "feedCoverScope onViewDetachedFromWindow");
    }

    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f(android.view.View view) {
        if (view == null) {
            return null;
        }
        if (!(view.getContext() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            android.view.ViewParent parent = view.getParent();
            return f(parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null);
        }
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        return (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
    }

    public final java.lang.String g() {
        java.lang.String str;
        ya2.b2 contact;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f190710w;
        java.lang.String str2 = "";
        if (c14994x9b99c079 == null || (feedObject = c14994x9b99c079.getFeedObject()) == null || (m76760x76845fea = feedObject.m76760x76845fea()) == null || (str = m76760x76845fea.m76175x6d346f39()) == null) {
            str = "";
        }
        if (!(str.length() == 0)) {
            return str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = this.f190694g;
        if (c14989xf862ae88 != null && (contact = c14989xf862ae88.getContact()) != null) {
            str2 = contact.m176700xe5e0d2a0();
        }
        return str2;
    }

    public java.util.List h() {
        java.lang.String j17 = j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getAnchorPkUserList size: ");
        java.util.List pkAnchorData = this.f190697j;
        sb6.append(pkAnchorData.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pkAnchorData, "pkAnchorData");
        return pkAnchorData;
    }

    public me2.a i() {
        me2.a aVar = new me2.a();
        aVar.f407449a = this.f190702o;
        aVar.f407450b = this.f190703p;
        aVar.f407451c = this.f190704q;
        java.util.HashMap hashMap = this.f190708u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hashMap, "<set-?>");
        aVar.f407452d = hashMap;
        return aVar;
    }

    public final java.lang.String j() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FeedDecorator_");
        sb6.append(hashCode());
        sb6.append('_');
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = this.f190694g;
        sb6.append(c14989xf862ae88 != null ? c14989xf862ae88.getNickname() : null);
        return sb6.toString();
    }

    public final void k(java.lang.String str, java.lang.ref.WeakReference weakReference) {
        java.lang.Object obj;
        yz5.l lVar;
        this.f190706s = str;
        if (str != null) {
            cl0.g gVar = new cl0.g(str);
            java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4("userId");
            if (mo15082x48bce8a4 == null) {
                mo15082x48bce8a4 = "";
            }
            int optInt = gVar.optInt("userStatus");
            this.D = gVar.optLong("st");
            boolean z17 = true;
            if (weakReference != null && (lVar = (yz5.l) weakReference.get()) != null) {
                r45.s7 s7Var = new r45.s7();
                s7Var.set(0, java.lang.Integer.valueOf(optInt));
                s7Var.set(1, java.lang.Integer.valueOf((int) java.lang.Math.abs(c01.id.a() - this.D)));
                lVar.mo146xb9724478(s7Var);
            }
            boolean z18 = pm0.v.z(optInt, 2);
            if (pm0.v.z(optInt, 4)) {
                z18 = false;
            }
            km2.q qVar = (km2.q) this.f190708u.get(mo15082x48bce8a4);
            if (qVar != null) {
                qVar.f390718p = z18;
            }
            java.lang.String str2 = this.f190696i.f558867a;
            if (str2 != null && str2.length() != 0) {
                z17 = false;
            }
            if (z17) {
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f190696i.f558867a, mo15082x48bce8a4)) {
                zy2.a aVar = this.f190696i;
                if (aVar.f558869c != z18) {
                    aVar.f558869c = z18;
                    m(z18, aVar.f558867a);
                    return;
                }
                return;
            }
            java.util.List pkAnchorData = this.f190697j;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pkAnchorData, "pkAnchorData");
            synchronized (pkAnchorData) {
                java.util.Iterator it = pkAnchorData.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((zy2.a) obj).f558867a, mo15082x48bce8a4)) {
                            break;
                        }
                    }
                }
            }
            zy2.a aVar2 = (zy2.a) obj;
            if (aVar2 == null || aVar2.f558869c == z18) {
                return;
            }
            aVar2.f558869c = z18;
            m(z18, mo15082x48bce8a4);
        }
    }

    public void l(byte[] bArr, int i17, java.lang.ref.WeakReference weakReference) {
        if (this.f190711x) {
            java.lang.String str = this.f190696i.f558867a;
            if (str == null || str.length() == 0) {
                return;
            }
            java.lang.Integer[] numArr = co0.t.f125269a;
            if (kz5.z.G(co0.t.f125269a, java.lang.Integer.valueOf(i17))) {
                ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.of(bArr, this, weakReference), "Sei_Message_Handler");
            } else if (zl2.q4.f555466a.E()) {
                j();
            }
        }
    }

    public final void m(boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "notifyAudioModeChange: isAudioMode" + z17 + " userId: " + str);
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pf(this, z17, str));
    }

    public void n() {
        if (this.f190711x) {
            this.f190695h = false;
            this.f190696i = new zy2.a(null, null, false, null, null, 31, null);
            this.f190697j.clear();
            this.f190698k.clear();
            this.f190708u.clear();
        }
    }

    public void o() {
        if (this.f190711x) {
            this.f190695h = false;
            this.f190705r = null;
            this.f190702o = null;
            this.f190703p = null;
            this.f190704q = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "resetSeiData");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kf kfVar = this.f190701n;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kfVar.f188724e, "reset");
            android.view.View view = kfVar.f188719J;
            if (view != null) {
                view.setBackground(null);
            }
            kfVar.f188737r = 0;
            kfVar.f188738s.clear();
            kfVar.G = 0;
            kfVar.I = 0;
            kfVar.f188741v = "";
            kfVar.f188742w = "";
            kfVar.f188728i.clear();
            kfVar.A = null;
            kfVar.B = null;
            kfVar.C = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ag agVar = kfVar.f188736q;
            agVar.f187818c = null;
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) agVar.f187820e).k(null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.vf vfVar = kfVar.f188729j;
            vfVar.f192433c.clear();
            vfVar.f();
            kd2.v vVar = kfVar.f188730k;
            if (vVar != null) {
                vVar.f388379b.clear();
                vVar.f();
            }
            kfVar.c().mo56532x6761d4f();
            em2.i iVar = kfVar.f188735p;
            if (iVar != null) {
                iVar.mo56532x6761d4f();
            }
            kfVar.M = null;
            kfVar.N = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950 = this.f190691d;
            if (c14245x86828950 != null) {
                c14245x86828950.setVisibility(8);
            }
            if (c14245x86828950 != null) {
                c14245x86828950.setBackground(null);
            }
            this.f190696i = new zy2.a(null, null, false, null, null, 31, null);
            this.f190697j.clear();
            this.f190698k.clear();
            this.f190708u.clear();
            com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 c22840x82866af5 = this.f190690c;
            if (c22840x82866af5 != null) {
                c22840x82866af5.removeAllViews();
            }
            this.C.clear();
        }
    }

    public void p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        java.lang.String userName;
        r45.nw1 liveInfo;
        r45.ma4 ma4Var;
        if (this.f190711x) {
            this.f190694g = c14989xf862ae88;
            this.f190710w = c14994x9b99c079;
            zy2.a aVar = this.f190696i;
            java.lang.String str = (c14989xf862ae88 == null || (liveInfo = c14989xf862ae88.getLiveInfo()) == null || (ma4Var = (r45.ma4) liveInfo.m75936x14adae67(23)) == null) ? null : ma4Var.f461834n;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            aVar.getClass();
            aVar.f558867a = str;
            zy2.a aVar2 = this.f190696i;
            if (c14989xf862ae88 != null && (userName = c14989xf862ae88.getUserName()) != null) {
                str2 = userName;
            }
            aVar2.getClass();
            aVar2.f558868b = str2;
            this.f190701n.f188727h = c14989xf862ae88;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae882 = this.f190694g;
            if (c14989xf862ae882 != null) {
                boolean z17 = pm0.v.z(c14989xf862ae882.getAnchorStatus(), 256);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "checkViewAlpha audioMode: " + z17);
                yz5.l lVar = this.f190692e;
                if (z17) {
                    if (lVar != null) {
                        lVar.mo146xb9724478(java.lang.Boolean.FALSE);
                    }
                } else if (lVar != null) {
                    lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                }
            }
            r();
        }
    }

    public final void q(android.graphics.Point size) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "size");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kf kfVar = this.f190701n;
        kfVar.getClass();
        kfVar.f188739t = size;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kfVar.f188724e, "setWindowSize: " + size);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "setWindowSize size:" + size);
    }

    public final void r() {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        if (this.f190695h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "isFetching, skip!");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f190710w;
        if ((((c14994x9b99c079 == null || (feedObject = c14994x9b99c079.getFeedObject()) == null) ? 0L : feedObject.m76755x3ca2cb4e()) & 1) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "block_cgi_flag");
            return;
        }
        this.f190695h = true;
        java.lang.String j17 = j();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = this.f190694g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, "[NearbyEndLive] tryFetchMicUserInfo feedId: ".concat(pm0.v.u(c14989xf862ae88 != null ? c14989xf862ae88.getFeedId() : 0L)));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r45.in2 in2Var = new r45.in2();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae882 = this.f190694g;
        in2Var.set(0, java.lang.Long.valueOf(c14989xf862ae882 != null ? c14989xf862ae882.getFeedId() : 0L));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae883 = this.f190694g;
        if (c14989xf862ae883 == null || (str = c14989xf862ae883.getNonceId()) == null) {
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
        com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 c22840x82866af5 = this.f190690c;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f17 = f(c22840x82866af5);
        km5.d T = pm0.v.T(new db2.u(c17, i17, i18, i19, str2, str3, i27, vg0Var, i28, str4, fr0Var, num, str5, f17 != null ? ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).wi(f17) : null, null, null, null, 122814, null).l(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qf(currentTimeMillis, this));
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f18 = f(c22840x82866af5);
        if (f18 != null) {
            T.f(f18);
        }
    }

    public final void s() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 c22840x82866af5 = this.f190690c;
        java.lang.Object parent = c22840x82866af5 != null ? c22840x82866af5.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rf(viewGroup, this));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "feedDecorate enable:" + this.f190711x);
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf.t(boolean):void");
    }
}
