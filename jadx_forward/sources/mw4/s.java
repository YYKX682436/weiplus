package mw4;

/* loaded from: classes7.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mw4.w f413323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f413324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f413325f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(mw4.w wVar, java.util.Map map, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1);
        this.f413323d = wVar;
        this.f413324e = map;
        this.f413325f = interfaceC29045xdcb5ca57;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p971x6de15a2e.j2 conn = (com.p314xaae8f345.mm.p971x6de15a2e.j2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conn, "conn");
        mw4.w wVar = this.f413323d;
        mw4.r rVar = new mw4.r(wVar, this.f413325f);
        wVar.getClass();
        conn.f153578k = false;
        conn.f153576i = "GET";
        conn.f153580m = true;
        conn.f153582o = 2;
        for (java.util.Map.Entry entry : this.f413324e.entrySet()) {
            conn.h((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a("wcf://WebPrefetchContent/spa/auth");
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        conn.f153579l = a17.m82499x9616526c();
        conn.f153581n = new mw4.q(rVar);
        conn.f153573f = 10000;
        conn.f153572e = 3000;
        conn.a();
        return jz5.f0.f384359a;
    }
}
