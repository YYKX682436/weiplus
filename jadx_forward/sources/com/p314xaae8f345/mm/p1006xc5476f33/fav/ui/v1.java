package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class v1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f183013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13566x76c62427 f183014e;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13566x76c62427 activityC13566x76c62427, int i17) {
        this.f183014e = activityC13566x76c62427;
        this.f183013d = i17;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        o72.b3 b3Var = new o72.b3();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13566x76c62427 activityC13566x76c62427 = this.f183014e;
        o72.r2 item = activityC13566x76c62427.f181868o.getItem((this.f183013d - activityC13566x76c62427.f181869p.getHeaderViewsCount()) - 1);
        boolean c17 = b3Var.c(item, false, false);
        if (!c17) {
            contextMenu.add(0, 3, 0, com.p314xaae8f345.mm.R.C30867xcad56011.ccj);
        }
        if (c17 && o72.x1.l0(item)) {
            contextMenu.add(0, 3, 0, com.p314xaae8f345.mm.R.C30867xcad56011.ccj);
        }
        if (item.f67657x2262335f == 8) {
            r45.gp0 J2 = o72.x1.J(item);
            if (o72.x1.i0(J2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(o72.x1.x(J2))) {
                contextMenu.add(0, 4, 0, com.p314xaae8f345.mm.R.C30867xcad56011.cbt);
            }
        }
        contextMenu.add(0, 2, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f572728ca4);
        if (item.B1) {
            contextMenu.add(0, 5, 0, com.p314xaae8f345.mm.R.C30867xcad56011.caz);
        }
        contextMenu.add(0, 0, 0, com.p314xaae8f345.mm.R.C30867xcad56011.c_f);
        if (activityC13566x76c62427.f181861e == 22) {
            contextMenu.add(0, 6, 0, com.p314xaae8f345.mm.R.C30867xcad56011.cch);
        }
        contextMenu.add(0, 1, 0, com.p314xaae8f345.mm.R.C30867xcad56011.cbi);
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20264xc3c7e0d7()) == 1) {
            contextMenu.add(0, 7, 0, com.p314xaae8f345.mm.R.C30867xcad56011.c9v);
        }
    }
}
