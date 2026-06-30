package id2;

/* loaded from: classes.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f372212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f372213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f372214f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(jz5.l lVar, android.widget.TextView textView, id2.v1 v1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f372212d = lVar;
        this.f372213e = textView;
        this.f372214f = v1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new id2.n1(this.f372212d, this.f372213e, this.f372214f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        id2.n1 n1Var = (id2.n1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        n1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        jz5.l lVar = this.f372212d;
        boolean booleanValue = ((java.lang.Boolean) lVar.f384366d).booleanValue();
        id2.v1 v1Var = this.f372214f;
        if (booleanValue) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_NEED_SHOW_PKG_REDDOT_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            android.widget.TextView textView = this.f372213e;
            db5.t7.i(textView.getContext(), textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573093dj2), com.p314xaae8f345.mm.R.raw.f80084xebd378da);
            pm0.v.V(1000L, new id2.m1(v1Var));
        } else {
            db5.t7.m(v1Var.m158354x19263085(), v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573092dj1));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v1Var.f372367d, "[finderPayFullWholeProcess] errCode:" + ((java.lang.String) lVar.f384367e));
        }
        return jz5.f0.f384359a;
    }
}
