package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFeedListUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/g9;", "Lcom/tencent/mm/plugin/finder/feed/f9;", "<init>", "()V", "com/tencent/mm/plugin/finder/feed/ui/d2", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFeedListUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.g9, com.tencent.mm.plugin.finder.feed.f9> {
    public final int A = 2;
    public int B;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.f9 f109232x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.g9 f109233y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader f109234z;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 355;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = this.f109234z;
        if (baseFinderFeedLoader != null) {
            return baseFinderFeedLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.feed.f9 f9Var = this.f109232x;
        if (f9Var != null) {
            return f9Var;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        int w17;
        cw2.da videoView;
        android.view.View view;
        com.tencent.mm.plugin.finder.feed.g9 g9Var = this.f109233y;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = null;
        if (g9Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = g9Var.getRecyclerView();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null && (w17 = linearLayoutManager.w()) != -1) {
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = this.f109234z;
            if (baseFinderFeedLoader == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            so2.j5 j5Var = (so2.j5) kz5.n0.a0(baseFinderFeedLoader.getDataList(), w17);
            if (j5Var != null) {
                long itemId = j5Var.getItemId();
                androidx.recyclerview.widget.k3 p07 = recyclerView.p0(w17);
                if (p07 != null && (view = p07.itemView) != null) {
                    finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) view.findViewById(com.tencent.mm.R.id.e_k);
                }
                boolean z17 = (finderVideoLayout == null || (videoView = finderVideoLayout.getVideoView()) == null || videoView.isPlaying()) ? false : true;
                com.tencent.mars.xlog.Log.i("FinderFeedListUI", "sendFinderColumnUIFinishEvent feedId=" + itemId + " isPause=" + z17);
                com.tencent.mm.autogen.events.FinderColumnUIFinishEvent finderColumnUIFinishEvent = new com.tencent.mm.autogen.events.FinderColumnUIFinishEvent();
                am.ra raVar = finderColumnUIFinishEvent.f54261g;
                raVar.f7803a = itemId;
                raVar.f7804b = z17;
                finderColumnUIFinishEvent.e();
            }
        }
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477721i, com.tencent.mm.R.anim.f477722j);
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.feed.g9 g9Var = this.f109233y;
        if (g9Var != null) {
            return g9Var;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cxd;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public void h7() {
        int i17 = this.A;
        com.tencent.mm.plugin.finder.feed.f9 f9Var = new com.tencent.mm.plugin.finder.feed.f9(this, i17);
        this.f109232x = f9Var;
        this.f109233y = new com.tencent.mm.plugin.finder.feed.g9(this, f9Var, i17, 355);
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_FINDER_FEEDLIST_VM_KEY");
        if (stringExtra == null) {
            return;
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.feed.model.FinderColumnFeedListLoader finderColumnFeedListLoader = new com.tencent.mm.plugin.finder.feed.model.FinderColumnFeedListLoader(context, V6, stringExtra);
        finderColumnFeedListLoader.initFromCache(getIntent());
        finderColumnFeedListLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.ui.e2(this, new com.tencent.mm.plugin.finder.feed.ui.g2(this, V6, stringExtra), finderColumnFeedListLoader));
        finderColumnFeedListLoader.f107397f = new com.tencent.mm.plugin.finder.feed.ui.f2(this);
        this.f109234z = finderColumnFeedListLoader;
        ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f483315aa4)).setIconColor(getResources().getColor(com.tencent.mm.R.color.f479252u4));
        this.B = getIntent().getIntExtra("KEY_FINDER_FEEDLIST_COLUMN_ID", 0);
        java.lang.CharSequence charSequenceExtra = getIntent().getCharSequenceExtra("KEY_FINDER_FEEDLIST_TITLE");
        i95.m c17 = i95.n0.c(zy2.s6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.s6 s6Var = (zy2.s6) c17;
        if (charSequenceExtra == null) {
            charSequenceExtra = "";
        }
        java.lang.CharSequence charSequence = charSequenceExtra;
        jz5.g gVar = this.f109462v;
        ((android.widget.TextView) ((jz5.n) gVar).getValue()).setText(zy2.s6.l6(s6Var, charSequence, (int) ((android.widget.TextView) ((jz5.n) gVar).getValue()).getTextSize(), true, null, 0, false, null, 120, null));
        ((android.widget.TextView) ((jz5.n) gVar).getValue()).setVisibility(0);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ggn);
        if (findViewById != null) {
            findViewById.setBackgroundColor(b3.l.getColor(this, com.tencent.mm.R.color.ajt));
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                findViewById.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public boolean i7() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (com.tencent.mm.ui.bk.C()) {
            setTheme(com.tencent.mm.R.style.f494380li);
        } else {
            setTheme(com.tencent.mm.R.style.f494381lj);
        }
        super.onCreate(bundle);
        android.view.ViewGroup viewGroup = null;
        db5.f.c(this, null);
        android.view.View decorView = getWindow().getDecorView();
        android.view.ViewGroup viewGroup2 = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        android.view.View childAt = viewGroup2 != null ? viewGroup2.getChildAt(0) : null;
        android.view.ViewGroup viewGroup3 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
        if (viewGroup3 != null) {
            viewGroup3.setTag(java.lang.Integer.valueOf(com.tencent.mm.R.id.rl8));
            viewGroup = viewGroup3;
        }
        if (viewGroup != null) {
            viewGroup2.removeView(viewGroup);
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.feed.ui.d2 d2Var = new com.tencent.mm.plugin.finder.feed.ui.d2(context);
            d2Var.f109926f = viewGroup;
            d2Var.addView(viewGroup);
            d2Var.setId(com.tencent.mm.R.id.tct);
            viewGroup2.addView(d2Var, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
    }
}
