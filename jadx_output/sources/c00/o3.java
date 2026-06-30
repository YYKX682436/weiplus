package c00;

/* loaded from: classes3.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f37006a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f37007b;

    public o3(boolean z17, boolean z18) {
        this.f37006a = z17;
        this.f37007b = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c00.o3)) {
            return false;
        }
        c00.o3 o3Var = (c00.o3) obj;
        return this.f37006a == o3Var.f37006a && this.f37007b == o3Var.f37007b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f37006a) * 31) + java.lang.Boolean.hashCode(this.f37007b);
    }

    public java.lang.String toString() {
        return "ActionHandlerConfig(needInMMProcess=" + this.f37006a + ", needUIContext=" + this.f37007b + ')';
    }
}
