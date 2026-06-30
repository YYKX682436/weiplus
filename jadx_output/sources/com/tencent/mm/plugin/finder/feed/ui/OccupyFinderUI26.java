package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI26;", "Lcom/tencent/mm/plugin/sns/ui/visiblerange/BaseSelectVisibleRangeUI;", "<init>", "()V", "com/tencent/mm/plugin/finder/feed/ui/go", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class OccupyFinderUI26 extends com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI {
    public static final /* synthetic */ int E = 0;

    @Override // com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI
    public com.tencent.mm.plugin.sns.ui.x6 Y6(android.content.Context context, zd4.o oVar) {
        return new com.tencent.mm.plugin.sns.ui.u2(context, oVar);
    }

    @Override // com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI
    public zd4.o Z6() {
        return new com.tencent.mm.plugin.finder.feed.ui.go(this);
    }

    @Override // com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f170681o = true;
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.lwa);
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderSettingPrivacyDetailUI);
        aVar.Rj(this, iy1.a.Finder);
        ((cy1.a) aVar.ik(this, 12, 27010)).gk(this, kz5.c1.k(new jz5.l("comment_scene", java.lang.Integer.valueOf(getIntent().getIntExtra("key_to_comment_scene", 0))), new jz5.l("finder_tab_context_id", getIntent().getStringExtra("key_click_tab_context_id")), new jz5.l("finder_context_id", getIntent().getStringExtra("key_context_id"))));
    }
}
