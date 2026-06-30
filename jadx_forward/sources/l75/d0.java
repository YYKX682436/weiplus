package l75;

/* loaded from: classes13.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f398477a;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        f398477a = hashMap3;
        try {
            hashMap.put(byte[].class, new l75.l());
            hashMap.put(java.lang.Short.TYPE, new l75.v());
            hashMap.put(java.lang.Short.class, new l75.w());
            java.lang.Class cls = java.lang.Boolean.TYPE;
            hashMap.put(cls, new l75.x());
            hashMap.put(java.lang.Boolean.class, new l75.y());
            java.lang.Class cls2 = java.lang.Integer.TYPE;
            hashMap.put(cls2, new l75.z());
            hashMap.put(java.lang.Integer.class, new l75.a0());
            java.lang.Class cls3 = java.lang.Float.TYPE;
            hashMap.put(cls3, new l75.b0());
            hashMap.put(java.lang.Float.class, new l75.c0());
            hashMap.put(java.lang.Double.TYPE, new l75.b());
            hashMap.put(java.lang.Double.class, new l75.c());
            java.lang.Class cls4 = java.lang.Long.TYPE;
            hashMap.put(cls4, new l75.d());
            hashMap.put(java.lang.Long.class, new l75.e());
            hashMap.put(java.lang.String.class, new l75.f());
            hashMap2.put(byte[].class, new l75.g());
            hashMap2.put(java.lang.Short.TYPE, new l75.h());
            hashMap2.put(java.lang.Short.class, new l75.i());
            hashMap2.put(cls, new l75.j());
            hashMap2.put(java.lang.Boolean.class, new l75.k());
            hashMap2.put(cls2, new l75.m());
            hashMap2.put(java.lang.Integer.class, new l75.n());
            hashMap2.put(cls3, new l75.o());
            hashMap2.put(java.lang.Float.class, new l75.p());
            hashMap2.put(java.lang.Double.TYPE, new l75.q());
            hashMap2.put(java.lang.Double.class, new l75.r());
            hashMap2.put(cls4, new l75.s());
            hashMap2.put(java.lang.Long.class, new l75.t());
            hashMap2.put(java.lang.String.class, new l75.u());
            hashMap3.put(byte[].class, "BLOB");
            hashMap3.put(java.lang.Short.TYPE, "SHORT");
            hashMap3.put(java.lang.Short.class, "SHORT");
            hashMap3.put(cls, "INTEGER");
            hashMap3.put(java.lang.Boolean.class, "INTEGER");
            hashMap3.put(cls2, "INTEGER");
            hashMap3.put(java.lang.Integer.class, "INTEGER");
            hashMap3.put(cls3, "FLOAT");
            hashMap3.put(java.lang.Float.class, "FLOAT");
            hashMap3.put(java.lang.Double.TYPE, "DOUBLE");
            hashMap3.put(java.lang.Double.class, "DOUBLE");
            hashMap3.put(cls4, "LONG");
            hashMap3.put(java.lang.Long.class, "LONG");
            hashMap3.put(java.lang.String.class, "TEXT");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.CursorFieldHelper", e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: keep_getBlob */
    public static void m145225xbc721559(java.lang.reflect.Field field, java.lang.Object obj, android.content.ContentValues contentValues) {
        try {
            contentValues.put(l75.f0.m145243x7656ebf5(field), (byte[]) field.get(obj));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.CursorFieldHelper", e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: keep_getBoolean */
    public static void m145226xa526dcec(java.lang.reflect.Field field, java.lang.Object obj, android.content.ContentValues contentValues) {
        try {
            contentValues.put(l75.f0.m145243x7656ebf5(field), java.lang.Integer.valueOf(field.getBoolean(obj) ? 1 : 0));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.CursorFieldHelper", e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: keep_getDouble */
    public static void m145227x6bd8e28d(java.lang.reflect.Field field, java.lang.Object obj, android.content.ContentValues contentValues) {
        try {
            if (field.getType().equals(java.lang.Double.TYPE)) {
                contentValues.put(l75.f0.m145243x7656ebf5(field), java.lang.Double.valueOf(field.getDouble(obj)));
            } else {
                contentValues.put(l75.f0.m145243x7656ebf5(field), (java.lang.Double) field.get(obj));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.CursorFieldHelper", e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: keep_getFloat */
    public static void m145228xd208f420(java.lang.reflect.Field field, java.lang.Object obj, android.content.ContentValues contentValues) {
        try {
            if (field.getType().equals(java.lang.Float.TYPE)) {
                contentValues.put(l75.f0.m145243x7656ebf5(field), java.lang.Float.valueOf(field.getFloat(obj)));
            } else {
                contentValues.put(l75.f0.m145243x7656ebf5(field), (java.lang.Float) field.get(obj));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.CursorFieldHelper", e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: keep_getInt */
    public static void m145229xe50c0ab3(java.lang.reflect.Field field, java.lang.Object obj, android.content.ContentValues contentValues) {
        try {
            if (field.getType().equals(java.lang.Integer.TYPE)) {
                contentValues.put(l75.f0.m145243x7656ebf5(field), java.lang.Integer.valueOf(field.getInt(obj)));
            } else {
                contentValues.put(l75.f0.m145243x7656ebf5(field), (java.lang.Integer) field.get(obj));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.CursorFieldHelper", e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: keep_getLong */
    public static void m145230xbc76ac38(java.lang.reflect.Field field, java.lang.Object obj, android.content.ContentValues contentValues) {
        try {
            if (field.getType().equals(java.lang.Long.TYPE)) {
                contentValues.put(l75.f0.m145243x7656ebf5(field), java.lang.Long.valueOf(field.getLong(obj)));
            } else {
                contentValues.put(l75.f0.m145243x7656ebf5(field), (java.lang.Long) field.get(obj));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.CursorFieldHelper", e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: keep_getShort */
    public static void m145231xd2be5640(java.lang.reflect.Field field, java.lang.Object obj, android.content.ContentValues contentValues) {
        try {
            contentValues.put(l75.f0.m145243x7656ebf5(field), java.lang.Short.valueOf(field.getShort(obj)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.CursorFieldHelper", e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: keep_getString */
    public static void m145232x85b6c6cd(java.lang.reflect.Field field, java.lang.Object obj, android.content.ContentValues contentValues) {
        try {
            contentValues.put(l75.f0.m145243x7656ebf5(field), (java.lang.String) field.get(obj));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.CursorFieldHelper", e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: keep_setBlob */
    public static void m145233x373cdc65(java.lang.reflect.Field field, java.lang.Object obj, android.database.Cursor cursor, int i17) {
        try {
            field.set(obj, cursor.getBlob(i17));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.CursorFieldHelper", e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: keep_setBoolean */
    public static void m145234x18982a60(java.lang.reflect.Field field, java.lang.Object obj, android.database.Cursor cursor, int i17) {
        try {
            if (field.getType().equals(java.lang.Boolean.TYPE)) {
                field.setBoolean(obj, cursor.getInt(i17) != 0);
            } else {
                field.set(obj, java.lang.Integer.valueOf(cursor.getInt(i17)));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.CursorFieldHelper", e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: keep_setDouble */
    public static void m145235x5f0e1699(java.lang.reflect.Field field, java.lang.Object obj, android.database.Cursor cursor, int i17) {
        try {
            if (field.getType().equals(java.lang.Double.TYPE)) {
                field.setDouble(obj, cursor.getDouble(i17));
            } else {
                field.set(obj, java.lang.Double.valueOf(cursor.getDouble(i17)));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.CursorFieldHelper", e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: keep_setFloat */
    public static void m145236xb0970e94(java.lang.reflect.Field field, java.lang.Object obj, android.database.Cursor cursor, int i17) {
        try {
            if (field.getType().equals(java.lang.Float.TYPE)) {
                field.setFloat(obj, cursor.getFloat(i17));
            } else {
                field.set(obj, java.lang.Float.valueOf(cursor.getFloat(i17)));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.CursorFieldHelper", e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: keep_setInt */
    public static void m145237xf9863227(java.lang.reflect.Field field, java.lang.Object obj, android.database.Cursor cursor, int i17) {
        try {
            if (field.getType().equals(java.lang.Integer.TYPE)) {
                field.setInt(obj, cursor.getInt(i17));
            } else {
                field.set(obj, java.lang.Integer.valueOf(cursor.getInt(i17)));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.CursorFieldHelper", e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: keep_setLong */
    public static void m145238x37417344(java.lang.reflect.Field field, java.lang.Object obj, android.database.Cursor cursor, int i17) {
        try {
            if (field.getType().equals(java.lang.Long.TYPE)) {
                field.setLong(obj, cursor.getLong(i17));
            } else {
                field.set(obj, java.lang.Long.valueOf(cursor.getLong(i17)));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.CursorFieldHelper", e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: keep_setShort */
    public static void m145239xb14c70b4(java.lang.reflect.Field field, java.lang.Object obj, android.database.Cursor cursor, int i17) {
        try {
            if (field.getType().equals(java.lang.Short.TYPE)) {
                field.setShort(obj, cursor.getShort(i17));
            } else {
                field.set(obj, java.lang.Short.valueOf(cursor.getShort(i17)));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.CursorFieldHelper", e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: keep_setString */
    public static void m145240x78ebfad9(java.lang.reflect.Field field, java.lang.Object obj, android.database.Cursor cursor, int i17) {
        try {
            field.set(obj, cursor.getString(i17));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.CursorFieldHelper", e17, "", new java.lang.Object[0]);
        }
    }
}
