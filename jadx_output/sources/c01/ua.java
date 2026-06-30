package c01;

/* loaded from: classes9.dex */
public class ua extends l75.s0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f37508e = {"CREATE TABLE IF NOT EXISTS readerappnews1 ( tweetid text  PRIMARY KEY , time long  , type int  , name text  , title text  , url text  , shorturl text  , longurl text  , pubtime long  , sourcename text  , sourceicon text  , istop int  , cover text  , digest text  , reserved1 int  , reserved2 long  , reserved3 text  , reserved4 text  ) ", "CREATE TABLE IF NOT EXISTS readerappweibo ( tweetid text  PRIMARY KEY , time long  , type int  , name text  , title text  , url text  , shorturl text  , longurl text  , pubtime long  , sourcename text  , sourceicon text  , istop int  , cover text  , digest text  , reserved1 int  , reserved2 long  , reserved3 text  , reserved4 text  ) ", "CREATE INDEX IF NOT EXISTS  readerapptime ON readerappnews1 ( time )", "CREATE INDEX IF NOT EXISTS  readerappfunctionId ON readerappnews1 ( reserved3 )", "CREATE INDEX IF NOT EXISTS readerappweiboreaderapptime ON readerappweibo ( time )"};

    /* renamed from: f, reason: collision with root package name */
    public static boolean f37509f = false;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f37510d;

    public ua(l75.k0 k0Var) {
        this.f37510d = k0Var;
    }

    public static java.lang.String J0(java.lang.String str) {
        return "select tweetid,time,type,name,title,url,shorturl,longurl,pubtime,sourcename,sourceicon,istop,cover,digest,reserved1,reserved2,reserved3,reserved4 from " + str + "  ";
    }

    public java.util.List D0(long j17, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f37510d.f(J0(L0(i17)) + " where reserved2 = " + j17, null, 2);
        while (f17.moveToNext()) {
            c01.ta taVar = new c01.ta();
            taVar.a(f17);
            arrayList.add(taVar);
        }
        f17.close();
        return arrayList;
    }

    public final java.lang.String L0(int i17) {
        if (i17 == 20) {
            return "readerappnews1";
        }
        if (i17 == 11) {
            return "readerappweibo";
        }
        iz5.a.g("INFO TYPE NEITHER NEWS NOR WEIBO", false);
        return null;
    }

    public boolean P0(c01.ta taVar) {
        if (taVar == null) {
            return false;
        }
        taVar.A = -1;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((taVar.A & 1) != 0) {
            contentValues.put("tweetid", taVar.g());
        }
        if ((taVar.A & 2) != 0) {
            contentValues.put("time", java.lang.Long.valueOf(taVar.f37469b));
        }
        if ((taVar.A & 4) != 0) {
            contentValues.put("type", java.lang.Integer.valueOf(taVar.f37470c));
        }
        if ((taVar.A & 8) != 0) {
            java.lang.String str = taVar.f37471d;
            if (str == null) {
                str = "";
            }
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str);
        }
        if ((taVar.A & 16) != 0) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, taVar.f());
        }
        if ((taVar.A & 32) != 0) {
            contentValues.put("url", taVar.h());
        }
        if ((taVar.A & 64) != 0) {
            java.lang.String str2 = taVar.f37474g;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put("shorturl", str2);
        }
        if ((taVar.A & 128) != 0) {
            java.lang.String str3 = taVar.f37475h;
            if (str3 == null) {
                str3 = "";
            }
            contentValues.put("longurl", str3);
        }
        if ((taVar.A & 256) != 0) {
            contentValues.put("pubtime", java.lang.Long.valueOf(taVar.f37476i));
        }
        if ((taVar.A & 512) != 0) {
            java.lang.String str4 = taVar.f37477j;
            if (str4 == null) {
                str4 = "";
            }
            contentValues.put("sourcename", str4);
        }
        if ((taVar.A & 1024) != 0) {
            java.lang.String str5 = taVar.f37478k;
            if (str5 == null) {
                str5 = "";
            }
            contentValues.put("sourceicon", str5);
        }
        if ((taVar.A & 2048) != 0) {
            contentValues.put("istop", java.lang.Integer.valueOf(taVar.f37479l));
        }
        if ((taVar.A & 4096) != 0) {
            contentValues.put("cover", taVar.c());
        }
        if ((taVar.A & 8192) != 0) {
            contentValues.put("digest", taVar.d());
        }
        if ((taVar.A & 16384) != 0) {
            contentValues.put("reserved1", java.lang.Integer.valueOf(taVar.f37482o));
        }
        if ((taVar.A & 32768) != 0) {
            contentValues.put("reserved2", java.lang.Long.valueOf(taVar.f37483p));
        }
        if ((taVar.A & 65536) != 0) {
            java.lang.String str6 = taVar.f37484q;
            if (str6 == null) {
                str6 = "";
            }
            contentValues.put("reserved3", str6);
        }
        if ((taVar.A & 131072) != 0) {
            java.lang.String str7 = taVar.f37485r;
            contentValues.put("reserved4", str7 != null ? str7 : "");
        }
        return ((int) this.f37510d.l(L0(taVar.f37470c), "tweetid", contentValues)) != -1;
    }

    public final void W0(int i17) {
        java.lang.String str = J0(L0(i17)) + " where istop = 1  group by reserved3 ORDER BY time DESC  limit 2";
        com.tencent.mars.xlog.Log.i("MicroMsg.ReaderAppInfoStorage", "reset conversation, sql is %s", str);
        android.database.Cursor f17 = this.f37510d.f(str, null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
            l4Var.b2(c01.ta.e(i17));
            l4Var.l1("");
            l4Var.n1(0L);
            l4Var.M1(0);
            l4Var.Y1(0);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(l4Var, c01.ta.e(i17));
            return;
        }
        c01.ta taVar = new c01.ta();
        taVar.a(f17);
        f17.close();
        com.tencent.mm.storage.l4 l4Var2 = new com.tencent.mm.storage.l4();
        l4Var2.b2(c01.ta.e(i17));
        l4Var2.l1(taVar.f());
        l4Var2.n1(taVar.f37469b);
        l4Var2.M1(0);
        l4Var2.Y1(0);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(l4Var2, c01.ta.e(i17));
    }

    public void m0(int i17) {
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(c01.ta.e(i17));
        if (p17 == null || !p17.h1().equals(c01.ta.e(i17))) {
            return;
        }
        p17.b2(c01.ta.e(i17));
        p17.l1("");
        p17.M1(0);
        p17.Y1(0);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(p17, c01.ta.e(i17));
        if (this.f37510d.A(L0(i17), "delete from " + L0(i17))) {
            doNotify();
        }
        if (i17 == 20) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(wj.t0.H);
            arrayList.add(wj.t0.I);
            arrayList.add(wj.t0.E);
            arrayList.add(wj.t0.F);
            arrayList.forEach(new c01.ua$$a());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0056, code lost:
    
        if (r0 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n0(java.lang.String r10, int r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c01.ua.n0(java.lang.String, int, boolean, boolean):void");
    }

    public void s0(java.lang.String str) {
        java.lang.StringBuilder sb6;
        android.database.Cursor cursor = null;
        try {
            try {
                sb6 = new java.lang.StringBuilder("select ");
                sb6.append("reserved4");
                sb6.append(" from readerappnews1");
                sb6.append(" where ");
                sb6.append(str);
                cursor = this.f37510d.f(sb6.toString(), null, 2);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ReaderAppInfoStorage", "deleteYuanBaoAd error %s", e17);
                if (0 == 0) {
                    return;
                }
            }
            if (cursor == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ReaderAppInfoStorage", "deleteYuanBaoAd sql error , %s", sb6);
                if (cursor != null) {
                    cursor.close();
                    return;
                }
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (cursor.moveToNext()) {
                c01.ta taVar = new c01.ta();
                taVar.f37485r = cursor.getString(0);
                arrayList.add(taVar);
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c01.ta taVar2 = (c01.ta) it.next();
                taVar2.i();
                if (taVar2.f37489v == 5) {
                    taVar2.i();
                    java.lang.String str2 = taVar2.f37493z;
                    taVar2.i();
                    int i17 = taVar2.f37492y;
                    ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).Di(i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? wj.t0.f446508q : wj.t0.F : wj.t0.E : wj.t0.I : wj.t0.H, str2);
                }
            }
            cursor.close();
        } catch (java.lang.Throwable th6) {
            if (0 != 0) {
                cursor.close();
            }
            throw th6;
        }
    }

    public android.database.Cursor u0(int i17, int i18) {
        return this.f37510d.B("SELECT reserved3 from (SELECT reserved3,time from " + L0(i18) + " GROUP BY reserved3 ORDER BY time DESC  LIMIT " + i17 + ") ORDER BY time ASC", null);
    }

    public int y0(int i17) {
        android.database.Cursor f17 = this.f37510d.f("select count(*) from (SELECT count(*) FROM " + L0(i17) + " group by reserved3)", null, 2);
        int i18 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i18;
    }

    public java.util.List z0(java.lang.String str, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f37510d.f(J0(L0(i17)) + "where reserved3 = " + d95.b0.O(str) + " order by istop desc , tweetid asc ", null, 2);
        while (f17.moveToNext()) {
            c01.ta taVar = new c01.ta();
            taVar.a(f17);
            arrayList.add(taVar);
        }
        f17.close();
        return arrayList;
    }
}
