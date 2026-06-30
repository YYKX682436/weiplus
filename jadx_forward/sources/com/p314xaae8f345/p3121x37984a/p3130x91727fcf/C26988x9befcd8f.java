package com.p314xaae8f345.p3121x37984a.p3130x91727fcf;

/* renamed from: com.tencent.wcdb.support.Context */
/* loaded from: classes12.dex */
public final class C26988x9befcd8f {

    /* renamed from: MODE_ENABLE_WRITE_AHEAD_LOGGING */
    public static final int f58427xcc3ca181 = 8;

    static {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26961x60ffeeef.m107775x141073bf();
    }

    /* renamed from: getDataDirFile */
    private static java.io.File m108014xe510bb69(android.content.Context context) {
        if (context == null) {
            throw new java.lang.RuntimeException("Not supported in system context");
        }
        java.lang.String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new java.io.File(str);
        }
        return null;
    }

    /* renamed from: getDatabasesDir */
    private static java.io.File m108015x45a5c18b(android.content.Context context) {
        java.io.File file = new java.io.File(m108014xe510bb69(context), "databases");
        return file.getPath().equals("databases") ? new java.io.File("/data/system") : file;
    }

    /* renamed from: makeFilename */
    private static java.io.File m108016x230bee15(java.io.File file, java.lang.String str) {
        if (str.indexOf(java.io.File.separatorChar) < 0) {
            return new java.io.File(file, str);
        }
        throw new java.lang.IllegalArgumentException("File " + str + " contains a path separator");
    }

    /* renamed from: openOrCreateDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m108017xa5e841c4(android.content.Context context, java.lang.String str, int i17, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory) {
        return m108021xa5e841c4(context, str, null, null, i17, cursorFactory, null, 0);
    }

    /* renamed from: setFilePermissionsFromMode */
    private static void m108022x99314b33(java.lang.String str, int i17, int i18) {
        int i19 = i18 | com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60883xc58bd72e;
        if ((i17 & 1) != 0) {
            i19 |= 4;
        }
        if ((i17 & 2) != 0) {
            i19 |= 2;
        }
        com.p314xaae8f345.p3121x37984a.C26884x28705875.m106312xb3ceaec2(str, i19, -1, -1);
    }

    /* renamed from: validateFilePath */
    private static java.io.File m108023x9702b6f7(android.content.Context context, java.lang.String str, boolean z17) {
        java.io.File m108015x45a5c18b;
        java.io.File m108016x230bee15;
        char charAt = str.charAt(0);
        char c17 = java.io.File.separatorChar;
        if (charAt == c17) {
            m108015x45a5c18b = new java.io.File(str.substring(0, str.lastIndexOf(c17)));
            m108016x230bee15 = new java.io.File(m108015x45a5c18b, str.substring(str.lastIndexOf(java.io.File.separatorChar)));
        } else {
            m108015x45a5c18b = m108015x45a5c18b(context);
            m108016x230bee15 = m108016x230bee15(m108015x45a5c18b, str);
        }
        if (z17 && !m108015x45a5c18b.isDirectory() && m108015x45a5c18b.mkdir()) {
            com.p314xaae8f345.p3121x37984a.C26884x28705875.m106312xb3ceaec2(m108015x45a5c18b.getPath(), 505, -1, -1);
        }
        return m108016x230bee15;
    }

    /* renamed from: openOrCreateDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m108018xa5e841c4(android.content.Context context, java.lang.String str, int i17, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d interfaceC26879x4f347d5d) {
        return m108021xa5e841c4(context, str, null, null, i17, cursorFactory, interfaceC26879x4f347d5d, 0);
    }

    /* renamed from: openOrCreateDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m108019xa5e841c4(android.content.Context context, java.lang.String str, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2, int i17, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory) {
        return m108021xa5e841c4(context, str, bArr, c26940xf23b9b2, i17, cursorFactory, null, 0);
    }

    /* renamed from: openOrCreateDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m108020xa5e841c4(android.content.Context context, java.lang.String str, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2, int i17, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d interfaceC26879x4f347d5d) {
        return m108021xa5e841c4(context, str, bArr, c26940xf23b9b2, i17, cursorFactory, interfaceC26879x4f347d5d, 0);
    }

    /* renamed from: openOrCreateDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m108021xa5e841c4(android.content.Context context, java.lang.String str, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2, int i17, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d interfaceC26879x4f347d5d, int i18) {
        java.io.File m108023x9702b6f7 = m108023x9702b6f7(context, str, true);
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107635xfef9b1e5 = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.m107635xfef9b1e5(m108023x9702b6f7.getPath(), bArr, c26940xf23b9b2, cursorFactory, (i17 & 8) != 0 ? 805306368 : 268435456, interfaceC26879x4f347d5d, i18);
        m108022x99314b33(m108023x9702b6f7.getPath(), i17, 0);
        return m107635xfef9b1e5;
    }
}
