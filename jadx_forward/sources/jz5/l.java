package jz5;

/* loaded from: classes4.dex */
public final class l implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f384366d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f384367e;

    public l(java.lang.Object obj, java.lang.Object obj2) {
        this.f384366d = obj;
        this.f384367e = obj2;
    }

    public final java.lang.Object a() {
        return this.f384366d;
    }

    public final java.lang.Object b() {
        return this.f384367e;
    }

    public final java.lang.Object c() {
        return this.f384366d;
    }

    public final java.lang.Object d() {
        return this.f384367e;
    }

    /* renamed from: equals */
    public boolean m141637xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz5.l)) {
            return false;
        }
        jz5.l lVar = (jz5.l) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f384366d, lVar.f384366d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f384367e, lVar.f384367e);
    }

    /* renamed from: hashCode */
    public int m141638x8cdac1b() {
        java.lang.Object obj = this.f384366d;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.f384367e;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m141639x9616526c() {
        return "(" + this.f384366d + ", " + this.f384367e + ')';
    }
}
