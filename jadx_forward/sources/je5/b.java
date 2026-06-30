package je5;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public yq1.t0 f380854a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f380855b;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ba, code lost:
    
        if (r6 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(java.lang.String r17, long r18, yb5.d r20) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: je5.b.a(java.lang.String, long, yb5.d):long");
    }

    public final int b(java.lang.String talker, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        long W0 = yq1.u0.Ai().W0(talker, ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(talker));
        if (!c01.s0.c() || W0 < 0) {
            return ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).F2(talker, j17, j18);
        }
        if (j18 < W0) {
            return ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).F2(talker, j17, j18);
        }
        if (j17 >= W0) {
            return yq1.u0.Ai().L0(talker, j17, j18);
        }
        return yq1.u0.Ai().L0(talker, W0, j18) + ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).F2(talker, j17, W0 - 1);
    }

    public final java.util.List c(java.lang.String str, int i17, long j17, long j18) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.database.Cursor K6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().K6(str, i17, j17, j18);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            K6.moveToFirst();
            while (!K6.isAfterLast()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                f9Var.mo9015xbf5d97fd(K6);
                arrayList.add(f9Var);
                K6.moveToNext();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizContactMsgDataRepo", "Failed to get message list after time", e17);
        }
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizContactMsgDataRepo", "getMsgListAfter after fillItem:%s, cost:%s", java.lang.Integer.valueOf(arrayList.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
        K6.close();
        return arrayList;
    }

    public final java.util.List d(java.lang.String str, int i17, long j17, long j18) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.database.Cursor N6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().N6(str, i17, j17, j18);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            N6.moveToFirst();
            while (!N6.isAfterLast()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                f9Var.mo9015xbf5d97fd(N6);
                arrayList.add(f9Var);
                N6.moveToNext();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizContactMsgDataRepo", "Failed to get message list before time", e17);
        }
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizContactMsgDataRepo", "getMsgListBefore after fillItem:%s, cost:%s", java.lang.Integer.valueOf(arrayList.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
        N6.close();
        return arrayList;
    }

    public final java.util.List e(java.lang.String talker, int i17, long j17, long j18, yb5.d chattingContext) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        if (!c01.s0.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizContactMsgDataRepo", "shouldUseNewTable is false, use old logic");
            return d(talker, i17, j17, j18);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = chattingContext.f542241c;
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) cVar.a(sb5.f.class))).getClass();
        er1.b Ai = yq1.u0.Ai();
        Ai.getClass();
        java.lang.String y07 = Ai.y0(true);
        if (y07 == null) {
            y07 = "talker = ?";
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(talker);
        arrayList2.add(talker);
        if (j17 > 0) {
            y07 = y07.concat(" AND createTime > ?");
            arrayList2.add(java.lang.String.valueOf(j17));
        }
        if (j18 > 0) {
            y07 = y07 + " AND createTime <= ?";
            arrayList2.add(java.lang.String.valueOf(j18));
        }
        android.database.Cursor B = Ai.f337540d.B("SELECT msgId FROM BizContactConversationMassSend WHERE " + y07 + " ORDER BY createTime DESC LIMIT " + i17, (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]));
        if (B != null) {
            try {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                while (B.moveToNext()) {
                    arrayList3.add(java.lang.Long.valueOf(B.getLong(0)));
                }
                vz5.b.a(B, null);
                list = arrayList3;
            } finally {
            }
        } else {
            list = kz5.p0.f395529d;
        }
        java.util.List list2 = list;
        arrayList.addAll(f(talker, list2, i17));
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) cVar.a(sb5.f.class))).getClass();
        long W0 = yq1.u0.Ai().W0(talker, j17);
        if (arrayList.size() < i17) {
            arrayList.addAll(d(talker, i17 - arrayList.size(), j17, (W0 <= 0 || (W0 > j18 && j18 != 0)) ? j18 : W0 - 1));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizContactMsgDataRepo", "beforeNew fillItem size:%s, msgIdListFromNewTable size:%s, cost:%s", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(list2.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f4, code lost:
    
        if (r3 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f6, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0103, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0100, code lost:
    
        if (r3 != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List f(final java.lang.String r13, final java.util.List r14, final int r15) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: je5.b.f(java.lang.String, java.util.List, int):java.util.List");
    }

    public final java.util.List g(java.lang.String str, long j17, long j18, long j19) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j27 = j17 + 1;
        android.database.Cursor V2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().V2(str, java.lang.Math.max(j27, j18), java.lang.Math.max(j27, j19));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            V2.moveToFirst();
            while (!V2.isAfterLast()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                f9Var.mo9015xbf5d97fd(V2);
                arrayList.add(f9Var);
                V2.moveToNext();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizContactMsgDataRepo", "Failed to get message list in time range", e17);
        }
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizContactMsgDataRepo", "getMsgListCreateRange after fillItem:%s, cost:%s", java.lang.Integer.valueOf(arrayList.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
        V2.close();
        return arrayList;
    }

    public final java.util.List h(java.lang.String talker, long j17, long j18, long j19, yb5.d chattingContext) {
        long j27;
        long j28;
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        if (!c01.s0.c()) {
            return g(talker, j17, j18, j19);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        long j29 = j17 + 1;
        long max = java.lang.Math.max(j29, j18);
        long max2 = java.lang.Math.max(j29, j19);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = chattingContext.f542241c;
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) cVar.a(sb5.f.class))).getClass();
        er1.b Ai = yq1.u0.Ai();
        Ai.getClass();
        if (max2 < max) {
            j28 = max;
            j27 = max2;
        } else {
            j27 = max;
            j28 = max2;
        }
        java.lang.String y07 = Ai.y0(true);
        if (y07 == null) {
            y07 = "talker = ?";
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(talker);
        arrayList2.add(talker);
        if (j27 > 0) {
            y07 = y07.concat(" AND createTime >= ?");
            arrayList2.add(java.lang.String.valueOf(j27));
        }
        if (j28 > 0) {
            y07 = y07 + " AND createTime <= ?";
            arrayList2.add(java.lang.String.valueOf(j28));
        }
        android.database.Cursor B = Ai.f337540d.B("SELECT msgId FROM BizContactConversationMassSend WHERE " + y07 + " ORDER BY createTime ASC", (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]));
        if (B != null) {
            try {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                while (B.moveToNext()) {
                    arrayList3.add(java.lang.Long.valueOf(B.getLong(0)));
                }
                vz5.b.a(B, null);
                list = arrayList3;
            } finally {
            }
        } else {
            list = kz5.p0.f395529d;
        }
        java.util.List list2 = list;
        arrayList.addAll(f(talker, list2, list2.size()));
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) cVar.a(sb5.f.class))).getClass();
        long W0 = yq1.u0.Ai().W0(talker, j17);
        if (max < W0 || W0 < 0) {
            arrayList.addAll(g(talker, j17, max, (W0 < 0 || max2 < W0) ? max2 : java.lang.Math.max(j29, W0 - 1)));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizContactMsgDataRepo", "range fillItem size:%s, msgIdListFromNewTable size:%s, cost:%s", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(list2.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return arrayList;
    }
}
