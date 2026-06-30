package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class t9 implements com.tencent.mm.plugin.fav.ui.gallery.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.da f101458a;

    public t9(com.tencent.mm.plugin.fav.ui.da daVar) {
        this.f101458a = daVar;
    }

    public void a(boolean z17) {
        com.tencent.mm.plugin.fav.ui.da daVar = this.f101458a;
        if (daVar.W6(daVar.A) && o72.c2.f343317a.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "[onSelectAllStateChanged] isAllSelected: " + z17);
            java.lang.String string = daVar.getContext().getString(z17 ? com.tencent.mm.R.string.nxm : com.tencent.mm.R.string.nxf);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            android.app.Activity context = daVar.getContext();
            com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
            if (mMActivity != null) {
                mMActivity.updateOptionMenuText(12, string);
            }
        }
    }

    public void b(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onSelectedModeChanged] isSelectedMode: ");
        sb6.append(z17);
        sb6.append(", shouldShowGridList: ");
        com.tencent.mm.plugin.fav.ui.da daVar = this.f101458a;
        sb6.append(daVar.W6(daVar.A));
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", sb6.toString());
        if (daVar.W6(daVar.A) && o72.c2.f343317a.b()) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[onSelectedModeChanged] Calling showOptionMenu: SELECT_ALL=");
            sb7.append(z17);
            sb7.append(", POST=");
            sb7.append(!z17);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", sb7.toString());
            android.app.Activity context = daVar.getContext();
            com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
            if (mMActivity != null) {
                mMActivity.showOptionMenu(12, z17);
            }
            android.app.Activity context2 = daVar.getContext();
            com.tencent.mm.ui.MMActivity mMActivity2 = context2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context2 : null;
            if (mMActivity2 != null) {
                mMActivity2.showOptionMenu(11, !z17);
            }
        } else {
            android.app.Activity context3 = daVar.getContext();
            com.tencent.mm.ui.MMActivity mMActivity3 = context3 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context3 : null;
            if (mMActivity3 != null) {
                mMActivity3.showOptionMenu(12, false);
            }
            android.app.Activity context4 = daVar.getContext();
            com.tencent.mm.ui.MMActivity mMActivity4 = context4 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context4 : null;
            if (mMActivity4 != null) {
                mMActivity4.showOptionMenu(11, true);
            }
        }
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "[onSelectedModeChanged] Restoring default title: " + daVar.f100576d);
        android.app.Activity context5 = daVar.getContext();
        com.tencent.mm.ui.MMActivity mMActivity5 = context5 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context5 : null;
        if (mMActivity5 != null) {
            mMActivity5.setMMTitle(daVar.f100576d);
        }
    }

    public void c(java.lang.String str) {
        com.tencent.mm.ui.MMActivity mMActivity;
        boolean z17 = str == null || str.length() == 0;
        com.tencent.mm.plugin.fav.ui.da daVar = this.f101458a;
        if (z17) {
            android.app.Activity context = daVar.getContext();
            mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
            if (mMActivity != null) {
                mMActivity.setMMTitle(daVar.f100576d);
                return;
            }
            return;
        }
        android.app.Activity context2 = daVar.getContext();
        mMActivity = context2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context2 : null;
        if (mMActivity != null) {
            mMActivity.setMMTitle(str);
        }
    }
}
