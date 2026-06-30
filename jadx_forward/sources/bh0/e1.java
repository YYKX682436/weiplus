package bh0;

/* loaded from: classes7.dex */
public final class e1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public e1() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6285xbc305464 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6285xbc305464) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.c30 c30Var = event.f136534g;
        java.lang.String str = c30Var.f87843a;
        if (c30Var.f87847e != 0) {
            return true;
        }
        ku4.z zVar = ku4.z.f394072a;
        if (zVar.j().contains(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6.class);
            if (o6Var != null) {
                o6Var.Uf(str, event.f136534g.f87846d);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebCanvasPkgUpdateEventListener", "pkgUpdateEventListener appId=%s, version=%d, md5=%s", str, java.lang.Integer.valueOf(event.f136534g.f87846d), event.f136534g.f87845c);
            jx3.f.INSTANCE.w(1454L, 62L, 1L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            java.lang.String filePath = event.f136534g.f87844b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filePath, "filePath");
            ((ku5.t0) ku5.t0.f394148d).g(new ku4.k(filePath, str, 0));
            if (com.p314xaae8f345.mm.vfs.w6.j(event.f136534g.f87844b)) {
                java.lang.String str2 = ku4.z.f394073b + '/' + str;
                if (!com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                    com.p314xaae8f345.mm.vfs.w6.u(str2);
                }
                java.lang.String str3 = str2 + '/' + java.lang.System.currentTimeMillis() + ".wcpkg";
                com.p314xaae8f345.mm.vfs.w6.c(event.f136534g.f87844b, str3);
                r45.mt mtVar = new r45.mt();
                mtVar.f462349d = str;
                mtVar.f462350e = new com.p314xaae8f345.mm.vfs.r6(str3).o();
                am.c30 c30Var2 = event.f136534g;
                mtVar.f462351f = c30Var2.f87846d;
                mtVar.f462352g = c30Var2.f87847e;
                mtVar.f462353h = c30Var2.f87845c;
                try {
                    zVar.n(str, mtVar);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WebCanvasPkgUpdateEventListener", "save pkg info fail " + e17.getMessage());
                }
            }
        }
        return false;
    }
}
