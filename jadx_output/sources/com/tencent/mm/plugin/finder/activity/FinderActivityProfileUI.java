package com.tencent.mm.plugin.finder.activity;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/FinderActivityProfileUI;", "Lcom/tencent/mm/plugin/finder/activity/base/ui/BaseProfileUI;", "Lr45/r03;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderActivityProfileUI extends com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI<r45.r03> {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f101738v = 0;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.activity.uic.b f101739u = new com.tencent.mm.plugin.finder.activity.uic.b();

    @Override // com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI, t92.b
    public int N2() {
        return com.tencent.mm.R.layout.adt;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 59;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC.class, com.tencent.mm.plugin.finder.activity.uic.o.class, com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC.class, com.tencent.mm.plugin.finder.activity.uic.a.class, com.tencent.mm.plugin.finder.activity.uic.c.class, com.tencent.mm.plugin.finder.activity.uic.q1.class});
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI, t92.a
    /* renamed from: o6 */
    public x92.f getF101755u() {
        return this.f101739u;
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderActivityProfileUI);
        aVar.Rj(this, iy1.a.Finder);
        aVar.Tj(this, 12, 1, false);
        aVar.Tj(this, 12, 3, false);
        aVar.gk(this, s92.g.f405006a.b(this));
    }
}
