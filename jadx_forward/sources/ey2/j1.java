package ey2;

/* loaded from: classes2.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public int f338935a;

    /* renamed from: b, reason: collision with root package name */
    public long f338936b;

    /* renamed from: c, reason: collision with root package name */
    public int f338937c;

    /* renamed from: d, reason: collision with root package name */
    public long f338938d;

    /* renamed from: e, reason: collision with root package name */
    public ec2.f f338939e;

    /* renamed from: f, reason: collision with root package name */
    public ec2.f f338940f;

    public j1(int i17, long j17, int i18, long j18, ec2.f fVar, ec2.f fVar2, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i19 & 1) != 0 ? 0 : i17;
        j17 = (i19 & 2) != 0 ? 0L : j17;
        i18 = (i19 & 4) != 0 ? 0 : i18;
        j18 = (i19 & 8) != 0 ? 0L : j18;
        fVar = (i19 & 16) != 0 ? null : fVar;
        fVar2 = (i19 & 32) != 0 ? null : fVar2;
        this.f338935a = i17;
        this.f338936b = j17;
        this.f338937c = i18;
        this.f338938d = j18;
        this.f338939e = fVar;
        this.f338940f = fVar2;
    }

    /* renamed from: equals */
    public boolean m128340xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2.j1)) {
            return false;
        }
        ey2.j1 j1Var = (ey2.j1) obj;
        return this.f338935a == j1Var.f338935a && this.f338936b == j1Var.f338936b && this.f338937c == j1Var.f338937c && this.f338938d == j1Var.f338938d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338939e, j1Var.f338939e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338940f, j1Var.f338940f);
    }

    /* renamed from: hashCode */
    public int m128341x8cdac1b() {
        int hashCode = ((((((java.lang.Integer.hashCode(this.f338935a) * 31) + java.lang.Long.hashCode(this.f338936b)) * 31) + java.lang.Integer.hashCode(this.f338937c)) * 31) + java.lang.Long.hashCode(this.f338938d)) * 31;
        ec2.f fVar = this.f338939e;
        int m127256x8cdac1b = (hashCode + (fVar == null ? 0 : fVar.m127256x8cdac1b())) * 31;
        ec2.f fVar2 = this.f338940f;
        return m127256x8cdac1b + (fVar2 != null ? fVar2.m127256x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m128342x9616526c() {
        return "ThumbPlayerInfo(total=" + this.f338935a + ", actualDuration=" + this.f338936b + ", duration=" + this.f338937c + ", lastSeekTimestamp=" + this.f338938d + ", lastNotProgressEvent=" + this.f338939e + ", lastProgressEvent=" + this.f338940f + ')';
    }
}
