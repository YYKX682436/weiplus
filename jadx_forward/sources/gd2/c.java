package gd2;

/* loaded from: classes8.dex */
public final class c implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.i f352058d;

    public c(gd2.i iVar) {
        this.f352058d = iVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        gd2.i iVar = this.f352058d;
        if (itemId == 1) {
            java.lang.String str = iVar.f352066b;
            if (r26.n0.N(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderCommentImageMenu", "share image to friend fail, imgPath is blank");
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(str)) {
                return;
            }
            i95.m c17 = i95.n0.c(n13.b0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            jd5.a aVar = new jd5.a();
            aVar.p(str);
            n13.r rVar = new n13.r();
            rVar.f415650a = true;
            rVar.f415653d.f415672a = 9;
            i95.m c18 = i95.n0.c(n13.b0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ((dk5.b0) ((n13.b0) c18)).Bi(iVar.f352065a, aVar, rVar);
            return;
        }
        if (itemId != 3) {
            if (itemId != 6) {
                return;
            }
            java.lang.String str2 = iVar.f352066b;
            if (r26.n0.N(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommentImageMenu", "gotoCircleToSearchUI curFilename is blank");
                return;
            }
            i95.m c19 = i95.n0.c(tg0.f1.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            ((sg0.e) ((tg0.f1) c19)).wi(iVar.f352065a, 3, 2, str2);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 a17 = tm3.a.a(iVar.f352065a);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommentImageMenu", "favImage failed: activity is null");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        i95.m c27 = i95.n0.c(o72.c5.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.g(c5303xc75d2f73, 1, iVar.f352066b);
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87856i = a17;
        c4Var.f87860m = 32;
        c5303xc75d2f73.e();
    }
}
