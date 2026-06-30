package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class lo implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI28 f110284d;

    public lo(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI28 occupyFinderUI28) {
        this.f110284d = occupyFinderUI28;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        int i17;
        kotlin.jvm.internal.o.g(it, "it");
        int i18 = com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI28.f109599h;
        com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI28 occupyFinderUI28 = this.f110284d;
        occupyFinderUI28.getClass();
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.base.preference.SelectPreference selectPreference = occupyFinderUI28.f109601e;
        if (selectPreference == null) {
            kotlin.jvm.internal.o.o("selectEveryBody");
            throw null;
        }
        if (selectPreference.P) {
            i17 = 2;
        } else {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference2 = occupyFinderUI28.f109602f;
            if (selectPreference2 == null) {
                kotlin.jvm.internal.o.o("selectNeedFollow");
                throw null;
            }
            if (!selectPreference2.P) {
                com.tencent.mm.ui.base.preference.SelectPreference selectPreference3 = occupyFinderUI28.f109603g;
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
        ot5.g.c(occupyFinderUI28.f109600d, "output = " + i17);
        intent.putExtra("key_output_interact", i17);
        intent.putExtra("key_interact_scene", 1);
        occupyFinderUI28.setResult(-1, intent);
        occupyFinderUI28.finish();
        return true;
    }
}
