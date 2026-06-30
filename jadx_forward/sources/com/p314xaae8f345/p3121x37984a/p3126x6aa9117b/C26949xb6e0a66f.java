package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteDatabaseConfiguration */
/* loaded from: classes12.dex */
public final class C26949xb6e0a66f {

    /* renamed from: MEMORY_DB_PATH */
    public static final java.lang.String f58244x57107208 = ":memory:";

    /* renamed from: customWALHookEnabled */
    public boolean f58245x9c3ece2d;

    /* renamed from: extensions */
    public final java.util.LinkedHashSet<com.p314xaae8f345.p3121x37984a.p3127xdb7d1c3f.InterfaceC26975xbb9cdd73> f58246x94266c14 = new java.util.LinkedHashSet<>();

    /* renamed from: foreignKeyConstraintsEnabled */
    public boolean f58247x298db076;

    /* renamed from: label */
    public final java.lang.String f58248x61f7ef4;

    /* renamed from: locale */
    public java.util.Locale f58249xbe960e5a;

    /* renamed from: maxSqlCacheSize */
    public int f58250x41da7ff9;

    /* renamed from: openFlags */
    public int f58251x5ac7365d;

    /* renamed from: path */
    public final java.lang.String f58252x346425;

    /* renamed from: synchronousMode */
    public int f58253x85631c8c;

    /* renamed from: updateNotificationEnabled */
    public boolean f58254xdfc2ac4d;

    /* renamed from: updateNotificationRowID */
    public boolean f58255xbe5aa881;

    /* renamed from: vfsName */
    public java.lang.String f58256x16a71cee;

    public C26949xb6e0a66f(java.lang.String str, int i17) {
        if (str != null) {
            this.f58252x346425 = str;
            this.f58248x61f7ef4 = str;
            this.f58251x5ac7365d = i17;
            this.f58253x85631c8c = 2;
            this.f58250x41da7ff9 = 25;
            this.f58249xbe960e5a = java.util.Locale.getDefault();
            this.f58256x16a71cee = (i17 & 256) != 0 ? "vfslog" : null;
            return;
        }
        throw new java.lang.IllegalArgumentException("path must not be null.");
    }

    /* renamed from: isInMemoryDb */
    public boolean m107739x46d4026e() {
        return this.f58252x346425.equalsIgnoreCase(f58244x57107208);
    }

    /* renamed from: updateParametersFrom */
    public void m107740xe35db9dd(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f) {
        if (c26949xb6e0a66f == null) {
            throw new java.lang.IllegalArgumentException("other must not be null.");
        }
        if (!this.f58252x346425.equals(c26949xb6e0a66f.f58252x346425)) {
            throw new java.lang.IllegalArgumentException("other configuration must refer to the same database.");
        }
        this.f58251x5ac7365d = c26949xb6e0a66f.f58251x5ac7365d;
        this.f58250x41da7ff9 = c26949xb6e0a66f.f58250x41da7ff9;
        this.f58249xbe960e5a = c26949xb6e0a66f.f58249xbe960e5a;
        this.f58247x298db076 = c26949xb6e0a66f.f58247x298db076;
        this.f58245x9c3ece2d = c26949xb6e0a66f.f58245x9c3ece2d;
        this.f58254xdfc2ac4d = c26949xb6e0a66f.f58254xdfc2ac4d;
        this.f58255xbe5aa881 = c26949xb6e0a66f.f58255xbe5aa881;
        this.f58253x85631c8c = c26949xb6e0a66f.f58253x85631c8c;
        this.f58256x16a71cee = c26949xb6e0a66f.f58256x16a71cee;
        this.f58246x94266c14.clear();
        this.f58246x94266c14.addAll(c26949xb6e0a66f.f58246x94266c14);
    }

    public C26949xb6e0a66f(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f) {
        if (c26949xb6e0a66f != null) {
            this.f58252x346425 = c26949xb6e0a66f.f58252x346425;
            this.f58248x61f7ef4 = c26949xb6e0a66f.f58248x61f7ef4;
            m107740xe35db9dd(c26949xb6e0a66f);
            return;
        }
        throw new java.lang.IllegalArgumentException("other must not be null.");
    }
}
