package c4;

/* loaded from: classes13.dex */
public class r0 implements c4.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f119868a;

    /* renamed from: b, reason: collision with root package name */
    public final int f119869b;

    /* renamed from: c, reason: collision with root package name */
    public final int f119870c;

    public r0(java.lang.String str, int i17, int i18) {
        this.f119868a = str;
        this.f119869b = i17;
        this.f119870c = i18;
    }

    /* renamed from: equals */
    public boolean m14114xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4.r0)) {
            return false;
        }
        c4.r0 r0Var = (c4.r0) obj;
        int i17 = this.f119870c;
        java.lang.String str = this.f119868a;
        int i18 = this.f119869b;
        return (i18 < 0 || r0Var.f119869b < 0) ? android.text.TextUtils.equals(str, r0Var.f119868a) && i17 == r0Var.f119870c : android.text.TextUtils.equals(str, r0Var.f119868a) && i18 == r0Var.f119869b && i17 == r0Var.f119870c;
    }

    /* renamed from: hashCode */
    public int m14115x8cdac1b() {
        return m3.c.b(this.f119868a, java.lang.Integer.valueOf(this.f119870c));
    }
}
