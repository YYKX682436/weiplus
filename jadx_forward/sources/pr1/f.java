package pr1;

/* loaded from: classes9.dex */
public class f implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 f439471d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd1) {
        this.f439471d = viewOnCreateContextMenuListenerC12986xffd38cd1;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd1 = this.f439471d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnCreateContextMenuListenerC12986xffd38cd1.f175585w)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceSortView", "username is null or nil.");
            return;
        }
        if (menuItem.getItemId() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceSortView", "Menu Item selected, pos(%d)", java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(viewOnCreateContextMenuListenerC12986xffd38cd1.f175585w, true);
            qk.o b17 = r01.z.b(viewOnCreateContextMenuListenerC12986xffd38cd1.f175585w);
            android.content.Context context = viewOnCreateContextMenuListenerC12986xffd38cd1.getContext();
            int groupId = menuItem.getGroupId();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceSortView", "showRemoveBizAlertDialog");
            if (b17 == null || context == null || !(context instanceof android.app.Activity) || n17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandServiceSortView", "bizInfo(%s) or context(%s) or contact(%s) is null", b17, context, n17);
                return;
            }
            qk.n6 n6Var = (qk.n6) i95.n0.c(qk.n6.class);
            pr1.g gVar = new pr1.g(viewOnCreateContextMenuListenerC12986xffd38cd1, groupId);
            ((com.p314xaae8f345.mm.app.o7) n6Var).getClass();
            com.p314xaae8f345.mm.ui.p2740x696c9db.n1.b(b17, (android.app.Activity) context, n17, false, gVar, 0);
        }
    }
}
