package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes4.dex */
public class q extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f276762e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.p.f276741r, "BackupTempMoveTime")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f276763d;

    public q(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.p.f276741r, "BackupTempMoveTime", null);
        this.f276763d = k0Var;
    }

    @Override // l75.n0
    /* renamed from: update */
    public boolean mo11261xce0038c9(long j17, l75.f0 f0Var) {
        return super.mo11261xce0038c9(j17, (com.p314xaae8f345.mm.p2621x8fb0427b.p) f0Var);
    }

    public void y0(java.util.LinkedList linkedList, java.util.LinkedList linkedList2, java.util.LinkedList linkedList3, java.util.LinkedList linkedList4) {
        java.util.Iterator it;
        java.util.Iterator it6;
        boolean z17;
        if (mo78086x7444f759() <= 0) {
            linkedList3.addAll(linkedList);
            linkedList4.addAll(linkedList2);
            return;
        }
        java.util.Iterator it7 = linkedList2.iterator();
        java.util.Iterator it8 = linkedList.iterator();
        while (it8.hasNext()) {
            java.lang.String str = (java.lang.String) it8.next();
            if (it7.hasNext()) {
                long longValue = ((java.lang.Long) it7.next()).longValue();
                if (!it7.hasNext()) {
                    break;
                }
                long longValue2 = ((java.lang.Long) it7.next()).longValue();
                if (longValue2 == 0) {
                    longValue2 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
                }
                java.util.LinkedList linkedList5 = new java.util.LinkedList();
                android.database.Cursor B = this.f276763d.B("SELECT * FROM BackupTempMoveTime WHERE sessionName = \"" + str + "\" ", null);
                if (B == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupTempMoveTimeStorage", "getTempMoveTimeBySession failed, sessionName:%s ", str);
                    linkedList5 = null;
                } else {
                    while (B.moveToNext()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.p pVar = new com.p314xaae8f345.mm.p2621x8fb0427b.p();
                        pVar.mo9015xbf5d97fd(B);
                        r45.cd cdVar = new r45.cd();
                        cdVar.f453010d = pVar.f68369x1bb3b54a;
                        cdVar.f453011e = pVar.f68367x14c61803;
                        linkedList5.add(cdVar);
                    }
                    B.close();
                }
                if (linkedList5 == null || linkedList5.size() <= 0 || longValue2 < ((r45.cd) linkedList5.getFirst()).f453010d || longValue > ((r45.cd) linkedList5.getLast()).f453011e) {
                    it = it8;
                    it6 = it7;
                    linkedList3.add(str);
                    linkedList4.add(java.lang.Long.valueOf(longValue));
                    linkedList4.add(java.lang.Long.valueOf(longValue2));
                } else {
                    int i17 = 0;
                    long j17 = longValue;
                    boolean z18 = false;
                    while (i17 < linkedList5.size() && j17 <= longValue2) {
                        r45.cd cdVar2 = (r45.cd) linkedList5.get(i17);
                        long j18 = cdVar2.f453011e;
                        if (j17 > j18) {
                            it = it8;
                            it6 = it7;
                        } else {
                            it = it8;
                            it6 = it7;
                            if (j17 < cdVar2.f453010d) {
                                linkedList3.add(str);
                                linkedList4.add(java.lang.Long.valueOf(j17));
                                long j19 = cdVar2.f453010d;
                                if (longValue2 < j19) {
                                    linkedList4.add(java.lang.Long.valueOf(longValue2));
                                    j17 = cdVar2.f453010d;
                                    z18 = true;
                                    break;
                                } else {
                                    linkedList4.add(java.lang.Long.valueOf(j19));
                                    j17 = cdVar2.f453011e;
                                    z18 = true;
                                }
                            } else {
                                j17 = j18;
                            }
                        }
                        i17++;
                        it7 = it6;
                        it8 = it;
                    }
                    it = it8;
                    it6 = it7;
                    if (j17 <= longValue2) {
                        linkedList3.add(str);
                        linkedList4.add(java.lang.Long.valueOf(j17));
                        linkedList4.add(java.lang.Long.valueOf(longValue2));
                        z17 = true;
                    } else {
                        z17 = z18;
                    }
                    if (!z17) {
                        linkedList3.add(str);
                        linkedList4.add(java.lang.Long.valueOf(j17));
                        linkedList4.add(java.lang.Long.valueOf(longValue2));
                    }
                }
            } else {
                it = it8;
                it6 = it7;
            }
            it7 = it6;
            it8 = it;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupTempMoveTimeStorage", "getSessionRequestTimeInteval, resultSession size:%s, resultTimeInterval:%s", java.lang.Integer.valueOf(linkedList3.size()), java.lang.Integer.valueOf(linkedList4.size()));
    }
}
