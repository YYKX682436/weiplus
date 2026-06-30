package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class t0 implements w82.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.h0 f101081a;

    public t0(com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var) {
        this.f101081a = h0Var;
    }

    @Override // w82.j
    public void a() {
        java.util.ArrayList arrayList = com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.f100918a;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var = this.f101081a;
        ((java.util.ArrayList) h0Var.f100964x).clear();
        ((java.util.ArrayList) h0Var.f100964x).addAll(arrayList);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("mutil_select_is_ret", true);
        if (((java.util.ArrayList) h0Var.f100964x).size() == 1) {
            com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var = (com.tencent.mm.plugin.fav.ui.gallery.b1) arrayList.get(0);
            java.lang.String X = o72.x1.X(b1Var.f100898b);
            java.lang.String x17 = o72.x1.x(b1Var.f100898b);
            if (com.tencent.mm.vfs.w6.j(X)) {
                intent.putExtra("image_path", X);
            } else {
                intent.putExtra("image_path", x17);
            }
            intent.putExtra("Retr_Msg_Type", (b1Var.c() || b1Var.d()) ? 1 : 0);
            intent.putExtra("select_is_ret", true);
        } else {
            intent.putExtra("scene_from", 1);
            intent.putExtra("Retr_Msg_Type", 17);
        }
        j45.l.v(h0Var.f100952l, ".ui.transmit.SelectConversationUI", intent, 1);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o72.v2.d(((com.tencent.mm.plugin.fav.ui.gallery.b1) it.next()).f100897a.field_localId, 1, 0);
        }
        com.tencent.mm.plugin.fav.ui.gallery.y0 y0Var = h0Var.f100955o;
        if (y0Var != null) {
            y0Var.l3(0, ((java.util.ArrayList) h0Var.f100964x).size());
        }
    }

    @Override // w82.j
    public void b() {
        final com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var = this.f101081a;
        com.tencent.mm.plugin.fav.ui.gallery.a1 a1Var = h0Var.f100960t;
        if (a1Var != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_download_btn", "view_clk", a1Var.c(h0Var.f100941a), 32903);
        }
        java.util.ArrayList arrayList = com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.f100918a;
        if (arrayList == null || arrayList.size() <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MediaHistoryGalleryUI", "[onDownloadRequest] No items selected");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var = (com.tencent.mm.plugin.fav.ui.gallery.b1) it.next();
            if (b1Var.d() || b1Var.c() || b1Var.f100898b.I == 2) {
                arrayList2.add(b1Var);
            }
        }
        if (arrayList2.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MediaHistoryGalleryUI", "[onDownloadRequest] No image or video items to save");
            return;
        }
        com.tencent.mm.plugin.fav.ui.gallery.y1 y1Var = h0Var.f100941a;
        if (!(y1Var != null && ((com.tencent.mm.plugin.fav.ui.gallery.l2) y1Var).d())) {
            h0Var.h();
            return;
        }
        h0Var.getClass();
        android.app.Activity activity = h0Var.f100952l;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) activity, 1, true);
        k0Var.q(activity.getString(com.tencent.mm.R.string.nx7, java.lang.Integer.valueOf(arrayList2.size())), 17);
        k0Var.f211872n = new db5.o4() { // from class: com.tencent.mm.plugin.fav.ui.gallery.h0$$b
            @Override // db5.o4
            public final void onCreateMMMenu(db5.g4 g4Var) {
                g4Var.f(0, com.tencent.mm.plugin.fav.ui.gallery.h0.this.f100952l.getString(com.tencent.mm.R.string.nx6));
            }
        };
        k0Var.f211881s = new db5.t4() { // from class: com.tencent.mm.plugin.fav.ui.gallery.h0$$c
            @Override // db5.t4
            public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
                com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var2 = com.tencent.mm.plugin.fav.ui.gallery.h0.this;
                h0Var2.getClass();
                if (menuItem.getItemId() == 0) {
                    com.tencent.mm.plugin.fav.ui.gallery.a1 a1Var2 = h0Var2.f100960t;
                    if (a1Var2 != null) {
                        a1Var2.e(1, h0Var2.f100941a);
                    }
                    h0Var2.h();
                }
            }
        };
        k0Var.f211854d = new com.tencent.mm.ui.widget.dialog.c1() { // from class: com.tencent.mm.plugin.fav.ui.gallery.h0$$d
            @Override // com.tencent.mm.ui.widget.dialog.c1
            public final void onDismiss() {
                com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var2 = com.tencent.mm.plugin.fav.ui.gallery.h0.this;
                com.tencent.mm.plugin.fav.ui.gallery.a1 a1Var2 = h0Var2.f100960t;
                if (a1Var2 != null) {
                    a1Var2.e(2, h0Var2.f100941a);
                }
            }
        };
        com.tencent.mm.plugin.fav.ui.gallery.a1 a1Var2 = h0Var.f100960t;
        if (a1Var2 != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_half_screen_btn", "view_exp", a1Var2.c(h0Var.f100941a), 32903);
        }
        k0Var.v();
    }

    @Override // w82.j
    public void c() {
        int i17;
        java.util.ArrayList arrayList = com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.f100918a;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = arrayList.iterator();
        o72.r2 r2Var = null;
        boolean z17 = false;
        while (it.hasNext()) {
            r2Var = ((com.tencent.mm.plugin.fav.ui.gallery.b1) it.next()).f100897a;
            if (r2Var == null || !((i17 = r2Var.field_type) == 18 || i17 == 14)) {
                arrayList2.add(r2Var);
            } else {
                hashSet.add(java.lang.Long.valueOf(r2Var.field_localId));
                z17 = true;
            }
        }
        int size = arrayList2.size();
        com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var = this.f101081a;
        if (size != 0) {
            android.app.Activity activity = h0Var.f100952l;
            db5.e1.u(activity, activity.getString(com.tencent.mm.R.string.c_i), "", new com.tencent.mm.plugin.fav.ui.gallery.s0(this, arrayList2, z17), null);
        } else {
            if (hashSet.size() >= 2) {
                com.tencent.mm.plugin.fav.ui.FavSearchUI.e7(h0Var.f100952l);
                return;
            }
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(h0Var.f100952l);
            u1Var.g(h0Var.f100952l.getString(com.tencent.mm.R.string.c_j));
            u1Var.j(h0Var.f100952l.getString(com.tencent.mm.R.string.c_c));
            u1Var.n(h0Var.f100952l.getString(com.tencent.mm.R.string.caz));
            u1Var.c(new com.tencent.mm.plugin.fav.ui.gallery.p0(this), new com.tencent.mm.plugin.fav.ui.gallery.q0(this, r2Var));
            u1Var.q(false);
        }
    }

    @Override // w82.j
    public void d() {
        java.util.ArrayList arrayList = com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.f100918a;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.tencent.mm.plugin.fav.ui.gallery.b1) it.next()).f100897a);
        }
        if (arrayList2.size() <= 0) {
            return;
        }
        int size = arrayList2.size();
        com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var = this.f101081a;
        if (size <= 1) {
            o72.r2 r2Var = (o72.r2) arrayList2.get(0);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_fav_scene", 3);
            intent.putExtra("key_fav_item_id", r2Var.field_localId);
            o72.x1.M0(h0Var.f100952l, ".ui.FavTagEditUI", intent, 65535, null);
            o72.z2.a("FavTagEditUI");
            com.tencent.mm.plugin.fav.ui.gallery.y1 y1Var = h0Var.f100941a;
            if (y1Var != null) {
                ((com.tencent.mm.plugin.fav.ui.gallery.l2) y1Var).getClass();
                if (com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.f100919b) {
                    h0Var.i();
                    return;
                }
                return;
            }
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_fav_scene", 3);
        intent2.putExtra("key_fav_is_add_tag", true);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
            arrayList3.add(java.lang.Integer.valueOf(((o72.r2) arrayList2.get(i17)).field_id));
        }
        intent2.putExtra("key_fav_item_ids", arrayList3);
        intent2.putExtra("key_fav_need_show_tips", true);
        o72.x1.M0(h0Var.f100952l, ".ui.FavTagEditUI", intent2, 4104, null);
        o72.z2.a("FavTagEditUI");
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            o72.r2 r2Var2 = (o72.r2) it6.next();
            if (r2Var2 != null) {
                ((a82.y1) ((o72.s4) i95.n0.c(o72.s4.class))).Di(java.lang.Long.valueOf(r2Var2.field_localId));
            }
        }
        com.tencent.mm.plugin.fav.ui.gallery.y1 y1Var2 = h0Var.f100941a;
        if (y1Var2 != null) {
            ((com.tencent.mm.plugin.fav.ui.gallery.l2) y1Var2).getClass();
            if (com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.f100919b) {
                h0Var.i();
            }
        }
    }
}
