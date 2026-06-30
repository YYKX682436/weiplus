package com.p314xaae8f345.mm.p1006xc5476f33.fts;

/* loaded from: classes11.dex */
public class p implements o13.v {
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 a(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 L = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(str);
        if (L == null) {
            L = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            android.database.Cursor e17 = e("SELECT ROWID, username, alias, conRemark, nickname, verifyFlag, type, lvbuff, contactLabelIds FROM rcontact WHERE username = ? AND deleteFlag=0;", new java.lang.String[]{str}, 2);
            if (e17.moveToNext()) {
                L.E2 = e17.getLong(0);
                L.X1(e17.getString(1));
                L.k1(e17.getString(2));
                L.n1(e17.getString(3));
                L.M1(e17.getString(4));
                L.Z1(e17.getInt(5));
                L.l3(e17.getInt(6));
                L.L1(e17.getBlob(7));
                L.r1(e17.getString(8));
                L.z1(0);
            }
            e17.close();
        }
        return L;
    }

    public long b(java.lang.String str) {
        android.database.Cursor e17 = e("SELECT conversationTime FROM rconversation WHERE username=?;", new java.lang.String[]{str}, 2);
        long j17 = (e17 == null || !e17.moveToFirst()) ? 0L : e17.getLong(0);
        if (e17 != null) {
            e17.close();
        }
        return j17;
    }

    public p13.k c(long j17) {
        android.database.Cursor e17 = e("SELECT labelName, lastUseTime FROM ContactLabel WHERE labelID = ?;", new java.lang.String[]{java.lang.String.valueOf(j17)});
        try {
            if (!e17.moveToNext()) {
                e17.close();
                return null;
            }
            p13.k kVar = new p13.k();
            kVar.f432640a = j17;
            kVar.f432641b = e17.getString(0);
            kVar.f432642c = e17.getLong(1);
            e17.close();
            return kVar;
        } catch (java.lang.Throwable th6) {
            if (e17 != null) {
                try {
                    e17.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public java.util.List d(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str.endsWith("\u0000")) {
            str = str.substring(0, str.length() - 1);
        }
        if (str.length() == 0) {
            return arrayList;
        }
        android.database.Cursor e17 = e(java.lang.String.format("SELECT labelName FROM ContactLabel WHERE labelID IN (%s);", str), null, 2);
        while (e17.moveToNext()) {
            arrayList.add(e17.getString(0));
        }
        e17.close();
        return arrayList;
    }

    public android.database.Cursor e(java.lang.String str, java.lang.String[] strArr, int i17) {
        gm0.j1.i();
        return gm0.j1.u().f354686f.f(str, strArr, i17);
    }

    public android.database.Cursor e(java.lang.String str, java.lang.String[] strArr) {
        gm0.j1.i();
        return gm0.j1.u().f354686f.B(str, strArr);
    }
}
