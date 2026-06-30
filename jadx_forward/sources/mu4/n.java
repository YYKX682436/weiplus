package mu4;

/* loaded from: classes7.dex */
public final class n {
    public n(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 b(mu4.n r9, mu4.j r10, yz5.q r11, yz5.q r12, boolean r13, int r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mu4.n.b(mu4.n, mu4.j, yz5.q, yz5.q, boolean, int, java.lang.Object):com.tencent.mm.plugin.appbrand.appcache.u3");
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 c(mu4.j jVar, yz5.q qVar, yz5.q qVar2, int i17) {
        try {
            boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(jVar.f412960c);
            java.lang.String str = jVar.f412960c;
            java.lang.String str2 = jVar.f412962e;
            if (j17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 y8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8(str);
                y8Var.a();
                int b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.a.b(y8Var);
                mu4.n nVar = mu4.w.f412985y;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebJsEngine", "#readPkg " + str2 + " resVersion = " + b17 + " assetsVersion=" + i17);
                if (((java.lang.Boolean) qVar.mo147xb9724478(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(b17), y8Var)).booleanValue()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebJsEngine", "#readPkg " + str2 + " use res");
                    pm0.v.K(null, new mu4.l(jVar, b17));
                    if (qVar2 != null) {
                        qVar2.mo147xb9724478(mu4.o.f412969f, java.lang.Integer.valueOf(b17), "");
                    }
                    return y8Var;
                }
                java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v3.f157538a;
                try {
                    y8Var.close();
                } catch (java.io.IOException unused) {
                }
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20781, str2, 0, 0, 0, "", "", 1);
                jx3.f.INSTANCE.w(1454L, 122L, 1L);
            }
        } catch (java.lang.Throwable th6) {
            mu4.n nVar2 = mu4.w.f412985y;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebJsEngine", th6, "readResPkg", new java.lang.Object[0]);
        }
        return null;
    }

    public final mu4.j a(java.lang.String file, boolean z17, java.lang.String str, java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(file, "file");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.lang.String str2 = mu4.w.A + '/' + file;
        java.lang.String concat = "jsapi/".concat(file);
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return (z65.c.a() && com.p314xaae8f345.mm.vfs.w6.j(str2)) ? new mu4.j(true, z17, str2, concat, appId) : new mu4.j(false, z17, str, concat, appId);
    }
}
