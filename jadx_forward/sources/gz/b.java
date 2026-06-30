package gz;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f359175a;

    /* renamed from: b, reason: collision with root package name */
    public final bw5.xf0 f359176b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f359177c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f359178d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f359179e;

    public b(boolean z17, bw5.xf0 xf0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        xf0Var = (i17 & 2) != 0 ? null : xf0Var;
        str = (i17 & 4) != 0 ? null : str;
        str2 = (i17 & 8) != 0 ? null : str2;
        str3 = (i17 & 16) != 0 ? null : str3;
        this.f359175a = z17;
        this.f359176b = xf0Var;
        this.f359177c = str;
        this.f359178d = str2;
        this.f359179e = str3;
    }

    /* renamed from: equals */
    public boolean m132532xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz.b)) {
            return false;
        }
        gz.b bVar = (gz.b) obj;
        return this.f359175a == bVar.f359175a && this.f359176b == bVar.f359176b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f359177c, bVar.f359177c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f359178d, bVar.f359178d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f359179e, bVar.f359179e);
    }

    /* renamed from: hashCode */
    public int m132533x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f359175a) * 31;
        bw5.xf0 xf0Var = this.f359176b;
        int hashCode2 = (hashCode + (xf0Var == null ? 0 : xf0Var.hashCode())) * 31;
        java.lang.String str = this.f359177c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f359178d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f359179e;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m132534x9616526c() {
        return "CreateGroupResult(success=" + this.f359175a + ", errorCode=" + this.f359176b + ", errorMsg=" + this.f359177c + ", networkName=" + this.f359178d + ", passphrase=" + this.f359179e + ')';
    }
}
