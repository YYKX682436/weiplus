package ru4;

/* loaded from: classes.dex */
public final class f extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f481319e = {l75.n0.m145250x3fdc6f77(ru4.e.f481318z, "AIHistoryMessage")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f481320d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l75.k0 db6) {
        super(db6, ru4.e.f481318z, "AIHistoryMessage", dm.e.f318022o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = ru4.e.f481318z;
        this.f481320d = db6;
    }

    public final java.util.List D0(java.lang.String searchId, java.lang.String chatId, int i17) {
        java.util.ArrayList arrayList;
        java.lang.String str;
        int i18;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchId, "searchId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatId, "chatId");
        kz5.p0 p0Var = kz5.p0.f395529d;
        if (i17 == 0) {
            return p0Var;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        try {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList = new java.util.ArrayList();
            if (chatId.length() > 0) {
                arrayList3.add("chatId = ?");
                arrayList.add(chatId);
            }
            java.lang.String str3 = "DESC";
            if (searchId.length() > 0) {
                ru4.e z07 = z0(searchId);
                if (z07 == null) {
                    return p0Var;
                }
                long j17 = z07.f66313x9c2463f1;
                if (i17 > 0) {
                    arrayList3.add("timeStamp <= ?");
                } else {
                    arrayList3.add("timeStamp >= ?");
                    str3 = "ASC";
                }
                arrayList.add(java.lang.String.valueOf(j17));
            }
            str = str3;
            if (!arrayList3.isEmpty()) {
                i18 = 0;
                str2 = " WHERE ".concat(kz5.n0.g0(arrayList3, " AND ", null, null, 0, null, null, 62, null));
            } else {
                i18 = 0;
                str2 = "";
            }
        } catch (java.lang.Exception e17) {
            e = e17;
        }
        try {
            android.database.Cursor B = this.f481320d.B("SELECT *, rowid FROM AIHistoryMessage" + str2 + " ORDER BY timeStamp " + str + " LIMIT " + java.lang.Math.abs(i17), arrayList.isEmpty() ^ true ? (java.lang.String[]) arrayList.toArray(new java.lang.String[i18]) : null);
            if (B != null) {
                while (B.moveToNext()) {
                    try {
                        ru4.e eVar = new ru4.e();
                        eVar.mo9015xbf5d97fd(B);
                        arrayList2.add(eVar);
                    } finally {
                    }
                }
                vz5.b.a(B, null);
            }
            if (i17 < 0) {
                java.util.Collections.reverse(arrayList2);
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AIHistory.MessageStorage", "getMessages failed: " + e.getMessage());
            return arrayList2;
        }
        return arrayList2;
    }

    public final boolean y0(java.lang.String chatId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatId, "chatId");
        if (chatId.length() == 0) {
            return false;
        }
        try {
            this.f481320d.mo70514xb06685ab("AIHistoryMessage", "chatId = ?", new java.lang.String[]{chatId});
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AIHistory.MessageStorage", "deleteMessagesByChatId failed: " + e17.getMessage());
            return false;
        }
    }

    public final ru4.e z0(java.lang.String searchId) {
        ru4.e eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchId, "searchId");
        if (searchId.length() == 0) {
            return null;
        }
        try {
            android.database.Cursor B = this.f481320d.B("SELECT *, rowid FROM AIHistoryMessage WHERE searchId = ?", new java.lang.String[]{searchId});
            if (B == null) {
                return null;
            }
            try {
                if (B.moveToFirst()) {
                    eVar = new ru4.e();
                    eVar.mo9015xbf5d97fd(B);
                } else {
                    eVar = null;
                }
                vz5.b.a(B, null);
                return eVar;
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AIHistory.MessageStorage", "getMessageBySearchId failed: " + e17.getMessage());
            return null;
        }
    }
}
