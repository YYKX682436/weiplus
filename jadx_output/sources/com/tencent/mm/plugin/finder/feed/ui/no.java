package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class no implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI29 f110353d;

    public no(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI29 occupyFinderUI29) {
        this.f110353d = occupyFinderUI29;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        int i17;
        kotlin.jvm.internal.o.g(it, "it");
        int i18 = com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI29.f109604h;
        com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI29 occupyFinderUI29 = this.f110353d;
        occupyFinderUI29.getClass();
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.base.preference.SelectPreference selectPreference = occupyFinderUI29.f109606e;
        if (selectPreference == null) {
            kotlin.jvm.internal.o.o("selectEveryBody");
            throw null;
        }
        if (selectPreference.P) {
            i17 = 2;
        } else {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference2 = occupyFinderUI29.f109607f;
            if (selectPreference2 == null) {
                kotlin.jvm.internal.o.o("selectNeedFollow");
                throw null;
            }
            if (!selectPreference2.P) {
                com.tencent.mm.ui.base.preference.SelectPreference selectPreference3 = occupyFinderUI29.f109608g;
                if (selectPreference3 == null) {
                    kotlin.jvm.internal.o.o("selectNobody");
                    throw null;
                }
                if (selectPreference3.P) {
                    i17 = 1;
                }
                return true;
            }
            i17 = 3;
        }
        ot5.g.c(occupyFinderUI29.f109605d, "output = " + i17);
        intent.putExtra("key_output_interact", i17);
        intent.putExtra("key_interact_scene", 2);
        occupyFinderUI29.setResult(-1, intent);
        occupyFinderUI29.finish();
        return true;
    }
}
