package tr5;

/* loaded from: classes13.dex */
public final class g0 implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final tr5.z f503025d;

    /* renamed from: e, reason: collision with root package name */
    public final tr5.q f503026e;

    public g0(java.lang.String[] strArr, tr5.q qVar) {
        if (strArr == null) {
            throw new java.lang.IllegalArgumentException("ips".concat(" can not be null"));
        }
        if (qVar != null) {
            this.f503025d = new tr5.z(strArr);
            this.f503026e = qVar;
            return;
        }
        throw new java.lang.IllegalArgumentException("stat".concat(" can not be null"));
    }

    /* renamed from: toString */
    public java.lang.String m166986x9616526c() {
        return "LookupResult{ipSet=" + this.f503025d + ", stat=" + this.f503026e + '}';
    }

    public g0(tr5.z zVar, tr5.q qVar) {
        if (zVar == null) {
            throw new java.lang.IllegalArgumentException("ipSet".concat(" can not be null"));
        }
        if (qVar != null) {
            this.f503025d = zVar;
            this.f503026e = qVar;
            return;
        }
        throw new java.lang.IllegalArgumentException("stat".concat(" can not be null"));
    }
}
