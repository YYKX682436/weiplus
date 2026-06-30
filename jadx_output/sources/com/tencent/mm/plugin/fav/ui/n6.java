package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public class n6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavTagEditUI f101291d;

    public n6(com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI) {
        this.f101291d = favTagEditUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI = this.f101291d;
        if (favTagEditUI.f100423p) {
            favTagEditUI.T6();
            return true;
        }
        java.util.ArrayList<java.lang.String> tagList = favTagEditUI.f100417g.getTagList();
        java.lang.String trim = favTagEditUI.f100417g.getEditText().trim();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
            tagList.remove(trim);
            tagList.add(trim);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTagEditUI", "[onMenuItemClick] tagList = " + tagList);
        int intExtra = favTagEditUI.getIntent().getIntExtra("key_fav_scene", 1);
        boolean z17 = favTagEditUI.f100425r;
        java.util.ArrayList arrayList = favTagEditUI.f100424q;
        boolean z18 = z17 && arrayList.size() == 0;
        boolean z19 = !favTagEditUI.f100425r && favTagEditUI.f100414d == null;
        if (z18 || z19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavTagEditUI", "[modTags] error return; mulitAddTagError = " + z18 + ", singleAddTagError = " + z19);
        } else {
            o72.r2 r2Var = favTagEditUI.f100414d;
            if (r2Var != null && r2Var.field_id == -1 && o72.x1.G()) {
                o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(favTagEditUI.f100414d.field_localId);
                int i17 = F.field_id;
                if (i17 == -1) {
                    v65.i.b(((t72.l) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).uj()).Y6(), null, new t72.j(new java.util.HashSet(tagList), F.field_localId, null), 1, null);
                } else {
                    favTagEditUI.f100414d.field_id = i17;
                }
            }
            if (o72.x1.G()) {
                if (favTagEditUI.f100425r) {
                    com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(favTagEditUI, "", "", true, false, null);
                    if (Q != null) {
                        Q.show();
                    }
                    gm0.j1.e().j(new com.tencent.mm.plugin.fav.ui.k6(favTagEditUI, tagList, Q));
                } else {
                    com.tencent.mm.ui.widget.dialog.u3 Q2 = db5.e1.Q(favTagEditUI, "", "", true, false, null);
                    if (Q2 != null) {
                        Q2.show();
                    }
                    gm0.j1.e().j(new com.tencent.mm.plugin.fav.ui.i6(favTagEditUI, tagList, Q2));
                }
                jx3.f.INSTANCE.d(29434, 7, 1);
            } else {
                if (favTagEditUI.f100425r) {
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        o72.r2 r2Var2 = (o72.r2) arrayList.get(i18);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(r2Var2.field_tagProto.f385096e);
                        for (int i19 = 0; i19 < tagList.size(); i19++) {
                            java.lang.String str = tagList.get(i19);
                            if (!arrayList2.contains(str)) {
                                arrayList2.add(str);
                            }
                        }
                        java.util.Set T0 = r2Var2.T0(arrayList2);
                        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().update(r2Var2, dm.i4.COL_LOCALID);
                        o72.x1.R0(r2Var2);
                        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj().g(T0);
                        o72.x1.o0(r2Var2, intExtra);
                    }
                } else {
                    java.util.Set T02 = favTagEditUI.f100414d.T0(tagList);
                    ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().update(favTagEditUI.f100414d, dm.i4.COL_LOCALID);
                    o72.x1.R0(favTagEditUI.f100414d);
                    ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj().g(T02);
                    o72.x1.o0(favTagEditUI.f100414d, intExtra);
                }
                jx3.f.INSTANCE.d(29434, 7, 0);
                java.util.ArrayList arrayList3 = new java.util.ArrayList(tagList);
                com.tencent.mm.autogen.events.FavTagAddNotifyEvent favTagAddNotifyEvent = new com.tencent.mm.autogen.events.FavTagAddNotifyEvent();
                favTagAddNotifyEvent.f54240g.f8272a = arrayList3;
                favTagAddNotifyEvent.e();
            }
        }
        android.content.Intent intent = new android.content.Intent();
        if (favTagEditUI.getIntent().getBooleanExtra("key_fav_need_show_tips", false)) {
            intent.putExtra("key_fav_need_show_tips", true);
            favTagEditUI.setResult(-1, intent);
        }
        favTagEditUI.finish();
        favTagEditUI.hideVKB();
        return true;
    }
}
