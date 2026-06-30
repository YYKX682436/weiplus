package hk0;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f363315a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f363316b;

    public o(int i17, boolean z17) {
        this.f363315a = i17;
        this.f363316b = z17;
    }

    /* renamed from: equals */
    public boolean m133653xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.o)) {
            return false;
        }
        hk0.o oVar = (hk0.o) obj;
        return this.f363315a == oVar.f363315a && this.f363316b == oVar.f363316b;
    }

    /* renamed from: hashCode */
    public int m133654x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f363315a) * 31) + java.lang.Boolean.hashCode(this.f363316b);
    }

    /* renamed from: toString */
    public java.lang.String m133655x9616526c() {
        return "FuncState(funcType=" + this.f363315a + ", isSelect=" + this.f363316b + ')';
    }
}
