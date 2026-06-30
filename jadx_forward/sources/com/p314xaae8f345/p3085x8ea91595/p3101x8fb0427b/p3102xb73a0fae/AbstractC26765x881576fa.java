package com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae;

/* renamed from: com.tencent.tmassistantsdk.storage.helper.SqliteHelper */
/* loaded from: classes13.dex */
public abstract class AbstractC26765x881576fa extends android.database.sqlite.SQLiteOpenHelper {
    private static final java.lang.String TAG = "MicroMsg.SqliteHelper";

    public AbstractC26765x881576fa(android.content.Context context, java.lang.String str, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, int i17) {
        super(context, str, cursorFactory, i17);
    }

    /* renamed from: createTable */
    private void m105424xe1f0e832(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i("sqliteHelper", "tables count:" + mo105421x308e615b().length);
        for (java.lang.Class<?> cls : mo105421x308e615b()) {
            try {
                com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176 interfaceC26772xa9d48176 = (com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176) cls.newInstance();
                java.lang.String mo105426x19e143c = interfaceC26772xa9d48176.mo105426x19e143c();
                if (mo105426x19e143c != null && mo105426x19e143c.length() > 0) {
                    sQLiteDatabase.execSQL(mo105426x19e143c);
                }
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i("sqliteHelper", "sql=" + mo105426x19e143c);
                if (com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105488xfc04c0af(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.C26762x5029c044.f56744x8326c1ac)) {
                    com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i("sqliteHelper", "dataMovement");
                    interfaceC26772xa9d48176.mo105427x48ee0a79(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.C26762x5029c044.m105419x9cf0d20b().getReadableDatabase(), sQLiteDatabase);
                }
            } catch (java.lang.IllegalAccessException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            } catch (java.lang.InstantiationException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e18, "", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105483xbc3d25fa(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.C26762x5029c044.f56744x8326c1ac);
    }

    /* renamed from: deleteTable */
    private void m105425xbc7e98e3(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        for (java.lang.Class<?> cls : mo105421x308e615b()) {
            try {
                sQLiteDatabase.delete(((com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176) cls.newInstance()).mo105438x89769379(), null, null);
            } catch (java.lang.IllegalAccessException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            } catch (java.lang.InstantiationException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e18, "", new java.lang.Object[0]);
            }
        }
    }

    /* renamed from: getDBVersion */
    public abstract int mo105420x2a6413e4();

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized android.database.sqlite.SQLiteDatabase getReadableDatabase() {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = super.getReadableDatabase();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            sQLiteDatabase = null;
        }
        while (true) {
            if (sQLiteDatabase.isDbLockedByCurrentThread() || sQLiteDatabase.isDbLockedByOtherThreads()) {
                android.os.SystemClock.sleep(10L);
            }
        }
        return sQLiteDatabase;
    }

    /* renamed from: getTables */
    public abstract java.lang.Class<?>[] mo105421x308e615b();

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = super.getWritableDatabase();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            sQLiteDatabase = null;
        }
        while (true) {
            if (sQLiteDatabase.isDbLockedByCurrentThread() || sQLiteDatabase.isDbLockedByOtherThreads()) {
                android.os.SystemClock.sleep(10L);
            }
        }
        return sQLiteDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        m105424xe1f0e832(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i17, int i18) {
        m105425xbc7e98e3(sQLiteDatabase);
        m105424xe1f0e832(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        int version = sQLiteDatabase.getVersion();
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i("sqliteHelper", " dbversion:" + version + " newVersion:" + mo105420x2a6413e4());
        if (version == 0) {
            return;
        }
        if (version < mo105420x2a6413e4()) {
            onUpgrade(sQLiteDatabase, version, mo105420x2a6413e4());
        } else if (version > mo105420x2a6413e4()) {
            onDowngrade(sQLiteDatabase, version, mo105420x2a6413e4());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i17, int i18) {
        while (i17 < i18) {
            for (java.lang.Class<?> cls : mo105421x308e615b()) {
                try {
                    java.lang.String[] mo105430xf503bf4e = ((com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176) cls.newInstance()).mo105430xf503bf4e(i17, i17 + 1);
                    com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i("sqliteHelper", " upgrade:" + mo105430xf503bf4e);
                    if (mo105430xf503bf4e != null) {
                        for (java.lang.String str : mo105430xf503bf4e) {
                            sQLiteDatabase.execSQL(str);
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
                }
            }
            i17++;
        }
    }
}
