package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class o9 extends com.tencent.mm.plugin.appbrand.appcache.s implements qj1.d {
    public static final java.lang.String[] I = {java.lang.String.format(java.util.Locale.ENGLISH, "CREATE INDEX IF NOT EXISTS %sPkgPathIndex ON %s(%s)", "AppBrandWxaPkgManifestRecordWithDesc", "AppBrandWxaPkgManifestRecordWithDesc", "pkgPath")};

    /* renamed from: J, reason: collision with root package name */
    public static final java.lang.String[] f75712J;
    public static final l75.e0 K;
    public java.lang.String field_versionDesc;

    static {
        java.lang.Object newInstance;
        java.lang.String[] strArr = {"appId", "debugType", "versionDesc"};
        f75712J = strArr;
        l75.e0 initAutoDBInfo = dm.k0.initAutoDBInfo(com.tencent.mm.plugin.appbrand.appcache.o9.class);
        K = initAutoDBInfo;
        java.lang.String[] strArr2 = initAutoDBInfo.f316954c;
        java.lang.Class<?> cls = strArr2 != null ? strArr2.getClass() : "versionDesc".getClass();
        if (strArr2 != null) {
            int length = java.lang.reflect.Array.getLength(strArr2);
            newInstance = java.lang.reflect.Array.newInstance(strArr2.getClass().getComponentType(), length + 1);
            java.lang.System.arraycopy(strArr2, 0, newInstance, 0, length);
        } else {
            newInstance = java.lang.reflect.Array.newInstance(cls, 1);
        }
        java.lang.Object[] objArr = (java.lang.Object[]) newInstance;
        objArr[objArr.length - 1] = "versionDesc";
        initAutoDBInfo.f316954c = (java.lang.String[]) objArr;
        ((java.util.HashMap) initAutoDBInfo.f316955d).put("versionDesc", "TEXT");
        initAutoDBInfo.f316956e += ", versionDesc TEXT ";
        initAutoDBInfo.f316956e += qj1.c.a(strArr);
    }

    @Override // dm.k0, l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        super.convertFrom(cursor);
        int columnIndex = cursor.getColumnIndex("versionDesc");
        if (columnIndex >= 0) {
            this.field_versionDesc = cursor.getString(columnIndex);
        }
    }

    @Override // dm.k0, l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues convertTo = super.convertTo();
        convertTo.put("versionDesc", this.field_versionDesc);
        return convertTo;
    }

    @Override // dm.k0, l75.f0
    public l75.e0 getDBInfo() {
        return K;
    }

    @Override // qj1.d
    public java.lang.String[] getKeys() {
        return f75712J;
    }
}
