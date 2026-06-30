package mm2;

/* loaded from: classes3.dex */
public final class s5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f410948a;

    /* renamed from: b, reason: collision with root package name */
    public final int f410949b;

    /* renamed from: c, reason: collision with root package name */
    public final dk2.g f410950c;

    /* renamed from: d, reason: collision with root package name */
    public final int f410951d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f410952e;

    public s5(java.lang.String curGiftId, int i17, dk2.g comboData, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curGiftId, "curGiftId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comboData, "comboData");
        this.f410948a = curGiftId;
        this.f410949b = i17;
        this.f410950c = comboData;
        this.f410951d = i18;
        this.f410952e = z17;
    }

    /* renamed from: equals */
    public boolean m148015xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.s5)) {
            return false;
        }
        mm2.s5 s5Var = (mm2.s5) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f410948a, s5Var.f410948a) && this.f410949b == s5Var.f410949b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f410950c, s5Var.f410950c) && this.f410951d == s5Var.f410951d && this.f410952e == s5Var.f410952e;
    }

    /* renamed from: hashCode */
    public int m148016x8cdac1b() {
        return (((((((this.f410948a.hashCode() * 31) + java.lang.Integer.hashCode(this.f410949b)) * 31) + this.f410950c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f410951d)) * 31) + java.lang.Boolean.hashCode(this.f410952e);
    }

    /* renamed from: toString */
    public java.lang.String m148017x9616526c() {
        return "QuotaSendGiftData(curGiftId=" + this.f410948a + ", clickCnt=" + this.f410949b + ", comboData=" + this.f410950c + ", diffCnt=" + this.f410951d + ", isFromPatchSend=" + this.f410952e + ')';
    }
}
