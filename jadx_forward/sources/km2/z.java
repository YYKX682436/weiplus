package km2;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public int f390762a;

    /* renamed from: b, reason: collision with root package name */
    public int f390763b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f390764c;

    /* renamed from: d, reason: collision with root package name */
    public r45.cz1 f390765d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f390766e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f390767f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f390768g;

    public z(int i17, int i18, boolean z17, r45.cz1 cz1Var, boolean z18, boolean z19, boolean z27, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i19 & 1) != 0 ? 0 : i17;
        i18 = (i19 & 2) != 0 ? -1 : i18;
        z17 = (i19 & 4) != 0 ? false : z17;
        cz1Var = (i19 & 8) != 0 ? null : cz1Var;
        z18 = (i19 & 16) != 0 ? false : z18;
        z19 = (i19 & 32) != 0 ? false : z19;
        z27 = (i19 & 64) != 0 ? false : z27;
        this.f390762a = i17;
        this.f390763b = i18;
        this.f390764c = z17;
        this.f390765d = cz1Var;
        this.f390766e = z18;
        this.f390767f = z19;
        this.f390768g = z27;
    }

    /* renamed from: equals */
    public boolean m143697xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.z)) {
            return false;
        }
        km2.z zVar = (km2.z) obj;
        return this.f390762a == zVar.f390762a && this.f390763b == zVar.f390763b && this.f390764c == zVar.f390764c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390765d, zVar.f390765d) && this.f390766e == zVar.f390766e && this.f390767f == zVar.f390767f && this.f390768g == zVar.f390768g;
    }

    /* renamed from: hashCode */
    public int m143698x8cdac1b() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f390762a) * 31) + java.lang.Integer.hashCode(this.f390763b)) * 31) + java.lang.Boolean.hashCode(this.f390764c)) * 31;
        r45.cz1 cz1Var = this.f390765d;
        return ((((((hashCode + (cz1Var == null ? 0 : cz1Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f390766e)) * 31) + java.lang.Boolean.hashCode(this.f390767f)) * 31) + java.lang.Boolean.hashCode(this.f390768g);
    }

    /* renamed from: toString */
    public java.lang.String m143699x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("localStatus:");
        sb6.append(this.f390762a);
        sb6.append(",localRemainTime:");
        sb6.append(this.f390763b);
        sb6.append(",haveLottering:");
        sb6.append(this.f390764c);
        sb6.append(", lotteryInfo:");
        java.lang.Object obj = this.f390765d;
        if (obj == null) {
            obj = "";
        }
        sb6.append(pm0.b0.g(obj));
        sb6.append(",lastDoneLottery:");
        sb6.append(this.f390766e);
        sb6.append(",cardShowing:");
        sb6.append(this.f390767f);
        sb6.append(",bubbleFinsh:");
        sb6.append(this.f390768g);
        return sb6.toString();
    }
}
