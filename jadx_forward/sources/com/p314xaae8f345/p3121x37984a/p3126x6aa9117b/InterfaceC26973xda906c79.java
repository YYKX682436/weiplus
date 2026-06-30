package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteTrace */
/* loaded from: classes12.dex */
public interface InterfaceC26973xda906c79 {

    /* renamed from: com.tencent.wcdb.database.SQLiteTrace$TraceInfo */
    /* loaded from: classes12.dex */
    public static class TraceInfo<T> {

        /* renamed from: info */
        public final T f58353x3164ae;
        public final int tid;

        /* renamed from: time */
        public final long f58354x3652cd;

        public TraceInfo(T t17, long j17, int i17) {
            this.f58353x3164ae = t17;
            this.f58354x3652cd = j17;
            this.tid = i17;
        }
    }

    /* renamed from: onConnectionObtained */
    void mo8835x65fe6d41(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, long j17, boolean z17);

    /* renamed from: onConnectionPoolBusy */
    void mo8836x7591c572(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, long j17, boolean z17, java.util.List<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79.TraceInfo<java.lang.String>> list, java.util.List<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79.TraceInfo<java.lang.StackTraceElement[]>> list2);

    /* renamed from: onDatabaseCorrupted */
    void mo8837x81d6f812(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7);

    /* renamed from: onSQLExecuted */
    void mo8838xcc78f01e(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, int i17, long j17);
}
