package bm2;

/* loaded from: classes3.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f103538a;

    /* renamed from: b, reason: collision with root package name */
    public final int f103539b;

    /* renamed from: c, reason: collision with root package name */
    public long f103540c;

    /* renamed from: d, reason: collision with root package name */
    public final int f103541d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f103542e;

    public j3(java.lang.String comment, int i17, long j17, int i18, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        this.f103538a = comment;
        this.f103539b = i17;
        this.f103540c = j17;
        this.f103541d = i18;
        this.f103542e = str;
    }

    public final java.util.Map a(int i17) {
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("button_type", java.lang.String.valueOf((this.f103539b == 0 ? 1 : 0) ^ 1));
        lVarArr[1] = new jz5.l("quick_reply_index", java.lang.String.valueOf(i17));
        lVarArr[2] = new jz5.l("quick_reply_content", this.f103538a);
        return kz5.c1.l(lVarArr);
    }

    public final java.util.Map b() {
        return kz5.c1.k(new jz5.l("recommend_comment_type", java.lang.String.valueOf(d())), new jz5.l("recommend_comment", this.f103538a), new jz5.l(ya.b.f77502x92235c1b, "2"));
    }

    public final java.util.Map c() {
        java.lang.String str = this.f103542e;
        return !(str == null || str.length() == 0) ? kz5.b1.e(new jz5.l("comment_noticeid", str)) : kz5.q0.f395534d;
    }

    public final int d() {
        int i17 = this.f103539b;
        if (i17 == 0) {
            return 3;
        }
        if (i17 == 1) {
            int i18 = this.f103541d;
            if (i18 == 1 || i18 == 2) {
                return 1;
            }
            if (i18 == 3) {
                return 2;
            }
        }
        return 0;
    }

    /* renamed from: equals */
    public boolean m10751xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm2.j3)) {
            return false;
        }
        bm2.j3 j3Var = (bm2.j3) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f103538a, j3Var.f103538a) && this.f103539b == j3Var.f103539b && this.f103540c == j3Var.f103540c && this.f103541d == j3Var.f103541d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f103542e, j3Var.f103542e);
    }

    /* renamed from: hashCode */
    public int m10752x8cdac1b() {
        int hashCode = ((((((this.f103538a.hashCode() * 31) + java.lang.Integer.hashCode(this.f103539b)) * 31) + java.lang.Long.hashCode(this.f103540c)) * 31) + java.lang.Integer.hashCode(this.f103541d)) * 31;
        java.lang.String str = this.f103542e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m10753x9616526c() {
        return "FinderFastCommentInfo(comment=" + this.f103538a + ", type=" + this.f103539b + ", lastSendTime=" + this.f103540c + ", wordingType=" + this.f103541d + ", wordingId=" + this.f103542e + ')';
    }

    public /* synthetic */ j3(java.lang.String str, int i17, long j17, int i18, java.lang.String str2, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, i17, (i19 & 4) != 0 ? 0L : j17, i18, (i19 & 16) != 0 ? null : str2);
    }
}
