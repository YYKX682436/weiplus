package um;

/* loaded from: classes13.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f510224a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f510225b;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f510224a = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        f510225b = hashMap2;
        try {
            hashMap.put(byte[].class, um.r.class.getMethod("keep_writeByteArray", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap.put(java.lang.Short.TYPE, um.r.class.getMethod("keep_writeShort", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap.put(java.lang.Short.class, um.r.class.getMethod("keep_writeShort", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            java.lang.Class cls = java.lang.Boolean.TYPE;
            hashMap.put(cls, um.r.class.getMethod("keep_writeBoolean", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap.put(java.lang.Boolean.class, um.r.class.getMethod("keep_writeBoolean", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            java.lang.Class cls2 = java.lang.Integer.TYPE;
            hashMap.put(cls2, um.r.class.getMethod("keep_writeInt", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap.put(java.lang.Integer.class, um.r.class.getMethod("keep_writeInt", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            java.lang.Class cls3 = java.lang.Float.TYPE;
            hashMap.put(cls3, um.r.class.getMethod("keep_writeFloat", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap.put(java.lang.Float.class, um.r.class.getMethod("keep_writeFloat", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap.put(java.lang.Double.TYPE, um.r.class.getMethod("keep_writeDouble", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap.put(java.lang.Double.class, um.r.class.getMethod("keep_writeDouble", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            java.lang.Class cls4 = java.lang.Long.TYPE;
            hashMap.put(cls4, um.r.class.getMethod("keep_writeLong", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap.put(java.lang.Long.class, um.r.class.getMethod("keep_writeLong", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap.put(java.lang.String.class, um.r.class.getMethod("keep_writeString", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(byte[].class, um.r.class.getMethod("keep_readByteArray", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(java.lang.Short.TYPE, um.r.class.getMethod("keep_readShort", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(java.lang.Short.class, um.r.class.getMethod("keep_readShort", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(cls, um.r.class.getMethod("keep_readBoolean", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(java.lang.Boolean.class, um.r.class.getMethod("keep_readBoolean", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(cls2, um.r.class.getMethod("keep_readInt", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(java.lang.Integer.class, um.r.class.getMethod("keep_readInt", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(cls3, um.r.class.getMethod("keep_readFloat", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(java.lang.Float.class, um.r.class.getMethod("keep_readFloat", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(java.lang.Double.TYPE, um.r.class.getMethod("keep_readDouble", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(java.lang.Double.class, um.r.class.getMethod("keep_readDouble", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(cls4, um.r.class.getMethod("keep_readLong", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(java.lang.Long.class, um.r.class.getMethod("keep_readLong", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
            hashMap2.put(java.lang.String.class, um.r.class.getMethod("keep_readString", android.os.Parcel.class, java.lang.reflect.Field.class, java.lang.Object.class));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCacheItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    /* renamed from: keep_readBoolean */
    public static void m168228xe4113ff8(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            field.setBoolean(obj, parcel.readInt() != 0);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCacheItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    /* renamed from: keep_readByteArray */
    public static void m168229x2e26a601(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            field.set(obj, parcel.createByteArray());
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCacheItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    /* renamed from: keep_readDouble */
    public static void m168230x2bcfee01(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            field.setDouble(obj, parcel.readDouble());
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCacheItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    /* renamed from: keep_readFloat */
    public static void m168231x1208aa2c(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            field.setFloat(obj, parcel.readFloat());
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCacheItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    /* renamed from: keep_readInt */
    public static void m168232x159d3bf(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            field.setInt(obj, parcel.readInt());
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCacheItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    /* renamed from: keep_readLong */
    public static void m168233x29e204ac(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            field.set(obj, java.lang.Long.valueOf(parcel.readLong()));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCacheItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    /* renamed from: keep_readShort */
    public static void m168234x12be0c4c(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            field.setShort(obj, (short) parcel.readInt());
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCacheItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    /* renamed from: keep_readString */
    public static void m168235x45add241(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            field.set(obj, parcel.readString());
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCacheItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    /* renamed from: keep_writeBoolean */
    public static void m168236x223cc1c3(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            parcel.writeInt(field.getBoolean(obj) ? 1 : 0);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCacheItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    /* renamed from: keep_writeByteArray */
    public static void m168237x8f78e10c(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            parcel.writeByteArray((byte[]) field.get(obj));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCacheItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    /* renamed from: keep_writeDouble */
    public static void m168238x469786d6(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            parcel.writeDouble(field.getDouble(obj));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCacheItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    /* renamed from: keep_writeFloat */
    public static void m168239x3c3022b7(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            parcel.writeFloat(field.getFloat(obj));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCacheItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    /* renamed from: keep_writeInt */
    public static void m168240xef8bf30a(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            parcel.writeInt(field.getInt(obj));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCacheItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    /* renamed from: keep_writeLong */
    public static void m168241x1f3cec1(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            parcel.writeLong(field.getLong(obj));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCacheItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    /* renamed from: keep_writeShort */
    public static void m168242x3ce584d7(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            parcel.writeInt(field.getShort(obj));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCacheItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    /* renamed from: keep_writeString */
    public static void m168243x60756b16(android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.Object obj) {
        try {
            parcel.writeString((java.lang.String) field.get(obj));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCacheItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }
}
