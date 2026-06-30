package xg2;

/* loaded from: classes.dex */
public final class i extends xg2.h {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f535926b;

    /* renamed from: c, reason: collision with root package name */
    public final oz5.l f535927c;

    public i(java.lang.Object obj, oz5.l lVar) {
        super(lVar, null);
        this.f535926b = obj;
        this.f535927c = lVar;
    }

    /* renamed from: equals */
    public boolean m175490xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg2.i)) {
            return false;
        }
        xg2.i iVar = (xg2.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535926b, iVar.f535926b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535927c, iVar.f535927c);
    }

    /* renamed from: hashCode */
    public int m175491x8cdac1b() {
        java.lang.Object obj = this.f535926b;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        oz5.l lVar = this.f535927c;
        return hashCode + (lVar != null ? lVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m175492x9616526c() {
        return "Success(suc=" + this.f535926b + ", context=" + this.f535927c + ')';
    }
}
