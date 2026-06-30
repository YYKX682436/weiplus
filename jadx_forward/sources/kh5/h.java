package kh5;

/* loaded from: classes7.dex */
public final class h extends wp0.c {

    /* renamed from: h, reason: collision with root package name */
    public final yb5.d f389604h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.p842x5c28046.ui.C10860xa01d8e29 f389605i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.FrameLayout f389606m;

    /* renamed from: n, reason: collision with root package name */
    public final yz5.l f389607n;

    /* renamed from: o, reason: collision with root package name */
    public final android.os.Handler f389608o;

    /* renamed from: p, reason: collision with root package name */
    public kh5.a f389609p;

    /* renamed from: q, reason: collision with root package name */
    public jh5.b f389610q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f389611r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f389612s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Runnable f389613t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Runnable f389614u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.Runnable f389615v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f389616w;

    public h(yb5.d chattingContext, com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.p842x5c28046.ui.C10860xa01d8e29 holder, android.widget.FrameLayout beneathInputHolder, yz5.l checkMsgExist) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(beneathInputHolder, "beneathInputHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(checkMsgExist, "checkMsgExist");
        this.f389604h = chattingContext;
        this.f389605i = holder;
        this.f389606m = beneathInputHolder;
        this.f389607n = checkMsgExist;
        holder.m46575xe1a1ee24(new kh5.b(this));
        this.f389608o = new android.os.Handler(android.os.Looper.getMainLooper());
        jh5.b bVar = jh5.b.f381399d;
        this.f389610q = jh5.b.f381399d;
        this.f389612s = new java.util.ArrayList();
        this.f389613t = new kh5.f(this);
        this.f389614u = new kh5.g(this);
        this.f389615v = new kh5.d(this);
        this.f389616w = jz5.h.b(kh5.e.f389601d);
    }

    @Override // lc3.e
    public android.app.Activity B0() {
        android.app.Activity g17 = this.f389604h.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
        return g17;
    }

