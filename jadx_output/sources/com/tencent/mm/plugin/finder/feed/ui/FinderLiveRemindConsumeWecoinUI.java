package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveRemindConsumeWecoinUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "com/tencent/mm/plugin/finder/feed/ui/kc", "com/tencent/mm/plugin/finder/feed/ui/lc", "com/tencent/mm/plugin/finder/feed/ui/mc", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveRemindConsumeWecoinUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f109409v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.ui.kc f109410w;

    public FinderLiveRemindConsumeWecoinUI() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f109409v = linkedList;
        this.f109410w = new com.tencent.mm.plugin.finder.feed.ui.kc(this, linkedList);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: X6 */
    public java.lang.String getF109420v() {
        return "FinderLiveMoreOptionSettingUI";
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488974ay5;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.eco);
        getController().x0(getResources().getString(com.tencent.mm.R.string.hh9), new com.tencent.mm.plugin.finder.feed.ui.nc(this));
        setBackBtnVisible(false);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.finder.feed.ui.oc(this), null, com.tencent.mm.ui.fb.GREEN);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.lqa);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext()));
        com.tencent.mm.plugin.finder.feed.ui.kc kcVar = this.f109410w;
        recyclerView.setAdapter(kcVar);
        dk2.wa a17 = dk2.wa.f234283b.a(getIntent());
        r45.f82 f82Var = a17 != null ? a17.f234285a : null;
        if (f82Var != null) {
            java.util.LinkedList linkedList = this.f109409v;
            linkedList.clear();
            r45.ql1 ql1Var = (r45.ql1) f82Var.getCustom(2);
            long j17 = ql1Var != null ? ql1Var.getLong(1) : 0L;
            java.util.LinkedList<r45.uw4> list = f82Var.getList(1);
            if (list != null) {
                for (r45.uw4 uw4Var : list) {
                    linkedList.add(new com.tencent.mm.plugin.finder.feed.ui.lc(uw4Var.getLong(0), j17 == uw4Var.getLong(0)));
                }
            }
            kcVar.notifyDataSetChanged();
        }
    }
}
