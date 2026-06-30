package k53;

/* loaded from: classes8.dex */
public class q implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p33.l f385915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3 f385916e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3 activityC15919x390706d3, p33.l lVar) {
        this.f385916e = activityC15919x390706d3;
        this.f385915d = lVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        p33.l lVar = this.f385915d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3 activityC15919x390706d3 = this.f385916e;
        if (itemId == 0) {
            android.content.Context context = activityC15919x390706d3.f221647d;
            int i18 = activityC15919x390706d3.f221657q + 1;
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(context, 87, 8768, i18 > 100 ? 100 : i18, 15, activityC15919x390706d3.f221662v, lj0.a.a(activityC15919x390706d3.f221658r, activityC15919x390706d3.X6(lVar)));
            k53.u0 u0Var = activityC15919x390706d3.f221659s;
            u0Var.getClass();
            u0Var.a(lVar, new k53.l0(u0Var, 19081));
            return;
        }
        if (menuItem.getItemId() == 1) {
            android.content.Context context2 = activityC15919x390706d3.f221647d;
            int i19 = activityC15919x390706d3.f221657q + 1;
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(context2, 87, 8768, i19 > 100 ? 100 : i19, 14, activityC15919x390706d3.f221662v, lj0.a.a(activityC15919x390706d3.f221658r, activityC15919x390706d3.X6(lVar)));
            k53.u0 u0Var2 = activityC15919x390706d3.f221659s;
            u0Var2.getClass();
            u0Var2.a(lVar, new k53.m0(u0Var2, 19081));
            return;
        }
        if (menuItem.getItemId() == 2) {
            android.content.Context context3 = activityC15919x390706d3.f221647d;
            int i27 = activityC15919x390706d3.f221657q + 1;
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(context3, 87, 8768, i27 > 100 ? 100 : i27, 88, activityC15919x390706d3.f221662v, lj0.a.a(activityC15919x390706d3.f221658r, activityC15919x390706d3.X6(lVar)));
            android.os.Bundle V6 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3.V6(activityC15919x390706d3, activityC15919x390706d3.f221657q);
            V6.putBoolean("game_straight_to_publish", activityC15919x390706d3.f221661u);
            if (com.p314xaae8f345.mm.vfs.w6.j(lVar.f433150v)) {
                ((i53.x3) ((m33.v1) i95.n0.c(m33.v1.class))).Ai(activityC15919x390706d3.f221647d, activityC15919x390706d3.f221658r, lVar.f433147s, lVar.f433150v, null, null, 19722, V6, activityC15919x390706d3.f221662v);
            } else {
                ((i53.x3) ((m33.v1) i95.n0.c(m33.v1.class))).Ai(activityC15919x390706d3.f221647d, activityC15919x390706d3.f221658r, lVar.f433147s, null, lVar.f433140i, lVar.f433139h, 19722, V6, activityC15919x390706d3.f221662v);
            }
        }
    }
}
