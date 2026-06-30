package bi4;

/* loaded from: classes4.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f102589a;

    /* renamed from: b, reason: collision with root package name */
    public final int f102590b;

    public i1(float f17, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        f17 = (i18 & 1) != 0 ? 1.0f : f17;
        i17 = (i18 & 2) != 0 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835 : i17;
        this.f102589a = f17;
        this.f102590b = i17;
    }

    /* renamed from: equals */
    public boolean m10616xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi4.i1)) {
            return false;
        }
        bi4.i1 i1Var = (bi4.i1) obj;
        return java.lang.Float.compare(this.f102589a, i1Var.f102589a) == 0 && this.f102590b == i1Var.f102590b;
    }

    /* renamed from: hashCode */
    public int m10617x8cdac1b() {
        return (java.lang.Float.hashCode(this.f102589a) * 31) + java.lang.Integer.hashCode(this.f102590b);
    }

    /* renamed from: toString */
    public java.lang.String m10618x9616526c() {
        return "StatusCardDialogStrokeConfig(widthDp=" + this.f102589a + ", colorRes=" + this.f102590b + ')';
    }
}
