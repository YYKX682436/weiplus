package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes12.dex */
public class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f283700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f283701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 f283702f;

    public d3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 n3Var, boolean z17, int i17) {
        this.f283702f = n3Var;
        this.f283700d = z17;
        this.f283701e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.database.Cursor cursor;
        java.util.LinkedList linkedList;
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 n3Var;
        java.util.LinkedList linkedList2;
        android.database.Cursor cursor2;
        java.lang.String str2;
        java.lang.String str3;
        android.database.Cursor cursor3;
        android.database.Cursor cursor4;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 n3Var2;
        java.util.LinkedList linkedList3;
        android.database.Cursor cursor5;
        long j17;
        boolean z17 = this.f283700d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 n3Var3 = this.f283702f;
        if (z17) {
            if (n3Var3.f283893h == -1) {
                n3Var3.f283902t = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).S3(n3Var3.f283892g);
            } else {
                n3Var3.f283902t = c01.d9.b().j().k(n3Var3.f283892g, n3Var3.f283893h);
            }
        }
        int i17 = this.f283701e;
        int max = i17 >= 0 ? java.lang.Math.max(n3Var3.f283902t - i17, 200) : 200;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "offset:%s limit:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(max));
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        long j18 = n3Var3.f283893h;
        java.util.ArrayList arrayList = n3Var3.f283890e;
        if (j18 == -1) {
            cursor = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).p1(n3Var3.f283892g, arrayList.size() - n3Var3.f283901s, max);
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.v j19 = c01.d9.b().j();
            java.lang.String str4 = n3Var3.f283892g;
            long j27 = n3Var3.f283893h;
            int size = arrayList.size() - n3Var3.f283901s;
            j19.getClass();
            if (str4 == null || str4.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizChatMessageStorage", "getImgMessage fail, argument is invalid");
                cursor = null;
            } else {
                java.lang.String e17 = j19.e(str4);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select * from ( select * from ");
                sb6.append(e17);
                sb6.append("  INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  where");
                sb6.append(j19.i(str4));
                sb6.append(j19.l(str4, j27));
                sb6.append("AND type IN (3,39,13,43,62,44,268435505,486539313) order by createTime DESC limit ");
                j19.f275428a.getClass();
                sb6.append(max);
                sb6.append(" OFFSET ");
                sb6.append(size);
                sb6.append(") order by createTime ASC ");
                cursor = j19.d().B(sb6.toString(), null);
            }
        }
        if (cursor == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaHistoryGalleryPresenter", "[loadData] NULL == cursor ");
            return;
        }
        long j28 = 0;
        while (cursor.moveToNext()) {
            try {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                f9Var.mo9015xbf5d97fd(cursor);
                long a17 = com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(new java.util.Date(f9Var.mo78012x3fdd41df()));
                if (j28 != a17) {
                    j17 = a17;
                    linkedList4.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.w(f9Var.mo78012x3fdd41df()));
                    n3Var3.f283901s++;
                } else {
                    j17 = a17;
                }
                linkedList4.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.w(f9Var));
                j28 = j17;
            } catch (java.lang.Throwable th6) {
                cursor.close();
                throw th6;
            }
        }
        cursor.close();
        java.util.LinkedList linkedList5 = new java.util.LinkedList();
        if (linkedList4.size() - n3Var3.f283901s == max) {
            final long j29 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.w) linkedList4.get(0)).f279982d;
            final long b17 = com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().b(j29);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[loadData] list size:%s start:%s end:%s", java.lang.Integer.valueOf(linkedList4.size()), java.lang.Long.valueOf(b17), java.lang.Long.valueOf(j29));
            if (n3Var3.f283893h == -1) {
                xg3.m0 u17 = c01.d9.b().u();
                final java.lang.String str5 = n3Var3.f283892g;
                final com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) u17;
                g9Var.getClass();
                if (str5 == null || str5.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
                    cursor5 = null;
                } else {
                    final java.lang.String X8 = g9Var.X8(str5);
                    if (g9Var.Da(X8)) {
                        cursor5 = ot0.c3.l().c("getAllImgVideoMessage", new yz5.a() { // from class: com.tencent.mm.storage.g9$$j2
                            @Override // yz5.a
                            /* renamed from: invoke */
                            public final java.lang.Object mo152xb9724478() {
                                java.lang.String str6 = X8;
                                java.lang.String str7 = str5;
                                long j37 = b17;
                                long j38 = j29;
                                ot0.z2 z2Var = ot0.z2.f430355a;
                                com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                                return z2Var.j(g9Var2.f275522r, str6, str7, g9Var2.y4(), j37, j38);
                            }
                        }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$l2
                            @Override // yz5.a
                            /* renamed from: invoke */
                            public final java.lang.Object mo152xb9724478() {
                                com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                                g9Var2.getClass();
                                return g9Var2.f275522r.f("select * from " + X8 + " where" + g9Var2.Z8(str5) + "AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime >= " + b17 + " AND createTime< " + j29 + " order by createTime ASC", null, 2);
                            }
                        });
                    } else if (g9Var.Pb(X8)) {
                        cursor5 = ot0.z2.f430355a.j(g9Var.f275522r, X8, str5, g9Var.y4(), b17, j29);
                    } else {
                        cursor5 = g9Var.f275522r.f("select * from " + X8 + " where" + g9Var.Z8(str5) + "AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime >= " + b17 + " AND createTime< " + j29 + " order by createTime ASC", null, 2);
                    }
                }
                cursor4 = cursor5;
                n3Var = n3Var3;
                linkedList2 = linkedList4;
                str = "MicroMsg.MediaHistoryGalleryPresenter";
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.v j37 = c01.d9.b().j();
                str = "MicroMsg.MediaHistoryGalleryPresenter";
                java.lang.String str6 = n3Var3.f283892g;
                long j38 = n3Var3.f283893h;
                j37.getClass();
                if (str6 == null) {
                    n3Var = n3Var3;
                    linkedList2 = linkedList4;
                    cursor2 = null;
                    str2 = "MicroMsg.BizChatMessageStorage";
                    str3 = "getImgMessage fail, argument is invalid";
                } else if (str6.length() == 0) {
                    n3Var = n3Var3;
                    linkedList2 = linkedList4;
                    str2 = "MicroMsg.BizChatMessageStorage";
                    str3 = "getImgMessage fail, argument is invalid";
                    cursor2 = null;
                } else {
                    linkedList2 = linkedList4;
                    java.lang.String e18 = j37.e(str6);
                    n3Var = n3Var3;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("select * from ");
                    sb7.append(e18);
                    sb7.append("  INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  where");
                    sb7.append(j37.l(str6, j38));
                    sb7.append("AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime >= ");
                    j37.f275428a.getClass();
                    sb7.append(b17);
                    sb7.append(" AND createTime< ");
                    sb7.append(j29);
                    sb7.append(" order by createTime ASC");
                    cursor3 = j37.d().B(sb7.toString(), null);
                    cursor4 = cursor3;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, str3);
                cursor3 = cursor2;
                cursor4 = cursor3;
            }
            java.util.Date date = new java.util.Date(j29);
            long a18 = com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(date);
            while (cursor4 != null) {
                try {
                    if (!cursor4.moveToNext()) {
                        break;
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    f9Var2.mo9015xbf5d97fd(cursor4);
                    long a19 = com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(new java.util.Date(f9Var2.mo78012x3fdd41df()));
                    if (a18 == a19 || com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(date) == a19) {
                        n3Var2 = n3Var;
                        if (linkedList2.size() > 0 && linkedList5.size() == 0) {
                            linkedList3 = linkedList2;
                            linkedList5.add(0, (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.w) linkedList3.remove(0));
                            linkedList5.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.w(f9Var2));
                            linkedList2 = linkedList3;
                            n3Var = n3Var2;
                        }
                    } else {
                        linkedList5.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.w(f9Var2.mo78012x3fdd41df()));
                        n3Var2 = n3Var;
                        n3Var2.f283901s++;
                        a18 = a19;
                    }
                    linkedList3 = linkedList2;
                    linkedList5.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.w(f9Var2));
                    linkedList2 = linkedList3;
                    n3Var = n3Var2;
                } catch (java.lang.Throwable th7) {
                    cursor4.close();
                    throw th7;
                }
            }
            linkedList = linkedList2;
            if (cursor4 != null) {
                cursor4.close();
            }
        } else {
            linkedList = linkedList4;
            str = "MicroMsg.MediaHistoryGalleryPresenter";
        }
        java.util.LinkedList linkedList6 = new java.util.LinkedList();
        linkedList6.addAll(linkedList5);
        linkedList6.addAll(linkedList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[loadData] linkedList:%s linkedList1:%s finalAddList:%s", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(linkedList5.size()), java.lang.Integer.valueOf(linkedList6.size()));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.c3(this, linkedList6));
    }
}
