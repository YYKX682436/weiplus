package k16;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f384957a;

    /* renamed from: b, reason: collision with root package name */
    public final int f384958b;

    /* renamed from: c, reason: collision with root package name */
    public final int f384959c;

    /* renamed from: d, reason: collision with root package name */
    public final int f384960d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f384961e;

    public a(int... numbers) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(numbers, "numbers");
        this.f384957a = numbers;
        java.lang.Integer S = kz5.z.S(numbers, 0);
        this.f384958b = S != null ? S.intValue() : -1;
        java.lang.Integer S2 = kz5.z.S(numbers, 1);
        this.f384959c = S2 != null ? S2.intValue() : -1;
        java.lang.Integer S3 = kz5.z.S(numbers, 2);
        this.f384960d = S3 != null ? S3.intValue() : -1;
        if (numbers.length <= 3) {
            list = kz5.p0.f395529d;
        } else {
            if (numbers.length > 1024) {
                throw new java.lang.IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + '.');
            }
            list = kz5.n0.S0(((kz5.h) kz5.v.e(numbers)).subList(3, numbers.length));
        }
        this.f384961e = list;
    }

    public final boolean a(int i17, int i18, int i19) {
        int i27 = this.f384958b;
        if (i27 > i17) {
            return true;
        }
        if (i27 < i17) {
            return false;
        }
        int i28 = this.f384959c;
        if (i28 > i18) {
            return true;
        }
        return i28 >= i18 && this.f384960d >= i19;
    }

    /* renamed from: equals */
    public boolean m141772xb2c87fbf(java.lang.Object obj) {
        if (obj != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(getClass(), obj.getClass())) {
            k16.a aVar = (k16.a) obj;
            if (this.f384958b == aVar.f384958b && this.f384959c == aVar.f384959c && this.f384960d == aVar.f384960d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f384961e, aVar.f384961e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m141773x8cdac1b() {
        int i17 = this.f384958b;
        int i18 = i17 + (i17 * 31) + this.f384959c;
        int i19 = i18 + (i18 * 31) + this.f384960d;
        return i19 + (i19 * 31) + this.f384961e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m141774x9616526c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int[] iArr = this.f384957a;
        int length = iArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = iArr[i17];
            if (!(i18 != -1)) {
                break;
            }
            arrayList.add(java.lang.Integer.valueOf(i18));
        }
        return arrayList.isEmpty() ? com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a : kz5.n0.g0(arrayList, ".", null, null, 0, null, null, 62, null);
    }
}
