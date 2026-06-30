package a2;

/* loaded from: classes14.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final long f82336a;

    /* renamed from: b, reason: collision with root package name */
    public final long f82337b;

    public r(long j17, long j18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f82336a = j17;
        this.f82337b = j18;
        if (!(!p2.u.c(j17))) {
            throw new java.lang.IllegalArgumentException("width cannot be TextUnit.Unspecified".toString());
        }
        if (!(!p2.u.c(j18))) {
            throw new java.lang.IllegalArgumentException("height cannot be TextUnit.Unspecified".toString());
        }
    }

    /* renamed from: equals */
    public boolean m392xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.r)) {
            return false;
        }
        a2.r rVar = (a2.r) obj;
        return p2.t.a(this.f82336a, rVar.f82336a) && p2.t.a(this.f82337b, rVar.f82337b);
    }

    /* renamed from: hashCode */
    public int m393x8cdac1b() {
        p2.v[] vVarArr = p2.t.f432933b;
        return (((java.lang.Long.hashCode(this.f82336a) * 31) + java.lang.Long.hashCode(this.f82337b)) * 31) + java.lang.Integer.hashCode(4);
    }

    /* renamed from: toString */
    public java.lang.String m394x9616526c() {
        return "Placeholder(width=" + ((java.lang.Object) p2.t.d(this.f82336a)) + ", height=" + ((java.lang.Object) p2.t.d(this.f82337b)) + ", placeholderVerticalAlign=" + ((java.lang.Object) "Center") + ')';
    }
}
