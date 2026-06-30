package ee1;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final ee1.g f333112a = new ee1.g();

    public static final ee1.e a(ee1.g gVar, com.p314xaae8f345.mm.p944x882e457a.f fVar) {
        gVar.getClass();
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        java.lang.String str = fVar.f152150c;
        r45.ss0 ss0Var = (r45.ss0) fVar.f152151d;
        if (i17 != 0 || i18 != 0) {
            return new ee1.b(i17, i18, str);
        }
        if (ss0Var == null) {
            return new ee1.b(i17, i18, "resp is null");
        }
        int i19 = ss0Var.f467492d;
        if (i19 != 0) {
            java.lang.String str2 = ss0Var.f467493e;
            if (str2 == null) {
                str2 = "";
            }
            return new ee1.a(i19, str2);
        }
        java.util.LinkedList linkedList = ss0Var.f467494f;
        java.util.List list = kz5.p0.f395529d;
        java.util.List S0 = linkedList != null ? kz5.n0.S0(linkedList) : list;
        java.util.LinkedList linkedList2 = ss0Var.f467495g;
        if (linkedList2 != null) {
            list = kz5.n0.S0(linkedList2);
        }
        return new ee1.c(S0, list);
    }

    public static final ee1.e b(java.lang.String appId, java.util.List fpanidList, java.util.List issuerIdList) {
        jz5.f0 f0Var = jz5.f0.f384359a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fpanidList, "fpanidList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(issuerIdList, "issuerIdList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.FilterHelper", "requestSync, appId=%s, fpanid=%d, issuer=%d", appId, java.lang.Integer.valueOf(fpanidList.size()), java.lang.Integer.valueOf(issuerIdList.size()));
        ee1.h hVar = new ee1.h(appId, fpanidList, issuerIdList);
        boolean z17 = true;
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        ee1.e[] eVarArr = new ee1.e[1];
        try {
            hVar.l().K(new ee1.f(eVarArr, countDownLatch));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.FilterHelper", "requestSync, cgi.run() threw: " + th6.getClass().getSimpleName() + ": " + th6.getMessage());
            z17 = false;
        }
        if (!z17) {
            return new ee1.b(-1, -1, "cgi.run() failed");
        }
        try {
            if (countDownLatch.await(15000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                ee1.e eVar = eVarArr[0];
                return eVar == null ? new ee1.d("outcome unset") : eVar;
            }
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                hVar.j();
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
            } catch (java.lang.Throwable th7) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
            }
            return new ee1.d("await timeout 15000ms");
        } catch (java.lang.InterruptedException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.FilterHelper", "requestSync, interrupted: " + e17.getMessage());
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                hVar.j();
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
            } catch (java.lang.Throwable th8) {
                p3321xbce91901.C29043x91b2b43d.Companion companion4 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th8));
            }
            return new ee1.d("interrupted");
        }
    }
}
