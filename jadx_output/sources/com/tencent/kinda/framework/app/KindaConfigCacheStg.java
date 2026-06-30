package com.tencent.kinda.framework.app;

/* loaded from: classes12.dex */
public class KindaConfigCacheStg extends l75.n0 {
    public static final java.lang.String SAVE_CHARSET = "ISO-8859-1";
    public static final java.lang.String[] SQL_CREATE = {l75.n0.getCreateSQLs(com.tencent.kinda.framework.app.KindaConfigCacheItem.info, "KindaConfigCache")};
    public static final java.lang.String TABLE_NAME = "KindaConfigCache";
    public static final java.lang.String TAG = "MicroMsg.KindaConfigCacheStg";

    /* renamed from: db, reason: collision with root package name */
    private l75.k0 f45954db;

    public KindaConfigCacheStg(l75.k0 k0Var) {
        super(k0Var, com.tencent.kinda.framework.app.KindaConfigCacheItem.info, "KindaConfigCache", null);
        this.f45954db = k0Var;
    }

    private com.tencent.kinda.framework.app.KindaConfigCacheItem getImpl(java.lang.String str) {
        android.database.Cursor B = this.f45954db.B("select * from KindaConfigCache where key=?", new java.lang.String[]{str});
        if (B == null) {
            return null;
        }
        if (B.getCount() == 0) {
            B.close();
            return null;
        }
        B.moveToFirst();
        com.tencent.kinda.framework.app.KindaConfigCacheItem kindaConfigCacheItem = new com.tencent.kinda.framework.app.KindaConfigCacheItem();
        kindaConfigCacheItem.convertFrom(B);
        B.close();
        return kindaConfigCacheItem;
    }

    public static java.lang.Object resolveObj(int i17, java.lang.String str) {
        try {
            switch (i17) {
                case 1:
                    return java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.P(str, 0));
                case 2:
                    return java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.V(str, 0L));
                case 3:
                    return str;
                case 4:
                    return java.lang.Boolean.valueOf(str);
                case 5:
                    return java.lang.Float.valueOf(com.tencent.mm.sdk.platformtools.t8.L(str, 0.0f));
                case 6:
                    return java.lang.Double.valueOf(com.tencent.mm.sdk.platformtools.t8.F(str, 0.0d));
                case 7:
                    return str.getBytes();
                default:
                    return null;
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e(TAG, "exception:%s", "");
            return null;
        }
    }

    public java.lang.Object get(java.lang.String str, java.lang.Object obj) {
        java.lang.Object resolveObj;
        com.tencent.kinda.framework.app.KindaConfigCacheItem impl = getImpl(str);
        return (impl == null || (resolveObj = resolveObj(impl.field_type, impl.field_value)) == null) ? obj : resolveObj;
    }

    public byte[] getBinary(java.lang.String str) {
        return (byte[]) get(str, new byte[0]);
    }

    public int getInt(java.lang.String str) {
        return ((java.lang.Integer) get(str, (java.lang.Object) 0)).intValue();
    }

    public long getLong(java.lang.String str) {
        return ((java.lang.Long) get(str, (java.lang.Object) 0L)).longValue();
    }

    public java.lang.String getString(java.lang.String str) {
        return (java.lang.String) get(str, "");
    }

    public void put(java.lang.String str, java.lang.Object obj, int i17) {
        put(str, obj, i17, 0L);
    }

    public void putBinary(java.lang.String str, byte[] bArr) {
        put(str, bArr, 7);
    }

    public void putInt(java.lang.String str, int i17) {
        put(str, java.lang.Integer.valueOf(i17), 1);
    }

    public void putLong(java.lang.String str, long j17) {
        put(str, java.lang.Long.valueOf(j17), 2);
    }

    public void putString(java.lang.String str, java.lang.String str2) {
        put(str, str2, 3);
    }

    public void put(java.lang.String str, java.lang.Object obj, int i17, long j17) {
        com.tencent.kinda.framework.app.KindaConfigCacheItem kindaConfigCacheItem = new com.tencent.kinda.framework.app.KindaConfigCacheItem();
        kindaConfigCacheItem.field_type = i17;
        kindaConfigCacheItem.field_key = str;
        kindaConfigCacheItem.field_expire_at = j17;
        if (i17 == 1 && (obj instanceof java.lang.Integer)) {
            kindaConfigCacheItem.field_value = obj.toString();
        } else if (i17 == 4 && (obj instanceof java.lang.Integer)) {
            kindaConfigCacheItem.field_value = obj.toString();
        } else if (i17 == 6 && (obj instanceof java.lang.Double)) {
            kindaConfigCacheItem.field_value = obj.toString();
        } else if (i17 == 5 && (obj instanceof java.lang.Float)) {
            kindaConfigCacheItem.field_value = obj.toString();
        } else if (i17 == 2 && (obj instanceof java.lang.Long)) {
            kindaConfigCacheItem.field_value = obj.toString();
        } else if (i17 == 3 && (obj instanceof java.lang.String)) {
            kindaConfigCacheItem.field_value = obj.toString();
        } else if (i17 != 7 || !(obj instanceof byte[])) {
            return;
        } else {
            kindaConfigCacheItem.field_value = new java.lang.String((byte[]) obj, java.nio.charset.Charset.forName(SAVE_CHARSET));
        }
        replace(kindaConfigCacheItem);
    }

    public void putBinary(java.lang.String str, byte[] bArr, long j17) {
        put(str, bArr, 7, j17);
    }

    public void putInt(java.lang.String str, int i17, long j17) {
        put(str, java.lang.Integer.valueOf(i17), 1, j17);
    }

    public void putLong(java.lang.String str, long j17, long j18) {
        put(str, java.lang.Long.valueOf(j17), 2, j18);
    }

    public void putString(java.lang.String str, java.lang.String str2, long j17) {
        put(str, str2, 3, j17);
    }
}
