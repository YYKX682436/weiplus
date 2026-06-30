package rc3;

/* loaded from: classes7.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475480f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(rc3.w0 w0Var, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f475478d = w0Var;
        this.f475479e = str;
        this.f475480f = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.app.Activity B0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = this.f475478d.f475624i;
        if (c16416x87606a7b != null && (B0 = c16416x87606a7b.b().B0()) != null) {
            rc3.w0 w0Var = this.f475478d;
            java.lang.String msg = this.f475479e;
            bf3.g0 g0Var = bf3.g0.f101160a;
            java.lang.String instanceName = w0Var.f475620e;
            g0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
            if (!z65.c.a()) {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            } else if (((java.lang.Boolean) bf3.g0.f101162c.b(g0Var, bf3.g0.f101161b[0])).booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBServerUtil", "检测到 js 异常: ".concat(msg));
            } else {
                ((ku5.t0) ku5.t0.f394148d).B(new bf3.f0(B0, instanceName, msg));
            }
        }
        java.util.HashSet hashSet = this.f475478d.f475625m;
        java.lang.String str2 = this.f475480f;
        java.lang.String str3 = this.f475479e;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((jc3.u) it.next()).Q9(str2, str3);
        }
        rc3.w0 w0Var2 = this.f475478d;
        if (w0Var2.f475632t < 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(w0Var2.f475638z, "onStartupJsException");
            je3.i.t8(je3.k.f380831e, this.f475478d.f475635w, "js-exception-startup", this.f475479e, null, 1.0f, 8, null);
            rc3.w0 w0Var3 = this.f475478d;
            w0Var3.f475634v = false;
            w0Var3.m162151x5cd39ffa();
        }
        return jz5.f0.f384359a;
    }
}
