package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderFriendLikeLoader;", "Lcom/tencent/mm/plugin/finder/feed/nb;", "Lcom/tencent/mm/plugin/finder/feed/mb;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFriendLikeTimelineUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader, com.tencent.mm.plugin.finder.feed.nb, com.tencent.mm.plugin.finder.feed.mb> {
    public static final /* synthetic */ int E = 0;
    public final int A = 2;
    public java.lang.String B = "";
    public java.lang.String C = "";
    public int D = 79;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.mb f109259x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.nb f109260y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader f109261z;

    public static final void k7(com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI finderFriendLikeTimelineUI) {
        finderFriendLikeTimelineUI.getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22010, finderFriendLikeTimelineUI.B, 2);
        jx3.f.INSTANCE.idkeyStat(1279L, 0L, 1L, false);
        android.content.Intent intent = new android.content.Intent();
        java.lang.String Bj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(14, 10, 18, intent);
        intent.putExtra("KEY_FINDER_JUMP_FRIEND_TAB", true);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f460472a;
        androidx.appcompat.app.AppCompatActivity context = finderFriendLikeTimelineUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        e1Var.C(context, intent);
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zj(Bj, "Enter");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6, reason: from getter */
    public int getD() {
        return this.D;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader finderFriendLikeLoader = this.f109261z;
        if (finderFriendLikeLoader != null) {
            return finderFriendLikeLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.feed.mb mbVar = this.f109259x;
        if (mbVar != null) {
            return mbVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.feed.nb nbVar = this.f109260y;
        if (nbVar != null) {
            return nbVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aj7;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public void h7() {
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_USERNAME");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.B = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_NICKNAME");
        this.C = stringExtra2 != null ? stringExtra2 : "";
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        this.C = c61.yb.md((c61.yb) c17, this.B, this.C, false, 4, null);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.f1b, this.C);
        ((ke0.e) xVar).getClass();
        setMMTitle(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
        int i17 = this.A;
        com.tencent.mm.plugin.finder.feed.mb mbVar = new com.tencent.mm.plugin.finder.feed.mb(this, i17);
        this.f109259x = mbVar;
        this.f109260y = new com.tencent.mm.plugin.finder.feed.nb(this, mbVar, i17, this.D);
        java.lang.String str = this.B;
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        V6.set(5, java.lang.Integer.valueOf(V6.getInteger(5)));
        com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader finderFriendLikeLoader = new com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader(str, V6);
        finderFriendLikeLoader.initFromCache(getIntent());
        finderFriendLikeLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.ui.c3(this, finderFriendLikeLoader));
        finderFriendLikeLoader.f107459f = new com.tencent.mm.plugin.finder.feed.ui.f3(this);
        finderFriendLikeLoader.f107458e = new com.tencent.mm.plugin.finder.feed.ui.i3(this);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.i1j);
        if (textView != null) {
            textView.setText(getString(com.tencent.mm.R.string.f17));
        }
        this.f109261z = finderFriendLikeLoader;
        if (kotlin.jvm.internal.o.b(this.B, c01.z1.r())) {
            addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.finder.feed.ui.j3(this));
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.jqu);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.jqu);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.k3(this));
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public boolean i7() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.D = getIntent().getIntExtra("KEY_COMMENT_SCENE", 79);
        super.onCreate(bundle);
    }
}
