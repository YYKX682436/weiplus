package qy0;

/* loaded from: classes5.dex */
public final class d0 extends py0.y {
    public final n0.v2 A;

    /* renamed from: o, reason: collision with root package name */
    public ut3.d f449106o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f449107p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.Intent f449108q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f449109r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f449110s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f449111t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f449112u;

    /* renamed from: v, reason: collision with root package name */
    public final n0.v2 f449113v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f449114w;

    /* renamed from: x, reason: collision with root package name */
    public final qy0.t f449115x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 f449116y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f449117z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f449108q = new android.content.Intent();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.m b17 = gm0.j1.b();
        sb6.append(kk.v.a(b17 != null ? b17.h() : 0));
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        this.f449109r = sb6.toString();
        this.f449110s = jz5.h.b(qy0.y.f449206d);
        jz5.i iVar = jz5.i.f384364f;
        this.f449111t = jz5.h.a(iVar, new qy0.r(this));
        this.f449112u = jz5.h.a(iVar, new qy0.v(this));
        this.f449113v = n0.s4.c(java.lang.Boolean.TRUE, null, 2, null);
        this.f449114w = jz5.h.a(iVar, new qy0.s(this));
        this.f449115x = new qy0.t(this, activity);
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var = new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7(m158345xefc66565(), kz5.p0.f395529d, kz5.b0.c(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.y4.f151869e), false, false, false, false, 64, null);
        m7Var.f151626k = new qy0.c0(this, null);
        this.f449116y = m7Var;
        this.f449117z = jz5.h.b(new qy0.u(this));
        this.A = n0.s4.c(0, null, 2, null);
    }

    public static final void U6(qy0.d0 d0Var) {
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var = d0Var.f449116y;
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) kz5.n0.a0(m7Var.b(), 1);
        if (m5Var != null) {
            m7Var.e(m5Var.f151610a);
            d0Var.a7(true, false);
        }
        super.Q1();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // py0.y, dz0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof qy0.j
            if (r0 == 0) goto L13
            r0 = r11
            qy0.j r0 = (qy0.j) r0
            int r1 = r0.f449132g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f449132g = r1
            goto L18
        L13:
            qy0.j r0 = new qy0.j
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f449130e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f449132g
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r0 = r0.f449129d
            qy0.d0 r0 = (qy0.d0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L40
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            r0.f449129d = r10
            r0.f449132g = r4
            if (r3 != r1) goto L3f
            return r1
        L3f:
            r0 = r10
        L40:
            com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams r11 = r0.W6()
            boolean r11 = r11.f151302e
            if (r11 == 0) goto L59
            java.lang.String r11 = "MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC"
            java.lang.String r0 = "manage sdk, init"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r11, r0)
            az0.i5 r4 = az0.i5.f97090a
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            az0.i5.s(r4, r5, r6, r7, r8, r9)
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qy0.d0.H6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pf5.o
    public android.content.Intent N6() {
        return W6().f151303f ? this.f449108q : m158359x1e885992();
    }

    @Override // py0.y
    public jz5.l O6() {
        n0.e5 e5Var;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356;
        java.lang.String a17 = this.f449116y.a();
        ty0.b1 b1Var = this.f440566h;
        java.lang.String m33856x92013dca = (b1Var == null || (e5Var = b1Var.f504325b) == null || (c4116xf4b2c356 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) e5Var.mo128745x754a37bb()) == null) ? null : c4116xf4b2c356.m33856x92013dca();
        if (m33856x92013dca == null) {
            m33856x92013dca = "";
        }
        return new jz5.l(a17, m33856x92013dca);
    }

    @Override // py0.y, dz0.k
    public void Q1() {
        if (W6().f151303f) {
            p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new qy0.x(this, null), 3, null);
        } else {
            super.Q1();
        }
    }

    @Override // py0.y
    public void Q6() {
        android.content.ComponentCallbacks2 m80379x76847179 = m80379x76847179();
        p012xc85e97e9.p093xedfae76a.y yVar = m80379x76847179 instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) m80379x76847179 : null;
        if (yVar != null) {
            if (V6()) {
                android.app.Activity context = m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class))).f151324o = false;
            } else {
                int Ri = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_finder_maas_recomend_fallback_type, bm5.h0.RepairerConfig_Maas_FinderFallBack_Int, 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMaasXConfigImpl", "finder fallback " + Ri);
                if (Ri == 2) {
                    android.app.Activity context2 = m80379x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                    pf5.z zVar2 = pf5.z.f435481a;
                    if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).c(dz0.l.class))).f151324o = false;
                    p3325xe03a0797.p3326xc267989b.l.d(mo144225x95f74600(), null, null, new qy0.q(this, null), 3, null);
                } else {
                    android.app.Activity context3 = m80379x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
                    pf5.z zVar3 = pf5.z.f435481a;
                    if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    p012xc85e97e9.p093xedfae76a.j0 j0Var = ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar3.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).c(dz0.l.class))).f151320h;
                    final com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var = this.f449116y;
                    j0Var.mo7806x9d92d11c(yVar, new p012xc85e97e9.p093xedfae76a.k0() { // from class: qy0.k
                        @Override // p012xc85e97e9.p093xedfae76a.k0
                        /* renamed from: onChanged */
                        public void mo525x7bb163d5(java.lang.Object obj) {
                            java.util.List p07 = (java.util.List) obj;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
                            com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7.this.d(p07);
                        }
                    });
                    android.app.Activity context4 = m80379x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context4, "context");
                    if (!(context4 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar3.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context4).c(dz0.l.class))).f151319g.mo7806x9d92d11c(yVar, new qy0.l(this));
                }
            }
        }
        java.util.List list = W6().f151301d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) obj).mo63659xfb85f7b0() == 1) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next()).f219963e);
        }
        com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197 c11098x3efa6197 = (com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197) ((jz5.n) this.f440562d).mo141623x754a37bb();
        int h17 = com.p314xaae8f345.mm.ui.bl.h(c11098x3efa6197.getContext());
        android.content.Context context5 = c11098x3efa6197.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context5, "getContext(...)");
        pf5.z zVar4 = pf5.z.f435481a;
        if (!(context5 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        c11098x3efa6197.m47820xe9f5bdb7(u0.j.c(-1637040323, true, new qy0.p(this, h17, (dz0.l) zVar4.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context5).c(dz0.l.class), arrayList2)));
    }

    @Override // py0.y
    public void R6(java.lang.String path, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (W6().f151303f) {
            Z6(true, path);
        } else {
            super.R6(path, str);
        }
    }

    public final boolean V6() {
        java.lang.String str = (java.lang.String) ((jz5.n) this.f449117z).mo141623x754a37bb();
        if (str == null || str.length() == 0) {
            r45.zi2 zi2Var = (r45.zi2) this.f449112u.mo141623x754a37bb();
            java.lang.String m75945x2fec8307 = zi2Var != null ? zi2Var.m75945x2fec8307(12) : null;
            if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                return false;
            }
        }
        return true;
    }

    public final com.p314xaae8f345.mm.p916x4268f0dc.api.C11011xd00752eb W6() {
        return (com.p314xaae8f345.mm.p916x4268f0dc.api.C11011xd00752eb) this.f449111t.mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388 X6() {
        return (com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388) this.f449114w.mo141623x754a37bb();
    }

    public final void Y6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "launchMMEditorUI");
        this.f449107p = true;
        ut3.f.f512709c.f512710a = this.f449106o;
        android.app.Activity m80379x76847179 = m80379x76847179();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465.f237158t;
        android.content.Intent intent = new android.content.Intent(m80379x76847179, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465.class);
        intent.putExtras(m80379x76847179().getIntent());
        android.app.Activity m80379x768471792 = m80379x76847179();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(1);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(m80379x768471792, arrayList.toArray(), "com/tencent/mm/mj_template/album_template/multi_template/MaasAlbumMultiTemplateOverlayUIC", "launchMMEditorUI", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6(boolean r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qy0.d0.Z6(boolean, java.lang.String):void");
    }

    public final void a7(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "switchMaasPreview() called with: maasPreview = " + z17);
        ((n0.q4) this.f449113v).mo148714x53d8522f(java.lang.Boolean.valueOf(z17));
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b = (com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "setMaasPreview() called with: maasPreview = " + z17);
        c11015x5b190a3b.f151334y = z17;
        p3325xe03a0797.p3326xc267989b.l.d(c11015x5b190a3b.m158345xefc66565(), null, null, new dz0.l2(z17, c11015x5b190a3b, null), 3, null);
        if (W6().f151303f) {
            if (!z17) {
                m158354x19263085().mo273xed6858b4().a(X6());
                X6().b();
                return;
            }
            m158354x19263085().mo273xed6858b4().c(X6());
            com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388 X6 = X6();
            X6.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMMusicManager", "pausePlay: ");
            gz0.h hVar = X6.f151281m;
            if (hVar != null) {
                hVar.a();
            }
        }
    }

    public final boolean b7(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var) {
        return (m7Var.a().length() > 0) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m7Var.a(), "@@no_template@@");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        if (r14 == null) goto L17;
     */
    @Override // py0.y, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2277xb2f1ab1a(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qy0.d0.mo2277xb2f1ab1a(android.os.Bundle):void");
    }

    @Override // py0.y, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        super.mo451xac79a11b();
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.j5 j5Var = com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5.f151558m;
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5.f151560o.clear();
        if (W6().f151302e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "manage sdk, release");
            az0.i5.x(az0.i5.f97090a, false, false, 3, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onPreDestroyed */
    public void mo47482x6fa9d635() {
        super.mo47482x6fa9d635();
        if (this.f440568m || !this.f449107p) {
            return;
        }
        S6(2);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (this.f449107p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", "setReportScene: 2, field: " + bz0.a.f118256b);
            bz0.a.f118256b = 2;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        if (W6().f151303f) {
            contentView.setBackgroundColor(m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.f560696rn));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onWindowFocusChanged */
    public void mo14961xa4ec7b0b(boolean z17) {
        super.mo14961xa4ec7b0b(z17);
        if (z17) {
            int c17 = com.p314xaae8f345.mm.ui.bl.c(m158354x19263085());
            ((n0.q4) this.A).mo148714x53d8522f(java.lang.Integer.valueOf(c17));
        }
    }

    @Override // dz0.k
    public void t(java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "onSdkError ".concat(msg));
        Y6();
        m80379x76847179().finish();
    }
}
