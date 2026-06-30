package av5;

/* loaded from: classes16.dex */
public class m extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final int f14414e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f14415f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f14416g;

    public m(int i17, int i18, int[] iArr, byte[] bArr) {
        super(i17);
        this.f14414e = i18;
        this.f14415f = iArr;
        this.f14416g = bArr;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(av5.m mVar) {
        int i17;
        int i18 = mVar.f14414e;
        int i19 = this.f14414e;
        if (i19 != i18) {
            return i19 - i18;
        }
        int[] iArr = this.f14415f;
        int length = iArr.length;
        int[] iArr2 = mVar.f14415f;
        int length2 = iArr2.length;
        if (length < length2) {
            i17 = -1;
        } else if (length > length2) {
            i17 = 1;
        } else {
            int i27 = 0;
            while (true) {
                if (i27 >= length) {
                    i17 = 0;
                    break;
                }
                int f17 = cv5.c.f(iArr[i27], iArr2[i27]);
                if (f17 != 0) {
                    i17 = f17;
                    break;
                }
                i27++;
            }
        }
        return i17 != 0 ? i17 : cv5.c.d(this.f14416g, mVar.f14416g);
    }

    @Override // av5.m0
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof av5.m) && compareTo((av5.m) obj) == 0;
    }

    @Override // av5.m0
    public int hashCode() {
        return cv5.e.a(java.lang.Integer.valueOf(this.f14414e), this.f14415f, this.f14416g);
    }
}
