package av5;

/* loaded from: classes16.dex */
public class b extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final int[] f14355e;

    public b(int i17, int[] iArr) {
        super(i17);
        this.f14355e = iArr;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(av5.b bVar) {
        int[] iArr = this.f14355e;
        int length = iArr.length;
        int length2 = bVar.f14355e.length;
        if (length != length2) {
            return cv5.c.f(length, length2);
        }
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = iArr[i17];
            int i19 = bVar.f14355e[i17];
            if (i18 != i19) {
                return cv5.c.f(i18, i19);
            }
        }
        return 0;
    }

    @Override // av5.m0
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof av5.b) && compareTo((av5.b) obj) == 0;
    }

    @Override // av5.m0
    public int hashCode() {
        return java.util.Arrays.hashCode(this.f14355e);
    }
}
