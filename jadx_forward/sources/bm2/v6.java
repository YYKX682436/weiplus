package bm2;

/* loaded from: classes10.dex */
public final class v6 {

    /* renamed from: a, reason: collision with root package name */
    public final bm2.w6 f103920a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.yx1 f103921b;

    /* renamed from: c, reason: collision with root package name */
    public final bm2.u6 f103922c;

    public v6(bm2.w6 type, r45.yx1 yx1Var, bm2.u6 u6Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        yx1Var = (i17 & 2) != 0 ? null : yx1Var;
        u6Var = (i17 & 4) != 0 ? null : u6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f103920a = type;
        this.f103921b = yx1Var;
        this.f103922c = u6Var;
    }

    /* renamed from: equals */
    public boolean m10781xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm2.v6)) {
            return false;
        }
        bm2.v6 v6Var = (bm2.v6) obj;
        return this.f103920a == v6Var.f103920a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f103921b, v6Var.f103921b) && this.f103922c == v6Var.f103922c;
    }

    /* renamed from: hashCode */
    public int m10782x8cdac1b() {
        int hashCode = this.f103920a.hashCode() * 31;
        r45.yx1 yx1Var = this.f103921b;
        int hashCode2 = (hashCode + (yx1Var == null ? 0 : yx1Var.hashCode())) * 31;
        bm2.u6 u6Var = this.f103922c;
        return hashCode2 + (u6Var != null ? u6Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m10783x9616526c() {
        return "SongPlayListItem(type=" + this.f103920a + ", song=" + this.f103921b + ", headerType=" + this.f103922c + ')';
    }
}
