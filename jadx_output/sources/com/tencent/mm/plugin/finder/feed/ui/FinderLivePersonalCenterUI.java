package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(288)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLivePersonalCenterUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "Lrd2/a;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class FinderLivePersonalCenterUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI implements rd2.a {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f109391x = 0;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f109392v = "FinderLivePersonalCenterUI";

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f109393w;

    public FinderLivePersonalCenterUI() {
        jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.ab(this));
        this.f109393w = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.eb(this));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int W6() {
        return 266;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.j8.class)), pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.m8.class))});
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.dsy);
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.bb(this));
        ll2.e eVar = ll2.e.f319133a;
        com.tencent.mm.plugin.finder.extension.reddot.a aVar = (com.tencent.mm.plugin.finder.extension.reddot.a) eVar.g("live.personalcenter.startlive").getValue();
        if (aVar != null && aVar.f105327a) {
            ll2.e.d(eVar, "live.personalcenter.startlive", false, false, 2, null);
        }
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3703b4).getValue()).r()).intValue() != 1) {
            addTextOptionMenu(0, getString(com.tencent.mm.R.string.dbi), new com.tencent.mm.plugin.finder.feed.ui.cb(this), null, com.tencent.mm.ui.fb.BLACK);
        }
        androidx.appcompat.app.AppCompatActivity context = getContext();
        if (!(context instanceof androidx.lifecycle.y)) {
            context = null;
        }
        eVar.k(context, "live.personalcenter.startlive", new com.tencent.mm.plugin.finder.feed.ui.db(this));
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        a4Var.c(java.lang.String.valueOf(hashCode()), java.lang.String.valueOf(266), java.lang.String.valueOf(266), "");
        java.lang.String valueOf = java.lang.String.valueOf(266);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.a(valueOf, "", b52.b.b(), "person_page_start_live", "");
        ((id2.u3) ((zy2.j8) ((jz5.n) this.f109393w).getValue())).X6(1);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        java.lang.String hashCode = java.lang.String.valueOf(hashCode());
        kotlin.jvm.internal.o.g(hashCode, "hashCode");
        ml2.b1.a(ml2.b1.f327211a, hashCode, null, 2, null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.finder.assist.a4.f102002a.c(java.lang.String.valueOf(hashCode()), java.lang.String.valueOf(266), java.lang.String.valueOf(266), "");
    }
}
