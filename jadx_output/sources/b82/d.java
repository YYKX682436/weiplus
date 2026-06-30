package b82;

/* loaded from: classes12.dex */
public class d extends l75.n0 implements o72.k4 {

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f18308d;

    public d(l75.k0 k0Var) {
        super(k0Var, o72.r2.F1, "FavItemInfo", null);
        this.f18308d = k0Var;
    }

    @Override // o72.k4
    public java.util.List A0() {
        java.util.ArrayList arrayList = null;
        android.database.Cursor f17 = this.f18308d.f("select xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type,updateSeq,updateTime,tagProto,sessionId,datatotalsize,transferCtx,targetID,subType,rowid from FavItemInfo where flag =  -1 and itemStatus = 0 ", null, 2);
        if (f17 == null) {
            return null;
        }
        if (f17.moveToFirst()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            do {
                o72.r2 r2Var = new o72.r2();
                r2Var.convertFrom(f17);
                arrayList2.add(r2Var);
            } while (f17.moveToNext());
            arrayList = arrayList2;
        }
        f17.close();
        return arrayList;
    }

    @Override // o72.k4
    public int Ah(int i17) {
        try {
            android.database.Cursor f17 = this.f18308d.f("select count(*) from FavItemInfo where id>" + i17, null, 2);
            if (f17 == null) {
                return -1;
            }
            if (f17.getCount() == 0) {
                f17.close();
                return -1;
            }
            f17.moveToNext();
            int i18 = f17.getInt(0);
            f17.close();
            return i18;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoStorage", "getFavHomePosition failed with throwable: " + th6.getMessage());
            return -1;
        }
    }

