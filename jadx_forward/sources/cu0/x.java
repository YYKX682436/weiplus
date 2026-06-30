package cu0;

/* loaded from: classes5.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f303884a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f303885b;

    /* renamed from: c, reason: collision with root package name */
    public volatile ev0.t f303886c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f303887d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f303888e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f303889f;

    /* renamed from: g, reason: collision with root package name */
    public int f303890g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f303891h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f303892i;

    /* renamed from: j, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f303893j;

    /* renamed from: k, reason: collision with root package name */
    public yz5.q f303894k;

    /* renamed from: l, reason: collision with root package name */
    public yz5.l f303895l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f303896m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f303897n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f303898o;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, android.content.Context context, yz5.l ignoreBackgroundTouchEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
        this.f303884a = context;
        this.f303885b = jz5.h.b(new cu0.o(this, ignoreBackgroundTouchEvent));
        this.f303886c = new ev0.t();
        this.f303891h = jz5.h.b(cu0.p.f303863d);
        this.f303892i = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        this.f303893j = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        this.f303898o = true;
        if (c16993xacc19624 != null) {
            java.lang.String string = c16993xacc19624.M.getString("post_id");
            i().putString("post_id", string);
            i().putString("KEY_EDIT_ID", string);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd = c16993xacc19624.I;
            if (c16995x8ab634cd != null) {
                i().putString("FINDER_CONTEXT_ID", c16995x8ab634cd.f237230n);
                i().putString("key_click_tab_context_id", c16995x8ab634cd.f237231o);
                i().putInt("key_from_comment_scene", c16995x8ab634cd.f237226g);
                i().putLong("key_ref_feed_id", c16995x8ab634cd.f237227h);
                i().putString("key_ref_feed_dup_flag", c16995x8ab634cd.f237228i);
                i().putInt("key_ref_comment_scene", c16995x8ab634cd.f237233q);
                i().putInt("key_ref_enter_scene", c16995x8ab634cd.f237229m);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "[initReportBundle] postId:" + string + " finderContextId=" + c16995x8ab634cd.f237230n + " finderTabContextId:" + c16995x8ab634cd.f237231o + " commentScene:" + c16995x8ab634cd.f237226g + " feedId:" + c16995x8ab634cd.f237227h + " enterScene:" + c16995x8ab634cd.f237229m);
            }
        }
        g().f304109i = new cu0.d(this);
        g().mo68194x6c4ebec7(new cu0.f(this, i(), h()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14 e17 = g().e();
        e17.m68328x197106dd(cu0.g.f303848d);
        e17.m68330xec0deb04(new cu0.h(this));
        e17.m68329x62489705(new cu0.i(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(cu0.x r5, yz5.a r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof cu0.q
            if (r0 == 0) goto L16
            r0 = r7
            cu0.q r0 = (cu0.q) r0
            int r1 = r0.f303866f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f303866f = r1
            goto L1b
        L16:
            cu0.q r0 = new cu0.q
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f303864d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f303866f
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L48
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            kotlinx.coroutines.p0 r7 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r7 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            cu0.s r2 = new cu0.s
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f303866f = r3
            java.lang.Object r7 = p3325xe03a0797.p3326xc267989b.l.g(r7, r2, r0)
            if (r7 != r1) goto L48
            goto L4e
        L48:
            java.lang.String r5 = "withContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r5)
            r1 = r7
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cu0.x.a(cu0.x, yz5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(yz5.a provideInitVolumes, yz5.l lVar, yz5.l lVar2, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provideInitVolumes, "provideInitVolumes");
        cu0.j jVar = lVar != null ? new cu0.j(this, i17, lVar) : null;
        cu0.k kVar = new cu0.k(provideInitVolumes, lVar, this, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0 e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0) g().e().b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0.class);
        if (e0Var != null) {
            e0Var.A = kVar;
            e0Var.B = jVar;
            e0Var.C = lVar2;
            e0Var.D = i17;
        }
    }

    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        return false;
    }

    public abstract cu0.y d(yz5.l lVar);

    public final void e() {
        pv3.n nVar = pv3.n.f440152a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i0 scene = h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicPlayFirstFrameEventManager", "removeEvent " + scene);
        pv3.n.f440153b.remove(scene);
        ev0.t tVar = this.f303886c;
        p3325xe03a0797.p3326xc267989b.l.d(tVar.f338411a, null, null, new ev0.s(tVar, null), 3, null);
        g().mo68177x5cd39ffa();
    }

    public final int f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad abstractC17080x95c906ad;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.h0 h0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.h0) g().e().b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.h0.class);
        if (h0Var == null || (abstractC17080x95c906ad = h0Var.f237772p) == null) {
            return 0;
        }
        return abstractC17080x95c906ad.n0();
    }

    public final cu0.y g() {
        return (cu0.y) this.f303885b.mo141623x754a37bb();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i0 h() {
        return g().e().mo46999xaf14c3df();
    }

    public final android.os.Bundle i() {
        return (android.os.Bundle) this.f303891h.mo141623x754a37bb();
    }

    public abstract java.lang.String j();

    public void k() {
        if (l()) {
            return;
        }
        ev0.t tVar = this.f303886c;
        p3325xe03a0797.p3326xc267989b.l.d(tVar.f338411a, null, null, new ev0.r(this.f303888e, this.f303896m, tVar, null, null), 3, null);
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        if (this.f303888e != null) {
            i95.m c17 = i95.n0.c(m40.k0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            m40.k0 k0Var = (m40.k0) c17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = this.f303888e;
            if (!((c61.p7) k0Var).ij(c16997xb0aa383a != null ? c16997xb0aa383a.f237248i : null)) {
                return true;
            }
        }
        return false;
    }

    public void n(boolean z17, java.util.List lyricsInfos) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyricsInfos, "lyricsInfos");
    }
}
