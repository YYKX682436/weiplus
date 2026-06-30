package av5;

/* loaded from: classes16.dex */
public class m extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final int f95947e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f95948f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f95949g;

    public m(int i17, int i18, int[] iArr, byte[] bArr) {
        super(i17);
        this.f95947e = i18;
        this.f95948f = iArr;
        this.f95949g = bArr;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(av5.m mVar) {
        int i17;
        int i18 = mVar.f95947e;
        int i19 = this.f95947e;
        if (i19 != i18) {
            return i19 - i18;
        }
        int[] iArr = this.f95948f;
        int length = iArr.length;
        int[] iArr2 = mVar.f95948f;
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
        return i17 != 0 ? i17 : cv5.c.d(this.f95949g, mVar.f95949g);
    }

    @Override // av5.m0
    /* renamed from: equals */
    public boolean mo9117xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof av5.m) && compareTo((av5.m) obj) == 0;
    }

    @Override // av5.m0
    /* renamed from: hashCode */
    public int mo9118x8cdac1b() {
        return cv5.e.a(java.lang.Integer.valueOf(this.f95947e), this.f95948f, this.f95949g);
    }
}
