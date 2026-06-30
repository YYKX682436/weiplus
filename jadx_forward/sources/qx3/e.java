package qx3;

/* loaded from: classes10.dex */
public final class e extends qx3.g {

    /* renamed from: a, reason: collision with root package name */
    public final long f448884a;

    /* renamed from: b, reason: collision with root package name */
    public final int f448885b;

    public e(long j17, int i17) {
        super(null);
        this.f448884a = j17;
        this.f448885b = i17;
    }

    /* renamed from: equals */
    public boolean m161036xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx3.e)) {
            return false;
        }
        qx3.e eVar = (qx3.e) obj;
        return this.f448884a == eVar.f448884a && this.f448885b == eVar.f448885b;
    }

    /* renamed from: hashCode */
    public int m161037x8cdac1b() {
        return (java.lang.Long.hashCode(this.f448884a) * 31) + java.lang.Integer.hashCode(this.f448885b);
    }

    /* renamed from: toString */
    public java.lang.String m161038x9616526c() {
        return "onNewState(id=" + this.f448884a + ", uiState=" + this.f448885b + ')';
    }
}
