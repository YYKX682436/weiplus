package nu4;

/* loaded from: classes7.dex */
public final class k {
    public k(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final int a(java.lang.String str) {
        try {
            return nu4.b0.L.o(str + "-MinBizPkgVersion", 0);
        } catch (java.lang.Exception e17) {
            nu4.k kVar = nu4.b0.f421774J;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebPrefetcherJsEngine", e17, "getMinPkgVersion:" + str, new java.lang.Object[0]);
            return 0;
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 b(java.lang.String str, yz5.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 u3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 u3Var2 = null;
        if (str == null) {
            return null;
        }
        java.util.HashMap hashMap = nu4.b0.V;
        synchronized (hashMap) {
            u3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3) hashMap.get(str);
            if (u3Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 u3Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3) aVar.mo152xb9724478();
                if (u3Var3 != null) {
                    hashMap.put(str, u3Var3);
                    nu4.k kVar = nu4.b0.f421774J;
                    wu5.c cVar = nu4.b0.U;
                    if (cVar != null) {
                        cVar.cancel(false);
                    }
                    nu4.b0.U = null;
                    nu4.b0.U = ((ku5.t0) ku5.t0.f394148d).k(nu4.h.f421785d, 5000L);
                    u3Var2 = u3Var3;
                }
                u3Var = u3Var2;
            }
        }
        return u3Var;
    }

    public final nu4.a c(java.lang.String str) {
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!z65.c.a()) {
            return null;
        }
        mu4.n nVar = mu4.w.f412985y;
        mu4.j a17 = nVar.a("prefetcher/" + str + ".wspkg", true, "", "matchDebugManifest");
        java.lang.String str3 = a17.f412960c;
        if (com.p314xaae8f345.mm.vfs.w6.j(str3)) {
            nu4.k kVar = nu4.b0.f421774J;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherJsEngine", "matchDebugManifest " + str + " path=" + str3);
            try {
                cl0.g gVar = new cl0.g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v3.a(mu4.n.b(nVar, a17, nu4.e.f421782d, null, false, 4, null), "/config.json"));
                r45.l83 l83Var = new r45.l83();
                l83Var.f460759d = gVar.mo15082x48bce8a4("domain");
                r45.m83 m83Var = new r45.m83();
                m83Var.f461763d = gVar.mo15082x48bce8a4(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                m83Var.f461768i = str;
                m83Var.f461764e = gVar.mo15082x48bce8a4("manifest");
                return new nu4.a(l83Var, m83Var, null, 0, 0, true, null, 92, null);
            } catch (java.lang.Exception e17) {
                nu4.k kVar2 = nu4.b0.f421774J;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebPrefetcherJsEngine", e17, "matchDebugManifest", new java.lang.Object[0]);
            }
        }
        return null;
    }
}
