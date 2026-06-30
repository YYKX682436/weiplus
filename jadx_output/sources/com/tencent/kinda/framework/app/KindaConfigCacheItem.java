package com.tencent.kinda.framework.app;

/* loaded from: classes12.dex */
public class KindaConfigCacheItem extends dm.e7 {
    private static final java.lang.String TAG = "MicroMsg.KindaConfigCacheItem";
    public static final int TYPE_BOOLEAN = 4;
    public static final int TYPE_BYTE = 7;
    public static final int TYPE_DOUBLE = 6;
    public static final int TYPE_FLOAT = 5;
    public static final int TYPE_INT = 1;
    public static final int TYPE_LONG = 2;
    public static final int TYPE_STRING = 3;
    public static l75.e0 info = dm.e7.initAutoDBInfo(dm.e7.class);

    @Override // dm.e7, l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        super.convertFrom(cursor);
    }

    @Override // dm.e7, l75.f0
    public android.content.ContentValues convertTo() {
        return super.convertTo();
    }

    @Override // dm.e7, l75.f0
    public l75.e0 getDBInfo() {
        return info;
    }
}
