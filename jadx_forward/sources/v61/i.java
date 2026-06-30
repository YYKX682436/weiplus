package v61;

/* loaded from: classes8.dex */
public final class i implements v61.h {

    /* renamed from: a, reason: collision with root package name */
    public final int f514977a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f514978b;

    /* renamed from: c, reason: collision with root package name */
    public final android.net.Uri f514979c;

    public i(int i17, java.lang.String str, android.net.Uri uri) {
        this.f514977a = i17;
        this.f514978b = str;
        this.f514979c = uri;
    }

    @Override // v61.h
    public int a(android.content.Context context) {
        java.lang.String str;
        java.lang.String str2;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "null context");
            return 1;
        }
        if (!gm0.j1.b().n() || gm0.m.r()) {
            return 3;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) gm0.j1.u().c().l(6, ""))) {
            return 2;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (!j35.u.d(context, "android.permission.READ_CONTACTS", true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "no contacts permission");
            return 1;
        }
        if (this.f514979c == null) {
            java.lang.String str3 = this.f514978b;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                return b(context, kk.k.g(o25.b.a(str3).getBytes()), null, null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "uri is null and the phone num is null");
            return 1;
        }
        android.database.Cursor query = context.getContentResolver().query(this.f514979c, new java.lang.String[]{"contact_id", "_id", "data4"}, null, null, null);
        if (query == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "query database err");
            return 1;
        }
        if (!query.moveToFirst()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "query database err, move to first fail");
            return 1;
        }
        int columnIndex = query.getColumnIndex("data4");
        try {
            if (columnIndex == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "no data4 segment exist");
                return 1;
            }
            try {
                str2 = query.getString(columnIndex);
                try {
                    int columnIndex2 = query.getColumnIndex("contact_id");
                    str = columnIndex2 >= 0 ? query.getString(columnIndex2) : "";
                } catch (java.lang.Exception e17) {
                    e = e17;
                    str = "";
                }
            } catch (java.lang.Exception e18) {
                e = e18;
                str = "";
                str2 = str;
            }
            try {
                int columnIndex3 = query.getColumnIndex("_id");
                java.lang.String string = columnIndex3 >= 0 ? query.getString(columnIndex3) : "";
                query.close();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    return b(context, str2, string, str);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "null friendmobile");
                return 1;
            } catch (java.lang.Exception e19) {
                e = e19;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "match error, %s\n%s", e.getMessage(), com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "result friendMobileMd5 %s contact_id %s data_id %s", str2, str, "");
                return 1;
            }
        } finally {
            query.close();
        }
    }

    public final int b(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        r61.a i17 = m61.k.wi().i(str);
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "null context");
            return 1;
        }
        if (i17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "this user is not my friend");
            return 1;
        }
        java.lang.String i18 = i17.i();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "get username failed, phonenum md5 is " + str);
            return 1;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(i18)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            int i19 = this.f514977a;
            g0Var.d(11157, java.lang.Integer.valueOf(i19));
            if (i19 == 1) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_User", i18);
                intent.putExtra("finish_direct", true);
                intent.addFlags(67108864);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent, context);
                return 0;
            }
            if (i19 == 2) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("sns_userName", i18);
                intent2.addFlags(67108864);
                intent2.putExtra("sns_adapter_type", 1);
                j45.l.j(context, "sns", ".ui.SnsUserUI", intent2, null);
                return 0;
            }
            if (i19 == 3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
                am.y00 y00Var = c6231x4f3054ba.f136478g;
                y00Var.f89948b = 5;
                y00Var.f89951e = i18;
                y00Var.f89950d = context;
                y00Var.f89952f = 3;
                c6231x4f3054ba.e();
                return 0;
            }
            if (i19 == 4) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
                am.y00 y00Var2 = c6231x4f3054ba2.f136478g;
                y00Var2.f89948b = 5;
                y00Var2.f89951e = i18;
                y00Var2.f89950d = context;
                y00Var2.f89952f = 2;
                c6231x4f3054ba2.e();
                return 0;
            }
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (!j35.u.d(context, "android.permission.READ_CONTACTS", true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "no contact permission");
                return 1;
            }
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bkn), 1).show();
            context.getContentResolver().delete(android.provider.ContactsContract.Data.CONTENT_URI, "_id = ?", new java.lang.String[]{str2});
            context.getContentResolver().delete(android.provider.ContactsContract.RawContacts.CONTENT_URI, "contact_id = ? AND account_type = ?", new java.lang.String[]{str3, "com.tencent.mm.account"});
        }
        return 1;
    }
}
