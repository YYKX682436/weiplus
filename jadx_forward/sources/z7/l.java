package z7;

/* loaded from: classes16.dex */
public abstract class l implements java.io.Serializable {
    static {
        z7.l lVar = z7.a.f551996a;
        z7.l lVar2 = z7.a.f551996a;
        z7.l lVar3 = z7.a.f551996a;
    }

    public z7.i d() {
        throw new java.lang.UnsupportedOperationException("Not an object: " + mo178488x9616526c());
    }

    public java.lang.String e(z7.p pVar) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            if (pVar == null) {
                throw new java.lang.NullPointerException("config is null");
            }
            z7.q qVar = new z7.q(stringWriter, 128);
            g(pVar.a(qVar));
            qVar.flush();
            return stringWriter.toString();
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    /* renamed from: equals */
    public abstract boolean mo178486xb2c87fbf(java.lang.Object obj);

    public abstract void g(z7.m mVar);

    /* renamed from: hashCode */
    public abstract int mo178487x8cdac1b();

    /* renamed from: toString */
    public java.lang.String mo178488x9616526c() {
        return e(z7.p.f552031a);
    }
}
