package df2;

/* loaded from: classes.dex */
public final class wx extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f313263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.cy f313264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az2.f f313265f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f313266g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f313267h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.v12 f313268i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, df2.cy cyVar, az2.f fVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.content.Context context, r45.v12 v12Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f313263d = hVar;
        this.f313264e = cyVar;
        this.f313265f = fVar;
        this.f313266g = h0Var;
        this.f313267h = context;
        this.f313268i = v12Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.wx(this.f313263d, interfaceC29045xdcb5ca57, this.f313264e, this.f313265f, this.f313266g, this.f313267h, this.f313268i);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.wx wxVar = (df2.wx) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        wxVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313264e.f311448m, "showAlertDialog cgi succ");
        this.f313265f.b();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0) this.f313266g.f391656d;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        android.content.Context context = this.f313267h;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        r45.v12 v12Var = this.f313268i;
        java.lang.String str = v12Var.f469333g;
        if (str == null || str.length() == 0) {
            java.lang.String str2 = v12Var.f469334h;
            u1Var.g(str2 != null ? str2 : "");
        } else {
            u1Var.u(v12Var.f469333g);
            java.lang.String str3 = v12Var.f469334h;
            u1Var.g(str3 != null ? str3 : "");
        }
        u1Var.n(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d3z));
        u1Var.q(false);
        return jz5.f0.f384359a;
    }
}
