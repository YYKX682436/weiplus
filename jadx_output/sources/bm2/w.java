package bm2;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final bm2.v f22393a;

    /* renamed from: b, reason: collision with root package name */
    public final dk2.vg f22394b;

    public w(bm2.v type, dk2.vg vgVar) {
        kotlin.jvm.internal.o.g(type, "type");
        this.f22393a = type;
        this.f22394b = vgVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm2.w)) {
            return false;
        }
        bm2.w wVar = (bm2.w) obj;
        return this.f22393a == wVar.f22393a && kotlin.jvm.internal.o.b(this.f22394b, wVar.f22394b);
    }

    public int hashCode() {
        int hashCode = this.f22393a.hashCode() * 31;
        dk2.vg vgVar = this.f22394b;
        return hashCode + (vgVar == null ? 0 : vgVar.hashCode());
    }

    public java.lang.String toString() {
        return "MusicListItem(type=" + this.f22393a + ", music=" + this.f22394b + ')';
    }
}
