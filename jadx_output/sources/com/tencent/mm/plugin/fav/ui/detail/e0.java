package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class e0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.f0 f100711d;

    public e0(com.tencent.mm.plugin.fav.ui.detail.f0 f0Var) {
        this.f100711d = f0Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int i18;
        com.tencent.mm.vfs.x1 m17;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.fav.ui.detail.f0 f0Var = this.f100711d;
        switch (itemId) {
            case 0:
                com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI = f0Var.f100718g;
                int i19 = com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.f100607y0;
                int d76 = favoriteFileDetailUI.d7();
                com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI2 = f0Var.f100718g;
                if (d76 == 8) {
                    java.lang.String c76 = favoriteFileDetailUI2.c7();
                    if (!com.tencent.mm.vfs.w6.j(c76)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteFileDetailUI", "share file failed, file not exists");
                        android.widget.Toast.makeText(favoriteFileDetailUI2, favoriteFileDetailUI2.getString(com.tencent.mm.R.string.ccu), 1).show();
                        return;
                    }
                    com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(c76);
                    java.lang.String str = a17.f213279f;
                    if (str != null) {
                        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                        if (!str.equals(l17)) {
                            a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                        }
                    }
                    com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                    if (((m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) ? m17.f213233c : 0L) > com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.f100606x0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteFileDetailUI", "share file failed, file too large");
                        android.widget.Toast.makeText(favoriteFileDetailUI2, favoriteFileDetailUI2.getString(com.tencent.mm.R.string.ccv), 1).show();
                        return;
                    }
                }
                favoriteFileDetailUI2.f100600g.f343487l++;
                favoriteFileDetailUI2.X6(favoriteFileDetailUI2.E.field_localId, 1, 0);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Select_Conv_Type", 3);
                intent.putExtra("select_is_ret", true);
                intent.putExtra("mutil_select_is_ret", true);
                if (favoriteFileDetailUI2.d7() == 15) {
                    intent.putExtra("image_path", com.tencent.mm.plugin.fav.ui.x5.e(favoriteFileDetailUI2.F));
                    i18 = 11;
                } else if (favoriteFileDetailUI2.d7() == 4) {
                    intent.putExtra("image_path", com.tencent.mm.plugin.fav.ui.x5.e(favoriteFileDetailUI2.F));
                    i18 = 1;
                } else {
                    intent.putExtra("desc_title", favoriteFileDetailUI2.F.f375404d);
                    e40.x xVar = (e40.x) i95.n0.c(e40.x.class);
                    java.lang.String str2 = favoriteFileDetailUI2.F.f375404d;
                    ((e35.e) xVar).getClass();
                    e35.g.f247590a.a(str2, 301);
                    i18 = 3;
                }
                intent.putExtra("Retr_Msg_Type", i18);
                j45.l.v(favoriteFileDetailUI2, ".ui.transmit.SelectConversationUI", intent, 1);
                favoriteFileDetailUI2.U6(3);
                return;
            case 1:
                com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI3 = f0Var.f100718g;
                favoriteFileDetailUI3.f100600g.f343488m++;
                com.tencent.mm.ui.MMActivity context = favoriteFileDetailUI3.getContext();
                com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI4 = f0Var.f100718g;
                com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, "", favoriteFileDetailUI4.getString(com.tencent.mm.R.string.cax), true, false, null);
                com.tencent.mm.ui.MMActivity context2 = favoriteFileDetailUI4.getContext();
                o72.r2 r2Var = favoriteFileDetailUI4.E;
                com.tencent.mm.plugin.fav.ui.detail.b0 b0Var = new com.tencent.mm.plugin.fav.ui.detail.b0(this, Q);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(java.lang.Integer.valueOf(r2Var.field_id));
                gm0.j1.d().g(new o72.n5("", 2, linkedList, new com.tencent.mm.plugin.fav.ui.z5(r2Var, context2, b0Var), r2Var.field_type));
                favoriteFileDetailUI4.X6(favoriteFileDetailUI4.E.field_localId, 0, 0);
                favoriteFileDetailUI4.U6(4);
                return;
            case 2:
                com.tencent.mm.ui.MMActivity context3 = f0Var.f100718g.getContext();
                com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI5 = f0Var.f100718g;
                db5.e1.u(context3, favoriteFileDetailUI5.getString(com.tencent.mm.R.string.f490369t2), "", new com.tencent.mm.plugin.fav.ui.detail.d0(this), null);
                favoriteFileDetailUI5.U6(6);
                return;
            case 3:
                f0Var.f100718g.f100600g.f343490o++;
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("key_fav_scene", 2);
                com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI6 = f0Var.f100718g;
                intent2.putExtra("key_fav_item_id", favoriteFileDetailUI6.E.field_localId);
                o72.x1.L0(favoriteFileDetailUI6.getContext(), ".ui.FavTagEditUI", intent2, null);
                favoriteFileDetailUI6.U6(7);
                return;
            case 4:
                com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI7 = f0Var.f100718g;
                int i27 = com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.f100607y0;
                java.lang.String c77 = favoriteFileDetailUI7.c7();
                ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Bi(favoriteFileDetailUI7.getContext(), c77, new com.tencent.mm.plugin.fav.ui.detail.q(favoriteFileDetailUI7, c77));
                f0Var.f100718g.U6(5);
                return;
            case 5:
                u82.a aVar = f0Var.f100718g.U;
                if (aVar != null) {
                    aVar.B(true);
                    return;
                }
                return;
            case 6:
                if (f0Var.f100718g.S != null) {
                    ((d73.i) i95.n0.c(d73.i.class)).f6(f0Var.f100718g.S);
                    break;
                }
                break;
            case 7:
                break;
            default:
                return;
        }
        if (com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.i7(f0Var.f100718g.F)) {
            com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI8 = f0Var.f100718g;
            com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.Z6(favoriteFileDetailUI8, favoriteFileDetailUI8.c7());
        }
    }
}
