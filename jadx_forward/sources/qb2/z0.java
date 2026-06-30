package qb2;

/* loaded from: classes8.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f442851a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f442852b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.p0 f442853c;

    /* renamed from: d, reason: collision with root package name */
    public final int f442854d;

    public z0(java.lang.String str, java.util.Map values, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        this.f442851a = str;
        this.f442852b = values;
        this.f442853c = p0Var;
        this.f442854d = i17;
    }

    /* renamed from: equals */
    public boolean m159741xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb2.z0)) {
            return false;
        }
        qb2.z0 z0Var = (qb2.z0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442851a, z0Var.f442851a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442852b, z0Var.f442852b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442853c, z0Var.f442853c) && this.f442854d == z0Var.f442854d;
    }

    /* renamed from: hashCode */
    public int m159742x8cdac1b() {
        java.lang.String str = this.f442851a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f442852b.hashCode()) * 31;
        com.p314xaae8f345.mm.p944x882e457a.p0 p0Var = this.f442853c;
        return ((hashCode + (p0Var != null ? p0Var.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f442854d);
    }

    /* renamed from: toString */
    public java.lang.String m159743x9616526c() {
        return "ConsumeNewXmlData(subType=" + this.f442851a + ", values=" + this.f442852b + ", addMsgInfo=" + this.f442853c + ", pendingReason=" + this.f442854d + ')';
    }
}
