package l36;

/* loaded from: classes16.dex */
public enum r0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f397168d;

    r0(java.lang.String str) {
        this.f397168d = str;
    }

    public static l36.r0 a(java.lang.String str) {
        if (str.equals("http/1.0")) {
            return HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return SPDY_3;
        }
        if (str.equals("quic")) {
            return QUIC;
        }
        throw new java.io.IOException("Unexpected protocol: ".concat(str));
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f397168d;
    }
}
