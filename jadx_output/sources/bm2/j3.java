package bm2;

/* loaded from: classes3.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f22005a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22006b;

    /* renamed from: c, reason: collision with root package name */
    public long f22007c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22008d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f22009e;

    public j3(java.lang.String comment, int i17, long j17, int i18, java.lang.String str) {
        kotlin.jvm.internal.o.g(comment, "comment");
        this.f22005a = comment;
        this.f22006b = i17;
        this.f22007c = j17;
        this.f22008d = i18;
        this.f22009e = str;
    }

    public final java.util.Map a(int i17) {
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("button_type", java.lang.String.valueOf((this.f22006b == 0 ? 1 : 0) ^ 1));
        lVarArr[1] = new jz5.l("quick_reply_index", java.lang.String.valueOf(i17));
        lVarArr[2] = new jz5.l("quick_reply_content", this.f22005a);
        return kz5.c1.l(lVarArr);
    }

    public final java.util.Map b() {
        return kz5.c1.k(new jz5.l("recommend_comment_type", java.lang.String.valueOf(d())), new jz5.l("recommend_comment", this.f22005a), new jz5.l(ya.b.SOURCE, "2"));
    }

    public final java.util.Map c() {
        java.lang.String str = this.f22009e;
        return !(str == null || str.length() == 0) ? kz5.b1.e(new jz5.l("comment_noticeid", str)) : kz5.q0.f314001d;
    }

    public final int d() {
        int i17 = this.f22006b;
        if (i17 == 0) {
            return 3;
        }
        if (i17 == 1) {
            int i18 = this.f22008d;
            if (i18 == 1 || i18 == 2) {
                return 1;
            }
            if (i18 == 3) {
                return 2;
            }
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm2.j3)) {
            return false;
        }
        bm2.j3 j3Var = (bm2.j3) obj;
        return kotlin.jvm.internal.o.b(this.f22005a, j3Var.f22005a) && this.f22006b == j3Var.f22006b && this.f22007c == j3Var.f22007c && this.f22008d == j3Var.f22008d && kotlin.jvm.internal.o.b(this.f22009e, j3Var.f22009e);
    }

    public int hashCode() {
        int hashCode = ((((((this.f22005a.hashCode() * 31) + java.lang.Integer.hashCode(this.f22006b)) * 31) + java.lang.Long.hashCode(this.f22007c)) * 31) + java.lang.Integer.hashCode(this.f22008d)) * 31;
        java.lang.String str = this.f22009e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "FinderFastCommentInfo(comment=" + this.f22005a + ", type=" + this.f22006b + ", lastSendTime=" + this.f22007c + ", wordingType=" + this.f22008d + ", wordingId=" + this.f22009e + ')';
    }

    public /* synthetic */ j3(java.lang.String str, int i17, long j17, int i18, java.lang.String str2, int i19, kotlin.jvm.internal.i iVar) {
        this(str, i17, (i19 & 4) != 0 ? 0L : j17, i18, (i19 & 16) != 0 ? null : str2);
    }
}
