package fi2;

/* loaded from: classes10.dex */
public final class x0 extends fi2.a {

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f344458c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f344459d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f344460e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f344461f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 f344462g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f344463h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f344464i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f344465j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f344466k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f344467l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f344468m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f344469n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f344470o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f344471p;

    /* renamed from: q, reason: collision with root package name */
    public final dj2.k f344472q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 f344473r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f344474s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f344475t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f344476u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f344477v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(zi2.w plugin, android.view.ViewGroup viewGroup) {
        super(plugin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f344458c = viewGroup;
        android.view.View findViewById = plugin.f446856d.findViewById(com.p314xaae8f345.mm.R.id.qrp);
        this.f344459d = findViewById;
        this.f344460e = findViewById.findViewById(com.p314xaae8f345.mm.R.id.pod);
        this.f344461f = findViewById.findViewById(com.p314xaae8f345.mm.R.id.qro);
        com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 c22840x82866af5 = (com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5) findViewById.findViewById(com.p314xaae8f345.mm.R.id.f_s);
        this.f344462g = c22840x82866af5;
        jz5.g b17 = jz5.h.b(new fi2.m0(this, plugin));
        this.f344463h = b17;
        this.f344464i = jz5.h.b(new fi2.g0(this, plugin));
        this.f344465j = jz5.h.b(new fi2.i0(this, plugin));
        this.f344466k = jz5.h.b(new fi2.j0(this, plugin));
        this.f344467l = jz5.h.b(new fi2.k0(this, plugin));
        this.f344468m = jz5.h.b(new fi2.h0(this, plugin));
        this.f344469n = jz5.h.b(new fi2.v0(this, plugin));
        this.f344470o = jz5.h.b(new fi2.w0(this, plugin));
        this.f344471p = jz5.h.b(new fi2.u0(this, plugin));
        dj2.k kVar = new dj2.k();
        this.f344472q = kVar;
        this.f344476u = jz5.h.b(new fi2.n0(plugin));
        this.f344477v = jz5.h.b(new fi2.l0(this, plugin));
        qo0.c cVar = plugin.f554686p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar : null;
        this.f344473r = k0Var != null ? (com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1) k0Var.findViewById(com.p314xaae8f345.mm.R.id.icy) : null;
        c22840x82866af5.m82883x6cab2c8d((dj2.h) ((jz5.n) b17).mo141623x754a37bb());
        c22840x82866af5.m82887x900dcbe1(new com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.a());
        c22840x82866af5.m82886x22dac925(kVar);
        c22840x82866af5.m82884x7d131b60(3);
    }

    public final dj2.b B() {
        dj2.b bVar;
        xh2.c cVar = (xh2.c) ((mm2.o4) this.f344334a.P0(mm2.o4.class)).A.mo3195x754a37bb();
        switch (cVar != null ? cVar.f536066c : 0) {
            case 1:
                bVar = (dj2.d) ((jz5.n) this.f344465j).mo141623x754a37bb();
                break;
            case 2:
                bVar = (dj2.g) ((jz5.n) this.f344467l).mo141623x754a37bb();
                break;
            case 3:
                bVar = (dj2.f) ((jz5.n) this.f344466k).mo141623x754a37bb();
                break;
            case 4:
                bVar = (dj2.m) ((jz5.n) this.f344469n).mo141623x754a37bb();
                break;
            case 5:
                bVar = (dj2.n) ((jz5.n) this.f344470o).mo141623x754a37bb();
                break;
            case 6:
                bVar = (dj2.l) ((jz5.n) this.f344471p).mo141623x754a37bb();
                break;
            case 7:
                bVar = (dj2.e) ((jz5.n) this.f344464i).mo141623x754a37bb();
                break;
            case 8:
                bVar = (dj2.c) ((jz5.n) this.f344468m).mo141623x754a37bb();
                break;
            default:
                bVar = (dj2.h) ((jz5.n) this.f344463h).mo141623x754a37bb();
                break;
        }
        bVar.f314434h = this.f344474s;
        this.f344462g.m82883x6cab2c8d(bVar);
        return bVar;
    }

    public final android.view.View C() {
        com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 c22840x82866af5 = this.f344462g;
        int childCount = c22840x82866af5.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = c22840x82866af5.getChildAt(i17);
            if (childAt != null && (childAt instanceof tj2.a)) {
                return ((tj2.a) childAt).mo151527x8a4de197();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0221, code lost:
    
        if (lj2.k.f400412f.contains(java.lang.Integer.valueOf(r1.f536066c)) != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(xh2.c r21) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fi2.x0.D(xh2.c):void");
    }

    @Override // fi2.m
    public android.view.View a() {
        return this.f344459d;
    }

    @Override // fi2.m
    public void b(boolean z17) {
        dj2.d dVar = (dj2.d) ((jz5.n) this.f344465j).mo141623x754a37bb();
        if (dVar.f364146a != null) {
            int childCount = dVar.d().getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = dVar.d().getChildAt(i17);
                sj2.f fVar = childAt instanceof sj2.f ? (sj2.f) childAt : null;
                if (fVar != null) {
                    if (fVar.N.f343720j.getVisibility() == 8 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fVar.P, java.lang.Boolean.valueOf(z17))) {
                        return;
                    }
                    pm0.v.X(new sj2.e(fVar, z17));
                    return;
                }
            }
        }
    }

    @Override // fi2.m
    public void c(xh2.a micCoverData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micCoverData, "micCoverData");
        ni2.r1 r1Var = (ni2.r1) ((jz5.n) this.f344476u).mo141623x754a37bb();
        r1Var.getClass();
        if (micCoverData.f536053a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNormalRoomGrabEditPanel", "linkMicUser is not null");
        } else {
            r1Var.f418987d = micCoverData;
            ((nj2.b) ((jz5.n) r1Var.f418991h).mo141623x754a37bb()).w();
        }
    }

