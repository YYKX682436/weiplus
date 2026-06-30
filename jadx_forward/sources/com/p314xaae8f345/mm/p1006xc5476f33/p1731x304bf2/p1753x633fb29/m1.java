package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class m1 implements java.lang.Runnable {
    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.i1 i1Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        m53.z3 z3Var;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.e() != null) {
            z3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220914a.f36960xd7c0d538;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.s();
            z3Var = null;
        }
        if (z3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameMessageService", "getGameMessageDBStrategy fail,gameMessageDBStrategy is null");
            return;
        }
        int P0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().P0(65536);
        n53.a.c(1000, P0, 0, "", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameMessageService", "gamelog.clean, start clean, record count:%d", java.lang.Integer.valueOf(P0));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = z3Var.f405765f.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            m53.y yVar = (m53.y) it.next();
            if (yVar.f405713d == 0 && yVar.f405715f == 0) {
                yVar.f405715f = 14;
            }
            if (yVar.f405715f != 0) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().y0(yVar.f405713d, java.lang.System.currentTimeMillis() - (yVar.f405715f * 86400000));
                if (yVar.f405713d == 0) {
                    z17 = true;
                }
            }
            if (yVar.f405714e != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.o1 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di();
                int i17 = yVar.f405713d;
                int i18 = yVar.f405714e;
                Di.getClass();
                android.database.Cursor m145256x1d3f4980 = Di.m145256x1d3f4980("select count(*) from GameRawMessage where showType = " + i17, new java.lang.String[0]);
                if (m145256x1d3f4980 != null) {
                    if (m145256x1d3f4980.moveToFirst() && m145256x1d3f4980.getInt(0) > i18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameMessageStorage", "delMessageByMsgTypeAndQuantity  ret:%s", java.lang.Boolean.valueOf(Di.m145253xb158737d("GameRawMessage", "delete from GameRawMessage where msgId < (" + ("select msgId from GameRawMessage where showType = " + i17 + " order by msgId desc limit 1 offset " + i18) + ") and showType = " + i17)));
                    }
                    m145256x1d3f4980.close();
                }
            }
        }
        if (!z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().y0(0, java.lang.System.currentTimeMillis() - 1209600000);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameMessageService", "delExpiredMessage costTime:" + currentTimeMillis2);
        n53.a.c(1001, currentTimeMillis2, 0, "", 0);
    }
}
