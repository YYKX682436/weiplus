package px3;

/* loaded from: classes10.dex */
public final class a extends px3.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f440467a;

    /* renamed from: b, reason: collision with root package name */
    public final int f440468b;

    public a(java.util.List list, int i17) {
        super(null);
        this.f440467a = list;
        this.f440468b = i17;
    }

    /* renamed from: equals */
    public boolean m159135xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px3.a)) {
            return false;
        }
        px3.a aVar = (px3.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f440467a, aVar.f440467a) && this.f440468b == aVar.f440468b;
    }

    /* renamed from: hashCode */
    public int m159136x8cdac1b() {
        java.util.List list = this.f440467a;
        return ((list == null ? 0 : list.hashCode()) * 31) + java.lang.Integer.hashCode(this.f440468b);
    }

    /* renamed from: toString */
    public java.lang.String m159137x9616526c() {
        return "Success(exclusiveLists=" + this.f440467a + ", uiState=" + this.f440468b + ')';
    }
}
