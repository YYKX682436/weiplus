package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b;

/* loaded from: classes4.dex */
public final class j {
    public j(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final int b(java.lang.String str, r45.ff7 ff7Var) {
        if (!kz5.z.F(qq5.a.f447531e, ff7Var.f455832o)) {
            str = str + '$' + ff7Var.f455831n;
        }
        return str.hashCode();
    }

    public final void a(java.util.List cmdList, boolean z17) {
        r45.ff7 ff7Var;
        r45.ff7 ff7Var2;
        r45.ff7 ff7Var3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdList, "cmdList");
        if (z17) {
            java.util.Iterator it = cmdList.iterator();
            while (it.hasNext()) {
                r45.ef7 ef7Var = ((r45.lj6) it.next()).f461063e;
                if (ef7Var != null && (ff7Var3 = ef7Var.f454945e) != null && ff7Var3.f455832o != 6) {
                    ef7Var.f454945e = null;
                }
            }
            return;
        }
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        java.util.Iterator it6 = cmdList.iterator();
        while (it6.hasNext()) {
            r45.lj6 lj6Var = (r45.lj6) it6.next();
            r45.ef7 ef7Var2 = lj6Var.f461063e;
            if (ef7Var2 != null && (ff7Var2 = ef7Var2.f454945e) != null) {
                int i17 = ff7Var2.f455832o;
                java.lang.String Appid = lj6Var.f461064f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Appid, "Appid");
                r45.ef7 ef7Var3 = lj6Var.f461063e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ef7Var3);
                r45.ff7 ff7Var4 = ef7Var3.f454945e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ff7Var4);
                int b17 = b(Appid, ff7Var4);
                sparseIntArray.put(b17, java.lang.Math.max(i17, sparseIntArray.get(b17, -1)));
            }
        }
        java.util.Iterator it7 = cmdList.iterator();
        while (it7.hasNext()) {
            r45.lj6 lj6Var2 = (r45.lj6) it7.next();
            r45.ef7 ef7Var4 = lj6Var2.f461063e;
            if (ef7Var4 != null && (ff7Var = ef7Var4.f454945e) != null) {
                int i18 = ff7Var.f455832o;
                boolean z18 = true;
                if (kz5.z.F(qq5.a.f447527a, i18)) {
                    java.lang.String Appid2 = lj6Var2.f461064f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Appid2, "Appid");
                    r45.ef7 ef7Var5 = lj6Var2.f461063e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ef7Var5);
                    r45.ff7 ff7Var5 = ef7Var5.f454945e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ff7Var5);
                    if (i18 >= sparseIntArray.get(b(Appid2, ff7Var5), -1)) {
                        z18 = false;
                    }
                }
                if (z18) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preprocessGetCodeList remove cmd for appId:");
                    sb6.append(lj6Var2.f461064f);
                    sb6.append(", key:");
                    r45.ef7 ef7Var6 = lj6Var2.f461063e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ef7Var6);
                    r45.ff7 ff7Var6 = ef7Var6.f454945e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ff7Var6);
                    sb6.append(ff7Var6.f455831n);
                    sb6.append(", type:");
                    sb6.append(i18);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiPreDownloadCode", sb6.toString());
                    lj6Var2.f461063e.f454945e = null;
                }
            }
        }
    }
}
