package ex2;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f338727a;

    /* renamed from: b, reason: collision with root package name */
    public final int f338728b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f338729c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 f338730d;

    public a(java.lang.String str, int i17, boolean z17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 p3Var) {
        this.f338727a = str;
        this.f338728b = i17;
        this.f338729c = z17;
        this.f338730d = p3Var;
    }

    /* renamed from: equals */
    public boolean m128285xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex2.a)) {
            return false;
        }
        ex2.a aVar = (ex2.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338727a, aVar.f338727a) && this.f338728b == aVar.f338728b && this.f338729c == aVar.f338729c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338730d, aVar.f338730d);
    }

    /* renamed from: hashCode */
    public int m128286x8cdac1b() {
        java.lang.String str = this.f338727a;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f338728b)) * 31) + java.lang.Boolean.hashCode(this.f338729c)) * 31;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 p3Var = this.f338730d;
        return hashCode + (p3Var != null ? p3Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m128287x9616526c() {
        return "BtnConfig(text=" + this.f338727a + ", colorStyle=" + this.f338728b + ", cancel=" + this.f338729c + ", callBack=" + this.f338730d + ')';
    }
}
