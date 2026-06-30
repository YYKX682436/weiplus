package x85;

/* loaded from: classes10.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x85.c f534123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f534124b;

    public e(x85.c cVar, java.lang.String str) {
        this.f534123a = cVar;
        this.f534124b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.p64 p64Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetLensInfoTask", "GetLensInfo: " + i17 + ", " + i18 + ", " + fVar.f152150c);
        if (i17 == 0 && i18 == 0) {
            r45.vh3 vh3Var = (r45.vh3) fVar.f152151d;
            if (vh3Var != null && (p64Var = vh3Var.f469766d) != null) {
                synchronized (v85.a.f515629a) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    jt0.j jVar = v85.a.f515630b;
                    jz5.l lVar = (jz5.l) jVar.get(p64Var.f464325d);
                    if (lVar == null) {
                        lVar = new jz5.l(p64Var, java.lang.Long.valueOf(elapsedRealtime));
                    }
                    jVar.put(p64Var.f464325d, lVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LensInfoMemCache", "update: " + p64Var.f464325d + ", " + elapsedRealtime);
                }
            }
            x85.c cVar = this.f534123a;
            if (cVar == null) {
                return null;
            }
            r45.vh3 vh3Var2 = (r45.vh3) fVar.f152151d;
            cVar.a(0, vh3Var2 != null ? vh3Var2.f469766d : null);
            return jz5.f0.f384359a;
        }
        if (i17 != 4 || i18 != -436) {
            x85.c cVar2 = this.f534123a;
            if (cVar2 == null) {
                return null;
            }
            cVar2.a(1, null);
            return jz5.f0.f384359a;
        }
        x85.c cVar3 = this.f534123a;
        if (cVar3 != null) {
            cVar3.a(2, null);
        }
        v85.a aVar = v85.a.f515629a;
        java.lang.String lensId = this.f534124b;
        synchronized (aVar) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lensId, "lensId");
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LensInfoMemCache", "markInvalid: " + lensId + ", " + elapsedRealtime2);
            v85.a.f515631c.put(lensId, java.lang.Long.valueOf(elapsedRealtime2));
        }
        return jz5.f0.f384359a;
    }
}
