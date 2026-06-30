package ec2;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f332485a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f332486b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f332487c;

    /* renamed from: d, reason: collision with root package name */
    public final int f332488d;

    /* renamed from: e, reason: collision with root package name */
    public final long f332489e;

    /* renamed from: f, reason: collision with root package name */
    public final int f332490f;

    public c(int i17, boolean z17, boolean z18, int i18, long j17, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i27 & 1) != 0 ? 0 : i17;
        z17 = (i27 & 2) != 0 ? false : z17;
        z18 = (i27 & 4) != 0 ? false : z18;
        i18 = (i27 & 8) != 0 ? 0 : i18;
        j17 = (i27 & 16) != 0 ? 0L : j17;
        i19 = (i27 & 32) != 0 ? 0 : i19;
        this.f332485a = i17;
        this.f332486b = z17;
        this.f332487c = z18;
        this.f332488d = i18;
        this.f332489e = j17;
        this.f332490f = i19;
    }

    public final int a() {
        return this.f332488d;
    }

    /* renamed from: equals */
    public boolean m127252xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec2.c)) {
            return false;
        }
        ec2.c cVar = (ec2.c) obj;
        return this.f332485a == cVar.f332485a && this.f332486b == cVar.f332486b && this.f332487c == cVar.f332487c && this.f332488d == cVar.f332488d && this.f332489e == cVar.f332489e && this.f332490f == cVar.f332490f;
    }

    /* renamed from: hashCode */
    public int m127253x8cdac1b() {
        return (((((((((java.lang.Integer.hashCode(this.f332485a) * 31) + java.lang.Boolean.hashCode(this.f332486b)) * 31) + java.lang.Boolean.hashCode(this.f332487c)) * 31) + java.lang.Integer.hashCode(this.f332488d)) * 31) + java.lang.Long.hashCode(this.f332489e)) * 31) + java.lang.Integer.hashCode(this.f332490f);
    }

    /* renamed from: toString */
    public java.lang.String m127254x9616526c() {
        return "FinderFeedFlowExtra(clickAvatarType=" + this.f332485a + ", isLiving=" + this.f332486b + ", ifFsPlayer=" + this.f332487c + ", clickCommentReason=" + this.f332488d + ", commentId=" + this.f332489e + ", columnId=" + this.f332490f + ')';
    }
}
