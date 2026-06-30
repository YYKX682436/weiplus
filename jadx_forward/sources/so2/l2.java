package so2;

/* loaded from: classes2.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final ml2.x1 f491996a;

    /* renamed from: b, reason: collision with root package name */
    public final int f491997b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f491998c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 f491999d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.qt2 f492000e;

    public l2(ml2.x1 actionType, int i17, java.lang.String commentscene, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88, r45.qt2 qt2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentscene, "commentscene");
        this.f491996a = actionType;
        this.f491997b = i17;
        this.f491998c = commentscene;
        this.f491999d = c14989xf862ae88;
        this.f492000e = qt2Var;
    }

    /* renamed from: equals */
    public boolean m164911xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.l2)) {
            return false;
        }
        so2.l2 l2Var = (so2.l2) obj;
        return this.f491996a == l2Var.f491996a && this.f491997b == l2Var.f491997b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f491998c, l2Var.f491998c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f491999d, l2Var.f491999d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492000e, l2Var.f492000e);
    }

    /* renamed from: hashCode */
    public int m164912x8cdac1b() {
        int hashCode = ((((this.f491996a.hashCode() * 31) + java.lang.Integer.hashCode(this.f491997b)) * 31) + this.f491998c.hashCode()) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = this.f491999d;
        int hashCode2 = (hashCode + (c14989xf862ae88 == null ? 0 : c14989xf862ae88.hashCode())) * 31;
        r45.qt2 qt2Var = this.f492000e;
        return hashCode2 + (qt2Var != null ? qt2Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m164913x9616526c() {
        return "PageSelectedReportInfo(actionType=" + this.f491996a + ", index=" + this.f491997b + ", commentscene=" + this.f491998c + ", feedData=" + this.f491999d + ", contextObj=" + this.f492000e + ')';
    }
}
