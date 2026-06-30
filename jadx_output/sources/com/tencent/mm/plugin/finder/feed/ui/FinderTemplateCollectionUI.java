package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderTemplateCollectionUI;", "Lcom/tencent/mm/plugin/finder/activity/base/ui/BaseProfileUI;", "Lr45/r03;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderTemplateCollectionUI extends com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI<r45.r03> {
    @Override // com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI, t92.b
    public int N2() {
        return com.tencent.mm.R.layout.b_3;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 195;
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        i95.m c17 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) c17)).ak(this, iy1.c.FinderTemplateCollectionUI);
        aVar.Rj(this, iy1.a.Finder);
        aVar.dk(this, "template_profile_page");
        cy1.a aVar2 = (cy1.a) aVar.ik(this, 172, 24184);
        aVar2.Tj(this, 12, 1, false);
        aVar2.Ai(this, new com.tencent.mm.plugin.finder.feed.ui.xl(this));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(oa2.i.class);
        set.add(oa2.w.class);
        set.add(oa2.b0.class);
        set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.k9.class)));
    }
}
