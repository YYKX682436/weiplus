package com.tencent.mm.plugin.choosemsgfile.logic.ui;

/* loaded from: classes12.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f95559f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.logic.ui.u f95560g;

    public t(com.tencent.mm.plugin.choosemsgfile.logic.ui.u uVar, java.lang.String str, java.lang.String str2, boolean z17) {
        this.f95560g = uVar;
        this.f95557d = str;
        this.f95558e = str2;
        this.f95559f = z17;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        java.lang.Class cls;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        android.database.Cursor cursor;
        final java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.util.LinkedList linkedList2;
        com.tencent.mm.plugin.choosemsgfile.logic.ui.u uVar;
        android.database.Cursor cursor2;
        java.util.LinkedList linkedList3;
        java.util.LinkedList linkedList4;
        java.util.LinkedList linkedList5 = new java.util.LinkedList();
        final com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        com.tencent.mm.plugin.choosemsgfile.logic.ui.u uVar2 = this.f95560g;
        final java.lang.String str8 = uVar2.f95527a;
        final int i17 = uVar2.f95564g;
        cj6.getClass();
        ot0.z2 z2Var = ot0.z2.f348822a;
        if (str8 == null || str8.length() == 0) {
            linkedList = linkedList5;
            cls = vg3.x3.class;
            str = "MicroMsg.MsgInfoStorage";
            str2 = "getAllFileMessage fail, argument is invalid";
            str3 = "getAllFileMessage";
            str4 = " where";
            com.tencent.mars.xlog.Log.e(str, str2);
            cursor = null;
        } else {
            final java.lang.String X8 = cj6.X8(str8);
            if (cj6.Da(X8)) {
                final int i18 = 200;
                cls = vg3.x3.class;
                str = "MicroMsg.MsgInfoStorage";
                linkedList = linkedList5;
                str2 = "getAllFileMessage fail, argument is invalid";
                final int i19 = 200;
                cursor = ot0.c3.l().c("getAllFileMessage", new yz5.a() { // from class: com.tencent.mm.storage.g9$$s4
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        java.lang.String str9 = X8;
                        java.lang.String str10 = str8;
                        int i27 = i17;
                        int i28 = i18;
                        ot0.z2 z2Var2 = ot0.z2.f348822a;
                        com.tencent.mm.storage.g9 g9Var = com.tencent.mm.storage.g9.this;
                        return z2Var2.g(g9Var.f193989r, str9, str10, i27, i28, g9Var.n1());
                    }
                }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$t4
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        com.tencent.mm.storage.g9 g9Var = com.tencent.mm.storage.g9.this;
                        g9Var.getClass();
                        return g9Var.f193989r.f("select * from ( select * from " + X8 + " where" + g9Var.Z8(str8) + " AND type IN (3,39,13,43,62,44,49,1090519089,268435505)  order by createTime DESC limit " + i19 + " OFFSET " + i17 + ") order by createTime ASC ", null, 2);
                    }
                });
                str3 = "getAllFileMessage";
                str4 = " where";
            } else {
                linkedList = linkedList5;
                cls = vg3.x3.class;
                str = "MicroMsg.MsgInfoStorage";
                str2 = "getAllFileMessage fail, argument is invalid";
                if (cj6.Pb(X8)) {
                    str3 = "getAllFileMessage";
                    str4 = " where";
                    cursor = z2Var.g(cj6.f193989r, X8, str8, i17, 200, cj6.n1());
                } else {
                    str3 = "getAllFileMessage";
                    str4 = " where";
                    cursor = cj6.f193989r.f("select * from ( select * from " + X8 + str4 + cj6.Z8(str8) + " AND type IN (3,39,13,43,62,44,49,1090519089,268435505)  order by createTime DESC limit 200 OFFSET " + i17 + ") order by createTime ASC ", null, 2);
                }
            }
        }
        if (cursor == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChooseMsgFileUIController", "[loadData] NULL == cursor ");
            return;
        }
        long j17 = 0;
        while (true) {
            try {
                boolean moveToNext = cursor.moveToNext();
                str5 = uVar2.f95527a;
                str6 = this.f95558e;
                str7 = this.f95557d;
                if (!moveToNext) {
                    break;
                }
                uVar2.f95564g++;
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                f9Var.convertFrom(cursor);
                wv1.a a17 = xv1.d.a(uVar2.f95561d, f9Var, str5, str7, str6);
                if (a17 != null) {
                    long a18 = com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(f9Var.getCreateTime()));
                    if (j17 != a18) {
                        linkedList4 = linkedList;
                        linkedList4.add(new wv1.c(uVar2.f95561d, f9Var.getCreateTime()));
                        uVar2.f95565h++;
                    } else {
                        linkedList4 = linkedList;
                    }
                    linkedList4.add(a17);
                    j17 = a18;
                } else {
                    linkedList4 = linkedList;
                }
                linkedList = linkedList4;
            } catch (java.lang.Throwable th6) {
                cursor.close();
                throw th6;
            }
        }
        java.util.LinkedList linkedList6 = linkedList;
        cursor.close();
        java.util.LinkedList linkedList7 = new java.util.LinkedList();
        if (linkedList6.size() - uVar2.f95565h == 200) {
            final long g17 = ((wv1.a) linkedList6.get(0)).g();
            com.tencent.mm.plugin.choosemsgfile.logic.ui.u uVar3 = uVar2;
            final long b17 = com.tencent.mm.ui.gridviewheaders.a.e().b(g17);
            java.util.LinkedList linkedList8 = linkedList6;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileUIController", "[loadData] list size:%s start:%s end:%s", java.lang.Integer.valueOf(linkedList6.size()), java.lang.Long.valueOf(b17), java.lang.Long.valueOf(g17));
            final com.tencent.mm.storage.g9 cj7 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(cls))).cj();
            cj7.getClass();
            if (str5 == null || str5.length() == 0) {
                com.tencent.mars.xlog.Log.e(str, str2);
                cursor2 = null;
            } else {
                final java.lang.String X82 = cj7.X8(str5);
                if (cj7.Da(X82)) {
                    cursor2 = ot0.c3.l().c(str3, new yz5.a() { // from class: com.tencent.mm.storage.g9$$l4
                        @Override // yz5.a
                        public final java.lang.Object invoke() {
                            java.lang.String str9 = X82;
                            java.lang.String str10 = str5;
                            long j18 = b17;
                            long j19 = g17;
                            ot0.z2 z2Var2 = ot0.z2.f348822a;
                            com.tencent.mm.storage.g9 g9Var = com.tencent.mm.storage.g9.this;
                            return z2Var2.g(g9Var.f193989r, str9, str10, j18, j19, g9Var.n1());
                        }
                    }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$m4
                        @Override // yz5.a
                        public final java.lang.Object invoke() {
                            com.tencent.mm.storage.g9 g9Var = com.tencent.mm.storage.g9.this;
                            g9Var.getClass();
                            return g9Var.f193989r.f("select * from " + X82 + " where" + g9Var.Z8(str5) + "AND type IN (3,39,13,43,62,44,49,1090519089,268435505) AND createTime >= " + b17 + " AND createTime< " + g17 + " order by createTime ASC", null, 2);
                        }
                    });
                } else if (cj7.Pb(X82)) {
                    cursor2 = z2Var.g(cj7.f193989r, X82, str5, b17, g17, cj7.n1());
                } else {
                    cursor2 = cj7.f193989r.f("select * from " + X82 + str4 + cj7.Z8(str5) + "AND type IN (3,39,13,43,62,44,49,1090519089,268435505) AND createTime >= " + b17 + " AND createTime< " + g17 + " order by createTime ASC", null, 2);
                }
            }
            java.util.Date date = new java.util.Date(g17);
            long a19 = com.tencent.mm.ui.gridviewheaders.a.e().a(date);
            while (cursor2 != null) {
                try {
                    if (!cursor2.moveToNext()) {
                        break;
                    }
                    com.tencent.mm.plugin.choosemsgfile.logic.ui.u uVar4 = uVar3;
                    uVar4.f95564g++;
                    com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
                    f9Var2.convertFrom(cursor2);
                    wv1.a a27 = xv1.d.a(uVar4.f95561d, f9Var2, str5, str7, str6);
                    if (a27 != null) {
                        long a28 = com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(f9Var2.getCreateTime()));
                        if (a19 != a28 && com.tencent.mm.ui.gridviewheaders.a.e().a(date) != a28) {
                            linkedList7.add(new wv1.c(uVar4.f95561d, f9Var2.getCreateTime()));
                            uVar4.f95565h++;
                            a19 = a28;
                        } else if (linkedList8.size() > 0 && linkedList7.size() == 0) {
                            linkedList3 = linkedList8;
                            linkedList7.add(0, (wv1.a) linkedList3.remove(0));
                            linkedList7.add(a27);
                            uVar3 = uVar4;
                            linkedList8 = linkedList3;
                        }
                        linkedList3 = linkedList8;
                        linkedList7.add(a27);
                        uVar3 = uVar4;
                        linkedList8 = linkedList3;
                    } else {
                        uVar3 = uVar4;
                    }
                } catch (java.lang.Throwable th7) {
                    cursor2.close();
                    throw th7;
                }
            }
            uVar = uVar3;
            linkedList2 = linkedList8;
            if (cursor2 != null) {
                cursor2.close();
            }
        } else {
            linkedList2 = linkedList6;
            uVar = uVar2;
        }
        int size = linkedList2.size() + linkedList7.size();
        java.util.ArrayList arrayList = uVar.f95529c;
        arrayList.addAll(0, linkedList7);
        arrayList.addAll(linkedList7.size(), linkedList2);
        linkedList2.clear();
        linkedList7.clear();
        uVar.f95565h = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileUIController", "[loadData] %s", java.lang.Integer.valueOf(arrayList.size()));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.choosemsgfile.logic.ui.s(this, size));
    }
}
