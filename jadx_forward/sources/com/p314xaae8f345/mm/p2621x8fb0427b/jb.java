package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes4.dex */
public final class jb extends l75.n0 implements xg3.x0 {

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f276595d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(l75.k0 db6) {
        super(db6, com.p314xaae8f345.mm.p2621x8fb0427b.ib.B, "VerifyRecordMsgInfo", dm.qb.f321021p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = com.p314xaae8f345.mm.p2621x8fb0427b.ib.B;
        this.f276595d = db6;
    }

    public boolean D0(com.p314xaae8f345.mm.p2621x8fb0427b.ib item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        long j17 = item.f68088xd09be28e;
        boolean z17 = false;
        if (j17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VerifyRecordMsgInfoStorage", "insertIfNotExists: invalid msgSvrId=" + j17 + ", skip");
            return false;
        }
        l75.k0 k0Var = this.f276595d;
        if (k0Var != null) {
            long F = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            try {
                android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980("SELECT msgSvrId\nFROM VerifyRecordMsgInfo\nWHERE msgSvrId = ?\nLIMIT 1", java.lang.String.valueOf(j17));
                try {
                    boolean moveToFirst = m145256x1d3f4980.moveToFirst();
                    vz5.b.a(m145256x1d3f4980, null);
                    if (moveToFirst) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VerifyRecordMsgInfoStorage", "insertIfNotExists: msgSvrId=" + j17 + " already exists, skip (sync arrived first)");
                    } else {
                        mo55864x413cb2b4(item, false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VerifyRecordMsgInfoStorage", "insertIfNotExists: msgSvrId=" + j17 + " not found, fake insert done");
                        z17 = true;
                    }
                } finally {
                }
            } finally {
                if (F > 0) {
                    k0Var.w(java.lang.Long.valueOf(F));
                }
            }
        }
        if (z17) {
            mo142179xf35bbb4(item.f68087x5285fa99, 4, item);
        }
        return z17;
    }

    public void J0(java.lang.String encryptUsername, java.util.List msgList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encryptUsername, "encryptUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        l75.k0 k0Var = this.f276595d;
        if (k0Var != null) {
            long F = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VerifyRecordMsgInfoStorage", "updateVerifyRecord: delete encryptUsername=" + encryptUsername + ", result=" + k0Var.mo70514xb06685ab("VerifyRecordMsgInfo", "encryptTalker = ?", new java.lang.String[]{encryptUsername}));
                java.util.Iterator it = msgList.iterator();
                while (it.hasNext()) {
                    mo55864x413cb2b4((com.p314xaae8f345.mm.p2621x8fb0427b.ib) it.next(), false);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VerifyRecordMsgInfoStorage", "updateVerifyRecord: insert " + msgList.size() + " records for encryptUsername=" + encryptUsername);
            } finally {
                if (F > 0) {
                    k0Var.w(java.lang.Long.valueOf(F));
                }
            }
        }
        mo142179xf35bbb4(encryptUsername, 4, msgList);
    }

    public void y0(java.lang.String encryptUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encryptUsername, "encryptUsername");
        java.lang.String[] strArr = {encryptUsername};
        l75.k0 k0Var = this.f276595d;
        int mo70514xb06685ab = k0Var != null ? k0Var.mo70514xb06685ab("VerifyRecordMsgInfo", "encryptTalker = ?", strArr) : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VerifyRecordMsgInfoStorage", "deleteByUsername: encryptUsername=" + encryptUsername + ", result=" + mo70514xb06685ab);
        if (mo70514xb06685ab > 0) {
            mo142179xf35bbb4(encryptUsername, 5, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        vz5.b.a(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r1.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        r2 = new com.p314xaae8f345.mm.p2621x8fb0427b.ib();
        r2.mo9015xbf5d97fd(r1);
        r0.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r1.moveToNext() != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List z0() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            l75.k0 r1 = r3.f276595d
            if (r1 == 0) goto L35
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "WITH ranked AS (\n  SELECT *,\n         ROW_NUMBER() OVER (PARTITION BY encryptTalker ORDER BY createTime DESC) AS rn\n  FROM VerifyRecordMsgInfo\n  WHERE status != 4\n)\nSELECT *\nFROM ranked\nWHERE rn = 1\nORDER BY createTime DESC;"
            android.database.Cursor r1 = r3.m145256x1d3f4980(r2, r1)
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L29
        L18:
            com.tencent.mm.storage.ib r2 = new com.tencent.mm.storage.ib     // Catch: java.lang.Throwable -> L2e
            r2.<init>()     // Catch: java.lang.Throwable -> L2e
            r2.mo9015xbf5d97fd(r1)     // Catch: java.lang.Throwable -> L2e
            r0.add(r2)     // Catch: java.lang.Throwable -> L2e
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L18
        L29:
            r2 = 0
            vz5.b.a(r1, r2)
            goto L35
        L2e:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L30
        L30:
            r2 = move-exception
            vz5.b.a(r1, r0)
            throw r2
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.jb.z0():java.util.List");
    }
}
