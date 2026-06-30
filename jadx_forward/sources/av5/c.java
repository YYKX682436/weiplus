package av5;

/* loaded from: classes16.dex */
public class c extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final int[] f95890e;

    public c(int i17, int[] iArr) {
        super(i17);
        this.f95890e = iArr;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(av5.c cVar) {
        int[] iArr = this.f95890e;
        int length = iArr.length;
        int length2 = cVar.f95890e.length;
        if (length != length2) {
            return cv5.c.f(length, length2);
        }
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = iArr[i17];
            int i19 = cVar.f95890e[i17];
            if (i18 != i19) {
                return cv5.c.f(i18, i19);
            }
        }
        return 0;
    }

    @Override // av5.m0
    /* renamed from: equals */
    public boolean mo9117xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof av5.c) && compareTo((av5.c) obj) == 0;
    }

    @Override // av5.m0
    /* renamed from: hashCode */
    public int mo9118x8cdac1b() {
        return java.util.Arrays.hashCode(this.f95890e);
    }
}
