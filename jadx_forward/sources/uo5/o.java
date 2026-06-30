package uo5;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f511270a;

    /* renamed from: b, reason: collision with root package name */
    public final long f511271b;

    public o(int i17, int i18, long j17, int i19) {
        this.f511270a = i18;
        this.f511271b = j17;
    }

    /* renamed from: equals */
    public boolean m168345xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo5.o)) {
            return false;
        }
        uo5.o oVar = (uo5.o) obj;
        oVar.getClass();
        return this.f511270a == oVar.f511270a && this.f511271b == oVar.f511271b;
    }

    /* renamed from: hashCode */
    public int m168346x8cdac1b() {
        return (((((java.lang.Integer.hashCode(0) * 31) + java.lang.Integer.hashCode(this.f511270a)) * 31) + java.lang.Long.hashCode(this.f511271b)) * 31) + java.lang.Integer.hashCode(0);
    }

    /* renamed from: toString */
    public java.lang.String m168347x9616526c() {
        return "QueueInputResult(offset=0, size=" + this.f511270a + ", pts=" + this.f511271b + ", flag=0)";
    }
}
