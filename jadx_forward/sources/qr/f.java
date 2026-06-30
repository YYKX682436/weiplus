package qr;

/* loaded from: classes12.dex */
public final class f implements gr.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qr.h f447543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f447544b;

    public f(qr.h hVar, long j17) {
        this.f447543a = hVar;
        this.f447544b = j17;
    }

    public void a(int i17, java.lang.String str, java.lang.String str2) {
        boolean z17;
        qr.h hVar = this.f447543a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f447548g, "uploadCallback: " + i17 + ", " + str);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        hVar.f447550i = java.lang.System.currentTimeMillis() - this.f447544b;
        if (i17 == 0) {
            hVar.getClass();
            java.lang.String str3 = hVar.f447548g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "handleSuccess gifMd5:" + str);
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = hVar.f447547f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.b(20, hVar.f447549h, 0L, 0L, 0L, 0L, hVar.f447550i, 0, 0, c21053xdbf1e5f4.f68649x3933ac0b);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10431, 7, c21053xdbf1e5f4.mo42933xb5885648(), c21053xdbf1e5f4.f68657xb76d85ab, c21053xdbf1e5f4.f68663x861009b5, 0, 0, java.lang.Integer.valueOf(c21053xdbf1e5f4.f68679x22618426), c01.z1.r(), c21053xdbf1e5f4.f68641x3342accf);
            if (!hVar.f447551m || gr.z.b()) {
                hVar.b(fp0.u.f346823f);
                qr.e.f447541a.a(hVar.f447549h, true, str);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str3, "upload wxam but not decode, load gif");
                new cr.k(c21053xdbf1e5f4, new cr.l(c21053xdbf1e5f4, new qr.g(hVar, str)));
                return;
            }
        }
        hVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(hVar.f447548g, "handleFail errorCode:" + i17);
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = hVar.f447547f;
        c21053xdbf1e5f42.getClass();
        c21053xdbf1e5f42.f68650xee2fac53 = 4;
        int i18 = c21053xdbf1e5f42.f68649x3933ac0b;
        long j17 = hVar.f447549h;
        switch (i17) {
            case 1:
                z17 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.f(j17, 1, i18);
                c21053xdbf1e5f42.f68652x452f0c30 = 5;
                break;
            case 2:
                z17 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.f(j17, 2, i18);
                c21053xdbf1e5f42.f68652x452f0c30 = 8;
                break;
            case 3:
            default:
                z17 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.f(j17, 3, i18);
                c21053xdbf1e5f42.f68652x452f0c30 = 6;
                break;
            case 4:
                z17 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.f(j17, 5, i18);
                c21053xdbf1e5f42.f68652x452f0c30 = 4;
                break;
            case 5:
                com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.f(j17, 7, i18);
                z17 = true;
                c21053xdbf1e5f42.f68652x452f0c30 = 1;
                break;
            case 6:
                com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.f(j17, 8, i18);
                c21053xdbf1e5f42.f68652x452f0c30 = 2;
                z17 = true;
                break;
            case 7:
                com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.f(j17, 9, i18);
                c21053xdbf1e5f42.f68652x452f0c30 = 3;
                z17 = true;
                break;
            case 8:
                com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.f(j17, 6, i18);
                c21053xdbf1e5f42.f68652x452f0c30 = 9;
                z17 = true;
                break;
            case 9:
                com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.f(j17, 10, i18);
                c21053xdbf1e5f42.f68652x452f0c30 = 10;
                z17 = true;
                break;
            case 10:
                com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.f(j17, 4, i18);
                c21053xdbf1e5f42.f68652x452f0c30 = 7;
                z17 = true;
                break;
            case 11:
                com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.f(j17, 3, i18);
                c21053xdbf1e5f42.f68652x452f0c30 = 10;
                z17 = true;
                break;
        }
        gr.t.g().m(z17);
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().G2(c21053xdbf1e5f42);
        qr.e.f447541a.a(j17, false, null);
        hVar.b(fp0.u.f346824g);
    }
}
