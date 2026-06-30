package dz4;

/* loaded from: classes11.dex */
public final class n2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.u2 f326889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f326890e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(dz4.u2 u2Var, android.app.Activity activity, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f326889d = u2Var;
        this.f326890e = activity;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dz4.n2(this.f326889d, this.f326890e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        dz4.n2 n2Var = (dz4.n2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        n2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        android.app.Activity activity = this.f326890e;
        java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571244k);
        dz4.u2 u2Var = this.f326889d;
        u2Var.f326960b = db5.e1.Q(activity, "", string, false, true, new dz4.m2(u2Var));
        return jz5.f0.f384359a;
    }
}
