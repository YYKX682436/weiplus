package v62;

/* loaded from: classes12.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final android.util.SparseArray f515049a = new android.util.SparseArray(1);

    public static int a(byte[] bArr) {
        return ((bArr[0] & 255) << 24) | (bArr[3] & 255) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16);
    }
}
