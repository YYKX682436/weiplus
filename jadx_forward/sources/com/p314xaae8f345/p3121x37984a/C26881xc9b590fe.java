package com.p314xaae8f345.p3121x37984a;

/* renamed from: com.tencent.wcdb.DefaultDatabaseErrorHandler */
/* loaded from: classes12.dex */
public final class C26881xc9b590fe implements com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d {

    /* renamed from: SUFFIX_TO_BACKUP */
    private static final java.lang.String[] f57783xc4d96098 = {"", "-journal", "-wal", ".sm", ".bak", "-vfslog", "-vfslo1"};
    private static final java.lang.String TAG = "WCDB.DefaultDatabaseErrorHandler";

    /* renamed from: mNoCorruptionBackup */
    private final boolean f57784x9f5f77ab;

    public C26881xc9b590fe() {
        this.f57784x9f5f77ab = false;
    }

    /* renamed from: deleteDatabaseFile */
    private void m106301x99b6f6e2(java.lang.String str) {
        if (str.equalsIgnoreCase(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f.f58244x57107208) || str.trim().length() == 0) {
            return;
        }
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Remove database file: ".concat(str));
        int i17 = 0;
        if (this.f57784x9f5f77ab) {
            java.lang.String[] strArr = f57783xc4d96098;
            int length = strArr.length;
            while (i17 < length) {
                m106302x692721c7(str + strArr[i17]);
                i17++;
            }
            return;
        }
        java.io.File file = new java.io.File(str);
        java.io.File file2 = new java.io.File(file.getParentFile(), "corrupted");
        if (!file2.mkdirs()) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Could not create directory for corrupted database. Corruption backup may be unavailable.");
        }
        java.lang.String str2 = file2.getPath() + "/" + file.getName();
        java.lang.String[] strArr2 = f57783xc4d96098;
        int length2 = strArr2.length;
        while (i17 < length2) {
            java.lang.String str3 = strArr2[i17];
            m106303xc4cdaa7b(str + str3, str2 + str3);
            i17++;
        }
    }

    /* renamed from: deleteFile */
    private static boolean m106302x692721c7(java.lang.String str) {
        return new java.io.File(str).delete();
    }

    /* renamed from: moveOrDeleteFile */
    private static boolean m106303xc4cdaa7b(java.lang.String str, java.lang.String str2) {
        java.io.File file = new java.io.File(str);
        boolean renameTo = file.renameTo(new java.io.File(str2));
        if (!renameTo) {
            file.delete();
        }
        return renameTo;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d
    /* renamed from: onCorruption */
    public void mo63526x28043a1a(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7) {
        java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list;
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Corruption reported by sqlite on database: " + c26948xabb259c7.m107682xfb83cc9b());
        if (!c26948xabb259c7.m107697xb9a70294()) {
            m106301x99b6f6e2(c26948xabb259c7.m107682xfb83cc9b());
            return;
        }
        try {
            list = c26948xabb259c7.m107676xad58423b();
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 unused) {
            list = null;
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79 m107687x997f1cf4 = c26948xabb259c7.m107687x997f1cf4();
        if (m107687x997f1cf4 != null) {
            m107687x997f1cf4.mo8837x81d6f812(c26948xabb259c7);
        }
        try {
            c26948xabb259c7.close();
            if (list != null) {
                java.util.Iterator<android.util.Pair<java.lang.String, java.lang.String>> it = list.iterator();
                while (it.hasNext()) {
                    m106301x99b6f6e2((java.lang.String) it.next().second);
                }
                return;
            }
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 unused2) {
            if (list != null) {
                java.util.Iterator<android.util.Pair<java.lang.String, java.lang.String>> it6 = list.iterator();
                while (it6.hasNext()) {
                    m106301x99b6f6e2((java.lang.String) it6.next().second);
                }
                return;
            }
        } catch (java.lang.Throwable th6) {
            if (list != null) {
                java.util.Iterator<android.util.Pair<java.lang.String, java.lang.String>> it7 = list.iterator();
                while (it7.hasNext()) {
                    m106301x99b6f6e2((java.lang.String) it7.next().second);
                }
            } else {
                m106301x99b6f6e2(c26948xabb259c7.m107682xfb83cc9b());
            }
            throw th6;
        }
        m106301x99b6f6e2(c26948xabb259c7.m107682xfb83cc9b());
    }

    public C26881xc9b590fe(boolean z17) {
        this.f57784x9f5f77ab = z17;
    }
}
