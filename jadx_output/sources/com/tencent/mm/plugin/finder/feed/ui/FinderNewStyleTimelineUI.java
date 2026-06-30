package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderNewStyleTimelineUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes2.dex */
public final class FinderNewStyleTimelineUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f109473t = "FinderNewStyleTimelineUI";

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f109474u = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.dh(this));

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderLikeDrawer f109475v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f109476w;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 162;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 6;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMFragmentActivity
    public boolean enableActivityAnimation() {
        return false;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.po.class, w03.n.class, com.tencent.mm.plugin.finder.viewmodel.component.pt.class, com.tencent.mm.plugin.finder.viewmodel.component.u6.class, com.tencent.mm.plugin.finder.viewmodel.component.v6.class, com.tencent.mm.plugin.finder.viewmodel.component.di.class, com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class, pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.w9.class)), pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.v5.class)), com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class, com.tencent.mm.plugin.finder.viewmodel.component.sx.class, com.tencent.mm.plugin.finder.viewmodel.component.gg.class, com.tencent.mm.plugin.finder.viewmodel.component.f2.class, com.tencent.mm.plugin.finder.viewmodel.component.fy.class, pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.b7.class)), pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.f7.class)), hy2.f.class});
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mars.xlog.Log.i(this.f109473t, "onBackPressed!");
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = this.f109475v;
        if (finderLikeDrawer != null) {
            if (finderLikeDrawer == null) {
                kotlin.jvm.internal.o.o("friendLikeDrawer");
                throw null;
            }
            if (finderLikeDrawer.q()) {
                com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer2 = this.f109475v;
                if (finderLikeDrawer2 != null) {
                    finderLikeDrawer2.u();
                    return;
                } else {
                    kotlin.jvm.internal.o.o("friendLikeDrawer");
                    throw null;
                }
            }
        }
        super.onBackPressed();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.mController.G0(getResources().getColor(com.tencent.mm.R.color.f478712f3));
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        jz5.g gVar = this.f109474u;
        ((vb2.m) ((jz5.n) gVar).getValue()).f434671g.setVisibility(0);
        ((vb2.m) ((jz5.n) gVar).getValue()).f434671g.setBackground(null);
        ((vb2.m) ((jz5.n) gVar).getValue()).f434666b.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.eh(this));
        ((w03.n) pf5.z.f353948a.a(this).a(w03.n.class)).P6("PlayerDetail", hashCode());
        this.f109475v = com.tencent.mm.plugin.finder.view.vc.a(com.tencent.mm.plugin.finder.view.FinderLikeDrawer.D, this, getWindow(), 1, false, false, 24, null);
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderNewStyleTimelineUI);
        aVar.Rj(this, iy1.a.Finder);
        aVar.ik(this, be1.r0.CTRL_INDEX, 24184);
        if (getIntent().getBooleanExtra("key_from_topstory", false)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setCgiPolicyFinder for topstory, contextId:");
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            sb6.append(b52.b.b());
            sb6.append('!');
            com.tencent.mars.xlog.Log.i("FinderNewStyleTimelineUI", sb6.toString());
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(this, 12, 1, true);
            android.os.SystemClock.elapsedRealtime();
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new com.tencent.mm.plugin.finder.feed.ui.fh(this));
        this.f109476w = getIntent().getBooleanExtra("key_autoFloatBallWhenBack", false);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        int i18 = getContext().getResources().getConfiguration().orientation;
        if (i17 == 4 && i18 != 2) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.B7).getValue()).r()).intValue();
            boolean z17 = intValue == 1 || intValue == 2;
            pf5.z zVar = pf5.z.f353948a;
            boolean z18 = ((com.tencent.mm.plugin.finder.viewmodel.component.gg) zVar.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class)).f134508g;
            com.tencent.mm.plugin.finder.feed.xj xjVar = ((com.tencent.mm.plugin.finder.viewmodel.component.po) zVar.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.po.class)).f135573e;
            if (xjVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            boolean z19 = xjVar.f111080i;
            com.tencent.mars.xlog.Log.i(this.f109473t, "checkAutoFloatBall,enableAutoFloatBall=" + z17 + ",requestAutoFloatBall=" + this.f109476w + ",hasTriggerAdd=" + z18 + ", isWaitingAutoContinuePlay:" + z19 + '!');
            if (z17 && this.f109476w && !z18 && !z19) {
                com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar = (com.tencent.mm.plugin.finder.viewmodel.component.gg) zVar.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
                ggVar.f134508g = true;
                com.tencent.mm.plugin.finder.viewmodel.component.gg.O6(ggVar, false, false, false, ((c61.l7) i95.n0.c(c61.l7.class)).V, intValue == 2, false, 38, null);
            }
        }
        return super.onKeyDown(i17, event);
    }
}
