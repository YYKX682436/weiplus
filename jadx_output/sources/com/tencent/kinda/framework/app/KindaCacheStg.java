package com.tencent.kinda.framework.app;

/* loaded from: classes12.dex */
public class KindaCacheStg extends l75.n0 {
    public static final java.lang.String[] SQL_CREATE = {l75.n0.getCreateSQLs(com.tencent.kinda.framework.app.KindaCacheItem.info, "KindaCacheTable")};
    public static final java.lang.String TABLE_NAME = "KindaCacheTable";
    public static final java.lang.String TAG = "MicroMsg.KindaCacheStg";

    /* renamed from: db, reason: collision with root package name */
    private l75.k0 f45953db;

    public KindaCacheStg(l75.k0 k0Var) {
        super(k0Var, com.tencent.kinda.framework.app.KindaCacheItem.info, "KindaCacheTable", null);
        this.f45953db = k0Var;
    }

    public com.tencent.kinda.framework.app.KindaCacheItem get(java.lang.String str) {
        android.database.Cursor B = this.f45953db.B("select * from KindaCacheTable where key=?", new java.lang.String[]{str});
        if (B == null) {
            return null;
        }
        if (B.getCount() == 0) {
            B.close();
            return null;
        }
        B.moveToFirst();
        com.tencent.kinda.framework.app.KindaCacheItem kindaCacheItem = new com.tencent.kinda.framework.app.KindaCacheItem();
        kindaCacheItem.convertFrom(B);
        B.close();
        return kindaCacheItem;
    }

    public void save(com.tencent.kinda.framework.app.KindaCacheItem kindaCacheItem) {
        super.replace(kindaCacheItem);
    }
}
