package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61;

/* loaded from: classes12.dex */
public abstract class y {
    public static java.util.List a(int i17) {
        java.util.List list;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
        d95.b0 b0Var = !l0Var.f271219e ? null : l0Var.f271215a.f271232d;
        if (b0Var == null) {
            return java.util.Collections.emptyList();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("urlKey");
        java.util.Locale locale = java.util.Locale.US;
        sb6.append(java.lang.String.format(locale, " like '%d.%%.data'", java.lang.Integer.valueOf(i17)));
        sb6.append(" and groupId1=");
        sb6.append(java.lang.String.format(locale, "'%s'", "CheckResUpdate"));
        try {
            android.database.Cursor D = b0Var.D("ResDownloaderRecordTable", null, sb6.toString(), null, null, null, null, 2);
            if (D != null) {
                try {
                    if (!D.isClosed()) {
                        if (D.moveToFirst()) {
                            java.util.LinkedList linkedList = new java.util.LinkedList();
                            do {
                                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 n0Var = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0();
                                n0Var.mo9015xbf5d97fd(D);
                                linkedList.add(n0Var);
                            } while (D.moveToNext());
                            list = linkedList;
                        } else {
                            list = java.util.Collections.emptyList();
                        }
                        D.close();
                        return list;
                    }
                } finally {
                }
            }
            java.util.List emptyList = java.util.Collections.emptyList();
            if (D != null) {
                D.close();
            }
            return emptyList;
        } catch (com.p314xaae8f345.p3121x37984a.C26877xc3b63269 e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CheckResUpdateRecordLogic", "queryAllWithType(%d) get exception:%s", java.lang.Integer.valueOf(i17), e17);
            return java.util.Collections.emptyList();
        }
    }
}
