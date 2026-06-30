package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public abstract class c3 {
    public static final java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b3 b3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, pl1.i iVar) {
        java.lang.String a17;
        java.lang.String b17;
        if (b3Var == null || v5Var == null || iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandSecureInputWidget", "getEncryptedData, this: " + b3Var + ", env: " + v5Var + ", inputParams: " + iVar);
            throw new java.lang.IllegalStateException("env error");
        }
        java.lang.String str = iVar.H;
        if (str == null) {
            throw new java.lang.IllegalStateException("need certPath");
        }
        java.lang.Long l17 = iVar.K;
        if (l17 == null) {
            throw new java.lang.IllegalStateException("need timeStamp");
        }
        long longValue = l17.longValue();
        java.lang.Long l18 = iVar.L;
        if (l18 == null) {
            throw new java.lang.IllegalStateException("need nonce");
        }
        long longValue2 = l18.longValue();
        java.lang.String str2 = iVar.f438148J;
        java.util.List safePasswordCompatList = iVar.M;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(safePasswordCompatList, "safePasswordCompatList");
        if (str2 == null && safePasswordCompatList.isEmpty()) {
            throw new java.lang.IllegalStateException("need salt or customHash");
        }
        java.lang.String a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.a6.a();
        if (a18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b3Var.m53448x15fc1322(), "getEncryptedData, rootPath is null");
            throw new java.lang.IllegalStateException("env error");
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, b3Var.f172900x)) {
            a17 = b3Var.f172901y;
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b3Var.m53448x15fc1322(), "readCertPem, cachedCertPem is null");
                throw new java.lang.IllegalStateException("certPath is illegal");
            }
        } else {
            try {
                a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n4.f173089a.a(v5Var, str);
                b3Var.f172901y = a17;
                b3Var.f172900x = str;
            } catch (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o4 e17) {
                throw new java.lang.IllegalStateException(e17.getMessage());
            }
        }
        wo.w0.g(true);
        if (!b3Var.m53450x848eb727().m121727x1a180d29(a17, a18, wo.w0.g(true))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b3Var.m53448x15fc1322(), "getEncryptedData, setCertContext fail");
            throw new java.lang.IllegalStateException("sdk error:" + b3Var.m53450x848eb727().m121725x75feee5c());
        }
        if (safePasswordCompatList.isEmpty()) {
            com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8 m53450x848eb727 = b3Var.m53450x848eb727();
            m53450x848eb727.m121731x764fefd8(str2);
            m53450x848eb727.m121732x5d476ab4(longValue);
            m53450x848eb727.m121729x536df8ad(longValue2);
            b17 = m53450x848eb727.m121724xb3b5d7d8();
        } else {
            b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h6.f173015a.b(b3Var.m53450x848eb727(), safePasswordCompatList, longValue, longValue2);
        }
        b3Var.m53448x15fc1322();
        if (b17 != null) {
            return b17;
        }
        throw new java.lang.IllegalStateException("sdk error:" + b3Var.m53450x848eb727().m121725x75feee5c());
    }
}
