package c4;

/* loaded from: classes13.dex */
public class r0 implements c4.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f38335a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38336b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38337c;

    public r0(java.lang.String str, int i17, int i18) {
        this.f38335a = str;
        this.f38336b = i17;
        this.f38337c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4.r0)) {
            return false;
        }
        c4.r0 r0Var = (c4.r0) obj;
        int i17 = this.f38337c;
        java.lang.String str = this.f38335a;
        int i18 = this.f38336b;
        return (i18 < 0 || r0Var.f38336b < 0) ? android.text.TextUtils.equals(str, r0Var.f38335a) && i17 == r0Var.f38337c : android.text.TextUtils.equals(str, r0Var.f38335a) && i18 == r0Var.f38336b && i17 == r0Var.f38337c;
    }

    public int hashCode() {
        return m3.c.b(this.f38335a, java.lang.Integer.valueOf(this.f38337c));
    }
}
