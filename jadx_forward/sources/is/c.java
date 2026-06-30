package is;

/* loaded from: classes4.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ is.f f375840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2722x33325c.sdk.t f375841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f375842f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ js.p0 f375843g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(is.f fVar, com.p314xaae8f345.mm.ui.p2722x33325c.sdk.t tVar, java.lang.String str, js.p0 p0Var) {
        super(1);
        this.f375840d = fVar;
        this.f375841e = tVar;
        this.f375842f = str;
        this.f375843g = p0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11384xf0e29732 c11384xf0e29732 = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11384xf0e29732) obj;
        js.p0 p0Var = this.f375843g;
        if (c11384xf0e29732 != null) {
            java.lang.String str = this.f375842f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11383xcdc70ad0 c11383xcdc70ad0 = c11384xf0e29732.f154718d;
            c11383xcdc70ad0.f154716d.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("second check masked mobile: ");
            r45.fn4 fn4Var = c11384xf0e29732.f154719e;
            sb6.append(fn4Var != null ? fn4Var.f455996e : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountInfoService", sb6.toString());
            if (r26.i0.q(this.f375841e.f290764a, fn4Var != null ? fn4Var.f455996e : null, false, 2, null)) {
                gm0.j1.d().a(145, this.f375840d);
                r45.b66 b66Var = new r45.b66();
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11382xcabbddbe c11382xcabbddbe = c11383xcdc70ad0.f154716d;
                b66Var.f452109d = c11382xcabbddbe.f154708d;
                java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
                byte[] bytes = c11383xcdc70ad0.f154717e.getBytes(UTF_8);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                b66Var.f452110e = android.util.Base64.encodeToString(bytes, 2);
                r45.c66 c66Var = new r45.c66();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(b66Var);
                c66Var.f452871e = linkedList;
                c66Var.f452870d = linkedList.size();
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.c(c11382xcabbddbe.f154715n);
                gm0.j1.d().g(new h11.e(str, 33, "", 0, "", 0, cu5Var, c66Var));
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.v6) p0Var).a(null, null);
            }
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.v6) p0Var).a(null, null);
        }
        return jz5.f0.f384359a;
    }
}
