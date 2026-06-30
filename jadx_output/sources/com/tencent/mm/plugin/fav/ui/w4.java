package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class w4 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f101512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavSearchUI f101513e;

    public w4(com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI, int i17) {
        this.f101513e = favSearchUI;
        this.f101512d = i17;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        o72.b3 b3Var = new o72.b3();
        com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI = this.f101513e;
        o72.r2 item = favSearchUI.f100400n.getItem((this.f101512d - favSearchUI.f100403q.getHeaderViewsCount()) - 1);
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
        contextMenu.add(0, 1, 0, com.tencent.mm.R.string.cbi);
    }
}
