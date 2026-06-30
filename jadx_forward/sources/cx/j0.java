package cx;

/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f305952a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f305953b;

    public j0(java.lang.String script, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(script, "script");
        this.f305952a = script;
        this.f305953b = lVar;
    }

    /* renamed from: equals */
    public boolean m123029xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx.j0)) {
            return false;
        }
        cx.j0 j0Var = (cx.j0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f305952a, j0Var.f305952a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f305953b, j0Var.f305953b);
    }

    /* renamed from: hashCode */
    public int m123030x8cdac1b() {
        int hashCode = this.f305952a.hashCode() * 31;
        yz5.l lVar = this.f305953b;
        return hashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m123031x9616526c() {
        return "PendingJs(script=" + this.f305952a + ", callback=" + this.f305953b + ')';
    }
}
