package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class o9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.s implements qj1.d {
    public static final java.lang.String[] I = {java.lang.String.format(java.util.Locale.ENGLISH, "CREATE INDEX IF NOT EXISTS %sPkgPathIndex ON %s(%s)", "AppBrandWxaPkgManifestRecordWithDesc", "AppBrandWxaPkgManifestRecordWithDesc", "pkgPath")};

    /* renamed from: J, reason: collision with root package name */
    public static final java.lang.String[] f157245J;
    public static final l75.e0 K;

    /* renamed from: field_versionDesc */
    public java.lang.String f33477x94cabbc4;

    static {
        java.lang.Object newInstance;
        java.lang.String[] strArr = {"appId", "debugType", "versionDesc"};
        f157245J = strArr;
        l75.e0 m125156x3593deb = dm.k0.m125156x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o9.class);
        K = m125156x3593deb;
        java.lang.String[] strArr2 = m125156x3593deb.f398487c;
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
        m125156x3593deb.f398487c = (java.lang.String[]) objArr;
        ((java.util.HashMap) m125156x3593deb.f398488d).put("versionDesc", "TEXT");
        m125156x3593deb.f398489e += ", versionDesc TEXT ";
        m125156x3593deb.f398489e += qj1.c.a(strArr);
    }

    @Override // dm.k0, l75.f0
    /* renamed from: convertFrom */
    public void mo9015xbf5d97fd(android.database.Cursor cursor) {
        super.mo9015xbf5d97fd(cursor);
        int columnIndex = cursor.getColumnIndex("versionDesc");
        if (columnIndex >= 0) {
            this.f33477x94cabbc4 = cursor.getString(columnIndex);
        }
    }

    @Override // dm.k0, l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues mo9763xeb27878e = super.mo9763xeb27878e();
        mo9763xeb27878e.put("versionDesc", this.f33477x94cabbc4);
        return mo9763xeb27878e;
    }

    @Override // dm.k0, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return K;
    }

    @Override // qj1.d
    /* renamed from: getKeys */
    public java.lang.String[] mo49271xfb81966a() {
        return f157245J;
    }
}
