package com.tencent.mm.plugin.finder.activity.music.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/music/ui/FinderMusicTopicUI;", "Lcom/tencent/mm/plugin/finder/activity/base/ui/BaseProfileUI;", "Lr45/r03;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderMusicTopicUI extends com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI<r45.r03> {

    /* renamed from: u, reason: collision with root package name */
    public final x92.f f101755u = new x92.f();

    /* renamed from: v, reason: collision with root package name */
    public boolean f101756v = true;

    /* renamed from: w, reason: collision with root package name */
    public int f101757w = 1;

    @Override // com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI, t92.b
    public int N2() {
        return com.tencent.mm.R.layout.b48;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 138;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{ea2.k0.class, ea2.d.class, com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.class, ea2.e.class, ea2.m0.class});
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI, t92.a
    /* renamed from: o6, reason: from getter */
    public x92.f getF101740t() {
        return this.f101755u;
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((com.tencent.mm.plugin.finder.viewmodel.component.ut) ((zy2.k9) pf5.z.f353948a.a(this).c(zy2.k9.class))).f136177i = true;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        if (this.f101756v) {
            this.f101756v = false;
        } else {
            this.f101757w++;
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ut utVar = (com.tencent.mm.plugin.finder.viewmodel.component.ut) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class);
            androidx.appcompat.app.AppCompatActivity activity = utVar.getActivity();
            com.tencent.mm.plugin.finder.activity.music.ui.FinderMusicTopicUI finderMusicTopicUI = activity instanceof com.tencent.mm.plugin.finder.activity.music.ui.FinderMusicTopicUI ? (com.tencent.mm.plugin.finder.activity.music.ui.FinderMusicTopicUI) activity : null;
            utVar.O6("expose_count", finderMusicTopicUI != null ? finderMusicTopicUI.f101757w : 0);
        }
        super.onResume();
    }
}
