package x85;

/* loaded from: classes10.dex */
public final class f extends x85.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(im5.b bVar, java.lang.String lensId, x85.c cVar) {
        super(bVar, lensId, cVar);
        r45.p64 p64Var;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lensId, "lensId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetLensInfoTask", "GetLensInfoTaskImpl: ".concat(lensId));
        v85.a aVar = v85.a.f515629a;
        synchronized (aVar) {
            jt0.j jVar = v85.a.f515630b;
            jz5.l lVar = (jz5.l) jVar.get(lensId);
            if (lVar != null) {
                long longValue = ((java.lang.Number) lVar.f384367e).longValue();
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (android.os.SystemClock.elapsedRealtime() - longValue > 180000) {
                    jVar.mo141381xc84af884(lensId);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LensInfoMemCache", "get: expired " + lensId + ", " + ((java.lang.Number) lVar.f384367e).longValue());
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LensInfoMemCache", "get: from cache " + lensId + ", " + ((java.lang.Number) lVar.f384367e).longValue());
                    p64Var = (r45.p64) lVar.f384366d;
                }
            }
            p64Var = null;
        }
        synchronized (aVar) {
            jt0.j jVar2 = v85.a.f515631c;
            java.lang.Long l17 = (java.lang.Long) jVar2.get(lensId);
            if (l17 != null) {
                long longValue2 = l17.longValue();
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (android.os.SystemClock.elapsedRealtime() - longValue2 > 180000) {
                    jVar2.mo141381xc84af884(lensId);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LensInfoMemCache", "isInvalid: expired " + lensId + ", " + longValue2);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LensInfoMemCache", "isInvalid: from cache " + lensId + " invalid");
                    z17 = true;
                }
            }
            z17 = false;
        }
        if (z17) {
            if (cVar != null) {
                cVar.a(2, null);
            }
        } else {
            if (p64Var != null) {
                if (cVar != null) {
                    cVar.a(0, p64Var);
                    return;
                }
                return;
            }
            x85.a aVar2 = new x85.a(lensId);
            aVar2.f152182i = true;
            pq5.g l18 = aVar2.l();
            l18.H(new x85.e(cVar, lensId));
            if (bVar != null) {
                l18.f(bVar);
            }
        }
    }
}
