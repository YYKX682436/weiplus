package go2;

/* loaded from: classes2.dex */
public final class u implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.z f355600d;

    public u(go2.z zVar) {
        this.f355600d = zVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent();
        int itemId = menuItem.getItemId();
        go2.z zVar = this.f355600d;
        if (itemId == 1) {
            intent.putExtra("key_finder_post_router", 2);
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
            android.app.Activity context = zVar.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij(o3Var, 1, "post_acionsheet_camera", "", nyVar != null ? nyVar.V6() : null, null, 16, null);
        } else if (itemId == 2) {
            intent.putExtra("key_finder_post_router", 3);
            intent.putExtra("key_maas_entrance", 2);
            i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18;
            android.app.Activity context2 = zVar.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij(o3Var2, 1, "post_actionsheet_album", "", nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
        } else if (itemId == 4) {
            intent.putExtra("key_finder_post_router", 16);
        } else if (zVar.F.containsKey(java.lang.Integer.valueOf(menuItem.getItemId()))) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.i1.f542028a.a(zVar.m158354x19263085(), (r45.xa5) zVar.F.get(java.lang.Integer.valueOf(menuItem.getItemId())));
        }
        intent.putExtra("key_finder_post_from", 24);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.b().j());
        sb6.append('_');
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        p2Var.T(sb7, null);
        p2Var.W(p2Var.i(zVar.m80379x76847179(), 29, false));
        intent.putExtra("key_finder_post_id", sb7);
        intent.putExtra("KEY_FINDER_MEMBER_VIDEO", true);
        intent.putExtra("KEY_FINDER_ACTION_BAR_TITLE", zVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ena));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).gk(zVar.m80379x76847179(), intent);
    }
}
