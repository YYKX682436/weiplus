package wf0;

/* loaded from: classes4.dex */
public class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f527051a;

    /* renamed from: b, reason: collision with root package name */
    public final bm5.f0 f527052b;

    public l1(java.lang.String str, bm5.f0 f0Var) {
        this.f527051a = str;
        this.f527052b = f0Var;
        if (ya.b.f77495x8b74a326.endsWith(str)) {
            this.f527052b = bm5.f0.f104103r;
        }
    }

    /* renamed from: equals */
    public boolean m173703xb2c87fbf(java.lang.Object obj) {
        if (obj == null || !(obj instanceof wf0.l1)) {
            return false;
        }
        wf0.l1 l1Var = (wf0.l1) obj;
        return android.text.TextUtils.equals(this.f527051a, l1Var.f527051a) && this.f527052b.f104111d == l1Var.f527052b.f104111d;
    }

    /* renamed from: hashCode */
    public int m173704x8cdac1b() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.f527052b.f104111d), this.f527051a);
    }

    /* renamed from: toString */
    public java.lang.String m173705x9616526c() {
        return this.f527051a + "_" + this.f527052b.f104111d;
    }
}
