package qp1;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f447223a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12888x6374022b f447224b;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d info, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12888x6374022b ballSizeAndPos) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ballSizeAndPos, "ballSizeAndPos");
        this.f447223a = info;
        this.f447224b = ballSizeAndPos;
    }

    /* renamed from: equals */
    public boolean m160671xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp1.c)) {
            return false;
        }
        qp1.c cVar = (qp1.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f447223a, cVar.f447223a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f447224b, cVar.f447224b);
    }

    /* renamed from: hashCode */
    public int m160672x8cdac1b() {
        return (this.f447223a.hashCode() * 31) + this.f447224b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m160673x9616526c() {
        return "FloatBallClickBallInfo(info=" + this.f447223a + ", ballSizeAndPos=" + this.f447224b + ')';
    }
}
