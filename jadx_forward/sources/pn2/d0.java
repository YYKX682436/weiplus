package pn2;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f438518a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f438519b;

    /* renamed from: c, reason: collision with root package name */
    public int f438520c;

    /* renamed from: d, reason: collision with root package name */
    public int f438521d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f438522e;

    public d0(boolean z17, boolean z18, int i17, int i18, boolean z19, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i19 & 1) != 0 ? false : z17;
        z18 = (i19 & 2) != 0 ? false : z18;
        i17 = (i19 & 4) != 0 ? 0 : i17;
        i18 = (i19 & 8) != 0 ? 0 : i18;
        z19 = (i19 & 16) != 0 ? false : z19;
        this.f438518a = z17;
        this.f438519b = z18;
        this.f438520c = i17;
        this.f438521d = i18;
        this.f438522e = z19;
    }

    /* renamed from: equals */
    public boolean m158749xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn2.d0)) {
            return false;
        }
        pn2.d0 d0Var = (pn2.d0) obj;
        return this.f438518a == d0Var.f438518a && this.f438519b == d0Var.f438519b && this.f438520c == d0Var.f438520c && this.f438521d == d0Var.f438521d && this.f438522e == d0Var.f438522e;
    }

    /* renamed from: hashCode */
    public int m158750x8cdac1b() {
        return (((((((java.lang.Boolean.hashCode(this.f438518a) * 31) + java.lang.Boolean.hashCode(this.f438519b)) * 31) + java.lang.Integer.hashCode(this.f438520c)) * 31) + java.lang.Integer.hashCode(this.f438521d)) * 31) + java.lang.Boolean.hashCode(this.f438522e);
    }

    /* renamed from: toString */
    public java.lang.String m158751x9616526c() {
        return "LotteryUpdateStatus localStatus:" + this.f438520c + ",lotteryStatus:" + this.f438521d + ",statusChange:" + this.f438518a + ",newLottery:" + this.f438519b + ",resumeState:" + this.f438522e;
    }
}
