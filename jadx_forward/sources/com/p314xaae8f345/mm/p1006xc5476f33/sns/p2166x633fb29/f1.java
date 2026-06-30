package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public abstract class f1 {
    public static long a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("UnsignedLongMinuOne", "com.tencent.mm.plugin.sns.model.FaultLogic");
        if (j17 == Long.MIN_VALUE) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("UnsignedLongMinuOne", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        }
        long j18 = j17 - 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("UnsignedLongMinuOne", "com.tencent.mm.plugin.sns.model.FaultLogic");
        return j18;
    }

    public static long b(long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("compareUnsignedLong", "com.tencent.mm.plugin.sns.model.FaultLogic");
        if ((j17 <= 0 || j18 <= 0) && (j17 >= 0 || j18 >= 0)) {
            long j19 = j17 < 0 ? 1L : -1L;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareUnsignedLong", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return j19;
        }
        long j27 = j17 - j18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareUnsignedLong", "com.tencent.mm.plugin.sns.model.FaultLogic");
        return j27;
    }

    public static int c(long j17, long j18, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
        java.lang.String str2 = "MicroMsg.FaultLogic";
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaultLogic", "minId == 0.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return 0;
        }
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej().L0(str).f459914d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaultLogic", "getLastReqTimeByMinId fault.count %s", java.lang.Integer.valueOf(linkedList.size()));
        if (linkedList.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return 0;
        }
        r45.cp0 cp0Var = (r45.cp0) linkedList.getFirst();
        if (b(cp0Var.f453293e, j17) > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaultLogic", "has a fault，minId:" + j18 + " fault.min:" + cp0Var.f453293e);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return 0;
        }
        if (j18 != 0 && b(cp0Var.f453292d, j18) < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaultLogic", "has part of a fault, maxId:" + j18 + " fault.max:" + cp0Var.f453292d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return 0;
        }
        java.util.LinkedList linkedList2 = cp0Var.f453294f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaultLogic", "getLastReqTimeByMinId segmentList %s", java.lang.Integer.valueOf(linkedList2.size()));
        if (linkedList2.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return 0;
        }
        java.util.Iterator it = linkedList2.iterator();
        int i17 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            r45.cm6 cm6Var = (r45.cm6) it.next();
            java.lang.String str3 = str2;
            if (j18 == 0 || b(j18, cm6Var.f453204e) >= 0) {
                int i18 = cm6Var.f453205f;
                if (i18 < i17) {
                    i17 = i18;
                }
                if (b(j17, cm6Var.f453204e) >= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "getLastReqTimeByMinId result %s", java.lang.Integer.valueOf(i17));
                    int i19 = i17 == Integer.MAX_VALUE ? 0 : i17;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
                    return i19;
                }
            }
            str2 = str3;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "should not to hear minId:" + j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
        return 0;
    }

    public static void d(java.lang.String str, long j17, long j18, int i17) {
        long j19;
        java.util.LinkedList linkedList;
        java.lang.String str2;
        java.util.Iterator it;
        java.util.LinkedList linkedList2;
        long j27;
        java.lang.String str3 = "updateFault";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFault", "com.tencent.mm.plugin.sns.model.FaultLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaultLogic", "updateFault userName:%s ", str);
        long j28 = 0;
        if (j18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFault", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return;
        }
        r45.k53 L0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej().L0(str);
        java.util.LinkedList linkedList3 = L0.f459914d;
        if (j17 != 0) {
            j19 = j17;
        } else {
            if (linkedList3.isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFault", "com.tencent.mm.plugin.sns.model.FaultLogic");
                return;
            }
            j19 = ((r45.cp0) L0.f459914d.getFirst()).f453292d;
        }
        r45.cp0 cp0Var = new r45.cp0();
        cp0Var.f453292d = j19;
        cp0Var.f453293e = j18;
        r45.cm6 cm6Var = new r45.cm6();
        cm6Var.f453203d = j19;
        cm6Var.f453204e = j18;
        cm6Var.f453205f = i17;
        cp0Var.f453294f.add(cm6Var);
        while (true) {
            boolean isEmpty = linkedList3.isEmpty();
            linkedList = L0.f459914d;
            if (isEmpty) {
                str2 = str3;
                break;
            }
            r45.cp0 cp0Var2 = (r45.cp0) linkedList.getFirst();
            java.lang.String str4 = str3;
            if (b(cp0Var.f453293e, cp0Var2.f453292d) > j28) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaultLogic", "has a fault: newerMin:" + cp0Var.f453293e + " fault.Max" + cp0Var2.f453292d);
                str2 = str4;
                break;
            }
            linkedList.removeFirst();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unionFault", "com.tencent.mm.plugin.sns.model.FaultLogic");
            r45.cp0 cp0Var3 = new r45.cp0();
            if (b(cp0Var2.f453292d, cp0Var.f453292d) > j28) {
                cp0Var3.f453292d = cp0Var2.f453292d;
            } else {
                cp0Var3.f453292d = cp0Var.f453292d;
            }
            if (b(cp0Var2.f453293e, cp0Var.f453293e) < j28) {
                cp0Var3.f453293e = cp0Var2.f453293e;
            } else {
                cp0Var3.f453293e = cp0Var.f453293e;
            }
            java.util.LinkedList linkedList4 = cp0Var2.f453294f;
            java.util.Iterator it6 = cp0Var.f453294f.iterator();
            while (it6.hasNext()) {
                r45.cm6 cm6Var2 = (r45.cm6) it6.next();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unionSegment", "com.tencent.mm.plugin.sns.model.FaultLogic");
                if (linkedList4.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaultLogic", "fault's segments should not empty!!");
                    linkedList4.addFirst(cm6Var2);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unionSegment", "com.tencent.mm.plugin.sns.model.FaultLogic");
                    it = it6;
                    linkedList2 = linkedList3;
                } else {
                    long j29 = cm6Var2.f453204e;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSmallerIndex", "com.tencent.mm.plugin.sns.model.FaultLogic");
                    int size = linkedList4.size() - 1;
                    while (true) {
                        if (size < 0) {
                            it = it6;
                            linkedList2 = linkedList3;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSmallerIndex", "com.tencent.mm.plugin.sns.model.FaultLogic");
                            size = -1;
                            break;
                        }
                        it = it6;
                        linkedList2 = linkedList3;
                        if (b(j29, ((r45.cm6) linkedList4.get(size)).f453203d) <= 0) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSmallerIndex", "com.tencent.mm.plugin.sns.model.FaultLogic");
                            break;
                        } else {
                            size--;
                            it6 = it;
                            linkedList3 = linkedList2;
                        }
                    }
                    long j37 = cm6Var2.f453203d;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBiggerIndex", "com.tencent.mm.plugin.sns.model.FaultLogic");
                    int i18 = 0;
                    while (true) {
                        if (i18 >= linkedList4.size()) {
                            i18 = linkedList4.size();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBiggerIndex", "com.tencent.mm.plugin.sns.model.FaultLogic");
                            break;
                        } else {
                            if (b(j37, ((r45.cm6) linkedList4.get(i18)).f453204e) >= 0) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBiggerIndex", "com.tencent.mm.plugin.sns.model.FaultLogic");
                                break;
                            }
                            i18++;
                        }
                    }
                    if (size == -1) {
                        linkedList4.addFirst(cm6Var2);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unionSegment", "com.tencent.mm.plugin.sns.model.FaultLogic");
                    } else if (i18 == linkedList4.size()) {
                        linkedList4.addLast(cm6Var2);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unionSegment", "com.tencent.mm.plugin.sns.model.FaultLogic");
                    } else {
                        r45.cm6 cm6Var3 = (r45.cm6) linkedList4.get(i18);
                        if (b(cm6Var2.f453203d, cm6Var3.f453203d) < 0) {
                            r45.cm6 cm6Var4 = new r45.cm6();
                            cm6Var4.f453203d = cm6Var3.f453203d;
                            long j38 = cm6Var2.f453203d;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("UnsingedLongAddOne", "com.tencent.mm.plugin.sns.model.FaultLogic");
                            if (j38 == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("UnsingedLongAddOne", "com.tencent.mm.plugin.sns.model.FaultLogic");
                                j27 = Long.MIN_VALUE;
                            } else {
                                j27 = j38 + 1;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("UnsingedLongAddOne", "com.tencent.mm.plugin.sns.model.FaultLogic");
                            }
                            cm6Var4.f453204e = j27;
                            cm6Var4.f453205f = cm6Var3.f453205f;
                            linkedList4.add(i18, cm6Var4);
                            size++;
                            i18++;
                        }
                        r45.cm6 cm6Var5 = (r45.cm6) linkedList4.get(size);
                        if (b(cm6Var2.f453204e, cm6Var5.f453204e) > 0) {
                            r45.cm6 cm6Var6 = new r45.cm6();
                            cm6Var6.f453204e = cm6Var5.f453204e;
                            cm6Var6.f453203d = a(cm6Var2.f453204e);
                            cm6Var6.f453205f = cm6Var5.f453205f;
                            linkedList4.add(size + 1, cm6Var6);
                        }
                        while (size >= i18) {
                            linkedList4.remove(size);
                            size--;
                        }
                        linkedList4.add(i18, cm6Var2);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkLimitCount", "com.tencent.mm.plugin.sns.model.FaultLogic");
                        if (linkedList4.size() <= 100) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLimitCount", "com.tencent.mm.plugin.sns.model.FaultLogic");
                        } else {
                            long j39 = ((r45.cm6) linkedList4.getLast()).f453204e;
                            long j47 = ((r45.cm6) linkedList4.getLast()).f453203d;
                            int i19 = ((r45.cm6) linkedList4.getLast()).f453205f;
                            while (linkedList4.size() >= 100) {
                                r45.cm6 cm6Var7 = (r45.cm6) linkedList4.removeLast();
                                long j48 = cm6Var7.f453203d;
                                int i27 = cm6Var7.f453205f;
                                if (i27 < i19) {
                                    i19 = i27;
                                }
                                j47 = j48;
                            }
                            r45.cm6 cm6Var8 = new r45.cm6();
                            cm6Var8.f453203d = j47;
                            cm6Var8.f453204e = j39;
                            cm6Var8.f453205f = i19;
                            linkedList4.addLast(cm6Var8);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLimitCount", "com.tencent.mm.plugin.sns.model.FaultLogic");
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unionSegment", "com.tencent.mm.plugin.sns.model.FaultLogic");
                    }
                }
                it6 = it;
                linkedList3 = linkedList2;
            }
            cp0Var3.f453294f = linkedList4;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unionFault", "com.tencent.mm.plugin.sns.model.FaultLogic");
            cp0Var = cp0Var3;
            linkedList3 = linkedList3;
            j28 = 0;
            str3 = str4;
        }
        linkedList.addFirst(cp0Var);
        while (linkedList.size() > 100) {
            linkedList.removeLast();
        }
        if (linkedList.size() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaultLogic", "min " + ca4.z0.t0(((r45.cp0) linkedList.get(0)).f453293e) + " max " + ca4.z0.t0(((r45.cp0) linkedList.get(0)).f453292d));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 J0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej().J0(str);
        try {
            J0.f67957xdde069b = str;
            J0.f67940xf96f3956 = L0.mo14344x5f01b1f6();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej().u1(J0);
        } catch (java.lang.Exception unused) {
        }
        if (linkedList.size() > 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaultLogic", "fault size : " + linkedList.size());
            java.util.Iterator it7 = linkedList.iterator();
            while (it7.hasNext()) {
                r45.cp0 cp0Var4 = (r45.cp0) it7.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaultLogic", "min - max " + ca4.z0.t0(cp0Var4.f453293e) + " " + ca4.z0.t0(cp0Var4.f453292d));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.model.FaultLogic");
    }
}
