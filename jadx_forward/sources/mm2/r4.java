package mm2;

/* loaded from: classes10.dex */
public final class r4 {

    /* renamed from: a, reason: collision with root package name */
    public int f410909a;

    /* renamed from: b, reason: collision with root package name */
    public int f410910b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f410911c;

    /* renamed from: d, reason: collision with root package name */
    public r45.f02 f410912d;

    public r4(int i17, int i18, boolean z17, r45.f02 lotteryInfo, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i19 & 1) != 0 ? 0 : i17;
        i18 = (i19 & 2) != 0 ? -1 : i18;
        z17 = (i19 & 4) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryInfo, "lotteryInfo");
        this.f410909a = i17;
        this.f410910b = i18;
        this.f410911c = z17;
        this.f410912d = lotteryInfo;
    }

    /* renamed from: equals */
    public boolean m148011xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.r4)) {
            return false;
        }
        mm2.r4 r4Var = (mm2.r4) obj;
        return this.f410909a == r4Var.f410909a && this.f410910b == r4Var.f410910b && this.f410911c == r4Var.f410911c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f410912d, r4Var.f410912d);
    }

    /* renamed from: hashCode */
    public int m148012x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f410909a) * 31) + java.lang.Integer.hashCode(this.f410910b)) * 31) + java.lang.Boolean.hashCode(this.f410911c)) * 31) + this.f410912d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m148013x9616526c() {
        return "localStatus:" + this.f410909a + ",localRemainTime:" + this.f410910b + ",haveLottering:" + this.f410911c + ", lotteryInfo:" + pm0.b0.g(this.f410912d);
    }
}
