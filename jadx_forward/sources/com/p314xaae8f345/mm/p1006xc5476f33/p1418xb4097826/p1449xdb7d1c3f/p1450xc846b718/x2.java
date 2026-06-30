package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public abstract class x2 implements zy2.fa {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f187506a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f187507b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f187508c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f187509d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ua f187510e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f187511f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f187512g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f187513h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f187514i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f187515j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f187516k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f187517l;

    public x2(zy2.ba storage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        this.f187506a = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.r2.f187330d);
        this.f187507b = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.s2(this));
        this.f187508c = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.q2(this));
        this.f187510e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5(this, ((c61.l7) i95.n0.c(c61.l7.class)).mk());
        this.f187511f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.o2.f187269d);
        this.f187512g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p2(this));
        this.f187513h = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w2.f187490d);
        this.f187514i = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.v2.f187450d);
        this.f187515j = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.t2(this));
        this.f187517l = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.u2(this));
    }

    public void X0(r45.vs2 ctrlInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
        java.lang.String username = g92.b.f351302e.T0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        if (hc2.u0.d(ctrlInfo, "FinderMentionEntrance") && (i17 = i("FinderEntrance", username, false, false)) != null && i17.m55856xfb85f7b0() == 1051) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExt", "removePath FinderMentionEntrance for redDot type 1051, uuid=" + i17.f65882x5364c75d + '!');
            java.util.LinkedList show_infos = ctrlInfo.f470022g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(show_infos, "show_infos");
            pm0.v.d0(show_infos, new hc2.t0("FinderMentionEntrance"));
        }
    }

    public void Y0(boolean z17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotBaseManager", "enterFinderFromFindMoreFriend " + z17 + " source " + source);
        this.f187509d = z17;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z2 Z0() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z2) ((jz5.n) this.f187512g).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.c4 a1() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.c4) ((jz5.n) this.f187515j).mo141623x754a37bb();
    }

    public final kc2.g1 b1() {
        return (kc2.g1) ((jz5.n) this.f187517l).mo141623x754a37bb();
    }

    public final java.util.concurrent.ConcurrentHashMap c1() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f187513h).mo141623x754a37bb();
    }

    public boolean d1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0 aj0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a, "红点manager在使用之前检查下帐号是否准备好了", e42.c0.clicfg_finder_reddot_manager_check_account_state_before_working, java.lang.Boolean.valueOf(kb2.b.f387758a.a()), false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wg0.f209786d, 8, null)).booleanValue()) {
            return gm0.j1.a();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x06ea, code lost:
    
        r19 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x08bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e1(r45.dz2 r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 2291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x2.e1(r45.dz2, java.lang.String):void");
    }

    @Override // zy2.la
    public void r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.b3 actionType, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        if (!this.f187516k) {
            this.f187516k = true;
            i95.m c17 = i95.n0.c(c61.t8.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g) zy2.ca.ld((zy2.ca) c17, false, 1, null)).a(null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ga gaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187090a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187091b.clear();
        }
        kc2.g1 b17 = b1();
        if (b17 != null) {
            b17.b(true, actionType, h0Var);
        }
    }

    @Override // zy2.la
    public void s(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r screen, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb pref, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.n0 source) {
        jz5.f0 f0Var;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(screen, "screen");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pref, "pref");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        kc2.g1 b17 = b1();
        if (b17 == null || source != com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.n0.OnClick) {
            return;
        }
        b17.k().mo50293x3498a0(new kc2.v0(b17, pref));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17.n().f388034c, pref.f279313q)) {
            kc2.v1 n17 = b17.n();
            n17.f388033b.mo50293x3498a0(new kc2.r1(n17.d(), n17, c01.id.e()));
            return;
        }
        java.util.Iterator it = ((java.util.LinkedList) ((jz5.n) b17.f387927r).mo141623x754a37bb()).iterator();
        while (true) {
            f0Var = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((kc2.c0) ((zy2.v7) obj)).f387869f.contains(pref.f279313q)) {
                    break;
                }
            }
        }
        zy2.v7 v7Var = (zy2.v7) obj;
        if (v7Var != null) {
            kc2.c0 c0Var = (kc2.c0) v7Var;
            c0Var.f387865b.mo50293x3498a0(new kc2.y(zy2.v7.a(c0Var, false, false, 3, null), c0Var, c01.id.e()));
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderKaraInfoManager", "onFindPreferenceClick find businessManager null");
        }
    }
}
