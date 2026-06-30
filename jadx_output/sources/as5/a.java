package as5;

/* loaded from: classes13.dex */
public final class a extends bs5.c {

    /* renamed from: d, reason: collision with root package name */
    public final bs5.d f13551d;

    public a(int i17) {
        super(i17);
        this.f13551d = null;
        this.f13551d = new as5.b();
    }

    @Override // bs5.c
    public java.lang.String e(java.lang.String str, java.lang.String str2) {
        return str;
    }

    @Override // bs5.c
    public java.lang.String f() {
        return "Https";
    }

    @Override // bs5.c
    public java.lang.String g() {
        return "HttpsDns(" + this.f24014b + ")";
    }

    @Override // bs5.c
    public java.net.SocketAddress h(java.lang.String str, int i17) {
        return this.f13551d.b(str, i17);
    }

    @Override // bs5.c
    public java.lang.String i(java.lang.String str, java.lang.String str2, bs5.q qVar) {
        java.lang.String a17;
        java.lang.String str3 = str2 + ';' + ((java.lang.System.currentTimeMillis() / 1000) + (10 * 60));
        int i17 = this.f24014b;
        if (i17 == 1) {
            a17 = bs5.r.a(str3, qVar.f24056b, qVar.f24058d, "dn=%s&ip=%s&clientip=1&ttl=1&id=%s&token=%s");
        } else if (i17 == 2) {
            a17 = bs5.r.a(str3, qVar.f24056b, qVar.f24058d, "dn=%s&ip=%s&clientip=1&ttl=1&id=%s&token=%s&type=aaaa");
        } else {
            if (i17 != 3) {
                throw new java.lang.IllegalStateException("Unexpected value: " + i17);
            }
            a17 = bs5.r.a(str3, qVar.f24056b, qVar.f24058d, "dn=%s&ip=%s&clientip=1&ttl=1&id=%s&token=%s&type=addrs");
        }
        return this.f13551d.c(str, a17);
    }
}
