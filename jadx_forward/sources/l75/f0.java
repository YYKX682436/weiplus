package l75;

/* loaded from: classes12.dex */
public abstract class f0 {

    /* renamed from: COL_ROWID */
    public static final java.lang.String f72760x3784a0b6 = "rowid";

    /* renamed from: FIELD_PREFIX */
    public static final java.lang.String f72761x324e3197 = "field_";

    /* renamed from: SYSTEM_ROWID_FIELD */
    public static final java.lang.String f72762xa7646e60 = "rowid";
    private static final java.lang.String TAG = "MicroMsg.SDK.IAutoDBItem";

    /* renamed from: systemRowid */
    public long f72763xa3c65b86 = -1;

    /* JADX WARN: Removed duplicated region for block: B:53:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x003d A[SYNTHETIC] */
    /* renamed from: checkIOEqual */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m145242x39a117a6(android.content.ContentValues r10, android.database.Cursor r11) {
        /*
            r0 = 1
            r1 = 0
            if (r10 != 0) goto L9
            if (r11 != 0) goto L7
            goto L8
        L7:
            r0 = r1
        L8:
            return r0
        L9:
            if (r11 == 0) goto Lc8
            int r2 = r11.getCount()
            if (r2 == r0) goto L13
            goto Lc8
        L13:
            r11.moveToFirst()
            int r2 = r11.getColumnCount()
            int r3 = r10.size()
            java.lang.String r4 = "rowid"
            boolean r5 = r10.containsKey(r4)
            if (r5 == 0) goto L29
            int r3 = r3 + (-1)
        L29:
            int r5 = r11.getColumnIndex(r4)
            r6 = -1
            if (r5 == r6) goto L32
            int r2 = r2 + (-1)
        L32:
            if (r3 == r2) goto L35
            return r1
        L35:
            java.util.Set r2 = r10.valueSet()     // Catch: java.lang.Exception -> Lbe
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> Lbe
        L3d:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> Lbe
            if (r3 == 0) goto Lbd
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> Lbe
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Exception -> Lbe
            java.lang.Object r3 = r3.getKey()     // Catch: java.lang.Exception -> Lbe
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> Lbe
            boolean r5 = r3.equals(r4)     // Catch: java.lang.Exception -> Lbe
            if (r5 == 0) goto L56
            goto L3d
        L56:
            int r5 = r11.getColumnIndex(r3)     // Catch: java.lang.Exception -> Lbe
            if (r5 != r6) goto L5d
            return r1
        L5d:
            java.lang.Object r7 = r10.get(r3)     // Catch: java.lang.Exception -> Lbe
            boolean r7 = r7 instanceof byte[]     // Catch: java.lang.Exception -> Lbe
            if (r7 == 0) goto L96
            java.lang.Object r3 = r10.get(r3)     // Catch: java.lang.Exception -> Lbe
            byte[] r3 = (byte[]) r3     // Catch: java.lang.Exception -> Lbe
            byte[] r5 = r11.getBlob(r5)     // Catch: java.lang.Exception -> Lbe
            if (r3 != 0) goto L75
            if (r5 != 0) goto L75
        L73:
            r3 = r0
            goto L93
        L75:
            if (r3 != 0) goto L7b
            if (r5 == 0) goto L7b
        L79:
            r3 = r1
            goto L93
        L7b:
            if (r3 == 0) goto L80
            if (r5 != 0) goto L80
            goto L79
        L80:
            int r7 = r3.length     // Catch: java.lang.Exception -> Lbe
            int r8 = r5.length     // Catch: java.lang.Exception -> Lbe
            if (r7 == r8) goto L85
            goto L79
        L85:
            r7 = r1
        L86:
            int r8 = r3.length     // Catch: java.lang.Exception -> Lbe
            if (r7 >= r8) goto L73
            r8 = r3[r7]     // Catch: java.lang.Exception -> Lbe
            r9 = r5[r7]     // Catch: java.lang.Exception -> Lbe
            if (r8 == r9) goto L90
            goto L79
        L90:
            int r7 = r7 + 1
            goto L86
        L93:
            if (r3 != 0) goto L3d
            return r1
        L96:
            java.lang.String r7 = r11.getString(r5)     // Catch: java.lang.Exception -> Lbe
            if (r7 != 0) goto La3
            java.lang.Object r7 = r10.get(r3)     // Catch: java.lang.Exception -> Lbe
            if (r7 == 0) goto La3
            return r1
        La3:
            java.lang.Object r7 = r10.get(r3)     // Catch: java.lang.Exception -> Lbe
            if (r7 != 0) goto Laa
            return r1
        Laa:
            java.lang.Object r3 = r10.get(r3)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> Lbe
            java.lang.String r5 = r11.getString(r5)     // Catch: java.lang.Exception -> Lbe
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Exception -> Lbe
            if (r3 != 0) goto L3d
            return r1
        Lbd:
            return r0
        Lbe:
            r10 = move-exception
            java.lang.String r11 = ""
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "MicroMsg.SDK.IAutoDBItem"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r10, r11, r0)
        Lc8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l75.f0.m145242x39a117a6(android.content.ContentValues, android.database.Cursor):boolean");
    }

    /* renamed from: getColName */
    public static java.lang.String m145243x7656ebf5(java.lang.reflect.Field field) {
        java.lang.String name;
        if (field == null || (name = field.getName()) == null || name.length() <= 0) {
            return null;
        }
        return name.startsWith(f72761x324e3197) ? name.substring(6) : name;
    }

    /* renamed from: getCursorForProjection */
    public static android.database.Cursor m145244x5feb210c(android.content.ContentValues contentValues, java.lang.String[] strArr) {
        int length = strArr.length;
        java.lang.Object[] objArr = new java.lang.Object[length];
        for (int i17 = 0; i17 < length; i17++) {
            objArr[i17] = contentValues.get(strArr[i17]);
        }
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(strArr);
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }

    /* renamed from: getValidFields */
    public static java.lang.reflect.Field[] m145245x5aa8549f(java.lang.Class<?> cls) {
        return m145246x3593deb(cls).f398485a;
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m145246x3593deb(java.lang.Class cls) {
        int i17;
        java.lang.String str;
        l75.e0 e0Var = new l75.e0();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
            int modifiers = field.getModifiers();
            java.lang.String name = field.getName();
            if (name != null && java.lang.reflect.Modifier.isPublic(modifiers) && !java.lang.reflect.Modifier.isFinal(modifiers)) {
                java.lang.String substring = name.startsWith(f72761x324e3197) ? name.substring(6) : name;
                if (field.isAnnotationPresent(l75.m0.class)) {
                    if (((l75.m0) field.getAnnotation(l75.m0.class)).m145249xb40240fd() == 1) {
                        e0Var.f398486b = substring;
                    }
                } else if (!name.startsWith(f72761x324e3197)) {
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(substring)) {
                    if (substring.equals("rowid")) {
                        iz5.a.g("field_rowid reserved by MAutoDBItem, change now!", false);
                    }
                    linkedList.add(field);
                }
            }
        }
        java.lang.reflect.Field[] fieldArr = (java.lang.reflect.Field[]) linkedList.toArray(new java.lang.reflect.Field[0]);
        e0Var.f398485a = fieldArr;
        java.lang.String[] strArr = new java.lang.String[fieldArr.length + 1];
        for (int i18 = 0; i18 < fieldArr.length; i18++) {
            strArr[i18] = m145243x7656ebf5(fieldArr[i18]);
            iz5.a.g("getFullColumns failed:" + fieldArr[i18].getName(), !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(strArr[i18]));
        }
        strArr[fieldArr.length] = "rowid";
        e0Var.f398487c = strArr;
        java.lang.reflect.Field[] fieldArr2 = e0Var.f398485a;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.reflect.Field field2 : fieldArr2) {
            java.lang.String str2 = (java.lang.String) ((java.util.HashMap) l75.d0.f398477a).get(field2.getType());
            if (str2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "failed identify on column: " + field2.getName() + ", skipped");
            } else {
                java.lang.String m145243x7656ebf5 = m145243x7656ebf5(field2);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m145243x7656ebf5)) {
                    hashMap.put(m145243x7656ebf5, str2);
                }
            }
        }
        e0Var.f398488d = hashMap;
        java.lang.reflect.Field[] fieldArr3 = e0Var.f398485a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i19 = 0;
        while (i19 < fieldArr3.length) {
            java.lang.reflect.Field field3 = fieldArr3[i19];
            java.lang.String str3 = (java.lang.String) ((java.util.HashMap) l75.d0.f398477a).get(field3.getType());
            if (str3 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "failed identify on column: " + field3.getName() + ", skipped");
            } else {
                java.lang.String m145243x7656ebf52 = m145243x7656ebf5(field3);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m145243x7656ebf52)) {
                    if (field3.isAnnotationPresent(l75.m0.class)) {
                        str = " default '" + ((l75.m0) field3.getAnnotation(l75.m0.class)).m145248x25c2d86c() + "' ";
                        i17 = ((l75.m0) field3.getAnnotation(l75.m0.class)).m145249xb40240fd();
                    } else {
                        i17 = 0;
                        str = "";
                    }
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(m145243x7656ebf52);
                    sb7.append(" ");
                    sb7.append(str3);
                    sb7.append(str);
                    sb7.append(i17 == 1 ? " PRIMARY KEY " : "");
                    sb6.append(sb7.toString());
                    sb6.append(i19 != fieldArr3.length - 1 ? ", " : "");
                }
            }
            i19++;
        }
        e0Var.f398489e = sb6.toString();
        return e0Var;
    }

    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
    }

    /* renamed from: convertFrom */
    public abstract void mo9015xbf5d97fd(android.database.Cursor cursor);

    /* renamed from: convertTo */
    public abstract android.content.ContentValues mo9763xeb27878e();

    /* renamed from: createMyTable */
    public void mo9764xdf360ce6(l75.k0 k0Var) {
    }

    /* renamed from: getDBInfo */
    public abstract l75.e0 mo232x1380a922();

    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return new o75.e();
    }

    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return "";
    }

    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return new p75.n0(mo9768x88e404c3());
    }

    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return "";
    }

    /* renamed from: toJSON */
    public java.lang.Object mo124851xcc313de3() {
        return "";
    }
}
