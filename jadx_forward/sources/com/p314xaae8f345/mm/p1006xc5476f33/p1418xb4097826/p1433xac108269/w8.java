package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class w8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w8 f184191a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w8();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v8 f184192b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f184193c;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r8 r8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184088a;
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184096i.f184073b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s8 s8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184093f;
        hashMap.put(str, s8Var.f184073b);
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184098k.f184073b, s8Var.f184073b);
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184099l.f184073b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s8 s8Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184097j;
        hashMap.put(str2, s8Var2.f184073b);
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184101n.f184073b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184092e.f184073b);
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184100m.f184073b, s8Var2.f184073b);
        f184192b = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v8(hashMap);
        f184193c = 21173;
    }

    public final void a(r45.nd6 curTagData, java.util.ArrayList dataList, boolean z17) {
        r45.nd6 nd6Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curTagData, "curTagData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        java.lang.String str = (java.lang.String) f184192b.f184166a.get(curTagData.m75945x2fec8307(1));
        if (str != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8 y8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184265a;
            int size = dataList.size();
            r45.l84 l84Var = null;
            int i17 = 0;
            r45.nd6 nd6Var2 = null;
            for (java.lang.Object obj : dataList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.nd6 nd6Var3 = (r45.nd6) obj;
                if (i17 < size && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(nd6Var3.m75945x2fec8307(1), str)) {
                    nd6Var2 = nd6Var3;
                }
                i17 = i18;
            }
            if (nd6Var2 != null) {
                long m75942xfb822ef2 = curTagData.m75942xfb822ef2(2) - nd6Var2.m75942xfb822ef2(2);
                java.lang.String m75945x2fec8307 = curTagData.m75945x2fec8307(1);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184096i.f184073b) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184098k.f184073b)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var.mo68477x336bdfd8(1552L, 1L, m75942xfb822ef2, false);
                    g0Var.mo68477x336bdfd8(1552L, 5L, 1L, false);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(curTagData.m75945x2fec8307(1), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184098k.f184073b) && (m75934xbce7f2f = curTagData.m75934xbce7f2f(4)) != null) {
                        r45.l84 l84Var2 = new r45.l84();
                        try {
                            l84Var2.mo11468x92b714fd(m75934xbce7f2f.g());
                            l84Var = l84Var2;
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                        }
                        if (l84Var != null) {
                            int m75939xb282bd08 = l84Var.m75939xb282bd08(1);
                            if (m75939xb282bd08 == -200030) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1552L, 52L);
                            } else if (m75939xb282bd08 == -200001) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1552L, 51L);
                            } else if (m75939xb282bd08 != -100038) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1552L, 54L);
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1552L, 50L);
                            }
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8 y8Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184265a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveFlowStats", "reportJoinLive " + m75942xfb822ef2);
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184099l.f184073b)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var2.mo68477x336bdfd8(1552L, 2L, m75942xfb822ef2, false);
                    g0Var2.mo68477x336bdfd8(1552L, 6L, 1L, false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveFlowStats", "reportCdnConnect " + m75942xfb822ef2);
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184100m.f184073b)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var3.mo68477x336bdfd8(1552L, 3L, m75942xfb822ef2, false);
                    g0Var3.mo68477x336bdfd8(1552L, 7L, 1L, false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveFlowStats", "reportTrtcConnect " + m75942xfb822ef2);
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184101n.f184073b)) {
                    java.lang.String m75945x2fec83072 = curTagData.m75945x2fec8307(0);
                    if (m75945x2fec83072 != null) {
                        long m75942xfb822ef22 = curTagData.m75942xfb822ef2(2);
                        int i19 = (int) m75942xfb822ef2;
                        boolean f17 = y8Var.f(m75945x2fec83072);
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184269e;
                        if (f17) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f9 f9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f9) concurrentHashMap.get(m75945x2fec83072);
                            if (f9Var != null) {
                                f9Var.f183707b = (int) (m75942xfb822ef22 - f9Var.f183706a);
                                f9Var.f183708c = i19;
                            }
                        } else {
                            concurrentHashMap.put(m75945x2fec83072, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f9(0L, 0, i19));
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1552L, 8L, m75942xfb822ef2, false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveFlowStats", "reportBeginPlay " + m75942xfb822ef2);
                }
            }
        }
        if (!z17 || (nd6Var = (r45.nd6) kz5.n0.Z(dataList)) == null) {
            return;
        }
        long m75942xfb822ef23 = curTagData.m75942xfb822ef2(2) - nd6Var.m75942xfb822ef2(2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var4.mo68477x336bdfd8(1552L, 0L, m75942xfb822ef23, false);
        g0Var4.mo68477x336bdfd8(1552L, 4L, 1L, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8 y8Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184265a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveFlowStats", "reportTotal " + m75942xfb822ef23);
    }
}
