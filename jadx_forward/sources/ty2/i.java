package ty2;

/* loaded from: classes9.dex */
public final class i implements ty2.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Float f504601a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f504602b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f504603c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f504604d;

    public i(java.lang.Float f17, boolean z17, boolean z18, boolean z19) {
        this.f504601a = f17;
        this.f504602b = z17;
        this.f504603c = z18;
        this.f504604d = z19;
    }

    /* renamed from: equals */
    public boolean m167221xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty2.i)) {
            return false;
        }
        ty2.i iVar = (ty2.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504601a, iVar.f504601a) && this.f504602b == iVar.f504602b && this.f504603c == iVar.f504603c && this.f504604d == iVar.f504604d;
    }

    /* renamed from: hashCode */
    public int m167222x8cdac1b() {
        java.lang.Float f17 = this.f504601a;
        return ((((((f17 == null ? 0 : f17.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f504602b)) * 31) + java.lang.Boolean.hashCode(this.f504603c)) * 31) + java.lang.Boolean.hashCode(this.f504604d);
    }

    /* renamed from: toString */
    public java.lang.String m167223x9616526c() {
        return "Config(priceSizePx=" + this.f504601a + ", showSellWording=" + this.f504602b + ", showSaleNum=" + this.f504603c + ", showBegin=" + this.f504604d + ')';
    }
}
