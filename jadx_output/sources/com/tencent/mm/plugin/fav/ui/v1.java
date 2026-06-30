package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class v1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f101480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavFilterUI f101481e;

    public v1(com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI, int i17) {
        this.f101481e = favFilterUI;
        this.f101480d = i17;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        o72.b3 b3Var = new o72.b3();
        com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI = this.f101481e;
        o72.r2 item = favFilterUI.f100335o.getItem((this.f101480d - favFilterUI.f100336p.getHeaderViewsCount()) - 1);
        boolean c17 = b3Var.c(item, false, false);
        if (!c17) {
            contextMenu.add(0, 3, 0, com.tencent.mm.R.string.ccj);
        }
        if (c17 && o72.x1.l0(item)) {
            contextMenu.add(0, 3, 0, com.tencent.mm.R.string.ccj);
        }
        if (item.field_type == 8) {
            r45.gp0 J2 = o72.x1.J(item);
            if (o72.x1.i0(J2) && !com.tencent.mm.sdk.platformtools.y1.c(o72.x1.x(J2))) {
                contextMenu.add(0, 4, 0, com.tencent.mm.R.string.cbt);
            }
        }
        contextMenu.add(0, 2, 0, com.tencent.mm.R.string.f491195ca4);
        if (item.B1) {
            contextMenu.add(0, 5, 0, com.tencent.mm.R.string.caz);
        }
        contextMenu.add(0, 0, 0, com.tencent.mm.R.string.c_f);
        if (favFilterUI.f100328e == 22) {
            contextMenu.add(0, 6, 0, com.tencent.mm.R.string.cch);
        }
        contextMenu.add(0, 1, 0, com.tencent.mm.R.string.cbi);
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalFavDebug()) == 1) {
            contextMenu.add(0, 7, 0, com.tencent.mm.R.string.c9v);
        }
    }
}
