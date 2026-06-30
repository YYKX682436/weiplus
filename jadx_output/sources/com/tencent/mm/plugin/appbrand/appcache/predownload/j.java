package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes4.dex */
public final class j {
    public j(kotlin.jvm.internal.i iVar) {
    }

    public static final int b(java.lang.String str, r45.ff7 ff7Var) {
        if (!kz5.z.F(qq5.a.f365998e, ff7Var.f374299o)) {
            str = str + '$' + ff7Var.f374298n;
        }
        return str.hashCode();
    }

    public final void a(java.util.List cmdList, boolean z17) {
        r45.ff7 ff7Var;
        r45.ff7 ff7Var2;
        r45.ff7 ff7Var3;
        kotlin.jvm.internal.o.g(cmdList, "cmdList");
        if (z17) {
            java.util.Iterator it = cmdList.iterator();
            while (it.hasNext()) {
                r45.ef7 ef7Var = ((r45.lj6) it.next()).f379530e;
                if (ef7Var != null && (ff7Var3 = ef7Var.f373412e) != null && ff7Var3.f374299o != 6) {
                    ef7Var.f373412e = null;
                }
            }
            return;
        }
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        java.util.Iterator it6 = cmdList.iterator();
        while (it6.hasNext()) {
            r45.lj6 lj6Var = (r45.lj6) it6.next();
            r45.ef7 ef7Var2 = lj6Var.f379530e;
            if (ef7Var2 != null && (ff7Var2 = ef7Var2.f373412e) != null) {
                int i17 = ff7Var2.f374299o;
                java.lang.String Appid = lj6Var.f379531f;
                kotlin.jvm.internal.o.f(Appid, "Appid");
                r45.ef7 ef7Var3 = lj6Var.f379530e;
                kotlin.jvm.internal.o.d(ef7Var3);
                r45.ff7 ff7Var4 = ef7Var3.f373412e;
                kotlin.jvm.internal.o.d(ff7Var4);
                int b17 = b(Appid, ff7Var4);
                sparseIntArray.put(b17, java.lang.Math.max(i17, sparseIntArray.get(b17, -1)));
            }
        }
        java.util.Iterator it7 = cmdList.iterator();
        while (it7.hasNext()) {
            r45.lj6 lj6Var2 = (r45.lj6) it7.next();
            r45.ef7 ef7Var4 = lj6Var2.f379530e;
            if (ef7Var4 != null && (ff7Var = ef7Var4.f373412e) != null) {
                int i18 = ff7Var.f374299o;
                boolean z18 = true;
                if (kz5.z.F(qq5.a.f365994a, i18)) {
                    java.lang.String Appid2 = lj6Var2.f379531f;
                    kotlin.jvm.internal.o.f(Appid2, "Appid");
                    r45.ef7 ef7Var5 = lj6Var2.f379530e;
                    kotlin.jvm.internal.o.d(ef7Var5);
                    r45.ff7 ff7Var5 = ef7Var5.f373412e;
                    kotlin.jvm.internal.o.d(ff7Var5);
                    if (i18 >= sparseIntArray.get(b(Appid2, ff7Var5), -1)) {
                        z18 = false;
                    }
                }
                if (z18) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preprocessGetCodeList remove cmd for appId:");
                    sb6.append(lj6Var2.f379531f);
                    sb6.append(", key:");
                    r45.ef7 ef7Var6 = lj6Var2.f379530e;
                    kotlin.jvm.internal.o.d(ef7Var6);
                    r45.ff7 ff7Var6 = ef7Var6.f373412e;
                    kotlin.jvm.internal.o.d(ff7Var6);
                    sb6.append(ff7Var6.f374298n);
                    sb6.append(", type:");
                    sb6.append(i18);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiPreDownloadCode", sb6.toString());
                    lj6Var2.f379530e.f373412e = null;
                }
            }
        }
    }
}
