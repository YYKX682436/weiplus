package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteAsyncQuery */
/* loaded from: classes12.dex */
public class C26934xd061b8f8 extends com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26965xa5559cb8 {
    private static final java.lang.String TAG = "WCDB.SQLiteAsyncQuery";

    /* renamed from: mResultColumns */
    private final int f58087x5d858593;

    public C26934xd061b8f8(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, java.lang.Object[] objArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        super(c26948xabb259c7, str, objArr, c26987xeef691ab);
        this.f58087x5d858593 = m107806xa71d005c().length;
    }

    /* renamed from: nativeCount */
    private static native int m107389x66d38738(long j17);

    /* renamed from: nativeFillRows */
    private static native int m107390xec7d1f33(long j17, long j18, int i17, int i18);

    /* renamed from: acquire */
    public void m107391xba9b60d6() {
        if (this.f58324x9195b0c5 == null) {
            m107794x54fc0f7c(true);
            this.f58324x9195b0c5.m107542xdb18e999(m107805xb3d14030());
        }
    }

    /* renamed from: fillRows */
    public int m107392xd48a71fc(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26928xf69f94b2 c26928xf69f94b2, int i17, int i18) {
        m107391xba9b60d6();
        int m107361x7fca596d = c26928xf69f94b2.m107361x7fca596d();
        int i19 = this.f58087x5d858593;
        if (m107361x7fca596d != i19) {
            c26928xf69f94b2.m107368xadeea779(i19);
        }
        try {
            return m107390xec7d1f33(this.f58324x9195b0c5.m107546xb58863b8(), c26928xf69f94b2.f58056x6dc7e2f1, i17, i18);
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e17) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Got exception on fillRows: " + e17.getMessage() + ", SQL: " + m107810xb5886e98());
            m107802xa8a7f203(e17);
            throw e17;
        }
    }

    /* renamed from: getCount */
    public int m107393x7444f759() {
        m107391xba9b60d6();
        try {
            return m107389x66d38738(this.f58324x9195b0c5.m107546xb58863b8());
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e17) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Got exception on getCount: " + e17.getMessage() + ", SQL: " + m107810xb5886e98());
            m107802xa8a7f203(e17);
            throw e17;
        }
    }

    /* renamed from: release */
    public void m107394x41012807() {
        m107812xcbe9706b();
    }

    /* renamed from: reset */
    public void m107395x6761d4f() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement preparedStatement = this.f58324x9195b0c5;
        if (preparedStatement != null) {
            preparedStatement.m107550x6761d4f(false);
        }
    }
}
