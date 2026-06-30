package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class w8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.w8 f102658a = new com.tencent.mm.plugin.finder.assist.w8();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.v8 f102659b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f102660c;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.finder.assist.r8 r8Var = com.tencent.mm.plugin.finder.assist.t8.f102555a;
        java.lang.String str = com.tencent.mm.plugin.finder.assist.t8.f102563i.f102540b;
        com.tencent.mm.plugin.finder.assist.s8 s8Var = com.tencent.mm.plugin.finder.assist.t8.f102560f;
        hashMap.put(str, s8Var.f102540b);
        hashMap.put(com.tencent.mm.plugin.finder.assist.t8.f102565k.f102540b, s8Var.f102540b);
        java.lang.String str2 = com.tencent.mm.plugin.finder.assist.t8.f102566l.f102540b;
        com.tencent.mm.plugin.finder.assist.s8 s8Var2 = com.tencent.mm.plugin.finder.assist.t8.f102564j;
        hashMap.put(str2, s8Var2.f102540b);
        hashMap.put(com.tencent.mm.plugin.finder.assist.t8.f102568n.f102540b, com.tencent.mm.plugin.finder.assist.t8.f102559e.f102540b);
        hashMap.put(com.tencent.mm.plugin.finder.assist.t8.f102567m.f102540b, s8Var2.f102540b);
        f102659b = new com.tencent.mm.plugin.finder.assist.v8(hashMap);
        f102660c = 21173;
    }

    public final void a(r45.nd6 curTagData, java.util.ArrayList dataList, boolean z17) {
        r45.nd6 nd6Var;
        com.tencent.mm.protobuf.g byteString;
        kotlin.jvm.internal.o.g(curTagData, "curTagData");
        kotlin.jvm.internal.o.g(dataList, "dataList");
        java.lang.String str = (java.lang.String) f102659b.f102633a.get(curTagData.getString(1));
        if (str != null) {
            com.tencent.mm.plugin.finder.assist.y8 y8Var = com.tencent.mm.plugin.finder.assist.y8.f102732a;
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
                if (i17 < size && kotlin.jvm.internal.o.b(nd6Var3.getString(1), str)) {
                    nd6Var2 = nd6Var3;
                }
                i17 = i18;
            }
            if (nd6Var2 != null) {
                long j17 = curTagData.getLong(2) - nd6Var2.getLong(2);
                java.lang.String string = curTagData.getString(1);
                if (kotlin.jvm.internal.o.b(string, com.tencent.mm.plugin.finder.assist.t8.f102563i.f102540b) ? true : kotlin.jvm.internal.o.b(string, com.tencent.mm.plugin.finder.assist.t8.f102565k.f102540b)) {
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var.idkeyStat(1552L, 1L, j17, false);
                    g0Var.idkeyStat(1552L, 5L, 1L, false);
                    if (kotlin.jvm.internal.o.b(curTagData.getString(1), com.tencent.mm.plugin.finder.assist.t8.f102565k.f102540b) && (byteString = curTagData.getByteString(4)) != null) {
                        r45.l84 l84Var2 = new r45.l84();
                        try {
                            l84Var2.parseFrom(byteString.g());
                            l84Var = l84Var2;
                        } catch (java.lang.Exception e17) {
                            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                        }
                        if (l84Var != null) {
                            int integer = l84Var.getInteger(1);
                            if (integer == -200030) {
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1552L, 52L);
                            } else if (integer == -200001) {
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1552L, 51L);
                            } else if (integer != -100038) {
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1552L, 54L);
                            } else {
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1552L, 50L);
                            }
                        }
                    }
                    com.tencent.mm.plugin.finder.assist.y8 y8Var2 = com.tencent.mm.plugin.finder.assist.y8.f102732a;
                    com.tencent.mars.xlog.Log.i("Finder.LiveFlowStats", "reportJoinLive " + j17);
                } else if (kotlin.jvm.internal.o.b(string, com.tencent.mm.plugin.finder.assist.t8.f102566l.f102540b)) {
                    com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var2.idkeyStat(1552L, 2L, j17, false);
                    g0Var2.idkeyStat(1552L, 6L, 1L, false);
                    com.tencent.mars.xlog.Log.i("Finder.LiveFlowStats", "reportCdnConnect " + j17);
                } else if (kotlin.jvm.internal.o.b(string, com.tencent.mm.plugin.finder.assist.t8.f102567m.f102540b)) {
                    com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var3.idkeyStat(1552L, 3L, j17, false);
                    g0Var3.idkeyStat(1552L, 7L, 1L, false);
                    com.tencent.mars.xlog.Log.i("Finder.LiveFlowStats", "reportTrtcConnect " + j17);
                } else if (kotlin.jvm.internal.o.b(string, com.tencent.mm.plugin.finder.assist.t8.f102568n.f102540b)) {
                    java.lang.String string2 = curTagData.getString(0);
                    if (string2 != null) {
                        long j18 = curTagData.getLong(2);
                        int i19 = (int) j17;
                        boolean f17 = y8Var.f(string2);
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.finder.assist.y8.f102736e;
                        if (f17) {
                            com.tencent.mm.plugin.finder.assist.f9 f9Var = (com.tencent.mm.plugin.finder.assist.f9) concurrentHashMap.get(string2);
                            if (f9Var != null) {
                                f9Var.f102174b = (int) (j18 - f9Var.f102173a);
                                f9Var.f102175c = i19;
                            }
                        } else {
                            concurrentHashMap.put(string2, new com.tencent.mm.plugin.finder.assist.f9(0L, 0, i19));
                        }
                    }
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1552L, 8L, j17, false);
                    com.tencent.mars.xlog.Log.i("Finder.LiveFlowStats", "reportBeginPlay " + j17);
                }
            }
        }
        if (!z17 || (nd6Var = (r45.nd6) kz5.n0.Z(dataList)) == null) {
            return;
        }
        long j19 = curTagData.getLong(2) - nd6Var.getLong(2);
        com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var4.idkeyStat(1552L, 0L, j19, false);
        g0Var4.idkeyStat(1552L, 4L, 1L, false);
        com.tencent.mm.plugin.finder.assist.y8 y8Var3 = com.tencent.mm.plugin.finder.assist.y8.f102732a;
        com.tencent.mars.xlog.Log.i("Finder.LiveFlowStats", "reportTotal " + j19);
    }
}
