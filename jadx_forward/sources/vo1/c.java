package vo1;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f520031a;

    /* renamed from: b, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f520032b;

    /* renamed from: c, reason: collision with root package name */
    public final int f520033c;

    /* renamed from: d, reason: collision with root package name */
    public final int f520034d;

    /* renamed from: e, reason: collision with root package name */
    public final int f520035e;

    /* renamed from: f, reason: collision with root package name */
    public final int f520036f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.l f520037g;

    public c(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2, int i17, int i18, int i19, int i27, jz5.l lVar) {
        this.f520031a = k3Var;
        this.f520032b = k3Var2;
        this.f520033c = i17;
        this.f520034d = i18;
        this.f520035e = i19;
        this.f520036f = i27;
        this.f520037g = lVar;
    }

    /* renamed from: equals */
    public boolean m172361xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo1.c)) {
            return false;
        }
        vo1.c cVar = (vo1.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520031a, cVar.f520031a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520032b, cVar.f520032b) && this.f520033c == cVar.f520033c && this.f520034d == cVar.f520034d && this.f520035e == cVar.f520035e && this.f520036f == cVar.f520036f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520037g, cVar.f520037g);
    }

    /* renamed from: hashCode */
    public int m172362x8cdac1b() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f520031a;
        int hashCode = (k3Var == null ? 0 : k3Var.hashCode()) * 31;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = this.f520032b;
        int hashCode2 = (((((((((hashCode + (k3Var2 == null ? 0 : k3Var2.hashCode())) * 31) + java.lang.Integer.hashCode(this.f520033c)) * 31) + java.lang.Integer.hashCode(this.f520034d)) * 31) + java.lang.Integer.hashCode(this.f520035e)) * 31) + java.lang.Integer.hashCode(this.f520036f)) * 31;
        jz5.l lVar = this.f520037g;
        return hashCode2 + (lVar != null ? lVar.m141638x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m172363x9616526c() {
        return "ChangeInfo(oldHolder=" + this.f520031a + ", newHolder=" + this.f520032b + ", fromX=" + this.f520033c + ", fromY=" + this.f520034d + ", toX=" + this.f520035e + ", toY=" + this.f520036f + ", expandInfo=" + this.f520037g + ')';
    }
}
