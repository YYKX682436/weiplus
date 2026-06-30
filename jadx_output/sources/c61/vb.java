package c61;

/* loaded from: classes8.dex */
public final class vb {

    /* renamed from: a, reason: collision with root package name */
    public final float f39361a;

    /* renamed from: b, reason: collision with root package name */
    public final c61.wb f39362b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39363c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f39364d;

    public vb(float f17, c61.wb iconPos, int i17, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(iconPos, "iconPos");
        this.f39361a = f17;
        this.f39362b = iconPos;
        this.f39363c = i17;
        this.f39364d = num;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c61.vb)) {
            return false;
        }
        c61.vb vbVar = (c61.vb) obj;
        return java.lang.Float.compare(this.f39361a, vbVar.f39361a) == 0 && this.f39362b == vbVar.f39362b && this.f39363c == vbVar.f39363c && kotlin.jvm.internal.o.b(this.f39364d, vbVar.f39364d);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Float.hashCode(this.f39361a) * 31) + this.f39362b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f39363c)) * 31;
        java.lang.Integer num = this.f39364d;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public java.lang.String toString() {
        return "IconModel(iconSize=" + this.f39361a + ", iconPos=" + this.f39362b + ", gravity=" + this.f39363c + ", iconColor=" + this.f39364d + ')';
    }
}
