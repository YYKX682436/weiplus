package zy2;

/* loaded from: classes2.dex */
public final class l7 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f558988a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f558989b;

    public l7(boolean z17, boolean z18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 2) != 0 ? false : z18;
        this.f558988a = z17;
        this.f558989b = z18;
    }

    /* renamed from: equals */
    public boolean m179987xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2.l7)) {
            return false;
        }
        zy2.l7 l7Var = (zy2.l7) obj;
        return this.f558988a == l7Var.f558988a && this.f558989b == l7Var.f558989b;
    }

    /* renamed from: hashCode */
    public int m179988x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f558988a) * 31) + java.lang.Boolean.hashCode(this.f558989b);
    }

    /* renamed from: toString */
    public java.lang.String m179989x9616526c() {
        return "DislikeEduTipsStatus(enableDislikeEduItemHighLight=" + this.f558988a + ", lastShownAsHighLight=" + this.f558989b + ')';
    }
}
