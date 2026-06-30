package or1;

/* loaded from: classes.dex */
public class x implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12977xe43db9b8 f429126d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12977xe43db9b8 activityC12977xe43db9b8) {
        this.f429126d = activityC12977xe43db9b8;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12977xe43db9b8 activityC12977xe43db9b8 = this.f429126d;
        if (itemId == 1) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12977xe43db9b8.f175526p;
            activityC12977xe43db9b8.getClass();
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.h(0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandService.BrandServiceIndexUI", "fts h5 template not avail");
                return;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2) ((su4.g1) i95.n0.c(su4.g1.class))).Bi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new or1.y(activityC12977xe43db9b8));
            return;
        }
        if (menuItem.getItemId() == 2) {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12977xe43db9b8.f175526p;
            activityC12977xe43db9b8.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("intent_service_type", activityC12977xe43db9b8.f175529f);
            j45.l.j(activityC12977xe43db9b8, "brandservice", ".ui.userinfo.ui.BrandServiceUserInfoManageUI", intent, null);
            return;
        }
        if (menuItem.getItemId() == 3) {
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12977xe43db9b8.f175526p;
            java.lang.String string = activityC12977xe43db9b8.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.amk);
            java.lang.String string2 = activityC12977xe43db9b8.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.anh);
            java.lang.String string3 = activityC12977xe43db9b8.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ang);
            wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
            or1.z zVar = new or1.z(activityC12977xe43db9b8);
            ((vd0.j2) q1Var).getClass();
            v24.o0.g(activityC12977xe43db9b8, string, string2, string3, zVar);
        }
    }
}
