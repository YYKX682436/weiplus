package j65;

/* loaded from: classes13.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseIntArray f379526a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f379527b;

    public w(android.util.SparseIntArray sparseIntArray, byte[] bArr) {
        this.f379526a = sparseIntArray;
        this.f379527b = bArr;
    }

    public java.lang.String a(int i17) {
        android.util.SparseIntArray sparseIntArray = this.f379526a;
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i17);
            if (indexOfKey < 0) {
                return null;
            }
            int valueAt = sparseIntArray.valueAt(indexOfKey);
            return new java.lang.String(this.f379527b, valueAt, (indexOfKey < sparseIntArray.size() + (-1) ? sparseIntArray.valueAt(indexOfKey + 1) : this.f379527b.length) - valueAt, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.io.UnsupportedEncodingException e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.language.StringsCollection", "[cpan] getString failed. %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        } catch (java.lang.Exception e18) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.language.StringsCollection", "[cpan] getString failed. %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
            return null;
        }
    }
}
