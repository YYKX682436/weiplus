package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes5.dex */
public class b4 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.c4 f219008n;

    public b4(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.c4 c4Var, com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.u3 u3Var) {
        this.f219008n = c4Var;
    }

    @Override // p13.c
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.c4 c4Var = this.f219008n;
        if (c4Var.f219017f == null) {
            c4Var.f219017f = com.p314xaae8f345.mm.vfs.w6.M("/sdcard/test_insert_msg_words.txt").split(",");
        }
        if (c4Var.f219018g == null) {
            c4Var.f219018g = new java.util.ArrayList();
            android.database.Cursor r17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().r();
            while (r17.moveToNext()) {
                c4Var.f219018g.add(r17.getString(0));
            }
            r17.close();
        }
        if (c4Var.f219017f != null) {
            int[] iArr = {1000, 2000, 5000, 10000, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059, 50000, 100000};
            for (int i17 = 0; i17 < 7; i17++) {
                for (int i18 = 0; i18 < iArr[i17]; i18++) {
                    java.lang.String[] strArr = c4Var.f219017f;
                    java.util.Random random = new java.util.Random();
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                    for (int i19 = 0; i19 < 300; i19++) {
                        stringBuffer.append(strArr[random.nextInt(strArr.length - 1)]);
                    }
                    java.lang.String stringBuffer2 = stringBuffer.toString();
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    f9Var.m124850x7650bebc(1);
                    f9Var.j1(1);
                    f9Var.r1(4);
                    f9Var.d1(stringBuffer2);
                    f9Var.u1((java.lang.String) c4Var.f219018g.get(i17));
                    f9Var.e1(java.lang.System.currentTimeMillis());
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSSearchTestLogic", "InsertMsgInfoTask %d %d %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(iArr[i17]), java.lang.Integer.valueOf(stringBuffer2.length()), java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
                }
            }
        }
        return true;
    }
}
