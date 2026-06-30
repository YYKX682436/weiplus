package zy2;

/* loaded from: classes2.dex */
public final class k7 {

    /* renamed from: a, reason: collision with root package name */
    public int f558974a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f558975b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f558976c;

    public k7(int i17, boolean z17, boolean z18, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        z17 = (i18 & 2) != 0 ? false : z17;
        z18 = (i18 & 4) != 0 ? false : z18;
        this.f558974a = i17;
        this.f558975b = z17;
        this.f558976c = z18;
    }

    /* renamed from: equals */
    public boolean m179981xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2.k7)) {
            return false;
        }
        zy2.k7 k7Var = (zy2.k7) obj;
        return this.f558974a == k7Var.f558974a && this.f558975b == k7Var.f558975b && this.f558976c == k7Var.f558976c;
    }

    /* renamed from: hashCode */
    public int m179982x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f558974a) * 31) + java.lang.Boolean.hashCode(this.f558975b)) * 31) + java.lang.Boolean.hashCode(this.f558976c);
    }

    /* renamed from: toString */
    public java.lang.String m179983x9616526c() {
        return "AutoScrollTipsStatus(consecutiveCompletePlayCnt=" + this.f558974a + ", enableAutoScrollItemHighLight=" + this.f558975b + ", hasFeedOperate=" + this.f558976c + ')';
    }
}
