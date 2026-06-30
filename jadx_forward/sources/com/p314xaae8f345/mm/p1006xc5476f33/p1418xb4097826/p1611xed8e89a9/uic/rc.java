package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class rc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.xc f205715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f205716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205717f;

    public rc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.xc xcVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, java.lang.String str) {
        this.f205715d = xcVar;
        this.f205716e = activityC0065xcd7aa112;
        this.f205717f = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent();
        int itemId = menuItem.getItemId();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = this.f205716e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.xc xcVar = this.f205715d;
        if (itemId != 1) {
            if (itemId != 2) {
                if (itemId == 4) {
                    intent.putExtra("key_finder_post_router", 16);
                } else if (itemId != 10012) {
                    if (xcVar.f205887f.containsKey(java.lang.Integer.valueOf(menuItem.getItemId()))) {
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        ya2.i1.f542028a.a(xcVar.m158354x19263085(), (r45.xa5) xcVar.f205887f.get(java.lang.Integer.valueOf(menuItem.getItemId())));
                    }
                }
            }
            ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ui("FinderPersonalProfilePageActionSheetAlbumPickingButton", xcVar.R6(), 0, ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).hj(), false);
            intent.putExtra("key_finder_post_router", 3);
            intent.putExtra("key_maas_entrance", 2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.G("andr_Post_ActionSheet_Camera", null);
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij(o3Var, 1, "post_actionsheet_album", "", nyVar != null ? nyVar.V6() : null, null, 16, null);
        } else {
            ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ui("FinderPersonalProfilePageActionSheetShootingButton", xcVar.R6(), 0, ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).hj(), true);
            intent.putExtra("key_finder_post_router", 2);
            i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij(o3Var2, 1, "post_acionsheet_camera", "", nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.xc.O6(xcVar, "view_clk", context);
            r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("ProfileActionSheetPublish");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("ProfileActionSheetPublish");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.G("andr_Post_ActionSheet_Camera", null);
            if (I0 != null && L0 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a.e("3", L0, I0, 3, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? 0 : 0, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 0 : 0);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e W0 = L0.W0();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(pm0.v.u(L0.W0().m75942xfb822ef2(0)));
                sb6.append(';');
                sb6.append(W0.m75945x2fec8307(1));
                sb6.append(';');
                sb6.append(W0.m75939xb282bd08(2));
                sb6.append(';');
                sb6.append(W0.m75945x2fec8307(3));
                sb6.append(';');
                r45.vs2 vs2Var = L0.f65874xb5f7102a;
                sb6.append(vs2Var != null ? vs2Var.f470032t : null);
                java.lang.String v17 = r26.i0.v(sb6.toString(), ",", ";", false, 4, null);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
                if (c19783xd9a946b7 != null) {
                    c19783xd9a946b7.m76441xbf0b44ea(v17);
                }
            }
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("ProfileActionSheetPublish");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("PersonalCenterActionSheetPost");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("ProfilePublish");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("TLCamera");
        }
        intent.putExtra("key_finder_post_from", 1);
        intent.putExtra("key_finder_post_id", this.f205717f);
        intent.putExtra("KEY_FINDER_USERNAME_SELF", xcVar.m58755x6c03c64c());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).yk(context, intent, 132, 10);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).gk(context, intent);
    }
}
