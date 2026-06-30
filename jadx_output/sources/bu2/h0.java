package bu2;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f24516a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24517b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24518c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.mb4 f24519d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f24520e;

    public h0(float f17, int i17, int i18, r45.mb4 mb4Var, java.util.List mediaList) {
        kotlin.jvm.internal.o.g(mediaList, "mediaList");
        this.f24516a = f17;
        this.f24517b = i17;
        this.f24518c = i18;
        this.f24519d = mb4Var;
        this.f24520e = mediaList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu2.h0)) {
            return false;
        }
        bu2.h0 h0Var = (bu2.h0) obj;
        return java.lang.Float.compare(this.f24516a, h0Var.f24516a) == 0 && this.f24517b == h0Var.f24517b && this.f24518c == h0Var.f24518c && kotlin.jvm.internal.o.b(this.f24519d, h0Var.f24519d) && kotlin.jvm.internal.o.b(this.f24520e, h0Var.f24520e);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Float.hashCode(this.f24516a) * 31) + java.lang.Integer.hashCode(this.f24517b)) * 31) + java.lang.Integer.hashCode(this.f24518c)) * 31;
        r45.mb4 mb4Var = this.f24519d;
        return ((hashCode + (mb4Var == null ? 0 : mb4Var.hashCode())) * 31) + this.f24520e.hashCode();
    }

    public java.lang.String toString() {
        return "MaxMediaHWInfo(ratioHW=" + this.f24516a + ", height=" + this.f24517b + ", width=" + this.f24518c + ", maxRadioMedia=" + this.f24519d + ", mediaList=" + this.f24520e + ')';
    }
}
