package dk2;

/* loaded from: classes3.dex */
public final class l5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f315249a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f315250b;

    /* renamed from: c, reason: collision with root package name */
    public final long f315251c;

    public l5(long j17, java.util.List comments, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comments, "comments");
        this.f315249a = j17;
        this.f315250b = comments;
        this.f315251c = j18;
    }

    /* renamed from: equals */
    public boolean m124601xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.l5)) {
            return false;
        }
        dk2.l5 l5Var = (dk2.l5) obj;
        return this.f315249a == l5Var.f315249a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315250b, l5Var.f315250b) && this.f315251c == l5Var.f315251c;
    }

    /* renamed from: hashCode */
    public int m124602x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f315249a) * 31) + this.f315250b.hashCode()) * 31) + java.lang.Long.hashCode(this.f315251c);
    }

    /* renamed from: toString */
    public java.lang.String m124603x9616526c() {
        return "CommentData(liveId=" + this.f315249a + ", comments=" + this.f315250b + ", insertTime=" + this.f315251c + ')';
    }
}
