package xg2;

/* loaded from: classes.dex */
public final class b extends xg2.h {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f535914b;

    /* renamed from: c, reason: collision with root package name */
    public final oz5.l f535915c;

    public b(java.lang.Object obj, oz5.l lVar) {
        super(lVar, null);
        this.f535914b = obj;
        this.f535915c = lVar;
    }

    /* renamed from: equals */
    public boolean m175487xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg2.b)) {
            return false;
        }
        xg2.b bVar = (xg2.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535914b, bVar.f535914b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535915c, bVar.f535915c);
    }

    /* renamed from: hashCode */
    public int m175488x8cdac1b() {
        java.lang.Object obj = this.f535914b;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        oz5.l lVar = this.f535915c;
        return hashCode + (lVar != null ? lVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m175489x9616526c() {
        return "Fail(fail=" + this.f535914b + ", context=" + this.f535915c + ')';
    }
}
