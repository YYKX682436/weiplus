package js1;

/* loaded from: classes7.dex */
public final class g implements js1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 f383018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zq1.g0 f383019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f383020c;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2, zq1.g0 g0Var, long j17) {
        this.f383018a = c12965xc9712d2;
        this.f383019b = g0Var;
        this.f383020c = j17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11, types: [ks1.k] */
    /* JADX WARN: Type inference failed for: r15v5, types: [ks1.i] */
    /* JADX WARN: Type inference failed for: r15v6, types: [ks1.l] */
    /* JADX WARN: Type inference failed for: r15v7, types: [ks1.a] */
    /* JADX WARN: Type inference failed for: r15v8, types: [ks1.b] */
    /* JADX WARN: Type inference failed for: r15v9, types: [ks1.j] */
    @Override // js1.a
    public void a(js1.b bVar, boolean z17) {
        ks1.h hVar;
        ks1.h hVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2 = this.f383018a;
        boolean a17 = js1.s.a(bVar, c12965xc9712d2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferRequestServiceImpl", "[transferRequestInMM] getToken onResult tokenValid: " + a17 + ", fromCache: " + z17);
        int i17 = 2;
        zq1.g0 g0Var = this.f383019b;
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TransferRequestServiceImpl", "[transferRequestInMM] onResult getToken failed");
            if (g0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12966xaa8af0d6 c12966xaa8af0d6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12966xaa8af0d6();
                c12966xaa8af0d6.f175459d = 2;
                c12966xaa8af0d6.f175460e = "transfer get token failed";
                c12966xaa8af0d6.f175462g = !z17;
                c12966xaa8af0d6.f175463h = c12965xc9712d2.f175456q;
                g0Var.b(c12966xaa8af0d6);
                return;
            }
            return;
        }
        js1.f fVar = new js1.f(g0Var, z17, this.f383020c);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = js1.m.f383025d;
        int i18 = c12965xc9712d2.f175446d;
        java.lang.String str = c12965xc9712d2.f175448f;
        js1.s sVar = js1.s.f383032a;
        r45.yh4 yh4Var = str == null ? null : (r45.yh4) js1.s.f383036e.get(str);
        if (yh4Var == null) {
            hVar = null;
        } else {
            if (i18 == 3 || i18 == 4) {
                i17 = 1;
            } else if (i18 != 5 && i18 != 6) {
                i17 = 0;
            }
            int i19 = yh4Var.f472618e;
            java.lang.String cgiUrl = yh4Var.f472619f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cgiUrl, "cgiUrl");
            hVar = new ks1.h(i19, cgiUrl, i17, sVar);
        }
        if (hVar == null) {
            switch (i18) {
                case 1:
                    hVar2 = new ks1.i(sVar);
                    hVar = hVar2;
                    break;
                case 2:
                    hVar2 = new ks1.l(sVar);
                    hVar = hVar2;
                    break;
                case 3:
                    hVar2 = new ks1.a(sVar);
                    hVar = hVar2;
                    break;
                case 4:
                    hVar2 = new ks1.b(sVar);
                    hVar = hVar2;
                    break;
                case 5:
                    hVar2 = new ks1.j(sVar);
                    hVar = hVar2;
                    break;
                case 6:
                    hVar2 = new ks1.k(sVar);
                    hVar = hVar2;
                    break;
                default:
                    hVar = null;
                    break;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferRequestServiceImpl", "createTransferRequester scope:" + str + " use dynamicRoutingRequester, cgiId:" + hVar.f393127b + ", cgiUrl:" + hVar.f393128c);
        }
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TransferRequestServiceImpl", "transferRequest invalid transfer type");
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new ks1.e(hVar, c12965xc9712d2, new js1.e(fVar), null), 3, null);
        }
    }
}
