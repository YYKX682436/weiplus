package j65;

/* loaded from: classes13.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f379509a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f379510b;

    public u(android.util.SparseArray sparseArray, byte[] bArr) {
        this.f379509a = sparseArray;
        this.f379510b = bArr;
    }

    public java.lang.String[] a(int i17) {
        android.util.SparseArray sparseArray = this.f379509a;
        int indexOfKey = sparseArray.indexOfKey(i17);
        java.lang.String[] strArr = null;
        if (indexOfKey < 0) {
            return null;
        }
        int length = indexOfKey < sparseArray.size() + (-1) ? ((j65.t) sparseArray.valueAt(indexOfKey + 1)).f379508a[0] : this.f379510b.length;
        j65.t tVar = (j65.t) sparseArray.valueAt(indexOfKey);
        int length2 = tVar.f379508a.length;
        if (length2 > 0) {
            strArr = new java.lang.String[length2];
            for (int i18 = 0; i18 < length2; i18++) {
                int i19 = length2 - 1;
                int[] iArr = tVar.f379508a;
                if (i18 < i19) {
                    byte[] bArr = this.f379510b;
                    int i27 = iArr[i18];
                    strArr[i18] = new java.lang.String(bArr, i27, iArr[i18 + 1] - i27);
                } else {
                    byte[] bArr2 = this.f379510b;
                    int i28 = iArr[i18];
                    strArr[i18] = new java.lang.String(bArr2, i28, length - i28);
                }
            }
        }
        return strArr;
    }
}
