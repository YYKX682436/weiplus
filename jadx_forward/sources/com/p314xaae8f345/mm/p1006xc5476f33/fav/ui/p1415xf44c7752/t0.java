package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class t0 implements w82.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 f182614a;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var) {
        this.f182614a = h0Var;
    }

    @Override // w82.j
    public void a() {
        java.util.ArrayList arrayList = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.d1.f182441a.f182451a;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var = this.f182614a;
        ((java.util.ArrayList) h0Var.f182497x).clear();
        ((java.util.ArrayList) h0Var.f182497x).addAll(arrayList);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("mutil_select_is_ret", true);
        if (((java.util.ArrayList) h0Var.f182497x).size() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1) arrayList.get(0);
            java.lang.String X = o72.x1.X(b1Var.f182431b);
            java.lang.String x17 = o72.x1.x(b1Var.f182431b);
            if (com.p314xaae8f345.mm.vfs.w6.j(X)) {
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
        j45.l.v(h0Var.f182485l, ".ui.transmit.SelectConversationUI", intent, 1);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o72.v2.d(((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1) it.next()).f182430a.f67645x88be67a1, 1, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y0 y0Var = h0Var.f182488o;
        if (y0Var != null) {
            y0Var.l3(0, ((java.util.ArrayList) h0Var.f182497x).size());
        }
    }

    @Override // w82.j
    public void b() {
        final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var = this.f182614a;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.a1 a1Var = h0Var.f182493t;
        if (a1Var != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_download_btn", "view_clk", a1Var.c(h0Var.f182474a), 32903);
        }
        java.util.ArrayList arrayList = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.d1.f182441a.f182451a;
        if (arrayList == null || arrayList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaHistoryGalleryUI", "[onDownloadRequest] No items selected");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1) it.next();
            if (b1Var.d() || b1Var.c() || b1Var.f182431b.I == 2) {
                arrayList2.add(b1Var);
            }
        }
        if (arrayList2.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaHistoryGalleryUI", "[onDownloadRequest] No image or video items to save");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y1 y1Var = h0Var.f182474a;
        if (!(y1Var != null && ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2) y1Var).d())) {
            h0Var.h();
            return;
        }
        h0Var.getClass();
        android.app.Activity activity = h0Var.f182485l;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activity, 1, true);
        k0Var.q(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nx7, java.lang.Integer.valueOf(arrayList2.size())), 17);
        k0Var.f293405n = new db5.o4() { // from class: com.tencent.mm.plugin.fav.ui.gallery.h0$$b
            @Override // db5.o4
            /* renamed from: onCreateMMMenu */
            public final void mo887xc459429a(db5.g4 g4Var) {
                g4Var.f(0, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0.this.f182485l.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nx6));
            }
        };
        k0Var.f293414s = new db5.t4() { // from class: com.tencent.mm.plugin.fav.ui.gallery.h0$$c
            @Override // db5.t4
            /* renamed from: onMMMenuItemSelected */
            public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0.this;
                h0Var2.getClass();
                if (menuItem.getItemId() == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.a1 a1Var2 = h0Var2.f182493t;
                    if (a1Var2 != null) {
                        a1Var2.e(1, h0Var2.f182474a);
                    }
                    h0Var2.h();
                }
            }
        };
        k0Var.f293387d = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1() { // from class: com.tencent.mm.plugin.fav.ui.gallery.h0$$d
            @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1
            /* renamed from: onDismiss */
            public final void mo889xb349b3ab() {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0.this;
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.a1 a1Var2 = h0Var2.f182493t;
                if (a1Var2 != null) {
                    a1Var2.e(2, h0Var2.f182474a);
                }
            }
        };
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.a1 a1Var2 = h0Var.f182493t;
        if (a1Var2 != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_half_screen_btn", "view_exp", a1Var2.c(h0Var.f182474a), 32903);
        }
        k0Var.v();
    }

    @Override // w82.j
    public void c() {
        int i17;
        java.util.ArrayList arrayList = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.d1.f182441a.f182451a;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = arrayList.iterator();
        o72.r2 r2Var = null;
        boolean z17 = false;
        while (it.hasNext()) {
            r2Var = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1) it.next()).f182430a;
            if (r2Var == null || !((i17 = r2Var.f67657x2262335f) == 18 || i17 == 14)) {
                arrayList2.add(r2Var);
            } else {
                hashSet.add(java.lang.Long.valueOf(r2Var.f67645x88be67a1));
                z17 = true;
            }
        }
        int size = arrayList2.size();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var = this.f182614a;
        if (size != 0) {
            android.app.Activity activity = h0Var.f182485l;
            db5.e1.u(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_i), "", new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.s0(this, arrayList2, z17), null);
        } else {
            if (hashSet.size() >= 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.e7(h0Var.f182485l);
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(h0Var.f182485l);
            u1Var.g(h0Var.f182485l.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_j));
            u1Var.j(h0Var.f182485l.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_c));
            u1Var.n(h0Var.f182485l.getString(com.p314xaae8f345.mm.R.C30867xcad56011.caz));
            u1Var.c(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.p0(this), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.q0(this, r2Var));
            u1Var.q(false);
        }
    }

    @Override // w82.j
    public void d() {
        java.util.ArrayList arrayList = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.d1.f182441a.f182451a;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1) it.next()).f182430a);
        }
        if (arrayList2.size() <= 0) {
            return;
        }
        int size = arrayList2.size();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var = this.f182614a;
        if (size <= 1) {
            o72.r2 r2Var = (o72.r2) arrayList2.get(0);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_fav_scene", 3);
            intent.putExtra("key_fav_item_id", r2Var.f67645x88be67a1);
            o72.x1.M0(h0Var.f182485l, ".ui.FavTagEditUI", intent, 65535, null);
            o72.z2.a("FavTagEditUI");
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y1 y1Var = h0Var.f182474a;
            if (y1Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2) y1Var).getClass();
                if (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.d1.f182441a.f182452b) {
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
            arrayList3.add(java.lang.Integer.valueOf(((o72.r2) arrayList2.get(i17)).f67643xc8a07680));
        }
        intent2.putExtra("key_fav_item_ids", arrayList3);
        intent2.putExtra("key_fav_need_show_tips", true);
        o72.x1.M0(h0Var.f182485l, ".ui.FavTagEditUI", intent2, 4104, null);
        o72.z2.a("FavTagEditUI");
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            o72.r2 r2Var2 = (o72.r2) it6.next();
            if (r2Var2 != null) {
                ((a82.y1) ((o72.s4) i95.n0.c(o72.s4.class))).Di(java.lang.Long.valueOf(r2Var2.f67645x88be67a1));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y1 y1Var2 = h0Var.f182474a;
        if (y1Var2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2) y1Var2).getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.d1.f182441a.f182452b) {
                h0Var.i();
            }
        }
    }
}
