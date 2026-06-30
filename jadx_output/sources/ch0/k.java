package ch0;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f41231a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41232b;

    /* renamed from: c, reason: collision with root package name */
    public final tg0.c1 f41233c;

    public k(int i17, int i18, tg0.c1 result) {
        kotlin.jvm.internal.o.g(result, "result");
        this.f41231a = i17;
        this.f41232b = i18;
        this.f41233c = result;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch0.k)) {
            return false;
        }
        ch0.k kVar = (ch0.k) obj;
        return this.f41231a == kVar.f41231a && this.f41232b == kVar.f41232b && kotlin.jvm.internal.o.b(this.f41233c, kVar.f41233c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f41231a) * 31) + java.lang.Integer.hashCode(this.f41232b)) * 31) + this.f41233c.hashCode();
    }

    public java.lang.String toString() {
        return "FlutterParams(id=" + this.f41231a + ", mode=" + this.f41232b + ", result=" + this.f41233c + ')';
    }
}
