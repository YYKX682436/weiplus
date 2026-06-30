package c00;

/* loaded from: classes3.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f118539a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f118540b;

    public o3(boolean z17, boolean z18) {
        this.f118539a = z17;
        this.f118540b = z18;
    }

    /* renamed from: equals */
    public boolean m13721xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c00.o3)) {
            return false;
        }
        c00.o3 o3Var = (c00.o3) obj;
        return this.f118539a == o3Var.f118539a && this.f118540b == o3Var.f118540b;
    }

    /* renamed from: hashCode */
    public int m13722x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f118539a) * 31) + java.lang.Boolean.hashCode(this.f118540b);
    }

    /* renamed from: toString */
    public java.lang.String m13723x9616526c() {
        return "ActionHandlerConfig(needInMMProcess=" + this.f118539a + ", needUIContext=" + this.f118540b + ')';
    }
}
