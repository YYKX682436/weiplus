package androidx.media;

/* loaded from: classes13.dex */
public class AudioAttributesCompat implements w4.e {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11693b = 0;

    /* renamed from: a, reason: collision with root package name */
    public androidx.media.AudioAttributesImpl f11694a;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public AudioAttributesCompat() {
    }

    public static int c(boolean z17, int i17, int i18) {
        if ((i17 & 1) == 1) {
            return z17 ? 1 : 7;
        }
        if ((i17 & 4) == 4) {
            return z17 ? 0 : 6;
        }
        switch (i18) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z17 ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (!z17) {
                    return 3;
                }
                throw new java.lang.IllegalArgumentException("Unknown usage value " + i18 + " in audio attributes");
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.media.AudioAttributesCompat)) {
            return false;
        }
        androidx.media.AudioAttributesCompat audioAttributesCompat = (androidx.media.AudioAttributesCompat) obj;
        androidx.media.AudioAttributesImpl audioAttributesImpl = this.f11694a;
        return audioAttributesImpl == null ? audioAttributesCompat.f11694a == null : audioAttributesImpl.equals(audioAttributesCompat.f11694a);
    }

    public int hashCode() {
        return this.f11694a.hashCode();
    }

    public java.lang.String toString() {
        return this.f11694a.toString();
    }

    public AudioAttributesCompat(androidx.media.AudioAttributesImpl audioAttributesImpl) {
        this.f11694a = audioAttributesImpl;
    }
}
