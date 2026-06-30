package gz;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f359172a;

    /* renamed from: b, reason: collision with root package name */
    public final bw5.xf0 f359173b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f359174c;

    public a(boolean z17, bw5.xf0 xf0Var, java.lang.String str) {
        this.f359172a = z17;
        this.f359173b = xf0Var;
        this.f359174c = str;
    }

    /* renamed from: equals */
    public boolean m132529xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz.a)) {
            return false;
        }
        gz.a aVar = (gz.a) obj;
        return this.f359172a == aVar.f359172a && this.f359173b == aVar.f359173b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f359174c, aVar.f359174c);
    }

    /* renamed from: hashCode */
    public int m132530x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f359172a) * 31;
        bw5.xf0 xf0Var = this.f359173b;
        int hashCode2 = (hashCode + (xf0Var == null ? 0 : xf0Var.hashCode())) * 31;
        java.lang.String str = this.f359174c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m132531x9616526c() {
        return "ConnectToGroupResult(success=" + this.f359172a + ", errorCode=" + this.f359173b + ", errorMsg=" + this.f359174c + ')';
    }

    public /* synthetic */ a(boolean z17, bw5.xf0 xf0Var, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(z17, (i17 & 2) != 0 ? null : xf0Var, (i17 & 4) != 0 ? null : str);
    }
}
