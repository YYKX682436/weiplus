package o63;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f424730a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f424731b;

    public f(boolean z17, boolean z18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 2) != 0 ? true : z18;
        this.f424730a = z17;
        this.f424731b = z18;
    }

    /* renamed from: equals */
    public boolean m150684xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o63.f)) {
            return false;
        }
        o63.f fVar = (o63.f) obj;
        return this.f424730a == fVar.f424730a && this.f424731b == fVar.f424731b;
    }

    /* renamed from: hashCode */
    public int m150685x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f424730a) * 31) + java.lang.Boolean.hashCode(this.f424731b);
    }

    /* renamed from: toString */
    public java.lang.String m150686x9616526c() {
        return "FinderReportRoute(isReportSessionEvent=" + this.f424730a + ", isReportPageEvent=" + this.f424731b + ')';
    }
}
