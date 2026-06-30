package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class e0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.f0 f182244d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.f0 f0Var) {
        this.f182244d = f0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int i18;
        com.p314xaae8f345.mm.vfs.x1 m17;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.f0 f0Var = this.f182244d;
        switch (itemId) {
            case 0:
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d = f0Var.f182251g;
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d.f182140y0;
                int d76 = activityC13590x9555381d.d7();
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d2 = f0Var.f182251g;
                if (d76 == 8) {
                    java.lang.String c76 = activityC13590x9555381d2.c7();
                    if (!com.p314xaae8f345.mm.vfs.w6.j(c76)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavoriteFileDetailUI", "share file failed, file not exists");
                        android.widget.Toast.makeText(activityC13590x9555381d2, activityC13590x9555381d2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccu), 1).show();
                        return;
                    }
                    com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(c76);
                    java.lang.String str = a17.f294812f;
                    if (str != null) {
                        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                        if (!str.equals(l17)) {
                            a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                        }
                    }
                    com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                    if (((m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) ? m17.f294766c : 0L) > com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d.f182139x0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavoriteFileDetailUI", "share file failed, file too large");
                        android.widget.Toast.makeText(activityC13590x9555381d2, activityC13590x9555381d2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccv), 1).show();
                        return;
                    }
                }
                activityC13590x9555381d2.f182133g.f425020l++;
                activityC13590x9555381d2.X6(activityC13590x9555381d2.E.f67645x88be67a1, 1, 0);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Select_Conv_Type", 3);
                intent.putExtra("select_is_ret", true);
                intent.putExtra("mutil_select_is_ret", true);
                if (activityC13590x9555381d2.d7() == 15) {
                    intent.putExtra("image_path", com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.e(activityC13590x9555381d2.F));
                    i18 = 11;
                } else if (activityC13590x9555381d2.d7() == 4) {
                    intent.putExtra("image_path", com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.e(activityC13590x9555381d2.F));
                    i18 = 1;
                } else {
                    intent.putExtra("desc_title", activityC13590x9555381d2.F.f456937d);
                    e40.x xVar = (e40.x) i95.n0.c(e40.x.class);
                    java.lang.String str2 = activityC13590x9555381d2.F.f456937d;
                    ((e35.e) xVar).getClass();
                    e35.g.f329123a.a(str2, 301);
                    i18 = 3;
                }
                intent.putExtra("Retr_Msg_Type", i18);
                j45.l.v(activityC13590x9555381d2, ".ui.transmit.SelectConversationUI", intent, 1);
                activityC13590x9555381d2.U6(3);
                return;
            case 1:
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d3 = f0Var.f182251g;
                activityC13590x9555381d3.f182133g.f425021m++;
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf mo55332x76847179 = activityC13590x9555381d3.mo55332x76847179();
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d4 = f0Var.f182251g;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(mo55332x76847179, "", activityC13590x9555381d4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null);
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf mo55332x768471792 = activityC13590x9555381d4.mo55332x76847179();
                o72.r2 r2Var = activityC13590x9555381d4.E;
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.b0 b0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.b0(this, Q);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(java.lang.Integer.valueOf(r2Var.f67643xc8a07680));
                gm0.j1.d().g(new o72.n5("", 2, linkedList, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z5(r2Var, mo55332x768471792, b0Var), r2Var.f67657x2262335f));
                activityC13590x9555381d4.X6(activityC13590x9555381d4.E.f67645x88be67a1, 0, 0);
                activityC13590x9555381d4.U6(4);
                return;
            case 2:
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf mo55332x768471793 = f0Var.f182251g.mo55332x76847179();
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d5 = f0Var.f182251g;
                db5.e1.u(mo55332x768471793, activityC13590x9555381d5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571902t2), "", new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.d0(this), null);
                activityC13590x9555381d5.U6(6);
                return;
            case 3:
                f0Var.f182251g.f182133g.f425023o++;
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("key_fav_scene", 2);
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d6 = f0Var.f182251g;
                intent2.putExtra("key_fav_item_id", activityC13590x9555381d6.E.f67645x88be67a1);
                o72.x1.L0(activityC13590x9555381d6.mo55332x76847179(), ".ui.FavTagEditUI", intent2, null);
                activityC13590x9555381d6.U6(7);
                return;
            case 4:
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d7 = f0Var.f182251g;
                int i27 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d.f182140y0;
                java.lang.String c77 = activityC13590x9555381d7.c7();
                ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Bi(activityC13590x9555381d7.mo55332x76847179(), c77, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.q(activityC13590x9555381d7, c77));
                f0Var.f182251g.U6(5);
                return;
            case 5:
                u82.a aVar = f0Var.f182251g.U;
                if (aVar != null) {
                    aVar.B(true);
                    return;
                }
                return;
            case 6:
                if (f0Var.f182251g.S != null) {
                    ((d73.i) i95.n0.c(d73.i.class)).f6(f0Var.f182251g.S);
                    break;
                }
                break;
            case 7:
                break;
            default:
                return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d.i7(f0Var.f182251g.F)) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d8 = f0Var.f182251g;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d.Z6(activityC13590x9555381d8, activityC13590x9555381d8.c7());
        }
    }
}
