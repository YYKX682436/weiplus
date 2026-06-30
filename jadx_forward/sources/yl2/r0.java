package yl2;

/* loaded from: classes3.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f544597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f544598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f544599f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yl2.g1 g1Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f544597d = hVar;
        this.f544598e = h0Var;
        this.f544599f = g1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yl2.r0(this.f544597d, interfaceC29045xdcb5ca57, this.f544598e, this.f544599f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yl2.r0 r0Var = (yl2.r0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        r0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean m75933x41a8a7f2;
        java.lang.String m75945x2fec8307;
        r45.t62 t62Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.j01 j01Var = (r45.j01) ((xg2.i) this.f544597d).f535926b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelper", "result success");
        java.lang.String str = "";
        this.f544598e.f391656d = new yl2.k(0, "", j01Var);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = j01Var.R;
        if (linkedList2 != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                java.util.LinkedList m75941xfb821914 = ((r45.j32) it.next()).m75941xfb821914(0);
                if (m75941xfb821914 != null) {
                    if (!(!m75941xfb821914.isEmpty())) {
                        m75941xfb821914 = null;
                    }
                    if (m75941xfb821914 != null) {
                        linkedList.addAll(m75941xfb821914);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ACCOUNT_LIVE_RECOMMEND_SWITCH_SETTING_BOOLEAN_SYNC;
        r45.ud2 ud2Var = j01Var.E;
        c17.x(u3Var, java.lang.Boolean.valueOf(ud2Var != null ? ud2Var.m75933x41a8a7f2(0) : false));
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ACCOUNT_LIVE_RECOMMEND_CONFIG_STRING_SYNC;
        r45.ud2 ud2Var2 = j01Var.E;
        java.lang.String l17 = (ud2Var2 == null || (t62Var = (r45.t62) ud2Var2.m75936x14adae67(1)) == null) ? null : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(t62Var.mo14344x5f01b1f6());
        if (l17 == null) {
            l17 = "";
        }
        c18.x(u3Var2, l17);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c19 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var3 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ACCOUNT_LIVE_HAS_SING_SONG_ABILITY_SETTING_BOOLEAN_SYNC;
        r45.dc6 dc6Var = j01Var.F;
        c19.x(u3Var3, java.lang.Boolean.valueOf(dc6Var != null ? dc6Var.m75933x41a8a7f2(2) : false));
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c27 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var4 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ACCOUNT_LIVE_TEST_LIVE_GUIDE_LIMIT_INT_SYNC;
        r45.v25 v25Var = j01Var.K;
        c27.x(u3Var4, new java.lang.Integer(v25Var != null ? v25Var.m75939xb282bd08(5) : 0));
        r45.bw4 bw4Var = j01Var.L1;
        if (bw4Var != null) {
            m75933x41a8a7f2 = bw4Var.m75933x41a8a7f2(1);
        } else {
            r45.dc6 dc6Var2 = j01Var.F;
            m75933x41a8a7f2 = dc6Var2 != null ? dc6Var2.m75933x41a8a7f2(3) : false;
        }
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189466d;
        list.clear();
        list.addAll(linkedList);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c28 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var5 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HELP_AND_FEEDBACK_ENTRY_URL_STRING_SYNC;
        r45.jq1 jq1Var = j01Var.H;
        if (jq1Var != null && (m75945x2fec8307 = jq1Var.m75945x2fec8307(1)) != null) {
            str = m75945x2fec8307;
        }
        c28.x(u3Var5, str);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c29 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var6 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HELP_AND_FEEDBACK_ENTRY_ENABLED_BOOLEAN_SYNC;
        r45.jq1 jq1Var2 = j01Var.H;
        c29.x(u3Var6, java.lang.Boolean.valueOf(jq1Var2 != null ? jq1Var2.m75933x41a8a7f2(0) : false));
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c37 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var7 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SENSITIVE_WORDS_LIMIT_INT;
        r45.v25 v25Var2 = j01Var.K;
        c37.x(u3Var7, new java.lang.Integer(v25Var2 != null ? v25Var2.m75939xb282bd08(0) : 500));
        if (m75933x41a8a7f2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelper", "prepareLive: isNewVersionSongList=true, handling song list...");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelper", "prepareLive: clearing singing song...");
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new yl2.t0(this.f544599f, null), 2, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelper", "prepareLive: isNewVersionSongList=false, skip clearing singing song");
        }
        return jz5.f0.f384359a;
    }
}
