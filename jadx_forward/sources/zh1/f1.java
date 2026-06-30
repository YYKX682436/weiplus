package zh1;

/* loaded from: classes8.dex */
public final class f1 implements android.view.ContextMenu.ContextMenuInfo {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f554413a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f554414b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f554415c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f554416d;

    public f1(java.lang.String line1, java.lang.String str, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(line1, "line1");
        this.f554413a = line1;
        this.f554414b = str;
        this.f554415c = z17;
        if (str != null) {
            line1 = line1 + '\n' + str;
        }
        this.f554416d = line1;
    }

    /* renamed from: equals */
    public boolean m178960xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh1.f1)) {
            return false;
        }
        zh1.f1 f1Var = (zh1.f1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f554413a, f1Var.f554413a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f554414b, f1Var.f554414b) && this.f554415c == f1Var.f554415c;
    }

    /* renamed from: hashCode */
    public int m178961x8cdac1b() {
        int hashCode = this.f554413a.hashCode() * 31;
        java.lang.String str = this.f554414b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f554415c);
    }

    /* renamed from: toString */
    public java.lang.String m178962x9616526c() {
        return "RawFunctionName2Show(line1=" + this.f554413a + ", line2=" + this.f554414b + ", needEllipsize=" + this.f554415c + ')';
    }

    public /* synthetic */ f1(java.lang.String str, java.lang.String str2, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, (i17 & 2) != 0 ? null : str2, (i17 & 4) != 0 ? false : z17);
    }
}
