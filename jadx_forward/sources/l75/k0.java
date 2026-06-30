package l75;

/* loaded from: classes12.dex */
public interface k0 {
    boolean A(java.lang.String str, java.lang.String str2);

    android.database.Cursor B(java.lang.String str, java.lang.String[] strArr);

    default void C() {
    }

    android.database.Cursor D(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17);

    android.database.Cursor E(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5);

    long F(java.lang.Long l17);

    boolean G();

    boolean H(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr);

    default boolean I(java.lang.String table) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        return true;
    }

    boolean J();

    default boolean K() {
        return false;
    }

    default boolean a() {
        return false;
    }

    default long b() {
        return F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
    }

    default boolean c() {
        return true;
    }

    /* renamed from: close */
    void mo70513x5a5ddf8();

    android.database.Cursor d(boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab);

    /* renamed from: delete */
    int mo70514xb06685ab(java.lang.String str, java.lang.String str2, java.lang.String[] strArr);

    default long e() {
        return 0L;
    }

    android.database.Cursor f(java.lang.String str, java.lang.String[] strArr, int i17);

    default l75.e1 g() {
        return new l75.e1();
    }

    /* renamed from: getPath */
    java.lang.String mo70515xfb83cc9b();

    default long h(long j17) {
        return 0L;
    }

    default com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.LeafInfo i(java.lang.String[] tables, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tables, "tables");
        return null;
    }

    /* renamed from: isOpen */
    default boolean mo123783xb9a70294() {
        return !J();
    }

    default boolean j(java.lang.String str, java.lang.String sql, java.lang.Object[] bindArgs, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindArgs, "bindArgs");
        return false;
    }

    default long k() {
        return 0L;
    }

    long l(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues);

    long m(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues);

    default boolean n() {
        return false;
    }

    default android.database.Cursor o(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        return null;
    }

    int p(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr);

    long q();

    default void r() {
    }

    android.database.Cursor s(java.lang.String str, java.lang.String[] strArr);

    default int t() {
        return w(null);
    }

    default boolean u() {
        return false;
    }

    long v(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues);

    int w(java.lang.Long l17);

    default void x() {
    }

    default void y(l75.j0 handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
    }

    default p75.k z(java.lang.String str) {
        return null;
    }
}
