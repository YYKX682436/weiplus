package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

@j95.b
/* loaded from: classes10.dex */
public final class s1 extends i95.w implements zy2.e6 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f207729d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.q1.f207711d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f207730e = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.r1.f207720d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f207731f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.b1.f207540d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f207732g = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.g1.f207587d);

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f207733h = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f207734i = new java.util.concurrent.ConcurrentHashMap();

    public static boolean pj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1 s1Var, zy2.dc dcVar, boolean z17, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            j17 = -1;
        }
        s1Var.getClass();
        long j18 = dcVar != null ? ((ya2.b2) dcVar).f69344xa783a79b : 0L;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j18;
        if (j17 == -1) {
            j17 = !z17 ? 86400000L : u04.d.f505010c;
        }
        boolean z18 = currentTimeMillis >= j17;
        if (z18) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[isContactExpired] current=");
            long j19 = 1000;
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v(java.lang.System.currentTimeMillis() / j19));
            sb6.append(" time=");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v(j18 / j19));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContactService", sb6.toString());
        }
        return z18;
    }

    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc Ai(zy2.dc dcVar) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc e17;
        boolean z17 = dcVar instanceof ya2.b2;
        ya2.b2 b2Var = z17 ? (ya2.b2) dcVar : null;
        r45.xk b17 = b2Var != null ? ya2.d.b(b2Var, false) : null;
        if (b17 != null && (e17 = ya2.d.e(b17)) != null) {
            return e17;
        }
        ya2.b2 b2Var2 = z17 ? (ya2.b2) dcVar : null;
        if (b2Var2 != null) {
            return b2Var2.f69300x731cac1b;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0102, code lost:
    
        if ((r1.m176700xe5e0d2a0().length() == 0) == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Bi(java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1.Bi(java.lang.String, boolean):void");
    }

    public void Di(java.lang.String str, int i17, long j17, boolean z17, int i18, int i19, int i27, java.lang.String str2) {
        if (str != null) {
            nv2.d0 d0Var = nv2.d0.f422003e;
            nv2.d0 d0Var2 = nv2.d0.f422003e;
            r45.qt2 qt2Var = new r45.qt2();
            qt2Var.set(7, java.lang.Integer.valueOf(i18));
            qt2Var.set(11, str2);
            qt2Var.set(5, java.lang.Integer.valueOf(i27));
            nv2.d0.b(d0Var2, str, i17, j17, null, qt2Var, z17, 0, null, null, java.lang.Integer.valueOf(i19), null, null, 0, null, null, null, 64960, null);
        }
    }

    public void Ni(java.lang.String str, int i17, java.lang.Long l17, boolean z17, int i18, int i19) {
        Di(str, i17, l17.longValue(), z17, i18, i19, 0, null);
    }

    public void Ri(java.lang.String username, final zy2.c6 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        aj(kz5.n0.V0(kz5.b0.c(username)), new zy2.d6() { // from class: com.tencent.mm.plugin.finder.service.FinderContactService$getFinderContact$2
            @Override // zy2.d6
            /* renamed from: onDone */
            public final void mo58967xc3989e01(java.util.List<zy2.dc> list) {
                zy2.c6 c6Var = zy2.c6.this;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
                c6Var.a((zy2.dc) kz5.n0.Z(list));
            }
        }, 0, -1L);
    }

    public void Ui(java.lang.String str, final zy2.c6 callback, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (str != null) {
            aj(kz5.n0.V0(kz5.b0.c(str)), new zy2.d6() { // from class: com.tencent.mm.plugin.finder.service.FinderContactService$getFinderContact$3$1
                @Override // zy2.d6
                /* renamed from: onDone */
                public final void mo58967xc3989e01(java.util.List<zy2.dc> list) {
                    zy2.c6 c6Var = zy2.c6.this;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
                    c6Var.a((zy2.dc) kz5.n0.Z(list));
                }
            }, i17, -1L);
        }
    }

    public void Vi(java.util.List usernameList, long j17, zy2.d6 d6Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernameList, "usernameList");
        if (d6Var == null) {
            d6Var = new zy2.d6() { // from class: com.tencent.mm.plugin.finder.service.FinderContactService$getFinderContact$1
                @Override // zy2.d6
                /* renamed from: onDone */
                public final void mo58967xc3989e01(java.util.List<zy2.dc> list) {
                }
            };
        }
        aj(usernameList, d6Var, 0, j17);
    }

    public final eb2.p Zi() {
        return (eb2.p) ((jz5.n) this.f207732g).mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aj(final java.util.List r22, final zy2.d6 r23, int r24, long r25) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1.aj(java.util.List, zy2.d6, int, long):void");
    }

    public void bj(java.lang.String str, zy2.c6 c6Var, long j17, java.lang.String favId, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favId, "favId");
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ContactService", "username is null.");
            if (c6Var != null) {
                c6Var.a(new ya2.b2());
                return;
            }
            return;
        }
        ya2.b2 y07 = nj().y0(str);
        if (y07 != null) {
            if (!(y07.w0().length() == 0) && !pj(this, y07, false, 0L, 6, null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContactService", "[getWxMsgContact] local completed! result=" + y07.D0() + '=' + y07.w0());
                if (c6Var != null) {
                    c6Var.a(y07);
                }
                return;
            }
        }
        if (!qj(y07) || pj(this, y07, false, 0L, 6, null)) {
            eb2.p Zi = Zi();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m1 m1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m1(c6Var);
            r45.gz0 gz0Var = new r45.gz0();
            gz0Var.set(0, java.lang.Long.valueOf(j17));
            gz0Var.set(4, favId);
            gz0Var.set(1, java.lang.Long.valueOf(j18));
            Zi.b("", m1Var, 8, str, gz0Var);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getWxMsgContact] isContactRetryLimited contact=");
        sb6.append(y07 != null ? y07.D0() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ContactService", sb6.toString());
        if (c6Var != null) {
            if (y07 == null) {
                y07 = new ya2.b2(str);
            }
            c6Var.a(y07);
        }
    }

    public void cj(java.lang.String str, java.lang.String str2, zy2.c6 c6Var) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ContactService", "username is null.");
            if (c6Var != null) {
                c6Var.a(new ya2.b2());
                return;
            }
            return;
        }
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ContactService", "sessionId is null.");
            if (c6Var != null) {
                c6Var.a(new ya2.b2());
                return;
            }
            return;
        }
        ya2.b2 y07 = nj().y0(str);
        if (y07 != null) {
            if (!(y07.w0().length() == 0) && !pj(this, y07, false, 0L, 6, null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContactService", "[getFinderMsgStrangerContact] local completed! result=" + y07.D0() + '=' + y07.w0());
                if (c6Var != null) {
                    c6Var.a(y07);
                    return;
                }
                return;
            }
        }
        if (!qj(y07) || pj(this, y07, false, 0L, 6, null)) {
            eb2.p Zi = Zi();
            r45.lz0 lz0Var = new r45.lz0();
            lz0Var.set(0, str);
            lz0Var.set(1, str2);
            Zi.c(lz0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.o1(c6Var));
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getFinderContact] isContactRetryLimited contact=");
        sb6.append(y07 != null ? y07.D0() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ContactService", sb6.toString());
        if (c6Var != null) {
            if (y07 == null) {
                y07 = new ya2.b2(str);
            }
            c6Var.a(y07);
        }
    }

    public zy2.dc fj(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(str)) {
            return hj(str);
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.U3(str)) {
            return mj(str);
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.T3(str)) {
            return ij(str);
        }
        return null;
    }

    public zy2.dc hj(java.lang.String str) {
        if (str != null) {
            return ya2.h.f542017a.b(str);
        }
        return null;
    }

    public zy2.dc ij(java.lang.String str) {
        jz5.f0 f0Var = null;
        if (str == null) {
            return null;
        }
        ya2.b2 y07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ma0) ((jz5.n) this.f207731f).mo141623x754a37bb()).y0(str);
        if (y07 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContactService", "[getLocalFinderMsgAliasContact] " + y07.D0() + '=' + y07.w0());
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContactService", "[getLocalFinderMsgAliasContact] get contact return null. ".concat(str));
        }
        return y07;
    }

    public zy2.dc mj(java.lang.String str) {
        jz5.f0 f0Var = null;
        if (str == null) {
            return null;
        }
        ya2.b2 y07 = nj().y0(str);
        if (y07 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContactService", "[getLocalFinderStrangerContact] " + y07.D0() + '=' + y07.w0());
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContactService", "[getLocalFinderStrangerContact] get contact return null. ".concat(str));
        }
        return y07;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.na0 nj() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.na0) ((jz5.n) this.f207730e).mo141623x754a37bb();
    }

    public void oj(zy2.dc contact) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        java.lang.String D0 = ((ya2.b2) contact).D0();
        if (!(D0.length() > 0)) {
            D0 = null;
        }
        if (D0 != null) {
            if (!(contact instanceof ya2.b2)) {
                contact = null;
            }
            if (contact != null) {
                ya2.b2 b2Var = (ya2.b2) contact;
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(D0)) {
                    ya2.h.f542017a.k(b2Var);
                    return;
                }
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.U3(D0)) {
                    nj().J0(b2Var, true);
                } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.T3(D0)) {
                    zy2.x8.r((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ma0) ((jz5.n) this.f207731f).mo141623x754a37bb(), b2Var, false, 2, null);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContactService", "[insertOrUpdateContact] illegel contact");
                }
            }
        }
    }

    public final boolean qj(zy2.dc dcVar) {
        return (dcVar != null ? ((ya2.b2) dcVar).f69338x73c8dbac : 0) >= 3;
    }

    public void rj(l75.q0 q0Var) {
        if (q0Var != null) {
            ((c61.l7) i95.n0.c(c61.l7.class)).Jj().mo49775xc84af884(q0Var);
            ((c61.l7) i95.n0.c(c61.l7.class)).ik().mo49775xc84af884(q0Var);
            ((c61.l7) i95.n0.c(c61.l7.class)).hk().mo49775xc84af884(q0Var);
        }
    }

    public void wi(l75.q0 q0Var) {
        if (q0Var != null) {
            ((c61.l7) i95.n0.c(c61.l7.class)).Jj().add(q0Var);
            ((c61.l7) i95.n0.c(c61.l7.class)).ik().add(q0Var);
            ((c61.l7) i95.n0.c(c61.l7.class)).hk().add(q0Var);
        }
    }
}
