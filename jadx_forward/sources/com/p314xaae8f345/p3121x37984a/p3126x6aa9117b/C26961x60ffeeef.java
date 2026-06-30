package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteGlobal */
/* loaded from: classes12.dex */
public final class C26961x60ffeeef {
    private static final java.lang.String TAG = "WCDB.SQLiteGlobal";

    /* renamed from: defaultJournalMode */
    public static final java.lang.String f58296x406ff879 = "PERSIST";

    /* renamed from: defaultPageSize */
    public static final int f58297xaa524091 = 4096;

    /* renamed from: defaultSyncMode */
    public static final java.lang.String f58298xe35e6c3f = "FULL";

    /* renamed from: journalSizeLimit */
    public static final int f58299x2934f2c3 = 524288;

    /* renamed from: walAutoCheckpoint */
    public static final int f58300x9f80e419 = 100;

    /* renamed from: walConnectionPoolSize */
    public static final int f58301xa84f5bd = 4;

    /* renamed from: walSyncMode */
    public static final java.lang.String f58302xc3222fe0 = "FULL";

    /* renamed from: _hellAccFlag_ */
    private byte f58303x7f11beae;

    static {
        if (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26974x1abef246.f58356xf05706ea) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("WCDB");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/wcdb/database/SQLiteGlobal", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/wcdb/database/SQLiteGlobal", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private C26961x60ffeeef() {
    }

    /* renamed from: loadLib */
    public static void m107775x141073bf() {
    }

    /* renamed from: nativeReleaseMemory */
    private static native int m107776x54826d11();

    /* renamed from: releaseMemory */
    public static int m107777xb0f66fe8() {
        return m107776x54826d11();
    }
}
