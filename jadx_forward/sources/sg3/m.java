package sg3;

/* loaded from: classes4.dex */
public class m implements java.lang.Runnable {
    public m(sg3.r rVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.w7 w7Var = (com.p314xaae8f345.mm.p2621x8fb0427b.w7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Vi();
        w7Var.getClass();
        android.database.Cursor B = w7Var.f277842d.B(java.lang.String.format("select count(rowid) from %s", "FriendUser"), null);
        int i17 = 0;
        if (B != null && B.moveToFirst()) {
            i17 = B.getInt(0);
            B.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FriendUserStorage", "#recordCnts#, count:" + i17);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.w7 w7Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.w7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Vi();
        w7Var2.getClass();
        int mo70514xb06685ab = w7Var2.f277842d.mo70514xb06685ab("FriendUser", "(modifyTime< ?)", new java.lang.String[]{"" + (java.lang.System.currentTimeMillis() - (7 * 86400000))});
        if (mo70514xb06685ab > 0) {
            w7Var2.m145262xf35bbb4();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FriendUserStorage", "#Clear Records#, result:" + mo70514xb06685ab);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20460, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(mo70514xb06685ab));
    }
}