    @Override // fi2.m
    public void e(xh2.a micCoverData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micCoverData, "micCoverData");
        ((ni2.r1) ((jz5.n) this.f344476u).mo141623x754a37bb()).a(micCoverData);
    }

    @Override // fi2.m
    public void f(java.lang.String str) {
        pm0.v.X(new fi2.t0(this, str));
    }

    @Override // fi2.m
    public void h() {
        r();
        D(null);
    }

    @Override // fi2.m
    public void i(java.lang.String userId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userId, "userId");
        pm0.v.X(new fi2.o0(this, userId, z17));
    }

    @Override // fi2.m
    public android.view.View j() {
        android.view.View view = this.f344460e;
        if (view != null) {
            return view.findViewById(com.p314xaae8f345.mm.R.id.qxr);
        }
        return null;
    }

    @Override // fi2.m
    public android.view.View k() {
        return this.f344461f;
    }

    @Override // fi2.m
    public android.view.View l() {
        return this.f344460e;
    }

    @Override // fi2.m
    public void n(boolean z17, boolean z18) {
        this.f344474s = z17;
        this.f344475t = z18;
    }

    @Override // fi2.m
    public android.widget.ImageView o() {
        android.view.View view = this.f344461f;
        if (view != null) {
            return (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f567544qv3);
        }
        return null;
    }

    @Override // fi2.m
    public android.view.ViewGroup p() {
        return this.f344462g;
    }

    @Override // fi2.m
    public void r() {
        android.widget.TextView textView;
        zi2.w wVar = this.f344334a;
        ((mm2.o4) wVar.P0(mm2.o4.class)).A.mo7806x9d92d11c(wVar, new fi2.q0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44 = ((mm2.y2) wVar.P0(mm2.y2.class)).B;
        c14227x4262fb44.mo7806x9d92d11c(wVar, new fi2.r0(this));
        xh2.e eVar = (xh2.e) c14227x4262fb44.mo3195x754a37bb();
        if (eVar != null) {
            lj2.k b17 = b();
            b17.getClass();
            java.lang.String title = eVar.f536076a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
            if (b17.f400416d && (textView = b17.f400418g) != null) {
                textView.setText(title.concat(": "));
            }
            lj2.k b18 = b();
            b18.getClass();
            java.lang.String text = eVar.f536077b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
            if (b18.f400416d) {
                android.widget.TextView textView2 = b18.f400414b;
                if (textView2 != null) {
                    textView2.setText(text);
                }
                b18.a();
            }
        }
    }

    @Override // fi2.m
    public android.view.View s() {
        android.view.View view = this.f344461f;
        if (view != null) {
            return (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.ewf);
        }
        return null;
    }

    @Override // fi2.m
    /* renamed from: statusChange */
    public void mo129590x60d69242(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (fi2.f0.f344364a[status.ordinal()] == 1) {
            this.f344474s = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
            this.f344475t = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", false) : false;
        }
        dj2.b B = B();
        if (dj2.a.f314427a[status.ordinal()] == 1) {
            B.f314434h = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
            if (bundle != null) {
                bundle.getBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", false);
            }
            if (!(B.f364146a != null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicBaseRatioAdapter", "notifyAnchorModeSwitch layout isInitialized = false");
                return;
            }
            int childCount = B.d().getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                if (B.d().getChildAt(i17) instanceof sj2.f) {
                    android.view.View childAt = B.d().getChildAt(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.widget.focus.FinderLiveMicFocusAnchorCoverWidget");
                    ((sj2.f) childAt).c0(B.f314434h);
                }
            }
        }
    }

    @Override // fi2.m
    public void u(r45.xn1 contact) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        pm0.v.X(new fi2.s0(this, contact));
    }

    @Override // fi2.m
    public android.view.View v() {
        android.view.View view = this.f344461f;
        if (view != null) {
            return view.findViewById(com.p314xaae8f345.mm.R.id.qxs);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0678  */
    @Override // fi2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(java.util.LinkedHashMap r23, xh2.b r24) {
        /*
            Method dump skipped, instructions count: 1691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fi2.x0.w(java.util.LinkedHashMap, xh2.b):void");
    }

    @Override // fi2.m
    public void x(java.lang.String userName) {
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        xh2.b bVar = ((mm2.y2) this.f344334a.P0(mm2.y2.class)).f411098r;
        if (bVar == null || (linkedList = bVar.f536063i) == null) {
            return;
        }
        synchronized (linkedList) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                km2.q qVar = ((xh2.a) next).f536053a;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar != null ? qVar.f390705c : null, userName)) {
                    obj = next;
                    break;
                }
            }
        }
        xh2.a aVar = (xh2.a) obj;
        if (aVar != null) {
            ((ni2.r1) ((jz5.n) this.f344476u).mo141623x754a37bb()).a(aVar);
        }
    }

    @Override // fi2.a
    public java.lang.String z() {
        return "NormalLiveCoverLogicCore";
    }

    public final lj2.k b() {
        return (lj2.k) ((jz5.n) this.f344477v).mo141623x754a37bb();
    }
}
