package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@db5.a(m123858x6ac9171 = 160)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderProfileUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lrd2/c;", "Lm40/p0;", "Lqk/c9;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI */
/* loaded from: classes2.dex */
public final class ActivityC14075x761bf857 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa implements rd2.c, m40.p0, qk.c9 {
    public static final /* synthetic */ int A = 0;

    /* renamed from: u, reason: collision with root package name */
    public yz5.a f191046u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f191047v;

    /* renamed from: y, reason: collision with root package name */
    public boolean f191050y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f191051z;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f191045t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.gj(this));

    /* renamed from: w, reason: collision with root package name */
    public long f191048w = -1;

    /* renamed from: x, reason: collision with root package name */
    public int f191049x = -1;

    @Override // qk.c9
    /* renamed from: N3, reason: from getter */
    public boolean getF191047v() {
        return this.f191047v;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        boolean z17 = false;
        if (getIntent().hasExtra("key_newlife_comment_scene")) {
            return getIntent().getIntExtra("key_newlife_comment_scene", 0);
        }
        java.lang.String stringExtra = getIntent().getStringExtra("finder_username");
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, xy2.c.e(this)) && booleanExtra) {
            z17 = true;
        }
        if (z17 && !c7()) {
            return 33;
        }
        if (z17 && c7()) {
            return 137;
        }
        return ((z17 || c7()) && !z17 && c7()) ? 136 : 32;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    public int Y6() {
        return 3;
    }

    public final boolean c7() {
        return ((java.lang.Boolean) ((jz5.n) this.f191045t).mo141623x754a37bb()).booleanValue();
    }

    public boolean d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0 o0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0) pf5.z.f435481a.a(this).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0.class);
        if (o0Var == null) {
            return false;
        }
        android.view.ViewGroup.LayoutParams layoutParams = o0Var.X6().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior = ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) layoutParams).f92539a;
        return !(behavior instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.Behavior) || ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.Behavior) behavior).y() == 0;
    }

    public final void e7(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileUI", "reportPageEvent isExit:" + z17);
        long longExtra = getIntent().getLongExtra("finder_from_feed_id", 0L);
        int intExtra = getIntent().getIntExtra("key_click_avatar_type", 0);
        boolean booleanExtra = getIntent().getBooleanExtra("key_if_living", false);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut utVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut.class);
        utVar.P6("source_feedid", pm0.v.u(longExtra));
        utVar.O6("click_avatar_type", intExtra);
        utVar.O6("if_living", booleanExtra ? 1 : 0);
        utVar.R6(z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        gx2.q qVar;
        if (m81210x448cda5d()) {
            android.app.Activity m81193x1252e2cf = m81193x1252e2cf();
            if (m81193x1252e2cf != null) {
                pf5.z zVar = pf5.z.f435481a;
                if (!(m81193x1252e2cf instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b c15471x9d199e5b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) m81193x1252e2cf).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b.class);
                if (c15471x9d199e5b != null && (qVar = c15471x9d199e5b.f215154f) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.b(qVar, false, null, false, null, 15, null);
                }
            }
        } else {
            super.finish();
        }
        yz5.a aVar = this.f191046u;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.kd.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4.class, pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.m8.class)), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.d6.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h.class, sr2.l5.class, hy2.f.class, d92.p1.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14917xdd637675.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.xc.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class, pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.v9.class))});
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut) ((zy2.k9) pf5.z.f435481a.a(this).c(zy2.k9.class))).f217710i = true;
        boolean booleanExtra = getIntent().getBooleanExtra("key_is_auto_report", true);
        boolean booleanExtra2 = getIntent().getBooleanExtra("key_is_from_slide", false);
        if (c7() || !booleanExtra || booleanExtra2) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut) ((zy2.k9) pf5.z.f435481a.a(this).c(zy2.k9.class))).f217711m = false;
        }
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        dy1.r ak6 = aVar.ak(this, getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false) ? iy1.c.FinderSelfProfileUI : iy1.c.FinderProfileUI);
        iy1.a aVar2 = iy1.a.Finder;
        cy1.a aVar3 = (cy1.a) ak6;
        aVar3.Rj(this, aVar2);
        aVar3.dk(this, "FinderProfileUI");
        ((cy1.a) aVar3.ik(this, 172, 24184)).Tj(this, 44, 1, false);
        android.content.Intent intent = getIntent();
        java.lang.String valueOf = java.lang.String.valueOf(intent != null ? intent.getStringExtra("key_extra_info") : null);
        if (u46.l.e(valueOf)) {
            valueOf = r30.m.f450479a;
        }
        int d17 = getD();
        int i17 = (d17 == 136 || d17 == 137) ? 1 : 0;
        long longExtra = getIntent().getLongExtra("finder_from_feed_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("finder_from_feed_dup_flag");
        jz5.l[] lVarArr = new jz5.l[8];
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        lVarArr[0] = new jz5.l("behaviour_session_id", Ri);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", b17);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        lVarArr[2] = new jz5.l("finder_tab_context_id", c17 != null ? c17 : "");
        lVarArr[3] = new jz5.l("extra_info", valueOf);
        android.content.Intent intent2 = getIntent();
        lVarArr[4] = new jz5.l("enter_source_info", java.lang.String.valueOf(intent2 != null ? intent2.getStringExtra("key_enter_source_info") : null));
        lVarArr[5] = new jz5.l("page_type", java.lang.Integer.valueOf(i17));
        lVarArr[6] = new jz5.l("comment_scene", java.lang.Integer.valueOf(d17));
        lVarArr[7] = new jz5.l("source_feedid", pm0.v.u(longExtra));
        aVar.gk(this, kz5.c1.k(lVarArr));
        this.f191047v = getIntent().getBooleanExtra("key_enter_dialog", false);
        if (il4.l.f373675a.h(mo55332x76847179())) {
            aVar.Zj(this, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1967x85273e65.f5971x4533e40f);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        java.lang.String m58743x6c03c64c = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class)).m58743x6c03c64c();
        java.lang.String ek6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(longExtra, stringExtra, getIntent().getIntExtra("finder_from_feed_comment_scene", 0));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        cy1.a aVar4 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar4.Mj(this);
        cy1.a aVar5 = (cy1.a) aVar4.ak(this, iy1.c.FinderProfilePage);
        aVar5.Rj(this, aVar2);
        aVar5.dk(this, "finder_profile_page");
        jz5.l[] lVarArr2 = new jz5.l[7];
        lVarArr2[0] = new jz5.l("ref_commentscene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(7)) : null);
        lVarArr2[1] = new jz5.l("finder_context_id", V6 != null ? V6.m75945x2fec8307(1) : null);
        lVarArr2[2] = new jz5.l("finder_tab_context_id", V6 != null ? V6.m75945x2fec8307(2) : null);
        lVarArr2[3] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
        lVarArr2[4] = new jz5.l("finder_username", m58743x6c03c64c);
        lVarArr2[5] = new jz5.l("source_feedid", pm0.v.u(longExtra));
        lVarArr2[6] = new jz5.l("source_feed_sessionbuffer", ek6);
        aVar5.gk(this, kz5.c1.k(lVarArr2));
        aVar5.Tj(this, 12, 1, false);
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_export_username_buffer");
        if (stringExtra2 != null) {
            if (stringExtra2.length() > 0) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).f206746i = new java.util.LinkedList(kz5.b0.c(stringExtra2));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (getIntent().getStringExtra("key_export_username_buffer") != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).f206746i = null;
        }
        vb0.m mVar = (vb0.m) i95.n0.c(vb0.m.class);
        java.lang.String key = java.lang.String.valueOf(hashCode());
        ((i90.a) mVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        yr0.c.f546159a.c(key);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f191051z;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("screenShotEvent");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        r45.gm5 gm5Var;
        if (!m81210x448cda5d()) {
            this.f210344m = true;
        }
        super.onResume();
        final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        this.f191051z = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5694x221c525a>(mo55332x76847179) { // from class: com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI$onResume$1
            {
                this.f39173x3fe91575 = 1609849418;
            }

            /* JADX WARN: Removed duplicated region for block: B:85:0x026a A[LOOP:1: B:85:0x026a->B:98:0x029b, LOOP_START, PHI: r5
  0x026a: PHI (r5v5 int) = (r5v3 int), (r5v6 int) binds: [B:84:0x0268, B:98:0x029b] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5694x221c525a r30) {
                /*
                    Method dump skipped, instructions count: 791
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14076x71d7f6e6.mo1xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f191048w = getIntent().getLongExtra("key_profile_mention_id", -1L);
        this.f191049x = getIntent().getIntExtra("key_profile_mention_create_time", -1);
        int intExtra = getIntent().getIntExtra("key_profile_mention_from_scene", 2);
        long j17 = this.f191048w;
        if (j17 > 0 && !this.f191050y) {
            this.f191050y = true;
            dm.pd d17 = cu2.b0.f303904a.d(j17, this.f191049x, intExtra);
            if (d17 == null) {
                d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a.z(this, 0);
            }
            if (d17 != null && d17.f66129x2262335f == 18) {
                r45.xg2 xg2Var = d17.f66127xca12e5b3;
                if ((xg2Var != null && xg2Var.m75939xb282bd08(0) == 1) && d17.f66127xca12e5b3.m75939xb282bd08(2) == 1 && !((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
                    r45.xg2 xg2Var2 = d17.f66127xca12e5b3;
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (xg2Var2 == null || (gm5Var = (r45.gm5) xg2Var2.m75936x14adae67(3)) == null) ? null : (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) gm5Var.m75936x14adae67(0);
                    if (c19786x6a1e2862 == null) {
                        return;
                    } else {
                        m78513xc2a54588().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.hj(this, c19786x6a1e2862));
                    }
                }
            }
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f191051z;
        if (abstractC20980x9b9ad01d == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("screenShotEvent");
            throw null;
        }
        abstractC20980x9b9ad01d.mo48814x2efc64();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d2 = this.f191051z;
        if (abstractC20980x9b9ad01d2 != null) {
            abstractC20980x9b9ad01d2.mo48813x58998cd();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("screenShotEvent");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209154bb).mo141623x754a37bb()).r()).intValue() == 1) {
            set.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14881xed239a47.class);
        }
        if (m81210x448cda5d()) {
            return;
        }
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ty.class);
    }
}
