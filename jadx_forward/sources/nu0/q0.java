package nu0;

/* loaded from: classes5.dex */
public final class q0 extends nu0.e {

    /* renamed from: o, reason: collision with root package name */
    public final oz5.l f421605o;

    /* renamed from: p, reason: collision with root package name */
    public final oz5.l f421606p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f421607q;

    /* renamed from: r, reason: collision with root package name */
    public volatile com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 f421608r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f421609s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f421610t;

    /* renamed from: u, reason: collision with root package name */
    public nu0.v f421611u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
        this.f421605o = ((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p0Var.J(1));
        this.f421606p = ((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p0Var.J(1));
        this.f421607q = new java.util.LinkedHashMap();
        this.f421609s = jz5.h.b(nu0.g0.f421473d);
        this.f421610t = new java.util.ArrayList();
    }

    public static final void W6(nu0.q0 q0Var) {
        q0Var.getClass();
        nf.e.f(new nu0.y(q0Var));
    }

    public static /* synthetic */ void Y6(nu0.q0 q0Var, boolean z17, com.p314xaae8f345.p457x3304c6.p469xb845a2f1.h hVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 2) != 0) {
            hVar = null;
        }
        q0Var.X6(z17, hVar);
    }

    public final void X6(boolean z17, com.p314xaae8f345.p457x3304c6.p469xb845a2f1.h hVar) {
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8;
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e[] m33150x5a8a256c;
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e[] m33150x5a8a256c2;
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef82 = this.f421608r;
        if (c4063x855a1ef82 != null) {
            c4063x855a1ef82.b(hVar);
        }
        int a76 = a7();
        if (z17) {
            com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef83 = this.f421608r;
            boolean z18 = false;
            int length = (c4063x855a1ef83 == null || (m33150x5a8a256c2 = c4063x855a1ef83.m33150x5a8a256c()) == null) ? 0 : m33150x5a8a256c2.length;
            if (a76 >= 0 && a76 < length) {
                z18 = true;
            }
            com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e c4060x7aac656e = (!z18 || (c4063x855a1ef8 = this.f421608r) == null || (m33150x5a8a256c = c4063x855a1ef8.m33150x5a8a256c()) == null) ? null : m33150x5a8a256c[a76];
            if (c4060x7aac656e != null) {
                g7(a76, c4060x7aac656e, new nu0.p0(a76, this));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageControlUIC", "[commitUpdate] index:" + a76);
    }

    public final com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e Z6() {
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8 = this.f421608r;
        if (c4063x855a1ef8 != null) {
            return c4063x855a1ef8.c();
        }
        return null;
    }

    public final int a7() {
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e[] m33150x5a8a256c;
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8 = this.f421608r;
        if (c4063x855a1ef8 == null || (m33150x5a8a256c = c4063x855a1ef8.m33150x5a8a256c()) == null) {
            return 0;
        }
        int length = m33150x5a8a256c.length;
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String m33110xafec6a71 = m33150x5a8a256c[i17].m33110xafec6a71();
            com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e Z6 = Z6();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m33110xafec6a71, Z6 != null ? Z6.m33110xafec6a71() : null)) {
                return i17;
            }
        }
        return -1;
    }

    public final com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233 b7(java.lang.String str) {
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e Z6;
        if (str == null || (Z6 = Z6()) == null) {
            return null;
        }
        return Z6.d(str);
    }

    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c7() {
        i95.m c17 = i95.n0.c(m40.k0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        float l27 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.l2();
        i95.m c18 = i95.n0.c(m40.k0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        return new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(l27, r1.k2());
    }

    /* renamed from: clear */
    public final void m149976x5a5b64d() {
        ((java.util.LinkedHashMap) this.f421607q).clear();
    }

    public final java.lang.String d7(int i17) {
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e c4060x7aac656e;
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8 = this.f421608r;
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e[] m33150x5a8a256c = c4063x855a1ef8 != null ? c4063x855a1ef8.m33150x5a8a256c() : null;
        if (m33150x5a8a256c != null && i17 >= 0 && i17 < m33150x5a8a256c.length && (c4060x7aac656e = m33150x5a8a256c[i17]) != null) {
            return c4060x7aac656e.m33110xafec6a71();
        }
        return null;
    }

    public final long e7() {
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e Z6 = Z6();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a InvalidTime = Z6 != null ? Z6.m33100xbf7b40c2() : null;
        if (InvalidTime == null) {
            InvalidTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(InvalidTime, "InvalidTime");
        }
        if (!InvalidTime.m33983x7b953cf2()) {
            com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e Z62 = Z6();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33108x877d1ff = Z62 != null ? Z62.m33108x877d1ff() : null;
            if (m33108x877d1ff == null) {
                InvalidTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(InvalidTime, "InvalidTime");
            } else {
                InvalidTime = m33108x877d1ff;
            }
        }
        return !InvalidTime.m33983x7b953cf2() ? java.lang.System.currentTimeMillis() : (long) InvalidTime.m33987xd22e7c2d();
    }

    public final boolean f7(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e Z6 = Z6();
        boolean e17 = Z6 != null ? Z6.e(str) : false;
        Y6(this, false, null, 3, null);
        return e17;
    }

    public final void g7(int i17, com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e c4060x7aac656e, yz5.l lVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageControlUIC", "[saveSnapshot] start index:" + i17);
        c4060x7aac656e.f((java.lang.String) ((jz5.n) this.f421609s).mo141623x754a37bb(), com.p314xaae8f345.p457x3304c6.p469xb845a2f1.c.PNG, new nu0.f0(i17, lVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h7(android.view.SurfaceView r7, java.util.List r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof nu0.j0
            if (r0 == 0) goto L13
            r0 = r9
            nu0.j0 r0 = (nu0.j0) r0
            int r1 = r0.f421515i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f421515i = r1
            goto L18
        L13:
            nu0.j0 r0 = new nu0.j0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f421513g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f421515i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L6d
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.f421512f
            r8 = r7
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = r0.f421511e
            android.view.SurfaceView r7 = (android.view.SurfaceView) r7
            java.lang.Object r2 = r0.f421510d
            nu0.q0 r2 = (nu0.q0) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L56
        L43:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            r0.f421510d = r6
            r0.f421511e = r7
            r0.f421512f = r8
            r0.f421515i = r4
            java.lang.Object r9 = r6.O6(r0)
            if (r9 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            oz5.l r9 = r2.f421605o
            nu0.n0 r4 = new nu0.n0
            r5 = 0
            r4.<init>(r2, r7, r8, r5)
            r0.f421510d = r5
            r0.f421511e = r5
            r0.f421512f = r5
            r0.f421515i = r3
            java.lang.Object r7 = p3325xe03a0797.p3326xc267989b.l.g(r9, r4, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nu0.q0.h7(android.view.SurfaceView, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.vfs.w6.f((java.lang.String) ((jz5.n) this.f421609s).mo141623x754a37bb());
    }
}
