package x46;

/* loaded from: classes7.dex */
public class a implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public char[] f533472d;

    /* renamed from: e, reason: collision with root package name */
    public int f533473e;

    public a() {
        this(32);
    }

    public x46.a a(char c17) {
        d(this.f533473e + 1);
        char[] cArr = this.f533472d;
        int i17 = this.f533473e;
        this.f533473e = i17 + 1;
        cArr[i17] = c17;
        return this;
    }

    public x46.a b(java.lang.Object obj) {
        return obj == null ? this : c(obj.toString());
    }

    public x46.a c(java.lang.String str) {
        int length;
        if (str != null && (length = str.length()) > 0) {
            int i17 = this.f533473e;
            d(i17 + length);
            str.getChars(0, length, this.f533472d, i17);
            this.f533473e += length;
        }
        return this;
    }

    /* renamed from: clone */
    public java.lang.Object m174999x5a5dd5d() {
        x46.a aVar = (x46.a) super.clone();
        char[] cArr = new char[this.f533472d.length];
        aVar.f533472d = cArr;
        char[] cArr2 = this.f533472d;
        java.lang.System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        return aVar;
    }

    public x46.a d(int i17) {
        char[] cArr = this.f533472d;
        if (i17 > cArr.length) {
            char[] cArr2 = new char[i17 * 2];
            this.f533472d = cArr2;
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, this.f533473e);
        }
        return this;
    }

    /* renamed from: equals */
    public boolean m175000xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof x46.a)) {
            return false;
        }
        x46.a aVar = (x46.a) obj;
        if (this != aVar) {
            int i17 = this.f533473e;
            if (i17 != aVar.f533473e) {
                return false;
            }
            char[] cArr = this.f533472d;
            char[] cArr2 = aVar.f533472d;
            for (int i18 = i17 - 1; i18 >= 0; i18--) {
                if (cArr[i18] != cArr2[i18]) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m175001x8cdac1b() {
        char[] cArr = this.f533472d;
        int i17 = 0;
        for (int i18 = this.f533473e - 1; i18 >= 0; i18--) {
            i17 = (i17 * 31) + cArr[i18];
        }
        return i17;
    }

    /* renamed from: toString */
    public java.lang.String m175002x9616526c() {
        return new java.lang.String(this.f533472d, 0, this.f533473e);
    }

    public a(int i17) {
        this.f533472d = new char[i17 <= 0 ? 32 : i17];
    }
}
