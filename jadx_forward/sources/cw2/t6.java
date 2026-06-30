package cw2;

/* loaded from: classes2.dex */
public final class t6 {

    /* renamed from: a, reason: collision with root package name */
    public final long f305556a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f305557b;

    public t6(long j17, boolean z17) {
        this.f305556a = j17;
        this.f305557b = z17;
    }

    /* renamed from: equals */
    public boolean m122929xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2.t6)) {
            return false;
        }
        cw2.t6 t6Var = (cw2.t6) obj;
        return this.f305556a == t6Var.f305556a && this.f305557b == t6Var.f305557b;
    }

    /* renamed from: hashCode */
    public int m122930x8cdac1b() {
        return (java.lang.Long.hashCode(this.f305556a) * 31) + java.lang.Boolean.hashCode(this.f305557b);
    }

    /* renamed from: toString */
    public java.lang.String m122931x9616526c() {
        return "StartPlayParam(startPosMs=" + this.f305556a + ", enableAccurateSeek=" + this.f305557b + ')';
    }
}