    @Override // o72.k4
    public o72.r2 F(long j17) {
        l75.k0 k0Var = this.f18308d;
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoStorage", "getBtLocalId, but db is null, return");
            return null;
        }
        android.database.Cursor D = k0Var.D("FavItemInfo", null, "localId=?", new java.lang.String[]{"" + j17}, null, null, null, 2);
        if (!D.moveToFirst()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoStorage", "klem getByLocalId:%d, no data", java.lang.Long.valueOf(j17));
            D.close();
            return null;
        }
        o72.r2 r2Var = new o72.r2();
        try {
            r2Var.convertFrom(D);
            D.close();
            return r2Var;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoStorage", "getByLocalId convertFrom(cu) cause IlleagalStateException, return null");
            D.close();
            return null;
        }
    }

    @Override // o72.k4
    public java.util.List I0(int i17) {
        p75.n0 n0Var = dm.n3.E;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.m0 i18 = dm.n3.F.i(1);
        p75.i0 g17 = dm.n3.E.g(linkedList);
        g17.f352657d = i18;
        g17.d(linkedList2);
        g17.b(linkedList3);
        g17.c(i17, 0);
        return g17.a().k(this.f18308d, o72.r2.class);
    }

    @Override // o72.k4
    public java.util.List Oc(int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f18308d.f(("SELECT xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type,updateSeq,updateTime,tagProto,sessionId,datatotalsize,transferCtx,targetID,subType,rowid FROM FavItemInfo WHERE itemStatus > 0 AND (type = 8 OR type = 14 OR type = 18)") + " ORDER BY updateTime DESC LIMIT " + i17 + " , " + i18, null, 2);
        if (f17 == null) {
            return arrayList;
        }
        while (f17.moveToNext()) {
            o72.r2 r2Var = new o72.r2();
            r2Var.convertFrom(f17);
            arrayList.add(r2Var);
        }
        f17.close();
        return arrayList;
    }

    @Override // o72.k4
    public void Re(dm.n3 n3Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoStorage", "deleteItem itemLocalId:%s itemFavId:%s", java.lang.Long.valueOf(n3Var.field_localId), java.lang.Integer.valueOf(n3Var.field_id));
        this.f18308d.A("FavItemInfo", "delete from FavItemInfo where localId = " + n3Var.field_localId);
        doNotify(n3Var.field_localId + "", 5, java.lang.Long.valueOf(n3Var.field_localId));
    }

    @Override // o72.k4
    public java.util.List V1(int i17, int i18, java.util.List list, java.util.Set set, o72.i4 i4Var) {
        java.lang.String str;
        if (i18 == 0) {
            return null;
        }
        if (set != null && set.contains(java.lang.Integer.valueOf(i17))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoStorage", "getFirstPageList::block set contains target type, error, do return null");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (i17 != -1) {
            str = "select xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type,updateSeq,updateTime,tagProto,sessionId,datatotalsize,transferCtx,targetID,subType,rowid from FavItemInfo where itemStatus > 0 and type = " + i17;
        } else {
            str = "select xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type,updateSeq,updateTime,tagProto,sessionId,datatotalsize,transferCtx,targetID,subType,rowid from FavItemInfo where itemStatus > 0";
            if (set != null) {
                java.util.Iterator it = set.iterator();
                while (it.hasNext()) {
                    str = str + " and type != " + ((java.lang.Integer) it.next()).intValue();
                }
            }
        }
        java.lang.String str2 = str + " order by updateTime desc limit " + i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoStorage", "[getFirstPageList] sql = " + str2);
        android.database.Cursor f17 = this.f18308d.f(str2, null, 2);
        if (f17 == null) {
            return arrayList;
        }
        while (f17.moveToNext()) {
            o72.r2 r2Var = new o72.r2();
            r2Var.convertFrom(f17);
            if (i4Var == null || !((o72.b3) i4Var).c(r2Var, false, false)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoStorage", "[getFirstPageList] id[%d] type[%d] match filter", java.lang.Integer.valueOf(r2Var.field_id), java.lang.Integer.valueOf(r2Var.field_type));
                arrayList.add(r2Var);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoStorage", "id[%d] type[%d] match filter", java.lang.Integer.valueOf(r2Var.field_id), java.lang.Integer.valueOf(r2Var.field_type));
            }
        }
        f17.close();
        return arrayList;
    }

    @Override // o72.k4
    public java.util.List Wh(o72.j2 j2Var, int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int[] iArr = o72.a.f343303b;
        java.lang.String str = "";
        java.lang.String str2 = "";
        for (int i18 = 0; i18 < 3; i18++) {
            str2 = str2 + iArr[i18] + ",";
        }
        if (str2.endsWith(",")) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        java.lang.String str3 = ("select localId from FavItemInfo where  itemStatus in (" + str2 + ")") + " and datatotalsize > 0 ";
        int[] iArr2 = o72.a.f343302a;
        java.lang.String str4 = "";
        for (int i19 = 0; i19 < 7; i19++) {
            str4 = str4 + iArr2[i19] + ",";
        }
        if (str4.endsWith(",")) {
            str4 = str4.substring(0, str4.length() - 1);
        }
        java.lang.String str5 = str3 + " and type in (" + str4 + ")";
        if (j2Var != null) {
            java.util.Iterator it = j2Var.f343370a.iterator();
            while (it.hasNext()) {
                str = str + ((java.lang.Integer) it.next()).intValue() + ",";
            }
            if (str.endsWith(",")) {
                str = str.substring(0, str.length() - 1);
            }
            str5 = str5 + " and type in (" + str + ")";
        }
        android.database.Cursor B = this.f18308d.B(i17 == 0 ? str5 + " order by datatotalsize desc" : str5 + " order by updateTime asc", null);
        if (B == null) {
            return arrayList;
        }
        if (B.getCount() == 0) {
            B.close();
            return arrayList;
        }
        while (B.moveToNext()) {
            arrayList.add(java.lang.Long.valueOf(B.getLong(0)));
        }
        B.close();
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoStorage", "getCleanList cu.getCount() = %d,used %dms", java.lang.Integer.valueOf(arrayList.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return arrayList;
    }

    @Override // o72.k4
    public long X(long j17, int i17, int i18) {
        java.lang.String str;
        l75.k0 k0Var = this.f18308d;
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoStorage", "getNextUpdateTime, but db is null, return");
            return 0L;
        }
        if (j17 == 0) {
            if (i18 != -1) {
                str = "select updateTime from FavItemInfo where itemStatus > 0 and type = " + i18;
            } else {
                str = "select updateTime from FavItemInfo where itemStatus > 0";
            }
            android.database.Cursor B = k0Var.B(str + " order by updateTime desc limit " + i17, null);
            if (B == null) {
                return 0L;
            }
            if (B.getCount() == 0) {
                B.close();
                return 0L;
            }
            B.moveToLast();
            long j18 = B.getLong(0);
            B.close();
            return j18;
        }
        java.lang.String str2 = "select updateTime from FavItemInfo where updateTime < " + j17;
        if (i18 != -1) {
            str2 = str2 + " and type = " + i18;
        }
        android.database.Cursor B2 = k0Var.B((str2 + " and itemStatus > 0") + " order by updateTime desc limit " + i17, null);
        if (B2 != null && B2.getCount() > 0) {
            B2.moveToLast();
            j17 = B2.getLong(0);
        }
        if (B2 != null) {
            B2.close();
        }
        return j17;
    }

    @Override // o72.k4
    public boolean Xc() {
        return false;
    }

    @Override // o72.k4
    public java.lang.Long Y6() {
        android.database.Cursor f17 = this.f18308d.f("select localId from FavItemInfo order by localId desc limit 1", null, 2);
        if (f17 == null || f17.getCount() == 0) {
            return java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        }
        f17.moveToNext();
        java.lang.Long valueOf = java.lang.Long.valueOf(f17.getLong(0));
        f17.close();
        return valueOf;
    }

    @Override // o72.k4
    public long Z0(long j17, int i17, int i18) {
        java.lang.String str;
        l75.k0 k0Var = this.f18308d;
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoStorage", "getMinBatchGetUpdateTime, but db is null, return");
            return 0L;
        }
        if (j17 == 0) {
            if (i18 != -1) {
                str = "select updateTime from (select * from FavItemInfo where type = " + i18;
            } else {
                str = "select updateTime from (select * from FavItemInfo";
            }
            android.database.Cursor B = k0Var.B((str + " order by updateTime desc limit " + i17) + ") where updateSeq > localSeq", null);
            if (B == null) {
                return 0L;
            }
            if (B.getCount() == 0) {
                B.close();
                return 0L;
            }
            B.moveToLast();
            long j18 = B.getLong(0);
            B.close();
            return j18;
        }
        java.lang.String str2 = "select updateTime from (select * from FavItemInfo where updateTime < " + j17;
        if (i18 != -1) {
            str2 = str2 + " and type = " + i18;
        }
        android.database.Cursor B2 = k0Var.B((str2 + " order by updateTime desc ") + ") where updateSeq > localSeq", null);
        if (B2 == null) {
            return 0L;
        }
        if (B2.getCount() == 0) {
            B2.close();
            return 0L;
        }
        B2.moveToLast();
        long j19 = B2.getLong(0);
        B2.close();
        return j19;
    }

    @Override // o72.k4
    public boolean a3(long j17, int i17) {
        java.lang.String str = "select count(updateTime) from FavItemInfo where updateTime < " + j17;
        if (i17 != -1) {
            str = str + " and type = " + i17;
        }
        android.database.Cursor f17 = this.f18308d.f(str, null, 2);
        if (f17 == null) {
            return true;
        }
        f17.moveToFirst();
        if (f17.getInt(0) == 0) {
            f17.close();
            return true;
        }
        f17.close();
        return false;
    }

    @Override // o72.k4
    public boolean b6(o72.j4 j4Var) {
        boolean z17;
        l75.k0 k0Var = this.f18308d;
        k0Var.b();
        try {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoStorage", "begin transaction, thread id:" + java.lang.Thread.currentThread().getId());
            } catch (java.lang.Exception e17) {
                e = e17;
            }
            try {
                z17 = ((s72.s) j4Var).a();
            } catch (java.lang.Exception e18) {
                e = e18;
                z17 = false;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Fav.FavItemInfoStorage", e, "runTransaction", new java.lang.Object[0]);
                return z17;
            }
            try {
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoStorage", "run transaction successfully, thread id:" + java.lang.Thread.currentThread().getId());
                    k0Var.r();
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoStorage", "run transaction failed, thread id:" + java.lang.Thread.currentThread().getId());
                }
            } catch (java.lang.Exception e19) {
                e = e19;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Fav.FavItemInfoStorage", e, "runTransaction", new java.lang.Object[0]);
                return z17;
            }
            return z17;
        } finally {
            k0Var.t();
        }
    }

    @Override // l75.n0, l75.g0
    /* renamed from: c4, reason: merged with bridge method [inline-methods] */
    public boolean insert(o72.r2 r2Var) {
        if (com.tencent.mars.xlog.Log.isDebug()) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.sdk.platformtools.z3.b(true);
            long j17 = r2Var.field_localId;
        }
        iz5.a.g(null, r2Var.field_localId > 0);
        r45.jq0 jq0Var = r2Var.field_favProto.f370962d;
        if (jq0Var != null) {
            int i17 = jq0Var.f378034d;
            if (i17 <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoStorage", "insert::favid %d favlocalid %d type %d, sourceTypeError %d", java.lang.Integer.valueOf(r2Var.field_id), java.lang.Long.valueOf(r2Var.field_localId), java.lang.Integer.valueOf(r2Var.field_type), java.lang.Integer.valueOf(jq0Var.f378034d));
                jq0Var.g(1);
            } else {
                jq0Var.g(i17);
            }
        }
        o72.x1.b(r2Var);
        boolean insertNotify = insertNotify(r2Var, false);
        if (insertNotify) {
            doNotify(r2Var.field_localId + "", 2, java.lang.Long.valueOf(r2Var.field_localId));
        }
        return insertNotify;
    }

    @Override // o72.k4
    public void d5(int i17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoStorage", "setStatus status:%d localId:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        this.f18308d.A("FavItemInfo", "update FavItemInfo set itemStatus = " + i17 + " where localId = " + j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append("");
        doNotify(sb6.toString());
    }

    @Override // o72.k4
    public void di() {
        int i17;
        int i18;
        long j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoStorage", "calDataBaseDataTotalLength");
        int[] iArr = o72.a.f343303b;
        java.lang.String str = "";
        int i19 = 0;
        java.lang.String str2 = "";
        int i27 = 0;
        while (true) {
            i17 = 3;
            if (i27 >= 3) {
                break;
            }
            str2 = str2 + iArr[i27] + ",";
            i27++;
        }
        int i28 = 1;
        if (str2.endsWith(",")) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        java.lang.String str3 = "select xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type,updateSeq,updateTime,tagProto,sessionId,datatotalsize,transferCtx,targetID,subType,rowid from FavItemInfo where itemStatus in (" + str2 + ")";
        int[] iArr2 = o72.a.f343302a;
        for (int i29 = 0; i29 < 7; i29++) {
            str = str + iArr2[i29] + ",";
        }
        if (str.endsWith(",")) {
            str = str.substring(0, str.length() - 1);
        }
        l75.k0 k0Var = this.f18308d;
        android.database.Cursor B = k0Var.B(str3 + " and type in (" + str + ")", null);
        if (B == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoStorage", "calDataBaseDataTotalLength cu = null");
            return;
        }
        if (B.getCount() == 0) {
            B.close();
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoStorage", "calDataBaseDataTotalLength cu.getCount() = 0");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoStorage", "calDataBaseDataTotalLength cu.getCount() = " + B.getCount());
        long F = k0Var != null ? k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId())) : 0L;
        while (B.moveToNext()) {
            o72.r2 r2Var = new o72.r2();
            r2Var.convertFrom(B);
            int i37 = r2Var.field_itemStatus;
            int i38 = i19;
            while (true) {
                if (i38 >= i17) {
                    i18 = i19;
                    break;
                } else {
                    if (iArr[i38] == i37) {
                        i18 = i28;
                        break;
                    }
                    i38++;
                }
            }
            if (i18 != 0) {
                r45.bq0 bq0Var = r2Var.field_favProto;
                if (bq0Var != null) {
                    java.util.Iterator it = bq0Var.f370964f.iterator();
                    j17 = 0;
                    while (it.hasNext()) {
                        j17 += ((r45.gp0) it.next()).R;
                    }
                } else {
                    j17 = 0;
                }
                r2Var.field_datatotalsize = j17;
                update(r2Var, dm.i4.COL_LOCALID);
            }
            i19 = 0;
            i17 = 3;
            i28 = 1;
        }
        if (k0Var != null) {
            k0Var.w(java.lang.Long.valueOf(F));
        }
        B.close();
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoStorage", "calDataBaseDataTotalLength end");
    }

    @Override // o72.k4
    public java.util.List j6() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int[] iArr = o72.a.f343303b;
        java.lang.String str = "";
        java.lang.String str2 = "";
        for (int i17 = 0; i17 < 3; i17++) {
            str2 = str2 + iArr[i17] + ",";
        }
        if (str2.endsWith(",")) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        java.lang.String str3 = ("select localId from FavItemInfo where  itemStatus in (" + str2 + ")") + " and datatotalsize > 0 ";
        int[] iArr2 = o72.a.f343302a;
        for (int i18 = 0; i18 < 7; i18++) {
            str = str + iArr2[i18] + ",";
        }
        if (str.endsWith(",")) {
            str = str.substring(0, str.length() - 1);
        }
        android.database.Cursor B = this.f18308d.B((str3 + " and type in (" + str + ")") + " order by datatotalsize desc", null);
        if (B == null) {
            return arrayList;
        }
        if (B.getCount() == 0) {
            B.close();
            return arrayList;
        }
        while (B.moveToNext()) {
            arrayList.add(java.lang.Long.valueOf(B.getLong(0)));
        }
        B.close();
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoStorage", "getCleanList cu.getCount() = %d,used %dms", java.lang.Integer.valueOf(arrayList.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return arrayList;
    }

    @Override // o72.k4
    public java.util.List ke() {
        java.util.ArrayList arrayList = null;
        android.database.Cursor f17 = this.f18308d.f("select xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type,updateSeq,updateTime,tagProto,sessionId,datatotalsize,transferCtx,targetID,subType,rowid from FavItemInfo where (itemStatus=9 or itemStatus=12)", null, 2);
        if (f17 == null) {
            return null;
        }
        if (f17.moveToFirst()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            do {
                o72.r2 r2Var = new o72.r2();
                r2Var.convertFrom(f17);
                arrayList2.add(r2Var);
            } while (f17.moveToNext());
            arrayList = arrayList2;
        }
        f17.close();
        return arrayList;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: lf, reason: merged with bridge method [inline-methods] */
    public boolean update(final o72.r2 r2Var, java.lang.String... strArr) {
        int i17;
        if (o72.d3.f343325e) {
            final o72.r2 F = F(r2Var.field_localId);
            if (F != null && F.field_updateSeq > r2Var.field_updateSeq) {
                java.lang.Object[] objArr = new java.lang.Object[6];
                objArr[0] = java.lang.Integer.valueOf(r2Var.field_id);
                objArr[1] = java.lang.Long.valueOf(r2Var.field_localId);
                objArr[2] = java.lang.Integer.valueOf(r2Var.field_type);
                objArr[3] = java.lang.Integer.valueOf(r2Var.field_updateSeq);
                objArr[4] = java.lang.Integer.valueOf(F.field_updateSeq);
                r45.bq0 bq0Var = r2Var.field_favProto;
                objArr[5] = java.lang.Integer.valueOf(bq0Var != null ? bq0Var.E : -1);
                com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoStorage", "update: favId=%d favLocalId=%d type=%d, updateSeq=%d, oldUpdateSeq=%d, version=%d", objArr);
                com.tencent.mm.plugin.report.service.d1.f158158b.d("update_fav_item_db_seq_error", true, pm0.w.f356804e, null, true, false, new yz5.a() { // from class: b82.d$$a
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        java.lang.Object[] objArr2 = new java.lang.Object[7];
                        o72.r2 r2Var2 = o72.r2.this;
                        objArr2[0] = java.lang.Integer.valueOf(r2Var2.field_id);
                        objArr2[1] = java.lang.Long.valueOf(r2Var2.field_localId);
                        objArr2[2] = java.lang.Integer.valueOf(r2Var2.field_type);
                        objArr2[3] = java.lang.Integer.valueOf(r2Var2.field_updateSeq);
                        objArr2[4] = java.lang.Integer.valueOf(F.field_updateSeq);
                        r45.bq0 bq0Var2 = r2Var2.field_favProto;
                        objArr2[5] = java.lang.Integer.valueOf(bq0Var2 != null ? bq0Var2.E : -1);
                        objArr2[6] = java.lang.Boolean.FALSE;
                        return java.lang.String.format("favId=%d;favLocalId=%d;type=%d;updateSeq=%d;oldUpdateSeq=%d;version=%d;isNewDb=%b", objArr2);
                    }
                });
                return false;
            }
            if (F != null && (i17 = F.field_id) > 0 && i17 != r2Var.field_id) {
                java.lang.Object[] objArr2 = new java.lang.Object[7];
                objArr2[0] = java.lang.Integer.valueOf(i17);
                objArr2[1] = java.lang.Integer.valueOf(r2Var.field_id);
                objArr2[2] = java.lang.Long.valueOf(r2Var.field_localId);
                objArr2[3] = java.lang.Integer.valueOf(r2Var.field_type);
                objArr2[4] = java.lang.Integer.valueOf(r2Var.field_updateSeq);
                objArr2[5] = java.lang.Integer.valueOf(F.field_updateSeq);
                r45.bq0 bq0Var2 = r2Var.field_favProto;
                objArr2[6] = java.lang.Integer.valueOf(bq0Var2 != null ? bq0Var2.E : -1);
                com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoStorage", "update: error fav id, oldFavId=%d, newFavId=%d favLocalId=%d type=%d, updateSeq=%d, oldUpdateSeq=%d, version=%d", objArr2);
                r2Var.field_id = F.field_id;
                com.tencent.mm.plugin.report.service.d1.f158158b.d("update_fav_item_db_error_fav_id", true, pm0.w.f356804e, null, true, false, new yz5.a() { // from class: b82.d$$b
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        java.lang.Object[] objArr3 = new java.lang.Object[6];
                        o72.r2 r2Var2 = o72.r2.this;
                        objArr3[0] = java.lang.Integer.valueOf(r2Var2.field_id);
                        objArr3[1] = java.lang.Integer.valueOf(F.field_id);
                        objArr3[2] = java.lang.Long.valueOf(r2Var2.field_localId);
                        objArr3[3] = java.lang.Integer.valueOf(r2Var2.field_type);
                        r45.bq0 bq0Var3 = r2Var2.field_favProto;
                        objArr3[4] = java.lang.Integer.valueOf(bq0Var3 != null ? bq0Var3.E : -1);
                        objArr3[5] = java.lang.Boolean.FALSE;
                        return java.lang.String.format("newFavId=%d;oldFavId=%d;favLocalId=%d;type=%d;version=%d;isNewDb=%b", objArr3);
                    }
                });
            }
        }
        r45.jq0 jq0Var = r2Var.field_favProto.f370962d;
        if (jq0Var != null) {
            int i18 = jq0Var.f378034d;
            if (i18 <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoStorage", "update::favid %d favlocalid %d type %d, sourceTypeError %d", java.lang.Integer.valueOf(r2Var.field_id), java.lang.Long.valueOf(r2Var.field_localId), java.lang.Integer.valueOf(r2Var.field_type), java.lang.Integer.valueOf(jq0Var.f378034d));
                jq0Var.g(1);
            } else {
                jq0Var.g(i18);
            }
        }
        if (r2Var.field_favProto == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoStorage", "FavProtoItem null, info localid:" + r2Var.field_localId + ", type:" + r2Var.field_type);
            jx3.f.INSTANCE.d(22021, 20251031, java.lang.Integer.valueOf(r2Var.field_type), "FavProtoItem null");
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Fav.FavItemInfoStorage", "FavProtoItem null", new java.lang.Object[0]);
        }
        o72.x1.b(r2Var);
        boolean updateNotify = super.updateNotify(r2Var, false, strArr);
        if (updateNotify) {
            doNotify(r2Var.field_localId + "", 3, java.lang.Long.valueOf(r2Var.field_localId));
        }
        com.tencent.mm.sdk.platformtools.z3.b(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoStorage", "update favItem localId:%s favId:%s update time:%s xml:%s ret:%s", java.lang.Long.valueOf(r2Var.field_localId), java.lang.Integer.valueOf(r2Var.field_id), java.lang.Long.valueOf(r2Var.field_updateTime), r2Var.field_xml, java.lang.Boolean.valueOf(updateNotify));
        return updateNotify;
    }

    @Override // o72.k4
    public boolean ma(long j17, int i17, java.util.List list, java.util.Set set, o72.i4 i4Var) {
        if (set != null && set.contains(java.lang.Integer.valueOf(i17))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoStorage", "hasShowAllValidItem::block set contains target type, error, do return true");
            return true;
        }
        java.lang.String str = "select count(updateTime) from FavItemInfo where updateTime < " + j17;
        if (i17 != -1) {
            str = str + " and type = " + i17;
        } else if (set != null) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                str = str + " and type != " + ((java.lang.Integer) it.next()).intValue();
            }
        }
        android.database.Cursor f17 = this.f18308d.f(str + " and itemStatus > 0", null, 2);
        if (f17 == null) {
            return true;
        }
        f17.moveToFirst();
        if (f17.getInt(0) == 0) {
            f17.close();
            return true;
        }
        f17.close();
        return false;
    }

    @Override // o72.k4
    public java.util.List o4() {
        java.util.ArrayList arrayList = null;
        android.database.Cursor f17 = this.f18308d.f("select xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type,updateSeq,updateTime,tagProto,sessionId,datatotalsize,transferCtx,targetID,subType,rowid from FavItemInfo where itemStatus=3 or itemStatus=6 or itemStatus=11 or itemStatus=14 or itemStatus=16 or itemStatus=18", null, 2);
        if (f17 == null) {
            return null;
        }
        if (f17.moveToFirst()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            do {
                o72.r2 r2Var = new o72.r2();
                r2Var.convertFrom(f17);
                arrayList2.add(r2Var);
            } while (f17.moveToNext());
            arrayList = arrayList2;
        }
        f17.close();
        return arrayList;
    }

    @Override // o72.k4
    public java.util.List qh() {
        java.util.ArrayList arrayList = null;
        android.database.Cursor f17 = this.f18308d.f("select xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type,updateSeq,updateTime,tagProto,sessionId,datatotalsize,transferCtx,targetID,subType,rowid from FavItemInfo where itemStatus=17", null, 2);
        if (f17 == null) {
            return null;
        }
        if (f17.moveToFirst()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            do {
                o72.r2 r2Var = new o72.r2();
                r2Var.convertFrom(f17);
                arrayList2.add(r2Var);
            } while (f17.moveToNext());
            arrayList = arrayList2;
        }
        f17.close();
        return arrayList;
    }

    @Override // o72.k4
    public o72.r2 rc(java.lang.String str) {
        android.database.Cursor D = this.f18308d.D("FavItemInfo", null, "sourceId=?", new java.lang.String[]{"" + str}, null, null, null, 2);
        if (!D.moveToFirst()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoStorage", "klem getBySourceId:%s, no data", str);
            D.close();
            return null;
        }
        o72.r2 r2Var = new o72.r2();
        r2Var.convertFrom(D);
        D.close();
        return r2Var;
    }

    @Override // o72.k4
    public o72.r2 re(long j17) {
        android.database.Cursor B = this.f18308d.B("Select * from FavItemInfo where id = " + j17, null);
        if (B.getCount() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoStorage", "klem getByFavId:%d, no data", java.lang.Long.valueOf(j17));
            B.close();
            return null;
        }
        o72.r2 r2Var = new o72.r2();
        B.moveToFirst();
        try {
            r2Var.convertFrom(B);
            B.close();
            return r2Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Fav.FavItemInfoStorage", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoStorage", "getByFavId(%d),info.convertFrom error", java.lang.Long.valueOf(j17));
            B.close();
            return null;
        }
    }

    @Override // o72.k4
    public l75.k0 u2() {
        return this.f18308d;
    }

    @Override // o72.k4
    public java.util.List v0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f18308d.f("select localId from FavItemInfo order by updateTime desc", null, 2);
        if (f17 == null) {
            return arrayList;
        }
        if (f17.getCount() == 0) {
            f17.close();
            return arrayList;
        }
        while (f17.moveToNext()) {
            arrayList.add(java.lang.Long.valueOf(f17.getLong(0)));
        }
        f17.close();
        return arrayList;
    }

    @Override // o72.k4
    public java.util.LinkedList vh(long j17, int i17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.String str = "select id from FavItemInfo where updateTime >= " + j17;
        if (i17 != -1) {
            str = str + " and type = " + i17;
        }
        android.database.Cursor f17 = this.f18308d.f((str + " and updateSeq > localSeq") + " order by updateTime desc", null, 2);
        if (f17 == null) {
            return linkedList;
        }
        while (f17.moveToNext()) {
            linkedList.add(java.lang.Integer.valueOf(f17.getInt(0)));
        }
        f17.close();
        return linkedList;
    }

    @Override // o72.k4
    public java.util.ArrayList wa(java.util.List list, java.util.List list2, java.util.Set set, o72.i4 i4Var, boolean z17) {
        java.util.ArrayList arrayList = null;
        if (list != null && list.size() != 0 && list.size() <= 20) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("select xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type,updateSeq,updateTime,tagProto,sessionId,datatotalsize,transferCtx,targetID,subType,rowid from FavItemInfo where ");
            if (set != null && set.size() > 0) {
                stringBuffer.append("( 1=1");
                java.util.Iterator it = set.iterator();
                while (it.hasNext()) {
                    java.lang.Integer num = (java.lang.Integer) it.next();
                    stringBuffer.append(" and type != ");
                    stringBuffer.append(num);
                }
                stringBuffer.append(") and ");
            }
            int size = list.size();
            for (int i17 = 0; i17 < size; i17++) {
                if (i17 == 0) {
                    stringBuffer.append("( ");
                }
                if (i17 == size - 1) {
                    stringBuffer.append("localId = ");
                    stringBuffer.append(list.get(i17));
                    stringBuffer.append(" )");
                } else {
                    stringBuffer.append("localId = ");
                    stringBuffer.append(list.get(i17));
                    stringBuffer.append(" or ");
                }
            }
            if (z17) {
                stringBuffer.append("order by case FavItemInfo.localId ");
                for (int i18 = 0; i18 < list.size(); i18++) {
                    stringBuffer.append(" when '");
                    stringBuffer.append(list.get(i18));
                    stringBuffer.append("' then ");
                    stringBuffer.append(i18);
                }
                stringBuffer.append(" end");
            } else {
                stringBuffer.append(" order by updateTime desc");
            }
            android.database.Cursor f17 = this.f18308d.f(stringBuffer.toString(), null, 2);
            if (f17 == null) {
                return null;
            }
            if (f17.moveToFirst()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                do {
                    o72.r2 r2Var = (list2 == null || list2.isEmpty()) ? new o72.r2() : (o72.r2) list2.remove(0);
                    try {
                        r2Var.convertFrom(f17);
                        if (i4Var == null || !((o72.b3) i4Var).c(r2Var, false, false)) {
                            arrayList2.add(r2Var);
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoStorage", "id[%d] type[%d] match filter", java.lang.Integer.valueOf(r2Var.field_id), java.lang.Integer.valueOf(r2Var.field_type));
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Fav.FavItemInfoStorage", th6, "convertfrom err", new java.lang.Object[0]);
                    }
                } while (f17.moveToNext());
                arrayList = arrayList2;
            }
            f17.close();
        }
        return arrayList;
    }

    @Override // o72.k4
    public boolean xb(o72.r2 r2Var, java.lang.String... strArr) {
        r45.jq0 jq0Var = r2Var.field_favProto.f370962d;
        if (jq0Var != null) {
            int i17 = jq0Var.f378034d;
            if (i17 <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoStorage", "update::favid %d favlocalid %d type %d, sourceTypeError %d", java.lang.Integer.valueOf(r2Var.field_id), java.lang.Long.valueOf(r2Var.field_localId), java.lang.Integer.valueOf(r2Var.field_type), java.lang.Integer.valueOf(jq0Var.f378034d));
                jq0Var.g(1);
            } else {
                jq0Var.g(i17);
            }
        }
        return super.updateNotify(r2Var, false, strArr);
    }

    @Override // o72.k4
    public java.util.List z4(long j17, int i17, java.util.List list, java.util.Set set, o72.i4 i4Var) {
        if (set != null && set.contains(java.lang.Integer.valueOf(i17))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavItemInfoStorage", "getList::block set contains target type, error, do return null");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = "select xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type,updateSeq,updateTime,tagProto,sessionId,datatotalsize,transferCtx,targetID,subType,rowid from FavItemInfo where updateTime >= " + j17;
        if (i17 != -1) {
            str = str + " and type = " + i17;
        } else if (set != null) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                str = str + " and type != " + ((java.lang.Integer) it.next()).intValue();
            }
        }
        java.lang.String str2 = (str + " and itemStatus > 0") + " order by updateTime desc";
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoStorage", "[getList] sql = " + str2 + ", updateTime = " + j17);
        android.database.Cursor f17 = this.f18308d.f(str2, null, 2);
        if (f17 == null) {
            return arrayList;
        }
        while (f17.moveToNext()) {
            o72.r2 r2Var = new o72.r2();
            try {
                r2Var.convertFrom(f17);
                if (i4Var == null || !((o72.b3) i4Var).c(r2Var, false, false)) {
                    arrayList.add(r2Var);
                }
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavItemInfoStorage", "fav getlist convertfrom (cu) error,continue");
            }
        }
        f17.close();
        return arrayList;
    }
}
