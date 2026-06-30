package l2;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final l2.d f396644b = new l2.d(l2.c.f396642b, 17, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f396645a;

    public d(int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f396645a = i17;
    }

    /* renamed from: equals */
    public boolean m144898xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2.d)) {
            return false;
        }
        int i17 = ((l2.d) obj).f396645a;
        int i18 = l2.c.f396641a;
        return this.f396645a == i17;
    }

    /* renamed from: hashCode */
    public int m144899x8cdac1b() {
        int i17 = l2.c.f396641a;
        return (java.lang.Integer.hashCode(this.f396645a) * 31) + java.lang.Integer.hashCode(17);
    }

    /* renamed from: toString */
    public java.lang.String m144900x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LineHeightStyle(alignment=");
        int i17 = this.f396645a;
        if (i17 == 0) {
            int i18 = l2.c.f396641a;
            str = "LineHeightStyle.Alignment.Top";
        } else if (i17 == l2.c.f396641a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (i17 == l2.c.f396642b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (i17 == l2.c.f396643c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + i17 + ')';
        }
        sb6.append((java.lang.Object) str);
        sb6.append(", trim=");
        sb6.append((java.lang.Object) "LineHeightStyle.Trim.Both");
        sb6.append(')');
        return sb6.toString();
    }
}
