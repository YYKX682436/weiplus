package re5;

/* loaded from: classes8.dex */
public final class h implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re5.s f476108d;

    public h(re5.s sVar) {
        this.f476108d = sVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        gg3.c cVar;
        int itemId = menuItem.getItemId();
        re5.f[] fVarArr = re5.f.f476106d;
        re5.s sVar = this.f476108d;
        if (itemId == 0) {
            gg3.c cVar2 = sVar.f476128h;
            if (cVar2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 a17 = tm3.a.a(sVar.m80379x76847179());
                java.lang.String str = cVar2.f353261c;
                java.lang.String str2 = cVar2.f353262d;
                com.p314xaae8f345.mm.p2829xfa87f9de.i.f(a17, str, str2, com.p314xaae8f345.mm.vfs.w6.n(str2), 0L, "", true);
                return;
            }
            return;
        }
        if (itemId == 2) {
            gg3.c cVar3 = sVar.f476128h;
            if (cVar3 != null) {
                zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
                android.app.Activity m80379x76847179 = sVar.m80379x76847179();
                re5.n nVar = new re5.n(sVar);
                ((yb0.g) b0Var).getClass();
                com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.e(m80379x76847179, cVar3.f353261c, cVar3.f353262d, nVar);
                return;
            }
            return;
        }
        if (itemId != 1 || (cVar = sVar.f476128h) == null) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        boolean k17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.k(c5303xc75d2f73, 1, cVar.f353261c, cVar.f353262d, "", "");
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        if (!k17) {
            dp.a.m125853x26a183b(sVar.m80379x76847179(), c4Var.f87859l, 1).show();
            return;
        }
        c4Var.f87856i = tm3.a.a(sVar.m80379x76847179());
        c4Var.f87860m = 1;
        c5303xc75d2f73.e();
    }
}
