package as5;

/* loaded from: classes13.dex */
public final class a extends bs5.c {

    /* renamed from: d, reason: collision with root package name */
    public final bs5.d f95084d;

    public a(int i17) {
        super(i17);
        this.f95084d = null;
        this.f95084d = new as5.b();
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
        return "HttpsDns(" + this.f105547b + ")";
    }

    @Override // bs5.c
    public java.net.SocketAddress h(java.lang.String str, int i17) {
        return this.f95084d.b(str, i17);
    }

    @Override // bs5.c
    public java.lang.String i(java.lang.String str, java.lang.String str2, bs5.q qVar) {
        java.lang.String a17;
        java.lang.String str3 = str2 + ';' + ((java.lang.System.currentTimeMillis() / 1000) + (10 * 60));
        int i17 = this.f105547b;
        if (i17 == 1) {
            a17 = bs5.r.a(str3, qVar.f105589b, qVar.f105591d, "dn=%s&ip=%s&clientip=1&ttl=1&id=%s&token=%s");
        } else if (i17 == 2) {
            a17 = bs5.r.a(str3, qVar.f105589b, qVar.f105591d, "dn=%s&ip=%s&clientip=1&ttl=1&id=%s&token=%s&type=aaaa");
        } else {
            if (i17 != 3) {
                throw new java.lang.IllegalStateException("Unexpected value: " + i17);
            }
            a17 = bs5.r.a(str3, qVar.f105589b, qVar.f105591d, "dn=%s&ip=%s&clientip=1&ttl=1&id=%s&token=%s&type=addrs");
        }
        return this.f95084d.c(str, a17);
    }
}
