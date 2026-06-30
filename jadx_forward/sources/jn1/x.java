package jn1;

/* loaded from: classes11.dex */
public final class x implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f382073a;

    /* renamed from: b, reason: collision with root package name */
    public final int f382074b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f382075c;

    /* renamed from: d, reason: collision with root package name */
    public final long f382076d;

    public x(java.lang.String username, int i17, java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f382073a = username;
        this.f382074b = i17;
        this.f382075c = url;
        this.f382076d = android.os.SystemClock.elapsedRealtime();
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        java.lang.String str2 = this.f382073a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Avatar.AvatarRemoteGetContactCallback", "getContactCallBack " + str2 + " succ:" + z17);
            if (z17 && this.f382074b == 0) {
                jn1.o oVar = jn1.u.f382067f;
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) ((jz5.n) jn1.u.f382070i).mo141623x754a37bb();
                java.lang.String str3 = this.f382075c;
                if (concurrentHashMap.containsKey(str3)) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(str2);
                    if (n07 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, n07.d()) && oVar.a(n07, true, "getContactCallBack")) {
                        ((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).cj(str2, kz5.c1.k(new jz5.l("request_source", "GetContactUpdate"), new jz5.l("get_contact_cost", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f382076d))));
                    }
                }
            }
        }
    }
}