    @Override // wp0.c, lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerTag, "containerTag");
        if (this.f529908f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MEChattingMgr", "trigger show but already destroyed");
            return null;
        }
        int hashCode = containerTag.hashCode();
        if (hashCode != -1791438311) {
            com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.p842x5c28046.ui.C10860xa01d8e29 c10860xa01d8e29 = this.f389605i;
            if (hashCode != 116147433) {
                if (hashCode == 1894816597 && containerTag.equals("aboveCanvas")) {
                    return new tp0.m(c10860xa01d8e29.a(false));
                }
            } else if (containerTag.equals("belowCanvas")) {
                return new tp0.m(c10860xa01d8e29.a(true));
            }
        } else if (containerTag.equals("belowInput")) {
            android.widget.FrameLayout parentView = this.f389606m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
            return new tp0.m(parentView);
        }
        throw new java.lang.IllegalArgumentException("Not legal containerTag");
    }

    @Override // wp0.c
    public java.util.List G0() {
        return kz5.n0.t0(super.G0(), kz5.c0.i(new lh5.f(), new lh5.c(), new lh5.b(), new up0.b(), new up0.e(), new up0.c()));
    }

    @Override // wp0.c
    public jz5.l H0() {
        int[] iArr = new int[2];
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.p842x5c28046.ui.C10860xa01d8e29 c10860xa01d8e29 = this.f389605i;
        c10860xa01d8e29.getLocationOnScreen(iArr);
        int i17 = iArr[1];
        return new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(B0().getResources().getDisplayMetrics().heightPixels - (c10860xa01d8e29.getBottom() + i17)));
    }

    @Override // wp0.c
    public com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.p842x5c28046.ui.C10860xa01d8e29 K0() {
        return this.f389605i;
    }

    @Override // wp0.c
    public wp0.b M0(java.lang.String msgTalker, java.lang.String id6, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalker, "msgTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        java.lang.Long j17 = r26.h0.j(id6);
        if (j17 != null) {
            return mh5.a.b(msgTalker, j17.longValue(), id6, "", z17, true, this.f389604h, this.f389605i);
        }
        return null;
    }

    @Override // wp0.c
    public java.util.Map N0(boolean z17) {
        wp0.b a17;
        yb5.d dVar = this.f389604h;
        java.util.List<android.util.Pair> c17 = mh5.a.c(dVar, false);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (c17 == null || ((java.util.ArrayList) c17).size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MEChattingMgr", "getVisibleMetaDict failed");
            return hashMap;
        }
        for (android.util.Pair pair : c17) {
            xq.b bVar = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ta) ((sb5.p0) dVar.f542241c.a(sb5.p0.class))).f281522x;
            java.lang.Object first = pair.first;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "first");
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) first;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sa saVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sa) bVar;
            saVar.getClass();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ta taVar = saVar.f281465b;
            if (((java.lang.Boolean) ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qa) taVar.f281516r).mo146xb9724478(f9Var)).booleanValue()) {
                java.util.List c18 = xq.s.f537548a.c(f9Var);
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(c18, 10));
                int i17 = 0;
                for (java.lang.Object obj : c18) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(f9Var.m124847x74d37ac6());
                    sb6.append('_');
                    sb6.append(i17);
                    arrayList.add(sb6.toString());
                    i17 = i18;
                }
                linkedList.addAll(arrayList);
            } else if (((java.lang.Boolean) ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ea) taVar.f281515q).mo146xb9724478(f9Var)).booleanValue()) {
                linkedList.add(java.lang.String.valueOf(f9Var.m124847x74d37ac6()));
            }
            boolean isEmpty = linkedList.isEmpty();
            java.util.Collection<java.lang.String> collection = linkedList;
            if (isEmpty) {
                collection = kz5.b0.c("");
            }
            for (java.lang.String str : collection) {
                if (z17) {
                    android.graphics.RectF d17 = mh5.a.d((com.p314xaae8f345.mm.p2621x8fb0427b.f9) pair.first, str, true, dVar, this.f389605i);
                    a17 = d17 != null ? mh5.a.a((com.p314xaae8f345.mm.p2621x8fb0427b.f9) pair.first, str, "", d17) : null;
                } else {
                    a17 = mh5.a.a((com.p314xaae8f345.mm.p2621x8fb0427b.f9) pair.first, str, "", null);
                }
                if (a17 != null) {
                    hashMap.put(java.lang.String.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.f9) pair.first).m124847x74d37ac6()), a17);
                }
            }
        }
        return hashMap;
    }

    @Override // wp0.c
    public void O0() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.c3) i95.n0.c(ob0.c3.class))).Ai("ME");
    }

    @Override // wp0.c
    public void S0(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        java.lang.String name = lh5.a.class.getName();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        config.f229351e.add(name);
    }

    public final void X0(jh5.b meta, int i17) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(meta, "meta");
        if (s1()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MEChattingMgr", "[ME] forceMagicEggStop, meta = " + meta + ", reason = " + i17);
            java.lang.String a17 = new zp0.b(meta.f381400a, meta.f381401b, meta.f381402c, i17).a();
            jc3.j0 j0Var = this.f529908f;
            if (j0Var != null) {
                ((rc3.w0) j0Var).k("OnClientEvent", a17);
                g1();
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MEChattingMgr", "forceMagicEggStop without biz");
            }
        }
    }

    public void Y0() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.c3) i95.n0.c(ob0.c3.class))).Bi("ME");
    }

    public final void g1() {
        android.os.Handler handler = this.f389608o;
        java.lang.Runnable runnable = this.f389615v;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, ((java.lang.Number) ((jz5.n) this.f389616w).mo141623x754a37bb()).longValue());
    }

    public final void m1(jh5.b bVar, boolean z17, jh5.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MEChattingMgr", "[ME]: sendMagicEgg: " + bVar + ", " + z17 + ", " + aVar);
        if (z17 && this.f389611r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MEChattingMgr", "[ME]: only one clickable in a session");
            return;
        }
        if (z17) {
            this.f389611r = true;
        }
        java.lang.String a17 = new zp0.d(bVar.f381400a, bVar.f381401b, bVar.f381402c, z17, aVar.a()).a();
        jc3.j0 j0Var = this.f529908f;
        jz5.f0 f0Var = null;
        if (j0Var != null) {
            java.lang.ref.WeakReference weakReference = vb5.l.f516388q;
            vb5.l lVar = weakReference != null ? (vb5.l) weakReference.get() : null;
            if (lVar != null) {
                int m75891xf39fff7a = lVar.f280113d.p().m75891xf39fff7a();
                yb5.d dVar = this.f389604h;
                jc3.j0.d(j0Var, "GameGlobal.backgroudParentTopInset=" + i65.a.c(dVar.g(), fp.a.c(dVar.g()) + m75891xf39fff7a) + ";GameGlobal.androidTipsBarHeight=" + i65.a.c(dVar.g(), m75891xf39fff7a) + ';', null, 2, null);
            }
            int i17 = z17 ? 11 : 10;
            java.lang.String eggKey = bVar.f381400a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eggKey, "eggKey");
            java.lang.String eggId = bVar.f381401b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eggId, "eggId");
            java.lang.String sceneId = bVar.f381402c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneId, "sceneId");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6724x2ee3cacb c6724x2ee3cacb = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6724x2ee3cacb();
            c6724x2ee3cacb.f140619e = c6724x2ee3cacb.b("sessionid", eggId, true);
            c6724x2ee3cacb.f140621g = c6724x2ee3cacb.b("chatid", sceneId, true);
            c6724x2ee3cacb.f140622h = c6724x2ee3cacb.b("activityid", eggKey, true);
            c6724x2ee3cacb.f140620f = i17;
            c6724x2ee3cacb.k();
            ((rc3.w0) j0Var).k("OnClientEvent", a17);
            g1();
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MEChattingMgr", "sendMagicEgg without biz");
        }
    }

    /* renamed from: prepare */
    public final void m143477xed060d07() {
        if (this.f529908f != null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MEChattingMgr", "[ME] prepare biz ok: " + V0());
        g1();
    }

    public final boolean s1() {
        jh5.b bVar = this.f389610q;
        jh5.b bVar2 = jh5.b.f381399d;
        jh5.b bVar3 = jh5.b.f381399d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, bVar3)) {
            return false;
        }
        this.f389605i.f150180d = com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.p842x5c28046.ui.C10860xa01d8e29.f150179h;
        android.os.Handler handler = this.f389608o;
        handler.removeCallbacks(this.f389613t);
        handler.removeCallbacks(this.f389614u);
        this.f389612s.clear();
        kh5.a aVar = this.f389609p;
        if (aVar != null) {
            jh5.b bVar4 = this.f389610q;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EggMgr", "onEnd: %s, %s", bVar4.f381401b, bVar4.f381400a);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.n9 n9Var = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.o9) aVar).f283602a;
            n9Var.f283569s = false;
            n9Var.f283560j = false;
            n9Var.f283568r = null;
        }
        this.f389610q = bVar3;
        this.f389611r = false;
        return true;
    }
}
