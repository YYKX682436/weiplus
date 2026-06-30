package com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce;

/* renamed from: com.tencent.tmassistantsdk.storage.table.UpdateInfoLogTable */
/* loaded from: classes13.dex */
public class C26774x7029b141 extends com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.AbstractC26767x1daf70fb {

    /* renamed from: CREATE_TABLE_SQL */
    private static final java.lang.String f56788xc055b21a = "CREATE TABLE if not exists SelfUpdateInfoLogData( _id INTEGER PRIMARY KEY AUTOINCREMENT, logData BLOB );";

    /* renamed from: INSERT_SQL */
    private static final java.lang.String f56789x56942328 = "INSERT INTO SelfUpdateInfoLogData logData = ?";

    /* renamed from: TABLE_NAME */
    private static final java.lang.String f56790xc4fe047c = "SelfUpdateInfoLogData";

    /* renamed from: mInstance */
    private static com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26774x7029b141 f56791x46143c22;

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26774x7029b141 m105457x9cf0d20b() {
        com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26774x7029b141 c26774x7029b141;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26774x7029b141.class) {
            if (f56791x46143c22 == null) {
                f56791x46143c22 = new com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26774x7029b141();
            }
            c26774x7029b141 = f56791x46143c22;
        }
        return c26774x7029b141;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.AbstractC26767x1daf70fb
    /* renamed from: getAlterSQL */
    public java.lang.String[] mo105429xf503bf4e(int i17) {
        if (i17 > 1) {
            return new java.lang.String[]{mo105431xf035e132()};
        }
        return null;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.AbstractC26767x1daf70fb
    /* renamed from: getCreateTableSQL */
    public java.lang.String mo105431xf035e132() {
        return f56788xc055b21a;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.AbstractC26767x1daf70fb
    /* renamed from: getInsertSQL */
    public java.lang.String mo105434xe882c99f() {
        return f56789x56942328;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.AbstractC26767x1daf70fb
    /* renamed from: getTableName */
    public java.lang.String mo105435x88e404c3() {
        return f56790xc4fe047c;
    }
}
