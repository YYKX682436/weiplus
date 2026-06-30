package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveHistoryUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "com/tencent/mm/plugin/finder/feed/ui/v9", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes3.dex */
public final class FinderLiveHistoryUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {
    public static final /* synthetic */ int C = 0;
    public androidx.recyclerview.widget.RecyclerView A;
    public com.tencent.mm.plugin.finder.feed.ui.v9 B;

    /* renamed from: v, reason: collision with root package name */
    public final int f109372v;

    /* renamed from: w, reason: collision with root package name */
    public final int f109373w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f109374x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f109375y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderRefreshLayout f109376z;

    public FinderLiveHistoryUI() {
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        this.f109372v = currentTimeMillis;
        this.f109373w = currentTimeMillis - com.tencent.mmkv.MMKV.ExpireInMonth;
        this.f109375y = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.asn;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.e_s);
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.z9(this));
        this.B = new com.tencent.mm.plugin.finder.feed.ui.v9(this);
        this.f109376z = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) findViewById(com.tencent.mm.R.id.f486583lr1);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.lq8);
        this.A = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.A;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.B);
        }
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f109376z;
        if (finderRefreshLayout != null) {
            finderRefreshLayout.setOnSimpleAction(new com.tencent.mm.plugin.finder.feed.ui.aa(this));
        }
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout2 = this.f109376z;
        if (finderRefreshLayout2 != null) {
            finderRefreshLayout2.post(new com.tencent.mm.plugin.finder.feed.ui.ba(this));
        }
    }
}
