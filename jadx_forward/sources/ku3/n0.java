package ku3;

/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f393865a;

    /* renamed from: b, reason: collision with root package name */
    public final int f393866b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f393867c;

    public n0(int i17, int i18, java.lang.String str) {
        this.f393865a = i17;
        this.f393866b = i18;
        this.f393867c = str;
    }

    /* renamed from: equals */
    public boolean m144397xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku3.n0)) {
            return false;
        }
        ku3.n0 n0Var = (ku3.n0) obj;
        return this.f393865a == n0Var.f393865a && this.f393866b == n0Var.f393866b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f393867c, n0Var.f393867c);
    }

    /* renamed from: hashCode */
    public int m144398x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f393865a) * 31) + java.lang.Integer.hashCode(this.f393866b)) * 31;
        java.lang.String str = this.f393867c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m144399x9616526c() {
        return "HintData(hintType=" + this.f393865a + ", ctrType=" + this.f393866b + ", value=" + this.f393867c + ')';
    }

    public /* synthetic */ n0(int i17, int i18, java.lang.String str, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, i18, (i19 & 4) != 0 ? null : str);
    }
}
