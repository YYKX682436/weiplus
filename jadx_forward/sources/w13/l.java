package w13;

/* loaded from: classes12.dex */
public class l implements l75.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 f523757a;

    public l(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7) {
        this.f523757a = c26948xabb259c7;
    }

    @Override // l75.k0
    public boolean A(java.lang.String str, java.lang.String str2) {
        try {
            this.f523757a.m107671xb158737d(str2);
            return true;
        } catch (android.database.SQLException unused) {
            return false;
        }
    }

    @Override // l75.k0
    public android.database.Cursor B(java.lang.String str, java.lang.String[] strArr) {
        return this.f523757a.m107710x1d3f4980(str, strArr);
    }

    @Override // l75.k0
    public android.database.Cursor D(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17) {
        return this.f523757a.m107704x66f18c8(str, strArr, str2, strArr2, str3, str4, str5);
    }

    @Override // l75.k0
    public android.database.Cursor E(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return this.f523757a.m107704x66f18c8(str, strArr, str2, strArr2, str3, str4, str5);
    }

    @Override // l75.k0
    public long F(java.lang.Long l17) {
        this.f523757a.m107659xb2c12e75();
        return l17.longValue();
    }

    @Override // l75.k0
    public boolean G() {
        return this.f523757a.m107689x51d3479();
    }

    @Override // l75.k0
    public boolean H(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        try {
            this.f523757a.m107672xb158737d(str2, objArr);
            return true;
        } catch (android.database.SQLException unused) {
            return false;
        }
    }

    @Override // l75.k0
    public boolean J() {
        return !this.f523757a.m107697xb9a70294();
    }

    @Override // l75.k0
    /* renamed from: close */
    public void mo70513x5a5ddf8() {
        this.f523757a.close();
    }

    @Override // l75.k0
    public android.database.Cursor d(boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        return this.f523757a.m107707x66f18c8(z17, str, strArr, str2, strArr2, str3, str4, str5, str6, c26987xeef691ab);
    }

    @Override // l75.k0
    /* renamed from: delete */
    public int mo70514xb06685ab(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        return this.f523757a.m107665xb06685ab(str, str2, strArr);
    }

    @Override // l75.k0
    public android.database.Cursor f(java.lang.String str, java.lang.String[] strArr, int i17) {
        return this.f523757a.m107710x1d3f4980(str, strArr);
    }

    @Override // l75.k0
    /* renamed from: getPath */
    public java.lang.String mo70515xfb83cc9b() {
        return this.f523757a.m107682xfb83cc9b();
    }

    @Override // l75.k0
    public long l(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        return this.f523757a.m107690xb970c2b9(str, str2, contentValues);
    }

    @Override // l75.k0
    public long m(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        return this.f523757a.m107716x413cb2b4(str, str2, contentValues);
    }

    @Override // l75.k0
    public android.database.Cursor o(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        return this.f523757a.m107713x46d43bc4(cursorFactory, str, strArr, str2, c26987xeef691ab != null ? new p75.c(c26987xeef691ab, this).f434155a : null);
    }

    @Override // l75.k0
    public int p(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr) {
        return this.f523757a.m107732xce0038c9(str, contentValues, str2, strArr);
    }

    @Override // l75.k0
    public long q() {
        return this.f523757a.m107681xaf1414a6();
    }

    @Override // l75.k0
    public android.database.Cursor s(java.lang.String str, java.lang.String[] strArr) {
        return this.f523757a.m107710x1d3f4980(str, strArr);
    }

    @Override // l75.k0
    public long v(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        return this.f523757a.m107691x98afe1ca(str, str2, contentValues);
    }

    @Override // l75.k0
    public int w(java.lang.Long l17) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.f523757a;
        c26948xabb259c7.m107729x576b60d6();
        c26948xabb259c7.m107670x7d3c6b03();
        return 0;
    }
}
