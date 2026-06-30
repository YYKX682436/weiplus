package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteQuery */
/* loaded from: classes12.dex */
public final class C26966xda6793fc extends com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26965xa5559cb8 {
    private static final java.lang.String TAG = "WCDB.SQLiteQuery";

    /* renamed from: mCancellationSignal */
    private final com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f58327x808230d8;

    public C26966xda6793fc(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, java.lang.Object[] objArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        super(c26948xabb259c7, str, objArr, c26987xeef691ab);
        this.f58327x808230d8 = c26987xeef691ab;
    }

    /* renamed from: fillWindow */
    public int m107813xe3e54f53(com.p314xaae8f345.p3121x37984a.C26876xa70fd706 c26876xa70fd706, int i17, int i18, boolean z17) {
        m107403x3e28f15();
        try {
            c26876xa70fd706.m107403x3e28f15();
            try {
                try {
                    return m107809xb41dbe60().m107854xa6f6c61a(m107810xb5886e98(), m107805xb3d14030(), c26876xa70fd706, i17, i18, z17, m107807xe9cec13(), this.f58327x808230d8);
                } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e17) {
                    com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "exception: " + e17.getMessage() + "; query: " + m107810xb5886e98());
                    m107802xa8a7f203(e17);
                    throw e17;
                }
            } finally {
                c26876xa70fd706.m107405xb81b4f04();
            }
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: toString */
    public java.lang.String m107814x9616526c() {
        return "SQLiteQuery: " + m107810xb5886e98();
    }
}
