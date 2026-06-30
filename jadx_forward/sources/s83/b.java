package s83;

/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f486399a = new java.lang.String(java.lang.Character.toChars(91));

    /* renamed from: b, reason: collision with root package name */
    public static java.util.HashMap f486400b = new java.util.HashMap();

    public static s83.c a(android.database.Cursor cursor, int i17, int i18, int i19) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((sb0.f) jVar).getClass();
        boolean d17 = j35.u.d(context, "android.permission.READ_CONTACTS", true);
        java.lang.String str = null;
        if (!d17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallAddressBookInfoExtracter", "no contact permission");
            return null;
        }
        s83.c cVar = new s83.c();
        cVar.f486402t = new java.util.ArrayList();
        java.lang.String string = cursor.getString(i17);
        java.lang.String string2 = cursor.getString(i18);
        java.lang.String string3 = cursor.getString(i19);
        cVar.f67827x821cd056 = string;
        cVar.f67829x5c31173f = string2;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3) && !cVar.f486402t.contains(string3)) {
            cVar.f486402t.add(string3);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f67829x5c31173f) && cVar.f486402t.size() > 0) {
            cVar.f67829x5c31173f = (java.lang.String) cVar.f486402t.get(0);
        }
        java.util.Iterator it = cVar.f486402t.iterator();
        java.lang.String str2 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.String j17 = t83.c.j((java.lang.String) it.next());
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17)) {
                if (!j17.endsWith("@stranger")) {
                    str2 = j17;
                    break;
                }
                str2 = j17;
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            cVar.f67830xf13c6c01 = str2;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f67829x5c31173f)) {
            cVar.f67828xfbe5919c = "";
        } else {
            try {
                str = x51.k.a(cVar.f67829x5c31173f);
            } catch (java.lang.Exception e17) {
                e17.getMessage();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                cVar.f67828xfbe5919c = "";
            } else if (java.lang.Character.isLetter(str.charAt(0))) {
                cVar.f67828xfbe5919c = str.toUpperCase();
            } else {
                cVar.f67828xfbe5919c = f486399a + str.toUpperCase();
            }
        }
        return cVar;
    }

    public static java.util.ArrayList b() {
        java.util.ArrayList arrayList;
        java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((sb0.f) jVar).getClass();
        if (!j35.u.d(context, "android.permission.READ_CONTACTS", true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallAddressBookInfoExtracter", "no contact permission");
            return arrayList2;
        }
        android.database.Cursor query = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, new java.lang.String[]{"contact_id", "display_name", "data1"}, "mimetype='vnd.android.cursor.item/phone_v2'", null, null);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.System.currentTimeMillis();
        if (query == null) {
            return arrayList2;
        }
        try {
            try {
                query.getCount();
                if (query.moveToFirst()) {
                    int columnIndex = query.getColumnIndex("contact_id");
                    int columnIndex2 = query.getColumnIndex("display_name");
                    int columnIndex3 = query.getColumnIndex("data1");
                    while (!query.isAfterLast()) {
                        s83.c a17 = a(query, columnIndex, columnIndex2, columnIndex3);
                        if (a17 != null && (arrayList = a17.f486402t) != null && arrayList.size() > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f67827x821cd056)) {
                            if (hashMap.containsKey(a17.f67827x821cd056)) {
                                s83.c cVar = (s83.c) hashMap.get(a17.f67827x821cd056);
                                if (a17.f486402t.size() > 0 && !cVar.f486402t.contains(a17.f486402t.get(0))) {
                                    cVar.f486402t.add((java.lang.String) a17.f486402t.get(0));
                                }
                            } else {
                                hashMap.put(a17.f67827x821cd056, a17);
                            }
                        }
                        query.moveToNext();
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallAddressBookInfoExtracter", "getAllAddressItemFromSystemPhoneBook error: %s, class: %s", e17.getMessage(), e17.getClass().getSimpleName());
            }
            arrayList2.addAll(hashMap.values());
            f486400b = hashMap;
            java.lang.System.currentTimeMillis();
            arrayList2.size();
            return arrayList2;
        } finally {
            query.close();
        }
    }
}
