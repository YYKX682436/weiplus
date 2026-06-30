package c43;

/* loaded from: classes14.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public int f119928a;

    /* renamed from: b, reason: collision with root package name */
    public int f119929b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f119930c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f119931d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f119932e;

    public b1(int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c, java.lang.String str, boolean z17, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i19 & 1) != 0 ? 0 : i17;
        i18 = (i19 & 2) != 0 ? 0 : i18;
        c15780xf49d6a1c = (i19 & 4) != 0 ? null : c15780xf49d6a1c;
        str = (i19 & 8) != 0 ? null : str;
        z17 = (i19 & 16) != 0 ? false : z17;
        this.f119928a = i17;
        this.f119929b = i18;
        this.f119930c = c15780xf49d6a1c;
        this.f119931d = str;
        this.f119932e = z17;
    }

    /* renamed from: equals */
    public boolean m14140xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c43.b1)) {
            return false;
        }
        c43.b1 b1Var = (c43.b1) obj;
        return this.f119928a == b1Var.f119928a && this.f119929b == b1Var.f119929b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f119930c, b1Var.f119930c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f119931d, b1Var.f119931d) && this.f119932e == b1Var.f119932e;
    }

    /* renamed from: hashCode */
    public int m14141x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f119928a) * 31) + java.lang.Integer.hashCode(this.f119929b)) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = this.f119930c;
        int hashCode2 = (hashCode + (c15780xf49d6a1c == null ? 0 : c15780xf49d6a1c.hashCode())) * 31;
        java.lang.String str = this.f119931d;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f119932e);
    }

    /* renamed from: toString */
    public java.lang.String m14142x9616526c() {
        return "LinkBlock(start=" + this.f119928a + ", end=" + this.f119929b + ", jumpInfo=" + this.f119930c + ", userName=" + this.f119931d + ", canBeAt=" + this.f119932e + ')';
    }
}
