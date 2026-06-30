package we2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final r45.r71 f526747a;

    /* renamed from: b, reason: collision with root package name */
    public final int f526748b;

    public b(r45.r71 r71Var, int i17) {
        this.f526747a = r71Var;
        this.f526748b = i17;
    }

    /* renamed from: equals */
    public boolean m173631xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we2.b)) {
            return false;
        }
        we2.b bVar = (we2.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526747a, bVar.f526747a) && this.f526748b == bVar.f526748b;
    }

    /* renamed from: hashCode */
    public int m173632x8cdac1b() {
        r45.r71 r71Var = this.f526747a;
        return ((r71Var == null ? 0 : r71Var.hashCode()) * 31) + java.lang.Integer.hashCode(this.f526748b);
    }

    /* renamed from: toString */
    public java.lang.String m173633x9616526c() {
        return "FinderGetLiveMsgRespWrapper(resp=" + this.f526747a + ", reqVisitorRoleType=" + this.f526748b + ')';
    }

    public /* synthetic */ b(r45.r71 r71Var, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(r71Var, (i18 & 2) != 0 ? 4 : i17);
    }
}
