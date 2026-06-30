package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderSeeLaterDetailUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderSeeLaterDetailUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {
    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int W6() {
        return nd1.f2.CTRL_INDEX;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{co2.k.class, w03.n.class});
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        co2.k kVar = (co2.k) pf5.z.f353948a.a(this).a(co2.k.class);
        androidx.appcompat.app.AppCompatActivity activity = kVar.getActivity();
        android.content.Intent intent = new android.content.Intent();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        vn2.u0 u0Var = vn2.u0.f438387a;
        java.lang.Long valueOf = java.lang.Long.valueOf(elapsedRealtime);
        java.util.ArrayList dataListJustForAdapter = kVar.O6().getDataListJustForAdapter();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = dataListJustForAdapter.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (next instanceof bo2.c) {
                arrayList.add(next);
            }
        }
        vn2.u0.f438393g = new jz5.l(valueOf, arrayList);
        intent.putExtra("key_see_later_data_key", elapsedRealtime);
        activity.setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("key_context_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(stringExtra);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        com.tencent.mm.plugin.finder.feed.ui.ak akVar = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.O7).getValue()).r()).intValue() == 1 ? com.tencent.mm.plugin.finder.feed.ui.ak.f109680d : null;
        pf5.z zVar = pf5.z.f353948a;
        ((w03.n) zVar.a(this).a(w03.n.class)).P6("WatchLaterList", hashCode());
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null) {
            nyVar.k7(nd1.f2.CTRL_INDEX, 2, akVar);
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a(this).c(zy2.ra.class))).f135382p = stringExtra;
        com.tencent.mars.xlog.Log.i("FinderSeeLaterDetailUI", "oldContextId=".concat(stringExtra));
        super.onCreate(bundle);
        setMMTitle(getIntent().hasExtra("") ? getIntent().getStringExtra("") : getResources().getString(com.tencent.mm.R.string.lqi));
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.zj(this));
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderWatchLaterUI);
        aVar.dk(this, "FinderWatchLaterUI");
        aVar.Tj(this, 12, 1, false);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        jz5.l lVar = new jz5.l("finder_context_id", ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p);
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        aVar.gk(this, kz5.c1.k(lVar, new jz5.l("comment_scene", java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n)), new jz5.l("wl_enter_type", 1)));
    }
}
