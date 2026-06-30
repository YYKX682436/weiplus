package jz5;

/* loaded from: classes7.dex */
public final class o implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f384374d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f384375e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f384376f;

    public o(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.f384374d = obj;
        this.f384375e = obj2;
        this.f384376f = obj3;
    }

    public final java.lang.Object a() {
        return this.f384374d;
    }

    public final java.lang.Object b() {
        return this.f384375e;
    }

    public final java.lang.Object c() {
        return this.f384376f;
    }

    public final java.lang.Object d() {
        return this.f384374d;
    }

    public final java.lang.Object e() {
        return this.f384375e;
    }

    /* renamed from: equals */
    public boolean m141643xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz5.o)) {
            return false;
        }
        jz5.o oVar = (jz5.o) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f384374d, oVar.f384374d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f384375e, oVar.f384375e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f384376f, oVar.f384376f);
    }

    public final java.lang.Object f() {
        return this.f384376f;
    }

    /* renamed from: hashCode */
    public int m141644x8cdac1b() {
        java.lang.Object obj = this.f384374d;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.f384375e;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        java.lang.Object obj3 = this.f384376f;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m141645x9616526c() {
        return "(" + this.f384374d + ", " + this.f384375e + ", " + this.f384376f + ')';
    }
}
