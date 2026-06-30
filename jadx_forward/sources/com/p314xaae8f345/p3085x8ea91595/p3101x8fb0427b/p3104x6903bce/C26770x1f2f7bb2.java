package com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce;

/* renamed from: com.tencent.tmassistantsdk.storage.table.DownloadLogTable */
/* loaded from: classes13.dex */
public class C26770x1f2f7bb2 extends com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.AbstractC26767x1daf70fb {

    /* renamed from: CREATE_TABLE_SQL */
    public static final java.lang.String f56773xc055b21a = "CREATE TABLE if not exists downloadLogData( _id INTEGER PRIMARY KEY AUTOINCREMENT, logData BLOB );";

    /* renamed from: SQL_INSERT */
    protected static final java.lang.String f56774x16c3d26a = "INSERT INTO downloadLogData logData = ?";

    /* renamed from: TABLE_NAME */
    public static final java.lang.String f56775xc4fe047c = "downloadLogData";

    /* renamed from: mInstance */
    protected static com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26770x1f2f7bb2 f56776x46143c22;

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26770x1f2f7bb2 m105452x9cf0d20b() {
        com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26770x1f2f7bb2 c26770x1f2f7bb2;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26770x1f2f7bb2.class) {
            if (f56776x46143c22 == null) {
                f56776x46143c22 = new com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26770x1f2f7bb2();
            }
            c26770x1f2f7bb2 = f56776x46143c22;
        }
        return c26770x1f2f7bb2;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.AbstractC26767x1daf70fb
    /* renamed from: getAlterSQL */
    public java.lang.String[] mo105429xf503bf4e(int i17) {
        return new java.lang.String[]{mo105431xf035e132()};
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.AbstractC26767x1daf70fb
    /* renamed from: getCreateTableSQL */
    public java.lang.String mo105431xf035e132() {
        return f56773xc055b21a;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.AbstractC26767x1daf70fb
    /* renamed from: getInsertSQL */
    public java.lang.String mo105434xe882c99f() {
        return f56774x16c3d26a;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.AbstractC26767x1daf70fb
    /* renamed from: getTableName */
    public java.lang.String mo105435x88e404c3() {
        return f56775xc4fe047c;
    }
}
