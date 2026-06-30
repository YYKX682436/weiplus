package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class z40 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f218186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f218187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f218188f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f218189g;

    public z40(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var, int i17, java.lang.String str, java.lang.String str2) {
        this.f218186d = f50Var;
        this.f218187e = i17;
        this.f218188f = str;
        this.f218189g = str2;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent();
        g92.b bVar = g92.b.f351302e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var = this.f218186d;
        m92.b j37 = g92.a.j3(bVar, f50Var.f215871d, false, 2, null);
        int i18 = (!(((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("PersonalCenterActionSheetPost") != null && ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("PersonalCenterActionSheetPost") != null && ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ni(true)) || (j37 != null ? j37.w0() : false)) ? 0 : 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        p2Var.W(p2Var.i(f50Var.m80379x76847179(), this.f218187e, false));
        p2Var.R(this.f218188f);
        if (menuItem.getItemId() == 1001) {
            ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ui("FinderPersonalCenterPageActionSheetShootingButton", f50Var.Z6(), 0, this.f218189g, true);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("is_red_dot", i18);
            intent.putExtra("key_finder_post_router", 2);
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            android.app.Activity context = f50Var.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij(o3Var, 1, "post_acionsheet_camera", jSONObject2, nyVar != null ? nyVar.V6() : null, null, 16, null);
            if (i18 != 0) {
                r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("PersonalCenterActionSheetPost");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("PersonalCenterActionSheetPost");
                if (I0 != null && L0 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a.e("4", L0, I0, 3, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? 0 : 0, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 0 : 0);
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
            }
            p2Var.G("andr_Post_ActionSheet_Camera", null);
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("ProfileActionSheetPublish");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("PersonalCenterActionSheetPost");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("ProfilePublish");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("TLCamera");
        } else if (menuItem.getItemId() == 1002) {
            ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ui("FinderPersonalCenterPageActionSheetAlbumPickingButton", f50Var.Z6(), 0, this.f218189g, false);
            intent.putExtra("key_finder_post_router", 3);
            intent.putExtra("key_maas_entrance", 1);
            i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18;
            android.app.Activity context2 = f50Var.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij(o3Var2, 1, "post_actionsheet_album", "", nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
            p2Var.G("andr_Post_ActionSheet_Album", null);
        } else if (menuItem.getItemId() == 1031) {
            intent.putExtra("key_finder_post_router", 16);
        } else {
            java.util.HashMap hashMap = f50Var.f215879n;
            if (hashMap.containsKey(java.lang.Integer.valueOf(menuItem.getItemId()))) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.i1.f542028a.a(f50Var.m158354x19263085(), (r45.xa5) hashMap.get(java.lang.Integer.valueOf(menuItem.getItemId())));
            }
        }
        intent.putExtra("key_finder_post_from", 5);
        intent.putExtra("key_finder_post_id", this.f218189g);
        intent.putExtra("KEY_FINDER_USERNAME_SELF", f50Var.f215871d);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).yk(f50Var.m158354x19263085(), intent, 132, 9);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).gk(f50Var.m158354x19263085(), intent);
    }
}
