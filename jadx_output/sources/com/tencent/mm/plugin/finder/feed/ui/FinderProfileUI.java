package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(160)
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderProfileUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lrd2/c;", "Lm40/p0;", "Lqk/c9;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes2.dex */
public final class FinderProfileUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements rd2.c, m40.p0, qk.c9 {
    public static final /* synthetic */ int A = 0;

    /* renamed from: u, reason: collision with root package name */
    public yz5.a f109513u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f109514v;

    /* renamed from: y, reason: collision with root package name */
    public boolean f109517y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f109518z;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f109512t = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.gj(this));

    /* renamed from: w, reason: collision with root package name */
    public long f109515w = -1;

    /* renamed from: x, reason: collision with root package name */
    public int f109516x = -1;

    @Override // qk.c9
    /* renamed from: N3, reason: from getter */
    public boolean getF109514v() {
        return this.f109514v;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        boolean z17 = false;
        if (getIntent().hasExtra("key_newlife_comment_scene")) {
            return getIntent().getIntExtra("key_newlife_comment_scene", 0);
        }
        java.lang.String stringExtra = getIntent().getStringExtra("finder_username");
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false);
        if (kotlin.jvm.internal.o.b(stringExtra, xy2.c.e(this)) && booleanExtra) {
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

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 3;
    }

    public final boolean c7() {
        return ((java.lang.Boolean) ((jz5.n) this.f109512t).getValue()).booleanValue();
    }

    public boolean d7() {
        com.tencent.mm.plugin.finder.profile.uic.o0 o0Var = (com.tencent.mm.plugin.finder.profile.uic.o0) pf5.z.f353948a.a(this).e(com.tencent.mm.plugin.finder.profile.uic.o0.class);
        if (o0Var == null) {
            return false;
        }
        android.view.ViewGroup.LayoutParams layoutParams = o0Var.X6().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.c) layoutParams).f11006a;
        return !(behavior instanceof com.google.android.material.appbar.AppBarLayout.Behavior) || ((com.google.android.material.appbar.AppBarLayout.Behavior) behavior).y() == 0;
    }

    public final void e7(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderProfileUI", "reportPageEvent isExit:" + z17);
        long longExtra = getIntent().getLongExtra("finder_from_feed_id", 0L);
        int intExtra = getIntent().getIntExtra("key_click_avatar_type", 0);
        boolean booleanExtra = getIntent().getBooleanExtra("key_if_living", false);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ut utVar = (com.tencent.mm.plugin.finder.viewmodel.component.ut) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class);
        utVar.P6("source_feedid", pm0.v.u(longExtra));
        utVar.O6("click_avatar_type", intExtra);
        utVar.O6("if_living", booleanExtra ? 1 : 0);
        utVar.R6(z17);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        gx2.q qVar;
        if (isFragmentMode()) {
            android.app.Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                pf5.z zVar = pf5.z.f353948a;
                if (!(parentActivity instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) parentActivity).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC.class);
                if (finderProfileDrawerUIC != null && (qVar = finderProfileDrawerUIC.f133621f) != null) {
                    com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(qVar, false, null, false, null, 15, null);
                }
            }
        } else {
            super.finish();
        }
        yz5.a aVar = this.f109513u;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class, com.tencent.mm.plugin.finder.profile.uic.kd.class, com.tencent.mm.plugin.finder.profile.uic.o0.class, com.tencent.mm.plugin.finder.profile.uic.ob.class, com.tencent.mm.plugin.finder.profile.uic.f4.class, pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.m8.class)), com.tencent.mm.plugin.finder.profile.uic.d6.class, com.tencent.mm.plugin.finder.viewmodel.component.h.class, sr2.l5.class, hy2.f.class, d92.p1.class, com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC.class, com.tencent.mm.plugin.finder.profile.uic.xc.class, com.tencent.mm.plugin.finder.profile.uic.p2.class, pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.v9.class))});
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((com.tencent.mm.plugin.finder.viewmodel.component.ut) ((zy2.k9) pf5.z.f353948a.a(this).c(zy2.k9.class))).f136177i = true;
        boolean booleanExtra = getIntent().getBooleanExtra("key_is_auto_report", true);
        boolean booleanExtra2 = getIntent().getBooleanExtra("key_is_from_slide", false);
        if (c7() || !booleanExtra || booleanExtra2) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.ut) ((zy2.k9) pf5.z.f353948a.a(this).c(zy2.k9.class))).f136178m = false;
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
            valueOf = r30.m.f368946a;
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
        this.f109514v = getIntent().getBooleanExtra("key_enter_dialog", false);
        if (il4.l.f292142a.h(getContext())) {
            aVar.Zj(this, com.google.android.gms.common.moduleinstall.ModuleInstallStatusCodes.NOT_ALLOWED_MODULE);
        }
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String username = ((com.tencent.mm.plugin.finder.profile.uic.p2) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).getUsername();
        java.lang.String ek6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(longExtra, stringExtra, getIntent().getIntExtra("finder_from_feed_comment_scene", 0));
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        cy1.a aVar4 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar4.Mj(this);
        cy1.a aVar5 = (cy1.a) aVar4.ak(this, iy1.c.FinderProfilePage);
        aVar5.Rj(this, aVar2);
        aVar5.dk(this, "finder_profile_page");
        jz5.l[] lVarArr2 = new jz5.l[7];
        lVarArr2[0] = new jz5.l("ref_commentscene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(7)) : null);
        lVarArr2[1] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
        lVarArr2[2] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
        lVarArr2[3] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
        lVarArr2[4] = new jz5.l("finder_username", username);
        lVarArr2[5] = new jz5.l("source_feedid", pm0.v.u(longExtra));
        lVarArr2[6] = new jz5.l("source_feed_sessionbuffer", ek6);
        aVar5.gk(this, kz5.c1.k(lVarArr2));
        aVar5.Tj(this, 12, 1, false);
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_export_username_buffer");
        if (stringExtra2 != null) {
            if (stringExtra2.length() > 0) {
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).f125213i = new java.util.LinkedList(kz5.b0.c(stringExtra2));
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (getIntent().getStringExtra("key_export_username_buffer") != null) {
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).f125213i = null;
        }
        vb0.m mVar = (vb0.m) i95.n0.c(vb0.m.class);
        java.lang.String key = java.lang.String.valueOf(hashCode());
        ((i90.a) mVar).getClass();
        kotlin.jvm.internal.o.g(key, "key");
        yr0.c.f464626a.c(key);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.sdk.event.IListener iListener = this.f109518z;
        if (iListener != null) {
            iListener.dead();
        } else {
            kotlin.jvm.internal.o.o("screenShotEvent");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        r45.gm5 gm5Var;
        if (!isFragmentMode()) {
            this.f128811m = true;
        }
        super.onResume();
        final androidx.appcompat.app.AppCompatActivity context = getContext();
        this.f109518z = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MMFinderUIScreenShotEvent>(context) { // from class: com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI$onResume$1
            {
                this.__eventId = 1609849418;
            }

            /* JADX WARN: Removed duplicated region for block: B:85:0x026a A[LOOP:1: B:85:0x026a->B:98:0x029b, LOOP_START, PHI: r5
  0x026a: PHI (r5v5 int) = (r5v3 int), (r5v6 int) binds: [B:84:0x0268, B:98:0x029b] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.MMFinderUIScreenShotEvent r30) {
                /*
                    Method dump skipped, instructions count: 791
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI$onResume$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f109515w = getIntent().getLongExtra("key_profile_mention_id", -1L);
        this.f109516x = getIntent().getIntExtra("key_profile_mention_create_time", -1);
        int intExtra = getIntent().getIntExtra("key_profile_mention_from_scene", 2);
        long j17 = this.f109515w;
        if (j17 > 0 && !this.f109517y) {
            this.f109517y = true;
            dm.pd d17 = cu2.b0.f222371a.d(j17, this.f109516x, intExtra);
            if (d17 == null) {
                d17 = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a.z(this, 0);
            }
            if (d17 != null && d17.field_type == 18) {
                r45.xg2 xg2Var = d17.field_thankInfo;
                if ((xg2Var != null && xg2Var.getInteger(0) == 1) && d17.field_thankInfo.getInteger(2) == 1 && !((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
                    r45.xg2 xg2Var2 = d17.field_thankInfo;
                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (xg2Var2 == null || (gm5Var = (r45.gm5) xg2Var2.getCustom(3)) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderJumpInfo) gm5Var.getCustom(0);
                    if (finderJumpInfo == null) {
                        return;
                    } else {
                        getContentView().post(new com.tencent.mm.plugin.finder.feed.ui.hj(this, finderJumpInfo));
                    }
                }
            }
        }
        com.tencent.mm.sdk.event.IListener iListener = this.f109518z;
        if (iListener == null) {
            kotlin.jvm.internal.o.o("screenShotEvent");
            throw null;
        }
        iListener.dead();
        com.tencent.mm.sdk.event.IListener iListener2 = this.f109518z;
        if (iListener2 != null) {
            iListener2.alive();
        } else {
            kotlin.jvm.internal.o.o("screenShotEvent");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127621bb).getValue()).r()).intValue() == 1) {
            set.add(com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC.class);
        }
        if (isFragmentMode()) {
            return;
        }
        set.add(com.tencent.mm.plugin.finder.viewmodel.component.ty.class);
    }
}
