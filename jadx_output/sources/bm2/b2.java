package bm2;

/* loaded from: classes3.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f21785a;

    /* renamed from: b, reason: collision with root package name */
    public final kn0.r f21786b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21787c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21788d;

    public b2(int i17, kn0.r liveUrlInfo, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(liveUrlInfo, "liveUrlInfo");
        this.f21785a = i17;
        this.f21786b = liveUrlInfo;
        this.f21787c = i18;
        this.f21788d = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm2.b2)) {
            return false;
        }
        bm2.b2 b2Var = (bm2.b2) obj;
        return this.f21785a == b2Var.f21785a && kotlin.jvm.internal.o.b(this.f21786b, b2Var.f21786b) && this.f21787c == b2Var.f21787c && this.f21788d == b2Var.f21788d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f21785a) * 31) + this.f21786b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f21787c)) * 31) + java.lang.Boolean.hashCode(this.f21788d);
    }

    public java.lang.String toString() {
        return "liveUrlInfo:" + this.f21786b + ", chooser:" + this.f21788d + " mainUrlBlock: " + this.f21787c;
    }
}
