package r61;

/* loaded from: classes9.dex */
public abstract class z1 {
    public static r61.x0 a(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = "SELECT *,rowid FROM OldAccountFriend  WHERE encryptUsername = " + d95.b0.O(str2) + " AND oldUsername = " + d95.b0.O(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoverFriendLogic", "get old acct friend, sql %s", str3);
        android.database.Cursor m145256x1d3f4980 = ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).wi().m145256x1d3f4980(str3, new java.lang.String[0]);
        if (m145256x1d3f4980 == null) {
            return null;
        }
        try {
            if (!m145256x1d3f4980.moveToFirst()) {
                return null;
            }
            r61.x0 x0Var = new r61.x0();
            x0Var.mo9015xbf5d97fd(m145256x1d3f4980);
            return x0Var;
        } finally {
            m145256x1d3f4980.close();
        }
    }

    public static java.util.List b(java.lang.String str, int i17) {
        java.lang.String str2;
        if (i17 > 0) {
            str2 = "SELECT *,rowid FROM OldAccountFriend  WHERE showHead = " + i17 + " AND oldUsername = " + d95.b0.O(str) + " ORDER BY pinyinName";
        } else {
            str2 = "SELECT *,rowid FROM OldAccountFriend  WHERE oldUsername = " + d95.b0.O(str) + " ORDER BY showHead,pinyinName";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor m145256x1d3f4980 = ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).wi().m145256x1d3f4980(str2, new java.lang.String[0]);
        if (m145256x1d3f4980 != null) {
            while (m145256x1d3f4980.moveToNext()) {
                try {
                    r61.x0 x0Var = new r61.x0();
                    x0Var.mo9015xbf5d97fd(m145256x1d3f4980);
                    com.p314xaae8f345.mm.p2621x8fb0427b.p7 W0 = ((com.p314xaae8f345.mm.p2621x8fb0427b.q7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ui()).W0(x0Var.f67922xdd77ad16);
                    if (W0 == null || !x0Var.f67922xdd77ad16.equals(W0.f66493x114ef53e)) {
                        arrayList.add(new r61.y1(x0Var));
                    } else {
                        arrayList.add(new r61.y1(x0Var, W0));
                    }
                } finally {
                    m145256x1d3f4980.close();
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoverFriendLogic", "get recover friend, sql %s, get %d data", str2, java.lang.Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public static void c(java.lang.String str, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.lang.String str2 = "SELECT *,rowid FROM OldAccountFriend  WHERE encryptUsername = " + d95.b0.O(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoverFriendLogic", "update old acct friend add state, sql %s", str2);
        android.database.Cursor m145256x1d3f4980 = ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).wi().m145256x1d3f4980(str2, new java.lang.String[0]);
        if (m145256x1d3f4980 != null) {
            try {
                if (m145256x1d3f4980.moveToFirst()) {
                    r61.x0 x0Var = new r61.x0();
                    x0Var.mo9015xbf5d97fd(m145256x1d3f4980);
                    x0Var.f67921xd370a215 = i17;
                    ((r61.u1) ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).wi()).mo11260x413cb2b4(x0Var);
                }
            } finally {
                m145256x1d3f4980.close();
            }
        }
    }
}
