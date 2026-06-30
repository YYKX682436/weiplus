package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/ap;", "Lcom/tencent/mm/plugin/finder/feed/zo;", "<init>", "()V", "plugin-finder-publish_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderPostPreviewUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewFeedLoader, com.tencent.mm.plugin.finder.feed.ap, com.tencent.mm.plugin.finder.feed.zo> {
    public com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewFeedLoader A;
    public android.content.Intent N;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.zo f109502y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.ap f109503z;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f109501x = "Finder.FinderPreviewAtTimelineUI";
    public final jz5.g B = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.si(this));
    public final jz5.g C = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.gi(this));
    public final jz5.g D = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.oi(this));
    public final jz5.g E = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.ji(this));
    public final int F = 2;
    public final jz5.g G = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.ri(this));
    public final int H = i65.a.b(getContext(), 45);
    public final jz5.g I = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.pi(this));

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f109500J = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.hi(this));
    public final jz5.g K = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.ii(this));
    public final jz5.g L = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.fi(this));
    public final jz5.g M = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.qi(this));
    public boolean P = true;
    public boolean Q = true;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        if (l7() == 1) {
            return ((java.lang.Boolean) ((jz5.n) this.D).getValue()).booleanValue() ? 62 : 63;
        }
        return 13;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: X6, reason: from getter */
    public java.lang.String getF109501x() {
        return this.f109501x;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewFeedLoader finderPostPreviewFeedLoader = this.A;
        if (finderPostPreviewFeedLoader != null) {
            return finderPostPreviewFeedLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.feed.zo zoVar = this.f109502y;
        if (zoVar != null) {
            return zoVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.feed.ap apVar = this.f109503z;
        if (apVar != null) {
            return apVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b68;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public void h7() {
        getController().W0(this, getResources().getColor(com.tencent.mm.R.color.a9e));
        com.tencent.mm.ui.r0.a(this, false);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
            supportActionBar.o();
        }
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_IS_FULLSCREEN", false);
        this.P = booleanExtra;
        int i17 = this.H;
        if (booleanExtra) {
            n7().setText(getString(com.tencent.mm.R.string.evy));
            k7().setPadding(0, o7(), 0, 0);
            android.view.View k76 = k7();
            android.view.ViewGroup.LayoutParams layoutParams = k7().getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = android.view.View.MeasureSpec.makeMeasureSpec(i17 + o7(), 1073741824);
            k76.setLayoutParams(marginLayoutParams);
            android.view.View m76 = m7();
            android.view.ViewGroup.LayoutParams layoutParams2 = m7().getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = 0;
            m76.setLayoutParams(marginLayoutParams2);
        } else {
            n7().setText(getString(com.tencent.mm.R.string.h0n));
            k7().setPadding(0, o7(), 0, 0);
            android.view.View k77 = k7();
            android.view.ViewGroup.LayoutParams layoutParams3 = k7().getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.height = android.view.View.MeasureSpec.makeMeasureSpec(o7() + i17, 1073741824);
            k77.setLayoutParams(marginLayoutParams3);
            android.view.View m77 = m7();
            android.view.ViewGroup.LayoutParams layoutParams4 = m7().getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = (android.view.ViewGroup.MarginLayoutParams) layoutParams4;
            marginLayoutParams4.topMargin = o7() + i17;
            m77.setLayoutParams(marginLayoutParams4);
        }
        java.lang.Object[] objArr = this.P || com.tencent.mm.ui.bk.C();
        jz5.g gVar = this.f109500J;
        jz5.g gVar2 = this.L;
        if (objArr == true) {
            n7().setBackground(i65.a.i(getContext(), com.tencent.mm.R.drawable.f481821ab3));
            ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) gVar2).getValue()).setIconColor(-1);
            k7().setBackground(new android.graphics.drawable.ColorDrawable(0));
            m7().setBackgroundResource(com.tencent.mm.R.color.f478514w);
            ((android.view.View) ((jz5.n) gVar).getValue()).setBackgroundResource(com.tencent.mm.R.color.f478514w);
            setNavigationbarColor(-16777216);
            getController().O0(true);
        } else {
            n7().setBackground(i65.a.i(getContext(), com.tencent.mm.R.drawable.f481820ab2));
            ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) gVar2).getValue()).setIconColor(-16777216);
            k7().setBackground(new android.graphics.drawable.ColorDrawable(getResources().getColor(com.tencent.mm.R.color.BW_93)));
            m7().setBackgroundResource(com.tencent.mm.R.color.f478553an);
            ((android.view.View) ((jz5.n) gVar).getValue()).setBackgroundResource(com.tencent.mm.R.color.UN_BW_93);
            setNavigationbarColor(-1);
            getController().O0(com.tencent.mm.ui.bk.C());
        }
        this.Q = getIntent().getBooleanExtra("KEY_ENABLE_SWITCH_PREVIEW_MODE", true);
        n7().setVisibility(this.Q ? 0 : 4);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) gVar2).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.ki(this));
        n7().setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.li(this));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initOnCreate] username=");
        jz5.g gVar3 = this.B;
        sb6.append((java.lang.String) ((jz5.n) gVar3).getValue());
        sb6.append(" fromScene=");
        sb6.append(l7());
        com.tencent.mars.xlog.Log.i(this.f109501x, sb6.toString());
        if (l7() == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21206, java.lang.Integer.valueOf(kotlin.jvm.internal.o.b((java.lang.String) ((jz5.n) gVar3).getValue(), xy2.c.e(this)) ? 1 : 0), 2);
        }
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) this.D).getValue()).booleanValue();
        java.lang.String str = (java.lang.String) ((jz5.n) gVar3).getValue();
        kotlin.jvm.internal.o.f(str, "<get-username>(...)");
        int i18 = this.F;
        int l76 = l7();
        jz5.g gVar4 = this.C;
        com.tencent.mm.plugin.finder.feed.zo zoVar = new com.tencent.mm.plugin.finder.feed.zo(this, booleanValue, str, i18, l76, (r45.qt2) ((jz5.n) gVar4).getValue());
        this.f109502y = zoVar;
        this.f109503z = new com.tencent.mm.plugin.finder.feed.ap(this, zoVar, this.F, getD(), l7() != 1);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.imf);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.fwp);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.feed.ap apVar = this.f109503z;
        if (apVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        apVar.o().post(new com.tencent.mm.plugin.finder.feed.ui.mi(this));
        com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewFeedLoader finderPostPreviewFeedLoader = new com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewFeedLoader((r45.qt2) ((jz5.n) gVar4).getValue());
        finderPostPreviewFeedLoader.initFromCache(getIntent());
        finderPostPreviewFeedLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.ui.ni(finderPostPreviewFeedLoader, this));
        this.A = finderPostPreviewFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isHideStatusBar, reason: from getter */
    public boolean getP() {
        return this.P;
    }

    public final android.view.View k7() {
        return (android.view.View) ((jz5.n) this.K).getValue();
    }

    public final int l7() {
        return ((java.lang.Number) ((jz5.n) this.E).getValue()).intValue();
    }

    public final android.view.View m7() {
        return (android.view.View) ((jz5.n) this.I).getValue();
    }

    public final android.widget.TextView n7() {
        return (android.widget.TextView) ((jz5.n) this.M).getValue();
    }

    public final int o7() {
        return ((java.lang.Number) ((jz5.n) this.G).getValue()).intValue();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(1280);
        getWindow().setStatusBarColor(0);
        getWindow().addFlags(67108864);
        this.N = getIntent();
        super.onCreate(bundle);
    }
}
