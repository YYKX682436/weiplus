package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes12.dex */
public final class j3 implements e04.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17308x95e1b65 f241103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f241104b;

    public j3(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17308x95e1b65 activityC17308x95e1b65, java.lang.String str) {
        this.f241103a = activityC17308x95e1b65;
        this.f241104b = str;
    }

    @Override // e04.q2
    public void a(java.lang.String str, e04.r2 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17308x95e1b65 activityC17308x95e1b65 = this.f241103a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, activityC17308x95e1b65.f240921u)) {
            long currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - activityC17308x95e1b65.D[1]);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039 c6797x4bb2039 = activityC17308x95e1b65.C;
            c6797x4bb2039.f141281g = currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationResultUI", "scanTranslate upload img cost %d, errCode: %d", java.lang.Long.valueOf(c6797x4bb2039.f141281g), java.lang.Integer.valueOf(result.f327612a));
            c6797x4bb2039.f141287m = c6797x4bb2039.b("FileID", result.f327613b, true);
            c6797x4bb2039.f141288n = c6797x4bb2039.b("AesKey", result.f327614c, true);
            int i17 = result.f327612a;
            java.lang.String str2 = this.f241104b;
            if (i17 == -21009 || i17 == -21000) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.g3(activityC17308x95e1b65));
                c6797x4bb2039.f141280f = 3L;
            } else if (i17 != 0) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.i3(activityC17308x95e1b65));
                c6797x4bb2039.f141280f = 3L;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(result.f327613b, result.f327614c)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.e3(activityC17308x95e1b65));
                c6797x4bb2039.f141280f = 3L;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationResultUI", "fileId %s", result.f327613b);
                gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.e0(activityC17308x95e1b65.f240924x, (int) com.p314xaae8f345.mm.vfs.w6.k(str2), result.f327613b, result.f327614c, 1, 2));
            }
            if (activityC17308x95e1b65.f240925y != 1 || activityC17308x95e1b65.B == 0) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("delete tmp path %s", str2);
            com.p314xaae8f345.mm.vfs.w6.h(str2);
        }
    }
}
