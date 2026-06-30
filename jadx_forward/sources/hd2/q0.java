package hd2;

/* loaded from: classes2.dex */
public final class q0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3 f362051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f362052e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362053f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362054g;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3 c14135xb71edba3, android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        this.f362051d = c14135xb71edba3;
        this.f362052e = activity;
        this.f362053f = str;
        this.f362054g = str2;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent();
        int itemId = menuItem.getItemId();
        android.app.Activity context = this.f362052e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3 c14135xb71edba3 = this.f362051d;
        if (itemId != 1) {
            if (itemId != 2) {
                if (itemId == 4) {
                    intent.putExtra("key_finder_post_router", 16);
                } else if (itemId != 10012) {
                    if (c14135xb71edba3.f191589t.containsKey(java.lang.Integer.valueOf(menuItem.getItemId()))) {
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        ya2.i1.f542028a.a(context, (r45.xa5) c14135xb71edba3.f191589t.get(java.lang.Integer.valueOf(menuItem.getItemId())));
                    }
                }
            }
            pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3.f191582v;
            c14135xb71edba3.getClass();
            ((yy0.m7) l0Var).Ui("FinderPersonalProfilePageActionSheetAlbumPickingButton", 105, 0, ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).hj(), false);
            intent.putExtra("key_finder_post_router", 3);
            intent.putExtra("key_maas_entrance", 2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.G("andr_Post_ActionSheet_Album", null);
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij(o3Var, 1, "post_actionsheet_album", "", nyVar != null ? nyVar.V6() : null, null, 16, null);
        } else {
            pp0.l0 l0Var2 = (pp0.l0) i95.n0.c(pp0.l0.class);
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3.f191582v;
            c14135xb71edba3.getClass();
            ((yy0.m7) l0Var2).Ui("FinderPersonalProfilePageActionSheetShootingButton", 105, 0, ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).hj(), true);
            intent.putExtra("key_finder_post_router", 2);
            i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij(o3Var2, 1, "post_acionsheet_camera", "", nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.G("andr_Post_ActionSheet_Camera", null);
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("ProfileActionSheetPublish");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("PersonalCenterActionSheetPost");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("ProfilePublish");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("TLCamera");
        }
        intent.putExtra("key_finder_post_from", 1);
        intent.putExtra("key_finder_post_id", this.f362053f);
        intent.putExtra("KEY_FINDER_USERNAME_SELF", this.f362054g);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).yk(context, intent, 132, 10);
        c14135xb71edba3.s0(context, intent, menuItem.getItemId() == 2 ? 100 : 99);
    }
}
